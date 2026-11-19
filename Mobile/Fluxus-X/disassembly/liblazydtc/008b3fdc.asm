; FUN_008b3fdc @ 008b3fdc
008b3fdc	stp x29,x30,[sp, #-0x30]!
008b3fe0	stp x22,x21,[sp, #0x10]
008b3fe4	stp x20,x19,[sp, #0x20]
008b3fe8	mov x29,sp
008b3fec	mov w8,#0x1
008b3ff0	mov x19,x0
008b3ff4	movk w8,#0x400, LSL #16
008b3ff8	cmp w1,w8
008b3ffc	b.ge 0x008b4134
008b4000	mov w21,w1
008b4004	cmn w1,#0x5
008b4008	b.lt 0x008b415c
008b400c	ldrsw x8,[x19, #0x40]
008b4010	ldr x20,[x19, #0x58]
008b4014	add w22,w21,#0x5
008b4018	ubfiz x3,x22,#0x4,#0x20
008b401c	ldrb w4,[x19, #0x1]
008b4020	mov x0,x19
008b4024	lsl x2,x8,#0x4
008b4028	mov x1,x20
008b402c	bl 0x008b8498
008b4030	ldrsw x11,[x19, #0x40]
008b4034	str x0,[x19, #0x58]
008b4038	cmp w11,w22
008b403c	b.ge 0x008b4094
008b4040	sub x8,x22,x11
008b4044	mov x9,x11
008b4048	cmp x8,#0x2
008b404c	b.cc 0x008b407c
008b4050	add x12,x0,x11, LSL #0x4
008b4054	and x10,x8,#-0x2
008b4058	add x9,x10,x11
008b405c	add x11,x12,#0x1c
008b4060	mov x12,x10
008b4064	subs x12,x12,#0x2
008b4068	stur wzr,[x11, #-0x10]
008b406c	str wzr,[x11], #0x20
008b4070	b.ne 0x008b4064
008b4074	cmp x8,x10
008b4078	b.eq 0x008b4094
008b407c	add x8,x0,x9, LSL #0x4
008b4080	sub x9,x22,x9
008b4084	add x8,x8,#0xc
008b4088	subs x9,x9,#0x1
008b408c	str wzr,[x8], #0x10
008b4090	b.ne 0x008b4088
008b4094	ldr x8,[x19, #0x68]
008b4098	add x9,x0,w21, SXTW  #0x4
008b409c	str w22,[x19, #0x40]
008b40a0	sub x10,x8,x20
008b40a4	ldr x8,[x19, #0x30]
008b40a8	str x9,[x19, #0x48]
008b40ac	add x9,x0,x10
008b40b0	str x9,[x19, #0x68]
008b40b4	cbz x8,0x008b40d0
008b40b8	ldr x9,[x8, #0x8]
008b40bc	sub x9,x9,x20
008b40c0	add x9,x0,x9
008b40c4	str x9,[x8, #0x8]
008b40c8	ldr x8,[x8, #0x20]
008b40cc	cbnz x8,0x008b40b8
008b40d0	ldr x8,[x19, #0x20]
008b40d4	ldr x9,[x19, #0x50]
008b40d8	cmp x8,x9
008b40dc	b.hi 0x008b4114
008b40e0	ldp x11,x10,[x8, #0x10]
008b40e4	ldr x12,[x8, #0x8]
008b40e8	sub x12,x12,x20
008b40ec	sub x10,x10,x20
008b40f0	sub x11,x11,x20
008b40f4	add x10,x0,x10
008b40f8	add x11,x0,x11
008b40fc	stp x11,x10,[x8, #0x10]
008b4100	add x10,x0,x12
008b4104	str x10,[x8, #0x8]
008b4108	add x8,x8,#0x30
008b410c	cmp x8,x9
008b4110	b.ls 0x008b40e0
008b4114	ldr x8,[x19, #0x70]
008b4118	sub x8,x8,x20
008b411c	add x8,x0,x8
008b4120	str x8,[x19, #0x70]
008b4124	ldp x20,x19,[sp, #0x20]
008b4128	ldp x22,x21,[sp, #0x10]
008b412c	ldp x29,x30,[sp], #0x30
008b4130	ret
008b4134	cbz w2,0x008b4150
008b4138	ldr x8,[x19, #0x50]
008b413c	ldur q0,[x8, #-0x20]
008b4140	sub x8,x8,#0x30
008b4144	str x8,[x19, #0x50]
008b4148	ext v0.16B,v0.16B,v0.16B,0x8
008b414c	stur q0,[x19, #0x68]
008b4150	mov x0,x19
008b4154	mov w1,#0x4
008b4158	bl 0x008b3f9c
008b415c	mov x0,x19
008b4160	bl 0x008b75fc
