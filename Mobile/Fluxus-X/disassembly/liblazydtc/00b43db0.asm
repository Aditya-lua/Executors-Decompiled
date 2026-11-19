; FUN_00b43db0 @ 00b43db0
00b43db0	stp x24,x23,[sp, #-0x40]!
00b43db4	stp x22,x21,[sp, #0x10]
00b43db8	stp x20,x19,[sp, #0x20]
00b43dbc	stp x29,x30,[sp, #0x30]
00b43dc0	mov x19,x0
00b43dc4	ldr x0,[x0, #0x8]
00b43dc8	add x29,sp,#0x30
00b43dcc	cbz x0,0x00b43e88
00b43dd0	ldr x8,[x19, #0x10]
00b43dd4	cbz x8,0x00b43e88
00b43dd8	mov x22,x3
00b43ddc	mov x20,x2
00b43de0	mov x21,x1
00b43de4	bl 0x00c36880
00b43de8	cbz x0,0x00b43ed0
00b43dec	bl 0x00c3aa70
00b43df0	sxtw x8,w0
00b43df4	add x8,x8,#0x7
00b43df8	lsr x24,x8,#0x3
00b43dfc	cbz x21,0x00b43ed8
00b43e00	ldr x0,[x19, #0x8]
00b43e04	bl 0x00c36880
00b43e08	cbz x0,0x00b43eb4
00b43e0c	bl 0x00c3aa20
00b43e10	cbz x0,0x00b43eb4
00b43e14	mov x23,x0
00b43e18	ldr x0,[x19, #0x8]
00b43e1c	cmp x24,x22
00b43e20	csel x22,x22,x24,hi
00b43e24	bl 0x00c3a810
00b43e28	ldr w8,[x19, #0x18]
00b43e2c	cmn w8,#0x1
00b43e30	b.eq 0x00b43e4c
00b43e34	ubfx w9,w0,#0xc,#0x1
00b43e38	cmp w8,w9
00b43e3c	b.eq 0x00b43e4c
00b43e40	mov x0,x23
00b43e44	bl 0x00c38d20
00b43e48	cbz w0,0x00b43f00
00b43e4c	ldr x23,[x19, #0x8]
00b43e50	ldr x0,[x19, #0x10]
00b43e54	bl 0x00c3a7e0
00b43e58	mov x2,x0
00b43e5c	mov x0,x21
00b43e60	mov x1,x22
00b43e64	mov x3,x23
00b43e68	mov x4,xzr
00b43e6c	bl 0x00c3b020
00b43e70	cmp w0,#0x1
00b43e74	b.lt 0x00b43ee4
00b43e78	sxtw x8,w0
00b43e7c	str x8,[x20]
00b43e80	mov w20,#0x1
00b43e84	b 0x00b43ee8
00b43e88	bl 0x00c342a0
00b43e8c	adrp x0,0x2ae000
00b43e90	adrp x2,0x2b0000
00b43e94	add x0,x0,#0xb1e
00b43e98	add x2,x2,#0xe46
00b43e9c	mov w1,#0x1ba
00b43ea0	bl 0x00c342b0
00b43ea4	mov w0,#0x39
00b43ea8	mov w1,#0x80
00b43eac	mov x2,xzr
00b43eb0	bl 0x00c342c0
00b43eb4	mov w20,wzr
00b43eb8	mov w0,w20
00b43ebc	ldp x29,x30,[sp, #0x30]
00b43ec0	ldp x20,x19,[sp, #0x20]
00b43ec4	ldp x22,x21,[sp, #0x10]
00b43ec8	ldp x24,x23,[sp], #0x40
00b43ecc	ret
00b43ed0	mov x24,xzr
00b43ed4	cbnz x21,0x00b43e00
00b43ed8	str x24,[x20]
00b43edc	mov w20,#0x1
00b43ee0	b 0x00b43eb8
00b43ee4	mov w20,wzr
00b43ee8	ldr x8,[x19, #0x8]
00b43eec	cmp x23,x8
00b43ef0	b.eq 0x00b43eb8
00b43ef4	mov x0,x23
00b43ef8	bl 0x00c3a7c0
00b43efc	b 0x00b43eb8
00b43f00	ldr x0,[x19, #0x8]
00b43f04	bl 0x00c3a7b0
00b43f08	cbz x0,0x00b43eb4
00b43f0c	ldr w8,[x19, #0x18]
00b43f10	mov x23,x0
00b43f14	mov w1,#0x1000
00b43f18	cmp w8,#0x1
00b43f1c	b.ne 0x00b43f28
00b43f20	bl 0x00c3ab40
00b43f24	b 0x00b43e50
00b43f28	bl 0x00c3ac70
00b43f2c	b 0x00b43e50
