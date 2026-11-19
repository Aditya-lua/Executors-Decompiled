; FUN_00b50d8c @ 00b50d8c
00b50d8c	sub sp,sp,#0x80
00b50d90	stp x22,x21,[sp, #0x50]
00b50d94	stp x20,x19,[sp, #0x60]
00b50d98	stp x29,x30,[sp, #0x70]
00b50d9c	str x23,[sp, #0x40]
00b50da0	ldr x23,[x0, #0x58]
00b50da4	add x29,sp,#0x70
00b50da8	mov x22,x3
00b50dac	mov w20,w2
00b50db0	mov x19,x0
00b50db4	mov w21,w1
00b50db8	bl 0x00c41000
00b50dbc	cbz w0,0x00b50ee0
00b50dc0	ands w8,w21,#0x3
00b50dc4	b.eq 0x00b50ddc
00b50dc8	cmp x23,x22
00b50dcc	b.ne 0x00b50de4
00b50dd0	tbnz w21,#0x1,0x00b50e18
00b50dd4	mov w10,#0x1
00b50dd8	b 0x00b50e20
00b50ddc	mov w0,#0x1
00b50de0	b 0x00b50ee0
00b50de4	bl 0x00c342a0
00b50de8	adrp x0,0x2a6000
00b50dec	adrp x2,0x2b6000
00b50df0	add x0,x0,#0xc95
00b50df4	add x2,x2,#0x9ca
00b50df8	mov w1,#0x2f9
00b50dfc	bl 0x00c342b0
00b50e00	mov w0,#0x39
00b50e04	mov w1,#0xad
00b50e08	mov x2,xzr
00b50e0c	bl 0x00c342c0
00b50e10	mov w0,wzr
00b50e14	b 0x00b50ee0
00b50e18	ldrb w9,[x19, #0x10]
00b50e1c	and w10,w9,#0x1
00b50e20	tst w21,#0x1
00b50e24	cset w9,eq
00b50e28	and w9,w9,w10
00b50e2c	tbz w21,#0x0,0x00b50e40
00b50e30	cbz w10,0x00b50e40
00b50e34	ldr x9,[x19, #0x50]
00b50e38	cmp x9,#0x0
00b50e3c	cset w9,ne
00b50e40	cmp w8,#0x3
00b50e44	cset w8,ne
00b50e48	and w0,w8,w9
00b50e4c	b.ne 0x00b50ee0
00b50e50	cbz w9,0x00b50ee0
00b50e54	cmp w20,#0x3
00b50e58	b.hi 0x00b50e84
00b50e5c	adrp x9,0x77c000
00b50e60	mov w8,w20
00b50e64	add x9,x9,#0x1c0
00b50e68	ldrsw x8,[x9, x8, LSL #0x2]
00b50e6c	add x8,x8,x9
00b50e70	br x8
00b50e74	ldr x1,[x19, #0x50]
00b50e78	mov x0,sp
00b50e7c	bl 0x00c3a6b0
00b50e80	b 0x00b50ec8
00b50e84	mov w0,wzr
00b50e88	b 0x00b50ee0
00b50e8c	ldr x1,[x19, #0x50]
00b50e90	mov x0,sp
00b50e94	bl 0x00c3a550
00b50e98	b 0x00b50ec8
00b50e9c	ldr x2,[x19, #0x50]
00b50ea0	ldp x0,x3,[x19]
00b50ea4	mov x1,sp
00b50ea8	bl 0x00c3a670
00b50eac	cbnz w0,0x00b50ec8
00b50eb0	b 0x00b50ee0
00b50eb4	ldr x2,[x19, #0x50]
00b50eb8	ldp x0,x3,[x19]
00b50ebc	mov x1,sp
00b50ec0	bl 0x00c3a560
00b50ec4	cbz w0,0x00b50ee0
00b50ec8	ldr x2,[x19, #0x58]
00b50ecc	add x0,x19,#0x11
00b50ed0	mov x1,sp
00b50ed4	bl 0x00c362f0
00b50ed8	cmp w0,#0x0
00b50edc	cset w0,eq
00b50ee0	ldp x29,x30,[sp, #0x70]
00b50ee4	ldp x20,x19,[sp, #0x60]
00b50ee8	ldp x22,x21,[sp, #0x50]
00b50eec	ldr x23,[sp, #0x40]
00b50ef0	add sp,sp,#0x80
00b50ef4	ret
