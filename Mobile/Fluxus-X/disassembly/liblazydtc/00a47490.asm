; ossl_c448_ed448_verify_prehash @ 00a47490
00a47490	sub sp,sp,#0x20
00a47494	mov x8,x4
00a47498	mov w7,w5
00a4749c	mov w4,#0x40
00a474a0	mov w5,#0x1
00a474a4	str x6,[sp]
00a474a8	mov x6,x8
00a474ac	stp x29,x30,[sp, #0x10]
00a474b0	add x29,sp,#0x10
00a474b4	bl 0x00a472d4
00a474b8	ldp x29,x30,[sp, #0x10]
00a474bc	add sp,sp,#0x20
00a474c0	ret
