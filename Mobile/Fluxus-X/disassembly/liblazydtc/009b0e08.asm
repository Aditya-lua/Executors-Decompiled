; SSL_CIPHER_get_cipher_nid @ 009b0e08
009b0e08	cbz x0,0x009b0fac
009b0e0c	ldr w8,[x0, #0x24]
009b0e10	mov w0,wzr
009b0e14	cmp w8,#0xfff
009b0e18	b.gt 0x009b0e50
009b0e1c	cmp w8,#0x7f
009b0e20	b.gt 0x009b0ea8
009b0e24	sub w8,w8,#0x1
009b0e28	cmp w8,#0x3f
009b0e2c	b.hi 0x009b0fac
009b0e30	adrp x9,0x74b000
009b0e34	add x9,x9,#0xa4c
009b0e38	ldrsw x8,[x9, x8, LSL #0x2]
009b0e3c	add x9,x8,x9
009b0e40	mov x8,xzr
009b0e44	br x9
009b0e48	mov w8,#0x1
009b0e4c	b 0x009b0f9c
009b0e50	cmp w8,#0x40, LSL #12
009b0e54	b.ge 0x009b0e80
009b0e58	cmp w8,#0x8, LSL #12
009b0e5c	b.ge 0x009b0ed0
009b0e60	cmp w8,#0x1, LSL #12
009b0e64	b.eq 0x009b0f48
009b0e68	cmp w8,#0x2, LSL #12
009b0e6c	b.eq 0x009b0f50
009b0e70	cmp w8,#0x4, LSL #12
009b0e74	b.ne 0x009b0fac
009b0e78	orr w8,wzr,#0xe
009b0e7c	b 0x009b0f9c
009b0e80	cmp w8,#0x200, LSL #12
009b0e84	b.ge 0x009b0eec
009b0e88	cmp w8,#0x40, LSL #12
009b0e8c	b.eq 0x009b0f58
009b0e90	cmp w8,#0x80, LSL #12
009b0e94	b.eq 0x009b0f60
009b0e98	cmp w8,#0x100, LSL #12
009b0e9c	b.ne 0x009b0fac
009b0ea0	mov w8,#0x14
009b0ea4	b 0x009b0f9c
009b0ea8	cmp w8,#0x1ff
009b0eac	b.le 0x009b0f08
009b0eb0	cmp w8,#0x200
009b0eb4	b.eq 0x009b0f68
009b0eb8	cmp w8,#0x400
009b0ebc	b.eq 0x009b0f70
009b0ec0	cmp w8,#0x800
009b0ec4	b.ne 0x009b0fac
009b0ec8	mov w8,#0xb
009b0ecc	b 0x009b0f9c
009b0ed0	b.eq 0x009b0f78
009b0ed4	cmp w8,#0x10, LSL #12
009b0ed8	b.eq 0x009b0f80
009b0edc	cmp w8,#0x20, LSL #12
009b0ee0	b.ne 0x009b0fac
009b0ee4	mov w8,#0x11
009b0ee8	b 0x009b0f9c
009b0eec	b.eq 0x009b0f88
009b0ef0	cmp w8,#0x400, LSL #12
009b0ef4	b.eq 0x009b0f90
009b0ef8	cmp w8,#0x800, LSL #12
009b0efc	b.ne 0x009b0fac
009b0f00	mov w8,#0x17
009b0f04	b 0x009b0f9c
009b0f08	cmp w8,#0x80
009b0f0c	b.eq 0x009b0f98
009b0f10	cmp w8,#0x100
009b0f14	b.ne 0x009b0fac
009b0f18	mov w8,#0x8
009b0f1c	b 0x009b0f9c
009b0f20	mov w8,#0x2
009b0f24	b 0x009b0f9c
009b0f28	orr w8,wzr,#0x3
009b0f2c	b 0x009b0f9c
009b0f30	mov w8,#0x4
009b0f34	b 0x009b0f9c
009b0f38	mov w8,#0x5
009b0f3c	b 0x009b0f9c
009b0f40	orr w8,wzr,#0x6
009b0f44	b 0x009b0f9c
009b0f48	orr w8,wzr,#0xc
009b0f4c	b 0x009b0f9c
009b0f50	mov w8,#0xd
009b0f54	b 0x009b0f9c
009b0f58	mov w8,#0x12
009b0f5c	b 0x009b0f9c
009b0f60	mov w8,#0x13
009b0f64	b 0x009b0f9c
009b0f68	mov w8,#0x9
009b0f6c	b 0x009b0f9c
009b0f70	mov w8,#0xa
009b0f74	b 0x009b0f9c
009b0f78	orr w8,wzr,#0xf
009b0f7c	b 0x009b0f9c
009b0f80	mov w8,#0x10
009b0f84	b 0x009b0f9c
009b0f88	mov w8,#0x15
009b0f8c	b 0x009b0f9c
009b0f90	mov w8,#0x16
009b0f94	b 0x009b0f9c
009b0f98	orr w8,wzr,#0x7
009b0f9c	adrp x9,0x74b000
009b0fa0	add x9,x9,#0xe5c
009b0fa4	add x8,x9,x8, LSL #0x3
009b0fa8	ldr w0,[x8, #0x4]
009b0fac	ret
