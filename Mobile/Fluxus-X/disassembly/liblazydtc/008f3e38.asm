; std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::assign<cpr::Parameter*> @ 008f3e38
008f3e38	sub sp,sp,#0x70
008f3e3c	stp x28,x27,[sp, #0x10]
008f3e40	stp x26,x25,[sp, #0x20]
008f3e44	stp x24,x23,[sp, #0x30]
008f3e48	stp x22,x21,[sp, #0x40]
008f3e4c	stp x20,x19,[sp, #0x50]
008f3e50	stp x29,x30,[sp, #0x60]
008f3e54	add x29,sp,#0x60
008f3e58	ldr x8,[x0, #0x10]
008f3e5c	ldr x24,[x0]
008f3e60	sub x9,x2,x1
008f3e64	asr x10,x9,#0x4
008f3e68	orr x9,xzr,#-0x5555555555555556
008f3e6c	movk x9,#0xaaab
008f3e70	mul x25,x10,x9
008f3e74	sub x10,x8,x24
008f3e78	asr x10,x10,#0x4
008f3e7c	mul x10,x10,x9
008f3e80	mov x20,x2
008f3e84	mov x21,x1
008f3e88	mov x19,x0
008f3e8c	cmp x25,x10
008f3e90	b.ls 0x008f3edc
008f3e94	cbz x24,0x008f4004
008f3e98	ldr x22,[x19, #0x8]
008f3e9c	cmp x22,x24
008f3ea0	b.eq 0x008f3fec
008f3ea4	ldurb w8,[x22, #-0x18]
008f3ea8	tbz w8,#0x0,0x008f3eb4
008f3eac	ldur x0,[x22, #-0x8]
008f3eb0	bl 0x00c301d0
008f3eb4	ldurb w8,[x22, #-0x30]
008f3eb8	sub x23,x22,#0x30
008f3ebc	tbz w8,#0x0,0x008f3ec8
008f3ec0	ldur x0,[x22, #-0x20]
008f3ec4	bl 0x00c301d0
008f3ec8	cmp x24,x23
008f3ecc	mov x22,x23
008f3ed0	b.ne 0x008f3ea4
008f3ed4	ldr x0,[x19]
008f3ed8	b 0x008f3ff0
008f3edc	ldr x8,[x19, #0x8]
008f3ee0	sub x8,x8,x24
008f3ee4	asr x10,x8,#0x4
008f3ee8	mul x9,x10,x9
008f3eec	add x22,x21,x8
008f3ef0	cmp x25,x9
008f3ef4	csel x8,x22,x20,hi
008f3ef8	subs x28,x8,x21
008f3efc	b.eq 0x008f3f70
008f3f00	mov x26,xzr
008f3f04	stp x9,x8,[sp]
008f3f08	cmp x21,x24
008f3f0c	b.eq 0x008f3f5c
008f3f10	add x27,x21,x26
008f3f14	ldrb w8,[x27]
008f3f18	ldp x9,x10,[x27, #0x8]
008f3f1c	add x23,x24,x26
008f3f20	mov x0,x23
008f3f24	lsr w11,w8,#0x1
008f3f28	tst w8,#0x1
008f3f2c	csinc x1,x10,x27,ne
008f3f30	csel x2,x11,x9,eq
008f3f34	bl 0x00c31090
008f3f38	ldrb w8,[x27, #0x18]
008f3f3c	ldp x9,x10,[x27, #0x20]
008f3f40	add x11,x27,#0x19
008f3f44	add x0,x23,#0x18
008f3f48	lsr w12,w8,#0x1
008f3f4c	tst w8,#0x1
008f3f50	csel x1,x11,x10,eq
008f3f54	csel x2,x12,x9,eq
008f3f58	bl 0x00c31090
008f3f5c	add x26,x26,#0x30
008f3f60	cmp x28,x26
008f3f64	b.ne 0x008f3f08
008f3f68	ldp x9,x8,[sp]
008f3f6c	add x24,x24,x26
008f3f70	cmp x25,x9
008f3f74	b.ls 0x008f3fa8
008f3f78	cmp x8,x20
008f3f7c	b.eq 0x008f4088
008f3f80	ldr x0,[x19, #0x8]
008f3f84	mov x1,x22
008f3f88	bl 0x00c30f30
008f3f8c	ldr x8,[x19, #0x8]
008f3f90	add x22,x22,#0x30
008f3f94	cmp x20,x22
008f3f98	add x0,x8,#0x30
008f3f9c	str x0,[x19, #0x8]
008f3fa0	b.ne 0x008f3f84
008f3fa4	b 0x008f4088
008f3fa8	ldr x20,[x19, #0x8]
008f3fac	cmp x20,x24
008f3fb0	b.eq 0x008f3fe4
008f3fb4	ldurb w8,[x20, #-0x18]
008f3fb8	tbz w8,#0x0,0x008f3fc4
008f3fbc	ldur x0,[x20, #-0x8]
008f3fc0	bl 0x00c301d0
008f3fc4	ldurb w8,[x20, #-0x30]
008f3fc8	sub x21,x20,#0x30
008f3fcc	tbz w8,#0x0,0x008f3fd8
008f3fd0	ldur x0,[x20, #-0x20]
008f3fd4	bl 0x00c301d0
008f3fd8	cmp x24,x21
008f3fdc	mov x20,x21
008f3fe0	b.ne 0x008f3fb4
008f3fe4	str x24,[x19, #0x8]
008f3fe8	b 0x008f4088
008f3fec	mov x0,x24
008f3ff0	str x24,[x19, #0x8]
008f3ff4	bl 0x00c301d0
008f3ff8	mov x8,xzr
008f3ffc	stp xzr,xzr,[x19]
008f4000	str xzr,[x19, #0x10]
008f4004	orr x9,xzr,#0x5555555555555555
008f4008	movk x9,#0x555, LSL #48
008f400c	cmp x25,x9
008f4010	b.hi 0x008f40a8
008f4014	orr x10,xzr,#-0x5555555555555556
008f4018	asr x8,x8,#0x4
008f401c	movk x10,#0xaaab
008f4020	mul x8,x8,x10
008f4024	orr x10,xzr,#-0x5555555555555556
008f4028	movk x10,#0xaaa9
008f402c	movk x10,#0x2aa, LSL #48
008f4030	cmp x8,x10
008f4034	b.hi 0x008f4044
008f4038	lsl x8,x8,#0x1
008f403c	cmp x8,x25
008f4040	csel x9,x25,x8,cc
008f4044	add x8,x9,x9, LSL #0x1
008f4048	lsl x22,x8,#0x4
008f404c	mov x0,x22
008f4050	bl 0x00c2fed0
008f4054	add x8,x0,x22
008f4058	cmp x21,x20
008f405c	stp x0,x0,[x19]
008f4060	str x8,[x19, #0x10]
008f4064	b.eq 0x008f4088
008f4068	mov x1,x21
008f406c	bl 0x00c30f30
008f4070	ldr x8,[x19, #0x8]
008f4074	add x21,x21,#0x30
008f4078	cmp x20,x21
008f407c	add x0,x8,#0x30
008f4080	str x0,[x19, #0x8]
008f4084	b.ne 0x008f4068
008f4088	ldp x29,x30,[sp, #0x60]
008f408c	ldp x20,x19,[sp, #0x50]
008f4090	ldp x22,x21,[sp, #0x40]
008f4094	ldp x24,x23,[sp, #0x30]
008f4098	ldp x26,x25,[sp, #0x20]
008f409c	ldp x28,x27,[sp, #0x10]
008f40a0	add sp,sp,#0x70
008f40a4	ret
008f40a8	mov x0,x19
008f40ac	bl 0x00c30bd0
