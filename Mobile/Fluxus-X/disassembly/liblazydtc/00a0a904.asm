; BN_print_fp @ 00a0a904
00a0a904	str x21,[sp, #-0x30]!
00a0a908	stp x20,x19,[sp, #0x10]
00a0a90c	stp x29,x30,[sp, #0x20]
00a0a910	add x29,sp,#0x20
00a0a914	mov x19,x1
00a0a918	mov x21,x0
00a0a91c	bl 0x00c32270
00a0a920	bl 0x00c32240
00a0a924	cbz x0,0x00a0a958
00a0a928	mov w1,#0x6a
00a0a92c	mov x2,xzr
00a0a930	mov x3,x21
00a0a934	mov x20,x0
00a0a938	bl 0x00c321a0
00a0a93c	mov x0,x20
00a0a940	mov x1,x19
00a0a944	bl 0x00a0a968
00a0a948	mov w19,w0
00a0a94c	mov x0,x20
00a0a950	bl 0x00c31a40
00a0a954	mov w0,w19
00a0a958	ldp x29,x30,[sp, #0x20]
00a0a95c	ldp x20,x19,[sp, #0x10]
00a0a960	ldr x21,[sp], #0x30
00a0a964	ret
