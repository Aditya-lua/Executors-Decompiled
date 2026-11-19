; EVP_PKEY_CTX_set_dh_paramgen_prime_len @ 00a56aa8
00a56aa8	sub sp,sp,#0xa0
00a56aac	stp x29,x30,[sp, #0x90]
00a56ab0	add x29,sp,#0x90
00a56ab4	sxtw x8,w1
00a56ab8	str x19,[sp, #0x80]
00a56abc	stur x8,[x29, #-0x8]
00a56ac0	cbz x0,0x00a56b3c
00a56ac4	ldr w8,[x0]
00a56ac8	mov x19,x0
00a56acc	cmp w8,#0x2
00a56ad0	b.eq 0x00a56adc
00a56ad4	cmp w8,#0x4
00a56ad8	b.ne 0x00a56b3c
00a56adc	ldr x8,[x19, #0x20]
00a56ae0	cbz x8,0x00a56b7c
00a56ae4	adrp x0,0x2aa000
00a56ae8	add x0,x0,#0x16b
00a56aec	add x8,sp,#0x8
00a56af0	sub x1,x29,#0x8
00a56af4	bl 0x00c36270
00a56af8	ldr x8,[sp, #0x28]
00a56afc	ldur q0,[sp, #0x18]
00a56b00	ldur q1,[sp, #0x8]
00a56b04	str x8,[sp, #0x50]
00a56b08	add x8,sp,#0x8
00a56b0c	stp q1,q0,[sp, #0x30]
00a56b10	bl 0x00c34c40
00a56b14	ldr x8,[sp, #0x28]
00a56b18	ldur q0,[sp, #0x18]
00a56b1c	ldur q1,[sp, #0x8]
00a56b20	add x1,sp,#0x30
00a56b24	mov x0,x19
00a56b28	str x8,[sp, #0x78]
00a56b2c	stur q0,[sp, #0x68]
00a56b30	stur q1,[sp, #0x58]
00a56b34	bl 0x00c3c120
00a56b38	b 0x00a56b6c
00a56b3c	bl 0x00c342a0
00a56b40	adrp x0,0x2cf000
00a56b44	adrp x2,0x2c5000
00a56b48	add x0,x0,#0xb4f
00a56b4c	add x2,x2,#0xa48
00a56b50	mov w1,#0x16
00a56b54	bl 0x00c342b0
00a56b58	orr w0,wzr,#0x6
00a56b5c	mov w1,#0x93
00a56b60	mov x2,xzr
00a56b64	bl 0x00c342c0
00a56b68	orr w0,wzr,#0xfffffffe
00a56b6c	ldp x29,x30,[sp, #0x90]
00a56b70	ldr x19,[sp, #0x80]
00a56b74	add sp,sp,#0xa0
00a56b78	ret
00a56b7c	ldr x8,[x19, #0x78]
00a56b80	ldr w8,[x8]
00a56b84	cmp w8,#0x398
00a56b88	b.eq 0x00a56ae4
00a56b8c	cmp w8,#0x1c
00a56b90	b.eq 0x00a56ae4
00a56b94	mov w0,#0xffffffff
00a56b98	b 0x00a56b6c
