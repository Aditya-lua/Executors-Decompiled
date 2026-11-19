; EVP_PKEY_new_CMAC_key @ 00a6d10c
00a6d10c	sub sp,sp,#0x140
00a6d110	stp x22,x21,[sp, #0x110]
00a6d114	stp x20,x19,[sp, #0x120]
00a6d118	mov x19,x3
00a6d11c	mov x21,x2
00a6d120	mov x22,x1
00a6d124	stp x28,x23,[sp, #0x100]
00a6d128	stp x29,x30,[sp, #0x130]
00a6d12c	add x29,sp,#0x130
00a6d130	cbz x0,0x00a6d148
00a6d134	bl 0x00c32390
00a6d138	mov x20,x0
00a6d13c	str xzr,[sp, #0x28]
00a6d140	cbnz x19,0x00a6d154
00a6d144	b 0x00a6d270
00a6d148	mov x20,xzr
00a6d14c	str xzr,[sp, #0x28]
00a6d150	cbz x19,0x00a6d270
00a6d154	mov x0,x19
00a6d158	bl 0x00c3cef0
00a6d15c	cbz x0,0x00a6d270
00a6d160	adrp x1,0x2bd000
00a6d164	mov x23,x0
00a6d168	add x1,x1,#0xb6e
00a6d16c	mov x0,xzr
00a6d170	mov x2,xzr
00a6d174	bl 0x00c34630
00a6d178	mov x19,x0
00a6d17c	cbz x0,0x00a6d2d0
00a6d180	mov x0,x19
00a6d184	bl 0x00c36410
00a6d188	cmp w0,#0x0
00a6d18c	b.le 0x00a6d2a4
00a6d190	adrp x0,0x2a3000
00a6d194	add x0,x0,#0xe83
00a6d198	mov x8,sp
00a6d19c	mov x1,x22
00a6d1a0	mov x2,x21
00a6d1a4	bl 0x00c34c50
00a6d1a8	ldr x8,[sp, #0x20]
00a6d1ac	ldp q1,q0,[sp]
00a6d1b0	adrp x0,0x2ad000
00a6d1b4	add x22,sp,#0x30
00a6d1b8	str x8,[sp, #0x50]
00a6d1bc	add x0,x0,#0x804
00a6d1c0	mov x8,sp
00a6d1c4	mov x1,x23
00a6d1c8	mov x2,xzr
00a6d1cc	stp q1,q0,[sp, #0x30]
00a6d1d0	add x21,x22,#0x50
00a6d1d4	bl 0x00c36280
00a6d1d8	ldr x8,[sp, #0x20]
00a6d1dc	ldp q1,q0,[sp]
00a6d1e0	str x8,[sp, #0x78]
00a6d1e4	stur q0,[sp, #0x68]
00a6d1e8	stur q1,[sp, #0x58]
00a6d1ec	cbz x20,0x00a6d220
00a6d1f0	adrp x0,0x2b2000
00a6d1f4	add x0,x0,#0x27d
00a6d1f8	mov x8,sp
00a6d1fc	mov x1,x20
00a6d200	mov x2,xzr
00a6d204	add x22,x22,#0x78
00a6d208	bl 0x00c36280
00a6d20c	ldr x8,[sp, #0x20]
00a6d210	ldp q0,q1,[sp]
00a6d214	str x8,[x21, #0x20]
00a6d218	stp q0,q1,[x21]
00a6d21c	mov x21,x22
00a6d220	mov x8,sp
00a6d224	bl 0x00c34c40
00a6d228	ldr x8,[sp, #0x20]
00a6d22c	ldp q0,q1,[sp]
00a6d230	add x1,sp,#0x28
00a6d234	mov w2,#0x87
00a6d238	add x3,sp,#0x30
00a6d23c	mov x0,x19
00a6d240	str x8,[x21, #0x20]
00a6d244	stp q0,q1,[x21]
00a6d248	bl 0x00c36400
00a6d24c	cmp w0,#0x0
00a6d250	b.gt 0x00a6d2d0
00a6d254	bl 0x00c342a0
00a6d258	adrp x0,0x2c1000
00a6d25c	adrp x2,0x2b5000
00a6d260	add x0,x0,#0xcf9
00a6d264	add x2,x2,#0xccb
00a6d268	mov w1,#0x294
00a6d26c	b 0x00a6d2bc
00a6d270	bl 0x00c342a0
00a6d274	adrp x0,0x2c1000
00a6d278	adrp x2,0x2b5000
00a6d27c	add x0,x0,#0xcf9
00a6d280	add x2,x2,#0xccb
00a6d284	mov w1,#0x278
00a6d288	bl 0x00c342b0
00a6d28c	orr w0,wzr,#0x6
00a6d290	mov w1,#0xb4
00a6d294	mov x2,xzr
00a6d298	bl 0x00c342c0
00a6d29c	mov x0,xzr
00a6d2a0	b 0x00a6d2dc
00a6d2a4	bl 0x00c342a0
00a6d2a8	adrp x0,0x2c1000
00a6d2ac	adrp x2,0x2b5000
00a6d2b0	add x0,x0,#0xcf9
00a6d2b4	add x2,x2,#0xccb
00a6d2b8	mov w1,#0x281
00a6d2bc	bl 0x00c342b0
00a6d2c0	orr w0,wzr,#0x6
00a6d2c4	mov w1,#0xb4
00a6d2c8	mov x2,xzr
00a6d2cc	bl 0x00c342c0
00a6d2d0	mov x0,x19
00a6d2d4	bl 0x00c34620
00a6d2d8	ldr x0,[sp, #0x28]
00a6d2dc	ldp x29,x30,[sp, #0x130]
00a6d2e0	ldp x20,x19,[sp, #0x120]
00a6d2e4	ldp x22,x21,[sp, #0x110]
00a6d2e8	ldp x28,x23,[sp, #0x100]
00a6d2ec	add sp,sp,#0x140
00a6d2f0	ret
