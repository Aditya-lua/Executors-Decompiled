; ASN1_i2d_bio @ 00ab9c08
00ab9c08	str x23,[sp, #-0x40]!
00ab9c0c	stp x20,x19,[sp, #0x20]
00ab9c10	mov x19,x1
00ab9c14	mov x23,x0
00ab9c18	mov x0,x2
00ab9c1c	mov x1,xzr
00ab9c20	stp x22,x21,[sp, #0x10]
00ab9c24	stp x29,x30,[sp, #0x30]
00ab9c28	add x29,sp,#0x30
00ab9c2c	mov x22,x2
00ab9c30	blr x23
00ab9c34	mov w21,w0
00ab9c38	cmp w0,#0x1
00ab9c3c	b.lt 0x00ab9cb8
00ab9c40	adrp x1,0x2d0000
00ab9c44	sxtw x0,w21
00ab9c48	add x1,x1,#0x263
00ab9c4c	mov w2,#0x2c
00ab9c50	bl 0x00c32320
00ab9c54	cbz x0,0x00ab9cc0
00ab9c58	mov x20,x0
00ab9c5c	str x0,[sp, #0x8]
00ab9c60	add x1,sp,#0x8
00ab9c64	mov x0,x22
00ab9c68	blr x23
00ab9c6c	mov x0,x19
00ab9c70	mov x1,x20
00ab9c74	mov w2,w21
00ab9c78	bl 0x00c34240
00ab9c7c	cmp w21,w0
00ab9c80	b.eq 0x00ab9cb0
00ab9c84	mov w22,wzr
00ab9c88	cmp w0,#0x1
00ab9c8c	b.lt 0x00ab9cf8
00ab9c90	add w22,w0,w22
00ab9c94	sub w21,w21,w0
00ab9c98	add x1,x20,w22, SXTW 
00ab9c9c	mov x0,x19
00ab9ca0	mov w2,w21
00ab9ca4	bl 0x00c34240
00ab9ca8	cmp w21,w0
00ab9cac	b.ne 0x00ab9c88
00ab9cb0	mov w19,#0x1
00ab9cb4	b 0x00ab9cfc
00ab9cb8	mov w19,wzr
00ab9cbc	b 0x00ab9d10
00ab9cc0	bl 0x00c342a0
00ab9cc4	adrp x0,0x2d0000
00ab9cc8	adrp x2,0x2b4000
00ab9ccc	add x0,x0,#0x263
00ab9cd0	add x2,x2,#0x81d
00ab9cd4	mov w1,#0x2e
00ab9cd8	bl 0x00c342b0
00ab9cdc	mov w1,#0x100
00ab9ce0	mov w0,#0xd
00ab9ce4	movk w1,#0xc, LSL #16
00ab9ce8	mov x2,xzr
00ab9cec	bl 0x00c342c0
00ab9cf0	mov w19,wzr
00ab9cf4	b 0x00ab9d10
00ab9cf8	mov w19,wzr
00ab9cfc	adrp x1,0x2d0000
00ab9d00	add x1,x1,#0x263
00ab9d04	mov w2,#0x40
00ab9d08	mov x0,x20
00ab9d0c	bl 0x00c32310
00ab9d10	mov w0,w19
00ab9d14	ldp x29,x30,[sp, #0x30]
00ab9d18	ldp x20,x19,[sp, #0x20]
00ab9d1c	ldp x22,x21,[sp, #0x10]
00ab9d20	ldr x23,[sp], #0x40
00ab9d24	ret
