; EVP_PBE_alg_add_type @ 00a69ba4
00a69ba4	str x25,[sp, #-0x50]!
00a69ba8	adrp x25,0xd21000
00a69bac	ldr x8,[x25, #0xb40]
00a69bb0	stp x24,x23,[sp, #0x10]
00a69bb4	stp x22,x21,[sp, #0x20]
00a69bb8	stp x20,x19,[sp, #0x30]
00a69bbc	mov x19,x4
00a69bc0	mov w20,w3
00a69bc4	mov w21,w2
00a69bc8	mov w22,w1
00a69bcc	mov w23,w0
00a69bd0	stp x29,x30,[sp, #0x40]
00a69bd4	add x29,sp,#0x40
00a69bd8	cbnz x8,0x00a69bf0
00a69bdc	adrp x0,0xa69000
00a69be0	add x0,x0,#0xc90
00a69be4	bl 0x00c35340
00a69be8	str x0,[x25, #0xb40]
00a69bec	cbz x0,0x00a69c44
00a69bf0	adrp x1,0x2d7000
00a69bf4	add x1,x1,#0xef7
00a69bf8	mov w0,#0x20
00a69bfc	mov w2,#0xcb
00a69c00	bl 0x00c34250
00a69c04	cbz x0,0x00a69c44
00a69c08	stp w23,w22,[x0]
00a69c0c	stp w21,w20,[x0, #0x8]
00a69c10	str x19,[x0, #0x10]
00a69c14	mov x24,x0
00a69c18	ldr x0,[x25, #0xb40]
00a69c1c	mov x1,x24
00a69c20	bl 0x00c347a0
00a69c24	cbz w0,0x00a69c30
00a69c28	mov w0,#0x1
00a69c2c	b 0x00a69c78
00a69c30	adrp x1,0x2d7000
00a69c34	add x1,x1,#0xef7
00a69c38	mov w2,#0xd5
00a69c3c	mov x0,x24
00a69c40	bl 0x00c32310
00a69c44	bl 0x00c342a0
00a69c48	adrp x0,0x2d7000
00a69c4c	adrp x2,0x2b7000
00a69c50	add x0,x0,#0xef7
00a69c54	add x2,x2,#0xcdb
00a69c58	mov w1,#0xdb
00a69c5c	bl 0x00c342b0
00a69c60	mov w1,#0x100
00a69c64	orr w0,wzr,#0x6
00a69c68	movk w1,#0xc, LSL #16
00a69c6c	mov x2,xzr
00a69c70	bl 0x00c342c0
00a69c74	mov w0,wzr
00a69c78	ldp x29,x30,[sp, #0x40]
00a69c7c	ldp x20,x19,[sp, #0x30]
00a69c80	ldp x22,x21,[sp, #0x20]
00a69c84	ldp x24,x23,[sp, #0x10]
00a69c88	ldr x25,[sp], #0x50
00a69c8c	ret
