; FUN_00b90dcc @ 00b90dcc
00b90dcc	cmp w1,w2
00b90dd0	b.ne 0x00b90ddc
00b90dd4	mov w0,w1
00b90dd8	ret
00b90ddc	mov w8,#0x8ff
00b90de0	and w9,w1,#0xffffff00
00b90de4	movk w8,#0x600, LSL #16
00b90de8	cmp w9,w8
00b90dec	b.gt 0x00b90e08
00b90df0	mov w8,#0x200
00b90df4	movk w8,#0x600, LSL #16
00b90df8	cmp w9,w8
00b90dfc	b.eq 0x00b90e3c
00b90e00	mov w8,#0x300
00b90e04	b 0x00b90e1c
00b90e08	mov w8,#0x900
00b90e0c	movk w8,#0x600, LSL #16
00b90e10	cmp w9,w8
00b90e14	b.eq 0x00b90e3c
00b90e18	mov w8,#0x1300
00b90e1c	movk w8,#0x600, LSL #16
00b90e20	cmp w9,w8
00b90e24	b.eq 0x00b90e3c
00b90e28	lsr w8,w1,#0x9
00b90e2c	orr w8,w8,#0x1
00b90e30	orr w10,wzr,#0x30003
00b90e34	cmp w8,w10
00b90e38	b.ne 0x00b90e78
00b90e3c	mov w10,#0x200
00b90e40	and w8,w2,#0xffffff00
00b90e44	movk w10,#0x600, LSL #16
00b90e48	cmp w8,w10
00b90e4c	b.eq 0x00b90e70
00b90e50	mov w10,#0x300
00b90e54	movk w10,#0x600, LSL #16
00b90e58	cmp w8,w10
00b90e5c	b.eq 0x00b90e70
00b90e60	mov w10,#0x1300
00b90e64	movk w10,#0x600, LSL #16
00b90e68	cmp w8,w10
00b90e6c	b.ne 0x00b90f4c
00b90e70	cmp w9,w8
00b90e74	b.eq 0x00b90f7c
00b90e78	and w8,w1,#0x7f000000
00b90e7c	mov w10,#0x5000000
00b90e80	cmp w8,w10
00b90e84	and w9,w2,#0x7f000000
00b90e88	b.ne 0x00b90ed4
00b90e8c	cmp w9,w10
00b90e90	b.ne 0x00b90ed4
00b90e94	and w9,w1,#0xffc07fff
00b90e98	and w8,w2,#0xffc07fff
00b90e9c	cmp w9,w8
00b90ea0	b.ne 0x00b910e4
00b90ea4	and w11,w1,#0x8000
00b90ea8	ubfx w8,w1,#0x10,#0x6
00b90eac	tst w11,w2
00b90eb0	ubfx w10,w2,#0x10,#0x6
00b90eb4	b.eq 0x00b9108c
00b90eb8	cmp w8,w10
00b90ebc	csel w8,w8,w10,hi
00b90ec0	ubfiz w8,w8,#0x10,#0x6
00b90ec4	orr w8,w9,w8
00b90ec8	orr w8,w8,#0x8000
00b90ecc	mov w0,w8
00b90ed0	ret
00b90ed4	orr w10,wzr,#0x3000000
00b90ed8	cmp w8,w10
00b90edc	b.ne 0x00b91084
00b90ee0	cmp w9,w10
00b90ee4	mov w8,wzr
00b90ee8	b.ne 0x00b910dc
00b90eec	and w9,w1,#0xffc07fff
00b90ef0	and w8,w2,#0xffc07fff
00b90ef4	cmp w9,w8
00b90ef8	mov w8,wzr
00b90efc	b.ne 0x00b910dc
00b90f00	and w8,w0,#0xffff
00b90f04	mov w10,#0x1100
00b90f08	cmp w8,w10
00b90f0c	and w10,w1,#0x7fc00000
00b90f10	b.ne 0x00b910a0
00b90f14	orr w8,wzr,#0x3800000
00b90f18	cmp w10,w8
00b90f1c	b.ne 0x00b910a0
00b90f20	ands w8,w1,#0x3f0000
00b90f24	b.eq 0x00b910ec
00b90f28	lsr w10,w8,#0x10
00b90f2c	ands w8,w2,#0x3f0000
00b90f30	b.eq 0x00b91150
00b90f34	lsr w8,w8,#0x10
00b90f38	tbz w2,#0xf,0x00b91240
00b90f3c	tbz w1,#0xf,0x00b91240
00b90f40	cmp w10,w8
00b90f44	csel w8,w10,w8,hi
00b90f48	b 0x00b90ec0
00b90f4c	orr w11,wzr,#0x6000600
00b90f50	and w10,w2,#0xfffffc00
00b90f54	add w12,w11,#0x300
00b90f58	orr w13,w10,#0x200
00b90f5c	cmp w8,w12
00b90f60	cset w10,eq
00b90f64	cmp w13,w11
00b90f68	cset w11,eq
00b90f6c	cmp w9,w8
00b90f70	b.ne 0x00b90e78
00b90f74	orr w10,w10,w11
00b90f78	tbz w10,#0x0,0x00b90e78
00b90f7c	mov w10,#0x8ff
00b90f80	movk w10,#0x600, LSL #16
00b90f84	cmp w9,w10
00b90f88	mov w10,#0x13
00b90f8c	movk w10,#0x200, LSL #16
00b90f90	b.gt 0x00b90fac
00b90f94	mov w11,#0x200
00b90f98	movk w11,#0x600, LSL #16
00b90f9c	cmp w9,w11
00b90fa0	b.eq 0x00b90fe0
00b90fa4	mov w11,#0x300
00b90fa8	b 0x00b90fc0
00b90fac	mov w11,#0x900
00b90fb0	movk w11,#0x600, LSL #16
00b90fb4	cmp w9,w11
00b90fb8	b.eq 0x00b90fe0
00b90fbc	mov w11,#0x1300
00b90fc0	movk w11,#0x600, LSL #16
00b90fc4	cmp w9,w11
00b90fc8	b.eq 0x00b90fe0
00b90fcc	lsr w9,w1,#0x9
00b90fd0	orr w9,w9,#0x1
00b90fd4	orr w11,wzr,#0x30003
00b90fd8	cmp w9,w11
00b90fdc	b.ne 0x00b91004
00b90fe0	tst w1,#0xff
00b90fe4	b.eq 0x00b91004
00b90fe8	mov w9,#0x2000000
00b90fec	bfxil w9,w1,#0x0,#0x8
00b90ff0	add w11,w10,#0xec
00b90ff4	cmp w9,w11
00b90ff8	b.ne 0x00b91004
00b90ffc	mov w0,w2
00b91000	ret
00b91004	mov w9,#0x8ff
00b91008	movk w9,#0x600, LSL #16
00b9100c	cmp w8,w9
00b91010	b.gt 0x00b9102c
00b91014	mov w9,#0x200
00b91018	movk w9,#0x600, LSL #16
00b9101c	cmp w8,w9
00b91020	b.eq 0x00b91060
00b91024	mov w9,#0x300
00b91028	b 0x00b91040
00b9102c	mov w9,#0x900
00b91030	movk w9,#0x600, LSL #16
00b91034	cmp w8,w9
00b91038	b.eq 0x00b91060
00b9103c	mov w9,#0x1300
00b91040	movk w9,#0x600, LSL #16
00b91044	cmp w8,w9
00b91048	b.eq 0x00b91060
00b9104c	lsr w8,w2,#0x9
00b91050	orr w8,w8,#0x1
00b91054	orr w9,wzr,#0x30003
00b91058	cmp w8,w9
00b9105c	b.ne 0x00b90e78
00b91060	tst w2,#0xff
00b91064	b.eq 0x00b90e78
00b91068	mov w8,#0x2000000
00b9106c	bfxil w8,w2,#0x0,#0x8
00b91070	add w9,w10,#0xec
00b91074	cmp w8,w9
00b91078	b.ne 0x00b90e78
00b9107c	mov w0,w1
00b91080	ret
00b91084	mov w0,wzr
00b91088	ret
00b9108c	cbz w11,0x00b910cc
00b91090	cmp w8,w10
00b91094	b.hi 0x00b910cc
00b91098	mov w0,w2
00b9109c	ret
00b910a0	orr w8,wzr,#0x3c00000
00b910a4	cmp w10,w8
00b910a8	mov w8,wzr
00b910ac	b.ne 0x00b910dc
00b910b0	and w8,w0,#0x7000
00b910b4	cmp w8,#0x2, LSL #12
00b910b8	b.ne 0x00b91208
00b910bc	and w11,w0,#0x700
00b910c0	mov w8,wzr
00b910c4	cbnz w11,0x00b90f20
00b910c8	b 0x00b910dc
00b910cc	tbz w2,#0xf,0x00b910e4
00b910d0	cmp w10,w8
00b910d4	mov w8,w1
00b910d8	b.hi 0x00b910e4
00b910dc	mov w0,w8
00b910e0	ret
00b910e4	mov w0,wzr
00b910e8	ret
00b910ec	and w8,w10,#0x7fffffff
00b910f0	orr w10,wzr,#0x3c00000
00b910f4	cmp w8,w10
00b910f8	b.eq 0x00b911b4
00b910fc	orr w10,wzr,#0x3800000
00b91100	cmp w8,w10
00b91104	mov w10,wzr
00b91108	b.ne 0x00b90f2c
00b9110c	sub w8,w1,#0x3
00b91110	and w10,w8,#0xff
00b91114	cmp w10,#0x10
00b91118	b.cs 0x00b9112c
00b9111c	and x10,x8,#0xff
00b91120	mov w11,#0xe7e7
00b91124	lsr w10,w11,w10
00b91128	tbnz w10,#0x0,0x00b91210
00b9112c	mov w8,#0x2000000
00b91130	mov w10,#0x13
00b91134	bfxil w8,w1,#0x0,#0x8
00b91138	movk w10,#0x200, LSL #16
00b9113c	cmp w8,w10
00b91140	cset w8,eq
00b91144	lsl w10,w8,#0x6
00b91148	ands w8,w2,#0x3f0000
00b9114c	b.ne 0x00b90f34
00b91150	and w8,w2,#0x7fc00000
00b91154	orr w11,wzr,#0x3c00000
00b91158	cmp w8,w11
00b9115c	b.eq 0x00b911e0
00b91160	orr w11,wzr,#0x3800000
00b91164	cmp w8,w11
00b91168	mov w8,wzr
00b9116c	b.ne 0x00b90f38
00b91170	sub w8,w2,#0x3
00b91174	and w11,w8,#0xff
00b91178	cmp w11,#0x10
00b9117c	b.cs 0x00b91190
00b91180	and x11,x8,#0xff
00b91184	mov w12,#0xe7e7
00b91188	lsr w11,w12,w11
00b9118c	tbnz w11,#0x0,0x00b9122c
00b91190	mov w8,#0x2000000
00b91194	mov w11,#0x13
00b91198	bfxil w8,w2,#0x0,#0x8
00b9119c	movk w11,#0x200, LSL #16
00b911a0	cmp w8,w11
00b911a4	cset w8,eq
00b911a8	lsl w8,w8,#0x6
00b911ac	tbnz w2,#0xf,0x00b90f3c
00b911b0	b 0x00b91240
00b911b4	and w8,w0,#0x7000
00b911b8	cmp w8,#0x2, LSL #12
00b911bc	mov w10,wzr
00b911c0	b.ne 0x00b90f2c
00b911c4	and w8,w0,#0xffff
00b911c8	ubfx w8,w8,#0x8,#0x3
00b911cc	mov w10,#0x1
00b911d0	lsl w10,w10,w8
00b911d4	ands w8,w2,#0x3f0000
00b911d8	b.ne 0x00b90f34
00b911dc	b 0x00b91150
00b911e0	and w8,w0,#0x7000
00b911e4	cmp w8,#0x2, LSL #12
00b911e8	mov w8,wzr
00b911ec	b.ne 0x00b90f38
00b911f0	and w8,w0,#0xffff
00b911f4	ubfx w8,w8,#0x8,#0x3
00b911f8	mov w11,#0x1
00b911fc	lsl w8,w11,w8
00b91200	tbnz w2,#0xf,0x00b90f3c
00b91204	b 0x00b91240
00b91208	mov w0,wzr
00b9120c	ret
00b91210	adrp x10,0x780000
00b91214	sxtb x8,w8
00b91218	add x10,x10,#0xa30
00b9121c	ldr w10,[x10, x8, LSL #0x2]
00b91220	ands w8,w2,#0x3f0000
00b91224	b.ne 0x00b90f34
00b91228	b 0x00b91150
00b9122c	adrp x11,0x780000
00b91230	sxtb x8,w8
00b91234	add x11,x11,#0xa30
00b91238	ldr w8,[x11, x8, LSL #0x2]
00b9123c	tbnz w2,#0xf,0x00b90f3c
00b91240	tbz w1,#0xf,0x00b91254
00b91244	cmp w10,w8
00b91248	csel w8,wzr,w2,hi
00b9124c	mov w0,w8
00b91250	ret
00b91254	tbnz w2,#0xf,0x00b91274
00b91258	cmp w10,w8
00b9125c	mov w8,wzr
00b91260	b.ne 0x00b910dc
00b91264	ubfiz w8,w10,#0x10,#0x6
00b91268	orr w8,w8,w9
00b9126c	mov w0,w8
00b91270	ret
00b91274	cmp w8,w10
00b91278	csel w8,wzr,w1,hi
00b9127c	mov w0,w8
00b91280	ret
