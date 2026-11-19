; std::__ndk1::vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::__emplace_back_slow_path<cpr::Cookie_const&> @ 008ea208
008ea208	sub sp,sp,#0x70
008ea20c	stp x24,x23,[sp, #0x30]
008ea210	stp x22,x21,[sp, #0x40]
008ea214	stp x20,x19,[sp, #0x50]
008ea218	stp x29,x30,[sp, #0x60]
008ea21c	add x29,sp,#0x60
008ea220	mrs x21,tpidr_el0
008ea224	ldr x8,[x21, #0x28]
008ea228	orr x10,xzr,#-0x1111111111111112
008ea22c	movk x10,#0xeeef
008ea230	orr x24,xzr,#0x2222222222222222
008ea234	str x8,[sp, #0x28]
008ea238	ldp x9,x8,[x0]
008ea23c	movk x24,#0x222, LSL #48
008ea240	mov x19,x0
008ea244	mov x20,x1
008ea248	sub x8,x8,x9
008ea24c	asr x8,x8,#0x3
008ea250	mul x23,x8,x10
008ea254	add x8,x23,#0x1
008ea258	cmp x8,x24
008ea25c	b.hi 0x008ea3ec
008ea260	ldr x11,[x19, #0x10]
008ea264	sub x9,x11,x9
008ea268	asr x9,x9,#0x3
008ea26c	mul x10,x9,x10
008ea270	orr x9,xzr,#0x1111111111111111
008ea274	movk x9,#0x111, LSL #48
008ea278	cmp x10,x9
008ea27c	add x9,x19,#0x10
008ea280	b.cs 0x008ea2a8
008ea284	lsl x10,x10,#0x1
008ea288	mov x11,sp
008ea28c	cmp x10,x8
008ea290	add x22,x11,#0x18
008ea294	csel x24,x8,x10,cc
008ea298	stp xzr,x9,[sp, #0x18]
008ea29c	cbnz x24,0x008ea2b4
008ea2a0	mov x0,xzr
008ea2a4	b 0x008ea2c0
008ea2a8	mov x8,sp
008ea2ac	add x22,x8,#0x18
008ea2b0	stp xzr,x9,[sp, #0x18]
008ea2b4	orr w8,wzr,#0x78
008ea2b8	mul x0,x24,x8
008ea2bc	bl 0x00c2fed0
008ea2c0	orr w9,wzr,#0x78
008ea2c4	madd x8,x23,x9,x0
008ea2c8	madd x9,x24,x9,x0
008ea2cc	stp x8,x9,[sp, #0x10]
008ea2d0	stp x0,x8,[sp]
008ea2d4	mov x0,x8
008ea2d8	mov x1,x20
008ea2dc	bl 0x00c30df0
008ea2e0	ldr x8,[sp, #0x10]
008ea2e4	add x8,x8,#0x78
008ea2e8	str x8,[sp, #0x10]
008ea2ec	ldp x12,x9,[x19]
008ea2f0	cmp x9,x12
008ea2f4	b.eq 0x008ea39c
008ea2f8	ldr x11,[sp, #0x8]
008ea2fc	mov x10,xzr
008ea300	sub x12,x12,x9
008ea304	add x13,x9,x10
008ea308	ldur x14,[x13, #-0x68]
008ea30c	add x15,x11,x10
008ea310	sub x10,x10,#0x78
008ea314	cmp x12,x10
008ea318	stur x14,[x15, #-0x68]
008ea31c	ldur q0,[x13, #-0x78]
008ea320	stur q0,[x15, #-0x78]
008ea324	ldur x14,[x13, #-0x50]
008ea328	stp xzr,xzr,[x13, #-0x70]
008ea32c	stur xzr,[x13, #-0x78]
008ea330	stur x14,[x15, #-0x50]
008ea334	ldur q0,[x13, #-0x60]
008ea338	stur q0,[x15, #-0x60]
008ea33c	ldur x14,[x13, #-0x38]
008ea340	stp xzr,xzr,[x13, #-0x58]
008ea344	stur xzr,[x13, #-0x60]
008ea348	stur x14,[x15, #-0x38]
008ea34c	ldur q0,[x13, #-0x48]
008ea350	stur q0,[x15, #-0x48]
008ea354	ldurb w14,[x13, #-0x30]
008ea358	stp xzr,xzr,[x13, #-0x48]
008ea35c	stur xzr,[x13, #-0x38]
008ea360	sturb w14,[x15, #-0x30]
008ea364	ldur x14,[x13, #-0x18]
008ea368	stur x14,[x15, #-0x18]
008ea36c	ldur q0,[x13, #-0x28]
008ea370	sub x14,x15,#0x78
008ea374	stur q0,[x15, #-0x28]
008ea378	ldur q0,[x13, #-0x10]
008ea37c	stp xzr,xzr,[x13, #-0x20]
008ea380	stur xzr,[x13, #-0x28]
008ea384	stur q0,[x15, #-0x10]
008ea388	str x14,[sp, #0x8]
008ea38c	b.ne 0x008ea304
008ea390	ldp x12,x9,[x19]
008ea394	add x10,x11,x10
008ea398	b 0x008ea3a0
008ea39c	ldr x10,[sp, #0x8]
008ea3a0	stp x10,x8,[x19]
008ea3a4	stp x12,x9,[sp, #0x8]
008ea3a8	ldr x8,[x22]
008ea3ac	ldr x9,[x19, #0x10]
008ea3b0	mov x0,sp
008ea3b4	str x8,[x19, #0x10]
008ea3b8	str x9,[x22]
008ea3bc	str x12,[sp]
008ea3c0	bl 0x00c30e70
008ea3c4	ldr x8,[x21, #0x28]
008ea3c8	ldr x9,[sp, #0x28]
008ea3cc	cmp x8,x9
008ea3d0	b.ne 0x008ea3f4
008ea3d4	ldp x29,x30,[sp, #0x60]
008ea3d8	ldp x20,x19,[sp, #0x50]
008ea3dc	ldp x22,x21,[sp, #0x40]
008ea3e0	ldp x24,x23,[sp, #0x30]
008ea3e4	add sp,sp,#0x70
008ea3e8	ret
008ea3ec	mov x0,x19
008ea3f0	bl 0x00c30bd0
008ea3f4	bl 0x00c2fec0
