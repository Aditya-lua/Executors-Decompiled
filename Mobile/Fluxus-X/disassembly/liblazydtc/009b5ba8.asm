; SSL_set_cipher_list @ 009b5ba8
009b5ba8	str x21,[sp, #-0x30]!
009b5bac	stp x20,x19,[sp, #0x10]
009b5bb0	stp x29,x30,[sp, #0x20]
009b5bb4	ldr x8,[x0, #0x9a8]
009b5bb8	mov x4,x1
009b5bbc	ldr x1,[x0, #0x538]
009b5bc0	ldr x5,[x0, #0x898]
009b5bc4	add x2,x0,#0x528
009b5bc8	add x3,x0,#0x530
009b5bcc	mov x0,x8
009b5bd0	add x29,sp,#0x20
009b5bd4	bl 0x00c353e0
009b5bd8	cbz x0,0x009b5c5c
009b5bdc	mov x19,x0
009b5be0	bl 0x00c325e0
009b5be4	cmp w0,#0x1
009b5be8	b.lt 0x009b5c2c
009b5bec	mov w21,wzr
009b5bf0	mov w20,wzr
009b5bf4	mov x0,x19
009b5bf8	mov w1,w20
009b5bfc	bl 0x00c32610
009b5c00	ldr w8,[x0, #0x2c]
009b5c04	mov x0,x19
009b5c08	add w20,w20,#0x1
009b5c0c	cmp w8,#0x304
009b5c10	cinc w21,w21,lt
009b5c14	bl 0x00c325e0
009b5c18	cmp w20,w0
009b5c1c	b.lt 0x009b5bf4
009b5c20	cbz w21,0x009b5c2c
009b5c24	mov w0,#0x1
009b5c28	b 0x009b5c5c
009b5c2c	bl 0x00c342a0
009b5c30	adrp x0,0x2c5000
009b5c34	adrp x2,0x2a7000
009b5c38	add x0,x0,#0x652
009b5c3c	add x2,x2,#0xae1
009b5c40	mov w1,#0xaed
009b5c44	bl 0x00c342b0
009b5c48	mov w0,#0x14
009b5c4c	mov w1,#0xb9
009b5c50	mov x2,xzr
009b5c54	bl 0x00c342c0
009b5c58	mov w0,wzr
009b5c5c	ldp x29,x30,[sp, #0x20]
009b5c60	ldp x20,x19,[sp, #0x10]
009b5c64	ldr x21,[sp], #0x30
009b5c68	ret
