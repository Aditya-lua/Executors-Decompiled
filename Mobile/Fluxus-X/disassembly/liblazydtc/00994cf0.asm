; std::__ndk1::__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>::erase @ 00994cf0
00994cf0	str x21,[sp, #-0x30]!
00994cf4	stp x20,x19,[sp, #0x10]
00994cf8	stp x29,x30,[sp, #0x20]
00994cfc	add x29,sp,#0x20
00994d00	ldr x8,[x1, #0x8]
00994d04	mov x19,x1
00994d08	cbz x8,0x00994d1c
00994d0c	mov x20,x8
00994d10	ldr x8,[x8]
00994d14	cbnz x8,0x00994d0c
00994d18	b 0x00994d48
00994d1c	mov x8,x19
00994d20	ldr x20,[x8, #0x10]!
00994d24	ldr x9,[x20]
00994d28	cmp x9,x19
00994d2c	b.eq 0x00994d48
00994d30	ldr x9,[x8]
00994d34	mov x8,x9
00994d38	ldr x20,[x8, #0x10]!
00994d3c	ldr x10,[x20]
00994d40	cmp x10,x9
00994d44	b.ne 0x00994d30
00994d48	ldr x8,[x0]
00994d4c	cmp x8,x19
00994d50	b.ne 0x00994d58
00994d54	str x20,[x0]
00994d58	ldp x8,x9,[x0, #0x8]
00994d5c	mov x1,x19
00994d60	sub x9,x9,#0x1
00994d64	str x9,[x0, #0x10]
00994d68	mov x0,x8
00994d6c	bl 0x00c33de0
00994d70	ldr x21,[x19, #0x28]
00994d74	cbz x21,0x00994da8
00994d78	add x8,x21,#0x8
00994d7c	ldaxr x9,[x8]
00994d80	sub x10,x9,#0x1
00994d84	stlxr w11,x10,[x8]
00994d88	cbnz w11,0x00994d7c
00994d8c	cbnz x9,0x00994da8
00994d90	ldr x8,[x21]
00994d94	mov x0,x21
00994d98	ldr x8,[x8, #0x10]
00994d9c	blr x8
00994da0	mov x0,x21
00994da4	bl 0x00c2ff00
00994da8	mov x0,x19
00994dac	bl 0x00c301d0
00994db0	mov x0,x20
00994db4	ldp x29,x30,[sp, #0x20]
00994db8	ldp x20,x19,[sp, #0x10]
00994dbc	ldr x21,[sp], #0x30
00994dc0	ret
