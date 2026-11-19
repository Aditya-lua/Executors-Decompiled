; PKCS7_add_certificate @ 00ac2ccc
00ac2ccc	stp x20,x19,[sp, #-0x20]!
00ac2cd0	stp x29,x30,[sp, #0x10]
00ac2cd4	mov x20,x0
00ac2cd8	ldr x0,[x0, #0x18]
00ac2cdc	add x29,sp,#0x10
00ac2ce0	mov x19,x1
00ac2ce4	bl 0x00c37750
00ac2ce8	cmp w0,#0x18
00ac2cec	b.eq 0x00ac2cf8
00ac2cf0	cmp w0,#0x16
00ac2cf4	b.ne 0x00ac2d14
00ac2cf8	ldr x8,[x20, #0x20]
00ac2cfc	ldp x29,x30,[sp, #0x10]
00ac2d00	mov w2,#0x1
00ac2d04	mov x1,x19
00ac2d08	add x0,x8,#0x10
00ac2d0c	ldp x20,x19,[sp], #0x20
00ac2d10	b 0x00c3ef60
00ac2d14	bl 0x00c342a0
00ac2d18	adrp x0,0x2ce000
00ac2d1c	adrp x2,0x2b0000
00ac2d20	add x0,x0,#0x1ca
00ac2d24	add x2,x2,#0x7b9
00ac2d28	mov w1,#0x109
00ac2d2c	bl 0x00c342b0
00ac2d30	mov w0,#0x21
00ac2d34	mov w1,#0x71
00ac2d38	mov x2,xzr
00ac2d3c	bl 0x00c342c0
00ac2d40	ldp x29,x30,[sp, #0x10]
00ac2d44	mov w0,wzr
00ac2d48	ldp x20,x19,[sp], #0x20
00ac2d4c	ret
