; FUN_00860d94 @ 00860d94
00860d94	sub sp,sp,#0x80
00860d98	stp x29,x30,[sp, #0x30]
00860d9c	str x25,[sp, #0x40]
00860da0	stp x24,x23,[sp, #0x50]
00860da4	stp x22,x21,[sp, #0x60]
00860da8	stp x20,x19,[sp, #0x70]
00860dac	add x29,sp,#0x30
00860db0	mrs x22,tpidr_el0
00860db4	mov w19,w1
00860db8	mov x21,x0
00860dbc	ldr x9,[x22, #0x28]
00860dc0	mov x20,x8
00860dc4	stur x9,[x29, #-0x8]
00860dc8	ldr w9,[x0, #0x90]
00860dcc	cmp w9,#0x119
00860dd0	b.ne 0x00860dec
00860dd4	ldur q0,[x21, #0x94]
00860dd8	ldr x23,[x21, #0xa8]
00860ddc	mov x0,x21
00860de0	str q0,[sp]
00860de4	bl 0x00858f2c
00860de8	b 0x00860e08
00860dec	adrp x1,0x2c2000
00860df0	add x1,x1,#0xd59
00860df4	mov x0,x21
00860df8	bl 0x0086e040
00860dfc	ldur q0,[x21, #0x94]
00860e00	ldr x23,[x21, #0x138]
00860e04	str q0,[sp]
00860e08	ldr w8,[x21, #0x90]
00860e0c	cmp w8,#0x3a
00860e10	b.ne 0x00860e70
00860e14	ldur x24,[x21, #0x94]
00860e18	mov x0,x21
00860e1c	bl 0x00858f2c
00860e20	ldr w8,[x21, #0x90]
00860e24	ldur q0,[x21, #0x94]
00860e28	mov x1,xzr
00860e2c	ldr w25,[x21, #0x124]
00860e30	cmp w8,#0x26
00860e34	str q0,[sp, #0x10]
00860e38	b.eq 0x00860e5c
00860e3c	cmp w8,#0x7c
00860e40	b.eq 0x00860e5c
00860e44	mov x0,x21
00860e48	mov w1,wzr
00860e4c	mov w2,wzr
00860e50	bl 0x008695d4
00860e54	mov x1,x0
00860e58	str w25,[x21, #0x124]
00860e5c	add x2,sp,#0x10
00860e60	mov x0,x21
00860e64	bl 0x00867310
00860e68	str w25,[x21, #0x124]
00860e6c	b 0x00860e78
00860e70	mov x0,xzr
00860e74	mov x24,#-0x1
00860e78	ldrb w8,[x21, #0x68]
00860e7c	ldr q0,[sp]
00860e80	and w9,w19,#0x1
00860e84	str x23,[x20]
00860e88	cmp w8,#0x0
00860e8c	stur q0,[x20, #0x8]
00860e90	csinv x8,x24,xzr,ne
00860e94	strb w9,[x20, #0x28]
00860e98	stp x0,x8,[x20, #0x18]
00860e9c	ldr x8,[x22, #0x28]
00860ea0	ldur x9,[x29, #-0x8]
00860ea4	cmp x8,x9
00860ea8	b.ne 0x00860ec8
00860eac	ldp x20,x19,[sp, #0x70]
00860eb0	ldr x25,[sp, #0x40]
00860eb4	ldp x22,x21,[sp, #0x60]
00860eb8	ldp x24,x23,[sp, #0x50]
00860ebc	ldp x29,x30,[sp, #0x30]
00860ec0	add sp,sp,#0x80
00860ec4	ret
00860ec8	bl 0x00c2fec0
