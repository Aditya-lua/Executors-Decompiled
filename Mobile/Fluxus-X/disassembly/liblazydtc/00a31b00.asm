; EC_POINT_add @ 00a31b00
00a31b00	stp x29,x30,[sp, #-0x10]!
00a31b04	ldr x9,[x0]
00a31b08	mov x29,sp
00a31b0c	ldr x5,[x9, #0xa0]
00a31b10	cbz x5,0x00a31b8c
00a31b14	ldr x8,[x1]
00a31b18	cmp x9,x8
00a31b1c	b.ne 0x00a31b64
00a31b20	ldr w8,[x0, #0x20]
00a31b24	cbz w8,0x00a31b38
00a31b28	ldr w10,[x1, #0x8]
00a31b2c	cbz w10,0x00a31b38
00a31b30	cmp w8,w10
00a31b34	b.ne 0x00a31b64
00a31b38	ldr x10,[x2]
00a31b3c	cmp x9,x10
00a31b40	b.ne 0x00a31b64
00a31b44	cbz w8,0x00a31b58
00a31b48	ldr w10,[x2, #0x8]
00a31b4c	cbz w10,0x00a31b58
00a31b50	cmp w8,w10
00a31b54	b.ne 0x00a31b64
00a31b58	ldr x10,[x3]
00a31b5c	cmp x9,x10
00a31b60	b.eq 0x00a31bc8
00a31b64	bl 0x00c342a0
00a31b68	adrp x0,0x29e000
00a31b6c	adrp x2,0x2c1000
00a31b70	add x0,x0,#0xa7
00a31b74	add x2,x2,#0xb04
00a31b78	mov w1,#0x3b2
00a31b7c	bl 0x00c342b0
00a31b80	mov w0,#0x10
00a31b84	mov w1,#0x65
00a31b88	b 0x00a31bb4
00a31b8c	bl 0x00c342a0
00a31b90	adrp x0,0x29e000
00a31b94	adrp x2,0x2c1000
00a31b98	add x0,x0,#0xa7
00a31b9c	add x2,x2,#0xb04
00a31ba0	mov w1,#0x3ad
00a31ba4	bl 0x00c342b0
00a31ba8	mov w1,#0x101
00a31bac	mov w0,#0x10
00a31bb0	movk w1,#0xc, LSL #16
00a31bb4	mov x2,xzr
00a31bb8	bl 0x00c342c0
00a31bbc	mov w0,wzr
00a31bc0	ldp x29,x30,[sp], #0x10
00a31bc4	ret
00a31bc8	cbz w8,0x00a31bdc
00a31bcc	ldr w9,[x3, #0x8]
00a31bd0	cbz w9,0x00a31bdc
00a31bd4	cmp w8,w9
00a31bd8	b.ne 0x00a31b64
00a31bdc	ldp x29,x30,[sp], #0x10
00a31be0	br x5
