; X509_STORE_CTX_cleanup @ 00b0f710
00b0f710	str x19,[sp, #-0x20]!
00b0f714	stp x29,x30,[sp, #0x10]
00b0f718	ldr x8,[x0, #0x88]
00b0f71c	mov x19,x0
00b0f720	add x29,sp,#0x10
00b0f724	cbz x8,0x00b0f734
00b0f728	mov x0,x19
00b0f72c	blr x8
00b0f730	str xzr,[x19, #0x88]
00b0f734	ldr x0,[x19, #0x20]
00b0f738	cbz x0,0x00b0f74c
00b0f73c	ldr x8,[x19, #0xd8]
00b0f740	cbnz x8,0x00b0f748
00b0f744	bl 0x00c35b90
00b0f748	str xzr,[x19, #0x20]
00b0f74c	ldr x0,[x19, #0xa0]
00b0f750	bl 0x00c40610
00b0f754	str xzr,[x19, #0xa0]
00b0f758	adrp x1,0xcb4000
00b0f75c	ldr x0,[x19, #0x98]
00b0f760	ldr x1,[x1, #0xd88]
00b0f764	bl 0x00c32600
00b0f768	add x2,x19,#0xe0
00b0f76c	mov w0,#0x5
00b0f770	mov x1,x19
00b0f774	str xzr,[x19, #0x98]
00b0f778	bl 0x00c356c0
00b0f77c	stp xzr,xzr,[x19, #0xe0]
00b0f780	ldp x29,x30,[sp, #0x10]
00b0f784	ldr x19,[sp], #0x20
00b0f788	ret
