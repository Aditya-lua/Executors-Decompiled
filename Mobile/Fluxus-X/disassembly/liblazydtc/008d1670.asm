; FUN_008d1670 @ 008d1670
008d1670	sub sp,sp,#0xe0
008d1674	stp x29,x30,[sp, #0x80]
008d1678	stp x28,x27,[sp, #0x90]
008d167c	stp x26,x25,[sp, #0xa0]
008d1680	stp x24,x23,[sp, #0xb0]
008d1684	stp x22,x21,[sp, #0xc0]
008d1688	stp x20,x19,[sp, #0xd0]
008d168c	add x29,sp,#0x80
008d1690	mov x23,x3
008d1694	mov x22,x0
008d1698	cbz x0,0x008d16d4
008d169c	and x8,x22,#0x7
008d16a0	cbnz x8,0x008d16d4
008d16a4	mov x0,x22
008d16a8	mov x24,x1
008d16ac	mov w1,wzr
008d16b0	mov x21,x2
008d16b4	mov w2,#0x4020
008d16b8	mov w19,w5
008d16bc	mov w20,w4
008d16c0	bl 0x00c301c0
008d16c4	mov x1,x24
008d16c8	mov x2,x21
008d16cc	mov w4,w20
008d16d0	mov w5,w19
008d16d4	ldr w3,[x23]
008d16d8	mov w8,#0x7e000000
008d16dc	cmp w3,w8
008d16e0	b.ls 0x008d1714
008d16e4	mov w8,wzr
008d16e8	cmp w4,w8
008d16ec	b.lt 0x008d1734
008d16f0	mov x0,x22
008d16f4	ldp x20,x19,[sp, #0xd0]
008d16f8	ldp x22,x21,[sp, #0xc0]
008d16fc	ldp x24,x23,[sp, #0xb0]
008d1700	ldp x26,x25,[sp, #0xa0]
008d1704	ldp x28,x27,[sp, #0x90]
008d1708	ldp x29,x30,[sp, #0x80]
008d170c	add sp,sp,#0xe0
008d1710	b 0x00c309d0
008d1714	mov w8,#0x8081
008d1718	movk w8,#0x8080, LSL #16
008d171c	umull x8,w3,w8
008d1720	lsr x8,x8,#0x27
008d1724	add w8,w3,w8
008d1728	add w8,w8,#0x10
008d172c	cmp w4,w8
008d1730	b.ge 0x008d16f0
008d1734	mov w8,#0xa
008d1738	mov w9,#0x7e000000
008d173c	movk w8,#0x1, LSL #16
008d1740	cmp w3,w8
008d1744	add x8,x22,#0x4, LSL #12
008d1748	b.gt 0x008d1834
008d174c	cmp w3,w9
008d1750	b.hi 0x008d1e98
008d1754	cbz w3,0x008d1e80
008d1758	cmp w4,#0x1
008d175c	b.lt 0x008d1e98
008d1760	ldr w10,[x8, #0x18]
008d1764	ldr w9,[x8, #0x10]
008d1768	add x11,x1,x3
008d176c	add x19,x2,w4, SXTW 
008d1770	stp x23,x2,[x29, #-0x28]
008d1774	cmp w3,#0xd
008d1778	add w10,w10,w3
008d177c	stur x11,[x29, #-0x10]
008d1780	add w11,w9,w3
008d1784	str w10,[x8, #0x18]
008d1788	mov w10,#0x3
008d178c	mov x24,x2
008d1790	mov x23,x1
008d1794	stp w11,w10,[x8, #0x10]
008d1798	b.cs 0x008d1ed4
008d179c	ldur x8,[x29, #-0x10]
008d17a0	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d17a4	movk x9,#0x8081
008d17a8	sub x22,x8,x23
008d17ac	add x8,x22,#0xf0
008d17b0	umulh x8,x8,x9
008d17b4	add x9,x24,x22
008d17b8	add x8,x9,x8, LSR #0x7
008d17bc	add x8,x8,#0x1
008d17c0	cmp x8,x19
008d17c4	b.ls 0x008d17d8
008d17c8	mvn x8,x24
008d17cc	add x8,x8,x19
008d17d0	add x9,x8,#0xf1
008d17d4	sub x22,x8,x9, LSR #0x8
008d17d8	subs x8,x22,#0xf
008d17dc	b.cc 0x008d2408
008d17e0	mov w9,#0xf0
008d17e4	mov x0,x24
008d17e8	cmp x8,#0xff
008d17ec	mov x21,x1
008d17f0	strb w9,[x0], #0x1
008d17f4	b.cc 0x008d1828
008d17f8	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d17fc	sub x19,x22,#0x10e
008d1800	mov w1,#0xff
008d1804	movk x8,#0x8081
008d1808	umulh x8,x19,x8
008d180c	lsr x20,x8,#0x7
008d1810	add x2,x20,#0x1
008d1814	bl 0x00c301c0
008d1818	sub x8,x20,x20, LSL #0x8
008d181c	add x9,x24,x20
008d1820	add x0,x9,#0x2
008d1824	add x8,x8,x19
008d1828	strb w8,[x0]
008d182c	mov x24,x0
008d1830	b 0x008d2414
008d1834	cmp w3,w9
008d1838	b.hi 0x008d1e98
008d183c	cmp w4,#0x1
008d1840	b.lt 0x008d1e98
008d1844	mov x9,x1
008d1848	mov x16,#0xbb000000
008d184c	ldr w12,[x8, #0x18]
008d1850	ldr x10,[x9], #0x2
008d1854	movk x16,#0xbcdc, LSL #32
008d1858	movk x16,#0xcf1b, LSL #48
008d185c	lsl w14,w5,#0x6
008d1860	ldr w11,[x8, #0x10]
008d1864	mul x10,x10,x16
008d1868	add x15,x1,x3
008d186c	mov w13,#0x2
008d1870	add w12,w12,w3
008d1874	stur w14,[x29, #-0x30]
008d1878	sub x14,x15,#0x5
008d187c	stp w13,w12,[x8, #0x14]
008d1880	sub x12,x15,#0x8
008d1884	add x27,x2,w4, SXTW 
008d1888	stur x23,[x29, #-0x28]
008d188c	mov w17,#0x8081
008d1890	mov w19,#0xffff
008d1894	str x14,[sp, #0x40]
008d1898	add w14,w11,w3
008d189c	movk w17,#0x8080, LSL #16
008d18a0	lsr x10,x10,#0x32
008d18a4	str x12,[sp, #0x38]
008d18a8	mvn x12,x11
008d18ac	mov w4,#0xffffffff
008d18b0	sub x5,x15,#0xb
008d18b4	sub x26,x15,#0xc
008d18b8	sub x13,x15,#0x6
008d18bc	str w14,[x8, #0x10]
008d18c0	and x8,x10,#0x3ffc
008d18c4	sub x20,x1,x11
008d18c8	add x10,x12,x1
008d18cc	mov w3,#0x8081
008d18d0	mov x21,x1
008d18d4	mov x24,x2
008d18d8	stur x15,[x29, #-0x38]
008d18dc	stp x10,x13,[sp, #0x28]
008d18e0	str w11,[x22, x8#0x0]
008d18e4	stp x27,x1,[x29, #-0x10]
008d18e8	stp x2,x22,[x29, #-0x20]
008d18ec	mov x23,x21
008d18f0	ldur w8,[x29, #-0x30]
008d18f4	ldr x10,[x23, #0x1]!
008d18f8	b 0x008d1914
008d18fc	asr w9,w8,#0x6
008d1900	add w8,w8,#0x1
008d1904	mov x23,x12
008d1908	add x9,x12,w9, SXTW 
008d190c	cmp x9,x5
008d1910	b.hi 0x008d1de4
008d1914	mul x10,x10,x16
008d1918	mov x12,x9
008d191c	sub w9,w23,w20
008d1920	lsr x10,x10,#0x32
008d1924	and x13,x10,#0x3ffc
008d1928	ldr x10,[x12]
008d192c	ldr w11,[x22, x13#0x0]
008d1930	str w9,[x22, x13#0x0]
008d1934	add w14,w11,w19
008d1938	cmp w14,w9
008d193c	b.cc 0x008d18fc
008d1940	ldr w9,[x20, x11#0x0]
008d1944	ldr w13,[x23]
008d1948	cmp w9,w13
008d194c	b.ne 0x008d18fc
008d1950	ldur x8,[x29, #-0x8]
008d1954	add x25,x20,x11
008d1958	cmp x25,x8
008d195c	b.ls 0x008d1970
008d1960	ldurb w8,[x23, #-0x1]
008d1964	ldurb w9,[x25, #-0x1]
008d1968	cmp w8,w9
008d196c	b.eq 0x008d1d94
008d1970	mov x8,x23
008d1974	mov x1,x23
008d1978	sub x10,x8,x21
008d197c	add x0,x24,#0x1
008d1980	add w9,w10,#0xf0
008d1984	mov w28,w10
008d1988	umull x9,w9,w17
008d198c	add x9,x0,x9, LSR #0x27
008d1990	add x9,x9,x28
008d1994	add x9,x9,#0xb
008d1998	cmp x9,x27
008d199c	b.hi 0x008d1de4
008d19a0	subs w9,w10,#0xf
008d19a4	b.cc 0x008d1a20
008d19a8	cmp w9,#0xff
008d19ac	mov w10,#0xf0
008d19b0	strb w10,[x24]
008d19b4	b.cc 0x008d1a18
008d19b8	sub w8,w8,w21
008d19bc	stp x1,x5,[sp, #0x18]
008d19c0	mov w1,#0xff
008d19c4	sub w8,w8,#0x10e
008d19c8	str w8,[sp, #0x10]
008d19cc	umull x8,w8,w17
008d19d0	lsr x8,x8,#0x27
008d19d4	add x2,x8,#0x1
008d19d8	str x8,[sp, #0x8]
008d19dc	bl 0x00c301c0
008d19e0	ldr x9,[sp, #0x8]
008d19e4	ldp x1,x5,[sp, #0x18]
008d19e8	mov x16,#0xbb000000
008d19ec	mov w17,#0x8081
008d19f0	mov w3,#0x8081
008d19f4	sub w8,w9,w9, LSL #0x8
008d19f8	add x10,x24,x9
008d19fc	ldr w9,[sp, #0x10]
008d1a00	movk x16,#0xbcdc, LSL #32
008d1a04	mov w4,#0xffffffff
008d1a08	movk w17,#0x8080, LSL #16
008d1a0c	movk x16,#0xcf1b, LSL #48
008d1a10	add w9,w9,w8
008d1a14	add x0,x10,#0x2
008d1a18	strb w9,[x0], #0x1
008d1a1c	b 0x008d1a28
008d1a20	lsl w8,w10,#0x4
008d1a24	strb w8,[x24]
008d1a28	cmp x28,#0x8
008d1a2c	mov w8,#0x8
008d1a30	csel x9,x28,x8,hi
008d1a34	cmp x28,#0x19
008d1a38	add x8,x0,x28
008d1a3c	b.cc 0x008d1a98
008d1a40	sub x10,x0,x21
008d1a44	cmp x10,#0x20
008d1a48	b.cc 0x008d1a98
008d1a4c	sub x9,x9,#0x1
008d1a50	add x13,x0,#0x10
008d1a54	add x14,x21,#0x10
008d1a58	lsr x9,x9,#0x3
008d1a5c	add x11,x9,#0x1
008d1a60	and x12,x11,#0x3ffffffffffffffc
008d1a64	lsl x10,x12,#0x3
008d1a68	mov x15,x12
008d1a6c	add x9,x21,x10
008d1a70	add x10,x0,x10
008d1a74	ldp q0,q1,[x14, #-0x10]
008d1a78	subs x15,x15,#0x4
008d1a7c	add x14,x14,#0x20
008d1a80	stp q0,q1,[x13, #-0x10]
008d1a84	add x13,x13,#0x20
008d1a88	b.ne 0x008d1a74
008d1a8c	cmp x11,x12
008d1a90	b.ne 0x008d1aa0
008d1a94	b 0x008d1ab0
008d1a98	mov x9,x21
008d1a9c	mov x10,x0
008d1aa0	ldr x11,[x9], #0x8
008d1aa4	str x11,[x10], #0x8
008d1aa8	cmp x10,x8
008d1aac	b.cc 0x008d1aa0
008d1ab0	add x9,x8,#0xb
008d1ab4	cmp x9,x27
008d1ab8	b.hi 0x008d1de4
008d1abc	mov x21,x1
008d1ac0	add x10,x21,#0x4
008d1ac4	sub w11,w21,w25
008d1ac8	mov x9,x8
008d1acc	cmp x10,x26
008d1ad0	add x12,x25,#0x4
008d1ad4	strh w11,[x9], #0x2
008d1ad8	b.cs 0x008d1d08
008d1adc	ldr x11,[x12]
008d1ae0	ldr x12,[x10]
008d1ae4	cmp x11,x12
008d1ae8	b.ne 0x008d1ba0
008d1aec	add x11,x21,#0xc
008d1af0	add x12,x25,#0xc
008d1af4	cmp x11,x26
008d1af8	b.cs 0x008d1b28
008d1afc	sub w13,w11,w21
008d1b00	sub w13,w13,#0x4
008d1b04	ldr x14,[x12]
008d1b08	ldr x15,[x11]
008d1b0c	cmp x14,x15
008d1b10	b.ne 0x008d1bb4
008d1b14	add x11,x11,#0x8
008d1b18	add x12,x12,#0x8
008d1b1c	add w13,w13,#0x8
008d1b20	cmp x11,x26
008d1b24	b.cc 0x008d1b04
008d1b28	ldr x13,[sp, #0x38]
008d1b2c	cmp x11,x13
008d1b30	b.cs 0x008d1b50
008d1b34	ldr w13,[x12]
008d1b38	ldr w14,[x11]
008d1b3c	cmp w13,w14
008d1b40	add x13,x11,#0x4
008d1b44	add x14,x12,#0x4
008d1b48	csel x12,x12,x14,ne
008d1b4c	csel x11,x11,x13,ne
008d1b50	ldr x13,[sp, #0x30]
008d1b54	cmp x11,x13
008d1b58	b.cs 0x008d1b78
008d1b5c	ldrh w13,[x12]
008d1b60	ldrh w14,[x11]
008d1b64	cmp w13,w14
008d1b68	add x13,x11,#0x2
008d1b6c	add x14,x12,#0x2
008d1b70	csel x12,x12,x14,ne
008d1b74	csel x11,x11,x13,ne
008d1b78	ldr x13,[sp, #0x40]
008d1b7c	cmp x11,x13
008d1b80	b.cs 0x008d1b98
008d1b84	mov x13,x11
008d1b88	ldrb w12,[x12]
008d1b8c	ldrb w14,[x13], #0x1
008d1b90	cmp w12,w14
008d1b94	csel x11,x11,x13,ne
008d1b98	sub w10,w11,w10
008d1b9c	b 0x008d1bc8
008d1ba0	eor x10,x12,x11
008d1ba4	rbit x10,x10
008d1ba8	clz x10,x10
008d1bac	lsr w10,w10,#0x3
008d1bb0	b 0x008d1bc8
008d1bb4	eor x10,x15,x14
008d1bb8	rbit x10,x10
008d1bbc	clz x10,x10
008d1bc0	lsr x10,x10,#0x3
008d1bc4	add w10,w10,w13
008d1bc8	add w11,w10,#0xf0
008d1bcc	add x12,x21,w10, UXTW 
008d1bd0	umull x11,w11,w17
008d1bd4	add x21,x12,#0x4
008d1bd8	add x11,x8,x11, LSR #0x27
008d1bdc	add x11,x11,#0x8
008d1be0	cmp x11,x27
008d1be4	b.hi 0x008d1d18
008d1be8	ldrb w12,[x24]
008d1bec	subs w11,w10,#0xf
008d1bf0	b.cc 0x008d1c84
008d1bf4	add w12,w12,#0xf
008d1bf8	cmp w11,#0x3fc
008d1bfc	strb w12,[x24]
008d1c00	str w4,[x9]
008d1c04	b.cc 0x008d1c68
008d1c08	sub w25,w10,#0x40b
008d1c0c	add x24,x8,#0x6
008d1c10	mov w1,#0xff
008d1c14	umull x9,w25,w17
008d1c18	mov x0,x24
008d1c1c	mov x19,x16
008d1c20	mov x22,x21
008d1c24	mov x21,x5
008d1c28	lsr x28,x9,#0x29
008d1c2c	lsl w27,w28,#0x2
008d1c30	add x2,x27,#0x4
008d1c34	bl 0x00c301c0
008d1c38	mov w8,#0x3fc
008d1c3c	mov x5,x21
008d1c40	mov x21,x22
008d1c44	msub w11,w28,w8,w25
008d1c48	add x9,x24,x27
008d1c4c	mov w17,#0x8081
008d1c50	ldp x22,x27,[x29, #-0x18]
008d1c54	mov w3,#0x8081
008d1c58	mov w4,#0xffffffff
008d1c5c	movk w17,#0x8080, LSL #16
008d1c60	mov x16,x19
008d1c64	mov w19,#0xffff
008d1c68	and w8,w11,#0xffff
008d1c6c	mul w8,w8,w3
008d1c70	lsr w8,w8,#0x17
008d1c74	add x24,x9,x8
008d1c78	add w8,w11,w8
008d1c7c	strb w8,[x24], #0x1
008d1c80	b 0x008d1c90
008d1c84	add w8,w12,w10
008d1c88	strb w8,[x24]
008d1c8c	mov x24,x9
008d1c90	cmp x21,x5
008d1c94	b.cs 0x008d1de4
008d1c98	mov x8,x21
008d1c9c	ldr x10,[x21]
008d1ca0	ldr x9,[x8, #-0x2]!
008d1ca4	mul x10,x10,x16
008d1ca8	sub w8,w8,w20
008d1cac	mul x9,x9,x16
008d1cb0	lsr x10,x10,#0x32
008d1cb4	lsr x9,x9,#0x32
008d1cb8	and x9,x9,#0x3ffc
008d1cbc	str w8,[x22, x9#0x0]
008d1cc0	and x9,x10,#0x3ffc
008d1cc4	sub w10,w21,w20
008d1cc8	ldr w8,[x22, x9#0x0]
008d1ccc	str w10,[x22, x9#0x0]
008d1cd0	add w11,w8,w19
008d1cd4	cmp w11,w10
008d1cd8	b.cc 0x008d1d84
008d1cdc	add x25,x20,x8
008d1ce0	ldr w9,[x21]
008d1ce4	ldr w8,[x25]
008d1ce8	cmp w8,w9
008d1cec	b.ne 0x008d1d84
008d1cf0	mov x8,x24
008d1cf4	strb wzr,[x8], #0xc
008d1cf8	cmp x8,x27
008d1cfc	add x8,x24,#0x1
008d1d00	b.ls 0x008d1ac0
008d1d04	b 0x008d1de4
008d1d08	mov x11,x10
008d1d0c	cmp x11,x26
008d1d10	b.cc 0x008d1afc
008d1d14	b 0x008d1b28
008d1d18	sub w11,w27,w9
008d1d1c	lsl w12,w11,#0x8
008d1d20	sub w11,w12,w11
008d1d24	sub w11,w11,#0x5ec
008d1d28	sub w10,w10,w11
008d1d2c	sub x21,x21,x10
008d1d30	cmp x21,x23
008d1d34	b.ls 0x008d1d40
008d1d38	mov w10,w11
008d1d3c	b 0x008d1be8
008d1d40	mov x13,x21
008d1d44	ldr x12,[x21], #0x1
008d1d48	cmp x21,x23
008d1d4c	mul x12,x12,x16
008d1d50	lsr x12,x12,#0x32
008d1d54	and x12,x12,#0x3ffc
008d1d58	str wzr,[x22, x12#0x0]
008d1d5c	b.ls 0x008d1d44
008d1d60	ldur x27,[x29, #-0x10]
008d1d64	mov w17,#0x8081
008d1d68	mov w10,w11
008d1d6c	mov w19,#0xffff
008d1d70	movk w17,#0x8080, LSL #16
008d1d74	mov w4,#0xffffffff
008d1d78	mov x21,x13
008d1d7c	mov w3,#0x8081
008d1d80	b 0x008d1be8
008d1d84	add x9,x21,#0x2
008d1d88	cmp x9,x5
008d1d8c	b.ls 0x008d18ec
008d1d90	b 0x008d1de4
008d1d94	ldr x8,[sp, #0x28]
008d1d98	sub x12,x23,#0x1
008d1d9c	mov x9,x12
008d1da0	add x10,x8,x11
008d1da4	ldur x8,[x29, #-0x8]
008d1da8	mov x25,x10
008d1dac	mov x1,x9
008d1db0	cmp x10,x8
008d1db4	mov x8,x12
008d1db8	b.ls 0x008d1978
008d1dbc	cmp x1,x21
008d1dc0	b.ls 0x008d1978
008d1dc4	mov x9,x1
008d1dc8	mov x10,x25
008d1dcc	ldrb w11,[x9, #-0x1]!
008d1dd0	ldrb w12,[x10, #-0x1]!
008d1dd4	cmp w11,w12
008d1dd8	sub x12,x8,#0x1
008d1ddc	b.eq 0x008d1da4
008d1de0	b 0x008d1978
008d1de4	ldur x8,[x29, #-0x38]
008d1de8	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d1dec	movk x9,#0x8081
008d1df0	sub x22,x8,x21
008d1df4	add x8,x22,#0xf0
008d1df8	umulh x8,x8,x9
008d1dfc	add x9,x24,x22
008d1e00	add x8,x9,x8, LSR #0x7
008d1e04	add x8,x8,#0x1
008d1e08	cmp x8,x27
008d1e0c	b.ls 0x008d1e20
008d1e10	mvn x8,x24
008d1e14	add x8,x8,x27
008d1e18	add x9,x8,#0xf1
008d1e1c	sub x22,x8,x9, LSR #0x8
008d1e20	ldur x23,[x29, #-0x28]
008d1e24	subs x8,x22,#0xf
008d1e28	b.cc 0x008d1ea0
008d1e2c	ldur x25,[x29, #-0x8]
008d1e30	mov w9,#0xf0
008d1e34	mov x0,x24
008d1e38	cmp x8,#0xff
008d1e3c	strb w9,[x0], #0x1
008d1e40	b.cc 0x008d1e74
008d1e44	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d1e48	sub x19,x22,#0x10e
008d1e4c	mov w1,#0xff
008d1e50	movk x8,#0x8081
008d1e54	umulh x8,x19,x8
008d1e58	lsr x20,x8,#0x7
008d1e5c	add x2,x20,#0x1
008d1e60	bl 0x00c301c0
008d1e64	sub x8,x20,x20, LSL #0x8
008d1e68	add x9,x24,x20
008d1e6c	add x0,x9,#0x2
008d1e70	add x8,x8,x19
008d1e74	strb w8,[x0]
008d1e78	mov x24,x0
008d1e7c	b 0x008d1eac
008d1e80	cmp w4,#0x1
008d1e84	b.lt 0x008d1e98
008d1e88	strb wzr,[x2]
008d1e8c	mov w0,#0x1
008d1e90	str wzr,[x23]
008d1e94	b 0x008d2444
008d1e98	mov w0,wzr
008d1e9c	b 0x008d2444
008d1ea0	lsl w8,w22,#0x4
008d1ea4	ldur x25,[x29, #-0x8]
008d1ea8	strb w8,[x24]
008d1eac	add x24,x24,#0x1
008d1eb0	mov x1,x21
008d1eb4	mov x2,x22
008d1eb8	mov x0,x24
008d1ebc	bl 0x00c2ffd0
008d1ec0	add w8,w21,w22
008d1ec4	add w9,w24,w22
008d1ec8	sub w8,w8,w25
008d1ecc	str w8,[x23]
008d1ed0	b 0x008d243c
008d1ed4	ldur x10,[x29, #-0x10]
008d1ed8	ldr w8,[x1]
008d1edc	mov w16,#0x79b1
008d1ee0	movk w16,#0x9e37, LSL #16
008d1ee4	lsl w15,w5,#0x6
008d1ee8	mov w17,#0x8081
008d1eec	sub x11,x10,#0x5
008d1ef0	sub x20,x10,#0xb
008d1ef4	sub x28,x10,#0xc
008d1ef8	str x11,[sp, #0x40]
008d1efc	sub x11,x10,#0x8
008d1f00	sub x10,x10,#0x6
008d1f04	mul w8,w8,w16
008d1f08	stp x10,x11,[sp, #0x30]
008d1f0c	mvn x10,x9
008d1f10	add x10,x10,x1
008d1f14	sub x27,x1,x9
008d1f18	movk w17,#0x8080, LSL #16
008d1f1c	str x10,[sp, #0x28]
008d1f20	mov w2,#0xffffffff
008d1f24	mov w3,#0x8081
008d1f28	lsr w8,w8,#0x13
008d1f2c	ldur x24,[x29, #-0x20]
008d1f30	mov x4,x1
008d1f34	stur x19,[x29, #-0x30]
008d1f38	strh w9,[x22, w8, UXTW #0x1]
008d1f3c	stur x1,[x29, #-0x8]
008d1f40	stur w15,[x29, #-0x38]
008d1f44	mov x8,x4
008d1f48	mov w12,#0x1
008d1f4c	mov w9,w15
008d1f50	ldr w10,[x8, #0x1]!
008d1f54	mov x21,x8
008d1f58	add x8,x8,w12, SXTW 
008d1f5c	cmp x8,x20
008d1f60	b.hi 0x008d2464
008d1f64	mul w11,w10,w16
008d1f68	ldr w14,[x8]
008d1f6c	lsr w13,w11,#0x13
008d1f70	ldrh w11,[x22, w13, UXTW #0x1]
008d1f74	ldr w12,[x27, x11#0x0]
008d1f78	cmp w12,w10
008d1f7c	asr w12,w9,#0x6
008d1f80	sub w10,w21,w27
008d1f84	add w9,w9,#0x1
008d1f88	strh w10,[x22, w13, UXTW #0x1]
008d1f8c	mov w10,w14
008d1f90	b.ne 0x008d1f54
008d1f94	add x26,x27,x11
008d1f98	cmp x26,x1
008d1f9c	b.ls 0x008d1fb0
008d1fa0	ldurb w8,[x21, #-0x1]
008d1fa4	ldurb w9,[x26, #-0x1]
008d1fa8	cmp w8,w9
008d1fac	b.eq 0x008d23bc
008d1fb0	mov x8,x21
008d1fb4	mov x23,x21
008d1fb8	sub x10,x8,x4
008d1fbc	add x0,x24,#0x1
008d1fc0	add w9,w10,#0xf0
008d1fc4	mov w25,w10
008d1fc8	umull x9,w9,w17
008d1fcc	add x9,x0,x9, LSR #0x27
008d1fd0	add x9,x9,x25
008d1fd4	add x9,x9,#0xb
008d1fd8	cmp x9,x19
008d1fdc	b.hi 0x008d246c
008d1fe0	subs w9,w10,#0xf
008d1fe4	b.cc 0x008d205c
008d1fe8	cmp w9,#0xff
008d1fec	mov w10,#0xf0
008d1ff0	strb w10,[x24]
008d1ff4	b.cc 0x008d2054
008d1ff8	sub w8,w8,w4
008d1ffc	mov w1,#0xff
008d2000	str x4,[sp, #0x20]
008d2004	sub w8,w8,#0x10e
008d2008	str w8,[sp, #0x18]
008d200c	umull x8,w8,w17
008d2010	lsr x8,x8,#0x27
008d2014	add x2,x8,#0x1
008d2018	str x8,[sp, #0x10]
008d201c	bl 0x00c301c0
008d2020	ldr x9,[sp, #0x10]
008d2024	ldr x4,[sp, #0x20]
008d2028	mov w17,#0x8081
008d202c	mov w16,#0x79b1
008d2030	mov w3,#0x8081
008d2034	mov w2,#0xffffffff
008d2038	sub w8,w9,w9, LSL #0x8
008d203c	add x10,x24,x9
008d2040	ldr w9,[sp, #0x18]
008d2044	movk w17,#0x8080, LSL #16
008d2048	movk w16,#0x9e37, LSL #16
008d204c	add x0,x10,#0x2
008d2050	add w9,w9,w8
008d2054	strb w9,[x0], #0x1
008d2058	b 0x008d2064
008d205c	lsl w8,w10,#0x4
008d2060	strb w8,[x24]
008d2064	cmp x25,#0x8
008d2068	mov w8,#0x8
008d206c	csel x9,x25,x8,hi
008d2070	cmp x25,#0x19
008d2074	add x8,x0,x25
008d2078	b.cc 0x008d20e4
008d207c	sub x10,x0,x4
008d2080	ldur x1,[x29, #-0x8]
008d2084	cmp x10,#0x20
008d2088	b.cc 0x008d20d8
008d208c	sub x9,x9,#0x1
008d2090	add x13,x0,#0x10
008d2094	add x14,x4,#0x10
008d2098	lsr x9,x9,#0x3
008d209c	add x11,x9,#0x1
008d20a0	and x12,x11,#0x3ffffffffffffffc
008d20a4	lsl x10,x12,#0x3
008d20a8	mov x15,x12
008d20ac	add x9,x4,x10
008d20b0	add x10,x0,x10
008d20b4	ldp q0,q1,[x14, #-0x10]
008d20b8	subs x15,x15,#0x4
008d20bc	add x14,x14,#0x20
008d20c0	stp q0,q1,[x13, #-0x10]
008d20c4	add x13,x13,#0x20
008d20c8	b.ne 0x008d20b4
008d20cc	cmp x11,x12
008d20d0	b.ne 0x008d20f0
008d20d4	b 0x008d2100
008d20d8	mov x9,x4
008d20dc	mov x10,x0
008d20e0	b 0x008d20f0
008d20e4	ldur x1,[x29, #-0x8]
008d20e8	mov x9,x4
008d20ec	mov x10,x0
008d20f0	ldr x11,[x9], #0x8
008d20f4	str x11,[x10], #0x8
008d20f8	cmp x10,x8
008d20fc	b.cc 0x008d20f0
008d2100	add x9,x8,#0xb
008d2104	cmp x9,x19
008d2108	b.hi 0x008d2464
008d210c	add x10,x23,#0x4
008d2110	sub w11,w23,w26
008d2114	mov x9,x8
008d2118	cmp x10,x28
008d211c	add x12,x26,#0x4
008d2120	strh w11,[x9], #0x2
008d2124	b.cs 0x008d232c
008d2128	ldr x11,[x12]
008d212c	ldr x12,[x10]
008d2130	cmp x11,x12
008d2134	b.ne 0x008d21ec
008d2138	add x11,x23,#0xc
008d213c	add x12,x26,#0xc
008d2140	cmp x11,x28
008d2144	b.cs 0x008d2174
008d2148	sub w13,w11,w23
008d214c	sub w13,w13,#0x4
008d2150	ldr x14,[x12]
008d2154	ldr x15,[x11]
008d2158	cmp x14,x15
008d215c	b.ne 0x008d2200
008d2160	add x11,x11,#0x8
008d2164	add x12,x12,#0x8
008d2168	add w13,w13,#0x8
008d216c	cmp x11,x28
008d2170	b.cc 0x008d2150
008d2174	ldr x13,[sp, #0x38]
008d2178	cmp x11,x13
008d217c	b.cs 0x008d219c
008d2180	ldr w13,[x12]
008d2184	ldr w14,[x11]
008d2188	cmp w13,w14
008d218c	add x13,x11,#0x4
008d2190	add x14,x12,#0x4
008d2194	csel x12,x12,x14,ne
008d2198	csel x11,x11,x13,ne
008d219c	ldr x13,[sp, #0x30]
008d21a0	cmp x11,x13
008d21a4	b.cs 0x008d21c4
008d21a8	ldrh w13,[x12]
008d21ac	ldrh w14,[x11]
008d21b0	cmp w13,w14
008d21b4	add x13,x11,#0x2
008d21b8	add x14,x12,#0x2
008d21bc	csel x12,x12,x14,ne
008d21c0	csel x11,x11,x13,ne
008d21c4	ldr x13,[sp, #0x40]
008d21c8	cmp x11,x13
008d21cc	b.cs 0x008d21e4
008d21d0	mov x13,x11
008d21d4	ldrb w12,[x12]
008d21d8	ldrb w14,[x13], #0x1
008d21dc	cmp w12,w14
008d21e0	csel x11,x11,x13,ne
008d21e4	sub w10,w11,w10
008d21e8	b 0x008d2214
008d21ec	eor x10,x12,x11
008d21f0	rbit x10,x10
008d21f4	clz x10,x10
008d21f8	lsr w10,w10,#0x3
008d21fc	b 0x008d2214
008d2200	eor x10,x15,x14
008d2204	rbit x10,x10
008d2208	clz x10,x10
008d220c	lsr x10,x10,#0x3
008d2210	add w10,w10,w13
008d2214	add w11,w10,#0xf0
008d2218	add x12,x23,w10, UXTW 
008d221c	umull x11,w11,w17
008d2220	add x23,x12,#0x4
008d2224	add x11,x8,x11, LSR #0x27
008d2228	add x11,x11,#0x8
008d222c	cmp x11,x19
008d2230	b.hi 0x008d233c
008d2234	ldrb w12,[x24]
008d2238	subs w11,w10,#0xf
008d223c	b.cc 0x008d22c0
008d2240	add w12,w12,#0xf
008d2244	cmp w11,#0x3fc
008d2248	strb w12,[x24]
008d224c	str w2,[x9]
008d2250	b.cc 0x008d22a4
008d2254	sub w25,w10,#0x40b
008d2258	add x24,x8,#0x6
008d225c	mov w1,#0xff
008d2260	umull x9,w25,w17
008d2264	mov x0,x24
008d2268	lsr x26,x9,#0x29
008d226c	lsl w19,w26,#0x2
008d2270	add x2,x19,#0x4
008d2274	bl 0x00c301c0
008d2278	mov w8,#0x3fc
008d227c	mov w17,#0x8081
008d2280	mov w16,#0x79b1
008d2284	msub w11,w26,w8,w25
008d2288	ldur x1,[x29, #-0x8]
008d228c	add x9,x24,x19
008d2290	ldur x19,[x29, #-0x30]
008d2294	mov w3,#0x8081
008d2298	mov w2,#0xffffffff
008d229c	movk w17,#0x8080, LSL #16
008d22a0	movk w16,#0x9e37, LSL #16
008d22a4	and w8,w11,#0xffff
008d22a8	mul w8,w8,w3
008d22ac	lsr w8,w8,#0x17
008d22b0	add x24,x9,x8
008d22b4	add w8,w11,w8
008d22b8	strb w8,[x24], #0x1
008d22bc	b 0x008d22cc
008d22c0	add w8,w12,w10
008d22c4	strb w8,[x24]
008d22c8	mov x24,x9
008d22cc	cmp x23,x20
008d22d0	b.cs 0x008d179c
008d22d4	mov x8,x23
008d22d8	ldr w10,[x23]
008d22dc	ldr w9,[x8, #-0x2]!
008d22e0	mul w11,w10,w16
008d22e4	sub w8,w8,w27
008d22e8	mul w9,w9,w16
008d22ec	lsr w11,w11,#0x13
008d22f0	lsr w9,w9,#0x13
008d22f4	strh w8,[x22, w9, UXTW #0x1]
008d22f8	ldrh w8,[x22, w11, UXTW #0x1]
008d22fc	add x26,x27,x8
008d2300	ldr w8,[x26]
008d2304	cmp w8,w10
008d2308	sub w8,w23,w27
008d230c	strh w8,[x22, w11, UXTW #0x1]
008d2310	b.ne 0x008d23b0
008d2314	mov x8,x24
008d2318	strb wzr,[x8], #0xc
008d231c	cmp x8,x19
008d2320	add x8,x24,#0x1
008d2324	b.ls 0x008d210c
008d2328	b 0x008d179c
008d232c	mov x11,x10
008d2330	cmp x11,x28
008d2334	b.cc 0x008d2148
008d2338	b 0x008d2174
008d233c	sub w11,w19,w9
008d2340	lsl w12,w11,#0x8
008d2344	sub w11,w12,w11
008d2348	sub w11,w11,#0x5ec
008d234c	sub w10,w10,w11
008d2350	sub x23,x23,x10
008d2354	cmp x23,x21
008d2358	b.ls 0x008d2364
008d235c	mov w10,w11
008d2360	b 0x008d2234
008d2364	mov w13,#0x79b1
008d2368	mov x10,x23
008d236c	movk w13,#0x9e37, LSL #16
008d2370	ldr w12,[x10], #0x1
008d2374	cmp x10,x21
008d2378	mul w12,w12,w13
008d237c	lsr w12,w12,#0x13
008d2380	strh wzr,[x22, w12, UXTW #0x1]
008d2384	b.ls 0x008d2370
008d2388	ldur x1,[x29, #-0x8]
008d238c	ldur x19,[x29, #-0x30]
008d2390	mov w16,#0x79b1
008d2394	mov w17,#0x8081
008d2398	mov w10,w11
008d239c	movk w16,#0x9e37, LSL #16
008d23a0	movk w17,#0x8080, LSL #16
008d23a4	mov w2,#0xffffffff
008d23a8	mov w3,#0x8081
008d23ac	b 0x008d2234
008d23b0	ldur w15,[x29, #-0x38]
008d23b4	mov x4,x23
008d23b8	b 0x008d1f44
008d23bc	ldr x8,[sp, #0x28]
008d23c0	sub x12,x21,#0x1
008d23c4	mov x9,x12
008d23c8	add x10,x8,x11
008d23cc	mov x26,x10
008d23d0	cmp x10,x1
008d23d4	mov x23,x9
008d23d8	mov x8,x12
008d23dc	b.ls 0x008d1fb8
008d23e0	cmp x23,x4
008d23e4	b.ls 0x008d1fb8
008d23e8	mov x9,x23
008d23ec	mov x10,x26
008d23f0	ldrb w11,[x9, #-0x1]!
008d23f4	ldrb w12,[x10, #-0x1]!
008d23f8	cmp w11,w12
008d23fc	sub x12,x8,#0x1
008d2400	b.eq 0x008d23cc
008d2404	b 0x008d1fb8
008d2408	lsl w8,w22,#0x4
008d240c	mov x21,x1
008d2410	strb w8,[x24]
008d2414	add x24,x24,#0x1
008d2418	mov x1,x23
008d241c	mov x2,x22
008d2420	mov x0,x24
008d2424	bl 0x00c2ffd0
008d2428	add w8,w23,w22
008d242c	ldur x10,[x29, #-0x28]
008d2430	add w9,w24,w22
008d2434	sub w8,w8,w21
008d2438	str w8,[x10]
008d243c	ldur x8,[x29, #-0x20]
008d2440	sub w0,w9,w8
008d2444	ldp x20,x19,[sp, #0xd0]
008d2448	ldp x22,x21,[sp, #0xc0]
008d244c	ldp x24,x23,[sp, #0xb0]
008d2450	ldp x26,x25,[sp, #0xa0]
008d2454	ldp x28,x27,[sp, #0x90]
008d2458	ldp x29,x30,[sp, #0x80]
008d245c	add sp,sp,#0xe0
008d2460	ret
008d2464	mov x23,x4
008d2468	b 0x008d179c
008d246c	ldur x1,[x29, #-0x8]
008d2470	mov x23,x4
008d2474	b 0x008d179c
