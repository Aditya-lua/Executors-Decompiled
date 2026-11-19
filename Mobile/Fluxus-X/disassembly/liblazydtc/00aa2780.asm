; ossl_provider_info_clear @ 00aa2780
00aa2780	stp x20,x19,[sp, #-0x20]!
00aa2784	stp x29,x30,[sp, #0x10]
00aa2788	mov x19,x0
00aa278c	ldr x0,[x0]
00aa2790	adrp x20,0x2aa000
00aa2794	add x20,x20,#0x4b5
00aa2798	mov w2,#0x119
00aa279c	mov x1,x20
00aa27a0	add x29,sp,#0x10
00aa27a4	bl 0x00c32310
00aa27a8	ldr x0,[x19, #0x8]
00aa27ac	mov w2,#0x11a
00aa27b0	mov x1,x20
00aa27b4	bl 0x00c32310
00aa27b8	ldr x0,[x19, #0x18]
00aa27bc	ldp x29,x30,[sp, #0x10]
00aa27c0	adrp x1,0xaa2000
00aa27c4	add x1,x1,#0x7d0
00aa27c8	ldp x20,x19,[sp], #0x20
00aa27cc	b 0x00c32600
