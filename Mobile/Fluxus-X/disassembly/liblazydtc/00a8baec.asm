; FUN_00a8baec @ 00a8baec
00a8baec	sub sp,sp,#0x60
00a8baf0	str x25,[sp, #0x10]
00a8baf4	stp x24,x23,[sp, #0x20]
00a8baf8	stp x22,x21,[sp, #0x30]
00a8bafc	stp x20,x19,[sp, #0x40]
00a8bb00	stp x29,x30,[sp, #0x50]
00a8bb04	add x29,sp,#0x50
00a8bb08	mov x19,x3
00a8bb0c	mov x23,x2
00a8bb10	mov x24,x1
00a8bb14	mov x22,x0
00a8bb18	bl 0x00c3cea0
00a8bb1c	ldr w8,[x0, #0x118]
00a8bb20	cbz w8,0x00a8bc14
00a8bb24	ldr w8,[x0, #0x130]
00a8bb28	mov x21,x0
00a8bb2c	tbnz w8,#0x1f,0x00a8bb78
00a8bb30	mov x0,x22
00a8bb34	bl 0x00c3cea0
00a8bb38	cmp x24,x23
00a8bb3c	b.ne 0x00a8bc14
00a8bb40	ldrsw x8,[x0, #0x12c]
00a8bb44	mov x21,x0
00a8bb48	add x8,x8,#0x8
00a8bb4c	cmp x8,x19
00a8bb50	b.hi 0x00a8bc14
00a8bb54	mov x0,x22
00a8bb58	add x24,x21,#0x138
00a8bb5c	bl 0x00c3cec0
00a8bb60	cbz w0,0x00a8bbe0
00a8bb64	mov x0,x22
00a8bb68	bl 0x00c3ce90
00a8bb6c	ldr x8,[x0]
00a8bb70	str x8,[x23]
00a8bb74	b 0x00a8bbe4
00a8bb78	cbz x24,0x00a8bb84
00a8bb7c	mov w20,wzr
00a8bb80	cbz x23,0x00a8bc18
00a8bb84	ldr w8,[x21, #0x11c]
00a8bb88	cbz w8,0x00a8bc14
00a8bb8c	add x20,x21,#0x138
00a8bb90	cbz x24,0x00a8bc38
00a8bb94	mov x0,x22
00a8bb98	bl 0x00c3cec0
00a8bb9c	cbnz w0,0x00a8bba8
00a8bba0	ldr w8,[x21, #0x120]
00a8bba4	cbz w8,0x00a8bc14
00a8bba8	ldr w8,[x21, #0x124]
00a8bbac	cbz w8,0x00a8bca8
00a8bbb0	mov x0,x22
00a8bbb4	bl 0x00c3cec0
00a8bbb8	ldr x4,[x21, #0x170]
00a8bbbc	cbz w0,0x00a8bcd4
00a8bbc0	cbz x4,0x00a8bd44
00a8bbc4	mov x0,x20
00a8bbc8	mov x1,x23
00a8bbcc	mov x2,x24
00a8bbd0	mov x3,x19
00a8bbd4	bl 0x00c3e2a0
00a8bbd8	cbnz w0,0x00a8bc14
00a8bbdc	b 0x00a8bd5c
00a8bbe0	ldr x8,[x23]
00a8bbe4	stur x8,[x22, #0x2c]
00a8bbe8	ldrsw x8,[x21, #0x12c]
00a8bbec	ldrsw x9,[x21, #0x128]
00a8bbf0	orr w10,wzr,#0xf
00a8bbf4	add x1,x22,#0x28
00a8bbf8	add x8,x8,#0x8
00a8bbfc	sub x20,x19,x8
00a8bc00	sub x2,x10,x9
00a8bc04	mov x0,x24
00a8bc08	mov x3,x20
00a8bc0c	bl 0x00c3e2c0
00a8bc10	cbz w0,0x00a8bc5c
00a8bc14	mov w20,#0xffffffff
00a8bc18	mov w0,w20
00a8bc1c	ldp x29,x30,[sp, #0x50]
00a8bc20	ldp x20,x19,[sp, #0x40]
00a8bc24	ldp x22,x21,[sp, #0x30]
00a8bc28	ldp x24,x23,[sp, #0x20]
00a8bc2c	ldr x25,[sp, #0x10]
00a8bc30	add sp,sp,#0x60
00a8bc34	ret
00a8bc38	cbz x23,0x00a8bcf8
00a8bc3c	cbz x19,0x00a8bc48
00a8bc40	ldr w8,[x21, #0x124]
00a8bc44	cbz w8,0x00a8bc14
00a8bc48	mov x0,x20
00a8bc4c	mov x1,x23
00a8bc50	mov x2,x19
00a8bc54	bl 0x00c3e260
00a8bc58	b 0x00a8bdfc
00a8bc5c	mov x0,x22
00a8bc60	bl 0x00c3ce90
00a8bc64	ldrsw x2,[x21, #0x130]
00a8bc68	mov x1,x0
00a8bc6c	mov x0,x24
00a8bc70	bl 0x00c3e260
00a8bc74	mov x0,x22
00a8bc78	add x19,x23,#0x8
00a8bc7c	bl 0x00c3cec0
00a8bc80	ldr x4,[x21, #0x170]
00a8bc84	cbz w0,0x00a8bd24
00a8bc88	cbz x4,0x00a8bd68
00a8bc8c	mov x0,x24
00a8bc90	mov x1,x19
00a8bc94	mov x2,x19
00a8bc98	mov x3,x20
00a8bc9c	bl 0x00c3e2a0
00a8bca0	cbnz w0,0x00a8bc14
00a8bca4	b 0x00a8bd80
00a8bca8	ldrsw x8,[x21, #0x128]
00a8bcac	orr w9,wzr,#0xf
00a8bcb0	add x1,x22,#0x28
00a8bcb4	mov x0,x20
00a8bcb8	sub x2,x9,x8
00a8bcbc	mov x3,x19
00a8bcc0	bl 0x00c3e2c0
00a8bcc4	cbnz w0,0x00a8bc14
00a8bcc8	mov w8,#0x1
00a8bccc	str w8,[x21, #0x124]
00a8bcd0	b 0x00a8bbb0
00a8bcd4	add x25,x21,#0x11c
00a8bcd8	mov x0,x20
00a8bcdc	mov x1,x23
00a8bce0	mov x2,x24
00a8bce4	mov x3,x19
00a8bce8	cbz x4,0x00a8bda4
00a8bcec	bl 0x00c3e280
00a8bcf0	cbnz w0,0x00a8bde4
00a8bcf4	b 0x00a8bdac
00a8bcf8	ldrsw x8,[x21, #0x128]
00a8bcfc	orr w9,wzr,#0xf
00a8bd00	add x1,x22,#0x28
00a8bd04	mov x0,x20
00a8bd08	sub x2,x9,x8
00a8bd0c	mov x3,x19
00a8bd10	bl 0x00c3e2c0
00a8bd14	cbnz w0,0x00a8bc14
00a8bd18	mov w8,#0x1
00a8bd1c	str w8,[x21, #0x124]
00a8bd20	b 0x00a8bdfc
00a8bd24	cbz x4,0x00a8be04
00a8bd28	mov x0,x24
00a8bd2c	mov x1,x19
00a8bd30	mov x2,x19
00a8bd34	mov x3,x20
00a8bd38	bl 0x00c3e280
00a8bd3c	cbnz w0,0x00a8be44
00a8bd40	b 0x00a8be1c
00a8bd44	mov x0,x20
00a8bd48	mov x1,x23
00a8bd4c	mov x2,x24
00a8bd50	mov x3,x19
00a8bd54	bl 0x00c3e290
00a8bd58	cbnz w0,0x00a8bc14
00a8bd5c	mov w8,#0x1
00a8bd60	str w8,[x21, #0x120]
00a8bd64	b 0x00a8bdfc
00a8bd68	mov x0,x24
00a8bd6c	mov x1,x19
00a8bd70	mov x2,x19
00a8bd74	mov x3,x20
00a8bd78	bl 0x00c3e290
00a8bd7c	cbnz w0,0x00a8bc14
00a8bd80	ldrsw x2,[x21, #0x12c]
00a8bd84	add x1,x19,x20
00a8bd88	mov x0,x24
00a8bd8c	bl 0x00c3e2d0
00a8bd90	cbz x0,0x00a8bc14
00a8bd94	ldr w8,[x21, #0x12c]
00a8bd98	add w8,w20,w8
00a8bd9c	add w20,w8,#0x8
00a8bda0	b 0x00a8bc18
00a8bda4	bl 0x00c3e270
00a8bda8	cbnz w0,0x00a8bde4
00a8bdac	ldrsw x2,[x21, #0x12c]
00a8bdb0	mov x1,sp
00a8bdb4	mov x0,x20
00a8bdb8	bl 0x00c3e2d0
00a8bdbc	cbz x0,0x00a8bde4
00a8bdc0	mov x0,x22
00a8bdc4	bl 0x00c3ce90
00a8bdc8	ldrsw x2,[x21, #0x12c]
00a8bdcc	mov x1,x0
00a8bdd0	mov x0,sp
00a8bdd4	bl 0x00c362f0
00a8bdd8	cbnz w0,0x00a8bde4
00a8bddc	cmn w19,#0x1
00a8bde0	b.ne 0x00a8bdf4
00a8bde4	mov x0,x24
00a8bde8	mov x1,x19
00a8bdec	bl 0x00c34750
00a8bdf0	mov w19,#0xffffffff
00a8bdf4	str xzr,[x25]
00a8bdf8	str wzr,[x21, #0x124]
00a8bdfc	mov w20,w19
00a8be00	b 0x00a8bc18
00a8be04	mov x0,x24
00a8be08	mov x1,x19
00a8be0c	mov x2,x19
00a8be10	mov x3,x20
00a8be14	bl 0x00c3e270
00a8be18	cbnz w0,0x00a8be44
00a8be1c	ldrsw x2,[x21, #0x12c]
00a8be20	mov x1,sp
00a8be24	mov x0,x24
00a8be28	bl 0x00c3e2d0
00a8be2c	cbz x0,0x00a8be44
00a8be30	ldrsw x2,[x21, #0x12c]
00a8be34	add x1,x19,x20
00a8be38	mov x0,sp
00a8be3c	bl 0x00c362f0
00a8be40	cbz w0,0x00a8bc18
00a8be44	mov x0,x19
00a8be48	mov x1,x20
00a8be4c	bl 0x00c34750
00a8be50	b 0x00a8bc14
