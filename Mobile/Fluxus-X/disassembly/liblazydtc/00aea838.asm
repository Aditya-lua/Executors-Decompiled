; OSSL_STORE_INFO_get1_PKEY @ 00aea838
00aea838	str x19,[sp, #-0x20]!
00aea83c	stp x29,x30,[sp, #0x10]
00aea840	ldr w8,[x0]
00aea844	add x29,sp,#0x10
00aea848	cmp w8,#0x4
00aea84c	b.ne 0x00aea864
00aea850	mov x19,x0
00aea854	ldr x0,[x0, #0x8]
00aea858	bl 0x00c34730
00aea85c	ldr x0,[x19, #0x8]
00aea860	b 0x00aea894
00aea864	bl 0x00c342a0
00aea868	adrp x0,0x2c2000
00aea86c	adrp x2,0x2d0000
00aea870	add x0,x0,#0x3bd
00aea874	add x2,x2,#0x3da
00aea878	mov w1,#0x2d8
00aea87c	bl 0x00c342b0
00aea880	mov w0,#0x2c
00aea884	mov w1,#0x66
00aea888	mov x2,xzr
00aea88c	bl 0x00c342c0
00aea890	mov x0,xzr
00aea894	ldp x29,x30,[sp, #0x10]
00aea898	ldr x19,[sp], #0x20
00aea89c	ret
