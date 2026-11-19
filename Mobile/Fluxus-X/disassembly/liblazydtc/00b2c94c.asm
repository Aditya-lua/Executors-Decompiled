; ossl_tdes_get_ctx_params @ 00b2c94c
00b2c94c	str x21,[sp, #-0x30]!
00b2c950	stp x20,x19,[sp, #0x10]
00b2c954	stp x29,x30,[sp, #0x20]
00b2c958	add x29,sp,#0x20
00b2c95c	mov x19,x1
00b2c960	mov x21,x0
00b2c964	bl 0x00c41260
00b2c968	cbz w0,0x00b2ca08
00b2c96c	adrp x1,0x2c9000
00b2c970	add x1,x1,#0x8ae
00b2c974	mov x0,x19
00b2c978	bl 0x00c3e8c0
00b2c97c	cbz x0,0x00b2c9d0
00b2c980	ldr x19,[x21, #0x48]
00b2c984	cbz x19,0x00b2c9d8
00b2c988	ldr x20,[x0, #0x10]
00b2c98c	ldr x0,[x21, #0xb8]
00b2c990	mov x2,x19
00b2c994	mov w3,wzr
00b2c998	mov x1,x20
00b2c99c	bl 0x00c358b0
00b2c9a0	cmp w0,#0x1
00b2c9a4	b.lt 0x00b2c9d8
00b2c9a8	mov x0,x20
00b2c9ac	bl 0x00c320a0
00b2c9b0	cmp x19,#0x10
00b2c9b4	b.cc 0x00b2c9d0
00b2c9b8	add x0,x20,#0x8
00b2c9bc	bl 0x00c320a0
00b2c9c0	cmp x19,#0x18
00b2c9c4	b.cc 0x00b2c9d0
00b2c9c8	add x0,x20,#0x10
00b2c9cc	bl 0x00c320a0
00b2c9d0	mov w0,#0x1
00b2c9d4	b 0x00b2ca08
00b2c9d8	bl 0x00c342a0
00b2c9dc	adrp x0,0x2a4000
00b2c9e0	adrp x2,0x2d4000
00b2c9e4	add x0,x0,#0xdfc
00b2c9e8	add x2,x2,#0x7a9
00b2c9ec	mov w1,#0x91
00b2c9f0	bl 0x00c342b0
00b2c9f4	mov w0,#0x39
00b2c9f8	mov w1,#0x79
00b2c9fc	mov x2,xzr
00b2ca00	bl 0x00c342c0
00b2ca04	mov w0,wzr
00b2ca08	ldp x29,x30,[sp, #0x20]
00b2ca0c	ldp x20,x19,[sp, #0x10]
00b2ca10	ldr x21,[sp], #0x30
00b2ca14	ret
