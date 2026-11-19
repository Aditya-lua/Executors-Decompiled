; ossl_ccm_generic_auth_encrypt @ 00b671a8
00b671a8	str x21,[sp, #-0x30]!
00b671ac	stp x20,x19,[sp, #0x10]
00b671b0	stp x29,x30,[sp, #0x20]
00b671b4	mov x20,x4
00b671b8	ldr x4,[x0, #0x88]
00b671bc	add x21,x0,#0x50
00b671c0	mov x19,x5
00b671c4	mov x0,x21
00b671c8	add x29,sp,#0x20
00b671cc	cbz x4,0x00b671d8
00b671d0	bl 0x00c3e2a0
00b671d4	b 0x00b671dc
00b671d8	bl 0x00c3e290
00b671dc	cmp w0,#0x0
00b671e0	cset w8,eq
00b671e4	cbz x20,0x00b67204
00b671e8	cbnz w0,0x00b67204
00b671ec	mov x0,x21
00b671f0	mov x1,x20
00b671f4	mov x2,x19
00b671f8	bl 0x00c3e2d0
00b671fc	cmp x0,#0x0
00b67200	cset w8,ne
00b67204	ldp x29,x30,[sp, #0x20]
00b67208	ldp x20,x19,[sp, #0x10]
00b6720c	mov w0,w8
00b67210	ldr x21,[sp], #0x30
00b67214	ret
