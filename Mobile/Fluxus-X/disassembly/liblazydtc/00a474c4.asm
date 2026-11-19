; ossl_ed448_sign @ 00a474c4
00a474c4	sub sp,sp,#0x20
00a474c8	stp x29,x30,[sp, #0x10]
00a474cc	add x29,sp,#0x10
00a474d0	ldr x11,[x29, #0x10]
00a474d4	mov x8,x6
00a474d8	mov x9,x3
00a474dc	mov x10,x2
00a474e0	stp x7,x11,[sp]
00a474e4	mov x2,x5
00a474e8	mov x3,x4
00a474ec	mov x4,x10
00a474f0	mov x5,x9
00a474f4	mov w6,wzr
00a474f8	mov x7,x8
00a474fc	bl 0x00a46ebc
00a47500	ldp x29,x30,[sp, #0x10]
00a47504	cmn w0,#0x1
00a47508	cset w0,eq
00a4750c	add sp,sp,#0x20
00a47510	ret
