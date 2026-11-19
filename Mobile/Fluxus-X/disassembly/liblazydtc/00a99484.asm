; OPENSSL_thread_stop_ex @ 00a99484
00a99484	str x19,[sp, #-0x20]!
00a99488	stp x29,x30,[sp, #0x10]
00a9948c	add x29,sp,#0x10
00a99490	bl 0x00c383c0
00a99494	adrp x8,0xcc9000
00a99498	ldr x8,[x8, #0x130]
00a9949c	cmn x8,#0x1
00a994a0	b.eq 0x00a994c8
00a994a4	mov x19,x0
00a994a8	adrp x0,0xcc9000
00a994ac	add x0,x0,#0x130
00a994b0	bl 0x00c38360
00a994b4	ldp x29,x30,[sp, #0x10]
00a994b8	mov x1,x0
00a994bc	mov x0,x19
00a994c0	ldr x19,[sp], #0x20
00a994c4	b 0x00a99588
00a994c8	ldp x29,x30,[sp, #0x10]
00a994cc	ldr x19,[sp], #0x20
00a994d0	ret
