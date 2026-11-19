; ossl_namemap_num2name @ 00a82704
00a82704	sub sp,sp,#0x20
00a82708	stp x2,xzr,[sp]
00a8270c	adrp x2,0xa82000
00a82710	add x2,x2,#0x73c
00a82714	mov x3,sp
00a82718	stp x29,x30,[sp, #0x10]
00a8271c	add x29,sp,#0x10
00a82720	bl 0x00a823c4
00a82724	ldr x8,[sp, #0x8]
00a82728	ldp x29,x30,[sp, #0x10]
00a8272c	cmp w0,#0x0
00a82730	csel x0,xzr,x8,eq
00a82734	add sp,sp,#0x20
00a82738	ret
