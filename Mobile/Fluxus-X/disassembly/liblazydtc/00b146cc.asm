; X509_VERIFY_PARAM_get1_ip_asc @ 00b146cc
00b146cc	cbz x0,0x00b146e4
00b146d0	ldr x8,[x0, #0x60]
00b146d4	cbz x8,0x00b146e4
00b146d8	ldr w1,[x0, #0x68]
00b146dc	mov x0,x8
00b146e0	b 0x00c409c0
00b146e4	stp x29,x30,[sp, #-0x10]!
00b146e8	mov x29,sp
00b146ec	bl 0x00c342a0
00b146f0	adrp x0,0x2d8000
00b146f4	adrp x2,0x2cc000
00b146f8	add x0,x0,#0xa44
00b146fc	add x2,x2,#0x2cf
00b14700	orr w1,wzr,#0x1c0
00b14704	bl 0x00c342b0
00b14708	mov w1,#0x102
00b1470c	mov w0,#0xb
00b14710	movk w1,#0xc, LSL #16
00b14714	mov x2,xzr
00b14718	bl 0x00c342c0
00b1471c	mov x0,xzr
00b14720	ldp x29,x30,[sp], #0x10
00b14724	ret
