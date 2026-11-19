; OSSL_STORE_INFO_get1_CRL @ 00aea940
00aea940	str x19,[sp, #-0x20]!
00aea944	stp x29,x30,[sp, #0x10]
00aea948	ldr w8,[x0]
00aea94c	add x29,sp,#0x10
00aea950	cmp w8,#0x6
00aea954	b.ne 0x00aea96c
00aea958	mov x19,x0
00aea95c	ldr x0,[x0, #0x8]
00aea960	bl 0x00c3f810
00aea964	ldr x0,[x19, #0x8]
00aea968	b 0x00aea99c
00aea96c	bl 0x00c342a0
00aea970	adrp x0,0x2c2000
00aea974	adrp x2,0x2d4000
00aea978	add x0,x0,#0x3bd
00aea97c	add x2,x2,#0x428
00aea980	mov w1,#0x2fa
00aea984	bl 0x00c342b0
00aea988	mov w0,#0x2c
00aea98c	mov w1,#0x65
00aea990	mov x2,xzr
00aea994	bl 0x00c342c0
00aea998	mov x0,xzr
00aea99c	ldp x29,x30,[sp, #0x10]
00aea9a0	ldr x19,[sp], #0x20
00aea9a4	ret
