; EVP_DigestVerifyInit @ 00a679b8
00a679b8	sub sp,sp,#0x20
00a679bc	mov x7,x4
00a679c0	mov x6,x3
00a679c4	mov w8,#0x1
00a679c8	mov x3,xzr
00a679cc	mov x4,xzr
00a679d0	mov x5,xzr
00a679d4	stp x29,x30,[sp, #0x10]
00a679d8	add x29,sp,#0x10
00a679dc	str xzr,[sp, #0x8]
00a679e0	str w8,[sp]
00a679e4	bl 0x00a67138
00a679e8	ldp x29,x30,[sp, #0x10]
00a679ec	add sp,sp,#0x20
00a679f0	ret
