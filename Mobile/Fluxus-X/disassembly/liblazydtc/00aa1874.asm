; OSSL_PROVIDER_load @ 00aa1874
00aa1874	stp x20,x19,[sp, #-0x20]!
00aa1878	stp x29,x30,[sp, #0x10]
00aa187c	add x29,sp,#0x10
00aa1880	mov x19,x1
00aa1884	mov x20,x0
00aa1888	bl 0x00c3ea90
00aa188c	cbz w0,0x00aa18a8
00aa1890	ldp x29,x30,[sp, #0x10]
00aa1894	mov x0,x20
00aa1898	mov x1,x19
00aa189c	mov w2,wzr
00aa18a0	ldp x20,x19,[sp], #0x20
00aa18a4	b 0x00aa1798
00aa18a8	ldp x29,x30,[sp, #0x10]
00aa18ac	mov x0,xzr
00aa18b0	ldp x20,x19,[sp], #0x20
00aa18b4	ret
