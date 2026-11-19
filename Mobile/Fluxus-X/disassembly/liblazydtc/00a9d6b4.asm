; OSSL_PARAM_BLD_push_utf8_string @ 00a9d6b4
00a9d6b4	stp x22,x21,[sp, #-0x30]!
00a9d6b8	stp x20,x19,[sp, #0x10]
00a9d6bc	mov x22,x3
00a9d6c0	mov x19,x2
00a9d6c4	mov x20,x1
00a9d6c8	mov x21,x0
00a9d6cc	stp x29,x30,[sp, #0x20]
00a9d6d0	add x29,sp,#0x20
00a9d6d4	cbz x3,0x00a9d714
00a9d6d8	lsr x8,x22,#0x1f
00a9d6dc	cbz x8,0x00a9d728
00a9d6e0	bl 0x00c342a0
00a9d6e4	adrp x0,0x29e000
00a9d6e8	adrp x2,0x2cb000
00a9d6ec	add x0,x0,#0x440
00a9d6f0	add x2,x2,#0xc06
00a9d6f4	mov w1,#0xf5
00a9d6f8	bl 0x00c342b0
00a9d6fc	orr w0,wzr,#0xf
00a9d700	orr w1,wzr,#0x70
00a9d704	mov x2,xzr
00a9d708	bl 0x00c342c0
00a9d70c	mov w0,wzr
00a9d710	b 0x00a9d758
00a9d714	mov x0,x19
00a9d718	bl 0x00c2ff50
00a9d71c	mov x22,x0
00a9d720	lsr x8,x22,#0x1f
00a9d724	cbnz x8,0x00a9d6e0
00a9d728	mov x0,x19
00a9d72c	bl 0x00c3e800
00a9d730	mov w5,w0
00a9d734	add x3,x22,#0x1
00a9d738	mov w4,#0x4
00a9d73c	mov x0,x21
00a9d740	mov x1,x20
00a9d744	mov w2,w22
00a9d748	bl 0x00a9d5b4
00a9d74c	cbz x0,0x00a9d758
00a9d750	str x19,[x0, #0x28]
00a9d754	mov w0,#0x1
00a9d758	ldp x29,x30,[sp, #0x20]
00a9d75c	ldp x20,x19,[sp, #0x10]
00a9d760	ldp x22,x21,[sp], #0x30
00a9d764	ret
