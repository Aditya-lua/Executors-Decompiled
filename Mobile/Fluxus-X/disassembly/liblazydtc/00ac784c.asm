; ossl_rand_get_entropy @ 00ac784c
00ac784c	str x21,[sp, #-0x30]!
00ac7850	stp x20,x19,[sp, #0x10]
00ac7854	mov w0,w2
00ac7858	mov x19,x1
00ac785c	mov w1,#0x1
00ac7860	mov x2,x3
00ac7864	mov x3,x4
00ac7868	stp x29,x30,[sp, #0x20]
00ac786c	add x29,sp,#0x20
00ac7870	bl 0x00c3f910
00ac7874	cbz x0,0x00ac78a0
00ac7878	mov x20,x0
00ac787c	bl 0x00c3f8b0
00ac7880	cbz x0,0x00ac78d8
00ac7884	mov x0,x20
00ac7888	bl 0x00c3f900
00ac788c	mov x21,x0
00ac7890	mov x0,x20
00ac7894	bl 0x00c3f8e0
00ac7898	str x0,[x19]
00ac789c	b 0x00ac78dc
00ac78a0	bl 0x00c342a0
00ac78a4	adrp x0,0x2c0000
00ac78a8	adrp x2,0x2aa000
00ac78ac	add x0,x0,#0x483
00ac78b0	add x2,x2,#0x898
00ac78b4	mov w1,#0x19
00ac78b8	bl 0x00c342b0
00ac78bc	mov w1,#0x100
00ac78c0	mov w0,#0x24
00ac78c4	movk w1,#0xc, LSL #16
00ac78c8	mov x2,xzr
00ac78cc	bl 0x00c342c0
00ac78d0	mov x21,xzr
00ac78d4	b 0x00ac78e4
00ac78d8	mov x21,xzr
00ac78dc	mov x0,x20
00ac78e0	bl 0x00c3f8f0
00ac78e4	ldp x29,x30,[sp, #0x20]
00ac78e8	ldp x20,x19,[sp, #0x10]
00ac78ec	mov x0,x21
00ac78f0	ldr x21,[sp], #0x30
00ac78f4	ret
