; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put @ 008f946c
008f946c	sub sp,sp,#0x50
008f9470	str x21,[sp, #0x20]
008f9474	stp x20,x19,[sp, #0x30]
008f9478	stp x29,x30,[sp, #0x40]
008f947c	add x29,sp,#0x40
008f9480	mrs x21,tpidr_el0
008f9484	ldr x8,[x21, #0x28]
008f9488	mov x19,x0
008f948c	mov w20,w1
008f9490	str x8,[sp, #0x18]
008f9494	strb wzr,[sp, #0x8]
008f9498	str x0,[sp, #0x10]
008f949c	ldr x8,[x0]
008f94a0	ldr x9,[x8, #-0x18]!
008f94a4	add x9,x0,x9
008f94a8	ldr w10,[x9, #0x20]
008f94ac	cbnz w10,0x008f952c
008f94b0	ldr x0,[x9, #0x88]
008f94b4	cbz x0,0x008f94c4
008f94b8	bl 0x00c30e50
008f94bc	ldr x8,[x19]
008f94c0	sub x8,x8,#0x18
008f94c4	mov w9,#0x1
008f94c8	strb w9,[sp, #0x8]
008f94cc	ldr x9,[x8]
008f94d0	add x9,x19,x9
008f94d4	ldr x0,[x9, #0x28]
008f94d8	cbz x0,0x008f9518
008f94dc	ldp x8,x9,[x0, #0x30]
008f94e0	cmp x8,x9
008f94e4	b.eq 0x008f94f8
008f94e8	add x9,x8,#0x1
008f94ec	str x9,[x0, #0x30]
008f94f0	strb w20,[x8]
008f94f4	b 0x008f952c
008f94f8	ldr x8,[x0]
008f94fc	and w1,w20,#0xff
008f9500	ldr x8,[x8, #0x68]
008f9504	blr x8
008f9508	cmn w0,#0x1
008f950c	b.ne 0x008f952c
008f9510	ldr x8,[x19]
008f9514	sub x8,x8,#0x18
008f9518	ldr x8,[x8]
008f951c	add x0,x19,x8
008f9520	ldr w8,[x0, #0x20]
008f9524	orr w1,w8,#0x1
008f9528	bl 0x00c30130
008f952c	add x0,sp,#0x8
008f9530	bl 0x00c30e60
008f9534	ldr x8,[x21, #0x28]
008f9538	ldr x9,[sp, #0x18]
008f953c	cmp x8,x9
008f9540	b.ne 0x008f955c
008f9544	mov x0,x19
008f9548	ldp x29,x30,[sp, #0x40]
008f954c	ldp x20,x19,[sp, #0x30]
008f9550	ldr x21,[sp, #0x20]
008f9554	add sp,sp,#0x50
008f9558	ret
008f955c	bl 0x00c2fec0
