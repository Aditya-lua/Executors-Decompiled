; EC_get_builtin_curves @ 00a28458
00a28458	cbz x0,0x00a28500
00a2845c	cbz x1,0x00a28500
00a28460	cmp x1,#0x52
00a28464	mov w8,#0x52
00a28468	csel x8,x1,x8,cc
00a2846c	cbz x8,0x00a28500
00a28470	cmp x8,#0x3
00a28474	mov x9,xzr
00a28478	b.cc 0x00a284cc
00a2847c	adrp x10,0xc5b000
00a28480	and x9,x8,#0x7e
00a28484	add x10,x10,#0x438
00a28488	add x10,x10,#0x20
00a2848c	add x11,x0,#0x10
00a28490	mov x12,x9
00a28494	ldur w13,[x10, #-0x20]
00a28498	ldr w14,[x10]
00a2849c	subs x12,x12,#0x2
00a284a0	stur w13,[x11, #-0x10]
00a284a4	str w14,[x11]
00a284a8	ldur x13,[x10, #-0x8]
00a284ac	ldr x14,[x10, #0x18]
00a284b0	add x10,x10,#0x40
00a284b4	stur x13,[x11, #-0x8]
00a284b8	str x14,[x11, #0x8]
00a284bc	add x11,x11,#0x20
00a284c0	b.ne 0x00a28494
00a284c4	cmp x8,x9
00a284c8	b.eq 0x00a28500
00a284cc	adrp x10,0xc5b000
00a284d0	add x10,x10,#0x438
00a284d4	add x11,x0,x9, LSL #0x4
00a284d8	add x10,x10,x9, LSL #0x5
00a284dc	add x10,x10,#0x18
00a284e0	add x11,x11,#0x8
00a284e4	ldur w12,[x10, #-0x18]
00a284e8	add x9,x9,#0x1
00a284ec	cmp x9,x8
00a284f0	stur w12,[x11, #-0x8]
00a284f4	ldr x12,[x10], #0x20
00a284f8	str x12,[x11], #0x10
00a284fc	b.cc 0x00a284e4
00a28500	mov w0,#0x52
00a28504	ret
