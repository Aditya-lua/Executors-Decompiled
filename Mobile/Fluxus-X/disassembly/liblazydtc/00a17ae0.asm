; DHparams_print @ 00a17ae0
00a17ae0	mov w2,#0x4
00a17ae4	mov w3,wzr
00a17ae8	b 0x00a17aec
00a17aec	stp x26,x25,[sp, #-0x50]!
00a17af0	stp x22,x21,[sp, #0x20]
00a17af4	stp x20,x19,[sp, #0x30]
00a17af8	mov w26,w3
00a17afc	mov w22,w2
00a17b00	mov x21,x1
00a17b04	cmp w3,#0x2
00a17b08	mov x20,x0
00a17b0c	stp x24,x23,[sp, #0x10]
00a17b10	stp x29,x30,[sp, #0x40]
00a17b14	add x29,sp,#0x40
00a17b18	b.ne 0x00a17b24
00a17b1c	ldr x25,[x21, #0x78]
00a17b20	b 0x00a17b30
00a17b24	cmp w26,#0x1
00a17b28	b.lt 0x00a17cc0
00a17b2c	mov x25,xzr
00a17b30	ldr x23,[x21, #0x70]
00a17b34	mov w8,#0x1
00a17b38	cmp w26,#0x2
00a17b3c	mov x24,x21
00a17b40	cset w10,eq
00a17b44	ldr x9,[x24, #0x8]!
00a17b48	cmp x25,#0x0
00a17b4c	cset w11,eq
00a17b50	cmp x23,#0x0
00a17b54	cset w12,eq
00a17b58	mov w19,#0x102
00a17b5c	and w8,w8,w12
00a17b60	movk w19,#0xc, LSL #16
00a17b64	tbnz w8,#0x0,0x00a17c78
00a17b68	and w8,w10,w11
00a17b6c	tbnz w8,#0x0,0x00a17c78
00a17b70	cbz x9,0x00a17c78
00a17b74	mov w19,#0x7
00a17b78	mov w2,#0x80
00a17b7c	mov x0,x20
00a17b80	mov w1,w22
00a17b84	movk w19,#0x8, LSL #16
00a17b88	bl 0x00c38640
00a17b8c	cbz w0,0x00a17c78
00a17b90	adrp x8,0x29f000
00a17b94	adrp x9,0x2c5000
00a17b98	add x8,x8,#0xfa5
00a17b9c	add x9,x9,#0x836
00a17ba0	cmp w26,#0x1
00a17ba4	adrp x10,0x2d7000
00a17ba8	add x10,x10,#0xcc7
00a17bac	csel x8,x9,x8,eq
00a17bb0	cmp w26,#0x2
00a17bb4	mov x0,x21
00a17bb8	csel x26,x10,x8,eq
00a17bbc	bl 0x00c39a70
00a17bc0	adrp x1,0x2c5000
00a17bc4	mov w3,w0
00a17bc8	add x1,x1,#0x844
00a17bcc	mov x0,x20
00a17bd0	mov x2,x26
00a17bd4	bl 0x00c32250
00a17bd8	cmp w0,#0x1
00a17bdc	b.lt 0x00a17c78
00a17be0	add w22,w22,#0x4
00a17be4	adrp x1,0x29e000
00a17be8	add x1,x1,#0x1f
00a17bec	mov x0,x20
00a17bf0	mov x2,x25
00a17bf4	mov x3,xzr
00a17bf8	mov w4,w22
00a17bfc	bl 0x00c37f60
00a17c00	cbz w0,0x00a17c78
00a17c04	adrp x1,0x2a2000
00a17c08	add x1,x1,#0x211
00a17c0c	mov x0,x20
00a17c10	mov x2,x23
00a17c14	mov x3,xzr
00a17c18	mov w4,w22
00a17c1c	bl 0x00c37f60
00a17c20	cbz w0,0x00a17c78
00a17c24	mov x0,x20
00a17c28	mov x1,x24
00a17c2c	mov w2,w22
00a17c30	bl 0x00c39c90
00a17c34	cbz w0,0x00a17c78
00a17c38	ldr w8,[x21, #0x68]
00a17c3c	cbz w8,0x00a17c70
00a17c40	mov w2,#0x80
00a17c44	mov x0,x20
00a17c48	mov w1,w22
00a17c4c	bl 0x00c38640
00a17c50	cbz w0,0x00a17c78
00a17c54	ldr w2,[x21, #0x68]
00a17c58	adrp x1,0x2c7000
00a17c5c	add x1,x1,#0x78d
00a17c60	mov x0,x20
00a17c64	bl 0x00c32250
00a17c68	cmp w0,#0x0
00a17c6c	b.le 0x00a17c78
00a17c70	mov w0,#0x1
00a17c74	b 0x00a17ca8
00a17c78	bl 0x00c342a0
00a17c7c	adrp x0,0x2d1000
00a17c80	adrp x2,0x29f000
00a17c84	add x0,x0,#0x784
00a17c88	add x2,x2,#0xfb3
00a17c8c	mov w1,#0x128
00a17c90	bl 0x00c342b0
00a17c94	mov w0,#0x5
00a17c98	mov w1,w19
00a17c9c	mov x2,xzr
00a17ca0	bl 0x00c342c0
00a17ca4	mov w0,wzr
00a17ca8	ldp x29,x30,[sp, #0x40]
00a17cac	ldp x20,x19,[sp, #0x30]
00a17cb0	ldp x22,x21,[sp, #0x20]
00a17cb4	ldp x24,x23,[sp, #0x10]
00a17cb8	ldp x26,x25,[sp], #0x50
00a17cbc	ret
00a17cc0	mov w8,wzr
00a17cc4	mov x25,xzr
00a17cc8	mov x23,xzr
00a17ccc	b 0x00a17b38
