; std::__ndk1::stol @ 00bc81f4
00bc81f4	paciasp
00bc81f8	sub sp,sp,#0x70
00bc81fc	stp x29,x30,[sp, #0x30]
00bc8200	str x23,[sp, #0x40]
00bc8204	stp x22,x21,[sp, #0x50]
00bc8208	stp x20,x19,[sp, #0x60]
00bc820c	add x29,sp,#0x30
00bc8210	mov w8,#0x8
00bc8214	ldrb w9,[x0]
00bc8218	add x10,x0,#0x4
00bc821c	strb w8,[sp]
00bc8220	mov w8,#0x7473
00bc8224	mov w21,w2
00bc8228	movk w8,#0x6c6f, LSL #16
00bc822c	tst w9,#0x1
00bc8230	mov x19,x1
00bc8234	stur w8,[sp, #0x1]
00bc8238	ldr x8,[x0, #0x10]
00bc823c	strb wzr,[sp, #0x5]
00bc8240	str xzr,[x29, #0x18]
00bc8244	csel x20,x10,x8,eq
00bc8248	bl 0x00c30710
00bc824c	ldr w23,[x0]
00bc8250	mov x22,x0
00bc8254	str wzr,[x0]
00bc8258	add x1,x29,#0x18
00bc825c	mov x0,x20
00bc8260	mov w2,w21
00bc8264	bl 0x00c43830
00bc8268	ldr w8,[x22]
00bc826c	str w23,[x22]
00bc8270	cmp w8,#0x22
00bc8274	b.eq 0x00bc82bc
00bc8278	ldr x8,[x29, #0x18]
00bc827c	subs x8,x8,x20
00bc8280	b.eq 0x00bc82e8
00bc8284	mov x21,x0
00bc8288	cbz x19,0x00bc8294
00bc828c	asr x8,x8,#0x2
00bc8290	str x8,[x19]
00bc8294	mov x0,sp
00bc8298	bl 0x00c43db0
00bc829c	mov x0,x21
00bc82a0	ldp x20,x19,[sp, #0x60]
00bc82a4	ldr x23,[sp, #0x40]
00bc82a8	ldp x22,x21,[sp, #0x50]
00bc82ac	ldp x29,x30,[sp, #0x30]
00bc82b0	add sp,sp,#0x70
00bc82b4	autiasp
00bc82b8	ret
00bc82bc	adrp x1,0x2ce000
00bc82c0	add x1,x1,#0xb11
00bc82c4	add x8,sp,#0x18
00bc82c8	mov x0,sp
00bc82cc	add x19,sp,#0x18
00bc82d0	bl 0x00bcab58
00bc82d4	ldrb w8,[sp, #0x18]
00bc82d8	ldr x9,[sp, #0x28]
00bc82dc	tst w8,#0x1
00bc82e0	csinc x0,x9,x19,ne
00bc82e4	bl 0x0080c8d0
00bc82e8	mov x0,sp
00bc82ec	bl 0x00bcaab4
00bc82f0	mov x19,x0
00bc82f4	add x0,sp,#0x18
00bc82f8	bl 0x00c43db0
00bc82fc	b 0x00bc8304
00bc8304	mov x0,sp
00bc8308	bl 0x00c43db0
00bc830c	mov x0,x19
00bc8310	bl 0x00c2c090
