; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf @ 00bd807c
00bd807c	paciasp
00bd8080	stp x29,x30,[sp, #-0x30]!
00bd8084	str x21,[sp, #0x10]
00bd8088	stp x20,x19,[sp, #0x20]
00bd808c	mov x29,sp
00bd8090	adrp x21,0xcb4000
00bd8094	mov x19,x0
00bd8098	ldr x21,[x21, #0xa08]
00bd809c	add x8,x21,#0x10
00bd80a0	str x8,[x0], #0x8
00bd80a4	bl 0x00c30480
00bd80a8	adrp x8,0xcb4000
00bd80ac	movi v0.2D,#0x0
00bd80b0	add x0,x29,#0x18
00bd80b4	ldr x8,[x8, #0xf68]
00bd80b8	add x1,x19,#0x8
00bd80bc	stp xzr,xzr,[x19, #0x48]
00bd80c0	str xzr,[x19, #0x40]
00bd80c4	add x8,x8,#0x10
00bd80c8	strh wzr,[x19, #0xa0]
00bd80cc	str x8,[x19]
00bd80d0	mov w8,#0x20
00bd80d4	stp q0,q0,[x19, #0x20]
00bd80d8	str q0,[x19, #0x10]
00bd80dc	stp q0,q0,[x19, #0x60]
00bd80e0	str q0,[x19, #0x80]
00bd80e4	stur q0,[x19, #0x8c]
00bd80e8	str w8,[x19, #0x9c]
00bd80ec	strb wzr,[x19, #0xa2]
00bd80f0	bl 0x00c30660
00bd80f4	adrp x1,0xcb4000
00bd80f8	add x0,x29,#0x18
00bd80fc	ldr x1,[x1, #0xf70]
00bd8100	bl 0x00c333b0
00bd8104	mov w20,w0
00bd8108	add x0,x29,#0x18
00bd810c	bl 0x00c30090
00bd8110	tbz w20,#0x0,0x00bd8154
00bd8114	add x0,x29,#0x18
00bd8118	add x1,x19,#0x8
00bd811c	bl 0x00c30660
00bd8120	adrp x1,0xcb4000
00bd8124	add x0,x29,#0x18
00bd8128	ldr x1,[x1, #0xf70]
00bd812c	bl 0x00c30080
00bd8130	str x0,[x19, #0x80]
00bd8134	add x0,x29,#0x18
00bd8138	bl 0x00c30090
00bd813c	ldr x0,[x19, #0x80]
00bd8140	ldr x8,[x0]
00bd8144	ldr x8,[x8, #0x38]
00bd8148	blr x8
00bd814c	and w8,w0,#0x1
00bd8150	strb w8,[x19, #0xa2]
00bd8154	ldr x8,[x19]
00bd8158	ldr x8,[x8, #0x18]
00bd815c	mov x0,x19
00bd8160	mov x1,xzr
00bd8164	mov w2,#0x1000
00bd8168	blr x8
00bd816c	ldp x20,x19,[sp, #0x20]
00bd8170	ldr x21,[sp, #0x10]
00bd8174	ldp x29,x30,[sp], #0x30
00bd8178	autiasp
00bd817c	ret
