; FUN_00c10bfc @ 00c10bfc
00c10bfc	paciasp
00c10c00	sub sp,sp,#0x60
00c10c04	stp x29,x30,[sp, #0x20]
00c10c08	str x23,[sp, #0x30]
00c10c0c	stp x22,x21,[sp, #0x40]
00c10c10	stp x20,x19,[sp, #0x50]
00c10c14	add x29,sp,#0x20
00c10c18	ldp x8,x10,[x0]
00c10c1c	mov x19,x0
00c10c20	str xzr,[sp, #0x8]
00c10c24	subs x9,x10,x8
00c10c28	b.eq 0x00c1163c
00c10c2c	ldrb w11,[x8]
00c10c30	sub w12,w11,#0x41
00c10c34	cmp w12,#0x39
00c10c38	b.hi 0x00c1163c
00c10c3c	adrp x13,0x78c000
00c10c40	add x13,x13,#0x330
00c10c44	adr x14,0xc10c54
00c10c48	ldrh w15,[x13, x12, LSL #0x1]
00c10c4c	add x14,x14,x15, LSL #0x2
00c10c50	br x14
00c10c54	bti j
00c10c58	cmp w11,#0x72
00c10c5c	cset w10,eq
00c10c60	cmp x9,x10
00c10c64	b.ls 0x00c10c84
00c10c68	ldrb w12,[x8, x10]
00c10c6c	cmp w11,#0x72
00c10c70	mov w11,#0x1
00c10c74	cinc w11,w11,eq
00c10c78	and w12,w12,#0xff
00c10c7c	cmp w12,#0x56
00c10c80	csel w10,w11,w10,eq
00c10c84	mov w11,w10
00c10c88	cmp x9,x11
00c10c8c	b.ls 0x00c10ca4
00c10c90	ldrb w11,[x8, x11]
00c10c94	and w11,w11,#0xff
00c10c98	cmp w11,#0x4b
00c10c9c	cinc w11,w10,eq
00c10ca0	mov w10,w11
00c10ca4	cmp x9,x11
00c10ca8	b.ls 0x00c10cf8
00c10cac	ldrb w11,[x8, x11]
00c10cb0	cmp w11,#0x46
00c10cb4	b.eq 0x00c1170c
00c10cb8	cmp w11,#0x44
00c10cbc	b.ne 0x00c10cf8
00c10cc0	mov w10,w10
00c10cc4	add x10,x10,#0x1
00c10cc8	cmp x9,x10
00c10ccc	b.ls 0x00c10cf8
00c10cd0	ldrb w8,[x8, x10]
00c10cd4	sub w8,w8,#0x4f
00c10cd8	cmp w8,#0x29
00c10cdc	b.hi 0x00c10cf8
00c10ce0	mov w9,#0x1
00c10ce4	lsl x8,x9,x8
00c10ce8	mov x9,#0x1
00c10cec	movk x9,#0x301, LSL #32
00c10cf0	tst x8,x9
00c10cf4	b.ne 0x00c1170c
00c10cf8	bti j
00c10cfc	mov x0,x19
00c10d00	bl 0x00c24d58
00c10d04	cbnz x0,0x00c1164c
00c10d08	b 0x00c11b18
00c10d0c	bti j
00c10d10	add x8,x8,#0x1
00c10d14	ldr x20,[x19, #0x1330]
00c10d18	str x8,[x19]
00c10d1c	ldr x8,[x20, #0x8]
00c10d20	sub x9,x8,#0xfd0
00c10d24	cmn x9,#0xff1
00c10d28	b.hi 0x00c10d48
00c10d2c	mov w0,#0x1000
00c10d30	bl 0x00c308d0
00c10d34	cbz x0,0x00c123a8
00c10d38	mov x8,xzr
00c10d3c	stp x20,xzr,[x0]
00c10d40	mov x20,x0
00c10d44	str x0,[x19, #0x1330]
00c10d48	add x9,x8,#0x20
00c10d4c	add x0,x20,x8
00c10d50	adrp x8,0xcb1000
00c10d54	add x8,x8,#0x4c0
00c10d58	str x9,[x20, #0x8]
00c10d5c	mov w10,#0x540
00c10d60	str x8,[x0, #0x10]!
00c10d64	ldurh w8,[x0, #0x9]
00c10d68	mov w9,#0x8
00c10d6c	and w8,w8,#0xf000
00c10d70	strb w9,[x0, #0x8]
00c10d74	adrp x9,0x29f000
00c10d78	add x9,x9,#0x1ba
00c10d7c	orr w8,w8,w10
00c10d80	sturh w8,[x0, #0x9]
00c10d84	mov w8,#0x12
00c10d88	b 0x00c11b14
00c10d8c	bti j
00c10d90	add x8,x8,#0x1
00c10d94	ldr x20,[x19, #0x1330]
00c10d98	str x8,[x19]
00c10d9c	ldr x8,[x20, #0x8]
00c10da0	sub x9,x8,#0xfd0
00c10da4	cmn x9,#0xff1
00c10da8	b.hi 0x00c10dc8
00c10dac	mov w0,#0x1000
00c10db0	bl 0x00c308d0
00c10db4	cbz x0,0x00c123a8
00c10db8	mov x8,xzr
00c10dbc	stp x20,xzr,[x0]
00c10dc0	mov x20,x0
00c10dc4	str x0,[x19, #0x1330]
00c10dc8	add x9,x8,#0x20
00c10dcc	add x0,x20,x8
00c10dd0	adrp x8,0xcb1000
00c10dd4	add x8,x8,#0x4c0
00c10dd8	str x9,[x20, #0x8]
00c10ddc	mov w9,#0x8
00c10de0	str x8,[x0, #0x10]!
00c10de4	ldurh w8,[x0, #0x9]
00c10de8	mov w10,#0x540
00c10dec	strb w9,[x0, #0x8]
00c10df0	adrp x9,0x2d6000
00c10df4	add x9,x9,#0xeea
00c10df8	b 0x00c11b04
00c10dfc	bti j
00c10e00	add x8,x8,#0x1
00c10e04	ldr x20,[x19, #0x1330]
00c10e08	str x8,[x19]
00c10e0c	ldr x8,[x20, #0x8]
00c10e10	sub x9,x8,#0xfd0
00c10e14	cmn x9,#0xff1
00c10e18	b.hi 0x00c10e38
00c10e1c	mov w0,#0x1000
00c10e20	bl 0x00c308d0
00c10e24	cbz x0,0x00c123a8
00c10e28	mov x8,xzr
00c10e2c	stp x20,xzr,[x0]
00c10e30	mov x20,x0
00c10e34	str x0,[x19, #0x1330]
00c10e38	add x9,x8,#0x20
00c10e3c	add x0,x20,x8
00c10e40	adrp x8,0xcb1000
00c10e44	add x8,x8,#0x4c0
00c10e48	str x9,[x20, #0x8]
00c10e4c	mov w9,#0x8
00c10e50	str x8,[x0, #0x10]!
00c10e54	ldurh w8,[x0, #0x9]
00c10e58	mov w10,#0x540
00c10e5c	strb w9,[x0, #0x8]
00c10e60	adrp x9,0x2b1000
00c10e64	add x9,x9,#0x450
00c10e68	b 0x00c113e0
00c10e6c	bti j
00c10e70	add x8,x8,#0x1
00c10e74	ldr x20,[x19, #0x1330]
00c10e78	str x8,[x19]
00c10e7c	ldr x8,[x20, #0x8]
00c10e80	sub x9,x8,#0xfd0
00c10e84	cmn x9,#0xff1
00c10e88	b.hi 0x00c10ea8
00c10e8c	mov w0,#0x1000
00c10e90	bl 0x00c308d0
00c10e94	cbz x0,0x00c123a8
00c10e98	mov x8,xzr
00c10e9c	stp x20,xzr,[x0]
00c10ea0	mov x20,x0
00c10ea4	str x0,[x19, #0x1330]
00c10ea8	add x9,x8,#0x20
00c10eac	add x0,x20,x8
00c10eb0	adrp x8,0xcb1000
00c10eb4	add x8,x8,#0x4c0
00c10eb8	str x9,[x20, #0x8]
00c10ebc	mov w10,#0x540
00c10ec0	str x8,[x0, #0x10]!
00c10ec4	ldurh w8,[x0, #0x9]
00c10ec8	mov w9,#0x8
00c10ecc	and w8,w8,#0xf000
00c10ed0	strb w9,[x0, #0x8]
00c10ed4	orr w8,w8,w10
00c10ed8	sturh w8,[x0, #0x9]
00c10edc	adrp x8,0x2a5000
00c10ee0	add x8,x8,#0x11e
00c10ee4	stp x8,x9,[x0, #0x10]
00c10ee8	b 0x00c11b18
00c10eec	bti j
00c10ef0	add x8,x8,#0x1
00c10ef4	ldr x20,[x19, #0x1330]
00c10ef8	str x8,[x19]
00c10efc	ldr x8,[x20, #0x8]
00c10f00	sub x9,x8,#0xfd0
00c10f04	cmn x9,#0xff1
00c10f08	b.hi 0x00c10f28
00c10f0c	mov w0,#0x1000
00c10f10	bl 0x00c308d0
00c10f14	cbz x0,0x00c123a8
00c10f18	mov x8,xzr
00c10f1c	stp x20,xzr,[x0]
00c10f20	mov x20,x0
00c10f24	str x0,[x19, #0x1330]
00c10f28	add x9,x8,#0x20
00c10f2c	add x0,x20,x8
00c10f30	adrp x8,0xcb1000
00c10f34	add x8,x8,#0x4c0
00c10f38	str x9,[x20, #0x8]
00c10f3c	mov w9,#0x8
00c10f40	str x8,[x0, #0x10]!
00c10f44	ldurh w8,[x0, #0x9]
00c10f48	mov w10,#0x540
00c10f4c	strb w9,[x0, #0x8]
00c10f50	adrp x9,0x2d6000
00c10f54	add x9,x9,#0xeef
00c10f58	b 0x00c1178c
00c10f5c	bti j
00c10f60	add x8,x8,#0x1
00c10f64	ldr x20,[x19, #0x1330]
00c10f68	str x8,[x19]
00c10f6c	ldr x8,[x20, #0x8]
00c10f70	sub x9,x8,#0xfd0
00c10f74	cmn x9,#0xff1
00c10f78	b.hi 0x00c10f98
00c10f7c	mov w0,#0x1000
00c10f80	bl 0x00c308d0
00c10f84	cbz x0,0x00c123a8
00c10f88	mov x8,xzr
00c10f8c	stp x20,xzr,[x0]
00c10f90	mov x20,x0
00c10f94	str x0,[x19, #0x1330]
00c10f98	add x9,x8,#0x20
00c10f9c	add x0,x20,x8
00c10fa0	adrp x8,0xcb1000
00c10fa4	add x8,x8,#0x4c0
00c10fa8	str x9,[x20, #0x8]
00c10fac	mov w9,#0x8
00c10fb0	str x8,[x0, #0x10]!
00c10fb4	ldurh w8,[x0, #0x9]
00c10fb8	mov w10,#0x540
00c10fbc	strb w9,[x0, #0x8]
00c10fc0	adrp x9,0x2d2000
00c10fc4	add x9,x9,#0xb15
00c10fc8	b 0x00c114fc
00c10fcc	bti j
00c10fd0	cmp x9,#0x2
00c10fd4	b.cc 0x00c11000
00c10fd8	ldrb w8,[x8, #0x1]
00c10fdc	sub w8,w8,#0x65
00c10fe0	cmp w8,#0x10
00c10fe4	b.hi 0x00c11000
00c10fe8	mov w9,#0x1
00c10fec	lsl w8,w9,w8
00c10ff0	mov w9,#0x4001
00c10ff4	movk w9,#0x1, LSL #16
00c10ff8	tst w8,w9
00c10ffc	b.ne 0x00c1163c
00c11000	mov x0,x19
00c11004	bl 0x00c14ebc
00c11008	str x0,[sp, #0x8]
00c1100c	cbz x0,0x00c11b18
00c11010	ldrb w8,[x19, #0x308]
00c11014	cmp w8,#0x1
00c11018	b.ne 0x00c1164c
00c1101c	ldp x8,x9,[x19]
00c11020	cmp x9,x8
00c11024	b.eq 0x00c1164c
00c11028	ldrb w8,[x8]
00c1102c	cmp w8,#0x49
00c11030	b.ne 0x00c1164c
00c11034	add x0,x19,#0x128
00c11038	add x1,sp,#0x8
00c1103c	bl 0x00c12fcc
00c11040	mov x0,x19
00c11044	mov w1,wzr
00c11048	bl 0x00c14948
00c1104c	str x0,[sp, #0x10]
00c11050	cbnz x0,0x00c11c54
00c11054	b 0x00c11b18
00c11058	bti j
00c1105c	add x8,x8,#0x1
00c11060	ldr x20,[x19, #0x1330]
00c11064	str x8,[x19]
00c11068	ldr x8,[x20, #0x8]
00c1106c	sub x9,x8,#0xfd0
00c11070	cmn x9,#0xff1
00c11074	b.hi 0x00c11094
00c11078	mov w0,#0x1000
00c1107c	bl 0x00c308d0
00c11080	cbz x0,0x00c123a8
00c11084	mov x8,xzr
00c11088	stp x20,xzr,[x0]
00c1108c	mov x20,x0
00c11090	str x0,[x19, #0x1330]
00c11094	add x9,x8,#0x20
00c11098	add x0,x20,x8
00c1109c	adrp x8,0xcb1000
00c110a0	add x8,x8,#0x4c0
00c110a4	str x9,[x20, #0x8]
00c110a8	mov w9,#0x8
00c110ac	str x8,[x0, #0x10]!
00c110b0	ldurh w8,[x0, #0x9]
00c110b4	mov w10,#0x540
00c110b8	strb w9,[x0, #0x8]
00c110bc	adrp x9,0x2ab000
00c110c0	add x9,x9,#0x2eb
00c110c4	b 0x00c11b04
00c110c8	bti j
00c110cc	add x8,x8,#0x1
00c110d0	ldr x20,[x19, #0x1330]
00c110d4	str x8,[x19]
00c110d8	ldr x8,[x20, #0x8]
00c110dc	sub x9,x8,#0xfd0
00c110e0	cmn x9,#0xff1
00c110e4	b.hi 0x00c11104
00c110e8	mov w0,#0x1000
00c110ec	bl 0x00c308d0
00c110f0	cbz x0,0x00c123a8
00c110f4	mov x8,xzr
00c110f8	stp x20,xzr,[x0]
00c110fc	mov x20,x0
00c11100	str x0,[x19, #0x1330]
00c11104	add x9,x8,#0x20
00c11108	add x0,x20,x8
00c1110c	adrp x8,0xcb1000
00c11110	add x8,x8,#0x4c0
00c11114	str x9,[x20, #0x8]
00c11118	mov w10,#0x540
00c1111c	str x8,[x0, #0x10]!
00c11120	ldurh w8,[x0, #0x9]
00c11124	mov w9,#0x8
00c11128	and w8,w8,#0xf000
00c1112c	strb w9,[x0, #0x8]
00c11130	adrp x9,0x29f000
00c11134	add x9,x9,#0x1a3
00c11138	orr w8,w8,w10
00c1113c	sturh w8,[x0, #0x9]
00c11140	mov w8,#0x7
00c11144	b 0x00c11b14
00c11148	bti j
00c1114c	add x8,x8,#0x1
00c11150	ldr x20,[x19, #0x1330]
00c11154	str x8,[x19]
00c11158	ldr x8,[x20, #0x8]
00c1115c	sub x9,x8,#0xfd0
00c11160	cmn x9,#0xff1
00c11164	b.hi 0x00c11184
00c11168	mov w0,#0x1000
00c1116c	bl 0x00c308d0
00c11170	cbz x0,0x00c123a8
00c11174	mov x8,xzr
00c11178	stp x20,xzr,[x0]
00c1117c	mov x20,x0
00c11180	str x0,[x19, #0x1330]
00c11184	add x9,x8,#0x20
00c11188	add x0,x20,x8
00c1118c	adrp x8,0xcb1000
00c11190	add x8,x8,#0x4c0
00c11194	str x9,[x20, #0x8]
00c11198	mov w10,#0x540
00c1119c	str x8,[x0, #0x10]!
00c111a0	ldurh w8,[x0, #0x9]
00c111a4	mov w9,#0x8
00c111a8	and w8,w8,#0xf000
00c111ac	strb w9,[x0, #0x8]
00c111b0	adrp x9,0x2b8000
00c111b4	add x9,x9,#0xd21
00c111b8	orr w8,w8,w10
00c111bc	sturh w8,[x0, #0x9]
00c111c0	mov w8,#0x6
00c111c4	b 0x00c11b14
00c111c8	bti j
00c111cc	add x8,x8,#0x1
00c111d0	ldr x20,[x19, #0x1330]
00c111d4	str x8,[x19]
00c111d8	ldr x8,[x20, #0x8]
00c111dc	sub x9,x8,#0xfd0
00c111e0	cmn x9,#0xff1
00c111e4	b.hi 0x00c11204
00c111e8	mov w0,#0x1000
00c111ec	bl 0x00c308d0
00c111f0	cbz x0,0x00c123a8
00c111f4	mov x8,xzr
00c111f8	stp x20,xzr,[x0]
00c111fc	mov x20,x0
00c11200	str x0,[x19, #0x1330]
00c11204	add x9,x8,#0x20
00c11208	add x0,x20,x8
00c1120c	adrp x8,0xcb1000
00c11210	add x8,x8,#0x4c0
00c11214	str x9,[x20, #0x8]
00c11218	mov w10,#0x540
00c1121c	str x8,[x0, #0x10]!
00c11220	ldurh w8,[x0, #0x9]
00c11224	mov w9,#0x8
00c11228	and w8,w8,#0xf000
00c1122c	strb w9,[x0, #0x8]
00c11230	adrp x9,0x2a1000
00c11234	add x9,x9,#0x438
00c11238	orr w8,w8,w10
00c1123c	sturh w8,[x0, #0x9]
00c11240	mov w8,#0xa
00c11244	b 0x00c11b14
00c11248	bti j
00c1124c	add x9,x8,#0x1
00c11250	str xzr,[x29, #0x18]
00c11254	cmp x10,x9
00c11258	str x9,[x19]
00c1125c	b.eq 0x00c11b84
00c11260	ldrb w10,[x9]
00c11264	sub w10,w10,#0x3a
00c11268	cmn w10,#0xa
00c1126c	b.cs 0x00c11bb4
00c11270	ldrb w9,[x9]
00c11274	cmp w9,#0x5f
00c11278	b.ne 0x00c11b84
00c1127c	add x8,x8,#0x2
00c11280	b 0x00c11bf0
00c11284	bti j
00c11288	add x8,x8,#0x1
00c1128c	ldr x20,[x19, #0x1330]
00c11290	str x8,[x19]
00c11294	ldr x8,[x20, #0x8]
00c11298	sub x9,x8,#0xfd0
00c1129c	cmn x9,#0xff1
00c112a0	b.hi 0x00c112c0
00c112a4	mov w0,#0x1000
00c112a8	bl 0x00c308d0
00c112ac	cbz x0,0x00c123a8
00c112b0	mov x8,xzr
00c112b4	stp x20,xzr,[x0]
00c112b8	mov x20,x0
00c112bc	str x0,[x19, #0x1330]
00c112c0	add x9,x8,#0x20
00c112c4	add x0,x20,x8
00c112c8	adrp x8,0xcb1000
00c112cc	add x8,x8,#0x4c0
00c112d0	str x9,[x20, #0x8]
00c112d4	mov w9,#0x8
00c112d8	str x8,[x0, #0x10]!
00c112dc	ldurh w8,[x0, #0x9]
00c112e0	mov w10,#0x540
00c112e4	strb w9,[x0, #0x8]
00c112e8	adrp x9,0x2a1000
00c112ec	add x9,x9,#0x433
00c112f0	b 0x00c11b04
00c112f4	bti j
00c112f8	add x8,x8,#0x1
00c112fc	ldr x20,[x19, #0x1330]
00c11300	str x8,[x19]
00c11304	ldr x8,[x20, #0x8]
00c11308	sub x9,x8,#0xfd0
00c1130c	cmn x9,#0xff1
00c11310	b.hi 0x00c11330
00c11314	mov w0,#0x1000
00c11318	bl 0x00c308d0
00c1131c	cbz x0,0x00c123a8
00c11320	mov x8,xzr
00c11324	stp x20,xzr,[x0]
00c11328	mov x20,x0
00c1132c	str x0,[x19, #0x1330]
00c11330	add x9,x8,#0x20
00c11334	add x0,x20,x8
00c11338	adrp x8,0xcb1000
00c1133c	add x8,x8,#0x4c0
00c11340	str x9,[x20, #0x8]
00c11344	mov w10,#0x540
00c11348	str x8,[x0, #0x10]!
00c1134c	ldurh w8,[x0, #0x9]
00c11350	mov w9,#0x8
00c11354	and w8,w8,#0xf000
00c11358	strb w9,[x0, #0x8]
00c1135c	adrp x9,0x2b6000
00c11360	add x9,x9,#0xbe7
00c11364	orr w8,w8,w10
00c11368	sturh w8,[x0, #0x9]
00c1136c	mov w8,#0x11
00c11370	b 0x00c11b14
00c11374	bti j
00c11378	add x8,x8,#0x1
00c1137c	ldr x20,[x19, #0x1330]
00c11380	str x8,[x19]
00c11384	ldr x8,[x20, #0x8]
00c11388	sub x9,x8,#0xfd0
00c1138c	cmn x9,#0xff1
00c11390	b.hi 0x00c113b0
00c11394	mov w0,#0x1000
00c11398	bl 0x00c308d0
00c1139c	cbz x0,0x00c123a8
00c113a0	mov x8,xzr
00c113a4	stp x20,xzr,[x0]
00c113a8	mov x20,x0
00c113ac	str x0,[x19, #0x1330]
00c113b0	add x9,x8,#0x20
00c113b4	add x0,x20,x8
00c113b8	adrp x8,0xcb1000
00c113bc	add x8,x8,#0x4c0
00c113c0	str x9,[x20, #0x8]
00c113c4	mov w9,#0x8
00c113c8	str x8,[x0, #0x10]!
00c113cc	ldurh w8,[x0, #0x9]
00c113d0	mov w10,#0x540
00c113d4	strb w9,[x0, #0x8]
00c113d8	adrp x9,0x2be000
00c113dc	add x9,x9,#0xda8
00c113e0	and w8,w8,#0xf000
00c113e4	orr w8,w8,w10
00c113e8	sturh w8,[x0, #0x9]
00c113ec	mov w8,#0x3
00c113f0	b 0x00c11b14
00c113f4	bti j
00c113f8	add x8,x8,#0x1
00c113fc	mov x0,x19
00c11400	str x8,[x19]
00c11404	bl 0x00c10bfc
00c11408	str x0,[sp, #0x10]
00c1140c	cbz x0,0x00c11b18
00c11410	add x1,sp,#0x10
00c11414	mov x0,x19
00c11418	bl 0x00c260a0
00c1141c	b 0x00c1164c
00c11420	bti j
00c11424	add x8,x8,#0x1
00c11428	mov x0,x19
00c1142c	str x8,[x19]
00c11430	bl 0x00c10bfc
00c11434	str x0,[sp, #0x10]
00c11438	cbz x0,0x00c11b18
00c1143c	add x1,sp,#0x10
00c11440	mov x0,x19
00c11444	bl 0x00c26150
00c11448	b 0x00c1164c
00c1144c	bti j
00c11450	add x8,x8,#0x1
00c11454	mov x0,x19
00c11458	str x8,[x19]
00c1145c	bl 0x00c10bfc
00c11460	str x0,[sp, #0x10]
00c11464	cbz x0,0x00c11648
00c11468	mov x0,x19
00c1146c	bl 0x00c10bfc
00c11470	str x0,[x29, #0x18]
00c11474	cbz x0,0x00c11648
00c11478	add x1,sp,#0x10
00c1147c	add x2,x29,#0x18
00c11480	mov x0,x19
00c11484	bl 0x00c28328
00c11488	cbnz x0,0x00c1164c
00c1148c	b 0x00c11b18
00c11490	bti j
00c11494	add x8,x8,#0x1
00c11498	ldr x20,[x19, #0x1330]
00c1149c	str x8,[x19]
00c114a0	ldr x8,[x20, #0x8]
00c114a4	sub x9,x8,#0xfd0
00c114a8	cmn x9,#0xff1
00c114ac	b.hi 0x00c114cc
00c114b0	mov w0,#0x1000
00c114b4	bl 0x00c308d0
00c114b8	cbz x0,0x00c123a8
00c114bc	mov x8,xzr
00c114c0	stp x20,xzr,[x0]
00c114c4	mov x20,x0
00c114c8	str x0,[x19, #0x1330]
00c114cc	add x9,x8,#0x20
00c114d0	add x0,x20,x8
00c114d4	adrp x8,0xcb1000
00c114d8	add x8,x8,#0x4c0
00c114dc	str x9,[x20, #0x8]
00c114e0	mov w9,#0x8
00c114e4	str x8,[x0, #0x10]!
00c114e8	ldurh w8,[x0, #0x9]
00c114ec	mov w10,#0x540
00c114f0	strb w9,[x0, #0x8]
00c114f4	adrp x9,0x2b6000
00c114f8	add x9,x9,#0xbe1
00c114fc	and w8,w8,#0xf000
00c11500	orr w8,w8,w10
00c11504	sturh w8,[x0, #0x9]
00c11508	mov w8,#0x5
00c1150c	b 0x00c11b14
00c11510	bti j
00c11514	add x11,x8,#0x1
00c11518	cmp x10,x11
00c1151c	str x11,[x19]
00c11520	b.eq 0x00c120c0
00c11524	ldrb w11,[x11]
00c11528	sub w11,w11,#0x3a
00c1152c	cmn w11,#0xa
00c11530	b.cc 0x00c120c0
00c11534	mov x17,xzr
00c11538	mov x14,xzr
00c1153c	mov w16,#0xa
00c11540	add x13,x8,x17
00c11544	mov x12,x14
00c11548	mov x11,x17
00c1154c	add x15,x13,#0x2
00c11550	str x15,[x19]
00c11554	cmp x15,x10
00c11558	ldrb w13,[x13, #0x1]
00c1155c	nop
00c11560	madd x14,x14,x16,x13
00c11564	sub x14,x14,#0x30
00c11568	b.eq 0x00c11580
00c1156c	ldrb w17,[x15]
00c11570	sub w17,w17,#0x30
00c11574	cmp w17,#0x9
00c11578	add x17,x11,#0x1
00c1157c	b.ls 0x00c11540
00c11580	sub x9,x9,x11
00c11584	sub x9,x9,#0x2
00c11588	cmp x9,x14
00c1158c	b.cc 0x00c120c0
00c11590	mov w9,#0xa
00c11594	add x16,x8,x11
00c11598	stp x15,x14,[sp, #0x10]
00c1159c	nop
00c115a0	madd x9,x12,x9,x13
00c115a4	add x9,x16,x9
00c115a8	sub x9,x9,#0x2e
00c115ac	str x9,[x19]
00c115b0	cbz x14,0x00c120c0
00c115b4	cmp x9,x10
00c115b8	b.eq 0x00c11c68
00c115bc	ldrb w9,[x9]
00c115c0	cmp w9,#0x49
00c115c4	b.ne 0x00c11c68
00c115c8	mov w9,#0xa
00c115cc	add x8,x8,x11
00c115d0	mov x0,x19
00c115d4	madd x9,x12,x9,x13
00c115d8	add x8,x8,x9
00c115dc	sub x8,x8,#0x2d
00c115e0	str x8,[x19]
00c115e4	bl 0x00c10bfc
00c115e8	str x0,[x29, #0x18]
00c115ec	cbz x0,0x00c120c0
00c115f0	ldp x8,x9,[x19]
00c115f4	cmp x8,x9
00c115f8	b.eq 0x00c120c0
00c115fc	ldrb w9,[x8]
00c11600	cmp w9,#0x45
00c11604	b.ne 0x00c120c0
00c11608	add x8,x8,#0x1
00c1160c	add x1,sp,#0x10
00c11610	add x2,x29,#0x18
00c11614	mov x0,x19
00c11618	str x8,[x19]
00c1161c	bl 0x00c255e4
00c11620	b 0x00c1164c
00c11624	bti j
00c11628	cmp x9,#0x2
00c1162c	b.cc 0x00c11b38
00c11630	ldrb w8,[x8, #0x1]
00c11634	cmp w8,#0x74
00c11638	b.ne 0x00c11b38
00c1163c	bti j
00c11640	mov x0,x19
00c11644	bl 0x00c25dec
00c11648	cbz x0,0x00c11b18
00c1164c	ldp x22,x8,[x19, #0x130]
00c11650	cmp x22,x8
00c11654	b.ne 0x00c116c8
00c11658	ldr x21,[x19, #0x128]
00c1165c	add x8,x19,#0x140
00c11660	mov x23,x0
00c11664	sub x20,x22,x21
00c11668	cmp x21,x8
00c1166c	lsl x1,x20,#0x1
00c11670	b.eq 0x00c11688
00c11674	mov x0,x21
00c11678	bl 0x00c30950
00c1167c	str x0,[x19, #0x128]
00c11680	cbnz x0,0x00c116b4
00c11684	bl 0x00c30b40
00c11688	mov x0,x1
00c1168c	bl 0x00c308d0
00c11690	cbz x0,0x00c123ac
00c11694	cmp x22,x21
00c11698	b.eq 0x00c116b0
00c1169c	mov x1,x21
00c116a0	mov x2,x20
00c116a4	mov x22,x0
00c116a8	bl 0x00c2ff60
00c116ac	mov x0,x22
00c116b0	str x0,[x19, #0x128]
00c116b4	asr x8,x20,#0x2
00c116b8	add x22,x0,x20
00c116bc	add x8,x0,x8, LSL #0x3
00c116c0	mov x0,x23
00c116c4	str x8,[x19, #0x138]
00c116c8	str x0,[x22], #0x8
00c116cc	str x22,[x19, #0x130]
00c116d0	b 0x00c11b18
00c116d4	bti j
00c116d8	cmp x9,#0x2
00c116dc	b.cc 0x00c120c0
00c116e0	ldrb w11,[x8, #0x1]
00c116e4	mov x0,xzr
00c116e8	sub w12,w11,#0x41
00c116ec	cmp w12,#0x37
00c116f0	b.hi 0x00c11b18
00c116f4	adrp x13,0x78c000
00c116f8	add x13,x13,#0x3a4
00c116fc	adr x14,0xc1170c
00c11700	ldrh w15,[x13, x12, LSL #0x1]
00c11704	add x14,x14,x15, LSL #0x2
00c11708	br x14
00c1170c	bti j
00c11710	mov x0,x19
00c11714	bl 0x00c247b8
00c11718	cbnz x0,0x00c1164c
00c1171c	b 0x00c11b18
00c11720	bti j
00c11724	add x8,x8,#0x1
00c11728	ldr x20,[x19, #0x1330]
00c1172c	str x8,[x19]
00c11730	ldr x8,[x20, #0x8]
00c11734	sub x9,x8,#0xfd0
00c11738	cmn x9,#0xff1
00c1173c	b.hi 0x00c1175c
00c11740	mov w0,#0x1000
00c11744	bl 0x00c308d0
00c11748	cbz x0,0x00c123a8
00c1174c	mov x8,xzr
00c11750	stp x20,xzr,[x0]
00c11754	mov x20,x0
00c11758	str x0,[x19, #0x1330]
00c1175c	add x9,x8,#0x20
00c11760	add x0,x20,x8
00c11764	adrp x8,0xcb1000
00c11768	add x8,x8,#0x4c0
00c1176c	str x9,[x20, #0x8]
00c11770	mov w9,#0x8
00c11774	str x8,[x0, #0x10]!
00c11778	ldurh w8,[x0, #0x9]
00c1177c	mov w10,#0x540
00c11780	strb w9,[x0, #0x8]
00c11784	adrp x9,0x2bc000
00c11788	add x9,x9,#0xc00
00c1178c	and w8,w8,#0xf000
00c11790	orr w8,w8,w10
00c11794	sturh w8,[x0, #0x9]
00c11798	mov w8,#0xd
00c1179c	b 0x00c11b14
00c117a0	bti j
00c117a4	add x8,x8,#0x1
00c117a8	mov x0,x19
00c117ac	str x8,[x19]
00c117b0	bl 0x00c10bfc
00c117b4	str x0,[sp, #0x10]
00c117b8	cbz x0,0x00c11b18
00c117bc	mov w8,#0x1
00c117c0	str w8,[x29, #0x18]
00c117c4	b 0x00c11958
00c117c8	bti j
00c117cc	add x8,x8,#0x1
00c117d0	ldr x20,[x19, #0x1330]
00c117d4	str x8,[x19]
00c117d8	ldr x8,[x20, #0x8]
00c117dc	sub x9,x8,#0xfd0
00c117e0	cmn x9,#0xff1
00c117e4	b.hi 0x00c11804
00c117e8	mov w0,#0x1000
00c117ec	bl 0x00c308d0
00c117f0	cbz x0,0x00c123a8
00c117f4	mov x8,xzr
00c117f8	stp x20,xzr,[x0]
00c117fc	mov x20,x0
00c11800	str x0,[x19, #0x1330]
00c11804	add x9,x8,#0x20
00c11808	add x0,x20,x8
00c1180c	adrp x8,0xcb1000
00c11810	add x8,x8,#0x4c0
00c11814	str x9,[x20, #0x8]
00c11818	mov w9,#0x8
00c1181c	str x8,[x0, #0x10]!
00c11820	ldurh w8,[x0, #0x9]
00c11824	mov w10,#0x540
00c11828	strb w9,[x0, #0x8]
00c1182c	adrp x9,0x2ac000
00c11830	add x9,x9,#0xd69
00c11834	b 0x00c11a84
00c11838	bti j
00c1183c	add x8,x8,#0x1
00c11840	ldr x20,[x19, #0x1330]
00c11844	str x8,[x19]
00c11848	ldr x8,[x20, #0x8]
00c1184c	sub x9,x8,#0xfd0
00c11850	cmn x9,#0xff1
00c11854	b.hi 0x00c11874
00c11858	mov w0,#0x1000
00c1185c	bl 0x00c308d0
00c11860	cbz x0,0x00c123a8
00c11864	mov x8,xzr
00c11868	stp x20,xzr,[x0]
00c1186c	mov x20,x0
00c11870	str x0,[x19, #0x1330]
00c11874	add x9,x8,#0x20
00c11878	add x0,x20,x8
00c1187c	adrp x8,0xcb1000
00c11880	add x8,x8,#0x4c0
00c11884	str x9,[x20, #0x8]
00c11888	mov w10,#0x540
00c1188c	str x8,[x0, #0x10]!
00c11890	ldurh w8,[x0, #0x9]
00c11894	mov w9,#0x8
00c11898	and w8,w8,#0xf000
00c1189c	strb w9,[x0, #0x8]
00c118a0	adrp x9,0x2ca000
00c118a4	add x9,x9,#0x9f8
00c118a8	orr w8,w8,w10
00c118ac	sturh w8,[x0, #0x9]
00c118b0	mov w8,#0xc
00c118b4	b 0x00c11b14
00c118b8	bti j
00c118bc	add x8,x8,#0x1
00c118c0	ldr x20,[x19, #0x1330]
00c118c4	str x8,[x19]
00c118c8	ldr x8,[x20, #0x8]
00c118cc	sub x9,x8,#0xfd0
00c118d0	cmn x9,#0xff1
00c118d4	b.hi 0x00c118f4
00c118d8	mov w0,#0x1000
00c118dc	bl 0x00c308d0
00c118e0	cbz x0,0x00c123a8
00c118e4	mov x8,xzr
00c118e8	stp x20,xzr,[x0]
00c118ec	mov x20,x0
00c118f0	str x0,[x19, #0x1330]
00c118f4	add x9,x8,#0x20
00c118f8	add x0,x20,x8
00c118fc	adrp x8,0xcb1000
00c11900	add x8,x8,#0x4c0
00c11904	str x9,[x20, #0x8]
00c11908	mov w10,#0x540
00c1190c	str x8,[x0, #0x10]!
00c11910	ldurh w8,[x0, #0x9]
00c11914	mov w9,#0x8
00c11918	and w8,w8,#0xf000
00c1191c	strb w9,[x0, #0x8]
00c11920	adrp x9,0x29f000
00c11924	add x9,x9,#0x1ab
00c11928	orr w8,w8,w10
00c1192c	sturh w8,[x0, #0x9]
00c11930	mov w8,#0xe
00c11934	b 0x00c11b14
00c11938	bti j
00c1193c	add x8,x8,#0x1
00c11940	mov x0,x19
00c11944	str x8,[x19]
00c11948	bl 0x00c10bfc
00c1194c	str x0,[sp, #0x10]
00c11950	cbz x0,0x00c11b18
00c11954	str wzr,[x29, #0x18]
00c11958	add x1,sp,#0x10
00c1195c	add x2,x29,#0x18
00c11960	mov x0,x19
00c11964	bl 0x00c25fe4
00c11968	b 0x00c1164c
00c1196c	bti j
00c11970	add x8,x8,#0x1
00c11974	mov x0,x19
00c11978	str x8,[x19]
00c1197c	bl 0x00c10bfc
00c11980	str x0,[sp, #0x10]
00c11984	cbz x0,0x00c11b18
00c11988	add x1,sp,#0x10
00c1198c	mov x0,x19
00c11990	bl 0x00c25f38
00c11994	b 0x00c1164c
00c11998	bti j
00c1199c	add x8,x8,#0x1
00c119a0	ldr x20,[x19, #0x1330]
00c119a4	str x8,[x19]
00c119a8	ldr x8,[x20, #0x8]
00c119ac	sub x9,x8,#0xfd0
00c119b0	cmn x9,#0xff1
00c119b4	b.hi 0x00c119d4
00c119b8	mov w0,#0x1000
00c119bc	bl 0x00c308d0
00c119c0	cbz x0,0x00c123a8
00c119c4	mov x8,xzr
00c119c8	stp x20,xzr,[x0]
00c119cc	mov x20,x0
00c119d0	str x0,[x19, #0x1330]
00c119d4	add x9,x8,#0x20
00c119d8	add x0,x20,x8
00c119dc	adrp x8,0xcb1000
00c119e0	add x8,x8,#0x4c0
00c119e4	str x9,[x20, #0x8]
00c119e8	mov w10,#0x540
00c119ec	str x8,[x0, #0x10]!
00c119f0	ldurh w8,[x0, #0x9]
00c119f4	mov w9,#0x8
00c119f8	and w8,w8,#0xf000
00c119fc	strb w9,[x0, #0x8]
00c11a00	adrp x9,0x2ce000
00c11a04	add x9,x9,#0xbf4
00c11a08	orr w8,w8,w10
00c11a0c	sturh w8,[x0, #0x9]
00c11a10	mov w8,#0x9
00c11a14	b 0x00c11b14
00c11a18	bti j
00c11a1c	add x8,x8,#0x1
00c11a20	ldr x20,[x19, #0x1330]
00c11a24	str x8,[x19]
00c11a28	ldr x8,[x20, #0x8]
00c11a2c	sub x9,x8,#0xfd0
00c11a30	cmn x9,#0xff1
00c11a34	b.hi 0x00c11a54
00c11a38	mov w0,#0x1000
00c11a3c	bl 0x00c308d0
00c11a40	cbz x0,0x00c123a8
00c11a44	mov x8,xzr
00c11a48	stp x20,xzr,[x0]
00c11a4c	mov x20,x0
00c11a50	str x0,[x19, #0x1330]
00c11a54	add x9,x8,#0x20
00c11a58	add x0,x20,x8
00c11a5c	adrp x8,0xcb1000
00c11a60	add x8,x8,#0x4c0
00c11a64	str x9,[x20, #0x8]
00c11a68	mov w9,#0x8
00c11a6c	str x8,[x0, #0x10]!
00c11a70	ldurh w8,[x0, #0x9]
00c11a74	mov w10,#0x540
00c11a78	strb w9,[x0, #0x8]
00c11a7c	adrp x9,0x2ce000
00c11a80	add x9,x9,#0xbe3
00c11a84	and w8,w8,#0xf000
00c11a88	orr w8,w8,w10
00c11a8c	sturh w8,[x0, #0x9]
00c11a90	mov w8,#0xb
00c11a94	b 0x00c11b14
00c11a98	bti j
00c11a9c	add x8,x8,#0x1
00c11aa0	ldr x20,[x19, #0x1330]
00c11aa4	str x8,[x19]
00c11aa8	ldr x8,[x20, #0x8]
00c11aac	sub x9,x8,#0xfd0
00c11ab0	cmn x9,#0xff1
00c11ab4	b.hi 0x00c11ad4
00c11ab8	mov w0,#0x1000
00c11abc	bl 0x00c308d0
00c11ac0	cbz x0,0x00c123a8
00c11ac4	mov x8,xzr
00c11ac8	stp x20,xzr,[x0]
00c11acc	mov x20,x0
00c11ad0	str x0,[x19, #0x1330]
00c11ad4	add x9,x8,#0x20
00c11ad8	add x0,x20,x8
00c11adc	adrp x8,0xcb1000
00c11ae0	add x8,x8,#0x4c0
00c11ae4	str x9,[x20, #0x8]
00c11ae8	mov w9,#0x8
00c11aec	str x8,[x0, #0x10]!
00c11af0	ldurh w8,[x0, #0x9]
00c11af4	mov w10,#0x540
00c11af8	strb w9,[x0, #0x8]
00c11afc	adrp x9,0x2bc000
00c11b00	add x9,x9,#0xd2c
00c11b04	and w8,w8,#0xf000
00c11b08	orr w8,w8,w10
00c11b0c	sturh w8,[x0, #0x9]
00c11b10	mov w8,#0x4
00c11b14	stp x9,x8,[x0, #0x10]
00c11b18	bti j
00c11b1c	ldp x20,x19,[sp, #0x50]
00c11b20	ldr x23,[sp, #0x30]
00c11b24	ldp x22,x21,[sp, #0x40]
00c11b28	ldp x29,x30,[sp, #0x20]
00c11b2c	add sp,sp,#0x60
00c11b30	autiasp
00c11b34	ret
00c11b38	add x2,x29,#0x18
00c11b3c	mov x0,x19
00c11b40	mov x1,xzr
00c11b44	strb wzr,[x29, #0x18]
00c11b48	bl 0x00c147d8
00c11b4c	str x0,[sp, #0x8]
00c11b50	cbz x0,0x00c120c0
00c11b54	ldp x8,x9,[x19]
00c11b58	cmp x9,x8
00c11b5c	b.eq 0x00c11c28
00c11b60	ldrb w9,[x8]
00c11b64	ldrb w8,[x29, #0x18]
00c11b68	cmp w9,#0x49
00c11b6c	b.ne 0x00c11b7c
00c11b70	tbz w8,#0x0,0x00c11c34
00c11b74	ldrb w9,[x19, #0x308]
00c11b78	tbnz w9,#0x0,0x00c11c40
00c11b7c	tbz w8,#0x0,0x00c1164c
00c11b80	b 0x00c11b18
00c11b84	mov x0,x19
00c11b88	bl 0x00c16098
00c11b8c	cbz x0,0x00c11648
00c11b90	ldp x8,x9,[x19]
00c11b94	cmp x8,x9
00c11b98	b.eq 0x00c11c1c
00c11b9c	ldrb w9,[x8]
00c11ba0	cmp w9,#0x5f
00c11ba4	b.ne 0x00c11c1c
00c11ba8	add x8,x8,#0x1
00c11bac	str x0,[x29, #0x18]
00c11bb0	b 0x00c11bf0
00c11bb4	mov x0,x19
00c11bb8	mov w1,wzr
00c11bbc	bl 0x00c10abc
00c11bc0	stp x0,x1,[sp, #0x10]
00c11bc4	add x1,sp,#0x10
00c11bc8	mov x0,x19
00c11bcc	bl 0x00c15bec
00c11bd0	ldp x8,x9,[x19]
00c11bd4	str x0,[x29, #0x18]
00c11bd8	cmp x8,x9
00c11bdc	b.eq 0x00c11c1c
00c11be0	ldrb w9,[x8]
00c11be4	cmp w9,#0x5f
00c11be8	b.ne 0x00c11c1c
00c11bec	add x8,x8,#0x1
00c11bf0	str x8,[x19]
00c11bf4	mov x0,x19
00c11bf8	bl 0x00c10bfc
00c11bfc	str x0,[sp, #0x10]
00c11c00	cbz x0,0x00c11648
00c11c04	add x1,sp,#0x10
00c11c08	add x2,x29,#0x18
00c11c0c	mov x0,x19
00c11c10	bl 0x00c278f0
00c11c14	cbnz x0,0x00c1164c
00c11c18	b 0x00c11b18
00c11c1c	mov x0,xzr
00c11c20	cbnz xzr,0x00c1164c
00c11c24	b 0x00c11b18
00c11c28	ldrb w8,[x29, #0x18]
00c11c2c	tbz w8,#0x0,0x00c1164c
00c11c30	b 0x00c11b18
00c11c34	add x0,x19,#0x128
00c11c38	add x1,sp,#0x8
00c11c3c	bl 0x00c12fcc
00c11c40	mov x0,x19
00c11c44	mov w1,wzr
00c11c48	bl 0x00c14948
00c11c4c	str x0,[sp, #0x10]
00c11c50	cbz x0,0x00c120c0
00c11c54	add x1,sp,#0x8
00c11c58	add x2,sp,#0x10
00c11c5c	mov x0,x19
00c11c60	bl 0x00c14e14
00c11c64	b 0x00c1164c
00c11c68	add x1,sp,#0x10
00c11c6c	mov x0,x19
00c11c70	bl 0x00c14548
00c11c74	b 0x00c1164c
00c11c78	bti j
00c11c7c	mov x0,x19
00c11c80	bl 0x00c15284
00c11c84	cbnz x0,0x00c1164c
00c11c88	b 0x00c11b18
00c11c8c	bti j
00c11c90	adrp x9,0x29f000
00c11c94	add x9,x9,#0x1cd
00c11c98	adrp x10,0x2d4000
00c11c9c	add x10,x10,#0xc90
00c11ca0	cmp w11,#0x6b
00c11ca4	mov w11,#0x5
00c11ca8	csel x9,x10,x9,eq
00c11cac	mov w10,#0xf
00c11cb0	add x8,x8,#0x2
00c11cb4	csel x10,x11,x10,eq
00c11cb8	mov x0,x19
00c11cbc	mov x1,xzr
00c11cc0	stp x9,x10,[sp, #0x10]
00c11cc4	str x8,[x19]
00c11cc8	bl 0x00c12574
00c11ccc	str x0,[x29, #0x18]
00c11cd0	cbz x0,0x00c11b18
00c11cd4	add x1,x29,#0x18
00c11cd8	add x2,sp,#0x10
00c11cdc	mov x0,x19
00c11ce0	bl 0x00c25a8c
00c11ce4	b 0x00c11b18
00c11ce8	bti j
00c11cec	cmp w11,#0x42
00c11cf0	add x8,x8,#0x2
00c11cf4	cset w9,eq
00c11cf8	cmp x10,x8
00c11cfc	str x8,[x19]
00c11d00	strb w9,[x29, #0x18]
00c11d04	b.eq 0x00c11d18
00c11d08	ldrb w8,[x8]
00c11d0c	sub w8,w8,#0x3a
00c11d10	cmn w8,#0xa
00c11d14	b.cs 0x00c1201c
00c11d18	mov x0,x19
00c11d1c	bl 0x00c16098
00c11d20	str x0,[sp, #0x10]
00c11d24	cbnz x0,0x00c1203c
00c11d28	b 0x00c11b18
00c11d2c	bti j
00c11d30	adrp x1,0x2c6000
00c11d34	add x1,x1,#0xa1d
00c11d38	b 0x00c11fc0
00c11d3c	bti j
00c11d40	adrp x1,0x2a9000
00c11d44	add x1,x1,#0x132
00c11d48	b 0x00c11f3c
00c11d4c	bti j
00c11d50	mov x0,x19
00c11d54	bl 0x00c25b38
00c11d58	cbnz x0,0x00c1164c
00c11d5c	b 0x00c11b18
00c11d60	bti j
00c11d64	adrp x1,0x2da000
00c11d68	add x1,x1,#0xe4e
00c11d6c	b 0x00c11ff4
00c11d70	bti j
00c11d74	add x8,x8,#0x2
00c11d78	mov x0,x19
00c11d7c	str x8,[x19]
00c11d80	bl 0x00c10bfc
00c11d84	str x0,[sp, #0x10]
00c11d88	cbz x0,0x00c11b18
00c11d8c	add x1,sp,#0x10
00c11d90	mov x0,x19
00c11d94	bl 0x00c19530
00c11d98	b 0x00c1164c
00c11d9c	bti j
00c11da0	add x11,x8,#0x2
00c11da4	subs x9,x10,x11
00c11da8	str x11,[x19]
00c11dac	b.eq 0x00c120c0
00c11db0	cmp x9,#0x2
00c11db4	mov x0,xzr
00c11db8	b.cc 0x00c11b18
00c11dbc	ldrb w10,[x11]
00c11dc0	cmp w10,#0x44
00c11dc4	b.ne 0x00c11b18
00c11dc8	ldrb w10,[x8, #0x3]
00c11dcc	cmp w10,#0x52
00c11dd0	b.eq 0x00c12190
00c11dd4	cmp w10,#0x41
00c11dd8	b.ne 0x00c120c0
00c11ddc	cmp x9,#0x2
00c11de0	b.ls 0x00c121f0
00c11de4	ldrb w9,[x8, #0x4]
00c11de8	mov x0,xzr
00c11dec	add x8,x8,#0x5
00c11df0	str x8,[x19]
00c11df4	cmp w9,#0x6c
00c11df8	b.gt 0x00c122ac
00c11dfc	cmp w9,#0x69
00c11e00	b.eq 0x00c12310
00c11e04	cmp w9,#0x6a
00c11e08	b.eq 0x00c1235c
00c11e0c	cmp w9,#0x6c
00c11e10	b.ne 0x00c11b18
00c11e14	adrp x1,0x2b1000
00c11e18	add x1,x1,#0x1e5
00c11e1c	b 0x00c121d0
00c11e20	bti j
00c11e24	adrp x1,0x2ce000
00c11e28	add x1,x1,#0xc08
00c11e2c	b 0x00c11f08
00c11e30	bti j
00c11e34	add x8,x8,#0x2
00c11e38	adrp x1,0x2a9000
00c11e3c	add x1,x1,#0x12a
00c11e40	mov x0,x19
00c11e44	str x8,[x19]
00c11e48	ldp x20,x19,[sp, #0x50]
00c11e4c	ldr x23,[sp, #0x30]
00c11e50	ldp x22,x21,[sp, #0x40]
00c11e54	ldp x29,x30,[sp, #0x20]
00c11e58	add sp,sp,#0x60
00c11e5c	autiasp
00c11e60	b 0x00c1c880
00c11e64	bti j
00c11e68	cmp x9,#0x2
00c11e6c	b.eq 0x00c11fa4
00c11e70	ldrb w9,[x8, #0x2]
00c11e74	mov x10,xzr
00c11e78	add x8,x8,#0x3
00c11e7c	str x8,[x19]
00c11e80	cmp w9,#0x6c
00c11e84	b.gt 0x00c12124
00c11e88	cmp w9,#0x69
00c11e8c	b.eq 0x00c121f8
00c11e90	cmp w9,#0x6a
00c11e94	b.eq 0x00c12210
00c11e98	cmp w9,#0x6c
00c11e9c	mov x0,x10
00c11ea0	b.ne 0x00c11b18
00c11ea4	adrp x1,0x2c2000
00c11ea8	add x1,x1,#0xc57
00c11eac	b 0x00c12104
00c11eb0	bti j
00c11eb4	add x8,x8,#0x2
00c11eb8	adrp x1,0x2b3000
00c11ebc	add x1,x1,#0x305
00c11ec0	mov x0,x19
00c11ec4	mov w2,#0x3
00c11ec8	str x8,[x19]
00c11ecc	bl 0x00c0ffd8
00c11ed0	tbz w0,#0x0,0x00c12070
00c11ed4	adrp x1,0x2cc000
00c11ed8	add x1,x1,#0xa88
00c11edc	mov x0,x19
00c11ee0	ldp x20,x19,[sp, #0x50]
00c11ee4	ldr x23,[sp, #0x30]
00c11ee8	ldp x22,x21,[sp, #0x40]
00c11eec	ldp x29,x30,[sp, #0x20]
00c11ef0	add sp,sp,#0x60
00c11ef4	autiasp
00c11ef8	b 0x00c1e870
00c11efc	bti j
00c11f00	adrp x1,0x2a1000
00c11f04	add x1,x1,#0xf81
00c11f08	add x8,x8,#0x2
00c11f0c	mov x0,x19
00c11f10	str x8,[x19]
00c11f14	ldp x20,x19,[sp, #0x50]
00c11f18	ldr x23,[sp, #0x30]
00c11f1c	ldp x22,x21,[sp, #0x40]
00c11f20	ldp x29,x30,[sp, #0x20]
00c11f24	add sp,sp,#0x60
00c11f28	autiasp
00c11f2c	b 0x00c15d60
00c11f30	bti j
00c11f34	adrp x1,0x2a1000
00c11f38	add x1,x1,#0x443
00c11f3c	add x8,x8,#0x2
00c11f40	mov x0,x19
00c11f44	str x8,[x19]
00c11f48	ldp x20,x19,[sp, #0x50]
00c11f4c	ldr x23,[sp, #0x30]
00c11f50	ldp x22,x21,[sp, #0x40]
00c11f54	ldp x29,x30,[sp, #0x20]
00c11f58	add sp,sp,#0x60
00c11f5c	autiasp
00c11f60	b 0x00c2383c
00c11f64	bti j
00c11f68	add x8,x8,#0x2
00c11f6c	adrp x1,0x2b3000
00c11f70	add x1,x1,#0x2fa
00c11f74	mov x0,x19
00c11f78	str x8,[x19]
00c11f7c	ldp x20,x19,[sp, #0x50]
00c11f80	ldr x23,[sp, #0x30]
00c11f84	ldp x22,x21,[sp, #0x40]
00c11f88	ldp x29,x30,[sp, #0x20]
00c11f8c	add sp,sp,#0x60
00c11f90	autiasp
00c11f94	b 0x00c25538
00c11f98	bti j
00c11f9c	cmp x9,#0x2
00c11fa0	b.ne 0x00c120c8
00c11fa4	add x8,x8,#0x3
00c11fa8	mov x0,xzr
00c11fac	str x8,[x19]
00c11fb0	b 0x00c11b18
00c11fb4	bti j
00c11fb8	adrp x1,0x2ce000
00c11fbc	add x1,x1,#0xbfe
00c11fc0	add x8,x8,#0x2
00c11fc4	mov x0,x19
00c11fc8	str x8,[x19]
00c11fcc	ldp x20,x19,[sp, #0x50]
00c11fd0	ldr x23,[sp, #0x30]
00c11fd4	ldp x22,x21,[sp, #0x40]
00c11fd8	ldp x29,x30,[sp, #0x20]
00c11fdc	add sp,sp,#0x60
00c11fe0	autiasp
00c11fe4	b 0x00c25288
00c11fe8	bti j
00c11fec	adrp x1,0x2be000
00c11ff0	add x1,x1,#0xdcd
00c11ff4	add x8,x8,#0x2
00c11ff8	mov x0,x19
00c11ffc	str x8,[x19]
00c12000	ldp x20,x19,[sp, #0x50]
00c12004	ldr x23,[sp, #0x30]
00c12008	ldp x22,x21,[sp, #0x40]
00c1200c	ldp x29,x30,[sp, #0x20]
00c12010	add sp,sp,#0x60
00c12014	autiasp
00c12018	b 0x00c25334
00c1201c	mov x0,x19
00c12020	mov w1,wzr
00c12024	bl 0x00c10abc
00c12028	stp x0,x1,[sp, #0x10]
00c1202c	add x1,sp,#0x10
00c12030	mov x0,x19
00c12034	bl 0x00c15bec
00c12038	str x0,[sp, #0x10]
00c1203c	ldp x8,x9,[x19]
00c12040	cmp x8,x9
00c12044	b.eq 0x00c120c0
00c12048	ldrb w9,[x8]
00c1204c	cmp w9,#0x5f
00c12050	b.ne 0x00c120c0
00c12054	add x8,x8,#0x1
00c12058	add x1,sp,#0x10
00c1205c	add x2,x29,#0x18
00c12060	mov x0,x19
00c12064	str x8,[x19]
00c12068	bl 0x00c259e0
00c1206c	b 0x00c11b18
00c12070	mov x0,x19
00c12074	mov w1,wzr
00c12078	bl 0x00c10abc
00c1207c	stp x0,x1,[sp, #0x10]
00c12080	add x1,sp,#0x10
00c12084	mov x0,x19
00c12088	bl 0x00c15bec
00c1208c	ldp x8,x9,[x19]
00c12090	str x0,[sp, #0x10]
00c12094	cmp x8,x9
00c12098	b.eq 0x00c120c0
00c1209c	ldrb w9,[x8]
00c120a0	cmp w9,#0x5f
00c120a4	b.ne 0x00c120c0
00c120a8	add x8,x8,#0x1
00c120ac	add x1,sp,#0x10
00c120b0	mov x0,x19
00c120b4	str x8,[x19]
00c120b8	bl 0x00c25690
00c120bc	b 0x00c11b18
00c120c0	mov x0,xzr
00c120c4	b 0x00c11b18
00c120c8	ldrb w9,[x8, #0x2]
00c120cc	mov x10,xzr
00c120d0	add x8,x8,#0x3
00c120d4	str x8,[x19]
00c120d8	cmp w9,#0x6c
00c120dc	b.gt 0x00c1214c
00c120e0	cmp w9,#0x69
00c120e4	b.eq 0x00c12228
00c120e8	cmp w9,#0x6a
00c120ec	b.eq 0x00c12278
00c120f0	cmp w9,#0x6c
00c120f4	mov x0,x10
00c120f8	b.ne 0x00c11b18
00c120fc	adrp x1,0x2be000
00c12100	add x1,x1,#0xdac
00c12104	mov x0,x19
00c12108	ldp x20,x19,[sp, #0x50]
00c1210c	ldr x23,[sp, #0x30]
00c12110	ldp x22,x21,[sp, #0x40]
00c12114	ldp x29,x30,[sp, #0x20]
00c12118	add sp,sp,#0x60
00c1211c	autiasp
00c12120	b 0x00c25130
00c12124	cmp w9,#0x6d
00c12128	b.eq 0x00c12204
00c1212c	cmp w9,#0x74
00c12130	b.eq 0x00c1221c
00c12134	cmp w9,#0x73
00c12138	mov x0,x10
00c1213c	b.ne 0x00c11b18
00c12140	adrp x1,0x2d8000
00c12144	add x1,x1,#0xe88
00c12148	b 0x00c12170
00c1214c	cmp w9,#0x6d
00c12150	b.eq 0x00c12250
00c12154	cmp w9,#0x74
00c12158	b.eq 0x00c12284
00c1215c	cmp w9,#0x73
00c12160	mov x0,x10
00c12164	b.ne 0x00c11b18
00c12168	adrp x1,0x2ab000
00c1216c	add x1,x1,#0x2f0
00c12170	mov x0,x19
00c12174	ldp x20,x19,[sp, #0x50]
00c12178	ldr x23,[sp, #0x30]
00c1217c	ldp x22,x21,[sp, #0x40]
00c12180	ldp x29,x30,[sp, #0x20]
00c12184	add sp,sp,#0x60
00c12188	autiasp
00c1218c	b 0x00c251dc
00c12190	cmp x9,#0x2
00c12194	b.ls 0x00c121f0
00c12198	ldrb w9,[x8, #0x4]
00c1219c	mov x0,xzr
00c121a0	add x8,x8,#0x5
00c121a4	str x8,[x19]
00c121a8	cmp w9,#0x6c
00c121ac	b.gt 0x00c122d0
00c121b0	cmp w9,#0x69
00c121b4	b.eq 0x00c12328
00c121b8	cmp w9,#0x6a
00c121bc	b.eq 0x00c12374
00c121c0	cmp w9,#0x6c
00c121c4	b.ne 0x00c11b18
00c121c8	adrp x1,0x2b8000
00c121cc	add x1,x1,#0xd42
00c121d0	mov x0,x19
00c121d4	ldp x20,x19,[sp, #0x50]
00c121d8	ldr x23,[sp, #0x30]
00c121dc	ldp x22,x21,[sp, #0x40]
00c121e0	ldp x29,x30,[sp, #0x20]
00c121e4	add sp,sp,#0x60
00c121e8	autiasp
00c121ec	b 0x00c25888
00c121f0	add x8,x8,#0x5
00c121f4	b 0x00c11fa8
00c121f8	adrp x1,0x2d6000
00c121fc	add x1,x1,#0xefd
00c12200	b 0x00c12230
00c12204	adrp x1,0x2a5000
00c12208	add x1,x1,#0x127
00c1220c	b 0x00c12258
00c12210	adrp x1,0x2ac000
00c12214	add x1,x1,#0xd75
00c12218	b 0x00c11edc
00c1221c	adrp x1,0x2da000
00c12220	add x1,x1,#0xe38
00c12224	b 0x00c1228c
00c12228	adrp x1,0x2a9000
00c1222c	add x1,x1,#0x10e
00c12230	mov x0,x19
00c12234	ldp x20,x19,[sp, #0x50]
00c12238	ldr x23,[sp, #0x30]
00c1223c	ldp x22,x21,[sp, #0x40]
00c12240	ldp x29,x30,[sp, #0x20]
00c12244	add sp,sp,#0x60
00c12248	autiasp
00c1224c	b 0x00c2548c
00c12250	adrp x1,0x2a9000
00c12254	add x1,x1,#0x115
00c12258	mov x0,x19
00c1225c	ldp x20,x19,[sp, #0x50]
00c12260	ldr x23,[sp, #0x30]
00c12264	ldp x22,x21,[sp, #0x40]
00c12268	ldp x29,x30,[sp, #0x20]
00c1226c	add sp,sp,#0x60
00c12270	autiasp
00c12274	b 0x00c25730
00c12278	adrp x1,0x2ba000
00c1227c	add x1,x1,#0xcca
00c12280	b 0x00c11edc
00c12284	adrp x1,0x2d0000
00c12288	add x1,x1,#0xad7
00c1228c	mov x0,x19
00c12290	ldp x20,x19,[sp, #0x50]
00c12294	ldr x23,[sp, #0x30]
00c12298	ldp x22,x21,[sp, #0x40]
00c1229c	ldp x29,x30,[sp, #0x20]
00c122a0	add sp,sp,#0x60
00c122a4	autiasp
00c122a8	b 0x00c1449c
00c122ac	cmp w9,#0x6d
00c122b0	b.eq 0x00c1231c
00c122b4	cmp w9,#0x74
00c122b8	b.eq 0x00c12368
00c122bc	cmp w9,#0x73
00c122c0	b.ne 0x00c11b18
00c122c4	adrp x1,0x2c6000
00c122c8	add x1,x1,#0xa27
00c122cc	b 0x00c122f0
00c122d0	cmp w9,#0x6d
00c122d4	b.eq 0x00c12334
00c122d8	cmp w9,#0x74
00c122dc	b.eq 0x00c12380
00c122e0	cmp w9,#0x73
00c122e4	b.ne 0x00c11b18
00c122e8	adrp x1,0x2cc000
00c122ec	add x1,x1,#0xa98
00c122f0	mov x0,x19
00c122f4	ldp x20,x19,[sp, #0x50]
00c122f8	ldr x23,[sp, #0x30]
00c122fc	ldp x22,x21,[sp, #0x40]
00c12300	ldp x29,x30,[sp, #0x20]
00c12304	add sp,sp,#0x60
00c12308	autiasp
00c1230c	b 0x00c253e0
00c12310	adrp x1,0x2ba000
00c12314	add x1,x1,#0xcda
00c12318	b 0x00c12104
00c1231c	adrp x1,0x2b8000
00c12320	add x1,x1,#0xd28
00c12324	b 0x00c1233c
00c12328	adrp x1,0x2dd000
00c1232c	add x1,x1,#0x348
00c12330	b 0x00c12104
00c12334	adrp x1,0x2b3000
00c12338	add x1,x1,#0x309
00c1233c	mov x0,x19
00c12340	ldp x20,x19,[sp, #0x50]
00c12344	ldr x23,[sp, #0x30]
00c12348	ldp x22,x21,[sp, #0x40]
00c1234c	ldp x29,x30,[sp, #0x20]
00c12350	add sp,sp,#0x60
00c12354	autiasp
00c12358	b 0x00c25934
00c1235c	adrp x1,0x2d6000
00c12360	add x1,x1,#0xf04
00c12364	b 0x00c12258
00c12368	adrp x1,0x2d4000
00c1236c	add x1,x1,#0xc75
00c12370	b 0x00c12388
00c12374	adrp x1,0x2be000
00c12378	add x1,x1,#0xdb8
00c1237c	b 0x00c12258
00c12380	adrp x1,0x2dd000
00c12384	add x1,x1,#0x32d
00c12388	mov x0,x19
00c1238c	ldp x20,x19,[sp, #0x50]
00c12390	ldr x23,[sp, #0x30]
00c12394	ldp x22,x21,[sp, #0x40]
00c12398	ldp x29,x30,[sp, #0x20]
00c1239c	add sp,sp,#0x60
00c123a0	autiasp
00c123a4	b 0x00c257dc
00c123a8	bl 0x00c2fff0
00c123ac	bl 0x00c30b40
