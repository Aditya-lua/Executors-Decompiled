; ossl_sm2_do_sign @ 00b61a74
00b61a74	stp x20,x19,[sp, #-0x20]!
00b61a78	mov x20,x0
00b61a7c	mov x0,x1
00b61a80	mov x1,x20
00b61a84	stp x29,x30,[sp, #0x10]
00b61a88	add x29,sp,#0x10
00b61a8c	bl 0x00b61ac8
00b61a90	mov x19,x0
00b61a94	cbz x0,0x00b61aac
00b61a98	mov x0,x20
00b61a9c	mov x1,x19
00b61aa0	bl 0x00b61d48
00b61aa4	mov x20,x0
00b61aa8	b 0x00b61ab0
00b61aac	mov x20,xzr
00b61ab0	mov x0,x19
00b61ab4	bl 0x00c36290
00b61ab8	ldp x29,x30,[sp, #0x10]
00b61abc	mov x0,x20
00b61ac0	ldp x20,x19,[sp], #0x20
00b61ac4	ret
