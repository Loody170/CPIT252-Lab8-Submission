# CPIT252-Lab8-Submission
These are the deliverables for lab 8

Q2: Explain how the observer design pattern simlified the process of adding a new notification service in this implementation?
A2: it allows for classes to anticipate a certain event to happen, and when it happens they all get an indication and they start doing some actions. one method in the code can notify them all and cause all of them (as long as they're subscriped or still observing) to start doing specific things which is very simple.
