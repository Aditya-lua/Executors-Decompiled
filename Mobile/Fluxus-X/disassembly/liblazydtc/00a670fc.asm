; EVP_DigestSignInit_ex @ 00a670fc
00a670fc	sub sp,sp,#0x20
00a67100	mov x7,x5
00a67104	mov x5,x4
00a67108	mov x4,x3
00a6710c	mov x3,x2
00a67110	str x6,[sp, #0x8]
00a67114	mov x2,xzr
00a67118	mov x6,xzr
00a6711c	stp x29,x30,[sp, #0x10]
00a67120	add x29,sp,#0x10
00a67124	str wzr,[sp]
00a67128	bl 0x00a67138
00a6712c	ldp x29,x30,[sp, #0x10]
00a67130	add sp,sp,#0x20
00a67134	ret
