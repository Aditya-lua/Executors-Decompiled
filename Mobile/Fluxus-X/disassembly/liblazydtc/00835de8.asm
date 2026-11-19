; FUN_00835de8 @ 00835de8
00835de8	sub sp,sp,#0x40
00835dec	stp x29,x30,[sp, #0x10]
00835df0	stp x22,x21,[sp, #0x20]
00835df4	stp x20,x19,[sp, #0x30]
00835df8	add x29,sp,#0x10
00835dfc	mrs x22,tpidr_el0
00835e00	mov x21,x2
00835e04	mov x19,x1
00835e08	ldr x8,[x22, #0x28]
00835e0c	mov x20,x0
00835e10	str x8,[sp, #0x8]
00835e14	ldrb w8,[x2, #0x10]
00835e18	cmp w8,#0x1
00835e1c	b.ne 0x00835e38
00835e20	adrp x8,0x29b000
00835e24	ldr q0,[x21]
00835e28	strb wzr,[x21, #0x10]
00835e2c	ldr q1,[x8, #0xfa0]
00835e30	eor v0.16B,v0.16B,v1.16B
00835e34	str q0,[x21]
00835e38	mov x0,x20
00835e3c	mov x1,x19
00835e40	mov x2,x21
00835e44	mov w3,wzr
00835e48	mov x4,xzr
00835e4c	bl 0x008ac76c
00835e50	mov x0,x20
00835e54	mov w1,#0xffffffff
00835e58	bl 0x008aa2e4
00835e5c	ldr x8,[x0]
00835e60	adrp x0,0xd1d000
00835e64	add x0,x0,#0x9c0
00835e68	mov x1,sp
00835e6c	mov x2,sp
00835e70	str x8,[sp]
00835e74	bl 0x00807f14
00835e78	adrp x0,0xcca000
00835e7c	add x0,x0,#0x848
00835e80	mov x1,sp
00835e84	mov x2,sp
00835e88	str x19,[sp]
00835e8c	bl 0x0080837c
00835e90	mov x0,x20
00835e94	mov w1,#0xffffd8ee
00835e98	mov x2,x21
00835e9c	bl 0x008ad800
00835ea0	ldr x8,[x22, #0x28]
00835ea4	ldr x9,[sp, #0x8]
00835ea8	cmp x8,x9
00835eac	b.ne 0x00835ec4
00835eb0	ldp x20,x19,[sp, #0x30]
00835eb4	ldp x22,x21,[sp, #0x20]
00835eb8	ldp x29,x30,[sp, #0x10]
00835ebc	add sp,sp,#0x40
00835ec0	ret
00835ec4	bl 0x00c2fec0
