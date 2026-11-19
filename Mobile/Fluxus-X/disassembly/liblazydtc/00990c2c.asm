; std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::WebSocket::*)(),ix::WebSocket*>> @ 00990c2c
00990c2c	str x21,[sp, #-0x30]!
00990c30	stp x20,x19,[sp, #0x10]
00990c34	stp x29,x30,[sp, #0x20]
00990c38	add x29,sp,#0x20
00990c3c	mov x19,x0
00990c40	bl 0x00c30180
00990c44	ldr x1,[x19]
00990c48	str xzr,[x19]
00990c4c	ldr w0,[x0]
00990c50	bl 0x00c30190
00990c54	ldp x10,x9,[x19, #0x10]
00990c58	ldr x8,[x19, #0x8]
00990c5c	add x0,x9,x10, ASR #0x1
00990c60	tbz w10,#0x0,0x00990c6c
00990c64	ldr x9,[x0]
00990c68	ldr x8,[x9, x8#0x0]
00990c6c	blr x8
00990c70	ldr x20,[x19]
00990c74	str xzr,[x19]
00990c78	cbz x20,0x00990c8c
00990c7c	mov x0,x20
00990c80	bl 0x00c301a0
00990c84	mov x0,x20
00990c88	bl 0x00c301d0
00990c8c	mov x0,x19
00990c90	bl 0x00c301d0
00990c94	ldp x29,x30,[sp, #0x20]
00990c98	ldp x20,x19,[sp, #0x10]
00990c9c	mov x0,xzr
00990ca0	ldr x21,[sp], #0x30
00990ca4	ret
