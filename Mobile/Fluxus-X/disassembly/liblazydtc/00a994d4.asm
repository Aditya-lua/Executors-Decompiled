; ossl_ctx_thread_stop @ 00a994d4
00a994d4	adrp x8,0xcc9000
00a994d8	ldr x8,[x8, #0x130]
00a994dc	cmn x8,#0x1
00a994e0	b.eq 0x00a99514
00a994e4	str x19,[sp, #-0x20]!
00a994e8	mov x19,x0
00a994ec	adrp x0,0xcc9000
00a994f0	add x0,x0,#0x130
00a994f4	stp x29,x30,[sp, #0x10]
00a994f8	add x29,sp,#0x10
00a994fc	bl 0x00c38360
00a99500	ldp x29,x30,[sp, #0x10]
00a99504	mov x1,x0
00a99508	mov x0,x19
00a9950c	ldr x19,[sp], #0x20
00a99510	b 0x00a99588
00a99514	ret
