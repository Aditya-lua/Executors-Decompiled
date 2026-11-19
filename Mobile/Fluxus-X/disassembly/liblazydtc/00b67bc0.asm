; ossl_gcm_stream_update @ 00b67bc0
00b67bc0	stp x29,x30,[sp, #-0x10]!
00b67bc4	mov x29,sp
00b67bc8	cbz x5,0x00b67bfc
00b67bcc	cmp x3,x5
00b67bd0	b.cs 0x00b67c0c
00b67bd4	bl 0x00c342a0
00b67bd8	adrp x0,0x2ac000
00b67bdc	adrp x2,0x2be000
00b67be0	add x0,x0,#0xc00
00b67be4	add x2,x2,#0xb57
00b67be8	mov w1,#0x140
00b67bec	bl 0x00c342b0
00b67bf0	mov w0,#0x39
00b67bf4	mov w1,#0x6a
00b67bf8	b 0x00b67c50
00b67bfc	str xzr,[x2]
00b67c00	mov w0,#0x1
00b67c04	ldp x29,x30,[sp], #0x10
00b67c08	ret
00b67c0c	mov x3,x4
00b67c10	mov x4,x5
00b67c14	bl 0x00b67c64
00b67c18	cmp w0,#0x0
00b67c1c	b.le 0x00b67c2c
00b67c20	mov w0,#0x1
00b67c24	ldp x29,x30,[sp], #0x10
00b67c28	ret
00b67c2c	bl 0x00c342a0
00b67c30	adrp x0,0x2ac000
00b67c34	adrp x2,0x2be000
00b67c38	add x0,x0,#0xc00
00b67c3c	add x2,x2,#0xb57
00b67c40	mov w1,#0x145
00b67c44	bl 0x00c342b0
00b67c48	mov w0,#0x39
00b67c4c	mov w1,#0x66
00b67c50	mov x2,xzr
00b67c54	bl 0x00c342c0
00b67c58	mov w0,wzr
00b67c5c	ldp x29,x30,[sp], #0x10
00b67c60	ret
