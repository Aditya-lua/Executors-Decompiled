; DH_check @ 00a19e80
00a19e80	stp x24,x23,[sp, #-0x40]!
00a19e84	stp x22,x21,[sp, #0x10]
00a19e88	stp x20,x19,[sp, #0x20]
00a19e8c	stp x29,x30,[sp, #0x30]
00a19e90	add x29,sp,#0x30
00a19e94	mov x20,x1
00a19e98	mov x21,x0
00a19e9c	bl 0x00c39e10
00a19ea0	str wzr,[x20]
00a19ea4	cbz w0,0x00a19eb0
00a19ea8	mov w21,#0x1
00a19eac	b 0x00a1a0bc
00a19eb0	ldr x0,[x21, #0x8]
00a19eb4	bl 0x00c322f0
00a19eb8	cmp w0,#0x8, LSL #12
00a19ebc	b.le 0x00a19efc
00a19ec0	bl 0x00c342a0
00a19ec4	adrp x0,0x2d9000
00a19ec8	adrp x2,0x2d9000
00a19ecc	add x0,x0,#0xa63
00a19ed0	add x2,x2,#0xa78
00a19ed4	mov w1,#0x9d
00a19ed8	bl 0x00c342b0
00a19edc	mov w0,#0x5
00a19ee0	mov w1,#0x67
00a19ee4	mov x2,xzr
00a19ee8	bl 0x00c342c0
00a19eec	mov w8,#0x101
00a19ef0	mov w21,wzr
00a19ef4	str w8,[x20]
00a19ef8	b 0x00a1a0bc
00a19efc	mov x0,x21
00a19f00	mov x1,x20
00a19f04	bl 0x00a19b20
00a19f08	cbz w0,0x00a1a004
00a19f0c	ldr x0,[x21, #0xb0]
00a19f10	bl 0x00c38a60
00a19f14	mov x19,x0
00a19f18	cbz x0,0x00a1a0a8
00a19f1c	mov x0,x19
00a19f20	bl 0x00c38a90
00a19f24	mov x0,x19
00a19f28	bl 0x00c38a40
00a19f2c	mov x22,x0
00a19f30	mov x0,x19
00a19f34	bl 0x00c38a40
00a19f38	cbz x0,0x00a1a0a8
00a19f3c	ldr x1,[x21, #0x10]
00a19f40	cbz x1,0x00a1a018
00a19f44	mov x23,x0
00a19f48	ldr x0,[x21, #0x8]
00a19f4c	bl 0x00c369c0
00a19f50	cmp w0,#0x0
00a19f54	b.le 0x00a1a00c
00a19f58	ldr x24,[x21, #0x18]
00a19f5c	bl 0x00c38de0
00a19f60	mov x1,x0
00a19f64	mov x0,x24
00a19f68	bl 0x00c38cc0
00a19f6c	cmp w0,#0x1
00a19f70	b.lt 0x00a19f84
00a19f74	ldr x0,[x21, #0x18]
00a19f78	ldr x1,[x21, #0x8]
00a19f7c	bl 0x00c38cc0
00a19f80	tbnz w0,#0x1f,0x00a1a080
00a19f84	ldr w8,[x20]
00a19f88	orr w8,w8,#0x8
00a19f8c	str w8,[x20]
00a19f90	ldr x0,[x21, #0x10]
00a19f94	mov x1,x19
00a19f98	mov x2,xzr
00a19f9c	bl 0x00c39110
00a19fa0	tbnz w0,#0x1f,0x00a1a0a8
00a19fa4	cbnz w0,0x00a19fb4
00a19fa8	ldr w8,[x20]
00a19fac	orr w8,w8,#0x10
00a19fb0	str w8,[x20]
00a19fb4	ldp x2,x3,[x21, #0x8]
00a19fb8	mov x0,x22
00a19fbc	mov x1,x23
00a19fc0	mov x4,x19
00a19fc4	bl 0x00c38ab0
00a19fc8	cbz w0,0x00a1a0a8
00a19fcc	mov x0,x23
00a19fd0	bl 0x00c38d20
00a19fd4	cbnz w0,0x00a19fe4
00a19fd8	ldr w8,[x20]
00a19fdc	orr w8,w8,#0x20
00a19fe0	str w8,[x20]
00a19fe4	ldr x0,[x21, #0x20]
00a19fe8	cbz x0,0x00a1a018
00a19fec	mov x1,x22
00a19ff0	bl 0x00c38cc0
00a19ff4	cbz w0,0x00a1a018
00a19ff8	ldr w8,[x20]
00a19ffc	orr w8,w8,#0x40
00a1a000	b 0x00a1a014
00a1a004	mov w21,wzr
00a1a008	b 0x00a1a0bc
00a1a00c	ldr w8,[x20]
00a1a010	orr w8,w8,#0x20
00a1a014	str w8,[x20]
00a1a018	ldr x0,[x21, #0x8]
00a1a01c	mov x1,x19
00a1a020	mov x2,xzr
00a1a024	bl 0x00c39110
00a1a028	tbnz w0,#0x1f,0x00a1a0a8
00a1a02c	cbz w0,0x00a1a06c
00a1a030	ldr x8,[x21, #0x10]
00a1a034	cbnz x8,0x00a1a078
00a1a038	ldr x1,[x21, #0x8]
00a1a03c	mov x0,x22
00a1a040	bl 0x00c39080
00a1a044	cbz w0,0x00a1a0a8
00a1a048	mov x0,x22
00a1a04c	mov x1,x19
00a1a050	mov x2,xzr
00a1a054	bl 0x00c39110
00a1a058	tbnz w0,#0x1f,0x00a1a0a8
00a1a05c	cbnz w0,0x00a1a078
00a1a060	ldr w8,[x20]
00a1a064	orr w8,w8,#0x2
00a1a068	b 0x00a1a074
00a1a06c	ldr w8,[x20]
00a1a070	orr w8,w8,#0x1
00a1a074	str w8,[x20]
00a1a078	mov w21,#0x1
00a1a07c	b 0x00a1a0ac
00a1a080	ldp x2,x1,[x21, #0x10]
00a1a084	ldr x3,[x21, #0x8]
00a1a088	mov x0,x22
00a1a08c	mov x4,x19
00a1a090	bl 0x00c38ad0
00a1a094	cbz w0,0x00a1a0a8
00a1a098	mov x0,x22
00a1a09c	bl 0x00c38d20
00a1a0a0	cbnz w0,0x00a19f90
00a1a0a4	b 0x00a19f84
00a1a0a8	mov w21,wzr
00a1a0ac	mov x0,x19
00a1a0b0	bl 0x00c38a20
00a1a0b4	mov x0,x19
00a1a0b8	bl 0x00c38a30
00a1a0bc	mov w0,w21
00a1a0c0	ldp x29,x30,[sp, #0x30]
00a1a0c4	ldp x20,x19,[sp, #0x20]
00a1a0c8	ldp x22,x21,[sp, #0x10]
00a1a0cc	ldp x24,x23,[sp], #0x40
00a1a0d0	ret
