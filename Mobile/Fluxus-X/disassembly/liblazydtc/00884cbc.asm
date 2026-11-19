; FUN_00884cbc @ 00884cbc
00884cbc	sub sp,sp,#0xc0
00884cc0	stp x29,x30,[sp, #0x60]
00884cc4	stp x28,x27,[sp, #0x70]
00884cc8	stp x26,x25,[sp, #0x80]
00884ccc	stp x24,x23,[sp, #0x90]
00884cd0	stp x22,x21,[sp, #0xa0]
00884cd4	stp x20,x19,[sp, #0xb0]
00884cd8	add x29,sp,#0x60
00884cdc	mrs x23,tpidr_el0
00884ce0	ldr x8,[x23, #0x28]
00884ce4	stur x8,[x29, #-0x8]
00884ce8	ldr w8,[x0, #0x8]
00884cec	cbz w8,0x00885038
00884cf0	ldr x9,[x0, #0x688]
00884cf4	ldr x8,[x0, #0x680]
00884cf8	sub x9,x9,x8
00884cfc	cmp x3,x9, ASR #0x3
00884d00	b.cs 0x00885038
00884d04	mov x24,#0x2d69
00884d08	mov x25,#0x959d
00884d0c	sub x9,x29,#0x28
00884d10	movk x24,#0xeb38, LSL #16
00884d14	movk x25,#0xb8f4, LSL #16
00884d18	add x16,x0,#0x698
00884d1c	movk x24,#0xea08, LSL #32
00884d20	movk x25,#0xd34f, LSL #32
00884d24	add x17,x0,#0x818
00884d28	movk x24,#0x9ddf, LSL #48
00884d2c	movk x25,#0x949d, LSL #48
00884d30	orr x27,x9,#0x4
00884d34	mov w26,#0x28
00884d38	adrp x22,0xd1f000
00884d3c	mov w28,#0x18
00884d40	b 0x00884d68
00884d44	ldr x9,[x13, #0x10]
00884d48	cmp x9,x1
00884d4c	b.eq 0x00884ea0
00884d50	ldr x9,[x0, #0x688]
00884d54	ldr x8,[x0, #0x680]
00884d58	add x3,x3,#0x1
00884d5c	sub x9,x9,x8
00884d60	cmp x3,x9, ASR #0x3
00884d64	b.cs 0x00885038
00884d68	ldr x9,[x0, #0xc8]
00884d6c	cbz x9,0x00884dec
00884d70	ldr x9,[x8, x3, LSL #0x3]
00884d74	lsl w10,w9,#0x3
00884d78	lsr x11,x9,#0x20
00884d7c	add x10,x10,#0x8
00884d80	eor x10,x10,x11
00884d84	mul x10,x10,x24
00884d88	eor x11,x11,x10, LSR #0x2f
00884d8c	eor x10,x11,x10
00884d90	ldrb w11,[x0, #0xd0]
00884d94	mul x10,x10,x24
00884d98	eor x10,x10,x10, LSR #0x2f
00884d9c	mul x10,x10,x25
00884da0	lsr x11,x10,x11
00884da4	ldr x10,[x0, #0xb8]
00884da8	lsr x12,x11,#0x6
00884dac	ldr x12,[x10, x12, LSL #0x3]
00884db0	lsr x12,x12,x11
00884db4	tbz w12,#0x0,0x00884dec
00884db8	ldr x13,[x0, #0xc0]
00884dbc	ldr x12,[x0, #0xa0]
00884dc0	sub x13,x13,#0x1
00884dc4	madd x14,x11,x28,x12
00884dc8	ldr x15,[x14]
00884dcc	cmp x15,x9
00884dd0	b.eq 0x00884df0
00884dd4	add x11,x11,#0x1
00884dd8	and x11,x11,x13
00884ddc	lsr x14,x11,#0x6
00884de0	ldr x14,[x10, x14, LSL #0x3]
00884de4	lsr x14,x14,x11
00884de8	tbnz w14,#0x0,0x00884dc4
00884dec	mov x14,xzr
00884df0	add x9,x14,#0x8
00884df4	cmp x14,#0x0
00884df8	csel x19,xzr,x9,eq
00884dfc	ldrb w9,[x19, #0x1]
00884e00	cmp w9,#0x1
00884e04	b.ne 0x00884d50
00884e08	ldrb w9,[x19, #0x3]
00884e0c	tbnz w9,#0x0,0x00884d50
00884e10	ldrb w9,[x19, #0x2]
00884e14	tbnz w9,#0x0,0x00884d50
00884e18	ldr x9,[x0, #0x138]
00884e1c	cbz x9,0x00884d50
00884e20	ldr x20,[x8, x3, LSL #0x3]
00884e24	lsl w9,w20,#0x3
00884e28	lsr x10,x20,#0x20
00884e2c	add x9,x9,#0x8
00884e30	eor x9,x9,x10
00884e34	mul x9,x9,x24
00884e38	eor x10,x10,x9, LSR #0x2f
00884e3c	eor x9,x10,x9
00884e40	ldrb w10,[x0, #0x140]
00884e44	mul x9,x9,x24
00884e48	eor x9,x9,x9, LSR #0x2f
00884e4c	mul x9,x9,x25
00884e50	lsr x10,x9,x10
00884e54	ldr x9,[x0, #0x128]
00884e58	lsr x11,x10,#0x6
00884e5c	ldr x11,[x9, x11, LSL #0x3]
00884e60	lsr x11,x11,x10
00884e64	tbz w11,#0x0,0x00884d50
00884e68	ldr x12,[x0, #0x130]
00884e6c	ldr x11,[x0, #0x110]
00884e70	sub x12,x12,#0x1
00884e74	madd x13,x10,x26,x11
00884e78	ldr x14,[x13]
00884e7c	cmp x14,x20
00884e80	b.eq 0x00884d44
00884e84	add x10,x10,#0x1
00884e88	and x10,x10,x12
00884e8c	lsr x13,x10,#0x6
00884e90	ldr x13,[x9, x13, LSL #0x3]
00884e94	lsr x13,x13,x10
00884e98	tbnz w13,#0x0,0x00884e74
00884e9c	b 0x00884d50
00884ea0	ldrb w9,[x13, #0x22]
00884ea4	tbnz w9,#0x0,0x00884d50
00884ea8	ldr x9,[x13, #0x18]
00884eac	cbz x9,0x00884ed8
00884eb0	ldr w10,[x9, #0x14]
00884eb4	ldr w11,[x2, #0xc]
00884eb8	cmp w11,w10
00884ebc	b.hi 0x00884ed8
00884ec0	cmp w11,w10
00884ec4	b.ne 0x00884d50
00884ec8	ldr w10,[x2, #0x10]
00884ecc	ldr w9,[x9, #0x18]
00884ed0	cmp w10,w9
00884ed4	b.ls 0x00884d50
00884ed8	ldrb w9,[x22, #0x88]
00884edc	strb wzr,[x19, #0x1]
00884ee0	cmp w9,#0x1
00884ee4	b.ne 0x00884ef4
00884ee8	ldr x9,[x0, #0x798]
00884eec	sub x9,x9,#0x1
00884ef0	str x9,[x0, #0x798]
00884ef4	ldrb w9,[x19]
00884ef8	stp x17,x16,[sp, #0x28]
00884efc	ldr w10,[x17, x9, LSL #0x2]
00884f00	strb wzr,[x16, x9]
00884f04	subs w10,w10,#0x1
00884f08	str w10,[x17, x9, LSL #0x2]
00884f0c	b.eq 0x00884f64
00884f10	ldr x8,[x0, #0x658]
00884f14	mov x21,x0
00884f18	stp x2,x3,[sp, #0x18]
00884f1c	str x1,[sp, #0x10]
00884f20	cmp x3,x8
00884f24	ldr x8,[x0]
00884f28	cset w9,cc
00884f2c	mov x0,x8
00884f30	str w9,[sp, #0xc]
00884f34	bl 0x008769d0
00884f38	ldr w3,[sp, #0xc]
00884f3c	mov w4,w0
00884f40	mov x0,x21
00884f44	mov x1,x20
00884f48	mov x2,x19
00884f4c	bl 0x00887138
00884f50	ldp x17,x16,[sp, #0x28]
00884f54	mov x0,x21
00884f58	ldp x1,x2,[sp, #0x10]
00884f5c	ldr x3,[sp, #0x20]
00884f60	b 0x00884d50
00884f64	stp xzr,xzr,[x27]
00884f68	stur xzr,[x27, #0xd]
00884f6c	ldr x9,[x19]
00884f70	ldr w10,[x19, #0x8]
00884f74	ldrb w11,[x19]
00884f78	str x27,[sp]
00884f7c	str x9,[x27]
00884f80	ldr x9,[x0, #0xc18]
00884f84	str w10,[x27, #0x8]
00884f88	ldr x10,[x0, #0x658]
00884f8c	ldr x12,[x8, x3, LSL #0x3]
00884f90	ldr x8,[x0, #0xc20]
00884f94	sturb w11,[x29, #-0x28]
00884f98	cmp x3,x10
00884f9c	cset w11,cc
00884fa0	subs x10,x8,x9
00884fa4	stur x12,[x29, #-0x18]
00884fa8	sturb w11,[x29, #-0x10]
00884fac	b.eq 0x00884ff0
00884fb0	asr x10,x10,#0x5
00884fb4	ldrb w8,[x19]
00884fb8	lsr x11,x10,#0x1
00884fbc	add x12,x9,x11, LSL #0x5
00884fc0	mvn x14,x11
00884fc4	add x10,x10,x14
00884fc8	ldrb w13,[x12], #0x20
00884fcc	cmp w13,w8
00884fd0	csel x10,x10,x11,cc
00884fd4	csel x9,x12,x9,cc
00884fd8	cbnz x10,0x00884fb8
00884fdc	mov x21,x1
00884fe0	mov x20,x2
00884fe4	mov x22,x3
00884fe8	mov x8,x9
00884fec	b 0x00884ffc
00884ff0	mov x21,x1
00884ff4	mov x20,x2
00884ff8	mov x22,x3
00884ffc	mov x27,x0
00885000	add x0,x0,#0xc18
00885004	sub x2,x29,#0x28
00885008	mov x1,x8
0088500c	bl 0x00886f0c
00885010	ldp x17,x16,[sp, #0x28]
00885014	mov x0,x27
00885018	mov w8,#0x1
0088501c	ldr x27,[sp]
00885020	mov x3,x22
00885024	strb w8,[x19, #0x3]
00885028	mov x2,x20
0088502c	mov x1,x21
00885030	adrp x22,0xd1f000
00885034	b 0x00884d50
00885038	ldr x8,[x23, #0x28]
0088503c	ldur x9,[x29, #-0x8]
00885040	cmp x8,x9
00885044	b.ne 0x00885068
00885048	ldp x20,x19,[sp, #0xb0]
0088504c	ldp x22,x21,[sp, #0xa0]
00885050	ldp x24,x23,[sp, #0x90]
00885054	ldp x26,x25,[sp, #0x80]
00885058	ldp x28,x27,[sp, #0x70]
0088505c	ldp x29,x30,[sp, #0x60]
00885060	add sp,sp,#0xc0
00885064	ret
00885068	bl 0x00c2fec0
