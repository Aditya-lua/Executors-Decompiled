; ossl_cipher_cbc_cts_block_update @ 00b2b91c
00b2b91c	sub sp,sp,#0xa0
00b2b920	stp x20,x19,[sp, #0x80]
00b2b924	mov x20,x0
00b2b928	cmp x5,#0x10
00b2b92c	mov w0,wzr
00b2b930	str x27,[sp, #0x40]
00b2b934	stp x26,x25,[sp, #0x50]
00b2b938	stp x24,x23,[sp, #0x60]
00b2b93c	stp x22,x21,[sp, #0x70]
00b2b940	stp x29,x30,[sp, #0x90]
00b2b944	add x29,sp,#0x90
00b2b948	b.cc 0x00b2bcb8
00b2b94c	mov x21,x5
00b2b950	cmp x3,x5
00b2b954	b.cc 0x00b2bcb8
00b2b958	mov x19,x2
00b2b95c	mov x22,x1
00b2b960	cbz x1,0x00b2bcb0
00b2b964	ldrb w9,[x20, #0x6c]
00b2b968	mov w0,wzr
00b2b96c	tbnz w9,#0x4,0x00b2bcb8
00b2b970	ldr w8,[x20, #0x68]
00b2b974	mov x23,x4
00b2b978	tbnz w9,#0x1,0x00b2b9bc
00b2b97c	cbz w8,0x00b2ba20
00b2b980	cmp w8,#0x2
00b2b984	b.eq 0x00b2b99c
00b2b988	cmp w8,#0x1
00b2b98c	mov w0,wzr
00b2b990	b.ne 0x00b2bcb8
00b2b994	tst x21,#0xf
00b2b998	b.eq 0x00b2bbbc
00b2b99c	mov x0,x20
00b2b9a0	mov x1,x23
00b2b9a4	mov x2,x22
00b2b9a8	mov x3,x21
00b2b9ac	bl 0x00b2bcf4
00b2b9b0	mov x21,x0
00b2b9b4	cbnz x21,0x00b2bca4
00b2b9b8	b 0x00b2bce0
00b2b9bc	cbz w8,0x00b2bb1c
00b2b9c0	cmp w8,#0x2
00b2b9c4	b.eq 0x00b2bb98
00b2b9c8	cmp w8,#0x1
00b2b9cc	mov w0,wzr
00b2b9d0	b.ne 0x00b2bcb8
00b2b9d4	ands x24,x21,#0xf
00b2b9d8	b.eq 0x00b2bbbc
00b2b9dc	cmp x21,#0x10
00b2b9e0	b.eq 0x00b2bba0
00b2b9e4	ldr x8,[x20, #0xa8]
00b2b9e8	sub x25,x21,x24
00b2b9ec	mov x0,x20
00b2b9f0	mov x1,x22
00b2b9f4	ldr x8,[x8, #0x8]
00b2b9f8	mov x2,x23
00b2b9fc	mov x3,x25
00b2ba00	blr x8
00b2ba04	cbz w0,0x00b2bcd8
00b2ba08	mov w8,#0x10
00b2ba0c	add x23,x23,x25
00b2ba10	add x22,x22,x25
00b2ba14	add x9,sp,#0x30
00b2ba18	sub x2,x8,x24
00b2ba1c	b 0x00b2bc4c
00b2ba20	ands x24,x21,#0xf
00b2ba24	b.eq 0x00b2bbe0
00b2ba28	orr x8,x24,#0x10
00b2ba2c	subs x25,x21,x8
00b2ba30	b.eq 0x00b2ba5c
00b2ba34	ldr x8,[x20, #0xa8]
00b2ba38	mov x0,x20
00b2ba3c	mov x1,x22
00b2ba40	mov x2,x23
00b2ba44	ldr x8,[x8, #0x8]
00b2ba48	mov x3,x25
00b2ba4c	blr x8
00b2ba50	cbz w0,0x00b2bcd8
00b2ba54	add x23,x23,x25
00b2ba58	add x22,x22,x25
00b2ba5c	ldr q0,[x20, #0x20]
00b2ba60	add x2,x23,x24
00b2ba64	mov x1,sp
00b2ba68	mov w3,#0x10
00b2ba6c	str q0,[sp, #0x30]
00b2ba70	ldr q0,[x2]
00b2ba74	mov x0,x20
00b2ba78	mov x26,sp
00b2ba7c	str q0,[sp, #0x10]
00b2ba80	ldr x8,[x20, #0xa8]
00b2ba84	stp xzr,xzr,[x20, #0x20]
00b2ba88	ldr x8,[x8, #0x8]
00b2ba8c	blr x8
00b2ba90	cbz w0,0x00b2bcd8
00b2ba94	add x0,sp,#0x20
00b2ba98	mov x1,x23
00b2ba9c	mov x2,x24
00b2baa0	add x25,x20,#0x20
00b2baa4	add x27,sp,#0x20
00b2baa8	bl 0x00c2ffd0
00b2baac	mov w8,#0x10
00b2bab0	add x0,x27,x24
00b2bab4	add x1,x26,x24
00b2bab8	sub x2,x8,x24
00b2babc	bl 0x00c2ffd0
00b2bac0	mov x8,xzr
00b2bac4	ldrb w9,[x27, x8]
00b2bac8	ldrb w10,[x26, x8]
00b2bacc	add x11,x22,x8
00b2bad0	add x8,x8,#0x1
00b2bad4	cmp x24,x8
00b2bad8	eor w9,w10,w9
00b2badc	strb w9,[x11, #0x10]
00b2bae0	b.ne 0x00b2bac4
00b2bae4	ldr q0,[sp, #0x30]
00b2bae8	add x2,sp,#0x20
00b2baec	mov w3,#0x10
00b2baf0	mov x0,x20
00b2baf4	str q0,[x25]
00b2baf8	ldr x8,[x20, #0xa8]
00b2bafc	mov x1,x22
00b2bb00	ldr x8,[x8, #0x8]
00b2bb04	blr x8
00b2bb08	cbz w0,0x00b2bcd8
00b2bb0c	ldr q0,[sp, #0x10]
00b2bb10	str q0,[x25]
00b2bb14	cbnz x21,0x00b2bca4
00b2bb18	b 0x00b2bce0
00b2bb1c	ldr x8,[x20, #0xa8]
00b2bb20	and x24,x21,#0xf
00b2bb24	sub x25,x21,x24
00b2bb28	mov x0,x20
00b2bb2c	ldr x8,[x8, #0x8]
00b2bb30	mov x1,x22
00b2bb34	mov x2,x23
00b2bb38	mov x3,x25
00b2bb3c	blr x8
00b2bb40	cbz w0,0x00b2bcd8
00b2bb44	cbz x24,0x00b2bce8
00b2bb48	mov w8,#0x10
00b2bb4c	add x9,sp,#0x30
00b2bb50	sub x2,x8,x24
00b2bb54	add x0,x9,x24
00b2bb58	mov w1,wzr
00b2bb5c	add x23,x23,x25
00b2bb60	add x22,x22,x25
00b2bb64	bl 0x00c301c0
00b2bb68	add x0,sp,#0x30
00b2bb6c	mov x1,x23
00b2bb70	mov x2,x24
00b2bb74	bl 0x00c2ffd0
00b2bb78	ldr x8,[x20, #0xa8]
00b2bb7c	add x9,x22,x24
00b2bb80	sub x1,x9,#0x10
00b2bb84	add x2,sp,#0x30
00b2bb88	ldr x8,[x8, #0x8]
00b2bb8c	mov w3,#0x10
00b2bb90	mov x0,x20
00b2bb94	b 0x00b2bc94
00b2bb98	cmp x21,#0x10
00b2bb9c	b.ne 0x00b2bbfc
00b2bba0	ldr x8,[x20, #0xa8]
00b2bba4	mov w3,#0x10
00b2bba8	mov x0,x20
00b2bbac	mov x1,x22
00b2bbb0	ldr x8,[x8, #0x8]
00b2bbb4	mov x2,x23
00b2bbb8	b 0x00b2bc94
00b2bbbc	ldr x8,[x20, #0xa8]
00b2bbc0	mov x0,x20
00b2bbc4	mov x1,x22
00b2bbc8	mov x2,x23
00b2bbcc	ldr x8,[x8, #0x8]
00b2bbd0	mov x3,x21
00b2bbd4	blr x8
00b2bbd8	cbnz w0,0x00b2bca4
00b2bbdc	b 0x00b2bcb8
00b2bbe0	ldr x8,[x20, #0xa8]
00b2bbe4	mov x0,x20
00b2bbe8	mov x1,x22
00b2bbec	mov x2,x23
00b2bbf0	ldr x8,[x8, #0x8]
00b2bbf4	mov x3,x21
00b2bbf8	b 0x00b2bc94
00b2bbfc	ldr x8,[x20, #0xa8]
00b2bc00	and x26,x21,#0xf
00b2bc04	tst x21,#0xf
00b2bc08	mov w9,#0x10
00b2bc0c	ldr x8,[x8, #0x8]
00b2bc10	csel x24,x9,x26,eq
00b2bc14	sub x25,x21,x24
00b2bc18	mov x0,x20
00b2bc1c	mov x1,x22
00b2bc20	mov x2,x23
00b2bc24	mov x3,x25
00b2bc28	blr x8
00b2bc2c	cbz w0,0x00b2bcd8
00b2bc30	mov w8,#0x10
00b2bc34	cmp x26,#0x0
00b2bc38	sub x8,x8,x26
00b2bc3c	add x23,x23,x25
00b2bc40	add x22,x22,x25
00b2bc44	add x9,sp,#0x30
00b2bc48	csel x2,xzr,x8,eq
00b2bc4c	add x0,x9,x24
00b2bc50	mov w1,wzr
00b2bc54	bl 0x00c301c0
00b2bc58	add x0,sp,#0x30
00b2bc5c	mov x1,x23
00b2bc60	mov x2,x24
00b2bc64	bl 0x00c2ffd0
00b2bc68	sub x23,x22,#0x10
00b2bc6c	mov x0,x22
00b2bc70	mov x1,x23
00b2bc74	mov x2,x24
00b2bc78	bl 0x00c2ffd0
00b2bc7c	ldr x8,[x20, #0xa8]
00b2bc80	add x2,sp,#0x30
00b2bc84	mov w3,#0x10
00b2bc88	mov x0,x20
00b2bc8c	ldr x8,[x8, #0x8]
00b2bc90	mov x1,x23
00b2bc94	blr x8
00b2bc98	cmp w0,#0x0
00b2bc9c	csel x21,xzr,x21,eq
00b2bca0	cbz x21,0x00b2bce0
00b2bca4	ldrb w8,[x20, #0x6c]
00b2bca8	orr w8,w8,#0x10
00b2bcac	strb w8,[x20, #0x6c]
00b2bcb0	str x21,[x19]
00b2bcb4	mov w0,#0x1
00b2bcb8	ldp x29,x30,[sp, #0x90]
00b2bcbc	ldp x20,x19,[sp, #0x80]
00b2bcc0	ldp x22,x21,[sp, #0x70]
00b2bcc4	ldp x24,x23,[sp, #0x60]
00b2bcc8	ldp x26,x25,[sp, #0x50]
00b2bccc	ldr x27,[sp, #0x40]
00b2bcd0	add sp,sp,#0xa0
00b2bcd4	ret
00b2bcd8	mov x21,xzr
00b2bcdc	cbnz x21,0x00b2bca4
00b2bce0	mov w0,wzr
00b2bce4	b 0x00b2bcb8
00b2bce8	mov x21,x25
00b2bcec	cbnz x21,0x00b2bca4
00b2bcf0	b 0x00b2bce0
