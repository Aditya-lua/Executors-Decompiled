; ix::WebSocketTransport::poll @ 00997d78
00997d78	sub sp,sp,#0x60
00997d7c	stp x24,x23,[sp, #0x20]
00997d80	stp x22,x21,[sp, #0x30]
00997d84	stp x20,x19,[sp, #0x40]
00997d88	stp x29,x30,[sp, #0x50]
00997d8c	add x29,sp,#0x50
00997d90	mrs x21,tpidr_el0
00997d94	ldr x8,[x21, #0x28]
00997d98	add x22,x0,#0xe0
00997d9c	mov x19,x0
00997da0	str x8,[sp, #0x18]
00997da4	ldar w8,[x22]
00997da8	cmp w8,#0x3
00997dac	b.ne 0x00997e44
00997db0	ldr w8,[x19, #0x27c]
00997db4	cmp w8,#0x1
00997db8	b.lt 0x00997e44
00997dbc	add x20,x19,#0x2b0
00997dc0	mov x0,x20
00997dc4	bl 0x00c2ff10
00997dc8	bl 0x00c31900
00997dcc	ldr x8,[x19, #0x2d8]
00997dd0	ldrsw x9,[x19, #0x27c]
00997dd4	mov w10,#0xca00
00997dd8	movk w10,#0x3b9a, LSL #16
00997ddc	sub x23,x0,x8
00997de0	mov x0,x20
00997de4	mul x24,x9,x10
00997de8	bl 0x00c2ff20
00997dec	cmp x24,x23
00997df0	b.ge 0x00997e44
00997df4	ldr w1,[x19, #0x2a0]
00997df8	cmp w1,#0x2
00997dfc	b.ne 0x00997e38
00997e00	add x8,x19,#0x280
00997e04	ldarb w8,[x8]
00997e08	tbnz w8,#0x0,0x00997e34
00997e0c	adrp x8,0xcb5000
00997e10	ldr x8,[x8, #0x68]
00997e14	adrp x2,0xcb5000
00997e18	mov x0,x19
00997e1c	mov x3,xzr
00997e20	ldrh w1,[x8]
00997e24	ldr x2,[x2, #0x78]
00997e28	mov w4,wzr
00997e2c	bl 0x00c33890
00997e30	b 0x00997e44
00997e34	ldr w1,[x19, #0x2a0]
00997e38	mov x8,sp
00997e3c	mov x0,x19
00997e40	bl 0x00c33840
00997e44	ldar w8,[x22]
00997e48	ldr w9,[x19, #0x27c]
00997e4c	cmp w8,#0x3
00997e50	csel w20,w9,wzr,eq
00997e54	cmp w9,#0x1
00997e58	b.lt 0x00997e98
00997e5c	bl 0x00c31900
00997e60	ldr x8,[x19, #0x2d8]
00997e64	mov x9,#0x34db
00997e68	movk x9,#0xd7b6, LSL #16
00997e6c	movk x9,#0xde82, LSL #32
00997e70	movk x9,#0x431b, LSL #48
00997e74	sub x8,x0,x8
00997e78	ldr w10,[x19, #0x27c]
00997e7c	smulh x8,x8,x9
00997e80	lsr x9,x8,#0x3f
00997e84	lsr x8,x8,#0x12
00997e88	add w8,w8,w9
00997e8c	mov w9,#0x3e8
00997e90	neg w8,w8
00997e94	madd w20,w10,w9,w8
00997e98	cmp w20,#0x0
00997e9c	b.gt 0x00997eb4
00997ea0	ldr x0,[x19, #0xb0]
00997ea4	bl 0x00c33530
00997ea8	tst w0,#0x1
00997eac	mov w8,#0x14
00997eb0	csel w20,w20,w8,ne
00997eb4	add x8,x19,#0x240
00997eb8	ldarb w8,[x8]
00997ebc	ldr x0,[x19, #0xb0]
00997ec0	tst w8,#0x1
00997ec4	mov w8,#0x64
00997ec8	csel w1,w20,w8,eq
00997ecc	bl 0x00c33500
00997ed0	cmp w0,#0x5
00997ed4	b.hi 0x00997f5c
00997ed8	adrp x9,0x74a000
00997edc	mov w8,w0
00997ee0	add x9,x9,#0x920
00997ee4	ldrsw x8,[x9, x8, LSL #0x2]
00997ee8	add x8,x8,x9
00997eec	br x8
00997ef0	mov x0,x19
00997ef4	bl 0x00c33ed0
00997ef8	tbnz w0,#0x0,0x00997f5c
00997efc	mov w0,#0x1
00997f00	b 0x00997fdc
00997f04	mov x0,x19
00997f08	bl 0x00c33ec0
00997f0c	tbnz w0,#0x0,0x00997f5c
00997f10	mov w0,#0x2
00997f14	b 0x00997fdc
00997f18	add x20,x19,#0xb8
00997f1c	mov x0,x20
00997f20	bl 0x00c2ff10
00997f24	ldr x0,[x19, #0xb0]
00997f28	ldr x8,[x0]
00997f2c	ldr x8,[x8, #0x20]
00997f30	blr x8
00997f34	b 0x00997f54
00997f38	add x20,x19,#0xb8
00997f3c	mov x0,x20
00997f40	bl 0x00c2ff10
00997f44	ldr x0,[x19, #0xb0]
00997f48	ldr x8,[x0]
00997f4c	ldr x8,[x8, #0x20]
00997f50	blr x8
00997f54	mov x0,x20
00997f58	bl 0x00c2ff20
00997f5c	add x8,x19,#0xe0
00997f60	ldar w8,[x8]
00997f64	mov w0,wzr
00997f68	cbnz w8,0x00997fdc
00997f6c	add x20,x19,#0x244
00997f70	mov x0,x20
00997f74	bl 0x00c2ff10
00997f78	bl 0x00c31900
00997f7c	ldr x8,[x19, #0x270]
00997f80	sub x22,x0,x8
00997f84	mov x0,x20
00997f88	bl 0x00c2ff20
00997f8c	mov w8,#0xa301
00997f90	movk w8,#0x11e1, LSL #16
00997f94	cmp x22,x8
00997f98	mov w0,wzr
00997f9c	b.lt 0x00997fdc
00997fa0	ldr x8,[x19, #0x38]
00997fa4	add x20,x19,#0xb8
00997fa8	mov x0,x20
00997fac	str x8,[x19, #0x40]
00997fb0	bl 0x00c2ff10
00997fb4	ldr x0,[x19, #0xb0]
00997fb8	ldr x8,[x0]
00997fbc	ldr x8,[x8, #0x20]
00997fc0	blr x8
00997fc4	mov x0,x20
00997fc8	bl 0x00c2ff20
00997fcc	mov w1,#0x1
00997fd0	mov x0,x19
00997fd4	bl 0x00c33ea0
00997fd8	mov w0,wzr
00997fdc	ldr x8,[x21, #0x28]
00997fe0	ldr x9,[sp, #0x18]
00997fe4	cmp x8,x9
00997fe8	b.ne 0x00998004
00997fec	ldp x29,x30,[sp, #0x50]
00997ff0	ldp x20,x19,[sp, #0x40]
00997ff4	ldp x22,x21,[sp, #0x30]
00997ff8	ldp x24,x23,[sp, #0x20]
00997ffc	add sp,sp,#0x60
00998000	ret
00998004	bl 0x00c2fec0
