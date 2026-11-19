; X509v3_addr_subset @ 00af7b8c
00af7b8c	str x23,[sp, #-0x40]!
00af7b90	stp x20,x19,[sp, #0x20]
00af7b94	mov x20,x0
00af7b98	mov w0,#0x1
00af7b9c	stp x22,x21,[sp, #0x10]
00af7ba0	stp x29,x30,[sp, #0x30]
00af7ba4	add x29,sp,#0x30
00af7ba8	cbz x20,0x00af7d48
00af7bac	mov x19,x1
00af7bb0	cmp x20,x1
00af7bb4	b.eq 0x00af7d48
00af7bb8	cbz x19,0x00af7d44
00af7bbc	mov x0,x20
00af7bc0	bl 0x00c325e0
00af7bc4	cmp w0,#0x1
00af7bc8	b.lt 0x00af7bfc
00af7bcc	mov w21,wzr
00af7bd0	mov x0,x20
00af7bd4	mov w1,w21
00af7bd8	bl 0x00c32610
00af7bdc	ldr x8,[x0, #0x8]
00af7be0	ldr w8,[x8]
00af7be4	cbz w8,0x00af7d44
00af7be8	mov x0,x20
00af7bec	add w21,w21,#0x1
00af7bf0	bl 0x00c325e0
00af7bf4	cmp w21,w0
00af7bf8	b.lt 0x00af7bd0
00af7bfc	mov x0,x19
00af7c00	bl 0x00c325e0
00af7c04	cmp w0,#0x1
00af7c08	b.lt 0x00af7c3c
00af7c0c	mov w21,wzr
00af7c10	mov x0,x19
00af7c14	mov w1,w21
00af7c18	bl 0x00c32610
00af7c1c	ldr x8,[x0, #0x8]
00af7c20	ldr w8,[x8]
00af7c24	cbz w8,0x00af7d44
00af7c28	mov x0,x19
00af7c2c	add w21,w21,#0x1
00af7c30	bl 0x00c325e0
00af7c34	cmp w21,w0
00af7c38	b.lt 0x00af7c10
00af7c3c	adrp x1,0xaf6000
00af7c40	add x1,x1,#0xbf8
00af7c44	mov x0,x19
00af7c48	bl 0x00c34df0
00af7c4c	mov x0,x20
00af7c50	bl 0x00c325e0
00af7c54	cmp w0,#0x1
00af7c58	b.lt 0x00af7d5c
00af7c5c	mov w21,wzr
00af7c60	mov w23,#0x10
00af7c64	mov x0,x20
00af7c68	mov w1,w21
00af7c6c	bl 0x00c32610
00af7c70	mov x22,x0
00af7c74	mov x0,x19
00af7c78	mov x1,x22
00af7c7c	bl 0x00c34760
00af7c80	mov w1,w0
00af7c84	mov x0,x19
00af7c88	bl 0x00c32610
00af7c8c	cbz x0,0x00af7d48
00af7c90	ldr x8,[x22]
00af7c94	ldr w8,[x8]
00af7c98	and w8,w8,#0xfffffffe
00af7c9c	cmp w8,#0x2
00af7ca0	b.ne 0x00af7d44
00af7ca4	ldr x8,[x0]
00af7ca8	ldr w9,[x8]
00af7cac	and w10,w9,#0xfffffffe
00af7cb0	cmp w10,#0x2
00af7cb4	b.ne 0x00af7d44
00af7cb8	ldr x10,[x0, #0x8]
00af7cbc	ldr x11,[x22, #0x8]
00af7cc0	ldr x0,[x10, #0x8]
00af7cc4	ldr x1,[x11, #0x8]
00af7cc8	cbz x8,0x00af7d0c
00af7ccc	cmp w9,#0x2
00af7cd0	b.lt 0x00af7d34
00af7cd4	ldr x8,[x8, #0x8]
00af7cd8	mov w2,wzr
00af7cdc	cbz x8,0x00af7d10
00af7ce0	ldrb w9,[x8]
00af7ce4	ldrb w8,[x8, #0x1]
00af7ce8	bfm w8,w9,#0x18,#0x7
00af7cec	cmp w8,#0x1
00af7cf0	cset w9,eq
00af7cf4	lsl w9,w9,#0x2
00af7cf8	cmp w8,#0x2
00af7cfc	csel w2,w23,w9,eq
00af7d00	bl 0x00af7d64
00af7d04	cbnz w0,0x00af7d18
00af7d08	b 0x00af7d48
00af7d0c	mov w2,wzr
00af7d10	bl 0x00af7d64
00af7d14	cbz w0,0x00af7d48
00af7d18	mov x0,x20
00af7d1c	add w21,w21,#0x1
00af7d20	bl 0x00c325e0
00af7d24	cmp w21,w0
00af7d28	mov w0,#0x1
00af7d2c	b.lt 0x00af7c64
00af7d30	b 0x00af7d48
00af7d34	mov w2,wzr
00af7d38	bl 0x00af7d64
00af7d3c	cbnz w0,0x00af7d18
00af7d40	b 0x00af7d48
00af7d44	mov w0,wzr
00af7d48	ldp x29,x30,[sp, #0x30]
00af7d4c	ldp x20,x19,[sp, #0x20]
00af7d50	ldp x22,x21,[sp, #0x10]
00af7d54	ldr x23,[sp], #0x40
00af7d58	ret
00af7d5c	mov w0,#0x1
00af7d60	b 0x00af7d48
