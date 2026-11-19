; ZSTD_XXH32 @ 00bc18fc
00bc18fc	mov w8,#0xae3d
00bc1900	mov w9,#0xca77
00bc1904	mov w10,#0x67b1
00bc1908	movk w8,#0xc2b2, LSL #16
00bc190c	movk w9,#0x85eb, LSL #16
00bc1910	movk w10,#0x1656, LSL #16
00bc1914	cbz x0,0x00bc19c0
00bc1918	mov w11,#0x79b1
00bc191c	cmp x1,#0x10
00bc1920	movk w11,#0x9e37, LSL #16
00bc1924	b.cc 0x00bc19c8
00bc1928	mov w13,#0x4428
00bc192c	mov w16,#0x864f
00bc1930	add x12,x0,x1
00bc1934	movk w13,#0x2423, LSL #16
00bc1938	movk w16,#0x61c8, LSL #16
00bc193c	sub x12,x12,#0xf
00bc1940	add w15,w2,w13
00bc1944	add w14,w2,w9
00bc1948	add w13,w2,w16
00bc194c	ldp w16,w17,[x0]
00bc1950	madd w15,w16,w9,w15
00bc1954	madd w14,w17,w9,w14
00bc1958	ldp w16,w17,[x0, #0x8]
00bc195c	ror w15,w15,#0x13
00bc1960	add x0,x0,#0x10
00bc1964	ror w14,w14,#0x13
00bc1968	cmp x0,x12
00bc196c	madd w16,w16,w9,w2
00bc1970	madd w13,w17,w9,w13
00bc1974	mul w15,w15,w11
00bc1978	ror w16,w16,#0x13
00bc197c	mul w14,w14,w11
00bc1980	ror w13,w13,#0x13
00bc1984	mul w2,w16,w11
00bc1988	mul w13,w13,w11
00bc198c	b.cc 0x00bc194c
00bc1990	ror w12,w15,#0x1f
00bc1994	ror w14,w14,#0x19
00bc1998	ror w15,w2,#0x14
00bc199c	ror w13,w13,#0xe
00bc19a0	add w12,w12,w1
00bc19a4	add w14,w14,w15
00bc19a8	and x1,x1,#0xf
00bc19ac	add w12,w12,w14
00bc19b0	add w12,w12,w13
00bc19b4	cmp x1,#0x4
00bc19b8	b.cs 0x00bc19d8
00bc19bc	b 0x00bc19fc
00bc19c0	add w12,w2,w10
00bc19c4	b 0x00bc1a18
00bc19c8	add w12,w2,w10
00bc19cc	add w12,w12,w1
00bc19d0	cmp x1,#0x4
00bc19d4	b.cc 0x00bc19fc
00bc19d8	mov w13,#0xeb2f
00bc19dc	movk w13,#0x27d4, LSL #16
00bc19e0	ldr w14,[x0], #0x4
00bc19e4	sub x1,x1,#0x4
00bc19e8	cmp x1,#0x3
00bc19ec	madd w12,w14,w8,w12
00bc19f0	ror w12,w12,#0xf
00bc19f4	mul w12,w12,w13
00bc19f8	b.hi 0x00bc19e0
00bc19fc	cbz x1,0x00bc1a18
00bc1a00	ldrb w13,[x0], #0x1
00bc1a04	subs x1,x1,#0x1
00bc1a08	madd w12,w13,w10,w12
00bc1a0c	ror w12,w12,#0x15
00bc1a10	mul w12,w12,w11
00bc1a14	b.ne 0x00bc1a00
00bc1a18	eor w10,w12,w12, LSR #0xf
00bc1a1c	mul w9,w10,w9
00bc1a20	eor w9,w9,w9, LSR #0xd
00bc1a24	mul w8,w9,w8
00bc1a28	eor w0,w8,w8, LSR #0x10
00bc1a2c	ret
