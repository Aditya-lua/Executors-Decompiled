; FUN_0084cf44 @ 0084cf44
0084cf44	stp x29,x30,[sp, #-0x40]!
0084cf48	str x23,[sp, #0x10]
0084cf4c	stp x22,x21,[sp, #0x20]
0084cf50	stp x20,x19,[sp, #0x30]
0084cf54	mov x29,sp
0084cf58	mov x19,x0
0084cf5c	ldr x9,[x0, #0x10]
0084cf60	ldr x0,[x0]
0084cf64	orr x10,xzr,#-0x5555555555555556
0084cf68	mov x20,x2
0084cf6c	mov x21,x1
0084cf70	sub x8,x9,x0
0084cf74	movk x10,#0xaaab
0084cf78	asr x11,x8,#0x3
0084cf7c	mul x11,x11,x10
0084cf80	cmp x3,x11
0084cf84	b.ls 0x0084d058
0084cf88	cbz x0,0x0084cfac
0084cf8c	mov x1,x8
0084cf90	str x0,[x19, #0x8]
0084cf94	mov x22,x3
0084cf98	bl 0x00c2fe80
0084cf9c	mov x3,x22
0084cfa0	mov x9,xzr
0084cfa4	stp xzr,xzr,[x19]
0084cfa8	str xzr,[x19, #0x10]
0084cfac	orr x8,xzr,#-0x5555555555555556
0084cfb0	movk x8,#0xaaa, LSL #48
0084cfb4	cmp x3,x8
0084cfb8	b.hi 0x0084d114
0084cfbc	asr x9,x9,#0x3
0084cfc0	orr x10,xzr,#-0x5555555555555556
0084cfc4	orr x11,xzr,#0x5555555555555555
0084cfc8	movk x10,#0xaaab
0084cfcc	movk x11,#0x555, LSL #48
0084cfd0	mul x9,x9,x10
0084cfd4	lsl x10,x9,#0x1
0084cfd8	cmp x10,x3
0084cfdc	csel x10,x10,x3,hi
0084cfe0	cmp x9,x11
0084cfe4	csel x9,x10,x8,cc
0084cfe8	cmp x9,x8
0084cfec	b.hi 0x0084d114
0084cff0	add x8,x9,x9, LSL #0x1
0084cff4	lsl x23,x8,#0x3
0084cff8	mov x0,x23
0084cffc	bl 0x00c2fed0
0084d000	mov x22,x0
0084d004	cmp x21,x20
0084d008	add x8,x0,x23
0084d00c	stp x0,x0,[x19]
0084d010	str x8,[x19, #0x10]
0084d014	b.eq 0x0084d050
0084d018	sub x8,x20,x21
0084d01c	orr x9,xzr,#-0x5555555555555556
0084d020	mov x10,#0x18
0084d024	sub x8,x8,#0x18
0084d028	movk x9,#0xaaab
0084d02c	mov x0,x22
0084d030	umulh x8,x8,x9
0084d034	mov w9,#0x18
0084d038	mov x1,x21
0084d03c	lsr x8,x8,#0x4
0084d040	madd x20,x8,x9,x10
0084d044	mov x2,x20
0084d048	bl 0x00c2ffd0
0084d04c	add x22,x22,x20
0084d050	str x22,[x19, #0x8]
0084d054	b 0x0084d100
0084d058	ldr x8,[x19, #0x8]
0084d05c	sub x9,x8,x0
0084d060	asr x11,x9,#0x3
0084d064	mul x10,x11,x10
0084d068	cmp x3,x10
0084d06c	b.ls 0x0084d0cc
0084d070	cmp x8,x0
0084d074	add x9,x21,x9
0084d078	b.eq 0x0084d09c
0084d07c	ldr q0,[x21]
0084d080	ldrb w10,[x21, #0x10]
0084d084	add x21,x21,#0x18
0084d088	cmp x21,x9
0084d08c	str q0,[x0]
0084d090	strb w10,[x0, #0x10]
0084d094	add x0,x0,#0x18
0084d098	b.ne 0x0084d07c
0084d09c	cmp x9,x20
0084d0a0	b.eq 0x0084d0fc
0084d0a4	mov x10,x8
0084d0a8	ldr x11,[x9, #0x10]
0084d0ac	ldr q0,[x9], #0x18
0084d0b0	cmp x9,x20
0084d0b4	add x10,x10,#0x18
0084d0b8	str x11,[x8, #0x10]
0084d0bc	str q0,[x8], #0x18
0084d0c0	b.ne 0x0084d0a8
0084d0c4	str x10,[x19, #0x8]
0084d0c8	b 0x0084d100
0084d0cc	cmp x21,x20
0084d0d0	b.eq 0x0084d0f4
0084d0d4	ldr q0,[x21]
0084d0d8	ldrb w8,[x21, #0x10]
0084d0dc	add x21,x21,#0x18
0084d0e0	cmp x21,x20
0084d0e4	str q0,[x0]
0084d0e8	strb w8,[x0, #0x10]
0084d0ec	add x0,x0,#0x18
0084d0f0	b.ne 0x0084d0d4
0084d0f4	str x0,[x19, #0x8]
0084d0f8	b 0x0084d100
0084d0fc	str x8,[x19, #0x8]
0084d100	ldp x20,x19,[sp, #0x30]
0084d104	ldr x23,[sp, #0x10]
0084d108	ldp x22,x21,[sp, #0x20]
0084d10c	ldp x29,x30,[sp], #0x40
0084d110	ret
0084d114	bl 0x00844480
