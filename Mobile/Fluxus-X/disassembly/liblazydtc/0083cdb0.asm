; FUN_0083cdb0 @ 0083cdb0
0083cdb0	stp x29,x30,[sp, #-0x30]!
0083cdb4	stp x22,x21,[sp, #0x10]
0083cdb8	stp x20,x19,[sp, #0x20]
0083cdbc	mov x29,sp
0083cdc0	mov x21,x0
0083cdc4	cbz x1,0x0083ce04
0083cdc8	lsr x8,x1,#0x3d
0083cdcc	mov x19,x1
0083cdd0	cbnz x8,0x0083cf18
0083cdd4	lsl x22,x19,#0x3
0083cdd8	mov x0,x22
0083cddc	bl 0x00c2fed0
0083cde0	ldr x8,[x21]
0083cde4	str x0,[x21]
0083cde8	cbz x8,0x0083ce24
0083cdec	ldr x9,[x21, #0x8]
0083cdf0	mov x0,x8
0083cdf4	lsl x1,x9,#0x3
0083cdf8	bl 0x00c2fe80
0083cdfc	ldr x20,[x21]
0083ce00	b 0x0083ce28
0083ce04	ldr x0,[x21]
0083ce08	str xzr,[x21]
0083ce0c	cbz x0,0x0083ce1c
0083ce10	ldr x8,[x21, #0x8]
0083ce14	lsl x1,x8,#0x3
0083ce18	bl 0x00c2fe80
0083ce1c	str xzr,[x21, #0x8]
0083ce20	b 0x0083cf08
0083ce24	mov x20,x0
0083ce28	mov x0,x20
0083ce2c	mov w1,wzr
0083ce30	mov x2,x22
0083ce34	str x19,[x21, #0x8]
0083ce38	bl 0x00c301c0
0083ce3c	ldr x9,[x21, #0x10]!
0083ce40	cbz x9,0x0083cf08
0083ce44	fmov d0,x19
0083ce48	ldr x10,[x9, #0x8]
0083ce4c	cnt v0.8B,v0.8B
0083ce50	addv b0,v0.8B
0083ce54	fmov x8,d0
0083ce58	cmp x8,#0x1
0083ce5c	b.hi 0x0083ce6c
0083ce60	sub x11,x19,#0x1
0083ce64	and x10,x10,x11
0083ce68	b 0x0083ce7c
0083ce6c	cmp x10,x19
0083ce70	b.cc 0x0083ce7c
0083ce74	udiv x11,x10,x19
0083ce78	msub x10,x11,x19,x10
0083ce7c	str x21,[x20, x10, LSL #0x3]
0083ce80	ldr x11,[x9]
0083ce84	cbz x11,0x0083cf08
0083ce88	sub x12,x19,#0x1
0083ce8c	b 0x0083cea4
0083ce90	mov x13,x10
0083ce94	mov x9,x11
0083ce98	ldr x11,[x11]
0083ce9c	mov x10,x13
0083cea0	cbz x11,0x0083cf08
0083cea4	ldr x13,[x11, #0x8]
0083cea8	cmp x8,#0x1
0083ceac	b.hi 0x0083ceb8
0083ceb0	and x13,x13,x12
0083ceb4	b 0x0083cec8
0083ceb8	cmp x13,x19
0083cebc	b.cc 0x0083cec8
0083cec0	udiv x14,x13,x19
0083cec4	msub x13,x14,x19,x13
0083cec8	cmp x13,x10
0083cecc	b.eq 0x0083ce90
0083ced0	ldr x14,[x20, x13, LSL #0x3]
0083ced4	cbz x14,0x0083cf00
0083ced8	ldr x14,[x11]
0083cedc	str x14,[x9]
0083cee0	ldr x14,[x20, x13, LSL #0x3]
0083cee4	ldr x14,[x14]
0083cee8	str x14,[x11]
0083ceec	ldr x14,[x20, x13, LSL #0x3]
0083cef0	mov x13,x10
0083cef4	str x11,[x14]
0083cef8	mov x11,x9
0083cefc	b 0x0083ce94
0083cf00	str x9,[x20, x13, LSL #0x3]
0083cf04	b 0x0083ce94
0083cf08	ldp x20,x19,[sp, #0x20]
0083cf0c	ldp x22,x21,[sp, #0x10]
0083cf10	ldp x29,x30,[sp], #0x30
0083cf14	ret
0083cf18	bl 0x007fe1b8
