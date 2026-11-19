; PEM_ASN1_read @ 00ab5b80
00ab5b80	str x25,[sp, #-0x50]!
00ab5b84	stp x24,x23,[sp, #0x10]
00ab5b88	stp x22,x21,[sp, #0x20]
00ab5b8c	stp x20,x19,[sp, #0x30]
00ab5b90	stp x29,x30,[sp, #0x40]
00ab5b94	add x29,sp,#0x40
00ab5b98	mov x19,x5
00ab5b9c	mov x20,x4
00ab5ba0	mov x21,x3
00ab5ba4	mov x25,x2
00ab5ba8	mov x22,x1
00ab5bac	mov x24,x0
00ab5bb0	bl 0x00c32270
00ab5bb4	bl 0x00c32240
00ab5bb8	cbz x0,0x00ab5c00
00ab5bbc	mov w1,#0x6a
00ab5bc0	mov x2,xzr
00ab5bc4	mov x3,x25
00ab5bc8	mov x23,x0
00ab5bcc	bl 0x00c321a0
00ab5bd0	mov x0,x24
00ab5bd4	mov x1,x22
00ab5bd8	mov x2,x23
00ab5bdc	mov x3,x21
00ab5be0	mov x4,x20
00ab5be4	mov x5,x19
00ab5be8	bl 0x00c36050
00ab5bec	mov x19,x0
00ab5bf0	mov x0,x23
00ab5bf4	bl 0x00c31a40
00ab5bf8	mov x0,x19
00ab5bfc	b 0x00ab5c34
00ab5c00	bl 0x00c342a0
00ab5c04	adrp x0,0x2ce000
00ab5c08	adrp x2,0x2d6000
00ab5c0c	add x0,x0,#0x16c
00ab5c10	add x2,x2,#0x42a
00ab5c14	mov w1,#0x74
00ab5c18	bl 0x00c342b0
00ab5c1c	mov w1,#0x7
00ab5c20	mov w0,#0x9
00ab5c24	movk w1,#0x8, LSL #16
00ab5c28	mov x2,xzr
00ab5c2c	bl 0x00c342c0
00ab5c30	mov x0,xzr
00ab5c34	ldp x29,x30,[sp, #0x40]
00ab5c38	ldp x20,x19,[sp, #0x30]
00ab5c3c	ldp x22,x21,[sp, #0x20]
00ab5c40	ldp x24,x23,[sp, #0x10]
00ab5c44	ldr x25,[sp], #0x50
00ab5c48	ret
