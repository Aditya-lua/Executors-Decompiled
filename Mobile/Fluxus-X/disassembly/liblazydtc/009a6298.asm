; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 009a6298
009a6298	sub sp,sp,#0x70
009a629c	str x25,[sp, #0x20]
009a62a0	stp x24,x23,[sp, #0x30]
009a62a4	stp x22,x21,[sp, #0x40]
009a62a8	stp x20,x19,[sp, #0x50]
009a62ac	stp x29,x30,[sp, #0x60]
009a62b0	add x29,sp,#0x60
009a62b4	mrs x25,tpidr_el0
009a62b8	ldr x8,[x25, #0x28]
009a62bc	mov x19,x0
009a62c0	mov w20,w1
009a62c4	str x8,[sp, #0x18]
009a62c8	strb wzr,[sp]
009a62cc	str x0,[sp, #0x8]
009a62d0	ldr x8,[x0]
009a62d4	ldr x9,[x8, #-0x18]!
009a62d8	add x9,x0,x9
009a62dc	ldr w10,[x9, #0x20]
009a62e0	cbnz w10,0x009a63c4
009a62e4	ldr x0,[x9, #0x88]
009a62e8	cbz x0,0x009a62f8
009a62ec	bl 0x00c30e50
009a62f0	ldr x8,[x19]
009a62f4	sub x8,x8,#0x18
009a62f8	mov w9,#0x1
009a62fc	strb w9,[sp]
009a6300	ldr x8,[x8]
009a6304	add x0,x19,x8
009a6308	add x8,sp,#0x10
009a630c	bl 0x00c30070
009a6310	adrp x1,0xcb4000
009a6314	ldr x1,[x1, #0xf40]
009a6318	add x0,sp,#0x10
009a631c	bl 0x00c30080
009a6320	mov x21,x0
009a6324	add x0,sp,#0x10
009a6328	bl 0x00c30090
009a632c	ldr x8,[x19]
009a6330	ldur x8,[x8, #-0x18]
009a6334	add x22,x19,x8
009a6338	ldr w3,[x22, #0x90]
009a633c	ldr x23,[x22, #0x28]
009a6340	cmn w3,#0x1
009a6344	b.ne 0x009a6388
009a6348	add x8,sp,#0x10
009a634c	mov x0,x22
009a6350	bl 0x00c30070
009a6354	adrp x1,0xcb4000
009a6358	ldr x1,[x1, #0x998]
009a635c	add x0,sp,#0x10
009a6360	bl 0x00c30080
009a6364	ldr x8,[x0]
009a6368	ldr x8,[x8, #0x38]
009a636c	mov w1,#0x20
009a6370	blr x8
009a6374	mov w24,w0
009a6378	add x0,sp,#0x10
009a637c	bl 0x00c30090
009a6380	and w3,w24,#0xff
009a6384	str w3,[x22, #0x90]
009a6388	ldr x8,[x21]
009a638c	ldr x8,[x8, #0x18]
009a6390	and w4,w20,#0x1
009a6394	mov x0,x21
009a6398	mov x1,x23
009a639c	mov x2,x22
009a63a0	blr x8
009a63a4	cbnz x0,0x009a63c4
009a63a8	ldr x8,[x19]
009a63ac	mov w9,#0x5
009a63b0	ldur x8,[x8, #-0x18]
009a63b4	add x0,x19,x8
009a63b8	ldr w8,[x0, #0x20]
009a63bc	orr w1,w8,w9
009a63c0	bl 0x00c30130
009a63c4	mov x0,sp
009a63c8	bl 0x00c30e60
009a63cc	ldr x8,[x25, #0x28]
009a63d0	ldr x9,[sp, #0x18]
009a63d4	cmp x8,x9
009a63d8	b.ne 0x009a63fc
009a63dc	mov x0,x19
009a63e0	ldp x29,x30,[sp, #0x60]
009a63e4	ldp x20,x19,[sp, #0x50]
009a63e8	ldp x22,x21,[sp, #0x40]
009a63ec	ldp x24,x23,[sp, #0x30]
009a63f0	ldr x25,[sp, #0x20]
009a63f4	add sp,sp,#0x70
009a63f8	ret
009a63fc	bl 0x00c2fec0
