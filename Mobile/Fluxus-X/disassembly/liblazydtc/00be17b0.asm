; FUN_00be17b0 @ 00be17b0
00be17b0	paciasp
00be17b4	stp x29,x30,[sp, #-0x60]!
00be17b8	stp x28,x27,[sp, #0x10]
00be17bc	stp x26,x25,[sp, #0x20]
00be17c0	stp x24,x23,[sp, #0x30]
00be17c4	stp x22,x21,[sp, #0x40]
00be17c8	stp x20,x19,[sp, #0x50]
00be17cc	mov x29,sp
00be17d0	sub sp,sp,#0x1a0
00be17d4	mov x0,x3
00be17d8	mov x20,x2
00be17dc	mov x21,x1
00be17e0	sub x8,x29,#0x98
00be17e4	sub x1,x29,#0x78
00be17e8	sub x2,x29,#0x7c
00be17ec	sub x3,x29,#0x80
00be17f0	stp x5,x4,[sp, #0x20]
00be17f4	sub x25,x29,#0xb8
00be17f8	bl 0x00c44130
00be17fc	stp xzr,xzr,[x25, #0x8]
00be1800	str xzr,[x25, #0x18]
00be1804	sub x0,x29,#0xb0
00be1808	mov w1,#0x16
00be180c	mov w2,wzr
00be1810	sub x19,x29,#0xb0
00be1814	bl 0x00c30250
00be1818	ldurb w8,[x29, #-0xb0]
00be181c	ldr x9,[x25, #0x18]
00be1820	mov w26,wzr
00be1824	add x27,sp,#0x48
00be1828	mov w10,#0x1
00be182c	orr x28,x19,#0x1
00be1830	tst w8,#0x1
00be1834	mov w8,#0x45
00be1838	add x22,sp,#0x3c
00be183c	csinc x23,x9,x19,ne
00be1840	add x19,sp,#0x40
00be1844	str wzr,[sp, #0x3c]
00be1848	str x27,[sp, #0x40]
00be184c	strb w10,[sp, #0x38]
00be1850	strb w8,[sp, #0x34]
00be1854	str x23,[x25]
00be1858	b 0x00be1864
00be185c	add x8,x8,#0x4
00be1860	str x8,[x21, #0x18]
00be1864	cbz x21,0x00be187c
00be1868	ldp x8,x9,[x21, #0x18]
00be186c	cmp x8,x9
00be1870	b.eq 0x00be188c
00be1874	ldr w0,[x8]
00be1878	b 0x00be189c
00be187c	mov w24,#0x1
00be1880	cbnz x20,0x00be18ac
00be1884	tbz w24,#0x0,0x00be18e4
00be1888	b 0x00be1ab4
00be188c	ldr x8,[x21]
00be1890	ldr x8,[x8, #0x48]
00be1894	mov x0,x21
00be1898	blr x8
00be189c	cmn w0,#0x1
00be18a0	cset w24,eq
00be18a4	csel x21,xzr,x21,eq
00be18a8	cbz x20,0x00be1884
00be18ac	ldp x8,x9,[x20, #0x18]
00be18b0	cmp x8,x9
00be18b4	b.eq 0x00be18c0
00be18b8	ldr w0,[x8]
00be18bc	b 0x00be18d0
00be18c0	ldr x8,[x20]
00be18c4	ldr x8,[x8, #0x48]
00be18c8	mov x0,x20
00be18cc	blr x8
00be18d0	cmn w0,#0x1
00be18d4	cset w8,eq
00be18d8	csel x20,xzr,x20,eq
00be18dc	cmp w24,w8
00be18e0	b.eq 0x00be1ab4
00be18e4	ldurb w8,[x29, #-0xb0]
00be18e8	ldr x9,[x25, #0x10]
00be18ec	ldr x11,[x25]
00be18f0	lsr x10,x8,#0x1
00be18f4	tst w8,#0x1
00be18f8	csel x24,x10,x9,eq
00be18fc	add x9,x23,x24
00be1900	cmp x11,x9
00be1904	b.ne 0x00be19c0
00be1908	cmp x24,#0x1
00be190c	b.lt 0x00be1924
00be1910	sub x0,x29,#0xb0
00be1914	mov x1,x24
00be1918	mov w2,wzr
00be191c	bl 0x00c30250
00be1920	b 0x00be1948
00be1924	lsl x9,x24,#0x1
00be1928	tbnz w8,#0x0,0x00be193c
00be192c	lsl w8,w9,#0x1
00be1930	sturb w8,[x29, #-0xb0]
00be1934	mov x8,x28
00be1938	b 0x00be1944
00be193c	ldr x8,[x25, #0x18]
00be1940	str x9,[x25, #0x10]
00be1944	strb wzr,[x8, x9]
00be1948	ldp x9,x10,[x25, #0x8]
00be194c	ldurb w8,[x29, #-0xb0]
00be1950	tst w8,#0x1
00be1954	mov w8,#0x16
00be1958	and x11,x9,#-0x2
00be195c	ubfx x12,x9,#0x1,#0x7
00be1960	sub x11,x11,#0x1
00be1964	csel x8,x8,x11,eq
00be1968	tst x9,#0x1
00be196c	csel x10,x12,x10,eq
00be1970	subs x1,x8,x10
00be1974	b.ls 0x00be1988
00be1978	sub x0,x29,#0xb0
00be197c	mov w2,wzr
00be1980	bl 0x00c30250
00be1984	b 0x00be19a8
00be1988	tbnz w9,#0x0,0x00be199c
00be198c	lsl w9,w8,#0x1
00be1990	sturb w9,[x29, #-0xb0]
00be1994	mov x9,x28
00be1998	b 0x00be19a4
00be199c	ldr x9,[x25, #0x18]
00be19a0	str x8,[x25, #0x10]
00be19a4	strb wzr,[x9, x8]
00be19a8	ldurb w8,[x29, #-0xb0]
00be19ac	ldr x9,[x25, #0x18]
00be19b0	tst w8,#0x1
00be19b4	csel x23,x28,x9,eq
00be19b8	add x8,x23,x24
00be19bc	str x8,[x25]
00be19c0	ldp x8,x9,[x21, #0x18]
00be19c4	cmp x8,x9
00be19c8	b.eq 0x00be19d4
00be19cc	ldr w0,[x8]
00be19d0	b 0x00be19e4
00be19d4	ldr x8,[x21]
00be19d8	ldr x8,[x8, #0x48]
00be19dc	mov x0,x21
00be19e0	blr x8
00be19e4	ldp w6,w5,[x29, #-0x80]
00be19e8	add x1,sp,#0x38
00be19ec	sub x8,x29,#0x78
00be19f0	add x2,sp,#0x34
00be19f4	sub x4,x29,#0xb8
00be19f8	sub x7,x29,#0x98
00be19fc	mov x3,x23
00be1a00	stp x22,x8,[sp, #0x10]
00be1a04	stp x27,x19,[sp]
00be1a08	bl 0x00c44140
00be1a0c	cbnz w0,0x00be1ab4
00be1a10	tbz w26,#0x0,0x00be1a1c
00be1a14	mov w26,#0x1
00be1a18	b 0x00be1a7c
00be1a1c	ldr x8,[x25]
00be1a20	sub x9,x8,x23
00be1a24	cmp x9,#0x1
00be1a28	b.lt 0x00be1a78
00be1a2c	ldrb w8,[x23]
00be1a30	cmp w8,#0x2b
00be1a34	b.eq 0x00be1a40
00be1a38	cmp w8,#0x2d
00be1a3c	b.ne 0x00be1a9c
00be1a40	cmp x9,#0x1
00be1a44	b.eq 0x00be1a78
00be1a48	cmp w8,#0x2d
00be1a4c	b.eq 0x00be1a58
00be1a50	cmp w8,#0x2b
00be1a54	b.ne 0x00be1a78
00be1a58	ldrb w8,[x23, #0x1]
00be1a5c	mov w26,#0x1
00be1a60	cmp w8,#0x2e
00be1a64	b.eq 0x00be1a7c
00be1a68	sub w8,w8,#0x30
00be1a6c	cmp w8,#0x9
00be1a70	b.ls 0x00be1a7c
00be1a74	b 0x00be1ab4
00be1a78	mov w26,wzr
00be1a7c	ldp x8,x9,[x21, #0x18]
00be1a80	cmp x8,x9
00be1a84	b.ne 0x00be185c
00be1a88	ldr x8,[x21]
00be1a8c	ldr x8,[x8, #0x50]
00be1a90	mov x0,x21
00be1a94	blr x8
00be1a98	b 0x00be1864
00be1a9c	cmp w8,#0x2e
00be1aa0	mov w26,#0x1
00be1aa4	b.eq 0x00be1a7c
00be1aa8	sub w8,w8,#0x30
00be1aac	cmp w8,#0xa
00be1ab0	b.cc 0x00be1a7c
00be1ab4	ldurb w8,[x29, #-0x98]
00be1ab8	ldr x9,[x25, #0x28]
00be1abc	ldr x22,[sp, #0x28]
00be1ac0	lsr x10,x8,#0x1
00be1ac4	tst w8,#0x1
00be1ac8	csel x8,x10,x9,eq
00be1acc	cbz x8,0x00be1afc
00be1ad0	ldrb w8,[sp, #0x38]
00be1ad4	cmp w8,#0x1
00be1ad8	b.ne 0x00be1afc
00be1adc	ldr x8,[sp, #0x40]
00be1ae0	add x9,sp,#0x48
00be1ae4	sub x9,x8,x9
00be1ae8	cmp x9,#0x9f
00be1aec	b.gt 0x00be1afc
00be1af0	ldr w9,[sp, #0x3c]
00be1af4	str w9,[x8], #0x4
00be1af8	str x8,[sp, #0x40]
00be1afc	ldr x1,[x25]
00be1b00	mov x0,x23
00be1b04	mov x2,x22
00be1b08	bl 0x00c0c73c
00be1b0c	ldurb w10,[x29, #-0x98]
00be1b10	ldr x12,[sp, #0x40]
00be1b14	add x11,sp,#0x48
00be1b18	ldr x8,[x25, #0x28]
00be1b1c	lsr x9,x10,#0x1
00be1b20	ands w13,w10,#0x1
00be1b24	sub x11,x12,x11
00be1b28	csel x8,x9,x8,eq
00be1b2c	ldr x9,[sp, #0x20]
00be1b30	cmp x11,#0x5
00be1b34	str s0,[x9]
00be1b38	b.lt 0x00be1c98
00be1b3c	cbz x8,0x00be1c98
00be1b40	sub x8,x12,#0x4
00be1b44	add x9,sp,#0x48
00be1b48	cmp x9,x8
00be1b4c	cset w11,cc
00be1b50	cmp x9,x12
00be1b54	b.eq 0x00be1c04
00be1b58	cbz w11,0x00be1c04
00be1b5c	add x10,sp,#0x48
00be1b60	sub x14,x12,#0x8
00be1b64	add x11,x10,#0x4
00be1b68	cmp x14,x11
00be1b6c	csel x13,x14,x11,hi
00be1b70	sub x13,x13,#0x4
00be1b74	cmp x13,x10
00be1b78	cinc x15,x10,ne
00be1b7c	cmp x13,x10
00be1b80	sub x15,x13,x15
00be1b84	lsr x15,x15,#0x3
00be1b88	cinc x13,x15,ne
00be1b8c	cmp x13,#0x13
00be1b90	b.cc 0x00be1bd8
00be1b94	cmp x14,x11
00be1b98	csel x14,x14,x11,hi
00be1b9c	sub x14,x14,#0x4
00be1ba0	cmp x14,x10
00be1ba4	cinc x15,x10,ne
00be1ba8	cmp x14,x10
00be1bac	sub x15,x14,x15
00be1bb0	lsr x15,x15,#0x3
00be1bb4	cinc x14,x15,ne
00be1bb8	cmp x10,x12
00be1bbc	b.cs 0x00be1d78
00be1bc0	lsl x14,x14,#0x2
00be1bc4	sub x15,x12,x14
00be1bc8	add x11,x11,x14
00be1bcc	sub x14,x15,#0x4
00be1bd0	cmp x14,x11
00be1bd4	b.cs 0x00be1d78
00be1bd8	mov x11,x8
00be1bdc	add x10,x10,#0x4
00be1be0	ldr w12,[x11]
00be1be4	ldur w13,[x10, #-0x4]
00be1be8	stur w12,[x10, #-0x4]
00be1bec	str w13,[x11], #-0x4
00be1bf0	cmp x10,x11
00be1bf4	add x10,x10,#0x4
00be1bf8	b.cc 0x00be1be0
00be1bfc	ldurb w10,[x29, #-0x98]
00be1c00	and w13,w10,#0x1
00be1c04	ldr x11,[x25, #0x30]
00be1c08	cmp w13,#0x0
00be1c0c	sub x12,x29,#0x98
00be1c10	csinc x11,x11,x12,ne
00be1c14	cmp x9,x8
00be1c18	b.cs 0x00be1c70
00be1c1c	lsr w9,w10,#0x1
00be1c20	ldr x10,[x25, #0x28]
00be1c24	cmp w13,#0x0
00be1c28	csel x9,x9,x10,eq
00be1c2c	add x10,sp,#0x48
00be1c30	add x9,x11,x9
00be1c34	b 0x00be1c50
00be1c38	sub x12,x9,x11
00be1c3c	add x10,x10,#0x4
00be1c40	cmp x12,#0x1
00be1c44	cinc x11,x11,gt
00be1c48	cmp x10,x8
00be1c4c	b.cs 0x00be1c70
00be1c50	ldrb w12,[x11]
00be1c54	cbz w12,0x00be1c38
00be1c58	cmp w12,#0xff
00be1c5c	b.eq 0x00be1c38
00be1c60	ldr w13,[x10]
00be1c64	cmp w13,w12
00be1c68	b.eq 0x00be1c38
00be1c6c	b 0x00be1c90
00be1c70	ldrb w9,[x11]
00be1c74	cbz w9,0x00be1c98
00be1c78	cmp w9,#0xff
00be1c7c	b.eq 0x00be1c98
00be1c80	ldr w8,[x8]
00be1c84	sub w8,w8,#0x1
00be1c88	cmp w8,w9
00be1c8c	b.cc 0x00be1c98
00be1c90	mov w8,#0x4
00be1c94	str w8,[x22]
00be1c98	cbz x21,0x00be1cb0
00be1c9c	ldp x8,x9,[x21, #0x18]
00be1ca0	cmp x8,x9
00be1ca4	b.eq 0x00be1cc0
00be1ca8	ldr w0,[x8]
00be1cac	b 0x00be1cd0
00be1cb0	mov w19,#0x1
00be1cb4	cbnz x20,0x00be1ce0
00be1cb8	tbnz w19,#0x0,0x00be1d14
00be1cbc	b 0x00be1d20
00be1cc0	ldr x8,[x21]
00be1cc4	ldr x8,[x8, #0x48]
00be1cc8	mov x0,x21
00be1ccc	blr x8
00be1cd0	cmn w0,#0x1
00be1cd4	cset w19,eq
00be1cd8	csel x21,xzr,x21,eq
00be1cdc	cbz x20,0x00be1cb8
00be1ce0	ldp x8,x9,[x20, #0x18]
00be1ce4	cmp x8,x9
00be1ce8	b.eq 0x00be1cf4
00be1cec	ldr w0,[x8]
00be1cf0	b 0x00be1d04
00be1cf4	ldr x8,[x20]
00be1cf8	ldr x8,[x8, #0x48]
00be1cfc	mov x0,x20
00be1d00	blr x8
00be1d04	cmn w0,#0x1
00be1d08	cset w8,eq
00be1d0c	eor w8,w19,w8
00be1d10	tbnz w8,#0x0,0x00be1d20
00be1d14	ldr w8,[x22]
00be1d18	orr w8,w8,#0x2
00be1d1c	str w8,[x22]
00be1d20	ldurb w8,[x29, #-0xb0]
00be1d24	tbz w8,#0x0,0x00be1d38
00be1d28	ldr x8,[x25, #0x8]
00be1d2c	ldr x0,[x25, #0x18]
00be1d30	and x1,x8,#-0x2
00be1d34	bl 0x00c2fe80
00be1d38	ldurb w8,[x29, #-0x98]
00be1d3c	tbz w8,#0x0,0x00be1d50
00be1d40	ldr x8,[x25, #0x20]
00be1d44	ldr x0,[x25, #0x30]
00be1d48	and x1,x8,#-0x2
00be1d4c	bl 0x00c2fe80
00be1d50	mov x0,x21
00be1d54	add sp,sp,#0x1a0
00be1d58	ldp x20,x19,[sp, #0x50]
00be1d5c	ldp x22,x21,[sp, #0x40]
00be1d60	ldp x24,x23,[sp, #0x30]
00be1d64	ldp x26,x25,[sp, #0x20]
00be1d68	ldp x28,x27,[sp, #0x10]
00be1d6c	ldp x29,x30,[sp], #0x60
00be1d70	autiasp
00be1d74	ret
00be1d78	add x13,x13,#0x1
00be1d7c	add x15,sp,#0x48
00be1d80	sub x12,x12,#0x10
00be1d84	and x14,x13,#0x7ffffffffffffff8
00be1d88	lsl x10,x14,#0x2
00be1d8c	mov x16,x14
00be1d90	sub x11,x8,x10
00be1d94	add x10,x15,x10
00be1d98	add x15,x15,#0x10
00be1d9c	ldp q1,q0,[x12, #-0x10]
00be1da0	sub x16,x16,#0x8
00be1da4	ldp q2,q3,[x15, #-0x10]
00be1da8	rev64 v0.4S,v0.4S
00be1dac	rev64 v1.4S,v1.4S
00be1db0	rev64 v2.4S,v2.4S
00be1db4	rev64 v3.4S,v3.4S
00be1db8	ext v0.16B,v0.16B,v0.16B,0x8
00be1dbc	ext v1.16B,v1.16B,v1.16B,0x8
00be1dc0	ext v2.16B,v2.16B,v2.16B,0x8
00be1dc4	ext v3.16B,v3.16B,v3.16B,0x8
00be1dc8	stp q0,q1,[x15, #-0x10]
00be1dcc	add x15,x15,#0x20
00be1dd0	stp q3,q2,[x12, #-0x10]
00be1dd4	sub x12,x12,#0x20
00be1dd8	cbnz x16,0x00be1d9c
00be1ddc	cmp x13,x14
00be1de0	b.eq 0x00be1bfc
00be1de4	b 0x00be1bdc
