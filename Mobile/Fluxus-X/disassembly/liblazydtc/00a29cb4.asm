; ossl_ec_GF2m_simple_group_copy @ 00a29cb4
00a29cb4	stp x20,x19,[sp, #-0x20]!
00a29cb8	stp x29,x30,[sp, #0x10]
00a29cbc	mov x20,x1
00a29cc0	mov x19,x0
00a29cc4	ldr x0,[x0, #0x40]
00a29cc8	ldr x1,[x1, #0x40]
00a29ccc	add x29,sp,#0x10
00a29cd0	bl 0x00c36990
00a29cd4	cbz x0,0x00a29d80
00a29cd8	ldr x0,[x19, #0x60]
00a29cdc	ldr x1,[x20, #0x60]
00a29ce0	bl 0x00c36990
00a29ce4	cbz x0,0x00a29d80
00a29ce8	ldr x0,[x19, #0x68]
00a29cec	ldr x1,[x20, #0x68]
00a29cf0	bl 0x00c36990
00a29cf4	cbz x0,0x00a29d80
00a29cf8	ldr w8,[x20, #0x48]
00a29cfc	ldr x0,[x19, #0x60]
00a29d00	str w8,[x19, #0x48]
00a29d04	ldr w9,[x20, #0x4c]
00a29d08	str w9,[x19, #0x4c]
00a29d0c	ldr w9,[x20, #0x50]
00a29d10	str w9,[x19, #0x50]
00a29d14	ldr w9,[x20, #0x54]
00a29d18	str w9,[x19, #0x54]
00a29d1c	ldr w9,[x20, #0x58]
00a29d20	str w9,[x19, #0x58]
00a29d24	add w9,w8,#0x3f
00a29d28	ldr w10,[x20, #0x5c]
00a29d2c	add w8,w8,#0x7e
00a29d30	cmp w9,#0x0
00a29d34	csel w8,w8,w9,lt
00a29d38	asr w1,w8,#0x6
00a29d3c	str w10,[x19, #0x5c]
00a29d40	bl 0x00c38e80
00a29d44	cbz x0,0x00a29d80
00a29d48	ldr w8,[x19, #0x48]
00a29d4c	ldr x0,[x19, #0x68]
00a29d50	add w9,w8,#0x3f
00a29d54	add w8,w8,#0x7e
00a29d58	cmp w9,#0x0
00a29d5c	csel w8,w8,w9,lt
00a29d60	asr w1,w8,#0x6
00a29d64	bl 0x00c38e80
00a29d68	cbz x0,0x00a29d80
00a29d6c	ldr x0,[x19, #0x60]
00a29d70	bl 0x00c38c00
00a29d74	ldr x0,[x19, #0x68]
00a29d78	bl 0x00c38c00
00a29d7c	mov w0,#0x1
00a29d80	ldp x29,x30,[sp, #0x10]
00a29d84	ldp x20,x19,[sp], #0x20
00a29d88	ret
