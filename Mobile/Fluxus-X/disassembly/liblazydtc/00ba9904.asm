; mbedtls_oid_get_pk_alg @ 00ba9904
00ba9904	str x19,[sp, #-0x20]!
00ba9908	stp x29,x30,[sp, #0x10]
00ba990c	add x29,sp,#0x10
00ba9910	mov x19,x1
00ba9914	cbz x0,0x00ba9998
00ba9918	ldr x8,[x0, #0x8]
00ba991c	cmp x8,#0x5
00ba9920	b.eq 0x00ba9958
00ba9924	cmp x8,#0x7
00ba9928	b.eq 0x00ba9980
00ba992c	cmp x8,#0x9
00ba9930	b.ne 0x00ba9998
00ba9934	ldr x1,[x0, #0x10]
00ba9938	adrp x0,0x2a8000
00ba993c	add x0,x0,#0xf78
00ba9940	mov w2,#0x9
00ba9944	bl 0x00c300b0
00ba9948	cbnz w0,0x00ba9998
00ba994c	adrp x8,0xcab000
00ba9950	add x8,x8,#0x690
00ba9954	b 0x00ba99b4
00ba9958	ldr x1,[x0, #0x10]
00ba995c	adrp x0,0x2ba000
00ba9960	add x0,x0,#0xc44
00ba9964	mov w2,#0x5
00ba9968	bl 0x00c300b0
00ba996c	cbnz w0,0x00ba9998
00ba9970	adrp x8,0xcab000
00ba9974	add x8,x8,#0x690
00ba9978	add x8,x8,#0x50
00ba997c	b 0x00ba99b4
00ba9980	ldr x1,[x0, #0x10]
00ba9984	adrp x0,0x2ae000
00ba9988	add x0,x0,#0xd66
00ba998c	orr w2,wzr,#0x7
00ba9990	bl 0x00c300b0
00ba9994	cbz w0,0x00ba99a8
00ba9998	mov w0,#0xffffffd2
00ba999c	ldp x29,x30,[sp, #0x10]
00ba99a0	ldr x19,[sp], #0x20
00ba99a4	ret
00ba99a8	adrp x8,0xcab000
00ba99ac	add x8,x8,#0x690
00ba99b0	add x8,x8,#0x28
00ba99b4	ldr w8,[x8, #0x20]
00ba99b8	mov w0,wzr
00ba99bc	str w8,[x19]
00ba99c0	b 0x00ba999c
