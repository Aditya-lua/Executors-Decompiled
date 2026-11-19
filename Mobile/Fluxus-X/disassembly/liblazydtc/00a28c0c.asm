; BN_nist_mod_224 @ 00a28c0c
00a28c0c	sub sp,sp,#0x90
00a28c10	stp x24,x23,[sp, #0x50]
00a28c14	stp x22,x21,[sp, #0x60]
00a28c18	stp x20,x19,[sp, #0x70]
00a28c1c	stp x29,x30,[sp, #0x80]
00a28c20	ldr w23,[x1, #0x8]
00a28c24	ldr x22,[x1]
00a28c28	mov x19,x0
00a28c2c	mov x0,x1
00a28c30	str x25,[sp, #0x40]
00a28c34	add x29,sp,#0x80
00a28c38	mov x21,x3
00a28c3c	mov x20,x1
00a28c40	bl 0x00c37f40
00a28c44	cbnz w0,0x00a28c5c
00a28c48	adrp x1,0xc5b000
00a28c4c	add x1,x1,#0xf08
00a28c50	mov x0,x20
00a28c54	bl 0x00c369c0
00a28c58	tbnz w0,#0x1f,0x00a28c90
00a28c5c	adrp x2,0xc5b000
00a28c60	add x2,x2,#0xe90
00a28c64	mov x0,x19
00a28c68	mov x1,x20
00a28c6c	mov x3,x21
00a28c70	bl 0x00c38f30
00a28c74	ldp x29,x30,[sp, #0x80]
00a28c78	ldp x20,x19,[sp, #0x70]
00a28c7c	ldp x22,x21,[sp, #0x60]
00a28c80	ldp x24,x23,[sp, #0x50]
00a28c84	ldr x25,[sp, #0x40]
00a28c88	add sp,sp,#0x90
00a28c8c	ret
00a28c90	adrp x0,0xc5b000
00a28c94	add x0,x0,#0xe90
00a28c98	mov x1,x20
00a28c9c	bl 0x00c369c0
00a28ca0	cbz w0,0x00a28ccc
00a28ca4	cmp w0,#0x1
00a28ca8	b.lt 0x00a28cd8
00a28cac	cmp x19,x20
00a28cb0	b.eq 0x00a28f74
00a28cb4	mov x0,x19
00a28cb8	mov x1,x20
00a28cbc	bl 0x00c36990
00a28cc0	cmp x0,#0x0
00a28cc4	cset w0,ne
00a28cc8	b 0x00a28c74
00a28ccc	mov x0,x19
00a28cd0	bl 0x00c38e00
00a28cd4	b 0x00a28f74
00a28cd8	cmp x19,x20
00a28cdc	b.eq 0x00a28d18
00a28ce0	mov w1,#0x4
00a28ce4	mov x0,x19
00a28ce8	bl 0x00c38e80
00a28cec	cbz x0,0x00a28c74
00a28cf0	ldr x20,[x19]
00a28cf4	ldr x8,[x22]
00a28cf8	str x8,[x20]
00a28cfc	ldr x8,[x22, #0x8]
00a28d00	str x8,[x20, #0x8]
00a28d04	ldr x8,[x22, #0x10]
00a28d08	str x8,[x20, #0x10]
00a28d0c	ldr x8,[x22, #0x18]
00a28d10	str x8,[x20, #0x18]
00a28d14	b 0x00a28d1c
00a28d18	mov x20,x22
00a28d1c	cmp w23,#0x4
00a28d20	mov w8,wzr
00a28d24	b.lt 0x00a28dc4
00a28d28	sub w8,w23,#0x3
00a28d2c	cmp w8,#0x3
00a28d30	mov x9,xzr
00a28d34	b.ls 0x00a28d94
00a28d38	lsl x9,x8,#0x3
00a28d3c	add x10,x22,x9
00a28d40	add x11,sp,#0x20
00a28d44	add x10,x10,#0x18
00a28d48	cmp x11,x10
00a28d4c	b.cs 0x00a28d64
00a28d50	add x10,x22,#0x18
00a28d54	add x9,x11,x9
00a28d58	cmp x10,x9
00a28d5c	mov x9,xzr
00a28d60	b.cc 0x00a28d94
00a28d64	and x9,x8,#0xfffffffc
00a28d68	add x10,x22,#0x28
00a28d6c	add x11,x11,#0x10
00a28d70	mov x12,x9
00a28d74	ldp q0,q1,[x10, #-0x10]
00a28d78	add x10,x10,#0x20
00a28d7c	subs x12,x12,#0x4
00a28d80	stp q0,q1,[x11, #-0x10]
00a28d84	add x11,x11,#0x20
00a28d88	b.ne 0x00a28d74
00a28d8c	cmp x9,x8
00a28d90	b.eq 0x00a28dbc
00a28d94	lsl x11,x9,#0x3
00a28d98	add x10,sp,#0x20
00a28d9c	add x10,x10,x11
00a28da0	add x11,x22,x11
00a28da4	add x11,x11,#0x18
00a28da8	sub x9,x8,x9
00a28dac	ldr x12,[x11], #0x8
00a28db0	subs x9,x9,#0x1
00a28db4	str x12,[x10], #0x8
00a28db8	b.ne 0x00a28dac
00a28dbc	cmp w8,#0x3
00a28dc0	b.hi 0x00a28de4
00a28dc4	add x9,sp,#0x20
00a28dc8	orr w10,wzr,#0x3
00a28dcc	add x0,x9,w8, UXTW  #0x3
00a28dd0	sub w8,w10,w8
00a28dd4	lsl x8,x8,#0x3
00a28dd8	add x2,x8,#0x8
00a28ddc	mov w1,wzr
00a28de0	bl 0x00c301c0
00a28de4	ldp x21,x23,[sp, #0x20]
00a28de8	ldp x24,x22,[sp, #0x30]
00a28dec	ldr w8,[x20, #0x18]
00a28df0	mov x2,sp
00a28df4	mov w3,#0x4
00a28df8	and x9,x24,#0xffffffff
00a28dfc	str x8,[x20, #0x18]
00a28e00	and x8,x21,#-0x100000000
00a28e04	mov x0,x20
00a28e08	mov x1,x20
00a28e0c	lsr x25,x22,#0x20
00a28e10	stp xzr,x8,[sp]
00a28e14	stp x23,x9,[sp, #0x10]
00a28e18	bl 0x00c388b0
00a28e1c	and x8,x24,#-0x100000000
00a28e20	mov x2,sp
00a28e24	mov w3,#0x4
00a28e28	mov x0,x20
00a28e2c	mov x1,x20
00a28e30	stp xzr,x8,[sp]
00a28e34	stp x22,xzr,[sp, #0x10]
00a28e38	bl 0x00c388b0
00a28e3c	extr x8,x23,x21,#0x20
00a28e40	extr x9,x24,x23,#0x20
00a28e44	extr x21,x22,x24,#0x20
00a28e48	mov x2,sp
00a28e4c	mov w3,#0x4
00a28e50	mov x0,x20
00a28e54	mov x1,x20
00a28e58	stp x8,x9,[sp]
00a28e5c	stp x21,x25,[sp, #0x10]
00a28e60	bl 0x00c38940
00a28e64	mov x2,sp
00a28e68	mov w3,#0x4
00a28e6c	mov x0,x20
00a28e70	mov x1,x20
00a28e74	stp x21,x25,[sp]
00a28e78	stp xzr,xzr,[sp, #0x10]
00a28e7c	bl 0x00c38940
00a28e80	ldr x8,[x20, #0x18]
00a28e84	lsr x9,x8,#0x20
00a28e88	cmp w9,#0x1
00a28e8c	b.lt 0x00a28ed0
00a28e90	orr x9,xzr,#-0x100000000
00a28e94	add x8,x8,x9
00a28e98	adrp x9,0x758000
00a28e9c	asr x8,x8,#0x20
00a28ea0	add x9,x9,#0x8a8
00a28ea4	add x2,x9,x8, LSL #0x5
00a28ea8	mov w3,#0x4
00a28eac	mov x0,x20
00a28eb0	mov x1,x20
00a28eb4	bl 0x00c38940
00a28eb8	ldr w8,[x20, #0x1c]
00a28ebc	adrp x22,0xcb5000
00a28ec0	ldr x22,[x22, #0x3e0]
00a28ec4	mvn w8,w8
00a28ec8	and w21,w8,#0x1
00a28ecc	b 0x00a28f1c
00a28ed0	adrp x22,0xcb5000
00a28ed4	ldr x22,[x22, #0x3e0]
00a28ed8	tbnz w9,#0x1f,0x00a28ee4
00a28edc	mov w21,#0x1
00a28ee0	b 0x00a28f1c
00a28ee4	mvn x8,x8
00a28ee8	adrp x9,0x758000
00a28eec	and x8,x8,#-0x100000000
00a28ef0	add x9,x9,#0x8a8
00a28ef4	add x2,x9,x8, ASR #0x1b
00a28ef8	mov w3,#0x4
00a28efc	mov x0,x20
00a28f00	mov x1,x20
00a28f04	bl 0x00c388b0
00a28f08	adrp x8,0xcb5000
00a28f0c	ldr x8,[x8, #0x3d8]
00a28f10	mov x21,x0
00a28f14	cmp w21,#0x0
00a28f18	csel x22,x8,x22,eq
00a28f1c	adrp x2,0x758000
00a28f20	add x2,x2,#0x8a8
00a28f24	add x0,sp,#0x20
00a28f28	mov w3,#0x4
00a28f2c	mov x1,x20
00a28f30	add x23,sp,#0x20
00a28f34	mov w24,#0x4
00a28f38	blr x22
00a28f3c	cmp x0,#0x0
00a28f40	ccmp w21,#0x0,#0x4,ne
00a28f44	csel x8,x20,x23,ne
00a28f48	ldr x9,[x8]
00a28f4c	mov x0,x19
00a28f50	str x9,[x20]
00a28f54	ldr x9,[x8, #0x8]
00a28f58	str x9,[x20, #0x8]
00a28f5c	ldr x9,[x8, #0x10]
00a28f60	str x9,[x20, #0x10]
00a28f64	ldr x8,[x8, #0x18]
00a28f68	str x8,[x20, #0x18]
00a28f6c	str w24,[x19, #0x8]
00a28f70	bl 0x00c38e40
00a28f74	mov w0,#0x1
00a28f78	b 0x00a28c74
