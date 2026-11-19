; ssl_cipher_disabled @ 009c2d08
009c2d08	ldr w9,[x1, #0x1c]
009c2d0c	ldr w8,[x0, #0x3dc]
009c2d10	tst w8,w9
009c2d14	b.eq 0x009c2d20
009c2d18	mov w0,#0x1
009c2d1c	ret
009c2d20	ldr w8,[x1, #0x20]
009c2d24	ldr w10,[x0, #0x3e0]
009c2d28	mov x4,x1
009c2d2c	tst w10,w8
009c2d30	b.eq 0x009c2d3c
009c2d34	mov w0,#0x1
009c2d38	ret
009c2d3c	ldr w8,[x0, #0x3e8]
009c2d40	cbz w8,0x009c2d84
009c2d44	ldr x10,[x0, #0x8]
009c2d48	ldr x10,[x10, #0xc0]
009c2d4c	ldrb w10,[x10, #0x60]
009c2d50	tbnz w10,#0x3,0x009c2d8c
009c2d54	ldr w10,[x4, #0x2c]
009c2d58	mov w11,#0x84
009c2d5c	and w9,w9,w11
009c2d60	cmp w10,#0x301
009c2d64	ccmp w3,#0x0,#0x4,eq
009c2d68	ccmp w9,#0x0,#0x4,ne
009c2d6c	orr w9,wzr,#0x300
009c2d70	csel w9,w10,w9,eq
009c2d74	cmp w9,w8
009c2d78	b.le 0x009c2db4
009c2d7c	mov w0,#0x1
009c2d80	ret
009c2d84	mov w0,#0x1
009c2d88	ret
009c2d8c	ldr w10,[x4, #0x34]
009c2d90	orr w9,wzr,#0xff00
009c2d94	cmp w10,#0x100
009c2d98	csel w10,w9,w10,eq
009c2d9c	cmp w8,#0x100
009c2da0	csel w8,w9,w8,eq
009c2da4	cmp w10,w8
009c2da8	b.ge 0x009c2dcc
009c2dac	mov w0,#0x1
009c2db0	ret
009c2db4	ldr w8,[x4, #0x30]
009c2db8	ldr w9,[x0, #0x3e4]
009c2dbc	cmp w8,w9
009c2dc0	b.ge 0x009c2df4
009c2dc4	mov w0,#0x1
009c2dc8	ret
009c2dcc	ldr w8,[x4, #0x38]
009c2dd0	ldr w10,[x0, #0x3e4]
009c2dd4	cmp w8,#0x100
009c2dd8	csel w8,w9,w8,eq
009c2ddc	cmp w10,#0x100
009c2de0	csel w9,w9,w10,eq
009c2de4	cmp w8,w9
009c2de8	b.le 0x009c2df4
009c2dec	mov w0,#0x1
009c2df0	ret
009c2df4	stp x29,x30,[sp, #-0x10]!
009c2df8	ldr w8,[x4, #0x44]
009c2dfc	mov w1,w2
009c2e00	mov w3,wzr
009c2e04	mov x29,sp
009c2e08	mov w2,w8
009c2e0c	bl 0x00c34a30
009c2e10	cmp w0,#0x0
009c2e14	cset w0,eq
009c2e18	ldp x29,x30,[sp], #0x10
009c2e1c	ret
