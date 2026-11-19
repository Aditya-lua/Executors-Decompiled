; FUN_00b10a8c @ 00b10a8c
00b10a8c	sub sp,sp,#0x80
00b10a90	stp x28,x27,[sp, #0x20]
00b10a94	stp x26,x25,[sp, #0x30]
00b10a98	stp x24,x23,[sp, #0x40]
00b10a9c	stp x22,x21,[sp, #0x50]
00b10aa0	stp x20,x19,[sp, #0x60]
00b10aa4	stp x29,x30,[sp, #0x70]
00b10aa8	mov x19,x0
00b10aac	ldr x27,[x0, #0xf0]
00b10ab0	ldr x0,[x0, #0x98]
00b10ab4	add x29,sp,#0x70
00b10ab8	bl 0x00c325e0
00b10abc	cmp w0,#0x1
00b10ac0	mov x20,xzr
00b10ac4	b.ne 0x00b110dc
00b10ac8	ldr w8,[x19, #0x94]
00b10acc	mov x20,xzr
00b10ad0	cmp w8,#0x1
00b10ad4	b.ne 0x00b110dc
00b10ad8	ldr x8,[x19, #0x10]
00b10adc	cmp x8,#0x0
00b10ae0	cset w22,ne
00b10ae4	cbz x27,0x00b10b08
00b10ae8	ldr w9,[x27, #0x28]
00b10aec	tst w9,#0x3
00b10af0	b.ne 0x00b10b08
00b10af4	and w9,w9,#0xc
00b10af8	cbz w9,0x00b10b08
00b10afc	str wzr,[sp, #0x10]
00b10b00	mov w21,wzr
00b10b04	b 0x00b10b34
00b10b08	cbz x8,0x00b10b24
00b10b0c	ldr x8,[x19, #0x20]
00b10b10	ldr x8,[x8, #0x18]
00b10b14	tbnz w8,#0xf,0x00b10b24
00b10b18	mov w22,#0x1
00b10b1c	bic w21,w22,w8, LSR #0x14
00b10b20	b 0x00b10b2c
00b10b24	mov w21,wzr
00b10b28	orr w22,w22,#0x2
00b10b2c	mov w8,#0x1
00b10b30	str w8,[sp, #0x10]
00b10b34	bl 0x00c34780
00b10b38	mov x20,x0
00b10b3c	cbz x0,0x00b1115c
00b10b40	cbz x27,0x00b10b6c
00b10b44	ldr x0,[x27, #0x8]
00b10b48	bl 0x00c325e0
00b10b4c	cmp w0,#0x1
00b10b50	b.lt 0x00b10b6c
00b10b54	ldr x1,[x27, #0x10]
00b10b58	cbz x1,0x00b10b6c
00b10b5c	mov x0,x20
00b10b60	mov w2,wzr
00b10b64	bl 0x00c3ef40
00b10b68	cbz w0,0x00b1115c
00b10b6c	ldr x1,[x19, #0x10]
00b10b70	mov x0,x20
00b10b74	mov w2,wzr
00b10b78	bl 0x00c3ef40
00b10b7c	cbz w0,0x00b1115c
00b10b80	ldr x9,[x19, #0x20]
00b10b84	mov w10,#0x40000000
00b10b88	ldr w8,[x9, #0x28]
00b10b8c	cmp w8,w10
00b10b90	b.lt 0x00b10b9c
00b10b94	orr w8,wzr,#0x3fffffff
00b10b98	str w8,[x9, #0x28]
00b10b9c	add w28,w8,#0x1
00b10ba0	cbz w22,0x00b10f34
00b10ba4	str w21,[sp, #0xc]
00b10ba8	orr w21,wzr,#0x3
00b10bac	str wzr,[sp, #0x14]
00b10bb0	str xzr,[sp, #0x18]
00b10bb4	ldr x0,[x19, #0x98]
00b10bb8	bl 0x00c325e0
00b10bbc	sub w8,w0,#0x1
00b10bc0	str w8,[x19, #0xac]
00b10bc4	tbnz w22,#0x1,0x00b10bd0
00b10bc8	tbz w22,#0x0,0x00b10f14
00b10bcc	b 0x00b10dc4
00b10bd0	ldr w8,[sp, #0x14]
00b10bd4	mov w26,w0
00b10bd8	ldr x0,[x19, #0x98]
00b10bdc	tst w22,#0x4
00b10be0	csel w24,w8,w26,ne
00b10be4	sub w1,w24,#0x1
00b10be8	bl 0x00c32610
00b10bec	mov w23,w28
00b10bf0	cmp w26,w28
00b10bf4	b.gt 0x00b10d94
00b10bf8	ldr x8,[x19, #0x40]
00b10bfc	ldr x28,[x19, #0x98]
00b10c00	mov x25,x0
00b10c04	add x0,sp,#0x18
00b10c08	mov x1,x19
00b10c0c	mov x2,x25
00b10c10	str xzr,[x19, #0x98]
00b10c14	blr x8
00b10c18	str x28,[x19, #0x98]
00b10c1c	tbnz w0,#0x1f,0x00b10f44
00b10c20	cbz w0,0x00b10d94
00b10c24	mov x0,x25
00b10c28	bl 0x00c32cb0
00b10c2c	cbz x0,0x00b110a8
00b10c30	mov x0,x25
00b10c34	bl 0x00c40ac0
00b10c38	cbz w0,0x00b110d4
00b10c3c	ldr w8,[x25, #0xe8]
00b10c40	ubfx w28,w8,#0xd,#0x1
00b10c44	tbz w22,#0x2,0x00b10d08
00b10c48	cmp w26,w24
00b10c4c	b.le 0x00b110d4
00b10c50	cmp w24,#0x1
00b10c54	b.lt 0x00b110d4
00b10c58	cbnz w28,0x00b110d4
00b10c5c	ldr x0,[x19, #0x98]
00b10c60	bl 0x00c325f0
00b10c64	bl 0x00c31a90
00b10c68	sub w26,w26,#0x1
00b10c6c	cmp w26,w24
00b10c70	b.gt 0x00b10c5c
00b10c74	and w22,w22,#0xfffffffb
00b10c78	str w24,[x19, #0x94]
00b10c7c	cbz x27,0x00b10d0c
00b10c80	ldr x0,[x27, #0x8]
00b10c84	bl 0x00c325e0
00b10c88	cmp w0,#0x1
00b10c8c	b.lt 0x00b10cb4
00b10c90	ldr w8,[x27, #0x2c]
00b10c94	ldr w9,[x19, #0x94]
00b10c98	cmp w8,w9
00b10c9c	b.lt 0x00b10cb4
00b10ca0	ldr x0,[x27, #0x20]
00b10ca4	mov w8,#0xffffffff
00b10ca8	str w8,[x27, #0x2c]
00b10cac	bl 0x00c31a90
00b10cb0	str xzr,[x27, #0x20]
00b10cb4	ldr x0,[x27, #0x8]
00b10cb8	bl 0x00c325e0
00b10cbc	cmp w0,#0x1
00b10cc0	b.lt 0x00b10d0c
00b10cc4	ldr w8,[x27, #0x30]
00b10cc8	ldr w9,[x19, #0x94]
00b10ccc	cmp w8,w9
00b10cd0	b.lt 0x00b10d0c
00b10cd4	mov w8,#0xffffffff
00b10cd8	str w8,[x27, #0x30]
00b10cdc	cbz w28,0x00b10d10
00b10ce0	ldr x1,[sp, #0x18]
00b10ce4	mov x0,x25
00b10ce8	bl 0x00c35080
00b10cec	cbz w0,0x00b10d48
00b10cf0	ldr x0,[sp, #0x18]
00b10cf4	bl 0x00c31a90
00b10cf8	tbz w22,#0x0,0x00b10d98
00b10cfc	mov w28,w23
00b10d00	tbnz w22,#0x0,0x00b10dc4
00b10d04	b 0x00b10f14
00b10d08	mov w24,w26
00b10d0c	cbnz w28,0x00b10ce0
00b10d10	ldr x0,[x19, #0x98]
00b10d14	ldr x1,[sp, #0x18]
00b10d18	bl 0x00c347a0
00b10d1c	ldr x21,[sp, #0x18]
00b10d20	cbz w0,0x00b11154
00b10d24	mov x0,x21
00b10d28	bl 0x00c32cb0
00b10d2c	cbz x0,0x00b11194
00b10d30	mov x0,x21
00b10d34	bl 0x00c40ac0
00b10d38	cbz w0,0x00b110dc
00b10d3c	ldr w8,[x21, #0xe8]
00b10d40	ubfx w28,w8,#0xd,#0x1
00b10d44	b 0x00b10d68
00b10d48	mov x0,x25
00b10d4c	bl 0x00c31a90
00b10d50	sub w24,w24,#0x1
00b10d54	str w24,[x19, #0x94]
00b10d58	ldr x0,[x19, #0x98]
00b10d5c	ldr x2,[sp, #0x18]
00b10d60	mov w1,w24
00b10d64	bl 0x00c38080
00b10d68	ldr w8,[x19, #0x94]
00b10d6c	cmp w8,w24
00b10d70	b.gt 0x00b110dc
00b10d74	mov x0,x19
00b10d78	mov w1,w24
00b10d7c	bl 0x00b121d0
00b10d80	mov w21,w0
00b10d84	cmp w0,#0x3
00b10d88	b.ne 0x00b10f50
00b10d8c	and w22,w22,#0xfffffffe
00b10d90	cbz w28,0x00b10f1c
00b10d94	tbnz w22,#0x0,0x00b10cfc
00b10d98	tbnz w22,#0x2,0x00b10f00
00b10d9c	ldr w8,[sp, #0xc]
00b10da0	cbz w8,0x00b10f50
00b10da4	ldr w8,[x19, #0x94]
00b10da8	mov w28,w23
00b10dac	cmp w8,#0x2
00b10db0	b.lt 0x00b10f54
00b10db4	orr w22,w22,#0x4
00b10db8	sub w8,w8,#0x1
00b10dbc	str w8,[sp, #0x14]
00b10dc0	tbz w22,#0x0,0x00b10f14
00b10dc4	ldr x0,[x19, #0x98]
00b10dc8	bl 0x00c325e0
00b10dcc	ldr w8,[x19, #0x94]
00b10dd0	cmp w0,w8
00b10dd4	b.ne 0x00b110dc
00b10dd8	mov w25,w0
00b10ddc	ldr x0,[x19, #0x98]
00b10de0	sub w1,w25,#0x1
00b10de4	bl 0x00c32610
00b10de8	mov x24,x0
00b10dec	bl 0x00c32cb0
00b10df0	cbz x0,0x00b10eac
00b10df4	mov x0,x24
00b10df8	bl 0x00c40ac0
00b10dfc	cbz w0,0x00b10ed8
00b10e00	cmp w25,w28
00b10e04	b.gt 0x00b10ee0
00b10e08	ldr w8,[x24, #0xe8]
00b10e0c	tbnz w8,#0xd,0x00b10ee0
00b10e10	mov x0,x19
00b10e14	mov x1,x20
00b10e18	mov x2,x24
00b10e1c	bl 0x00b11d6c
00b10e20	str x0,[sp, #0x18]
00b10e24	cbz x0,0x00b10ee4
00b10e28	mov x1,x0
00b10e2c	mov x0,x20
00b10e30	bl 0x00c39610
00b10e34	ldr x0,[x19, #0x98]
00b10e38	ldr x1,[sp, #0x18]
00b10e3c	mov w2,#0x1
00b10e40	bl 0x00c40bc0
00b10e44	cbz w0,0x00b110dc
00b10e48	ldr w24,[x19, #0x94]
00b10e4c	ldr x8,[x19, #0xf0]
00b10e50	orr w21,wzr,#0x3
00b10e54	add w9,w24,#0x1
00b10e58	str w9,[x19, #0x94]
00b10e5c	cbz x8,0x00b10f14
00b10e60	cbz w24,0x00b10f14
00b10e64	ldr w8,[x8, #0x28]
00b10e68	mov w9,#0x5
00b10e6c	and w8,w8,w9
00b10e70	cbz w8,0x00b10f14
00b10e74	ldr x0,[x19, #0x98]
00b10e78	mov w1,w24
00b10e7c	bl 0x00c32610
00b10e80	cbz x0,0x00b10f28
00b10e84	mov x1,x0
00b10e88	mov x0,x19
00b10e8c	mov w2,w24
00b10e90	bl 0x00b11eb4
00b10e94	mov w21,w0
00b10e98	tbnz w0,#0x1f,0x00b10f14
00b10e9c	cbnz w21,0x00b11374
00b10ea0	orr w21,wzr,#0x3
00b10ea4	cbnz w22,0x00b10bb0
00b10ea8	b 0x00b10f54
00b10eac	bl 0x00c342a0
00b10eb0	adrp x0,0x2a0000
00b10eb4	adrp x2,0x2a8000
00b10eb8	mov w1,#0x62
00b10ebc	add x0,x0,#0xe02
00b10ec0	add x2,x2,#0x9bc
00b10ec4	bl 0x00c342b0
00b10ec8	mov w0,#0xb
00b10ecc	mov w1,#0x6c
00b10ed0	mov x2,xzr
00b10ed4	bl 0x00c342c0
00b10ed8	cmp w25,w28
00b10edc	b.le 0x00b10e10
00b10ee0	str xzr,[sp, #0x18]
00b10ee4	ldr w10,[sp, #0x10]
00b10ee8	and w8,w22,#0xfffffffe
00b10eec	orr w9,w8,#0x2
00b10ef0	cmp w10,#0x0
00b10ef4	csel w22,w8,w9,eq
00b10ef8	cbnz w22,0x00b10bb0
00b10efc	b 0x00b10f54
00b10f00	ldr w8,[sp, #0x14]
00b10f04	mov w28,w23
00b10f08	subs w8,w8,#0x1
00b10f0c	str w8,[sp, #0x14]
00b10f10	b.le 0x00b10f54
00b10f14	cbnz w22,0x00b10bb0
00b10f18	b 0x00b10f54
00b10f1c	mov w28,w23
00b10f20	cbnz w22,0x00b10bb0
00b10f24	b 0x00b10f54
00b10f28	orr w21,wzr,#0x3
00b10f2c	cbnz w22,0x00b10bb0
00b10f30	b 0x00b10f54
00b10f34	mov x0,x20
00b10f38	bl 0x00c34770
00b10f3c	orr w21,wzr,#0x3
00b10f40	b 0x00b10f60
00b10f44	mov w8,#0x46
00b10f48	str w8,[x19, #0xb0]
00b10f4c	mov w21,#0xffffffff
00b10f50	mov w28,w23
00b10f54	mov x0,x20
00b10f58	bl 0x00c34770
00b10f5c	tbnz w21,#0x1f,0x00b11124
00b10f60	ldr x0,[x19, #0x98]
00b10f64	bl 0x00c325e0
00b10f68	mov w20,w0
00b10f6c	cmp w0,w28
00b10f70	b.gt 0x00b11038
00b10f74	cbz x27,0x00b11014
00b10f78	cmp w21,#0x3
00b10f7c	b.ne 0x00b11014
00b10f80	ldrb w8,[x27, #0x28]
00b10f84	tbz w8,#0x2,0x00b1101c
00b10f88	ldr w8,[x19, #0x94]
00b10f8c	ldr x0,[x19, #0x98]
00b10f90	ldr x26,[x19, #0xf0]
00b10f94	sub w22,w8,#0x1
00b10f98	mov w1,w22
00b10f9c	bl 0x00c32610
00b10fa0	ldr x8,[x26, #0x8]
00b10fa4	mov x21,x0
00b10fa8	mov x0,x8
00b10fac	bl 0x00c325e0
00b10fb0	cmp w0,#0x1
00b10fb4	b.lt 0x00b1101c
00b10fb8	mov w23,w0
00b10fbc	mov w24,wzr
00b10fc0	ldr x0,[x26, #0x8]
00b10fc4	mov w1,w24
00b10fc8	bl 0x00c32610
00b10fcc	ldrb w8,[x0]
00b10fd0	cmp w8,#0x2
00b10fd4	b.ne 0x00b11004
00b10fd8	ldrb w8,[x0, #0x1]
00b10fdc	mov x25,x0
00b10fe0	cmp w8,#0x1
00b10fe4	b.ne 0x00b11004
00b10fe8	ldrb w8,[x25, #0x2]
00b10fec	cbnz w8,0x00b11004
00b10ff0	ldr x1,[x25, #0x18]
00b10ff4	mov x0,x21
00b10ff8	bl 0x00c40e70
00b10ffc	cmp w0,#0x1
00b11000	b.ge 0x00b1122c
00b11004	add w24,w24,#0x1
00b11008	cmp w24,w23
00b1100c	b.lt 0x00b10fc0
00b11010	b 0x00b1101c
00b11014	cmp w21,#0x3
00b11018	b.ne 0x00b11038
00b1101c	ldr w8,[x19, #0x94]
00b11020	cmp w20,w8
00b11024	b.ne 0x00b11050
00b11028	mov x0,x19
00b1102c	mov w1,w20
00b11030	bl 0x00b121d0
00b11034	mov w21,w0
00b11038	cmp w21,#0x1
00b1103c	b.eq 0x00b11124
00b11040	cmp w21,#0x2
00b11044	b.ne 0x00b11050
00b11048	mov w21,wzr
00b1104c	b 0x00b11124
00b11050	ldr w22,[x19, #0xb0]
00b11054	cmp w22,#0xe
00b11058	b.hi 0x00b11094
00b1105c	mov w8,#0x1
00b11060	lsl w8,w8,w22
00b11064	mov w9,#0x6600
00b11068	tst w8,w9
00b1106c	mov w21,wzr
00b11070	b.ne 0x00b11124
00b11074	cbnz w22,0x00b11094
00b11078	cmp w20,w28
00b1107c	b.le 0x00b111f0
00b11080	cmp w20,#0x0
00b11084	b.le 0x00b111c4
00b11088	sub w1,w20,#0x1
00b1108c	str w1,[x19, #0xac]
00b11090	b 0x00b111c8
00b11094	cmp w20,#0x0
00b11098	b.le 0x00b11148
00b1109c	sub w1,w20,#0x1
00b110a0	str w1,[x19, #0xac]
00b110a4	b 0x00b1114c
00b110a8	bl 0x00c342a0
00b110ac	adrp x0,0x2a0000
00b110b0	adrp x2,0x2a8000
00b110b4	add x0,x0,#0xe02
00b110b8	add x2,x2,#0x9bc
00b110bc	mov w1,#0x62
00b110c0	bl 0x00c342b0
00b110c4	mov w0,#0xb
00b110c8	mov w1,#0x6c
00b110cc	mov x2,xzr
00b110d0	bl 0x00c342c0
00b110d4	ldr x0,[sp, #0x18]
00b110d8	bl 0x00c31a90
00b110dc	bl 0x00c342a0
00b110e0	adrp x0,0x2a0000
00b110e4	adrp x2,0x2dc000
00b110e8	add x0,x0,#0xe02
00b110ec	add x2,x2,#0xc6c
00b110f0	mov w1,#0xcf3
00b110f4	bl 0x00c342b0
00b110f8	mov w8,#0x100
00b110fc	movk w8,#0xc, LSL #16
00b11100	add w1,w8,#0x3
00b11104	mov w0,#0xb
00b11108	mov x2,xzr
00b1110c	bl 0x00c342c0
00b11110	mov w8,#0x1
00b11114	mov x0,x20
00b11118	str w8,[x19, #0xb0]
00b1111c	bl 0x00c34770
00b11120	mov w21,#0xffffffff
00b11124	mov w0,w21
00b11128	ldp x29,x30,[sp, #0x70]
00b1112c	ldp x20,x19,[sp, #0x60]
00b11130	ldp x22,x21,[sp, #0x50]
00b11134	ldp x24,x23,[sp, #0x40]
00b11138	ldp x26,x25,[sp, #0x30]
00b1113c	ldp x28,x27,[sp, #0x20]
00b11140	add sp,sp,#0x80
00b11144	ret
00b11148	ldr w1,[x19, #0xac]
00b1114c	ldr x0,[x19, #0x98]
00b11150	b 0x00b11350
00b11154	mov x0,x21
00b11158	bl 0x00c31a90
00b1115c	bl 0x00c342a0
00b11160	adrp x0,0x2a0000
00b11164	adrp x2,0x2dc000
00b11168	add x0,x0,#0xe02
00b1116c	add x2,x2,#0xc6c
00b11170	mov w1,#0xcf9
00b11174	bl 0x00c342b0
00b11178	mov w1,#0x100
00b1117c	mov w0,#0xb
00b11180	movk w1,#0xc, LSL #16
00b11184	mov x2,xzr
00b11188	bl 0x00c342c0
00b1118c	mov w8,#0x11
00b11190	b 0x00b11114
00b11194	bl 0x00c342a0
00b11198	adrp x0,0x2a0000
00b1119c	adrp x2,0x2a8000
00b111a0	add x0,x0,#0xe02
00b111a4	add x2,x2,#0x9bc
00b111a8	mov w1,#0x62
00b111ac	bl 0x00c342b0
00b111b0	mov w0,#0xb
00b111b4	mov w1,#0x6c
00b111b8	mov x2,xzr
00b111bc	bl 0x00c342c0
00b111c0	b 0x00b110dc
00b111c4	ldr w1,[x19, #0xac]
00b111c8	ldr x0,[x19, #0x98]
00b111cc	bl 0x00c32610
00b111d0	ldr x8,[x19, #0x38]
00b111d4	str x0,[x19, #0xb8]
00b111d8	mov w9,#0x16
00b111dc	mov w0,wzr
00b111e0	mov x1,x19
00b111e4	str w9,[x19, #0xb0]
00b111e8	blr x8
00b111ec	cbz w0,0x00b11048
00b111f0	cbz x27,0x00b112b0
00b111f4	ldr x0,[x27, #0x8]
00b111f8	bl 0x00c325e0
00b111fc	cmp w0,#0x1
00b11200	b.lt 0x00b112b0
00b11204	ldrb w8,[x27, #0x28]
00b11208	tst w8,#0x3
00b1120c	b.eq 0x00b11218
00b11210	ldr w8,[x27, #0x30]
00b11214	tbnz w8,#0x1f,0x00b112b0
00b11218	cmp w20,#0x0
00b1121c	b.le 0x00b11284
00b11220	sub w1,w20,#0x1
00b11224	str w1,[x19, #0xac]
00b11228	b 0x00b11288
00b1122c	ldr x0,[x26, #0x20]
00b11230	bl 0x00c31a90
00b11234	mov w21,#0x1
00b11238	str xzr,[x26, #0x20]
00b1123c	str w21,[x19, #0xf8]
00b11240	str w22,[x26, #0x2c]
00b11244	str x25,[x26, #0x18]
00b11248	ldr x0,[x19, #0x98]
00b1124c	bl 0x00c325e0
00b11250	ldr w8,[x19, #0x94]
00b11254	cmp w0,w8
00b11258	b.le 0x00b11124
00b1125c	mov w20,w0
00b11260	mov w21,#0x1
00b11264	ldr x0,[x19, #0x98]
00b11268	bl 0x00c325f0
00b1126c	bl 0x00c31a90
00b11270	ldr w8,[x19, #0x94]
00b11274	sub w20,w20,#0x1
00b11278	cmp w20,w8
00b1127c	b.gt 0x00b11264
00b11280	b 0x00b11124
00b11284	ldr w1,[x19, #0xac]
00b11288	ldr x0,[x19, #0x98]
00b1128c	bl 0x00c32610
00b11290	ldr x8,[x19, #0x38]
00b11294	str x0,[x19, #0xb8]
00b11298	mov w9,#0x41
00b1129c	mov w0,wzr
00b112a0	mov x1,x19
00b112a4	str w9,[x19, #0xb0]
00b112a8	blr x8
00b112ac	cbz w0,0x00b11048
00b112b0	ldr x0,[x19, #0x98]
00b112b4	sub w21,w20,#0x1
00b112b8	mov w1,w21
00b112bc	bl 0x00c32610
00b112c0	mov x22,x0
00b112c4	bl 0x00c32cb0
00b112c8	cbz x0,0x00b112fc
00b112cc	mov x0,x22
00b112d0	bl 0x00c40ac0
00b112d4	cbz w0,0x00b11328
00b112d8	ldrb w8,[x22, #0xe9]
00b112dc	tbz w8,#0x5,0x00b11328
00b112e0	cmp w20,#0x1
00b112e4	mov w8,#0x12
00b112e8	cinc w22,w8,ne
00b112ec	cmp w20,#0x0
00b112f0	b.gt 0x00b11344
00b112f4	ldr w21,[x19, #0xac]
00b112f8	b 0x00b11348
00b112fc	bl 0x00c342a0
00b11300	adrp x0,0x2a0000
00b11304	adrp x2,0x2a8000
00b11308	add x0,x0,#0xe02
00b1130c	add x2,x2,#0x9bc
00b11310	mov w1,#0x62
00b11314	bl 0x00c342b0
00b11318	mov w0,#0xb
00b1131c	mov w1,#0x6c
00b11320	mov x2,xzr
00b11324	bl 0x00c342c0
00b11328	ldr w8,[x19, #0x94]
00b1132c	mov w9,#0x14
00b11330	mov w10,#0x2
00b11334	cmp w8,w20
00b11338	csel w22,w10,w9,lt
00b1133c	cmp w20,#0x0
00b11340	b.le 0x00b112f4
00b11344	str w21,[x19, #0xac]
00b11348	ldr x0,[x19, #0x98]
00b1134c	mov w1,w21
00b11350	bl 0x00c32610
00b11354	ldr x8,[x19, #0x38]
00b11358	str x0,[x19, #0xb8]
00b1135c	mov w0,wzr
00b11360	mov x1,x19
00b11364	str w22,[x19, #0xb0]
00b11368	blr x8
00b1136c	mov w21,w0
00b11370	b 0x00b11124
00b11374	sub w8,w24,#0x1
00b11378	mov w21,#0x1
00b1137c	str w8,[x19, #0x94]
00b11380	b 0x00b10f54
