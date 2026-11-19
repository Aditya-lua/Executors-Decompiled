; X509V3_EXT_i2d @ 00af45cc
00af45cc	str x21,[sp, #-0x30]!
00af45d0	stp x20,x19,[sp, #0x10]
00af45d4	stp x29,x30,[sp, #0x20]
00af45d8	add x29,sp,#0x20
00af45dc	mov x19,x2
00af45e0	mov w20,w1
00af45e4	mov w21,w0
00af45e8	bl 0x00c40790
00af45ec	cbz x0,0x00af460c
00af45f0	mov w2,w20
00af45f4	mov x3,x19
00af45f8	ldp x29,x30,[sp, #0x20]
00af45fc	ldp x20,x19,[sp, #0x10]
00af4600	mov w1,w21
00af4604	ldr x21,[sp], #0x30
00af4608	b 0x00af464c
00af460c	bl 0x00c342a0
00af4610	adrp x0,0x2aa000
00af4614	adrp x2,0x2ae000
00af4618	add x0,x0,#0x9f7
00af461c	add x2,x2,#0x75b
00af4620	orr w1,wzr,#0xc0
00af4624	bl 0x00c342b0
00af4628	mov w0,#0x22
00af462c	mov w1,#0x81
00af4630	mov x2,xzr
00af4634	bl 0x00c342c0
00af4638	ldp x29,x30,[sp, #0x20]
00af463c	ldp x20,x19,[sp, #0x10]
00af4640	mov x0,xzr
00af4644	ldr x21,[sp], #0x30
00af4648	ret
