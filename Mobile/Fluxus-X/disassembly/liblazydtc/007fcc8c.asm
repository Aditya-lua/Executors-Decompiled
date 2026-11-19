; FUN_007fcc8c @ 007fcc8c
007fcc8c	stp x29,x30,[sp, #-0x20]!
007fcc90	stp x20,x19,[sp, #0x10]
007fcc94	mov x29,sp
007fcc98	mov x19,x0
007fcc9c	add x0,x0,#0x60
007fcca0	mov x20,x1
007fcca4	bl 0x00c2ff10
007fcca8	ldp x8,x9,[x19, #0x38]
007fccac	mov w11,#0xaa
007fccb0	mov x12,#-0x1
007fccb4	subs x10,x9,x8
007fccb8	asr x10,x10,#0x3
007fccbc	cmp x9,x8
007fccc0	madd x10,x10,x11,x12
007fccc4	ldp x11,x12,[x19, #0x50]
007fccc8	add x11,x12,x11
007fcccc	csel x10,xzr,x10,eq
007fccd0	cmp x10,x11
007fccd4	b.ne 0x007fcce4
007fccd8	add x0,x19,#0x30
007fccdc	bl 0x007feb50
007fcce0	ldp x8,x9,[x19, #0x38]
007fcce4	cmp x9,x8
007fcce8	b.eq 0x007fcd38
007fccec	ldp x9,x10,[x19, #0x50]
007fccf0	mov w11,#0xaa
007fccf4	add x9,x10,x9
007fccf8	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
007fccfc	movk x10,#0xc0c1
007fcd00	umulh x10,x9,x10
007fcd04	lsr x10,x10,#0x7
007fcd08	msub x9,x10,x11,x9
007fcd0c	mov w11,#0x18
007fcd10	ldr x8,[x8, x10, LSL #0x3]
007fcd14	nop
007fcd18	madd x0,x9,x11,x8
007fcd1c	ldrb w8,[x20]
007fcd20	tbnz w8,#0x0,0x007fcd44
007fcd24	ldr x8,[x20, #0x10]
007fcd28	ldr q0,[x20]
007fcd2c	str x8,[x0, #0x10]
007fcd30	str q0,[x0]
007fcd34	b 0x007fcd4c
007fcd38	mov x0,xzr
007fcd3c	ldrb w8,[x20]
007fcd40	tbz w8,#0x0,0x007fcd24
007fcd44	ldp x2,x1,[x20, #0x8]
007fcd48	bl 0x007ff40c
007fcd4c	ldr x8,[x19, #0x58]
007fcd50	add x0,x19,#0x60
007fcd54	add x8,x8,#0x1
007fcd58	str x8,[x19, #0x58]
007fcd5c	ldp x20,x19,[sp, #0x10]
007fcd60	ldp x29,x30,[sp], #0x20
007fcd64	b 0x00c2ff20
