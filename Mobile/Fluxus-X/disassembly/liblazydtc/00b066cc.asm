; X509_get1_email @ 00b066cc
00b066cc	stp x20,x19,[sp, #-0x20]!
00b066d0	mov w1,#0x55
00b066d4	mov x2,xzr
00b066d8	mov x3,xzr
00b066dc	stp x29,x30,[sp, #0x10]
00b066e0	add x29,sp,#0x10
00b066e4	mov x19,x0
00b066e8	bl 0x00c32ce0
00b066ec	mov x20,x0
00b066f0	mov x0,x19
00b066f4	bl 0x00c32d20
00b066f8	mov x1,x20
00b066fc	bl 0x00b06724
00b06700	adrp x1,0xcb5000
00b06704	ldr x1,[x1, #0x6b8]
00b06708	mov x19,x0
00b0670c	mov x0,x20
00b06710	bl 0x00c32600
00b06714	ldp x29,x30,[sp, #0x10]
00b06718	mov x0,x19
00b0671c	ldp x20,x19,[sp], #0x20
00b06720	ret
