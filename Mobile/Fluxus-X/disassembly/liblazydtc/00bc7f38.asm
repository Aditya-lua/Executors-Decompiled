; std::__ndk1::stold @ 00bc7f38
00bc7f38	paciasp
00bc7f3c	sub sp,sp,#0x90
00bc7f40	stp x29,x30,[sp, #0x50]
00bc7f44	stp x24,x23,[sp, #0x60]
00bc7f48	stp x22,x21,[sp, #0x70]
00bc7f4c	stp x20,x19,[sp, #0x80]
00bc7f50	add x29,sp,#0x50
00bc7f54	mov w8,#0xa
00bc7f58	mov w22,#0x7473
00bc7f5c	ldr x9,[x0, #0x10]
00bc7f60	strb w8,[sp, #0x18]
00bc7f64	ldrb w8,[x0]
00bc7f68	movk w22,#0x6c6f, LSL #16
00bc7f6c	mov w23,#0x64
00bc7f70	mov x19,x1
00bc7f74	stur w22,[sp, #0x19]
00bc7f78	tst w8,#0x1
00bc7f7c	sturh w23,[sp, #0x1d]
00bc7f80	stur xzr,[x29, #-0x20]
00bc7f84	csinc x20,x9,x0,ne
00bc7f88	bl 0x00c30710
00bc7f8c	mov x21,x0
00bc7f90	ldr w24,[x0]
00bc7f94	str wzr,[x0]
00bc7f98	sub x1,x29,#0x20
00bc7f9c	mov x0,x20
00bc7fa0	bl 0x00c43900
00bc7fa4	ldr w8,[x21]
00bc7fa8	str w24,[x21]
00bc7fac	cmp w8,#0x22
00bc7fb0	b.eq 0x00bc7ff4
00bc7fb4	ldur x8,[x29, #-0x20]
00bc7fb8	subs x8,x8,x20
00bc7fbc	b.eq 0x00bc802c
00bc7fc0	str q0,[sp]
00bc7fc4	cbz x19,0x00bc7fcc
00bc7fc8	str x8,[x19]
00bc7fcc	add x0,sp,#0x18
00bc7fd0	bl 0x00c43db0
00bc7fd4	ldr q0,[sp]
00bc7fd8	ldp x20,x19,[sp, #0x80]
00bc7fdc	ldp x22,x21,[sp, #0x70]
00bc7fe0	ldp x24,x23,[sp, #0x60]
00bc7fe4	ldp x29,x30,[sp, #0x50]
00bc7fe8	add sp,sp,#0x90
00bc7fec	autiasp
00bc7ff0	ret
00bc7ff4	mov w8,#0x26
00bc7ff8	stur xzr,[x29, #-0x8]
00bc7ffc	sturb w8,[x29, #-0x18]
00bc8000	adrp x8,0x2ce000
00bc8004	add x8,x8,#0xb11
00bc8008	ldr x9,[x8]
00bc800c	ldur x8,[x8, #0x6]
00bc8010	stur w22,[x29, #-0x17]
00bc8014	sturb w23,[x29, #-0x13]
00bc8018	stur x9,[x29, #-0x12]
00bc801c	sub x9,x29,#0x18
00bc8020	stur x8,[x29, #-0xc]
00bc8024	orr x0,x9,#0x1
00bc8028	bl 0x0080c8d0
00bc802c	mov w9,#0x7473
00bc8030	mov w8,#0x28
00bc8034	stur xzr,[x29, #-0x8]
00bc8038	movk w9,#0x6c6f, LSL #16
00bc803c	sturb w8,[x29, #-0x18]
00bc8040	mov w8,#0x64
00bc8044	stur w9,[x29, #-0x17]
00bc8048	adrp x9,0x2ac000
00bc804c	add x9,x9,#0xd16
00bc8050	ldr x10,[x9]
00bc8054	sturb w8,[x29, #-0x13]
00bc8058	ldur x8,[x9, #0x7]
00bc805c	sub x9,x29,#0x18
00bc8060	stur x10,[x29, #-0x12]
00bc8064	stur x8,[x29, #-0xb]
00bc8068	orr x0,x9,#0x1
00bc806c	bl 0x00bcab04
00bc8070	b 0x00bc8074
00bc8074	mov x19,x0
00bc8078	sub x0,x29,#0x18
00bc807c	bl 0x00c43db0
00bc8080	add x0,sp,#0x18
00bc8084	bl 0x00c43db0
00bc8088	mov x0,x19
00bc808c	bl 0x00c2c090
