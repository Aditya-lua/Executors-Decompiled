; FUN_0088db44 @ 0088db44
0088db44	ldr x8,[x0, #0x28]
0088db48	cbz x8,0x0088dbf0
0088db4c	ldr x8,[x1]
0088db50	mov x11,#0x2d69
0088db54	movk x11,#0xeb38, LSL #16
0088db58	lsl w9,w8,#0x3
0088db5c	lsr x10,x8,#0x20
0088db60	movk x11,#0xea08, LSL #32
0088db64	movk x11,#0x9ddf, LSL #48
0088db68	add x9,x9,#0x8
0088db6c	eor x9,x9,x10
0088db70	mul x9,x9,x11
0088db74	eor x10,x10,x9, LSR #0x2f
0088db78	eor x9,x10,x9
0088db7c	mov x10,#0x959d
0088db80	mul x9,x9,x11
0088db84	movk x10,#0xb8f4, LSL #16
0088db88	movk x10,#0xd34f, LSL #32
0088db8c	movk x10,#0x949d, LSL #48
0088db90	eor x9,x9,x9, LSR #0x2f
0088db94	mul x9,x9,x10
0088db98	ldrb w10,[x0, #0x30]
0088db9c	lsr x10,x9,x10
0088dba0	ldr x9,[x0, #0x18]
0088dba4	lsr x11,x10,#0x6
0088dba8	ldr x11,[x9, x11, LSL #0x3]
0088dbac	lsr x11,x11,x10
0088dbb0	tbz w11,#0x0,0x0088dbf0
0088dbb4	ldr x12,[x0, #0x20]
0088dbb8	ldr x11,[x0]
0088dbbc	sub x12,x12,#0x1
0088dbc0	lsl x13,x10,#0x4
0088dbc4	ldr x13,[x11, x13#0x0]
0088dbc8	cmp x13,x8
0088dbcc	cset w0,eq
0088dbd0	b.eq 0x0088dbec
0088dbd4	add x10,x10,#0x1
0088dbd8	and x10,x10,x12
0088dbdc	lsr x13,x10,#0x6
0088dbe0	ldr x13,[x9, x13, LSL #0x3]
0088dbe4	lsr x13,x13,x10
0088dbe8	tbnz w13,#0x0,0x0088dbc0
0088dbec	ret
0088dbf0	mov w0,wzr
0088dbf4	ret
