; ZSTD_DCtx_setParameter @ 00bb2b1c
00bb2b1c	add x8,x0,#0x7, LSL #12
00bb2b20	ldr w9,[x8, #0x61c]
00bb2b24	cbz w9,0x00bb2b30
00bb2b28	mov x0,#-0x3c
00bb2b2c	ret
00bb2b30	mov x9,x0
00bb2b34	cmp w1,#0x3e9
00bb2b38	mov x0,#-0x28
00bb2b3c	b.le 0x00bb2b68
00bb2b40	cmp w1,#0x3eb
00bb2b44	b.gt 0x00bb2b90
00bb2b48	cmp w1,#0x3ea
00bb2b4c	b.eq 0x00bb2be0
00bb2b50	cmp w1,#0x3eb
00bb2b54	b.ne 0x00bb2c50
00bb2b58	cmp w2,#0x1
00bb2b5c	b.ls 0x00bb2c48
00bb2b60	mov x0,#-0x2a
00bb2b64	ret
00bb2b68	cmp w1,#0x64
00bb2b6c	b.eq 0x00bb2bc0
00bb2b70	cmp w1,#0x3e8
00bb2b74	b.eq 0x00bb2c00
00bb2b78	cmp w1,#0x3e9
00bb2b7c	b.ne 0x00bb2c50
00bb2b80	cmp w2,#0x1
00bb2b84	b.ls 0x00bb2c54
00bb2b88	mov x0,#-0x2a
00bb2b8c	ret
00bb2b90	cmp w1,#0x3ec
00bb2b94	b.eq 0x00bb2bf0
00bb2b98	cmp w1,#0x3ed
00bb2b9c	b.ne 0x00bb2c50
00bb2ba0	cbz w2,0x00bb2c3c
00bb2ba4	sub w9,w2,#0x20, LSL #12
00bb2ba8	orr w10,wzr,#0xfffe03ff
00bb2bac	sub w9,w9,#0x1
00bb2bb0	cmp w9,w10
00bb2bb4	b.cs 0x00bb2c3c
00bb2bb8	mov x0,#-0x2a
00bb2bbc	ret
00bb2bc0	cmp w2,#0x0
00bb2bc4	mov w8,#0x1b
00bb2bc8	csel w8,w8,w2,eq
00bb2bcc	sub w10,w8,#0x20
00bb2bd0	cmn w10,#0x16
00bb2bd4	b.cs 0x00bb2c10
00bb2bd8	mov x0,#-0x2a
00bb2bdc	ret
00bb2be0	cmp w2,#0x1
00bb2be4	b.ls 0x00bb2c24
00bb2be8	mov x0,#-0x2a
00bb2bec	ret
00bb2bf0	cmp w2,#0x1
00bb2bf4	b.ls 0x00bb2c30
00bb2bf8	mov x0,#-0x2a
00bb2bfc	ret
00bb2c00	cmp w2,#0x1
00bb2c04	b.ls 0x00bb2c60
00bb2c08	mov x0,#-0x2a
00bb2c0c	ret
00bb2c10	mov w10,#0x1
00bb2c14	mov x0,xzr
00bb2c18	lsl x8,x10,x8
00bb2c1c	str x8,[x9, #0x7638]
00bb2c20	ret
00bb2c24	mov x0,xzr
00bb2c28	str w2,[x8, #0x59c]
00bb2c2c	ret
00bb2c30	mov x0,xzr
00bb2c34	str w2,[x8, #0x614]
00bb2c38	ret
00bb2c3c	mov x0,xzr
00bb2c40	str w2,[x8, #0x618]
00bb2c44	ret
00bb2c48	ldr x9,[x9, #0x75d8]
00bb2c4c	cbz x9,0x00bb2c6c
00bb2c50	ret
00bb2c54	mov x0,xzr
00bb2c58	str w2,[x8, #0x670]
00bb2c5c	ret
00bb2c60	mov x0,xzr
00bb2c64	str w2,[x8, #0x598]
00bb2c68	ret
00bb2c6c	mov x0,xzr
00bb2c70	str w2,[x8, #0x610]
00bb2c74	ret
