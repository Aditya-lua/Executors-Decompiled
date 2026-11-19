; ossl_tdes_newctx @ 00b2c690
00b2c690	stp x26,x25,[sp, #-0x50]!
00b2c694	stp x24,x23,[sp, #0x10]
00b2c698	stp x22,x21,[sp, #0x20]
00b2c69c	stp x20,x19,[sp, #0x30]
00b2c6a0	stp x29,x30,[sp, #0x40]
00b2c6a4	add x29,sp,#0x40
00b2c6a8	mov x19,x6
00b2c6ac	mov x20,x5
00b2c6b0	mov x22,x4
00b2c6b4	mov x24,x3
00b2c6b8	mov x25,x2
00b2c6bc	mov w23,w1
00b2c6c0	mov x21,x0
00b2c6c4	bl 0x00c41000
00b2c6c8	cbz w0,0x00b2c710
00b2c6cc	adrp x1,0x2a4000
00b2c6d0	add x1,x1,#0xdfc
00b2c6d4	mov w0,#0x248
00b2c6d8	orr w2,wzr,#0x1f
00b2c6dc	bl 0x00c34250
00b2c6e0	mov x26,x0
00b2c6e4	cbz x0,0x00b2c714
00b2c6e8	mov x0,x26
00b2c6ec	mov x1,x25
00b2c6f0	mov x2,x24
00b2c6f4	mov x3,x22
00b2c6f8	mov w4,w23
00b2c6fc	mov x5,x20
00b2c700	mov x6,x19
00b2c704	mov x7,x21
00b2c708	bl 0x00c41280
00b2c70c	b 0x00b2c714
00b2c710	mov x26,xzr
00b2c714	ldp x29,x30,[sp, #0x40]
00b2c718	ldp x20,x19,[sp, #0x30]
00b2c71c	ldp x22,x21,[sp, #0x20]
00b2c720	ldp x24,x23,[sp, #0x10]
00b2c724	mov x0,x26
00b2c728	ldp x26,x25,[sp], #0x50
00b2c72c	ret
