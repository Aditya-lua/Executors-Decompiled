; ssl_protocol_to_string @ 009b6ec0
009b6ec0	mov w8,#0xfefc
009b6ec4	cmp w0,w8
009b6ec8	b.gt 0x009b6f00
009b6ecc	sub w8,w0,#0x300
009b6ed0	cmp w8,#0x4
009b6ed4	b.hi 0x009b6f24
009b6ed8	adrp x9,0x74c000
009b6edc	add x9,x9,#0x468
009b6ee0	ldrsw x8,[x9, x8, LSL #0x2]
009b6ee4	adrp x0,0x2b5000
009b6ee8	add x0,x0,#0x629
009b6eec	add x8,x8,x9
009b6ef0	br x8
009b6ef4	adrp x0,0x2cb000
009b6ef8	add x0,x0,#0x285
009b6efc	ret
009b6f00	mov w8,#0xfefd
009b6f04	cmp w0,w8
009b6f08	b.eq 0x009b6f5c
009b6f0c	mov w8,#0xfeff
009b6f10	cmp w0,w8
009b6f14	b.ne 0x009b6f68
009b6f18	adrp x0,0x2d7000
009b6f1c	add x0,x0,#0xa16
009b6f20	ret
009b6f24	cmp w0,#0x100
009b6f28	b.ne 0x009b6f68
009b6f2c	adrp x0,0x2c1000
009b6f30	add x0,x0,#0x6ac
009b6f34	ret
009b6f38	adrp x0,0x2d5000
009b6f3c	add x0,x0,#0x70d
009b6f40	ret
009b6f44	adrp x0,0x29d000
009b6f48	add x0,x0,#0xa07
009b6f4c	ret
009b6f50	adrp x0,0x2d9000
009b6f54	add x0,x0,#0x2ff
009b6f58	ret
009b6f5c	adrp x0,0x2c7000
009b6f60	add x0,x0,#0x602
009b6f64	ret
009b6f68	adrp x0,0x2ab000
009b6f6c	add x0,x0,#0x4b6
009b6f70	ret
