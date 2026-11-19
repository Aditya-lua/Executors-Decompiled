; DH_KDF_X9_42 @ 00a78ab0
00a78ab0	sub sp,sp,#0xb0
00a78ab4	stp x26,x25,[sp, #0x60]
00a78ab8	mov x25,x0
00a78abc	mov x0,x7
00a78ac0	str x27,[sp, #0x50]
00a78ac4	stp x24,x23,[sp, #0x70]
00a78ac8	stp x22,x21,[sp, #0x80]
00a78acc	stp x20,x19,[sp, #0x90]
00a78ad0	stp x29,x30,[sp, #0xa0]
00a78ad4	add x29,sp,#0xa0
00a78ad8	mov x19,x7
00a78adc	mov x20,x6
00a78ae0	mov x21,x5
00a78ae4	mov x27,x4
00a78ae8	mov x22,x3
00a78aec	mov x23,x2
00a78af0	mov x24,x1
00a78af4	bl 0x00c35810
00a78af8	bl 0x00c3b2f0
00a78afc	mov x26,x0
00a78b00	add x0,sp,#0x1c
00a78b04	mov w1,#0x32
00a78b08	mov x2,x27
00a78b0c	mov w3,wzr
00a78b10	bl 0x00c32500
00a78b14	cmp w0,#0x1
00a78b18	b.lt 0x00a78b48
00a78b1c	add x4,sp,#0x1c
00a78b20	mov x0,x25
00a78b24	mov x1,x24
00a78b28	mov x2,x23
00a78b2c	mov x3,x22
00a78b30	mov x5,x21
00a78b34	mov x6,x20
00a78b38	mov x7,x19
00a78b3c	stp x26,xzr,[sp]
00a78b40	bl 0x00a788f0
00a78b44	b 0x00a78b4c
00a78b48	mov w0,wzr
00a78b4c	ldp x29,x30,[sp, #0xa0]
00a78b50	ldp x20,x19,[sp, #0x90]
00a78b54	ldp x22,x21,[sp, #0x80]
00a78b58	ldp x24,x23,[sp, #0x70]
00a78b5c	ldp x26,x25,[sp, #0x60]
00a78b60	ldr x27,[sp, #0x50]
00a78b64	add sp,sp,#0xb0
00a78b68	ret
