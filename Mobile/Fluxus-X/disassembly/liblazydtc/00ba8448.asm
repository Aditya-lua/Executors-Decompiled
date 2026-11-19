; FUN_00ba8448 @ 00ba8448
00ba8448	sub sp,sp,#0x80
00ba844c	str x27,[sp, #0x20]
00ba8450	stp x26,x25,[sp, #0x30]
00ba8454	stp x24,x23,[sp, #0x40]
00ba8458	stp x22,x21,[sp, #0x50]
00ba845c	stp x20,x19,[sp, #0x60]
00ba8460	stp x29,x30,[sp, #0x70]
00ba8464	add x29,sp,#0x70
00ba8468	mrs x27,tpidr_el0
00ba846c	ldr x8,[x27, #0x28]
00ba8470	mov x20,x4
00ba8474	mov x19,x3
00ba8478	mov x21,x2
00ba847c	mov w22,w1
00ba8480	mov w23,w0
00ba8484	str x8,[sp, #0x18]
00ba8488	stp xzr,xzr,[sp, #0x8]
00ba848c	cbz w0,0x00ba8508
00ba8490	mov w0,w23
00ba8494	bl 0x00c30210
00ba8498	bl 0x00c302d0
00ba849c	tst w0,#0xff
00ba84a0	b.eq 0x00ba85dc
00ba84a4	and w24,w0,#0xff
00ba84a8	add x1,sp,#0x8
00ba84ac	add x2,sp,#0x10
00ba84b0	mov w0,w23
00ba84b4	bl 0x00c42bd0
00ba84b8	mov w8,w0
00ba84bc	cmp w24,w22
00ba84c0	mov w0,#0xffffbf80
00ba84c4	b.ne 0x00ba85e0
00ba84c8	cbnz w8,0x00ba85e0
00ba84cc	cmn w22,#0xb
00ba84d0	mov w0,#0xffffbf80
00ba84d4	b.hi 0x00ba85e0
00ba84d8	ldr x24,[sp, #0x10]
00ba84dc	add w8,w22,#0x8
00ba84e0	add x8,x24,x8
00ba84e4	cmp x8,#0x7f
00ba84e8	b.hi 0x00ba85e0
00ba84ec	add w8,w22,#0xa
00ba84f0	adds x8,x24,x8
00ba84f4	mov w0,#0xffffbf80
00ba84f8	b.cs 0x00ba85e0
00ba84fc	cmp x8,x19
00ba8500	b.ls 0x00ba8518
00ba8504	b 0x00ba85e0
00ba8508	mov w8,w22
00ba850c	cmp x8,x19
00ba8510	mov x24,xzr
00ba8514	b.hi 0x00ba85dc
00ba8518	sub x8,x19,x8
00ba851c	cmp x8,#0xb
00ba8520	b.cc 0x00ba85dc
00ba8524	sub x25,x8,#0x3
00ba8528	mov w8,#0x100
00ba852c	mov x26,x20
00ba8530	strh w8,[x26], #0x2
00ba8534	orr w1,wzr,#0xff
00ba8538	mov x0,x26
00ba853c	mov x2,x25
00ba8540	bl 0x00c301c0
00ba8544	add x0,x26,x25
00ba8548	strb wzr,[x0], #0x1
00ba854c	cbz w23,0x00ba8610
00ba8550	add w9,w22,w24
00ba8554	orr w8,wzr,#0x30
00ba8558	add w10,w24,#0x4
00ba855c	orr w11,wzr,#0x6
00ba8560	add w9,w9,#0x8
00ba8564	strb w8,[x0]
00ba8568	strb w8,[x0, #0x2]
00ba856c	strb w10,[x0, #0x3]
00ba8570	strb w11,[x0, #0x4]
00ba8574	strb w9,[x0, #0x1]
00ba8578	strb w24,[x0, #0x5]
00ba857c	ldr x1,[sp, #0x8]
00ba8580	add x25,x0,#0x6
00ba8584	mov x0,x25
00ba8588	mov x2,x24
00ba858c	mov w23,w22
00ba8590	bl 0x00c2ffd0
00ba8594	add x8,x25,x24
00ba8598	add x24,x8,#0x4
00ba859c	mov w9,#0x5
00ba85a0	mov w10,#0x4
00ba85a4	mov x0,x24
00ba85a8	mov x1,x21
00ba85ac	mov x2,x23
00ba85b0	strh w9,[x8]
00ba85b4	strb w10,[x8, #0x2]
00ba85b8	strb w22,[x8, #0x3]
00ba85bc	bl 0x00c2ffd0
00ba85c0	add x8,x24,x23
00ba85c4	add x9,x20,x19
00ba85c8	cmp x8,x9
00ba85cc	b.eq 0x00ba861c
00ba85d0	mov x0,x20
00ba85d4	mov x1,x19
00ba85d8	bl 0x00c42220
00ba85dc	mov w0,#0xffffbf80
00ba85e0	ldr x8,[x27, #0x28]
00ba85e4	ldr x9,[sp, #0x18]
00ba85e8	cmp x8,x9
00ba85ec	b.ne 0x00ba8624
00ba85f0	ldp x29,x30,[sp, #0x70]
00ba85f4	ldp x20,x19,[sp, #0x60]
00ba85f8	ldp x22,x21,[sp, #0x50]
00ba85fc	ldp x24,x23,[sp, #0x40]
00ba8600	ldp x26,x25,[sp, #0x30]
00ba8604	ldr x27,[sp, #0x20]
00ba8608	add sp,sp,#0x80
00ba860c	ret
00ba8610	mov w2,w22
00ba8614	mov x1,x21
00ba8618	bl 0x00c2ffd0
00ba861c	mov w0,wzr
00ba8620	b 0x00ba85e0
00ba8624	bl 0x00c2fec0
