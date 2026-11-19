; std::__ndk1::deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>::__add_back_capacity @ 008f9f54
008f9f54	sub sp,sp,#0x90
008f9f58	stp x26,x25,[sp, #0x40]
008f9f5c	stp x24,x23,[sp, #0x50]
008f9f60	stp x22,x21,[sp, #0x60]
008f9f64	stp x20,x19,[sp, #0x70]
008f9f68	stp x29,x30,[sp, #0x80]
008f9f6c	add x29,sp,#0x80
008f9f70	mrs x22,tpidr_el0
008f9f74	ldr x8,[x22, #0x28]
008f9f78	mov x19,x0
008f9f7c	str x8,[sp, #0x38]
008f9f80	ldr x8,[x0, #0x20]
008f9f84	subs x8,x8,#0x100
008f9f88	b.cc 0x008f9ffc
008f9f8c	ldp x25,x24,[x19, #0x8]
008f9f90	str x8,[x19, #0x20]
008f9f94	mov x20,x25
008f9f98	ldr x23,[x20], #0x8
008f9f9c	ldr x8,[x19, #0x18]
008f9fa0	str x20,[x19, #0x8]
008f9fa4	cmp x24,x8
008f9fa8	b.ne 0x008fa2d4
008f9fac	ldr x21,[x19]
008f9fb0	subs x9,x20,x21
008f9fb4	b.ls 0x008fa0cc
008f9fb8	asr x8,x9,#0x3
008f9fbc	add x9,x8,#0x1
008f9fc0	add x10,x8,#0x2
008f9fc4	cmp x9,#0x0
008f9fc8	csinc x8,x10,x8,lt
008f9fcc	subs x2,x24,x20
008f9fd0	asr x8,x8,#0x1
008f9fd4	sub x21,x20,x8, LSL #0x3
008f9fd8	asr x24,x2,#0x3
008f9fdc	b.eq 0x008fa190
008f9fe0	mov x0,x21
008f9fe4	mov x1,x20
008f9fe8	neg x25,x8
008f9fec	bl 0x00c2ff60
008f9ff0	ldr x8,[x19, #0x8]
008f9ff4	add x8,x8,x25, LSL #0x3
008f9ff8	b 0x008fa194
008f9ffc	ldp x10,x8,[x19, #0x8]
008fa000	ldr x11,[x19]
008fa004	ldr x9,[x19, #0x18]
008fa008	sub x10,x8,x10
008fa00c	asr x20,x10,#0x3
008fa010	sub x10,x9,x11
008fa014	cmp x20,x10, ASR #0x3
008fa018	b.cs 0x008fa088
008fa01c	mov w0,#0x1000
008fa020	cmp x9,x8
008fa024	b.ne 0x008fa0b4
008fa028	bl 0x00c2fed0
008fa02c	str x0,[sp, #0x10]
008fa030	add x1,sp,#0x10
008fa034	mov x0,x19
008fa038	bl 0x00c31540
008fa03c	ldp x25,x24,[x19, #0x8]
008fa040	mov x20,x25
008fa044	ldr x23,[x20], #0x8
008fa048	ldr x8,[x19, #0x18]
008fa04c	str x20,[x19, #0x8]
008fa050	cmp x24,x8
008fa054	b.ne 0x008fa2d4
008fa058	ldr x21,[x19]
008fa05c	subs x9,x20,x21
008fa060	b.hi 0x008f9fb8
008fa064	subs x8,x8,x21
008fa068	asr x8,x8,#0x2
008fa06c	csinc x26,x8,xzr,ne
008fa070	cbz x26,0x008fa270
008fa074	lsr x8,x26,#0x3d
008fa078	cbnz x8,0x008fa3ec
008fa07c	lsl x0,x26,#0x3
008fa080	bl 0x00c2fed0
008fa084	b 0x008fa274
008fa088	asr x8,x10,#0x2
008fa08c	cmp x10,#0x0
008fa090	add x9,x19,#0x18
008fa094	csinc x21,x8,xzr,ne
008fa098	stp xzr,x9,[sp, #0x28]
008fa09c	cbz x21,0x008fa0f0
008fa0a0	lsr x8,x21,#0x3d
008fa0a4	cbnz x8,0x008fa390
008fa0a8	lsl x0,x21,#0x3
008fa0ac	bl 0x00c2fed0
008fa0b0	b 0x008fa0f4
008fa0b4	bl 0x00c2fed0
008fa0b8	str x0,[sp, #0x10]
008fa0bc	add x1,sp,#0x10
008fa0c0	mov x0,x19
008fa0c4	bl 0x00c31550
008fa0c8	b 0x008fa2e4
008fa0cc	subs x8,x8,x21
008fa0d0	asr x8,x8,#0x2
008fa0d4	csinc x26,x8,xzr,ne
008fa0d8	cbz x26,0x008fa1a0
008fa0dc	lsr x8,x26,#0x3d
008fa0e0	cbnz x8,0x008fa3ac
008fa0e4	lsl x0,x26,#0x3
008fa0e8	bl 0x00c2fed0
008fa0ec	b 0x008fa1a4
008fa0f0	mov x0,xzr
008fa0f4	add x8,x0,x20, LSL #0x3
008fa0f8	add x9,x0,x21, LSL #0x3
008fa0fc	stp x8,x9,[sp, #0x20]
008fa100	stp x0,x8,[sp, #0x10]
008fa104	mov w0,#0x1000
008fa108	bl 0x00c2fed0
008fa10c	mov x20,x0
008fa110	str x0,[sp, #0x8]
008fa114	add x0,sp,#0x10
008fa118	add x1,sp,#0x8
008fa11c	bl 0x00c31570
008fa120	ldr x20,[x19, #0x10]
008fa124	ldr x8,[x19, #0x8]
008fa128	cmp x20,x8
008fa12c	b.eq 0x008fa144
008fa130	sub x20,x20,#0x8
008fa134	add x0,sp,#0x10
008fa138	mov x1,x20
008fa13c	bl 0x00c31560
008fa140	b 0x008fa124
008fa144	ldr x0,[x19]
008fa148	ldr q0,[sp, #0x10]
008fa14c	stp x0,x8,[sp, #0x10]
008fa150	str q0,[x19]
008fa154	ldp x9,x10,[x19, #0x10]
008fa158	ldr q0,[sp, #0x20]
008fa15c	cmp x9,x20
008fa160	stp x9,x10,[sp, #0x20]
008fa164	str q0,[x19, #0x10]
008fa168	b.eq 0x008fa184
008fa16c	sub x10,x9,#0x8
008fa170	sub x8,x10,x8
008fa174	mvn x8,x8
008fa178	and x8,x8,#-0x8
008fa17c	add x8,x9,x8
008fa180	str x8,[sp, #0x20]
008fa184	cbz x0,0x008fa2e4
008fa188	bl 0x00c301d0
008fa18c	b 0x008fa2e4
008fa190	mov x8,x21
008fa194	add x24,x21,x24, LSL #0x3
008fa198	stp x8,x24,[x19, #0x8]
008fa19c	b 0x008fa2d4
008fa1a0	mov x0,xzr
008fa1a4	lsr x10,x26,#0x2
008fa1a8	cmp x20,x24
008fa1ac	add x9,x0,x10, LSL #0x3
008fa1b0	add x8,x0,x26, LSL #0x3
008fa1b4	b.eq 0x008fa2b8
008fa1b8	sub x12,x24,#0x10
008fa1bc	sub x11,x24,#0x8
008fa1c0	sub x12,x12,x25
008fa1c4	sub x11,x11,x20
008fa1c8	lsr x12,x12,#0x3
008fa1cc	lsr x11,x11,#0x3
008fa1d0	add x13,x12,#0x1
008fa1d4	cmp x13,#0x4
008fa1d8	add x11,x11,#0x1
008fa1dc	b.cs 0x008fa1e8
008fa1e0	mov x12,x9
008fa1e4	b 0x008fa250
008fa1e8	add x14,x25,x12, LSL #0x3
008fa1ec	add x14,x14,#0x10
008fa1f0	cmp x9,x14
008fa1f4	b.cs 0x008fa210
008fa1f8	add x12,x10,x12
008fa1fc	add x12,x0,x12, LSL #0x3
008fa200	add x12,x12,#0x8
008fa204	cmp x20,x12
008fa208	mov x12,x9
008fa20c	b.cc 0x008fa250
008fa210	and x14,x13,#0x3ffffffffffffffc
008fa214	add x16,x0,x10, LSL #0x3
008fa218	lsl x17,x14,#0x3
008fa21c	add x15,x25,#0x18
008fa220	add x12,x9,x17
008fa224	add x20,x20,x17
008fa228	add x16,x16,#0x10
008fa22c	mov x17,x14
008fa230	ldp q0,q1,[x15, #-0x10]
008fa234	add x15,x15,#0x20
008fa238	subs x17,x17,#0x4
008fa23c	stp q0,q1,[x16, #-0x10]
008fa240	add x16,x16,#0x20
008fa244	b.ne 0x008fa230
008fa248	cmp x13,x14
008fa24c	b.eq 0x008fa260
008fa250	ldr x13,[x20], #0x8
008fa254	cmp x24,x20
008fa258	str x13,[x12], #0x8
008fa25c	b.ne 0x008fa250
008fa260	ldr x21,[x19]
008fa264	add x10,x11,x10
008fa268	add x24,x0,x10, LSL #0x3
008fa26c	b 0x008fa2bc
008fa270	mov x0,xzr
008fa274	lsr x10,x26,#0x2
008fa278	cmp x20,x24
008fa27c	add x9,x0,x10, LSL #0x3
008fa280	add x8,x0,x26, LSL #0x3
008fa284	b.eq 0x008fa2b8
008fa288	sub x12,x24,#0x10
008fa28c	sub x11,x24,#0x8
008fa290	sub x12,x12,x25
008fa294	sub x11,x11,x20
008fa298	lsr x12,x12,#0x3
008fa29c	lsr x11,x11,#0x3
008fa2a0	add x13,x12,#0x1
008fa2a4	cmp x13,#0x4
008fa2a8	add x11,x11,#0x1
008fa2ac	b.cs 0x008fa310
008fa2b0	mov x12,x9
008fa2b4	b 0x008fa378
008fa2b8	mov x24,x9
008fa2bc	stp x0,x9,[x19]
008fa2c0	stp x24,x8,[x19, #0x10]
008fa2c4	cbz x21,0x008fa2d4
008fa2c8	mov x0,x21
008fa2cc	bl 0x00c301d0
008fa2d0	ldr x24,[x19, #0x10]
008fa2d4	str x23,[x24]
008fa2d8	ldr x8,[x19, #0x10]
008fa2dc	add x8,x8,#0x8
008fa2e0	str x8,[x19, #0x10]
008fa2e4	ldr x8,[x22, #0x28]
008fa2e8	ldr x9,[sp, #0x38]
008fa2ec	cmp x8,x9
008fa2f0	b.ne 0x008fa38c
008fa2f4	ldp x29,x30,[sp, #0x80]
008fa2f8	ldp x20,x19,[sp, #0x70]
008fa2fc	ldp x22,x21,[sp, #0x60]
008fa300	ldp x24,x23,[sp, #0x50]
008fa304	ldp x26,x25,[sp, #0x40]
008fa308	add sp,sp,#0x90
008fa30c	ret
008fa310	add x14,x25,x12, LSL #0x3
008fa314	add x14,x14,#0x10
008fa318	cmp x9,x14
008fa31c	b.cs 0x008fa338
008fa320	add x12,x10,x12
008fa324	add x12,x0,x12, LSL #0x3
008fa328	add x12,x12,#0x8
008fa32c	cmp x20,x12
008fa330	mov x12,x9
008fa334	b.cc 0x008fa378
008fa338	and x14,x13,#0x3ffffffffffffffc
008fa33c	add x16,x0,x10, LSL #0x3
008fa340	lsl x17,x14,#0x3
008fa344	add x15,x25,#0x18
008fa348	add x12,x9,x17
008fa34c	add x20,x20,x17
008fa350	add x16,x16,#0x10
008fa354	mov x17,x14
008fa358	ldp q0,q1,[x15, #-0x10]
008fa35c	add x15,x15,#0x20
008fa360	subs x17,x17,#0x4
008fa364	stp q0,q1,[x16, #-0x10]
008fa368	add x16,x16,#0x20
008fa36c	b.ne 0x008fa358
008fa370	cmp x13,x14
008fa374	b.eq 0x008fa260
008fa378	ldr x13,[x20], #0x8
008fa37c	cmp x24,x20
008fa380	str x13,[x12], #0x8
008fa384	b.ne 0x008fa378
008fa388	b 0x008fa260
008fa38c	bl 0x00c2fec0
008fa390	mov w0,#0x10
008fa394	bl 0x00c30000
008fa398	mov x20,x0
008fa39c	adrp x1,0x2ad000
008fa3a0	add x1,x1,#0x51
008fa3a4	bl 0x00c30040
008fa3a8	b 0x008fa3c4
008fa3ac	mov w0,#0x10
008fa3b0	bl 0x00c30000
008fa3b4	mov x20,x0
008fa3b8	adrp x1,0x2ad000
008fa3bc	add x1,x1,#0x51
008fa3c0	bl 0x00c30040
008fa3c4	adrp x8,0xcb4000
008fa3c8	ldr x8,[x8, #0x980]
008fa3cc	adrp x1,0xcb4000
008fa3d0	adrp x2,0xcb4000
008fa3d4	mov x0,x20
008fa3d8	add x8,x8,#0x10
008fa3dc	str x8,[x20]
008fa3e0	ldr x1,[x1, #0x970]
008fa3e4	ldr x2,[x2, #0x978]
008fa3e8	bl 0x00c30020
008fa3ec	mov w0,#0x10
008fa3f0	bl 0x00c30000
008fa3f4	mov x20,x0
008fa3f8	adrp x1,0x2ad000
008fa3fc	add x1,x1,#0x51
008fa400	bl 0x00c30040
008fa404	b 0x008fa3c4
