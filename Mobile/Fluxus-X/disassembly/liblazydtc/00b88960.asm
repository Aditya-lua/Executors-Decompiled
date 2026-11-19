; psa_mac_compute @ 00b88960
00b88960	str x27,[sp, #-0x60]!
00b88964	stp x26,x25,[sp, #0x10]
00b88968	stp x24,x23,[sp, #0x20]
00b8896c	stp x22,x21,[sp, #0x30]
00b88970	stp x20,x19,[sp, #0x40]
00b88974	stp x29,x30,[sp, #0x50]
00b88978	add x29,sp,#0x50
00b8897c	mov x20,x6
00b88980	mov x21,x5
00b88984	mov x19,x4
00b88988	mov x22,x3
00b8898c	mov x26,x2
00b88990	mov w23,w1
00b88994	mov w25,w0
00b88998	cbz x3,0x00b889d4
00b8899c	mov w1,#0x1
00b889a0	mov x0,x22
00b889a4	bl 0x00c30a30
00b889a8	mov x24,x0
00b889ac	cbz x0,0x00b88a4c
00b889b0	mov x0,x24
00b889b4	mov x1,x26
00b889b8	mov x2,x22
00b889bc	bl 0x00c2ffd0
00b889c0	cbnz x21,0x00b889dc
00b889c4	mov x27,xzr
00b889c8	mov x26,xzr
00b889cc	mov x19,xzr
00b889d0	b 0x00b889f4
00b889d4	mov x24,xzr
00b889d8	cbz x21,0x00b889c4
00b889dc	mov w1,#0x1
00b889e0	mov x0,x21
00b889e4	bl 0x00c30a30
00b889e8	mov x26,x0
00b889ec	mov x27,x21
00b889f0	cbz x0,0x00b88a4c
00b889f4	mov w7,#0x1
00b889f8	mov w0,w25
00b889fc	mov w1,w23
00b88a00	mov x2,x24
00b88a04	mov x3,x22
00b88a08	mov x4,x26
00b88a0c	mov x5,x21
00b88a10	mov x6,x20
00b88a14	bl 0x00b88a80
00b88a18	mov w20,w0
00b88a1c	mov x0,x24
00b88a20	bl 0x00c30960
00b88a24	cbz x26,0x00b88a60
00b88a28	cbz x19,0x00b88a5c
00b88a2c	cbz x27,0x00b88a40
00b88a30	mov x0,x19
00b88a34	mov x1,x26
00b88a38	mov x2,x27
00b88a3c	bl 0x00c2ffd0
00b88a40	mov x0,x26
00b88a44	bl 0x00c30960
00b88a48	b 0x00b88a60
00b88a4c	mov x0,x24
00b88a50	bl 0x00c30960
00b88a54	mov w20,#0xffffff73
00b88a58	b 0x00b88a60
00b88a5c	mov w20,#0xffffff69
00b88a60	mov w0,w20
00b88a64	ldp x29,x30,[sp, #0x50]
00b88a68	ldp x20,x19,[sp, #0x40]
00b88a6c	ldp x22,x21,[sp, #0x30]
00b88a70	ldp x24,x23,[sp, #0x20]
00b88a74	ldp x26,x25,[sp, #0x10]
00b88a78	ldr x27,[sp], #0x60
00b88a7c	ret
