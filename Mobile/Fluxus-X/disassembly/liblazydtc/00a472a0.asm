; ossl_c448_ed448_sign_prehash @ 00a472a0
00a472a0	sub sp,sp,#0x20
00a472a4	mov x8,x6
00a472a8	mov x9,x5
00a472ac	mov w5,#0x40
00a472b0	mov w6,#0x1
00a472b4	stp x8,x7,[sp]
00a472b8	mov x7,x9
00a472bc	stp x29,x30,[sp, #0x10]
00a472c0	add x29,sp,#0x10
00a472c4	bl 0x00a46ebc
00a472c8	ldp x29,x30,[sp, #0x10]
00a472cc	add sp,sp,#0x20
00a472d0	ret
