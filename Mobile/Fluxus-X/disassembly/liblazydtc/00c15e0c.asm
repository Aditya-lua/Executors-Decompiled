; FUN_00c15e0c @ 00c15e0c
00c15e0c	paciasp
00c15e10	stp x29,x30,[sp, #-0x20]!
00c15e14	stp x20,x19,[sp, #0x10]
00c15e18	mov x29,sp
00c15e1c	ldrb w19,[x0, #0x20]
00c15e20	tbz w19,#0x0,0x00c15e2c
00c15e24	mov w8,wzr
00c15e28	b 0x00c15e74
00c15e2c	mov w9,#0x1
00c15e30	ldr x8,[x0, #0x18]
00c15e34	strb w9,[x0, #0x20]
00c15e38	ldurh w9,[x8, #0x9]
00c15e3c	sxtb w10,w9
00c15e40	cmn w10,#0x40
00c15e44	b.ge 0x00c15e68
00c15e48	ldr x9,[x8]
00c15e4c	mov x20,x0
00c15e50	ldr x9,[x9]
00c15e54	mov x0,x8
00c15e58	blr x9
00c15e5c	mov w8,w0
00c15e60	mov x0,x20
00c15e64	b 0x00c15e70
00c15e68	tst w9,#0xc0
00c15e6c	cset w8,eq
00c15e70	strb w19,[x0, #0x20]
00c15e74	and w0,w8,#0x1
00c15e78	ldp x20,x19,[sp, #0x10]
00c15e7c	ldp x29,x30,[sp], #0x20
00c15e80	autiasp
00c15e84	ret
