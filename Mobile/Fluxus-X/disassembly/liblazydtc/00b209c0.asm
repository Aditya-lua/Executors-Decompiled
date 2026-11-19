; ossl_prov_macctx_load_from_params @ 00b209c0
00b209c0	str x25,[sp, #-0x50]!
00b209c4	stp x24,x23,[sp, #0x10]
00b209c8	stp x22,x21,[sp, #0x20]
00b209cc	stp x20,x19,[sp, #0x30]
00b209d0	mov x23,x5
00b209d4	mov x20,x4
00b209d8	mov x21,x3
00b209dc	mov x25,x2
00b209e0	mov x22,x1
00b209e4	mov x19,x0
00b209e8	stp x29,x30,[sp, #0x40]
00b209ec	add x29,sp,#0x40
00b209f0	cbz x2,0x00b20a30
00b209f4	adrp x1,0x2d3000
00b209f8	add x1,x1,#0x7c2
00b209fc	mov x0,x22
00b20a00	bl 0x00c36530
00b20a04	cbz x0,0x00b20a60
00b20a08	ldr w9,[x0, #0x8]
00b20a0c	mov x8,x0
00b20a10	mov w0,wzr
00b20a14	cmp w9,#0x4
00b20a18	b.ne 0x00b20af4
00b20a1c	ldr x24,[x8, #0x10]
00b20a20	cbnz x25,0x00b20a68
00b20a24	ldr x0,[x19]
00b20a28	cbnz x0,0x00b20ab8
00b20a2c	b 0x00b20adc
00b20a30	adrp x1,0x2d4000
00b20a34	add x1,x1,#0x2ff
00b20a38	mov x0,x22
00b20a3c	bl 0x00c36530
00b20a40	cbz x0,0x00b20a98
00b20a44	ldr w9,[x0, #0x8]
00b20a48	mov x8,x0
00b20a4c	mov w0,wzr
00b20a50	cmp w9,#0x4
00b20a54	b.ne 0x00b20af4
00b20a58	ldr x25,[x8, #0x10]
00b20a5c	b 0x00b209f4
00b20a60	mov x24,xzr
00b20a64	cbz x25,0x00b20a24
00b20a68	mov x0,x23
00b20a6c	mov x1,x25
00b20a70	mov x2,x24
00b20a74	bl 0x00c363a0
00b20a78	ldr x8,[x19]
00b20a7c	mov x23,x0
00b20a80	mov x0,x8
00b20a84	bl 0x00c36370
00b20a88	cbz x23,0x00b20aa0
00b20a8c	mov x0,x23
00b20a90	bl 0x00c36390
00b20a94	b 0x00b20aa4
00b20a98	mov x25,xzr
00b20a9c	b 0x00b209f4
00b20aa0	mov x0,xzr
00b20aa4	str x0,[x19]
00b20aa8	mov x0,x23
00b20aac	bl 0x00c363c0
00b20ab0	ldr x0,[x19]
00b20ab4	cbz x0,0x00b20af4
00b20ab8	mov x1,x22
00b20abc	mov x2,x21
00b20ac0	mov x3,x20
00b20ac4	mov x4,xzr
00b20ac8	mov x5,x24
00b20acc	mov x6,xzr
00b20ad0	mov x7,xzr
00b20ad4	bl 0x00b20750
00b20ad8	cbz w0,0x00b20ae4
00b20adc	mov w0,#0x1
00b20ae0	b 0x00b20af4
00b20ae4	ldr x0,[x19]
00b20ae8	bl 0x00c36370
00b20aec	mov w0,wzr
00b20af0	str xzr,[x19]
00b20af4	ldp x29,x30,[sp, #0x40]
00b20af8	ldp x20,x19,[sp, #0x30]
00b20afc	ldp x22,x21,[sp, #0x20]
00b20b00	ldp x24,x23,[sp, #0x10]
00b20b04	ldr x25,[sp], #0x50
00b20b08	ret
