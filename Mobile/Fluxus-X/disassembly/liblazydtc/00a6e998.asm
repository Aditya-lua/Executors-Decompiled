; EVP_PKEY_digestsign_supports_digest @ 00a6e998
00a6e998	str x23,[sp, #-0x40]!
00a6e99c	stp x22,x21,[sp, #0x10]
00a6e9a0	stp x20,x19,[sp, #0x20]
00a6e9a4	stp x29,x30,[sp, #0x30]
00a6e9a8	add x29,sp,#0x30
00a6e9ac	mov x20,x3
00a6e9b0	mov x23,x2
00a6e9b4	mov x22,x1
00a6e9b8	mov x21,x0
00a6e9bc	bl 0x00c31fa0
00a6e9c0	cbz x0,0x00a6ea04
00a6e9c4	mov x19,x0
00a6e9c8	bl 0x00c35250
00a6e9cc	mov x0,x19
00a6e9d0	mov x1,xzr
00a6e9d4	mov x2,x23
00a6e9d8	mov x3,x22
00a6e9dc	mov x4,x20
00a6e9e0	mov x5,x21
00a6e9e4	mov x6,xzr
00a6e9e8	bl 0x00c361d0
00a6e9ec	mov w20,w0
00a6e9f0	bl 0x00c35240
00a6e9f4	mov x0,x19
00a6e9f8	bl 0x00c31f90
00a6e9fc	mov w0,w20
00a6ea00	b 0x00a6ea08
00a6ea04	mov w0,#0xffffffff
00a6ea08	ldp x29,x30,[sp, #0x30]
00a6ea0c	ldp x20,x19,[sp, #0x20]
00a6ea10	ldp x22,x21,[sp, #0x10]
00a6ea14	ldr x23,[sp], #0x40
00a6ea18	ret
