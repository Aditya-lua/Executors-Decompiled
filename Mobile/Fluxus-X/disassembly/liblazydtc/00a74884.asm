; FUN_00a74884 @ 00a74884
00a74884	stp x20,x19,[sp, #-0x20]!
00a74888	mov w20,w0
00a7488c	mov x0,x2
00a74890	stp x29,x30,[sp, #0x10]
00a74894	add x29,sp,#0x10
00a74898	mov w19,w1
00a7489c	bl 0x00c38c30
00a748a0	ldr x8,[x0, #0x68]
00a748a4	stp w20,w19,[x8]
00a748a8	ldr x1,[x0, #0x60]
00a748ac	ldp x29,x30,[sp, #0x10]
00a748b0	ldp x20,x19,[sp], #0x20
00a748b4	br x1
