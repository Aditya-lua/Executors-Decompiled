; mbedtls_rsa_rsassa_pkcs1_v15_verify @ 00ba89e0
00ba89e0	stp x26,x25,[sp, #-0x50]!
00ba89e4	stp x24,x23,[sp, #0x10]
00ba89e8	stp x22,x21,[sp, #0x20]
00ba89ec	stp x20,x19,[sp, #0x30]
00ba89f0	stp x29,x30,[sp, #0x40]
00ba89f4	add x29,sp,#0x40
00ba89f8	mov x22,x4
00ba89fc	mov x24,x3
00ba8a00	mov w25,w2
00ba8a04	mov w26,w1
00ba8a08	orr w8,w2,w1
00ba8a0c	mov x23,x0
00ba8a10	cbz w8,0x00ba8a20
00ba8a14	cbnz x24,0x00ba8a20
00ba8a18	mov w24,#0xffffbf80
00ba8a1c	b 0x00ba8acc
00ba8a20	ldr x19,[x23, #0x8]
00ba8a24	mov w0,#0x1
00ba8a28	mov x1,x19
00ba8a2c	bl 0x00c30a30
00ba8a30	mov x20,x0
00ba8a34	cbz x0,0x00ba8ac8
00ba8a38	mov w0,#0x1
00ba8a3c	mov x1,x19
00ba8a40	bl 0x00c30a30
00ba8a44	mov x21,x0
00ba8a48	cbz x0,0x00ba8abc
00ba8a4c	mov w0,w26
00ba8a50	mov w1,w25
00ba8a54	mov x2,x24
00ba8a58	mov x3,x19
00ba8a5c	mov x4,x21
00ba8a60	bl 0x00ba8448
00ba8a64	mov w24,w0
00ba8a68	cbnz w0,0x00ba8aa0
00ba8a6c	mov x0,x23
00ba8a70	mov x1,x22
00ba8a74	mov x2,x20
00ba8a78	bl 0x00c43470
00ba8a7c	mov w24,w0
00ba8a80	cbnz w0,0x00ba8aa0
00ba8a84	mov x0,x20
00ba8a88	mov x1,x21
00ba8a8c	mov x2,x19
00ba8a90	bl 0x00c42190
00ba8a94	cmp w0,#0x0
00ba8a98	mov w8,#0xffffbc80
00ba8a9c	csel w24,wzr,w8,eq
00ba8aa0	mov x0,x20
00ba8aa4	mov x1,x19
00ba8aa8	bl 0x00c42230
00ba8aac	mov x0,x21
00ba8ab0	mov x1,x19
00ba8ab4	bl 0x00c42230
00ba8ab8	b 0x00ba8acc
00ba8abc	mov x0,x20
00ba8ac0	mov x1,x19
00ba8ac4	bl 0x00c42230
00ba8ac8	orr w24,wzr,#0xfffffff0
00ba8acc	mov w0,w24
00ba8ad0	ldp x29,x30,[sp, #0x40]
00ba8ad4	ldp x20,x19,[sp, #0x30]
00ba8ad8	ldp x22,x21,[sp, #0x20]
00ba8adc	ldp x24,x23,[sp, #0x10]
00ba8ae0	ldp x26,x25,[sp], #0x50
00ba8ae4	ret
