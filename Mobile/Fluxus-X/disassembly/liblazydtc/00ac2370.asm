; PKCS7_add_attrib_smimecap @ 00ac2370
00ac2370	stp x22,x21,[sp, #-0x30]!
00ac2374	stp x20,x19,[sp, #0x10]
00ac2378	stp x29,x30,[sp, #0x20]
00ac237c	add x29,sp,#0x20
00ac2380	mov x21,x1
00ac2384	mov x20,x0
00ac2388	bl 0x00c37950
00ac238c	cbz x0,0x00ac23d0
00ac2390	mov x19,x0
00ac2394	add x22,x0,#0x8
00ac2398	bl 0x00c38200
00ac239c	mov x2,x0
00ac23a0	mov x0,x21
00ac23a4	mov x1,x22
00ac23a8	bl 0x00c36170
00ac23ac	str w0,[x19]
00ac23b0	mov w1,#0xa7
00ac23b4	mov w2,#0x10
00ac23b8	mov x0,x20
00ac23bc	mov x3,x19
00ac23c0	bl 0x00c3f760
00ac23c4	cbz w0,0x00ac2404
00ac23c8	mov w0,#0x1
00ac23cc	b 0x00ac2410
00ac23d0	bl 0x00c342a0
00ac23d4	adrp x0,0x2b8000
00ac23d8	adrp x2,0x2ac000
00ac23dc	add x0,x0,#0x597
00ac23e0	add x2,x2,#0x6f5
00ac23e4	mov w1,#0x1a
00ac23e8	bl 0x00c342b0
00ac23ec	mov w1,#0x100
00ac23f0	mov w0,#0x21
00ac23f4	movk w1,#0xc, LSL #16
00ac23f8	mov x2,xzr
00ac23fc	bl 0x00c342c0
00ac2400	b 0x00ac240c
00ac2404	mov x0,x19
00ac2408	bl 0x00c37890
00ac240c	mov w0,wzr
00ac2410	ldp x29,x30,[sp, #0x20]
00ac2414	ldp x20,x19,[sp, #0x10]
00ac2418	ldp x22,x21,[sp], #0x30
00ac241c	ret
