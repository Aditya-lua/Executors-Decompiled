; s2i_ASN1_INTEGER @ 00b05dc8
00b05dc8	sub sp,sp,#0x30
00b05dcc	stp x20,x19,[sp, #0x10]
00b05dd0	mov x19,x1
00b05dd4	stp x29,x30,[sp, #0x20]
00b05dd8	add x29,sp,#0x20
00b05ddc	str xzr,[sp, #0x8]
00b05de0	cbz x1,0x00b05e8c
00b05de4	bl 0x00c37710
00b05de8	str x0,[sp, #0x8]
00b05dec	cbz x0,0x00b05efc
00b05df0	mov x8,x19
00b05df4	ldrb w20,[x8], #0x1
00b05df8	cmp w20,#0x2d
00b05dfc	csel x9,x19,x8,ne
00b05e00	ldrb w9,[x9]
00b05e04	csel x19,x8,x19,eq
00b05e08	cmp w9,#0x30
00b05e0c	b.ne 0x00b05ebc
00b05e10	ldrb w8,[x19, #0x1]
00b05e14	orr w8,w8,#0x20
00b05e18	cmp w8,#0x78
00b05e1c	b.ne 0x00b05ebc
00b05e20	add x19,x19,#0x2
00b05e24	add x0,sp,#0x8
00b05e28	mov x1,x19
00b05e2c	bl 0x00c38a10
00b05e30	cbz w0,0x00b05ecc
00b05e34	ldrb w8,[x19, w0, SXTW ]
00b05e38	cbnz w8,0x00b05ecc
00b05e3c	cmp w20,#0x2d
00b05e40	mov w20,wzr
00b05e44	b.ne 0x00b05e58
00b05e48	ldr x0,[sp, #0x8]
00b05e4c	bl 0x00c369b0
00b05e50	cmp w0,#0x0
00b05e54	cset w20,eq
00b05e58	ldr x0,[sp, #0x8]
00b05e5c	mov x1,xzr
00b05e60	bl 0x00c375f0
00b05e64	ldr x8,[sp, #0x8]
00b05e68	mov x19,x0
00b05e6c	mov x0,x8
00b05e70	bl 0x00c36290
00b05e74	cbz x19,0x00b05f44
00b05e78	cbz w20,0x00b05f30
00b05e7c	ldr w8,[x19, #0x4]
00b05e80	orr w8,w8,#0x100
00b05e84	str w8,[x19, #0x4]
00b05e88	b 0x00b05f30
00b05e8c	bl 0x00c342a0
00b05e90	adrp x0,0x2c2000
00b05e94	adrp x2,0x2ba000
00b05e98	add x0,x0,#0x5ca
00b05e9c	add x2,x2,#0x893
00b05ea0	mov w1,#0xca
00b05ea4	bl 0x00c342b0
00b05ea8	mov w0,#0x22
00b05eac	mov w1,#0x6d
00b05eb0	mov x2,xzr
00b05eb4	bl 0x00c342c0
00b05eb8	b 0x00b05f30
00b05ebc	add x0,sp,#0x8
00b05ec0	mov x1,x19
00b05ec4	bl 0x00c38a00
00b05ec8	cbnz w0,0x00b05e34
00b05ecc	ldr x0,[sp, #0x8]
00b05ed0	bl 0x00c36290
00b05ed4	bl 0x00c342a0
00b05ed8	adrp x0,0x2c2000
00b05edc	adrp x2,0x2ba000
00b05ee0	add x0,x0,#0x5ca
00b05ee4	add x2,x2,#0x893
00b05ee8	mov w1,#0xe7
00b05eec	bl 0x00c342b0
00b05ef0	mov w0,#0x22
00b05ef4	mov w1,#0x64
00b05ef8	b 0x00b05f24
00b05efc	bl 0x00c342a0
00b05f00	adrp x0,0x2c2000
00b05f04	adrp x2,0x2ba000
00b05f08	add x0,x0,#0x5ca
00b05f0c	add x2,x2,#0x893
00b05f10	mov w1,#0xcf
00b05f14	bl 0x00c342b0
00b05f18	mov w1,#0x100
00b05f1c	mov w0,#0x22
00b05f20	movk w1,#0xc, LSL #16
00b05f24	mov x2,xzr
00b05f28	bl 0x00c342c0
00b05f2c	mov x19,xzr
00b05f30	mov x0,x19
00b05f34	ldp x29,x30,[sp, #0x20]
00b05f38	ldp x20,x19,[sp, #0x10]
00b05f3c	add sp,sp,#0x30
00b05f40	ret
00b05f44	bl 0x00c342a0
00b05f48	adrp x0,0x2c2000
00b05f4c	adrp x2,0x2ba000
00b05f50	add x0,x0,#0x5ca
00b05f54	add x2,x2,#0x893
00b05f58	mov w1,#0xf1
00b05f5c	bl 0x00c342b0
00b05f60	mov w0,#0x22
00b05f64	mov w1,#0x65
00b05f68	b 0x00b05eb0
