; FUN_00a3d3bc @ 00a3d3bc
00a3d3bc	stp x22,x21,[sp, #-0x30]!
00a3d3c0	stp x20,x19,[sp, #0x10]
00a3d3c4	mov x20,x0
00a3d3c8	mov x0,x1
00a3d3cc	stp x29,x30,[sp, #0x20]
00a3d3d0	add x29,sp,#0x20
00a3d3d4	mov w19,w2
00a3d3d8	mov x22,x1
00a3d3dc	bl 0x00c39b60
00a3d3e0	ldr x8,[x22, #0x8]
00a3d3e4	cmp w19,#0x43f
00a3d3e8	mov x21,x0
00a3d3ec	b.eq 0x00a3d3f8
00a3d3f0	cmp w19,#0x40a
00a3d3f4	b.ne 0x00a3d408
00a3d3f8	cmp w19,#0x40a
00a3d3fc	mov w9,#0x2
00a3d400	csel w1,wzr,w9,eq
00a3d404	b 0x00a3d414
00a3d408	cmp w19,#0x40b
00a3d40c	orr w9,wzr,#0x3
00a3d410	csinc w1,w9,wzr,ne
00a3d414	ldr x3,[x22, #0x10]
00a3d418	mov x0,x8
00a3d41c	mov w2,wzr
00a3d420	bl 0x00c3b280
00a3d424	cbz x0,0x00a3d458
00a3d428	mov w2,#0x1
00a3d42c	mov x1,x20
00a3d430	mov x22,x0
00a3d434	bl 0x00c3b240
00a3d438	cbz w0,0x00a3d48c
00a3d43c	mov x0,x21
00a3d440	mov w1,w19
00a3d444	mov x2,x22
00a3d448	bl 0x00c39b70
00a3d44c	cbz w0,0x00a3d48c
00a3d450	mov w0,#0x1
00a3d454	b 0x00a3d498
00a3d458	bl 0x00c342a0
00a3d45c	adrp x0,0x2aa000
00a3d460	adrp x2,0x2db000
00a3d464	add x0,x0,#0x129
00a3d468	add x2,x2,#0xf1a
00a3d46c	mov w1,#0x18b
00a3d470	bl 0x00c342b0
00a3d474	mov w1,#0x100
00a3d478	mov w0,#0x5
00a3d47c	movk w1,#0xc, LSL #16
00a3d480	mov x2,xzr
00a3d484	bl 0x00c342c0
00a3d488	b 0x00a3d494
00a3d48c	mov x0,x22
00a3d490	bl 0x00c3b270
00a3d494	mov w0,wzr
00a3d498	ldp x29,x30,[sp, #0x20]
00a3d49c	ldp x20,x19,[sp, #0x10]
00a3d4a0	ldp x22,x21,[sp], #0x30
00a3d4a4	ret
