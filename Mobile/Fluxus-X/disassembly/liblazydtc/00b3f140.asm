; FUN_00b3f140 @ 00b3f140
00b3f140	stp x24,x23,[sp, #-0x40]!
00b3f144	stp x22,x21,[sp, #0x10]
00b3f148	stp x20,x19,[sp, #0x20]
00b3f14c	stp x29,x30,[sp, #0x30]
00b3f150	add x29,sp,#0x30
00b3f154	mov x19,x4
00b3f158	mov x20,x3
00b3f15c	mov w24,w2
00b3f160	mov x22,x0
00b3f164	bl 0x00c3a0c0
00b3f168	mov x21,x0
00b3f16c	mov x0,x22
00b3f170	bl 0x00c3a0f0
00b3f174	mov x23,x0
00b3f178	mov x0,x22
00b3f17c	bl 0x00c3a0b0
00b3f180	cbz w24,0x00b3f1c4
00b3f184	cbz x21,0x00b3f1c4
00b3f188	cbz x23,0x00b3f1c4
00b3f18c	cbz x0,0x00b3f1c4
00b3f190	bl 0x00c37950
00b3f194	cbz x0,0x00b3f1d8
00b3f198	mov x21,x0
00b3f19c	add x1,x0,#0x8
00b3f1a0	mov x0,x22
00b3f1a4	bl 0x00c3a180
00b3f1a8	cmp w0,#0x0
00b3f1ac	str w0,[x21]
00b3f1b0	b.le 0x00b3f20c
00b3f1b4	mov w8,#0x10
00b3f1b8	str w8,[x19]
00b3f1bc	str x21,[x20]
00b3f1c0	b 0x00b3f1d0
00b3f1c4	mov w8,#0xffffffff
00b3f1c8	str xzr,[x20]
00b3f1cc	str w8,[x19]
00b3f1d0	mov w0,#0x1
00b3f1d4	b 0x00b3f248
00b3f1d8	bl 0x00c342a0
00b3f1dc	adrp x0,0x2c2000
00b3f1e0	adrp x2,0x29e000
00b3f1e4	add x0,x0,#0x9ea
00b3f1e8	add x2,x2,#0xe3b
00b3f1ec	mov w1,#0x229
00b3f1f0	bl 0x00c342b0
00b3f1f4	mov w1,#0x100
00b3f1f8	mov w0,#0x39
00b3f1fc	movk w1,#0xc, LSL #16
00b3f200	mov x2,xzr
00b3f204	bl 0x00c342c0
00b3f208	b 0x00b3f244
00b3f20c	bl 0x00c342a0
00b3f210	adrp x0,0x2c2000
00b3f214	adrp x2,0x29e000
00b3f218	add x0,x0,#0x9ea
00b3f21c	add x2,x2,#0xe3b
00b3f220	mov w1,#0x230
00b3f224	bl 0x00c342b0
00b3f228	mov w1,#0x100
00b3f22c	mov w0,#0x39
00b3f230	movk w1,#0xc, LSL #16
00b3f234	mov x2,xzr
00b3f238	bl 0x00c342c0
00b3f23c	mov x0,x21
00b3f240	bl 0x00c37890
00b3f244	mov w0,wzr
00b3f248	ldp x29,x30,[sp, #0x30]
00b3f24c	ldp x20,x19,[sp, #0x20]
00b3f250	ldp x22,x21,[sp, #0x10]
00b3f254	ldp x24,x23,[sp], #0x40
00b3f258	ret
