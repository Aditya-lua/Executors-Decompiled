; FUN_0094a3a8 @ 0094a3a8
0094a3a8	stp x20,x19,[sp, #-0x20]!
0094a3ac	stp x29,x30,[sp, #0x10]
0094a3b0	add x29,sp,#0x10
0094a3b4	mov x19,x0
0094a3b8	cbz x1,0x0094a3e8
0094a3bc	ldr x8,[x1, #0x3a0]
0094a3c0	and x8,x8,#-0x2001
0094a3c4	str x8,[x1, #0x3a0]
0094a3c8	ldr w8,[x19, #0x131c]
0094a3cc	tbz w8,#0x6,0x0094a3ec
0094a3d0	ldr x9,[x1, #0x3a8]
0094a3d4	ldrb w9,[x9, #0x95]
0094a3d8	tbnz w9,#0x4,0x0094a3ec
0094a3dc	and w8,w8,#0xffffffbf
0094a3e0	str w8,[x19, #0x131c]
0094a3e4	b 0x0094a3ec
0094a3e8	ldr w8,[x19, #0x131c]
0094a3ec	ldrb w9,[x19, #0x1b2]
0094a3f0	and w8,w8,#0xfffffbff
0094a3f4	add x0,x19,#0xd8
0094a3f8	str w8,[x19, #0x131c]
0094a3fc	tbz w9,#0x7,0x0094a40c
0094a400	mov w8,#0x131a
0094a404	mov w9,#0x5
0094a408	strb w9,[x19, x8]
0094a40c	mov x1,x19
0094a410	bl 0x009327ec
0094a414	mov w20,w0
0094a418	cbnz w0,0x0094a43c
0094a41c	mov x0,x19
0094a420	bl 0x00941238
0094a424	mov x0,x19
0094a428	mov x1,xzr
0094a42c	bl 0x00931fec
0094a430	mov x0,x19
0094a434	mov x1,xzr
0094a438	bl 0x00931fe0
0094a43c	ldp x29,x30,[sp, #0x10]
0094a440	mov w0,w20
0094a444	ldp x20,x19,[sp], #0x20
0094a448	ret
