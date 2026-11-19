; EVP_read_pw_string_min @ 00ab7b54
00ab7b54	str x28,[sp, #-0x50]!
00ab7b58	stp x24,x23,[sp, #0x10]
00ab7b5c	stp x22,x21,[sp, #0x20]
00ab7b60	stp x20,x19,[sp, #0x30]
00ab7b64	stp x29,x30,[sp, #0x40]
00ab7b68	add x29,sp,#0x40
00ab7b6c	sub sp,sp,#0x400
00ab7b70	adrp x8,0xd22000
00ab7b74	add x8,x8,#0x1a0
00ab7b78	ldrb w9,[x8]
00ab7b7c	mov w23,w4
00ab7b80	mov w24,w2
00ab7b84	mov w21,w1
00ab7b88	cmp w9,#0x0
00ab7b8c	ccmp x3,#0x0,#0x0,ne
00ab7b90	mov x20,x0
00ab7b94	csel x22,x3,x8,ne
00ab7b98	bl 0x00c3e9f0
00ab7b9c	cbz x0,0x00ab7c10
00ab7ba0	cmp w24,#0x3ff
00ab7ba4	orr w8,wzr,#0x3ff
00ab7ba8	csel w24,w24,w8,lt
00ab7bac	mov x1,x22
00ab7bb0	mov w2,wzr
00ab7bb4	mov x3,x20
00ab7bb8	mov w4,w21
00ab7bbc	mov w5,w24
00ab7bc0	mov x19,x0
00ab7bc4	bl 0x00c3e990
00ab7bc8	tbnz w0,#0x1f,0x00ab7c18
00ab7bcc	cbz w23,0x00ab7bf4
00ab7bd0	mov x3,sp
00ab7bd4	mov x0,x19
00ab7bd8	mov x1,x22
00ab7bdc	mov w2,wzr
00ab7be0	mov w4,w21
00ab7be4	mov w5,w24
00ab7be8	mov x6,x20
00ab7bec	bl 0x00c3e9b0
00ab7bf0	tbnz w0,#0x1f,0x00ab7c18
00ab7bf4	mov x0,x19
00ab7bf8	bl 0x00c3ea00
00ab7bfc	mov w20,w0
00ab7c00	mov x0,sp
00ab7c04	mov w1,#0x400
00ab7c08	bl 0x00c34750
00ab7c0c	b 0x00ab7c1c
00ab7c10	mov w20,#0xffffffff
00ab7c14	b 0x00ab7c24
00ab7c18	mov w20,#0xffffffff
00ab7c1c	mov x0,x19
00ab7c20	bl 0x00c3e9d0
00ab7c24	mov w0,w20
00ab7c28	add sp,sp,#0x400
00ab7c2c	ldp x29,x30,[sp, #0x40]
00ab7c30	ldp x20,x19,[sp, #0x30]
00ab7c34	ldp x22,x21,[sp, #0x20]
00ab7c38	ldp x24,x23,[sp, #0x10]
00ab7c3c	ldr x28,[sp], #0x50
00ab7c40	ret
