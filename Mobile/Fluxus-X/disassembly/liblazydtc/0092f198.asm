; FUN_0092f198 @ 0092f198
0092f198	cbz x0,0x0092f1b8
0092f19c	ldr x8,[x0, #0xc0]
0092f1a0	cbz x8,0x0092f1b8
0092f1a4	ldrb w9,[x8, #0x231]
0092f1a8	and w10,w1,#0x1
0092f1ac	and w9,w9,#0xfffffffb
0092f1b0	orr w9,w9,w10, LSL #0x2
0092f1b4	strb w9,[x8, #0x231]
0092f1b8	ret
