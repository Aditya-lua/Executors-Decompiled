; OSSL_HTTP_set1_request @ 00b18a8c
00b18a8c	sub sp,sp,#0x70
00b18a90	stp x28,x27,[sp, #0x10]
00b18a94	stp x26,x25,[sp, #0x20]
00b18a98	stp x24,x23,[sp, #0x30]
00b18a9c	stp x22,x21,[sp, #0x40]
00b18aa0	stp x20,x19,[sp, #0x50]
00b18aa4	stp x29,x30,[sp, #0x60]
00b18aa8	add x29,sp,#0x60
00b18aac	cbz x0,0x00b18b14
00b18ab0	ldr x8,[x0, #0x40]
00b18ab4	mov w22,w6
00b18ab8	mov x23,x5
00b18abc	mov x19,x4
00b18ac0	mov x20,x3
00b18ac4	mov x24,x2
00b18ac8	mov x4,x1
00b18acc	mov x21,x0
00b18ad0	cbz x8,0x00b18b4c
00b18ad4	ldr w8,[x21, #0x38]
00b18ad8	mov x2,xzr
00b18adc	cbnz w8,0x00b18b50
00b18ae0	ldr x2,[x21, #0x48]
00b18ae4	cbnz x2,0x00b18b50
00b18ae8	bl 0x00c342a0
00b18aec	adrp x0,0x2d6000
00b18af0	adrp x2,0x2a4000
00b18af4	add x0,x0,#0x829
00b18af8	add x2,x2,#0xb98
00b18afc	mov w1,#0x405
00b18b00	bl 0x00c342b0
00b18b04	mov w1,#0x106
00b18b08	mov w0,#0x3d
00b18b0c	movk w1,#0x8, LSL #16
00b18b10	b 0x00b18b3c
00b18b14	bl 0x00c342a0
00b18b18	adrp x0,0x2d6000
00b18b1c	adrp x2,0x2a4000
00b18b20	add x0,x0,#0x829
00b18b24	add x2,x2,#0xb98
00b18b28	mov w1,#0x400
00b18b2c	bl 0x00c342b0
00b18b30	mov w1,#0x102
00b18b34	mov w0,#0x3d
00b18b38	movk w1,#0xc, LSL #16
00b18b3c	mov x2,xzr
00b18b40	bl 0x00c342c0
00b18b44	mov w0,wzr
00b18b48	b 0x00b18c44
00b18b4c	mov x2,xzr
00b18b50	ldr x3,[x21, #0x50]
00b18b54	cmp x19,#0x0
00b18b58	cset w1,ne
00b18b5c	mov x0,x21
00b18b60	str x7,[x21, #0x98]
00b18b64	bl 0x00b17340
00b18b68	cbz w0,0x00b18c44
00b18b6c	ldr x25,[x21, #0x48]
00b18b70	str x20,[sp, #0x8]
00b18b74	cbz x25,0x00b18b88
00b18b78	ldrb w8,[x25]
00b18b7c	cmp w8,#0x0
00b18b80	cset w20,ne
00b18b84	b 0x00b18b8c
00b18b88	mov w20,wzr
00b18b8c	mov x0,x24
00b18b90	bl 0x00c325e0
00b18b94	cmp w0,#0x1
00b18b98	b.lt 0x00b18bf4
00b18b9c	adrp x27,0x2cc000
00b18ba0	mov w26,wzr
00b18ba4	add x27,x27,#0xd27
00b18ba8	mov x0,x24
00b18bac	mov w1,w26
00b18bb0	bl 0x00c32610
00b18bb4	mov x28,x0
00b18bb8	cbz w20,0x00b18bd0
00b18bbc	ldr x1,[x28, #0x8]
00b18bc0	mov x0,x27
00b18bc4	bl 0x00c35ee0
00b18bc8	cmp w0,#0x0
00b18bcc	csel w20,wzr,w20,eq
00b18bd0	ldp x1,x2,[x28, #0x8]
00b18bd4	mov x0,x21
00b18bd8	bl 0x00b174ec
00b18bdc	cbz w0,0x00b18c44
00b18be0	mov x0,x24
00b18be4	add w26,w26,#0x1
00b18be8	bl 0x00c325e0
00b18bec	cmp w26,w0
00b18bf0	b.lt 0x00b18ba8
00b18bf4	cbz w20,0x00b18c10
00b18bf8	adrp x1,0x2ad000
00b18bfc	add x1,x1,#0x152
00b18c00	mov x0,x21
00b18c04	mov x2,x25
00b18c08	bl 0x00b174ec
00b18c0c	cbz w0,0x00b18c44
00b18c10	ldr w4,[x29, #0x18]
00b18c14	ldr w3,[x29, #0x10]
00b18c18	mov x0,x21
00b18c1c	mov x1,x23
00b18c20	mov w2,w22
00b18c24	bl 0x00b175e4
00b18c28	cbz w0,0x00b18c44
00b18c2c	ldr x1,[sp, #0x8]
00b18c30	mov x0,x21
00b18c34	mov x2,x19
00b18c38	bl 0x00b1777c
00b18c3c	cmp w0,#0x0
00b18c40	cset w0,ne
00b18c44	ldp x29,x30,[sp, #0x60]
00b18c48	ldp x20,x19,[sp, #0x50]
00b18c4c	ldp x22,x21,[sp, #0x40]
00b18c50	ldp x24,x23,[sp, #0x30]
00b18c54	ldp x26,x25,[sp, #0x20]
00b18c58	ldp x28,x27,[sp, #0x10]
00b18c5c	add sp,sp,#0x70
00b18c60	ret
