; std::__ndk1::__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>::~__list_imp @ 00987d68
00987d68	stp x22,x21,[sp, #-0x30]!
00987d6c	stp x20,x19,[sp, #0x10]
00987d70	stp x29,x30,[sp, #0x20]
00987d74	add x29,sp,#0x20
00987d78	ldr x8,[x0, #0x10]
00987d7c	mov x19,x0
00987d80	cbz x8,0x00987e00
00987d84	ldp x8,x20,[x19]
00987d88	ldr x9,[x8, #0x8]
00987d8c	ldr x10,[x20]
00987d90	cmp x20,x19
00987d94	str x9,[x10, #0x8]
00987d98	ldr x8,[x8, #0x8]
00987d9c	str x10,[x8]
00987da0	str xzr,[x19, #0x10]
00987da4	b.eq 0x00987e00
00987da8	ldr x22,[x20, #0x8]
00987dac	add x0,x20,#0x20
00987db0	bl 0x00c2ff80
00987db4	ldr x21,[x20, #0x18]
00987db8	cbz x21,0x00987dec
00987dbc	add x8,x21,#0x8
00987dc0	ldaxr x9,[x8]
00987dc4	sub x10,x9,#0x1
00987dc8	stlxr w11,x10,[x8]
00987dcc	cbnz w11,0x00987dc0
00987dd0	cbnz x9,0x00987dec
00987dd4	ldr x8,[x21]
00987dd8	mov x0,x21
00987ddc	ldr x8,[x8, #0x10]
00987de0	blr x8
00987de4	mov x0,x21
00987de8	bl 0x00c2ff00
00987dec	mov x0,x20
00987df0	bl 0x00c301d0
00987df4	cmp x22,x19
00987df8	mov x20,x22
00987dfc	b.ne 0x00987da8
00987e00	ldp x29,x30,[sp, #0x20]
00987e04	ldp x20,x19,[sp, #0x10]
00987e08	ldp x22,x21,[sp], #0x30
00987e0c	ret
