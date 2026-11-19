; OSSL_PARAM_BLD_push_octet_string @ 00a9d814
00a9d814	stp x22,x21,[sp, #-0x30]!
00a9d818	lsr x8,x3,#0x1f
00a9d81c	stp x20,x19,[sp, #0x10]
00a9d820	stp x29,x30,[sp, #0x20]
00a9d824	add x29,sp,#0x20
00a9d828	cbz x8,0x00a9d860
00a9d82c	bl 0x00c342a0
00a9d830	adrp x0,0x29e000
00a9d834	adrp x2,0x2b2000
00a9d838	add x0,x0,#0x440
00a9d83c	add x2,x2,#0x51a
00a9d840	mov w1,#0x119
00a9d844	bl 0x00c342b0
00a9d848	orr w0,wzr,#0xf
00a9d84c	orr w1,wzr,#0x70
00a9d850	mov x2,xzr
00a9d854	bl 0x00c342c0
00a9d858	mov w0,wzr
00a9d85c	b 0x00a9d8a0
00a9d860	mov x22,x0
00a9d864	mov x0,x2
00a9d868	mov x20,x3
00a9d86c	mov x19,x2
00a9d870	mov x21,x1
00a9d874	bl 0x00c3e800
00a9d878	mov w5,w0
00a9d87c	mov w4,#0x5
00a9d880	mov x0,x22
00a9d884	mov x1,x21
00a9d888	mov w2,w20
00a9d88c	mov x3,x20
00a9d890	bl 0x00a9d5b4
00a9d894	cbz x0,0x00a9d8a0
00a9d898	str x19,[x0, #0x28]
00a9d89c	mov w0,#0x1
00a9d8a0	ldp x29,x30,[sp, #0x20]
00a9d8a4	ldp x20,x19,[sp, #0x10]
00a9d8a8	ldp x22,x21,[sp], #0x30
00a9d8ac	ret
