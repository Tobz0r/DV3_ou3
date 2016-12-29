grammar TuringMachine;
turingmachine	:	'('state + ')''(' tape ')''(' start ')''(' accepted + ')' ';' ('('  transition ')')+;
state		:	'Q'DIGIT ;
tape		:	(CHARACTER|DIGIT)+;
start		:	state;
accepted	:	state;
transition	:	state ';' (CHARACTER|DIGIT) '>' (CHARACTER|DIGIT) ';' DIRECTION ';' state;
DIRECTION	:	[L|R|N]; //left,right,none
nonaccepted	:	state;
CHARACTER	:	[a-zA-Z ];
DIGIT		:	[0-9];
WS 		:	[ \n\r\t];