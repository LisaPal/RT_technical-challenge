# RT_technical-challenge
Technical Challenge for Rally Team

Talent Marketing Software 

USE CASE: Description

Part 1 : Matching
1. A project owner creates a project. This project requires work with certain type of skills.
   A list of users each have a set of skills. TalentMarketingApp matches projects with users based on skills. 

2. User applies to join projects recommended by system. TalentMerketingApp gives Project Owner a match analysis
   that helps Project Owner accept or decline request. 

Part 2: Post Project Completion
Project Owner endorses, rates and gives feedback to project members. 
 
Triggers

Actors
1. Users
2. Project Owners
3. Project
4. TalentMarketingApp


Preconditions
1. The users are available
2. Project Owners are available.

Goals

1. Match the users with projects.

Steps of Execution

1. Project Owner creates project.
2. TalentMarketingApp matches projects with users based on skills.
3. User applies to join projects recommended by TalentMarketingApp.
4. Project Owner accepts or rejects request based on App recommendation.
5. After project completion, project owner endorses, rates and gives feedback to project members.

Design Pattern used: Observer Pattern

Subject : User
Observers : TalentMarketingApp and ProjectOwner.

Explanation
If the user (job seeker) is not employed, we consider him/her in the TalentMarketingApp to match them with a project.
However, if the user status is employed, we do not consider them for a match.
Likewise, ProjectOwner needs to observe user and only if he/she is employed can ProjectOwner do certain functions such
as endorse, rate and give feedback. 




