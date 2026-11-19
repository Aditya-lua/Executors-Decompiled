; FUN_00c25dec @ 00c25dec
00c25dec	paciasp
00c25df0	stp x29,x30,[sp, #-0x40]!
00c25df4	str x23,[sp, #0x10]
00c25df8	stp x22,x21,[sp, #0x20]
00c25dfc	stp x20,x19,[sp, #0x30]
00c25e00	mov x29,sp
00c25e04	ldp x8,x9,[x0]
00c25e08	sub x9,x9,x8
00c25e0c	cmp x9,#0x2
00c25e10	b.cs 0x00c25e30
00c25e14	mov x1,xzr
00c25e18	ldp x20,x19,[sp, #0x30]
00c25e1c	ldr x23,[sp, #0x10]
00c25e20	ldp x22,x21,[sp, #0x20]
00c25e24	ldp x29,x30,[sp], #0x40
00c25e28	autiasp
00c25e2c	b 0x00c12574
00c25e30	ldrh w9,[x8]
00c25e34	mov w10,#0x7354
00c25e38	cmp w9,w10
00c25e3c	b.eq 0x00c25e70
00c25e40	ldrh w9,[x8]
00c25e44	mov w10,#0x7554
00c25e48	cmp w9,w10
00c25e4c	b.eq 0x00c25e80
00c25e50	ldrh w9,[x8]
00c25e54	mov w10,#0x6554
00c25e58	cmp w9,w10
00c25e5c	b.ne 0x00c25e14
00c25e60	adrp x19,0x2c2000
00c25e64	add x19,x19,#0xc63
00c25e68	mov w20,#0x4
00c25e6c	b 0x00c25e8c
00c25e70	adrp x19,0x2dd000
00c25e74	add x19,x19,#0x354
00c25e78	mov w20,#0x6
00c25e7c	b 0x00c25e8c
00c25e80	adrp x19,0x2b3000
00c25e84	add x19,x19,#0x323
00c25e88	mov w20,#0x5
00c25e8c	add x8,x8,#0x2
00c25e90	mov x1,xzr
00c25e94	mov x21,x0
00c25e98	str x8,[x0]
00c25e9c	bl 0x00c12574
00c25ea0	cbz x0,0x00c25f1c
00c25ea4	ldr x22,[x21, #0x1330]
00c25ea8	ldr x8,[x22, #0x8]
00c25eac	sub x9,x8,#0xfc0
00c25eb0	cmn x9,#0xff1
00c25eb4	b.hi 0x00c25edc
00c25eb8	mov x23,x0
00c25ebc	mov w0,#0x1000
00c25ec0	bl 0x00c308d0
00c25ec4	cbz x0,0x00c25f34
00c25ec8	mov x8,xzr
00c25ecc	stp x22,xzr,[x0]
00c25ed0	mov x22,x0
00c25ed4	str x0,[x21, #0x1330]
00c25ed8	mov x0,x23
00c25edc	add x9,x8,#0x30
00c25ee0	add x8,x22,x8
00c25ee4	mov w10,#0x6
00c25ee8	str x9,[x22, #0x8]
00c25eec	adrp x9,0xcb3000
00c25ef0	add x9,x9,#0xf98
00c25ef4	str x9,[x8, #0x10]!
00c25ef8	ldurh w9,[x8, #0x9]
00c25efc	strb w10,[x8, #0x8]
00c25f00	mov w10,#0x540
00c25f04	and w9,w9,#0xf000
00c25f08	str x0,[x8, #0x20]
00c25f0c	mov x0,x8
00c25f10	orr w9,w9,w10
00c25f14	stp x19,x20,[x8, #0x10]
00c25f18	sturh w9,[x8, #0x9]
00c25f1c	ldp x20,x19,[sp, #0x30]
00c25f20	ldr x23,[sp, #0x10]
00c25f24	ldp x22,x21,[sp, #0x20]
00c25f28	ldp x29,x30,[sp], #0x40
00c25f2c	autiasp
00c25f30	ret
00c25f34	bl 0x00c2fff0
