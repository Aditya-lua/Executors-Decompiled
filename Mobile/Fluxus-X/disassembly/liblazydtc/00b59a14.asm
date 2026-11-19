; ossl_drbg_get_ctx_params @ 00b59a14
00b59a14	stp x20,x19,[sp, #-0x20]!
00b59a18	mov x20,x1
00b59a1c	adrp x1,0x2ae000
00b59a20	mov x19,x0
00b59a24	add x1,x1,#0x5d4
00b59a28	mov x0,x20
00b59a2c	stp x29,x30,[sp, #0x10]
00b59a30	add x29,sp,#0x10
00b59a34	bl 0x00c3e8c0
00b59a38	cbz x0,0x00b59a48
00b59a3c	ldr w1,[x19, #0xf0]
00b59a40	bl 0x00c3da90
00b59a44	cbz w0,0x00b59bcc
00b59a48	adrp x1,0x29e000
00b59a4c	add x1,x1,#0x95d
00b59a50	mov x0,x20
00b59a54	bl 0x00c3e8c0
00b59a58	cbz x0,0x00b59a68
00b59a5c	ldr w1,[x19, #0x80]
00b59a60	bl 0x00c3da90
00b59a64	cbz w0,0x00b59bcc
00b59a68	adrp x1,0x2bc000
00b59a6c	add x1,x1,#0x3b2
00b59a70	mov x0,x20
00b59a74	bl 0x00c3e8c0
00b59a78	cbz x0,0x00b59a88
00b59a7c	ldr x1,[x19, #0x88]
00b59a80	bl 0x00c3e950
00b59a84	cbz w0,0x00b59bcc
00b59a88	adrp x1,0x2c8000
00b59a8c	add x1,x1,#0x780
00b59a90	mov x0,x20
00b59a94	bl 0x00c3e8c0
00b59a98	cbz x0,0x00b59aa8
00b59a9c	ldr x1,[x19, #0x90]
00b59aa0	bl 0x00c3e950
00b59aa4	cbz w0,0x00b59bcc
00b59aa8	adrp x1,0x29e000
00b59aac	add x1,x1,#0xf77
00b59ab0	mov x0,x20
00b59ab4	bl 0x00c3e8c0
00b59ab8	cbz x0,0x00b59ac8
00b59abc	ldr x1,[x19, #0x98]
00b59ac0	bl 0x00c3e950
00b59ac4	cbz w0,0x00b59bcc
00b59ac8	adrp x1,0x2ac000
00b59acc	add x1,x1,#0xb58
00b59ad0	mov x0,x20
00b59ad4	bl 0x00c3e8c0
00b59ad8	cbz x0,0x00b59ae8
00b59adc	ldr x1,[x19, #0xa0]
00b59ae0	bl 0x00c3e950
00b59ae4	cbz w0,0x00b59bcc
00b59ae8	adrp x1,0x2ba000
00b59aec	add x1,x1,#0xb52
00b59af0	mov x0,x20
00b59af4	bl 0x00c3e8c0
00b59af8	cbz x0,0x00b59b08
00b59afc	ldr x1,[x19, #0xa8]
00b59b00	bl 0x00c3e950
00b59b04	cbz w0,0x00b59bcc
00b59b08	adrp x1,0x2b0000
00b59b0c	add x1,x1,#0xed7
00b59b10	mov x0,x20
00b59b14	bl 0x00c3e8c0
00b59b18	cbz x0,0x00b59b28
00b59b1c	ldr x1,[x19, #0xb0]
00b59b20	bl 0x00c3e950
00b59b24	cbz w0,0x00b59bcc
00b59b28	adrp x1,0x2d0000
00b59b2c	add x1,x1,#0x8ff
00b59b30	mov x0,x20
00b59b34	bl 0x00c3e8c0
00b59b38	cbz x0,0x00b59b48
00b59b3c	ldr x1,[x19, #0xb8]
00b59b40	bl 0x00c3e950
00b59b44	cbz w0,0x00b59bcc
00b59b48	adrp x1,0x2ce000
00b59b4c	add x1,x1,#0x281
00b59b50	mov x0,x20
00b59b54	bl 0x00c3e8c0
00b59b58	cbz x0,0x00b59b68
00b59b5c	ldr w1,[x19, #0xc4]
00b59b60	bl 0x00c3dac0
00b59b64	cbz w0,0x00b59bcc
00b59b68	adrp x1,0x2d0000
00b59b6c	add x1,x1,#0x90b
00b59b70	mov x0,x20
00b59b74	bl 0x00c3e8c0
00b59b78	cbz x0,0x00b59b88
00b59b7c	ldr x1,[x19, #0xc8]
00b59b80	bl 0x00c3e960
00b59b84	cbz w0,0x00b59bcc
00b59b88	adrp x1,0x2c6000
00b59b8c	add x1,x1,#0x228
00b59b90	mov x0,x20
00b59b94	bl 0x00c3e8c0
00b59b98	cbz x0,0x00b59ba8
00b59b9c	ldr x1,[x19, #0xd0]
00b59ba0	bl 0x00c3e960
00b59ba4	cbz w0,0x00b59bcc
00b59ba8	adrp x1,0x2a4000
00b59bac	add x1,x1,#0xf8a
00b59bb0	mov x0,x20
00b59bb4	bl 0x00c3e8c0
00b59bb8	cbz x0,0x00b59bc8
00b59bbc	ldr w1,[x19, #0xd8]
00b59bc0	bl 0x00c3dac0
00b59bc4	cbz w0,0x00b59bcc
00b59bc8	mov w0,#0x1
00b59bcc	ldp x29,x30,[sp, #0x10]
00b59bd0	ldp x20,x19,[sp], #0x20
00b59bd4	ret
