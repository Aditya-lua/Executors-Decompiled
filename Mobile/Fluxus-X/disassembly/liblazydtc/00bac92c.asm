; mbedtls_sha256_starts @ 00bac92c
00bac92c	cmp w1,#0x1
00bac930	mov x8,x0
00bac934	b.ls 0x00bac940
00bac938	mov w0,#0xffffff8c
00bac93c	ret
00bac940	mov w9,#0x9ed8
00bac944	mov w10,#0xe667
00bac948	cmp w1,#0x0
00bac94c	movk w9,#0xc105, LSL #16
00bac950	movk w10,#0x6a09, LSL #16
00bac954	mov w11,#0xd507
00bac958	mov w12,#0xae85
00bac95c	mov w13,#0xdd17
00bac960	mov w14,#0xf372
00bac964	mov w15,#0x5939
00bac968	mov w16,#0xf53a
00bac96c	mov w17,#0xb31
00bac970	csel w9,w10,w9,eq
00bac974	mov w10,#0x527f
00bac978	movk w11,#0x367c, LSL #16
00bac97c	movk w12,#0xbb67, LSL #16
00bac980	movk w13,#0x3070, LSL #16
00bac984	movk w14,#0x3c6e, LSL #16
00bac988	movk w15,#0xf70e, LSL #16
00bac98c	movk w16,#0xa54f, LSL #16
00bac990	movk w17,#0xffc0, LSL #16
00bac994	movk w10,#0x510e, LSL #16
00bac998	csel w11,w12,w11,eq
00bac99c	mov w12,#0x1511
00bac9a0	csel w13,w14,w13,eq
00bac9a4	mov w14,#0x688c
00bac9a8	csel w15,w16,w15,eq
00bac9ac	mov w16,#0x8fa7
00bac9b0	csel w10,w10,w17,eq
00bac9b4	mov w17,#0xd9ab
00bac9b8	movk w12,#0x6858, LSL #16
00bac9bc	movk w14,#0x9b05, LSL #16
00bac9c0	movk w16,#0x64f9, LSL #16
00bac9c4	movk w17,#0x1f83, LSL #16
00bac9c8	csel w12,w14,w12,eq
00bac9cc	mov w14,#0x4fa4
00bac9d0	csel w16,w17,w16,eq
00bac9d4	mov w17,#0xcd19
00bac9d8	movk w14,#0xbefa, LSL #16
00bac9dc	movk w17,#0x5be0, LSL #16
00bac9e0	mov w0,wzr
00bac9e4	csel w14,w17,w14,eq
00bac9e8	str xzr,[x8, #0x40]
00bac9ec	stp w9,w11,[x8, #0x48]
00bac9f0	stp w13,w15,[x8, #0x50]
00bac9f4	stp w10,w12,[x8, #0x58]
00bac9f8	stp w16,w14,[x8, #0x60]
00bac9fc	str w1,[x8, #0x68]
00baca00	ret
