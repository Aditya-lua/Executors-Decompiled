; EVP_PKEY_get1_encoded_public_key @ 00a6eb58
00a6eb58	sub sp,sp,#0xc0
00a6eb5c	str x23,[sp, #0x80]
00a6eb60	stp x22,x21,[sp, #0x90]
00a6eb64	stp x20,x19,[sp, #0xa0]
00a6eb68	stp x29,x30,[sp, #0xb0]
00a6eb6c	add x29,sp,#0xb0
00a6eb70	cbz x0,0x00a6ecdc
00a6eb74	ldr x8,[x0, #0x60]
00a6eb78	mov x19,x1
00a6eb7c	mov x20,x0
00a6eb80	cbz x8,0x00a6ec94
00a6eb84	adrp x0,0x2bd000
00a6eb88	add x0,x0,#0xb5e
00a6eb8c	add x8,sp,#0x58
00a6eb90	mov x1,xzr
00a6eb94	mov x2,xzr
00a6eb98	bl 0x00c34c50
00a6eb9c	ldr x8,[sp, #0x78]
00a6eba0	ldur q0,[sp, #0x68]
00a6eba4	ldur q1,[sp, #0x58]
00a6eba8	mov x23,sp
00a6ebac	str x8,[sp, #0x20]
00a6ebb0	add x8,sp,#0x58
00a6ebb4	stp q1,q0,[sp]
00a6ebb8	bl 0x00c34c40
00a6ebbc	ldr x8,[sp, #0x78]
00a6ebc0	ldur q0,[sp, #0x68]
00a6ebc4	ldur q1,[sp, #0x58]
00a6ebc8	mov x1,sp
00a6ebcc	mov x0,x20
00a6ebd0	str x8,[sp, #0x48]
00a6ebd4	stur q0,[sp, #0x38]
00a6ebd8	stur q1,[sp, #0x28]
00a6ebdc	bl 0x00a6f360
00a6ebe0	cbz w0,0x00a6ecdc
00a6ebe4	mov x0,sp
00a6ebe8	bl 0x00c3d030
00a6ebec	cbz w0,0x00a6ecdc
00a6ebf0	ldr x21,[sp, #0x20]
00a6ebf4	cmn x21,#0x1
00a6ebf8	b.eq 0x00a6ecdc
00a6ebfc	adrp x1,0x2c1000
00a6ec00	add x1,x1,#0xcf9
00a6ec04	mov w2,#0x58c
00a6ec08	mov x0,x21
00a6ec0c	str xzr,[x19]
00a6ec10	bl 0x00c32320
00a6ec14	cbz x0,0x00a6ecdc
00a6ec18	mov x22,x0
00a6ec1c	adrp x0,0x2bd000
00a6ec20	add x0,x0,#0xb5e
00a6ec24	add x8,sp,#0x58
00a6ec28	mov x1,x22
00a6ec2c	mov x2,x21
00a6ec30	add x23,x23,#0x28
00a6ec34	bl 0x00c34c50
00a6ec38	ldr x8,[sp, #0x78]
00a6ec3c	ldur q0,[sp, #0x68]
00a6ec40	ldur q1,[sp, #0x58]
00a6ec44	str x8,[sp, #0x20]
00a6ec48	add x8,sp,#0x58
00a6ec4c	stp q1,q0,[sp]
00a6ec50	bl 0x00c34c40
00a6ec54	ldr x8,[sp, #0x78]
00a6ec58	ldur q0,[sp, #0x58]
00a6ec5c	ldur q1,[sp, #0x68]
00a6ec60	mov x1,sp
00a6ec64	mov x0,x20
00a6ec68	str x8,[x23, #0x20]
00a6ec6c	stp q0,q1,[x23]
00a6ec70	bl 0x00a6f360
00a6ec74	cbz w0,0x00a6ecc8
00a6ec78	mov w20,w0
00a6ec7c	mov x0,sp
00a6ec80	bl 0x00c3d030
00a6ec84	cbz w20,0x00a6ecc8
00a6ec88	cbz w0,0x00a6ecc8
00a6ec8c	str x22,[x19]
00a6ec90	b 0x00a6ece0
00a6ec94	ldr x8,[x20, #0x8]
00a6ec98	cbz x8,0x00a6ecdc
00a6ec9c	ldr x8,[x8, #0xb0]
00a6eca0	cbz x8,0x00a6ecdc
00a6eca4	mov w1,#0xa
00a6eca8	mov x0,x20
00a6ecac	mov x2,xzr
00a6ecb0	mov x3,x19
00a6ecb4	blr x8
00a6ecb8	cmp w0,#0x0
00a6ecbc	b.le 0x00a6ecdc
00a6ecc0	sxtw x21,w0
00a6ecc4	b 0x00a6ece0
00a6ecc8	adrp x1,0x2c1000
00a6eccc	add x1,x1,#0xcf9
00a6ecd0	mov w2,#0x593
00a6ecd4	mov x0,x22
00a6ecd8	bl 0x00c32310
00a6ecdc	mov x21,xzr
00a6ece0	mov x0,x21
00a6ece4	ldp x29,x30,[sp, #0xb0]
00a6ece8	ldp x20,x19,[sp, #0xa0]
00a6ecec	ldp x22,x21,[sp, #0x90]
00a6ecf0	ldr x23,[sp, #0x80]
00a6ecf4	add sp,sp,#0xc0
00a6ecf8	ret
