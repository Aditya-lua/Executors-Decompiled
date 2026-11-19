; std::__ndk1::stoll @ 00bc8490
00bc8490	paciasp
00bc8494	sub sp,sp,#0x70
00bc8498	stp x29,x30,[sp, #0x30]
00bc849c	str x23,[sp, #0x40]
00bc84a0	stp x22,x21,[sp, #0x50]
00bc84a4	stp x20,x19,[sp, #0x60]
00bc84a8	add x29,sp,#0x30
00bc84ac	mov w8,#0xa
00bc84b0	ldrb w9,[x0]
00bc84b4	ldr x10,[x0, #0x10]
00bc84b8	strb w8,[sp]
00bc84bc	mov w8,#0x7473
00bc84c0	mov w21,w2
00bc84c4	movk w8,#0x6c6f, LSL #16
00bc84c8	tst w9,#0x1
00bc84cc	mov x19,x1
00bc84d0	stur w8,[sp, #0x1]
00bc84d4	mov w8,#0x6c
00bc84d8	sturh w8,[sp, #0x5]
00bc84dc	add x8,x0,#0x4
00bc84e0	str xzr,[x29, #0x18]
00bc84e4	csel x20,x8,x10,eq
00bc84e8	bl 0x00c30710
00bc84ec	ldr w23,[x0]
00bc84f0	mov x22,x0
00bc84f4	str wzr,[x0]
00bc84f8	add x1,x29,#0x18
00bc84fc	mov x0,x20
00bc8500	mov w2,w21
00bc8504	bl 0x00c43970
00bc8508	ldr w8,[x22]
00bc850c	str w23,[x22]
00bc8510	cmp w8,#0x22
00bc8514	b.eq 0x00bc855c
00bc8518	ldr x8,[x29, #0x18]
00bc851c	subs x8,x8,x20
00bc8520	b.eq 0x00bc85a0
00bc8524	mov x21,x0
00bc8528	cbz x19,0x00bc8534
00bc852c	asr x8,x8,#0x2
00bc8530	str x8,[x19]
00bc8534	mov x0,sp
00bc8538	bl 0x00c43db0
00bc853c	mov x0,x21
00bc8540	ldp x20,x19,[sp, #0x60]
00bc8544	ldr x23,[sp, #0x40]
00bc8548	ldp x22,x21,[sp, #0x50]
00bc854c	ldp x29,x30,[sp, #0x30]
00bc8550	add sp,sp,#0x70
00bc8554	autiasp
00bc8558	ret
00bc855c	mov w9,#0x7473
00bc8560	mov w8,#0x26
00bc8564	str xzr,[sp, #0x28]
00bc8568	movk w9,#0x6c6f, LSL #16
00bc856c	strb w8,[sp, #0x18]
00bc8570	mov w8,#0x6c
00bc8574	stur w9,[sp, #0x19]
00bc8578	adrp x9,0x2ce000
00bc857c	add x9,x9,#0xb11
00bc8580	ldr x10,[x9]
00bc8584	strb w8,[sp, #0x1d]
00bc8588	ldur x8,[x9, #0x6]
00bc858c	add x9,sp,#0x18
00bc8590	stur x10,[sp, #0x1e]
00bc8594	stur x8,[sp, #0x24]
00bc8598	orr x0,x9,#0x1
00bc859c	bl 0x0080c8d0
00bc85a0	mov w9,#0x7473
00bc85a4	mov w8,#0x28
00bc85a8	str xzr,[sp, #0x28]
00bc85ac	movk w9,#0x6c6f, LSL #16
00bc85b0	strb w8,[sp, #0x18]
00bc85b4	mov w8,#0x6c
00bc85b8	stur w9,[sp, #0x19]
00bc85bc	adrp x9,0x2ac000
00bc85c0	add x9,x9,#0xd16
00bc85c4	ldr x10,[x9]
00bc85c8	strb w8,[sp, #0x1d]
00bc85cc	ldur x8,[x9, #0x7]
00bc85d0	add x9,sp,#0x18
00bc85d4	stur x10,[sp, #0x1e]
00bc85d8	stur x8,[sp, #0x25]
00bc85dc	orr x0,x9,#0x1
00bc85e0	bl 0x00bcab04
00bc85e4	b 0x00bc85e8
00bc85e8	mov x19,x0
00bc85ec	add x0,sp,#0x18
00bc85f0	bl 0x00c43db0
00bc85f4	b 0x00bc85fc
00bc85fc	mov x0,sp
00bc8600	bl 0x00c43db0
00bc8604	mov x0,x19
00bc8608	bl 0x00c2c090
