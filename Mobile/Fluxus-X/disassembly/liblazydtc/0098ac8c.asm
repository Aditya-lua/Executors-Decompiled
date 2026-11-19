; std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::SocketServer::*)(),ix::SocketServer*>> @ 0098ac8c
0098ac8c	str x21,[sp, #-0x30]!
0098ac90	stp x20,x19,[sp, #0x10]
0098ac94	stp x29,x30,[sp, #0x20]
0098ac98	add x29,sp,#0x20
0098ac9c	mov x19,x0
0098aca0	bl 0x00c30180
0098aca4	ldr x1,[x19]
0098aca8	str xzr,[x19]
0098acac	ldr w0,[x0]
0098acb0	bl 0x00c30190
0098acb4	ldp x10,x9,[x19, #0x10]
0098acb8	ldr x8,[x19, #0x8]
0098acbc	add x0,x9,x10, ASR #0x1
0098acc0	tbz w10,#0x0,0x0098accc
0098acc4	ldr x9,[x0]
0098acc8	ldr x8,[x9, x8#0x0]
0098accc	blr x8
0098acd0	ldr x20,[x19]
0098acd4	str xzr,[x19]
0098acd8	cbz x20,0x0098acec
0098acdc	mov x0,x20
0098ace0	bl 0x00c301a0
0098ace4	mov x0,x20
0098ace8	bl 0x00c301d0
0098acec	mov x0,x19
0098acf0	bl 0x00c301d0
0098acf4	ldp x29,x30,[sp, #0x20]
0098acf8	ldp x20,x19,[sp, #0x10]
0098acfc	mov x0,xzr
0098ad00	ldr x21,[sp], #0x30
0098ad04	ret
