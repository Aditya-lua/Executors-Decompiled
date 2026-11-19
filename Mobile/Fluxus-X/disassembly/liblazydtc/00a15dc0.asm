; DES_encrypt2 @ 00a15dc0
00a15dc0	str x19,[sp, #-0x10]!
00a15dc4	ldp w8,w9,[x0]
00a15dc8	ror w16,w8,#0x1d
00a15dcc	ror w17,w9,#0x1d
00a15dd0	cbz w2,0x00a16498
00a15dd4	ldp w15,w18,[x1]
00a15dd8	adrp x8,0xcb5000
00a15ddc	ldr x8,[x8, #0x4c8]
00a15de0	ldp w2,w3,[x1, #0x8]
00a15de4	eor w6,w15,w16
00a15de8	ubfx w15,w6,#0x2,#0x6
00a15dec	ldr w7,[x8, w15, UXTW #0x2]
00a15df0	add x9,x8,#0x200
00a15df4	ubfx w19,w6,#0xa,#0x6
00a15df8	add x10,x8,#0x400
00a15dfc	eor w17,w7,w17
00a15e00	ubfx w7,w6,#0x12,#0x6
00a15e04	ldr w19,[x9, w19, UXTW #0x2]
00a15e08	add x11,x8,#0x600
00a15e0c	lsr w6,w6,#0x1a
00a15e10	ldr w7,[x10, w7, UXTW #0x2]
00a15e14	ldr w6,[x11, w6, UXTW #0x2]
00a15e18	eor w18,w18,w16
00a15e1c	eor w17,w17,w19
00a15e20	add x12,x8,#0x100
00a15e24	eor w17,w17,w7
00a15e28	ubfx w7,w18,#0x6,#0x6
00a15e2c	add x13,x8,#0x300
00a15e30	eor w17,w17,w6
00a15e34	ubfx w6,w18,#0xe,#0x6
00a15e38	ldr w7,[x12, w7, UXTW #0x2]
00a15e3c	add x14,x8,#0x500
00a15e40	ror w19,w18,#0x4
00a15e44	ubfx w18,w18,#0x16,#0x6
00a15e48	ldr w6,[x13, w6, UXTW #0x2]
00a15e4c	add x15,x8,#0x700
00a15e50	ldr w18,[x14, w18, UXTW #0x2]
00a15e54	lsr w19,w19,#0x1a
00a15e58	ldr w19,[x15, w19, UXTW #0x2]
00a15e5c	eor w17,w17,w7
00a15e60	eor w17,w17,w6
00a15e64	eor w17,w17,w18
00a15e68	eor w17,w17,w19
00a15e6c	eor w18,w17,w2
00a15e70	ubfx w2,w18,#0x2,#0x6
00a15e74	ldr w2,[x8, w2, UXTW #0x2]
00a15e78	ubfx w19,w18,#0xa,#0x6
00a15e7c	ldr w19,[x9, w19, UXTW #0x2]
00a15e80	eor w3,w17,w3
00a15e84	eor w16,w2,w16
00a15e88	ubfx w2,w18,#0x12,#0x6
00a15e8c	lsr w18,w18,#0x1a
00a15e90	ldr w2,[x10, w2, UXTW #0x2]
00a15e94	ldr w18,[x11, w18, UXTW #0x2]
00a15e98	eor w16,w16,w19
00a15e9c	ror w19,w3,#0x4
00a15ea0	eor w16,w16,w2
00a15ea4	ubfx w2,w3,#0x6,#0x6
00a15ea8	eor w16,w16,w18
00a15eac	ubfx w18,w3,#0xe,#0x6
00a15eb0	ldr w2,[x12, w2, UXTW #0x2]
00a15eb4	ubfx w3,w3,#0x16,#0x6
00a15eb8	ldr w18,[x13, w18, UXTW #0x2]
00a15ebc	ldr w3,[x14, w3, UXTW #0x2]
00a15ec0	lsr w19,w19,#0x1a
00a15ec4	ldr w19,[x15, w19, UXTW #0x2]
00a15ec8	ldp w4,w5,[x1, #0x10]
00a15ecc	eor w16,w16,w2
00a15ed0	eor w16,w16,w18
00a15ed4	eor w16,w16,w3
00a15ed8	eor w16,w16,w19
00a15edc	eor w18,w16,w4
00a15ee0	ubfx w2,w18,#0x2,#0x6
00a15ee4	ldr w2,[x8, w2, UXTW #0x2]
00a15ee8	ubfx w19,w18,#0xa,#0x6
00a15eec	ldr w19,[x9, w19, UXTW #0x2]
00a15ef0	eor w5,w16,w5
00a15ef4	eor w17,w2,w17
00a15ef8	ubfx w2,w18,#0x12,#0x6
00a15efc	lsr w18,w18,#0x1a
00a15f00	ldr w2,[x10, w2, UXTW #0x2]
00a15f04	ldr w18,[x11, w18, UXTW #0x2]
00a15f08	eor w17,w17,w19
00a15f0c	ror w19,w5,#0x4
00a15f10	eor w17,w17,w2
00a15f14	ubfx w2,w5,#0x6,#0x6
00a15f18	eor w17,w17,w18
00a15f1c	ubfx w18,w5,#0xe,#0x6
00a15f20	ldr w2,[x12, w2, UXTW #0x2]
00a15f24	ubfx w5,w5,#0x16,#0x6
00a15f28	ldr w18,[x13, w18, UXTW #0x2]
00a15f2c	ldr w5,[x14, w5, UXTW #0x2]
00a15f30	lsr w19,w19,#0x1a
00a15f34	ldr w19,[x15, w19, UXTW #0x2]
00a15f38	ldp w6,w7,[x1, #0x18]
00a15f3c	eor w17,w17,w2
00a15f40	eor w17,w17,w18
00a15f44	eor w17,w17,w5
00a15f48	eor w17,w17,w19
00a15f4c	eor w18,w17,w6
00a15f50	ubfx w2,w18,#0x2,#0x6
00a15f54	ldr w2,[x8, w2, UXTW #0x2]
00a15f58	ubfx w19,w18,#0xa,#0x6
00a15f5c	ldr w19,[x9, w19, UXTW #0x2]
00a15f60	eor w7,w17,w7
00a15f64	eor w16,w2,w16
00a15f68	ubfx w2,w18,#0x12,#0x6
00a15f6c	lsr w18,w18,#0x1a
00a15f70	ldr w2,[x10, w2, UXTW #0x2]
00a15f74	ldr w18,[x11, w18, UXTW #0x2]
00a15f78	eor w16,w16,w19
00a15f7c	ror w19,w7,#0x4
00a15f80	eor w16,w16,w2
00a15f84	ubfx w2,w7,#0x6,#0x6
00a15f88	eor w16,w16,w18
00a15f8c	ubfx w18,w7,#0xe,#0x6
00a15f90	ldr w2,[x12, w2, UXTW #0x2]
00a15f94	ubfx w7,w7,#0x16,#0x6
00a15f98	ldr w18,[x13, w18, UXTW #0x2]
00a15f9c	ldr w7,[x14, w7, UXTW #0x2]
00a15fa0	lsr w19,w19,#0x1a
00a15fa4	ldr w19,[x15, w19, UXTW #0x2]
00a15fa8	ldp w3,w4,[x1, #0x20]
00a15fac	eor w16,w16,w2
00a15fb0	eor w16,w16,w18
00a15fb4	eor w16,w16,w7
00a15fb8	eor w16,w16,w19
00a15fbc	eor w18,w16,w3
00a15fc0	ubfx w2,w18,#0x2,#0x6
00a15fc4	ldr w2,[x8, w2, UXTW #0x2]
00a15fc8	ubfx w19,w18,#0xa,#0x6
00a15fcc	ldr w19,[x9, w19, UXTW #0x2]
00a15fd0	eor w4,w16,w4
00a15fd4	eor w17,w2,w17
00a15fd8	ubfx w2,w18,#0x12,#0x6
00a15fdc	lsr w18,w18,#0x1a
00a15fe0	ldr w2,[x10, w2, UXTW #0x2]
00a15fe4	ldr w18,[x11, w18, UXTW #0x2]
00a15fe8	eor w17,w17,w19
00a15fec	ror w19,w4,#0x4
00a15ff0	eor w17,w17,w2
00a15ff4	ubfx w2,w4,#0x6,#0x6
00a15ff8	eor w17,w17,w18
00a15ffc	ubfx w18,w4,#0xe,#0x6
00a16000	ldr w2,[x12, w2, UXTW #0x2]
00a16004	ubfx w4,w4,#0x16,#0x6
00a16008	ldr w18,[x13, w18, UXTW #0x2]
00a1600c	ldr w4,[x14, w4, UXTW #0x2]
00a16010	lsr w19,w19,#0x1a
00a16014	ldr w19,[x15, w19, UXTW #0x2]
00a16018	ldp w5,w6,[x1, #0x28]
00a1601c	eor w17,w17,w2
00a16020	eor w17,w17,w18
00a16024	eor w17,w17,w4
00a16028	eor w17,w17,w19
00a1602c	eor w18,w17,w5
00a16030	ubfx w2,w18,#0x2,#0x6
00a16034	ldr w2,[x8, w2, UXTW #0x2]
00a16038	ubfx w19,w18,#0xa,#0x6
00a1603c	ldr w19,[x9, w19, UXTW #0x2]
00a16040	eor w6,w17,w6
00a16044	eor w16,w2,w16
00a16048	ubfx w2,w18,#0x12,#0x6
00a1604c	lsr w18,w18,#0x1a
00a16050	ldr w2,[x10, w2, UXTW #0x2]
00a16054	ldr w18,[x11, w18, UXTW #0x2]
00a16058	eor w16,w16,w19
00a1605c	ror w19,w6,#0x4
00a16060	eor w16,w16,w2
00a16064	ubfx w2,w6,#0x6,#0x6
00a16068	eor w16,w16,w18
00a1606c	ubfx w18,w6,#0xe,#0x6
00a16070	ldr w2,[x12, w2, UXTW #0x2]
00a16074	ubfx w6,w6,#0x16,#0x6
00a16078	ldr w18,[x13, w18, UXTW #0x2]
00a1607c	ldr w6,[x14, w6, UXTW #0x2]
00a16080	lsr w19,w19,#0x1a
00a16084	ldr w19,[x15, w19, UXTW #0x2]
00a16088	ldp w3,w7,[x1, #0x30]
00a1608c	eor w16,w16,w2
00a16090	eor w16,w16,w18
00a16094	eor w16,w16,w6
00a16098	eor w16,w16,w19
00a1609c	eor w18,w16,w3
00a160a0	ubfx w2,w18,#0x2,#0x6
00a160a4	ldr w2,[x8, w2, UXTW #0x2]
00a160a8	ubfx w19,w18,#0xa,#0x6
00a160ac	ldr w19,[x9, w19, UXTW #0x2]
00a160b0	eor w7,w16,w7
00a160b4	eor w17,w2,w17
00a160b8	ubfx w2,w18,#0x12,#0x6
00a160bc	lsr w18,w18,#0x1a
00a160c0	ldr w2,[x10, w2, UXTW #0x2]
00a160c4	ldr w18,[x11, w18, UXTW #0x2]
00a160c8	eor w17,w17,w19
00a160cc	ror w19,w7,#0x4
00a160d0	eor w17,w17,w2
00a160d4	ubfx w2,w7,#0x6,#0x6
00a160d8	eor w17,w17,w18
00a160dc	ubfx w18,w7,#0xe,#0x6
00a160e0	ldr w2,[x12, w2, UXTW #0x2]
00a160e4	ubfx w7,w7,#0x16,#0x6
00a160e8	ldr w18,[x13, w18, UXTW #0x2]
00a160ec	ldr w7,[x14, w7, UXTW #0x2]
00a160f0	lsr w19,w19,#0x1a
00a160f4	ldr w19,[x15, w19, UXTW #0x2]
00a160f8	ldp w4,w5,[x1, #0x38]
00a160fc	eor w17,w17,w2
00a16100	eor w17,w17,w18
00a16104	eor w17,w17,w7
00a16108	eor w17,w17,w19
00a1610c	eor w18,w17,w4
00a16110	ubfx w2,w18,#0x2,#0x6
00a16114	ldr w2,[x8, w2, UXTW #0x2]
00a16118	ubfx w19,w18,#0xa,#0x6
00a1611c	ldr w19,[x9, w19, UXTW #0x2]
00a16120	eor w5,w17,w5
00a16124	eor w16,w2,w16
00a16128	ubfx w2,w18,#0x12,#0x6
00a1612c	lsr w18,w18,#0x1a
00a16130	ldr w2,[x10, w2, UXTW #0x2]
00a16134	ldr w18,[x11, w18, UXTW #0x2]
00a16138	eor w16,w16,w19
00a1613c	ror w19,w5,#0x4
00a16140	eor w16,w16,w2
00a16144	ubfx w2,w5,#0x6,#0x6
00a16148	eor w16,w16,w18
00a1614c	ubfx w18,w5,#0xe,#0x6
00a16150	ldr w2,[x12, w2, UXTW #0x2]
00a16154	ubfx w5,w5,#0x16,#0x6
00a16158	ldr w18,[x13, w18, UXTW #0x2]
00a1615c	ldr w5,[x14, w5, UXTW #0x2]
00a16160	lsr w19,w19,#0x1a
00a16164	ldr w19,[x15, w19, UXTW #0x2]
00a16168	ldp w3,w6,[x1, #0x40]
00a1616c	eor w16,w16,w2
00a16170	eor w16,w16,w18
00a16174	eor w16,w16,w5
00a16178	eor w16,w16,w19
00a1617c	eor w18,w16,w3
00a16180	ubfx w2,w18,#0x2,#0x6
00a16184	ldr w2,[x8, w2, UXTW #0x2]
00a16188	ubfx w19,w18,#0xa,#0x6
00a1618c	ldr w19,[x9, w19, UXTW #0x2]
00a16190	eor w6,w16,w6
00a16194	eor w17,w2,w17
00a16198	ubfx w2,w18,#0x12,#0x6
00a1619c	lsr w18,w18,#0x1a
00a161a0	ldr w2,[x10, w2, UXTW #0x2]
00a161a4	ldr w18,[x11, w18, UXTW #0x2]
00a161a8	eor w17,w17,w19
00a161ac	ror w19,w6,#0x4
00a161b0	eor w17,w17,w2
00a161b4	ubfx w2,w6,#0x6,#0x6
00a161b8	eor w17,w17,w18
00a161bc	ubfx w18,w6,#0xe,#0x6
00a161c0	ldr w2,[x12, w2, UXTW #0x2]
00a161c4	ubfx w6,w6,#0x16,#0x6
00a161c8	ldr w18,[x13, w18, UXTW #0x2]
00a161cc	ldr w6,[x14, w6, UXTW #0x2]
00a161d0	lsr w19,w19,#0x1a
00a161d4	ldr w19,[x15, w19, UXTW #0x2]
00a161d8	ldp w4,w7,[x1, #0x48]
00a161dc	eor w17,w17,w2
00a161e0	eor w17,w17,w18
00a161e4	eor w17,w17,w6
00a161e8	eor w17,w17,w19
00a161ec	eor w18,w17,w4
00a161f0	ubfx w2,w18,#0x2,#0x6
00a161f4	ldr w2,[x8, w2, UXTW #0x2]
00a161f8	ubfx w19,w18,#0xa,#0x6
00a161fc	ldr w19,[x9, w19, UXTW #0x2]
00a16200	eor w7,w17,w7
00a16204	eor w16,w2,w16
00a16208	ubfx w2,w18,#0x12,#0x6
00a1620c	lsr w18,w18,#0x1a
00a16210	ldr w2,[x10, w2, UXTW #0x2]
00a16214	ldr w18,[x11, w18, UXTW #0x2]
00a16218	eor w16,w16,w19
00a1621c	ror w19,w7,#0x4
00a16220	eor w16,w16,w2
00a16224	ubfx w2,w7,#0x6,#0x6
00a16228	eor w16,w16,w18
00a1622c	ubfx w18,w7,#0xe,#0x6
00a16230	ldr w2,[x12, w2, UXTW #0x2]
00a16234	ubfx w7,w7,#0x16,#0x6
00a16238	ldr w18,[x13, w18, UXTW #0x2]
00a1623c	ldr w7,[x14, w7, UXTW #0x2]
00a16240	lsr w19,w19,#0x1a
00a16244	ldr w19,[x15, w19, UXTW #0x2]
00a16248	ldp w3,w5,[x1, #0x50]
00a1624c	eor w16,w16,w2
00a16250	eor w16,w16,w18
00a16254	eor w16,w16,w7
00a16258	eor w16,w16,w19
00a1625c	eor w18,w16,w3
00a16260	ubfx w2,w18,#0x2,#0x6
00a16264	ldr w2,[x8, w2, UXTW #0x2]
00a16268	ubfx w19,w18,#0xa,#0x6
00a1626c	ldr w19,[x9, w19, UXTW #0x2]
00a16270	eor w5,w16,w5
00a16274	eor w17,w2,w17
00a16278	ubfx w2,w18,#0x12,#0x6
00a1627c	lsr w18,w18,#0x1a
00a16280	ldr w2,[x10, w2, UXTW #0x2]
00a16284	ldr w18,[x11, w18, UXTW #0x2]
00a16288	eor w17,w17,w19
00a1628c	ror w19,w5,#0x4
00a16290	eor w17,w17,w2
00a16294	ubfx w2,w5,#0x6,#0x6
00a16298	eor w17,w17,w18
00a1629c	ubfx w18,w5,#0xe,#0x6
00a162a0	ldr w2,[x12, w2, UXTW #0x2]
00a162a4	ubfx w5,w5,#0x16,#0x6
00a162a8	ldr w18,[x13, w18, UXTW #0x2]
00a162ac	ldr w5,[x14, w5, UXTW #0x2]
00a162b0	lsr w19,w19,#0x1a
00a162b4	ldr w19,[x15, w19, UXTW #0x2]
00a162b8	ldp w4,w6,[x1, #0x58]
00a162bc	eor w17,w17,w2
00a162c0	eor w17,w17,w18
00a162c4	eor w17,w17,w5
00a162c8	eor w17,w17,w19
00a162cc	eor w18,w17,w4
00a162d0	ubfx w2,w18,#0x2,#0x6
00a162d4	ldr w2,[x8, w2, UXTW #0x2]
00a162d8	ubfx w19,w18,#0xa,#0x6
00a162dc	ldr w19,[x9, w19, UXTW #0x2]
00a162e0	eor w6,w17,w6
00a162e4	eor w16,w2,w16
00a162e8	ubfx w2,w18,#0x12,#0x6
00a162ec	lsr w18,w18,#0x1a
00a162f0	ldr w2,[x10, w2, UXTW #0x2]
00a162f4	ldr w18,[x11, w18, UXTW #0x2]
00a162f8	eor w16,w16,w19
00a162fc	ror w19,w6,#0x4
00a16300	eor w16,w16,w2
00a16304	ubfx w2,w6,#0x6,#0x6
00a16308	eor w16,w16,w18
00a1630c	ubfx w18,w6,#0xe,#0x6
00a16310	ldr w2,[x12, w2, UXTW #0x2]
00a16314	ubfx w6,w6,#0x16,#0x6
00a16318	ldr w18,[x13, w18, UXTW #0x2]
00a1631c	ldr w6,[x14, w6, UXTW #0x2]
00a16320	lsr w19,w19,#0x1a
00a16324	ldr w19,[x15, w19, UXTW #0x2]
00a16328	ldp w3,w7,[x1, #0x60]
00a1632c	eor w16,w16,w2
00a16330	eor w16,w16,w18
00a16334	eor w16,w16,w6
00a16338	eor w16,w16,w19
00a1633c	eor w18,w16,w3
00a16340	ubfx w2,w18,#0x2,#0x6
00a16344	ldr w2,[x8, w2, UXTW #0x2]
00a16348	ubfx w19,w18,#0xa,#0x6
00a1634c	ldr w19,[x9, w19, UXTW #0x2]
00a16350	eor w7,w16,w7
00a16354	eor w17,w2,w17
00a16358	ubfx w2,w18,#0x12,#0x6
00a1635c	lsr w18,w18,#0x1a
00a16360	ldr w2,[x10, w2, UXTW #0x2]
00a16364	ldr w18,[x11, w18, UXTW #0x2]
00a16368	eor w17,w17,w19
00a1636c	ror w19,w7,#0x4
00a16370	eor w17,w17,w2
00a16374	ubfx w2,w7,#0x6,#0x6
00a16378	eor w17,w17,w18
00a1637c	ubfx w18,w7,#0xe,#0x6
00a16380	ldr w2,[x12, w2, UXTW #0x2]
00a16384	ubfx w7,w7,#0x16,#0x6
00a16388	ldr w18,[x13, w18, UXTW #0x2]
00a1638c	ldr w7,[x14, w7, UXTW #0x2]
00a16390	lsr w19,w19,#0x1a
00a16394	ldr w19,[x15, w19, UXTW #0x2]
00a16398	ldp w4,w5,[x1, #0x68]
00a1639c	eor w17,w17,w2
00a163a0	eor w17,w17,w18
00a163a4	eor w17,w17,w7
00a163a8	eor w17,w17,w19
00a163ac	eor w18,w17,w4
00a163b0	eor w4,w17,w5
00a163b4	ubfx w5,w18,#0x2,#0x6
00a163b8	ldr w5,[x8, w5, UXTW #0x2]
00a163bc	ubfx w19,w18,#0xa,#0x6
00a163c0	ldr w19,[x9, w19, UXTW #0x2]
00a163c4	ror w7,w4,#0x4
00a163c8	eor w16,w5,w16
00a163cc	ubfx w5,w18,#0x12,#0x6
00a163d0	ldr w5,[x10, w5, UXTW #0x2]
00a163d4	lsr w18,w18,#0x1a
00a163d8	eor w16,w16,w19
00a163dc	ubfx w19,w4,#0x6,#0x6
00a163e0	ldr w18,[x11, w18, UXTW #0x2]
00a163e4	eor w16,w16,w5
00a163e8	ubfx w5,w4,#0xe,#0x6
00a163ec	ldr w19,[x12, w19, UXTW #0x2]
00a163f0	ubfx w4,w4,#0x16,#0x6
00a163f4	ldr w5,[x13, w5, UXTW #0x2]
00a163f8	ldr w4,[x14, w4, UXTW #0x2]
00a163fc	lsr w7,w7,#0x1a
00a16400	ldr w7,[x15, w7, UXTW #0x2]
00a16404	eor w16,w16,w18
00a16408	ldp w3,w6,[x1, #0x70]
00a1640c	eor w16,w16,w19
00a16410	eor w16,w16,w5
00a16414	eor w16,w16,w4
00a16418	eor w16,w16,w7
00a1641c	eor w18,w16,w3
00a16420	ubfx w5,w18,#0x2,#0x6
00a16424	eor w3,w16,w6
00a16428	ubfx w6,w18,#0xa,#0x6
00a1642c	ldr w8,[x8, w5, UXTW #0x2]
00a16430	ubfx w7,w18,#0x12,#0x6
00a16434	ldr w9,[x9, w6, UXTW #0x2]
00a16438	lsr w18,w18,#0x1a
00a1643c	ldr w10,[x10, w7, UXTW #0x2]
00a16440	ubfx w19,w3,#0x6,#0x6
00a16444	ldr w11,[x11, w18, UXTW #0x2]
00a16448	ubfx w5,w3,#0xe,#0x6
00a1644c	ldr w12,[x12, w19, UXTW #0x2]
00a16450	eor w8,w8,w17
00a16454	ror w4,w3,#0x4
00a16458	ubfx w3,w3,#0x16,#0x6
00a1645c	ldr w13,[x13, w5, UXTW #0x2]
00a16460	eor w8,w8,w9
00a16464	ldr w14,[x14, w3, UXTW #0x2]
00a16468	lsr w18,w4,#0x1a
00a1646c	eor w8,w8,w10
00a16470	ldr w15,[x15, w18, UXTW #0x2]
00a16474	eor w8,w8,w11
00a16478	ldr w2,[x1, #0x78]
00a1647c	eor w8,w8,w12
00a16480	eor w8,w8,w13
00a16484	eor w8,w8,w14
00a16488	eor w8,w8,w15
00a1648c	eor w9,w8,w2
00a16490	add x10,x1,#0x7c
00a16494	b 0x00a16b58
00a16498	ldp w15,w18,[x1, #0x78]
00a1649c	adrp x8,0xcb5000
00a164a0	ldr x8,[x8, #0x4c8]
00a164a4	ldp w2,w3,[x1, #0x70]
00a164a8	eor w6,w15,w16
00a164ac	ubfx w15,w6,#0x2,#0x6
00a164b0	ldr w7,[x8, w15, UXTW #0x2]
00a164b4	add x9,x8,#0x200
00a164b8	ubfx w19,w6,#0xa,#0x6
00a164bc	add x10,x8,#0x400
00a164c0	eor w17,w7,w17
00a164c4	ubfx w7,w6,#0x12,#0x6
00a164c8	ldr w19,[x9, w19, UXTW #0x2]
00a164cc	add x11,x8,#0x600
00a164d0	lsr w6,w6,#0x1a
00a164d4	ldr w7,[x10, w7, UXTW #0x2]
00a164d8	ldr w6,[x11, w6, UXTW #0x2]
00a164dc	eor w18,w18,w16
00a164e0	eor w17,w17,w19
00a164e4	add x12,x8,#0x100
00a164e8	eor w17,w17,w7
00a164ec	ubfx w7,w18,#0x6,#0x6
00a164f0	add x13,x8,#0x300
00a164f4	eor w17,w17,w6
00a164f8	ubfx w6,w18,#0xe,#0x6
00a164fc	ldr w7,[x12, w7, UXTW #0x2]
00a16500	add x14,x8,#0x500
00a16504	ror w19,w18,#0x4
00a16508	ubfx w18,w18,#0x16,#0x6
00a1650c	ldr w6,[x13, w6, UXTW #0x2]
00a16510	add x15,x8,#0x700
00a16514	ldr w18,[x14, w18, UXTW #0x2]
00a16518	lsr w19,w19,#0x1a
00a1651c	ldr w19,[x15, w19, UXTW #0x2]
00a16520	eor w17,w17,w7
00a16524	eor w17,w17,w6
00a16528	eor w17,w17,w18
00a1652c	eor w17,w17,w19
00a16530	eor w18,w17,w2
00a16534	ubfx w2,w18,#0x2,#0x6
00a16538	ldr w2,[x8, w2, UXTW #0x2]
00a1653c	ubfx w19,w18,#0xa,#0x6
00a16540	ldr w19,[x9, w19, UXTW #0x2]
00a16544	eor w3,w17,w3
00a16548	eor w16,w2,w16
00a1654c	ubfx w2,w18,#0x12,#0x6
00a16550	lsr w18,w18,#0x1a
00a16554	ldr w2,[x10, w2, UXTW #0x2]
00a16558	ldr w18,[x11, w18, UXTW #0x2]
00a1655c	eor w16,w16,w19
00a16560	ror w19,w3,#0x4
00a16564	eor w16,w16,w2
00a16568	ubfx w2,w3,#0x6,#0x6
00a1656c	eor w16,w16,w18
00a16570	ubfx w18,w3,#0xe,#0x6
00a16574	ldr w2,[x12, w2, UXTW #0x2]
00a16578	ubfx w3,w3,#0x16,#0x6
00a1657c	ldr w18,[x13, w18, UXTW #0x2]
00a16580	ldr w3,[x14, w3, UXTW #0x2]
00a16584	lsr w19,w19,#0x1a
00a16588	ldr w19,[x15, w19, UXTW #0x2]
00a1658c	ldp w4,w5,[x1, #0x68]
00a16590	eor w16,w16,w2
00a16594	eor w16,w16,w18
00a16598	eor w16,w16,w3
00a1659c	eor w16,w16,w19
00a165a0	eor w18,w16,w4
00a165a4	ubfx w2,w18,#0x2,#0x6
00a165a8	ldr w2,[x8, w2, UXTW #0x2]
00a165ac	ubfx w19,w18,#0xa,#0x6
00a165b0	ldr w19,[x9, w19, UXTW #0x2]
00a165b4	eor w5,w16,w5
00a165b8	eor w17,w2,w17
00a165bc	ubfx w2,w18,#0x12,#0x6
00a165c0	lsr w18,w18,#0x1a
00a165c4	ldr w2,[x10, w2, UXTW #0x2]
00a165c8	ldr w18,[x11, w18, UXTW #0x2]
00a165cc	eor w17,w17,w19
00a165d0	ror w19,w5,#0x4
00a165d4	eor w17,w17,w2
00a165d8	ubfx w2,w5,#0x6,#0x6
00a165dc	eor w17,w17,w18
00a165e0	ubfx w18,w5,#0xe,#0x6
00a165e4	ldr w2,[x12, w2, UXTW #0x2]
00a165e8	ubfx w5,w5,#0x16,#0x6
00a165ec	ldr w18,[x13, w18, UXTW #0x2]
00a165f0	ldr w5,[x14, w5, UXTW #0x2]
00a165f4	lsr w19,w19,#0x1a
00a165f8	ldr w19,[x15, w19, UXTW #0x2]
00a165fc	ldp w6,w7,[x1, #0x60]
00a16600	eor w17,w17,w2
00a16604	eor w17,w17,w18
00a16608	eor w17,w17,w5
00a1660c	eor w17,w17,w19
00a16610	eor w18,w17,w6
00a16614	ubfx w2,w18,#0x2,#0x6
00a16618	ldr w2,[x8, w2, UXTW #0x2]
00a1661c	ubfx w19,w18,#0xa,#0x6
00a16620	ldr w19,[x9, w19, UXTW #0x2]
00a16624	eor w7,w17,w7
00a16628	eor w16,w2,w16
00a1662c	ubfx w2,w18,#0x12,#0x6
00a16630	lsr w18,w18,#0x1a
00a16634	ldr w2,[x10, w2, UXTW #0x2]
00a16638	ldr w18,[x11, w18, UXTW #0x2]
00a1663c	eor w16,w16,w19
00a16640	ror w19,w7,#0x4
00a16644	eor w16,w16,w2
00a16648	ubfx w2,w7,#0x6,#0x6
00a1664c	eor w16,w16,w18
00a16650	ubfx w18,w7,#0xe,#0x6
00a16654	ldr w2,[x12, w2, UXTW #0x2]
00a16658	ubfx w7,w7,#0x16,#0x6
00a1665c	ldr w18,[x13, w18, UXTW #0x2]
00a16660	ldr w7,[x14, w7, UXTW #0x2]
00a16664	lsr w19,w19,#0x1a
00a16668	ldr w19,[x15, w19, UXTW #0x2]
00a1666c	ldp w3,w4,[x1, #0x58]
00a16670	eor w16,w16,w2
00a16674	eor w16,w16,w18
00a16678	eor w16,w16,w7
00a1667c	eor w16,w16,w19
00a16680	eor w18,w16,w3
00a16684	ubfx w2,w18,#0x2,#0x6
00a16688	ldr w2,[x8, w2, UXTW #0x2]
00a1668c	ubfx w19,w18,#0xa,#0x6
00a16690	ldr w19,[x9, w19, UXTW #0x2]
00a16694	eor w4,w16,w4
00a16698	eor w17,w2,w17
00a1669c	ubfx w2,w18,#0x12,#0x6
00a166a0	lsr w18,w18,#0x1a
00a166a4	ldr w2,[x10, w2, UXTW #0x2]
00a166a8	ldr w18,[x11, w18, UXTW #0x2]
00a166ac	eor w17,w17,w19
00a166b0	ror w19,w4,#0x4
00a166b4	eor w17,w17,w2
00a166b8	ubfx w2,w4,#0x6,#0x6
00a166bc	eor w17,w17,w18
00a166c0	ubfx w18,w4,#0xe,#0x6
00a166c4	ldr w2,[x12, w2, UXTW #0x2]
00a166c8	ubfx w4,w4,#0x16,#0x6
00a166cc	ldr w18,[x13, w18, UXTW #0x2]
00a166d0	ldr w4,[x14, w4, UXTW #0x2]
00a166d4	lsr w19,w19,#0x1a
00a166d8	ldr w19,[x15, w19, UXTW #0x2]
00a166dc	ldp w5,w6,[x1, #0x50]
00a166e0	eor w17,w17,w2
00a166e4	eor w17,w17,w18
00a166e8	eor w17,w17,w4
00a166ec	eor w17,w17,w19
00a166f0	eor w18,w17,w5
00a166f4	ubfx w2,w18,#0x2,#0x6
00a166f8	ldr w2,[x8, w2, UXTW #0x2]
00a166fc	ubfx w19,w18,#0xa,#0x6
00a16700	ldr w19,[x9, w19, UXTW #0x2]
00a16704	eor w6,w17,w6
00a16708	eor w16,w2,w16
00a1670c	ubfx w2,w18,#0x12,#0x6
00a16710	lsr w18,w18,#0x1a
00a16714	ldr w2,[x10, w2, UXTW #0x2]
00a16718	ldr w18,[x11, w18, UXTW #0x2]
00a1671c	eor w16,w16,w19
00a16720	ror w19,w6,#0x4
00a16724	eor w16,w16,w2
00a16728	ubfx w2,w6,#0x6,#0x6
00a1672c	eor w16,w16,w18
00a16730	ubfx w18,w6,#0xe,#0x6
00a16734	ldr w2,[x12, w2, UXTW #0x2]
00a16738	ubfx w6,w6,#0x16,#0x6
00a1673c	ldr w18,[x13, w18, UXTW #0x2]
00a16740	ldr w6,[x14, w6, UXTW #0x2]
00a16744	lsr w19,w19,#0x1a
00a16748	ldr w19,[x15, w19, UXTW #0x2]
00a1674c	ldp w3,w7,[x1, #0x48]
00a16750	eor w16,w16,w2
00a16754	eor w16,w16,w18
00a16758	eor w16,w16,w6
00a1675c	eor w16,w16,w19
00a16760	eor w18,w16,w3
00a16764	ubfx w2,w18,#0x2,#0x6
00a16768	ldr w2,[x8, w2, UXTW #0x2]
00a1676c	ubfx w19,w18,#0xa,#0x6
00a16770	ldr w19,[x9, w19, UXTW #0x2]
00a16774	eor w7,w16,w7
00a16778	eor w17,w2,w17
00a1677c	ubfx w2,w18,#0x12,#0x6
00a16780	lsr w18,w18,#0x1a
00a16784	ldr w2,[x10, w2, UXTW #0x2]
00a16788	ldr w18,[x11, w18, UXTW #0x2]
00a1678c	eor w17,w17,w19
00a16790	ror w19,w7,#0x4
00a16794	eor w17,w17,w2
00a16798	ubfx w2,w7,#0x6,#0x6
00a1679c	eor w17,w17,w18
00a167a0	ubfx w18,w7,#0xe,#0x6
00a167a4	ldr w2,[x12, w2, UXTW #0x2]
00a167a8	ubfx w7,w7,#0x16,#0x6
00a167ac	ldr w18,[x13, w18, UXTW #0x2]
00a167b0	ldr w7,[x14, w7, UXTW #0x2]
00a167b4	lsr w19,w19,#0x1a
00a167b8	ldr w19,[x15, w19, UXTW #0x2]
00a167bc	ldp w4,w5,[x1, #0x40]
00a167c0	eor w17,w17,w2
00a167c4	eor w17,w17,w18
00a167c8	eor w17,w17,w7
00a167cc	eor w17,w17,w19
00a167d0	eor w18,w17,w4
00a167d4	ubfx w2,w18,#0x2,#0x6
00a167d8	ldr w2,[x8, w2, UXTW #0x2]
00a167dc	ubfx w19,w18,#0xa,#0x6
00a167e0	ldr w19,[x9, w19, UXTW #0x2]
00a167e4	eor w5,w17,w5
00a167e8	eor w16,w2,w16
00a167ec	ubfx w2,w18,#0x12,#0x6
00a167f0	lsr w18,w18,#0x1a
00a167f4	ldr w2,[x10, w2, UXTW #0x2]
00a167f8	ldr w18,[x11, w18, UXTW #0x2]
00a167fc	eor w16,w16,w19
00a16800	ror w19,w5,#0x4
00a16804	eor w16,w16,w2
00a16808	ubfx w2,w5,#0x6,#0x6
00a1680c	eor w16,w16,w18
00a16810	ubfx w18,w5,#0xe,#0x6
00a16814	ldr w2,[x12, w2, UXTW #0x2]
00a16818	ubfx w5,w5,#0x16,#0x6
00a1681c	ldr w18,[x13, w18, UXTW #0x2]
00a16820	ldr w5,[x14, w5, UXTW #0x2]
00a16824	lsr w19,w19,#0x1a
00a16828	ldr w19,[x15, w19, UXTW #0x2]
00a1682c	ldp w3,w6,[x1, #0x38]
00a16830	eor w16,w16,w2
00a16834	eor w16,w16,w18
00a16838	eor w16,w16,w5
00a1683c	eor w16,w16,w19
00a16840	eor w18,w16,w3
00a16844	ubfx w2,w18,#0x2,#0x6
00a16848	ldr w2,[x8, w2, UXTW #0x2]
00a1684c	ubfx w19,w18,#0xa,#0x6
00a16850	ldr w19,[x9, w19, UXTW #0x2]
00a16854	eor w6,w16,w6
00a16858	eor w17,w2,w17
00a1685c	ubfx w2,w18,#0x12,#0x6
00a16860	lsr w18,w18,#0x1a
00a16864	ldr w2,[x10, w2, UXTW #0x2]
00a16868	ldr w18,[x11, w18, UXTW #0x2]
00a1686c	eor w17,w17,w19
00a16870	ror w19,w6,#0x4
00a16874	eor w17,w17,w2
00a16878	ubfx w2,w6,#0x6,#0x6
00a1687c	eor w17,w17,w18
00a16880	ubfx w18,w6,#0xe,#0x6
00a16884	ldr w2,[x12, w2, UXTW #0x2]
00a16888	ubfx w6,w6,#0x16,#0x6
00a1688c	ldr w18,[x13, w18, UXTW #0x2]
00a16890	ldr w6,[x14, w6, UXTW #0x2]
00a16894	lsr w19,w19,#0x1a
00a16898	ldr w19,[x15, w19, UXTW #0x2]
00a1689c	ldp w4,w7,[x1, #0x30]
00a168a0	eor w17,w17,w2
00a168a4	eor w17,w17,w18
00a168a8	eor w17,w17,w6
00a168ac	eor w17,w17,w19
00a168b0	eor w18,w17,w4
00a168b4	ubfx w2,w18,#0x2,#0x6
00a168b8	ldr w2,[x8, w2, UXTW #0x2]
00a168bc	ubfx w19,w18,#0xa,#0x6
00a168c0	ldr w19,[x9, w19, UXTW #0x2]
00a168c4	eor w7,w17,w7
00a168c8	eor w16,w2,w16
00a168cc	ubfx w2,w18,#0x12,#0x6
00a168d0	lsr w18,w18,#0x1a
00a168d4	ldr w2,[x10, w2, UXTW #0x2]
00a168d8	ldr w18,[x11, w18, UXTW #0x2]
00a168dc	eor w16,w16,w19
00a168e0	ror w19,w7,#0x4
00a168e4	eor w16,w16,w2
00a168e8	ubfx w2,w7,#0x6,#0x6
00a168ec	eor w16,w16,w18
00a168f0	ubfx w18,w7,#0xe,#0x6
00a168f4	ldr w2,[x12, w2, UXTW #0x2]
00a168f8	ubfx w7,w7,#0x16,#0x6
00a168fc	ldr w18,[x13, w18, UXTW #0x2]
00a16900	ldr w7,[x14, w7, UXTW #0x2]
00a16904	lsr w19,w19,#0x1a
00a16908	ldr w19,[x15, w19, UXTW #0x2]
00a1690c	ldp w3,w5,[x1, #0x28]
00a16910	eor w16,w16,w2
00a16914	eor w16,w16,w18
00a16918	eor w16,w16,w7
00a1691c	eor w16,w16,w19
00a16920	eor w18,w16,w3
00a16924	ubfx w2,w18,#0x2,#0x6
00a16928	ldr w2,[x8, w2, UXTW #0x2]
00a1692c	ubfx w19,w18,#0xa,#0x6
00a16930	ldr w19,[x9, w19, UXTW #0x2]
00a16934	eor w5,w16,w5
00a16938	eor w17,w2,w17
00a1693c	ubfx w2,w18,#0x12,#0x6
00a16940	lsr w18,w18,#0x1a
00a16944	ldr w2,[x10, w2, UXTW #0x2]
00a16948	ldr w18,[x11, w18, UXTW #0x2]
00a1694c	eor w17,w17,w19
00a16950	ror w19,w5,#0x4
00a16954	eor w17,w17,w2
00a16958	ubfx w2,w5,#0x6,#0x6
00a1695c	eor w17,w17,w18
00a16960	ubfx w18,w5,#0xe,#0x6
00a16964	ldr w2,[x12, w2, UXTW #0x2]
00a16968	ubfx w5,w5,#0x16,#0x6
00a1696c	ldr w18,[x13, w18, UXTW #0x2]
00a16970	ldr w5,[x14, w5, UXTW #0x2]
00a16974	lsr w19,w19,#0x1a
00a16978	ldr w19,[x15, w19, UXTW #0x2]
00a1697c	ldp w4,w6,[x1, #0x20]
00a16980	eor w17,w17,w2
00a16984	eor w17,w17,w18
00a16988	eor w17,w17,w5
00a1698c	eor w17,w17,w19
00a16990	eor w18,w17,w4
00a16994	ubfx w2,w18,#0x2,#0x6
00a16998	ldr w2,[x8, w2, UXTW #0x2]
00a1699c	ubfx w19,w18,#0xa,#0x6
00a169a0	ldr w19,[x9, w19, UXTW #0x2]
00a169a4	eor w6,w17,w6
00a169a8	eor w16,w2,w16
00a169ac	ubfx w2,w18,#0x12,#0x6
00a169b0	lsr w18,w18,#0x1a
00a169b4	ldr w2,[x10, w2, UXTW #0x2]
00a169b8	ldr w18,[x11, w18, UXTW #0x2]
00a169bc	eor w16,w16,w19
00a169c0	ror w19,w6,#0x4
00a169c4	eor w16,w16,w2
00a169c8	ubfx w2,w6,#0x6,#0x6
00a169cc	eor w16,w16,w18
00a169d0	ubfx w18,w6,#0xe,#0x6
00a169d4	ldr w2,[x12, w2, UXTW #0x2]
00a169d8	ubfx w6,w6,#0x16,#0x6
00a169dc	ldr w18,[x13, w18, UXTW #0x2]
00a169e0	ldr w6,[x14, w6, UXTW #0x2]
00a169e4	lsr w19,w19,#0x1a
00a169e8	ldr w19,[x15, w19, UXTW #0x2]
00a169ec	ldp w3,w7,[x1, #0x18]
00a169f0	eor w16,w16,w2
00a169f4	eor w16,w16,w18
00a169f8	eor w16,w16,w6
00a169fc	eor w16,w16,w19
00a16a00	eor w18,w16,w3
00a16a04	ubfx w2,w18,#0x2,#0x6
00a16a08	ldr w2,[x8, w2, UXTW #0x2]
00a16a0c	ubfx w19,w18,#0xa,#0x6
00a16a10	ldr w19,[x9, w19, UXTW #0x2]
00a16a14	eor w7,w16,w7
00a16a18	eor w17,w2,w17
00a16a1c	ubfx w2,w18,#0x12,#0x6
00a16a20	lsr w18,w18,#0x1a
00a16a24	ldr w2,[x10, w2, UXTW #0x2]
00a16a28	ldr w18,[x11, w18, UXTW #0x2]
00a16a2c	eor w17,w17,w19
00a16a30	ror w19,w7,#0x4
00a16a34	eor w17,w17,w2
00a16a38	ubfx w2,w7,#0x6,#0x6
00a16a3c	eor w17,w17,w18
00a16a40	ubfx w18,w7,#0xe,#0x6
00a16a44	ldr w2,[x12, w2, UXTW #0x2]
00a16a48	ubfx w7,w7,#0x16,#0x6
00a16a4c	ldr w18,[x13, w18, UXTW #0x2]
00a16a50	ldr w7,[x14, w7, UXTW #0x2]
00a16a54	lsr w19,w19,#0x1a
00a16a58	ldr w19,[x15, w19, UXTW #0x2]
00a16a5c	ldp w4,w5,[x1, #0x10]
00a16a60	eor w17,w17,w2
00a16a64	eor w17,w17,w18
00a16a68	eor w17,w17,w7
00a16a6c	eor w17,w17,w19
00a16a70	eor w18,w17,w4
00a16a74	eor w4,w17,w5
00a16a78	ubfx w5,w18,#0x2,#0x6
00a16a7c	ldr w5,[x8, w5, UXTW #0x2]
00a16a80	ubfx w19,w18,#0xa,#0x6
00a16a84	ldr w19,[x9, w19, UXTW #0x2]
00a16a88	ror w7,w4,#0x4
00a16a8c	eor w16,w5,w16
00a16a90	ubfx w5,w18,#0x12,#0x6
00a16a94	ldr w5,[x10, w5, UXTW #0x2]
00a16a98	lsr w18,w18,#0x1a
00a16a9c	eor w16,w16,w19
00a16aa0	ubfx w19,w4,#0x6,#0x6
00a16aa4	ldr w18,[x11, w18, UXTW #0x2]
00a16aa8	eor w16,w16,w5
00a16aac	ubfx w5,w4,#0xe,#0x6
00a16ab0	ldr w19,[x12, w19, UXTW #0x2]
00a16ab4	ubfx w4,w4,#0x16,#0x6
00a16ab8	ldr w5,[x13, w5, UXTW #0x2]
00a16abc	ldr w4,[x14, w4, UXTW #0x2]
00a16ac0	lsr w7,w7,#0x1a
00a16ac4	ldr w7,[x15, w7, UXTW #0x2]
00a16ac8	eor w16,w16,w18
00a16acc	ldp w3,w6,[x1, #0x8]
00a16ad0	eor w16,w16,w19
00a16ad4	eor w16,w16,w5
00a16ad8	eor w16,w16,w4
00a16adc	eor w16,w16,w7
00a16ae0	eor w18,w16,w3
00a16ae4	ubfx w5,w18,#0x2,#0x6
00a16ae8	eor w3,w16,w6
00a16aec	ubfx w6,w18,#0xa,#0x6
00a16af0	ldr w8,[x8, w5, UXTW #0x2]
00a16af4	ubfx w7,w18,#0x12,#0x6
00a16af8	ldr w9,[x9, w6, UXTW #0x2]
00a16afc	lsr w18,w18,#0x1a
00a16b00	ldr w10,[x10, w7, UXTW #0x2]
00a16b04	ubfx w19,w3,#0x6,#0x6
00a16b08	ldr w11,[x11, w18, UXTW #0x2]
00a16b0c	ubfx w5,w3,#0xe,#0x6
00a16b10	ldr w12,[x12, w19, UXTW #0x2]
00a16b14	eor w8,w8,w17
00a16b18	ror w4,w3,#0x4
00a16b1c	ubfx w3,w3,#0x16,#0x6
00a16b20	ldr w13,[x13, w5, UXTW #0x2]
00a16b24	eor w8,w8,w9
00a16b28	ldr w14,[x14, w3, UXTW #0x2]
00a16b2c	lsr w18,w4,#0x1a
00a16b30	eor w8,w8,w10
00a16b34	ldr w15,[x15, w18, UXTW #0x2]
00a16b38	eor w8,w8,w11
00a16b3c	ldr w2,[x1]
00a16b40	eor w8,w8,w12
00a16b44	eor w8,w8,w13
00a16b48	eor w8,w8,w14
00a16b4c	eor w8,w8,w15
00a16b50	eor w9,w8,w2
00a16b54	add x10,x1,#0x4
00a16b58	adrp x12,0xcb5000
00a16b5c	ldr w10,[x10]
00a16b60	ldr x12,[x12, #0x4c8]
00a16b64	ubfx w11,w9,#0x2,#0x6
00a16b68	ubfx w13,w9,#0xa,#0x6
00a16b6c	ubfx w14,w9,#0x12,#0x6
00a16b70	ldr w11,[x12, w11, UXTW #0x2]
00a16b74	add x13,x12,w13, UXTW  #0x2
00a16b78	ldr w13,[x13, #0x200]
00a16b7c	lsr w9,w9,#0x1a
00a16b80	ror w15,w8,#0x3
00a16b84	add x14,x12,w14, UXTW  #0x2
00a16b88	eor w8,w8,w10
00a16b8c	add x9,x12,w9, UXTW  #0x2
00a16b90	ldr w14,[x14, #0x400]
00a16b94	ubfx w17,w8,#0x6,#0x6
00a16b98	ldr w9,[x9, #0x600]
00a16b9c	ubfx w18,w8,#0xe,#0x6
00a16ba0	eor w11,w11,w16
00a16ba4	add x16,x12,w17, UXTW  #0x2
00a16ba8	ror w10,w8,#0x4
00a16bac	ubfx w8,w8,#0x16,#0x6
00a16bb0	add x17,x12,w18, UXTW  #0x2
00a16bb4	eor w11,w11,w13
00a16bb8	ldr w13,[x16, #0x100]
00a16bbc	add x8,x12,w8, UXTW  #0x2
00a16bc0	lsr w10,w10,#0x1a
00a16bc4	ldr w16,[x17, #0x300]
00a16bc8	ldr w8,[x8, #0x500]
00a16bcc	add x10,x12,w10, UXTW  #0x2
00a16bd0	eor w11,w11,w14
00a16bd4	ldr w10,[x10, #0x700]
00a16bd8	eor w9,w11,w9
00a16bdc	eor w9,w9,w13
00a16be0	eor w9,w9,w16
00a16be4	eor w8,w9,w8
00a16be8	eor w8,w8,w10
00a16bec	ror w8,w8,#0x3
00a16bf0	stp w15,w8,[x0]
00a16bf4	ldr x19,[sp], #0x10
00a16bf8	ret
