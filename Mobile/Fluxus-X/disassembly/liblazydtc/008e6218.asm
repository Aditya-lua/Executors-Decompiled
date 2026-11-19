; std::__ndk1::operator+ @ 008e6218
008e6218	stp x26,x25,[sp, #-0x50]!
008e621c	stp x24,x23,[sp, #0x10]
008e6220	stp x22,x21,[sp, #0x20]
008e6224	stp x20,x19,[sp, #0x30]
008e6228	stp x29,x30,[sp, #0x40]
008e622c	add x29,sp,#0x40
008e6230	mov x20,x1
008e6234	mov x21,x0
008e6238	mov x19,x8
008e623c	stp xzr,xzr,[x8]
008e6240	str xzr,[x8, #0x10]
008e6244	bl 0x00c2ff50
008e6248	ldrb w26,[x20]
008e624c	ldr x8,[x20, #0x8]
008e6250	mov x23,x0
008e6254	lsr w9,w26,#0x1
008e6258	tst w26,#0x1
008e625c	csel x22,x9,x8,eq
008e6260	add x8,x22,x0
008e6264	cmn x8,#0x10
008e6268	b.cs 0x008e62f0
008e626c	cmp x8,#0x16
008e6270	b.hi 0x008e62c8
008e6274	lsl w8,w23,#0x1
008e6278	mov x24,x19
008e627c	strb w8,[x24], #0x1
008e6280	cbz x23,0x008e6294
008e6284	mov x0,x24
008e6288	mov x1,x21
008e628c	mov x2,x23
008e6290	bl 0x00c2ffd0
008e6294	strb wzr,[x24, x23]
008e6298	ldr x8,[x20, #0x10]
008e629c	tst w26,#0x1
008e62a0	csinc x1,x8,x20,ne
008e62a4	mov x0,x19
008e62a8	mov x2,x22
008e62ac	bl 0x00c308c0
008e62b0	ldp x29,x30,[sp, #0x40]
008e62b4	ldp x20,x19,[sp, #0x30]
008e62b8	ldp x22,x21,[sp, #0x20]
008e62bc	ldp x24,x23,[sp, #0x10]
008e62c0	ldp x26,x25,[sp], #0x50
008e62c4	ret
008e62c8	add x8,x8,#0x10
008e62cc	and x25,x8,#-0x10
008e62d0	mov x0,x25
008e62d4	bl 0x00c2fed0
008e62d8	mov x24,x0
008e62dc	orr x8,x25,#0x1
008e62e0	stp x23,x0,[x19, #0x8]
008e62e4	str x8,[x19]
008e62e8	cbnz x23,0x008e6284
008e62ec	b 0x008e6294
008e62f0	mov x0,x19
008e62f4	bl 0x00c30ce0
