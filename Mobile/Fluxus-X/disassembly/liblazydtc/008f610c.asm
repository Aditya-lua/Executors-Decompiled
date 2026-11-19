; std::__ndk1::__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>>::push_back @ 008f610c
008f610c	stp x24,x23,[sp, #-0x40]!
008f6110	stp x22,x21,[sp, #0x10]
008f6114	stp x20,x19,[sp, #0x20]
008f6118	stp x29,x30,[sp, #0x30]
008f611c	add x29,sp,#0x30
008f6120	ldp x23,x8,[x0, #0x10]
008f6124	mov x19,x0
008f6128	mov x20,x1
008f612c	cmp x23,x8
008f6130	b.ne 0x008f6294
008f6134	ldp x22,x21,[x19]
008f6138	subs x9,x21,x22
008f613c	b.ls 0x008f6184
008f6140	asr x8,x9,#0x3
008f6144	add x9,x8,#0x1
008f6148	add x10,x8,#0x2
008f614c	cmp x9,#0x0
008f6150	csinc x8,x10,x8,lt
008f6154	subs x2,x23,x21
008f6158	asr x8,x8,#0x1
008f615c	sub x22,x21,x8, LSL #0x3
008f6160	asr x23,x2,#0x3
008f6164	b.eq 0x008f61a8
008f6168	mov x0,x22
008f616c	mov x1,x21
008f6170	neg x24,x8
008f6174	bl 0x00c2ff60
008f6178	ldr x8,[x19, #0x8]
008f617c	add x8,x8,x24, LSL #0x3
008f6180	b 0x008f61ac
008f6184	subs x8,x8,x22
008f6188	asr x8,x8,#0x2
008f618c	csinc x24,x8,xzr,ne
008f6190	cbz x24,0x008f61b8
008f6194	lsr x8,x24,#0x3d
008f6198	cbnz x8,0x008f62bc
008f619c	lsl x0,x24,#0x3
008f61a0	bl 0x00c2fed0
008f61a4	b 0x008f61bc
008f61a8	mov x8,x22
008f61ac	add x23,x22,x23, LSL #0x3
008f61b0	stp x8,x23,[x19, #0x8]
008f61b4	b 0x008f6294
008f61b8	mov x0,xzr
008f61bc	lsr x13,x24,#0x2
008f61c0	cmp x21,x23
008f61c4	add x9,x0,x13, LSL #0x3
008f61c8	add x8,x0,x24, LSL #0x3
008f61cc	b.eq 0x008f61f8
008f61d0	sub x10,x23,#0x8
008f61d4	sub x10,x10,x21
008f61d8	lsr x14,x10,#0x3
008f61dc	add x11,x13,x14
008f61e0	add x12,x14,#0x1
008f61e4	cmp x12,#0x4
008f61e8	add x10,x11,#0x1
008f61ec	b.cs 0x008f6200
008f61f0	mov x11,x9
008f61f4	b 0x008f6264
008f61f8	mov x23,x9
008f61fc	b 0x008f627c
008f6200	add x14,x21,x14, LSL #0x3
008f6204	add x14,x14,#0x8
008f6208	cmp x9,x14
008f620c	b.cs 0x008f6224
008f6210	add x11,x0,x11, LSL #0x3
008f6214	add x11,x11,#0x8
008f6218	cmp x21,x11
008f621c	mov x11,x9
008f6220	b.cc 0x008f6264
008f6224	and x14,x12,#0x3ffffffffffffffc
008f6228	add x13,x0,x13, LSL #0x3
008f622c	lsl x16,x14,#0x3
008f6230	add x15,x21,#0x10
008f6234	add x11,x9,x16
008f6238	add x21,x21,x16
008f623c	add x13,x13,#0x10
008f6240	mov x16,x14
008f6244	ldp q0,q1,[x15, #-0x10]
008f6248	add x15,x15,#0x20
008f624c	subs x16,x16,#0x4
008f6250	stp q0,q1,[x13, #-0x10]
008f6254	add x13,x13,#0x20
008f6258	b.ne 0x008f6244
008f625c	cmp x12,x14
008f6260	b.eq 0x008f6274
008f6264	ldr x12,[x21], #0x8
008f6268	cmp x23,x21
008f626c	str x12,[x11], #0x8
008f6270	b.ne 0x008f6264
008f6274	ldr x22,[x19]
008f6278	add x23,x0,x10, LSL #0x3
008f627c	stp x0,x9,[x19]
008f6280	stp x23,x8,[x19, #0x10]
008f6284	cbz x22,0x008f6294
008f6288	mov x0,x22
008f628c	bl 0x00c301d0
008f6290	ldr x23,[x19, #0x10]
008f6294	ldr x8,[x20]
008f6298	str x8,[x23]
008f629c	ldr x8,[x19, #0x10]
008f62a0	add x8,x8,#0x8
008f62a4	str x8,[x19, #0x10]
008f62a8	ldp x29,x30,[sp, #0x30]
008f62ac	ldp x20,x19,[sp, #0x20]
008f62b0	ldp x22,x21,[sp, #0x10]
008f62b4	ldp x24,x23,[sp], #0x40
008f62b8	ret
008f62bc	mov w0,#0x10
008f62c0	bl 0x00c30000
008f62c4	mov x19,x0
008f62c8	adrp x1,0x2ad000
008f62cc	add x1,x1,#0x51
008f62d0	bl 0x00c30040
008f62d4	adrp x8,0xcb4000
008f62d8	ldr x8,[x8, #0x980]
008f62dc	adrp x1,0xcb4000
008f62e0	adrp x2,0xcb4000
008f62e4	mov x0,x19
008f62e8	add x8,x8,#0x10
008f62ec	str x8,[x19]
008f62f0	ldr x1,[x1, #0x970]
008f62f4	ldr x2,[x2, #0x978]
008f62f8	bl 0x00c30020
