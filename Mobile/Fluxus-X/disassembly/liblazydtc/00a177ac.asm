; DES_set_key_unchecked @ 00a177ac
00a177ac	ldp w9,w10,[x0]
00a177b0	mov w11,#0xcccc0000
00a177b4	mov x8,xzr
00a177b8	eor w12,w9,w10, LSR #0x4
00a177bc	and w12,w12,#0xf0f0f0f
00a177c0	eor w13,w12,w9
00a177c4	eor w12,w10,w12, LSL #0x4
00a177c8	eor w9,w13,w13, LSL #0x12
00a177cc	eor w10,w12,w12, LSL #0x12
00a177d0	and w14,w9,w11
00a177d4	and w11,w10,w11
00a177d8	eor w10,w14,w13
00a177dc	eor w12,w11,w12
00a177e0	eor w13,w10,w14, LSR #0x12
00a177e4	eor w11,w12,w11, LSR #0x12
00a177e8	eor w12,w13,w11, LSR #0x1
00a177ec	and w12,w12,#0x55555555
00a177f0	eor w13,w12,w13
00a177f4	eor w11,w11,w12, LSL #0x1
00a177f8	eor w12,w11,w13, LSR #0x8
00a177fc	and w12,w12,#0xff00ff
00a17800	eor w14,w12,w11
00a17804	eor w11,w13,w12, LSL #0x8
00a17808	eor w12,w11,w14, LSR #0x1
00a1780c	and w12,w12,#0x55555555
00a17810	eor w11,w12,w11
00a17814	lsr w13,w11,#0x4
00a17818	eor w12,w14,w12, LSL #0x1
00a1781c	and w13,w13,#0xf000000
00a17820	bfxil w13,w12,#0x0,#0x10
00a17824	bfm w13,w12,#0x10,#0x7
00a17828	bfxil w13,w12,#0x10,#0x8
00a1782c	adrp x12,0x753000
00a17830	mov w9,#0x7efc
00a17834	mov w10,#0x1b
00a17838	add x12,x12,#0xc0
00a1783c	lsr x15,x9,x8
00a17840	and w15,w15,#0x1
00a17844	and w14,w11,#0xfffffff
00a17848	add w16,w15,#0x1
00a1784c	sub w15,w10,w15
00a17850	lsr w14,w14,w16
00a17854	lsl w11,w11,w15
00a17858	lsr w16,w13,w16
00a1785c	lsl w13,w13,w15
00a17860	orr w11,w14,w11
00a17864	orr w13,w16,w13
00a17868	and w15,w16,#0x3f
00a1786c	lsr w16,w11,#0x7
00a17870	and w16,w16,#0x3c
00a17874	bfxil w16,w11,#0x6,#0x2
00a17878	and w14,w14,#0x3f
00a1787c	add x16,x12,w16, UXTW  #0x2
00a17880	ldr w14,[x12, w14, UXTW #0x2]
00a17884	lsr w17,w11,#0x15
00a17888	ldr w16,[x16, #0x100]
00a1788c	lsr w18,w11,#0x16
00a17890	and w17,w17,#0x6
00a17894	and w18,w18,#0x38
00a17898	bfxil w17,w11,#0x14,#0x1
00a1789c	orr w17,w17,w18
00a178a0	lsr w18,w11,#0xe
00a178a4	orr w14,w16,w14
00a178a8	lsr w16,w13,#0x8
00a178ac	and w18,w18,#0x30
00a178b0	and w16,w16,#0x3c
00a178b4	bfxil w18,w11,#0xd,#0x4
00a178b8	bfxil w16,w13,#0x7,#0x2
00a178bc	add x18,x12,w18, UXTW  #0x2
00a178c0	add x15,x12,w15, UXTW  #0x2
00a178c4	add x16,x12,w16, UXTW  #0x2
00a178c8	ldr w18,[x18, #0x200]
00a178cc	ldr w15,[x15, #0x400]
00a178d0	ldr w16,[x16, #0x500]
00a178d4	add x17,x12,w17, UXTW  #0x2
00a178d8	orr w14,w14,w18
00a178dc	lsr w18,w13,#0x16
00a178e0	orr w15,w16,w15
00a178e4	ubfx w16,w13,#0xf,#0x6
00a178e8	and w18,w18,#0x30
00a178ec	add x16,x12,w16, UXTW  #0x2
00a178f0	bfxil w18,w13,#0x15,#0x4
00a178f4	ldr w16,[x16, #0x600]
00a178f8	add x18,x12,w18, UXTW  #0x2
00a178fc	ldr w18,[x18, #0x700]
00a17900	ldr w17,[x17, #0x300]
00a17904	orr w15,w15,w16
00a17908	add x8,x8,#0x1
00a1790c	orr w15,w15,w18
00a17910	orr w14,w14,w17
00a17914	and w17,w15,#0x3ff0000
00a17918	lsr w16,w15,#0xe
00a1791c	bfxil w17,w14,#0x10,#0x10
00a17920	bfm w14,w15,#0x10,#0xf
00a17924	extr w15,w17,w15,#0x1a
00a17928	bfm w16,w14,#0x1e,#0x1d
00a1792c	cmp x8,#0x10
00a17930	and w13,w13,#0xfffffff
00a17934	stp w16,w15,[x1], #0x8
00a17938	b.ne 0x00a1783c
00a1793c	ret
