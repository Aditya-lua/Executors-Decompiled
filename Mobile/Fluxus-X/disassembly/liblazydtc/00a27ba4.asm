; EC_GROUP_check_named_curve @ 00a27ba4
00a27ba4	str x21,[sp, #-0x30]!
00a27ba8	stp x20,x19,[sp, #0x10]
00a27bac	mov x20,x0
00a27bb0	stp x29,x30,[sp, #0x20]
00a27bb4	add x29,sp,#0x20
00a27bb8	cbz x0,0x00a27c14
00a27bbc	mov w21,w1
00a27bc0	mov x19,xzr
00a27bc4	cbnz x2,0x00a27bdc
00a27bc8	mov x0,xzr
00a27bcc	bl 0x00c38a60
00a27bd0	mov x2,x0
00a27bd4	mov x19,x0
00a27bd8	cbz x0,0x00a27c4c
00a27bdc	mov x0,x20
00a27be0	mov x1,x2
00a27be4	bl 0x00c3abd0
00a27be8	mov w20,w0
00a27bec	cbz w21,0x00a27c08
00a27bf0	cmp w20,#0x1
00a27bf4	b.lt 0x00a27c08
00a27bf8	mov w0,w20
00a27bfc	bl 0x00c3ae40
00a27c00	cmp x0,#0x0
00a27c04	csel w20,wzr,w20,eq
00a27c08	mov x0,x19
00a27c0c	bl 0x00c38a30
00a27c10	b 0x00a27c80
00a27c14	bl 0x00c342a0
00a27c18	adrp x0,0x2bd000
00a27c1c	adrp x2,0x2a7000
00a27c20	add x0,x0,#0x8f4
00a27c24	add x2,x2,#0xdfc
00a27c28	mov w1,#0x1a
00a27c2c	bl 0x00c342b0
00a27c30	mov w8,#0x100
00a27c34	movk w8,#0xc, LSL #16
00a27c38	add w1,w8,#0x2
00a27c3c	mov w0,#0x10
00a27c40	mov x2,xzr
00a27c44	bl 0x00c342c0
00a27c48	b 0x00a27c80
00a27c4c	bl 0x00c342a0
00a27c50	adrp x0,0x2bd000
00a27c54	adrp x2,0x2a7000
00a27c58	add x0,x0,#0x8f4
00a27c5c	add x2,x2,#0xdfc
00a27c60	mov w1,#0x21
00a27c64	bl 0x00c342b0
00a27c68	mov w1,#0x100
00a27c6c	mov w0,#0x10
00a27c70	movk w1,#0xc, LSL #16
00a27c74	mov x2,xzr
00a27c78	bl 0x00c342c0
00a27c7c	mov w20,wzr
00a27c80	mov w0,w20
00a27c84	ldp x29,x30,[sp, #0x20]
00a27c88	ldp x20,x19,[sp, #0x10]
00a27c8c	ldr x21,[sp], #0x30
00a27c90	ret
