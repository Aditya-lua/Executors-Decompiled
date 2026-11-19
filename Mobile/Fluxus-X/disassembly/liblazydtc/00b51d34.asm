; FUN_00b51d34 @ 00b51d34
00b51d34	stp x22,x21,[sp, #-0x30]!
00b51d38	stp x20,x19,[sp, #0x10]
00b51d3c	mov x20,x1
00b51d40	adrp x1,0x2a3000
00b51d44	mov x19,x0
00b51d48	add x1,x1,#0xe83
00b51d4c	mov x0,x20
00b51d50	stp x29,x30,[sp, #0x20]
00b51d54	add x29,sp,#0x20
00b51d58	bl 0x00c36530
00b51d5c	cbz x0,0x00b51db8
00b51d60	ldr w8,[x0, #0x8]
00b51d64	mov x21,x0
00b51d68	cmp w8,#0x5
00b51d6c	b.ne 0x00b51e38
00b51d70	ldp x0,x1,[x19, #0x18]
00b51d74	adrp x22,0x2be000
00b51d78	add x22,x22,#0xa4e
00b51d7c	mov w3,#0xc2
00b51d80	mov x2,x22
00b51d84	bl 0x00c38e10
00b51d88	ldr x8,[x21, #0x18]
00b51d8c	mov w2,#0xc4
00b51d90	mov x1,x22
00b51d94	cmp x8,#0x0
00b51d98	csinc x0,x8,xzr,ne
00b51d9c	bl 0x00c39220
00b51da0	str x0,[x19, #0x18]
00b51da4	cbz x0,0x00b51e70
00b51da8	ldp x1,x2,[x21, #0x10]
00b51dac	bl 0x00c2ffd0
00b51db0	ldr x8,[x21, #0x18]
00b51db4	str x8,[x19, #0x20]
00b51db8	adrp x1,0x2d3000
00b51dbc	add x1,x1,#0x7c2
00b51dc0	mov x0,x20
00b51dc4	bl 0x00c36530
00b51dc8	cbz x0,0x00b51e0c
00b51dcc	ldr w8,[x0, #0x8]
00b51dd0	mov x21,x0
00b51dd4	cmp w8,#0x4
00b51dd8	b.ne 0x00b51e54
00b51ddc	ldr x0,[x19, #0x40]
00b51de0	adrp x22,0x2be000
00b51de4	add x22,x22,#0xa4e
00b51de8	mov w2,#0xd3
00b51dec	mov x1,x22
00b51df0	bl 0x00c32310
00b51df4	ldr x0,[x21, #0x10]
00b51df8	mov w2,#0xd4
00b51dfc	mov x1,x22
00b51e00	bl 0x00c34600
00b51e04	str x0,[x19, #0x40]
00b51e08	cbz x0,0x00b51eb8
00b51e0c	ldr w8,[x19, #0x48]
00b51e10	cbz w8,0x00b51e28
00b51e14	ldr x2,[x19, #0x8]
00b51e18	add x0,x19,#0x28
00b51e1c	mov x1,x20
00b51e20	bl 0x00c41100
00b51e24	cbz w0,0x00b51e8c
00b51e28	ldr x8,[x19, #0x18]
00b51e2c	cmp x8,#0x0
00b51e30	cset w0,ne
00b51e34	b 0x00b51eec
00b51e38	bl 0x00c342a0
00b51e3c	adrp x0,0x2be000
00b51e40	adrp x2,0x2b3000
00b51e44	add x0,x0,#0xa4e
00b51e48	add x2,x2,#0x79
00b51e4c	mov w1,#0xbf
00b51e50	b 0x00b51ea4
00b51e54	bl 0x00c342a0
00b51e58	adrp x0,0x2be000
00b51e5c	adrp x2,0x2b3000
00b51e60	add x0,x0,#0xa4e
00b51e64	add x2,x2,#0x79
00b51e68	mov w1,#0xd0
00b51e6c	b 0x00b51ea4
00b51e70	bl 0x00c342a0
00b51e74	adrp x0,0x2be000
00b51e78	adrp x2,0x2b3000
00b51e7c	add x0,x0,#0xa4e
00b51e80	add x2,x2,#0x79
00b51e84	mov w1,#0xc6
00b51e88	b 0x00b51ed0
00b51e8c	bl 0x00c342a0
00b51e90	adrp x0,0x2be000
00b51e94	adrp x2,0x2b3000
00b51e98	add x0,x0,#0xa4e
00b51e9c	add x2,x2,#0x79
00b51ea0	mov w1,#0xdd
00b51ea4	bl 0x00c342b0
00b51ea8	mov w1,#0x106
00b51eac	mov w0,#0x39
00b51eb0	movk w1,#0x8, LSL #16
00b51eb4	b 0x00b51ee0
00b51eb8	bl 0x00c342a0
00b51ebc	adrp x0,0x2be000
00b51ec0	adrp x2,0x2b3000
00b51ec4	add x0,x0,#0xa4e
00b51ec8	add x2,x2,#0x79
00b51ecc	mov w1,#0xd6
00b51ed0	bl 0x00c342b0
00b51ed4	mov w1,#0x100
00b51ed8	mov w0,#0x39
00b51edc	movk w1,#0xc, LSL #16
00b51ee0	mov x2,xzr
00b51ee4	bl 0x00c342c0
00b51ee8	mov w0,wzr
00b51eec	ldp x29,x30,[sp, #0x20]
00b51ef0	ldp x20,x19,[sp, #0x10]
00b51ef4	ldp x22,x21,[sp], #0x30
00b51ef8	ret
