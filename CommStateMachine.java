# Copyright (c) 2015, Ernesto Corbellini, Ekumen
# Copyright (c) 2009, Willow Garage, Inc.
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in the
#       documentation and/or other materials provided with the distribution.
#     * Neither the name of the Willow Garage, Inc. nor the names of its
#       contributors may be used to endorse or promote products derived from
#       this software without specific prior written permission.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
# ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
# LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
# CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
# SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
# CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
# ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
# POSSIBILITY OF SUCH DAMAGE.

# Author: Stuart Glaser


/**
 * State machine for the action client.
 * 
 * Comments:
 *   - The state returned on a transition is actually a vector of states that should be transitioned in sequence.
 * 
 */
// TODO: change class name to ClientStateMachine
class CommStateMachine {
  // Local class to hold the states
  static class ClientStates {
    final int WAITING_FOR_GOAL_ACK = 0;
    final int PENDING = 1;
    final int ACTIVE = 2;
    final int WAITING_FOR_RESULT = 3;
    final int WAITING_FOR_CANCEL_ACK = 4;
    final int RECALLING = 5;
    final int PREEMPTING = 6;
    final int DONE = 7;
    final int LOST = 8;
  }
  
  ActionGoal goal;
  int state;  
    
  
  /**
   * Constructor
   */
  //public void CommStateMachine(ActionGoal actionGoal, transition_callback?, feedback_callback?, send_goal_function, send_cancel_function)
  public void CommStateMachine(ActionGoal actionGoal, transition_callback?, feedback_callback?, ActionGoalTrigger)
  {
    // interface object for the callbacks?
    // store arguments locally in the object
    // 
    
    goal = actionGoal;
    
  }
  
  /*
   * Compare two objects.
   */
  public bool equals(CommStateMachine obj)
  {
    return actionGoal.goalId.id == obj.actionGoal.goalId.id;
  }
  
  public void setState(State)
  {
  }
  
  public synchronized void updateStatus(statusArray)
  {
  }
  
  // Make a state transition depending on the current client state and the goal state
  public void transitionTo(toState)
  {
    switch (this.state) {
      case ClientStates.WAITING_FOR_GOAL_ACK:
        switch (this.actionGoal.getStatus()) {
          case ActionGoal.GoalStates.PENDING:
          break;
        }
        break;
      case ClientStates.PENDING:
        break;
      case ClientStates.ACTIVE:
        break;
      case ClientStates.WAITING_FOR_RESULT:
        break;
      case ClientStates.WAITING_FOR_CANCEL_ACK:
        break;
      case ClientStates.RECALLING:
        break;
      case ClientStates.PREEMPTING:
        break;
      case ClientStates.DONE:
        break;
    }
  }
  
  public void markAsLost()
  {
  }
  
  public void updateResult(statusResult)
  {
  }  
  
}
