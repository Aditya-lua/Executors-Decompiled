; EVP_DigestVerifyInit_ex @ 00a67978
00a67978	sub sp,sp,#0x20
00a6797c	mov x7,x5
00a67980	mov x5,x4
00a67984	mov x4,x3
00a67988	mov x3,x2
00a6798c	str x6,[sp, #0x8]
00a67990	mov w8,#0x1
00a67994	mov x2,xzr
00a67998	mov x6,xzr
00a6799c	stp x29,x30,[sp, #0x10]
00a679a0	add x29,sp,#0x10
00a679a4	str w8,[sp]
00a679a8	bl 0x00a67138
00a679ac	ldp x29,x30,[sp, #0x10]
00a679b0	add sp,sp,#0x20
00a679b4	ret
