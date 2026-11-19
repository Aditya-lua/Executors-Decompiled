; FUN_0080cd3c @ 0080cd3c
0080cd3c	stp x29,x30,[sp, #-0x30]!
0080cd40	stp x22,x21,[sp, #0x10]
0080cd44	stp x20,x19,[sp, #0x20]
0080cd48	mov x29,sp
0080cd4c	mov x21,x0
0080cd50	cbz x1,0x0080cd90
0080cd54	lsr x8,x1,#0x3d
0080cd58	mov x19,x1
0080cd5c	cbnz x8,0x0080cea4
0080cd60	lsl x22,x19,#0x3
0080cd64	mov x0,x22
0080cd68	bl 0x00c2fed0
0080cd6c	ldr x8,[x21]
0080cd70	str x0,[x21]
0080cd74	cbz x8,0x0080cdb0
0080cd78	ldr x9,[x21, #0x8]
0080cd7c	mov x0,x8
0080cd80	lsl x1,x9,#0x3
0080cd84	bl 0x00c2fe80
0080cd88	ldr x20,[x21]
0080cd8c	b 0x0080cdb4
0080cd90	ldr x0,[x21]
0080cd94	str xzr,[x21]
0080cd98	cbz x0,0x0080cda8
0080cd9c	ldr x8,[x21, #0x8]
0080cda0	lsl x1,x8,#0x3
0080cda4	bl 0x00c2fe80
0080cda8	str xzr,[x21, #0x8]
0080cdac	b 0x0080ce94
0080cdb0	mov x20,x0
0080cdb4	mov x0,x20
0080cdb8	mov w1,wzr
0080cdbc	mov x2,x22
0080cdc0	str x19,[x21, #0x8]
0080cdc4	bl 0x00c301c0
0080cdc8	ldr x9,[x21, #0x10]!
0080cdcc	cbz x9,0x0080ce94
0080cdd0	fmov d0,x19
0080cdd4	ldr x10,[x9, #0x8]
0080cdd8	cnt v0.8B,v0.8B
0080cddc	addv b0,v0.8B
0080cde0	fmov x8,d0
0080cde4	cmp x8,#0x1
0080cde8	b.hi 0x0080cdf8
0080cdec	sub x11,x19,#0x1
0080cdf0	and x10,x10,x11
0080cdf4	b 0x0080ce08
0080cdf8	cmp x10,x19
0080cdfc	b.cc 0x0080ce08
0080ce00	udiv x11,x10,x19
0080ce04	msub x10,x11,x19,x10
0080ce08	str x21,[x20, x10, LSL #0x3]
0080ce0c	ldr x11,[x9]
0080ce10	cbz x11,0x0080ce94
0080ce14	sub x12,x19,#0x1
0080ce18	b 0x0080ce30
0080ce1c	mov x13,x10
0080ce20	mov x9,x11
0080ce24	ldr x11,[x11]
0080ce28	mov x10,x13
0080ce2c	cbz x11,0x0080ce94
0080ce30	ldr x13,[x11, #0x8]
0080ce34	cmp x8,#0x1
0080ce38	b.hi 0x0080ce44
0080ce3c	and x13,x13,x12
0080ce40	b 0x0080ce54
0080ce44	cmp x13,x19
0080ce48	b.cc 0x0080ce54
0080ce4c	udiv x14,x13,x19
0080ce50	msub x13,x14,x19,x13
0080ce54	cmp x13,x10
0080ce58	b.eq 0x0080ce1c
0080ce5c	ldr x14,[x20, x13, LSL #0x3]
0080ce60	cbz x14,0x0080ce8c
0080ce64	ldr x14,[x11]
0080ce68	str x14,[x9]
0080ce6c	ldr x14,[x20, x13, LSL #0x3]
0080ce70	ldr x14,[x14]
0080ce74	str x14,[x11]
0080ce78	ldr x14,[x20, x13, LSL #0x3]
0080ce7c	mov x13,x10
0080ce80	str x11,[x14]
0080ce84	mov x11,x9
0080ce88	b 0x0080ce20
0080ce8c	str x9,[x20, x13, LSL #0x3]
0080ce90	b 0x0080ce20
0080ce94	ldp x20,x19,[sp, #0x20]
0080ce98	ldp x22,x21,[sp, #0x10]
0080ce9c	ldp x29,x30,[sp], #0x30
0080cea0	ret
0080cea4	bl 0x007fe1b8
