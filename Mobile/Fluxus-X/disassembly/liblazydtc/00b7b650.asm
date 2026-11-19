; mbedtls_poly1305_finish @ 00b7b650
00b7b650	str x21,[sp, #-0x30]!
00b7b654	stp x20,x19,[sp, #0x10]
00b7b658	stp x29,x30,[sp, #0x20]
00b7b65c	add x29,sp,#0x20
00b7b660	ldr x8,[x0, #0x48]
00b7b664	mov x20,x0
00b7b668	mov x19,x1
00b7b66c	cbz x8,0x00b7b6b0
00b7b670	add x21,x20,#0x34
00b7b674	mov w9,#0x1
00b7b678	strb w9,[x21, x8]
00b7b67c	ldr x8,[x20, #0x48]
00b7b680	orr w9,wzr,#0xf
00b7b684	mov w1,wzr
00b7b688	add x10,x8,#0x1
00b7b68c	add x0,x21,x10
00b7b690	sub x2,x9,x8
00b7b694	str x10,[x20, #0x48]
00b7b698	bl 0x00c301c0
00b7b69c	mov w1,#0x1
00b7b6a0	mov x0,x20
00b7b6a4	mov x2,x21
00b7b6a8	mov w3,wzr
00b7b6ac	bl 0x00b7b534
00b7b6b0	ldp w8,w9,[x20, #0x20]
00b7b6b4	ldp w10,w11,[x20, #0x28]
00b7b6b8	ldr w12,[x20, #0x30]
00b7b6bc	mov w0,wzr
00b7b6c0	add x13,x8,#0x5
00b7b6c4	add x14,x9,x13, LSR #0x20
00b7b6c8	add x15,x10,x14, LSR #0x20
00b7b6cc	add x16,x11,x15, LSR #0x20
00b7b6d0	lsr x17,x16,#0x20
00b7b6d4	add w12,w12,w17
00b7b6d8	lsr w12,w12,#0x2
00b7b6dc	neg w17,w12
00b7b6e0	sub w12,w12,#0x1
00b7b6e4	and w8,w12,w8
00b7b6e8	and w13,w17,w13
00b7b6ec	and w9,w12,w9
00b7b6f0	and w14,w17,w14
00b7b6f4	and w10,w12,w10
00b7b6f8	and w15,w17,w15
00b7b6fc	and w11,w12,w11
00b7b700	and w12,w17,w16
00b7b704	ldp w16,w17,[x20, #0x10]
00b7b708	orr w8,w8,w13
00b7b70c	ldp w13,w18,[x20, #0x18]
00b7b710	orr w9,w9,w14
00b7b714	orr w10,w10,w15
00b7b718	add x8,x8,x16
00b7b71c	add x9,x9,x17
00b7b720	add x10,x10,x13
00b7b724	add x9,x9,x8, LSR #0x20
00b7b728	orr w11,w11,w12
00b7b72c	add x10,x10,x9, LSR #0x20
00b7b730	add w11,w11,w18
00b7b734	stp w8,w9,[x19]
00b7b738	lsr x8,x10,#0x20
00b7b73c	add w8,w11,w8
00b7b740	stp w10,w8,[x19, #0x8]
00b7b744	ldp x29,x30,[sp, #0x20]
00b7b748	ldp x20,x19,[sp, #0x10]
00b7b74c	ldr x21,[sp], #0x30
00b7b750	ret
