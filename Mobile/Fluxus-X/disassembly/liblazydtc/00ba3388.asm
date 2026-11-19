; FUN_00ba3388 @ 00ba3388
00ba3388	orr w8,wzr,#0xc0000000
00ba338c	add w8,w0,w8
00ba3390	mov w9,#0x3ffeffff
00ba3394	cmp w8,w9
00ba3398	b.ls 0x00ba3400
00ba339c	sub w8,w0,#0x1
00ba33a0	orr w9,wzr,#0x3fffffff
00ba33a4	cmp w8,w9
00ba33a8	b.cc 0x00ba33bc
00ba33ac	lsr w9,w0,#0x1e
00ba33b0	mov w8,#0xffffff78
00ba33b4	cbz w9,0x00ba34a4
00ba33b8	tbnz w0,#0x1f,0x00ba34a4
00ba33bc	adrp x8,0xd26000
00ba33c0	add x8,x8,#0x28
00ba33c4	ldr x9,[x8, #0xb0]
00ba33c8	mov x8,xzr
00ba33cc	ldr w10,[x9, #0x18]
00ba33d0	cmp w10,#0x2
00ba33d4	b.ne 0x00ba33e4
00ba33d8	ldr w10,[x9, #0x14]
00ba33dc	cmp w10,w0
00ba33e0	b.eq 0x00ba347c
00ba33e4	add x8,x8,#0x1
00ba33e8	cmp x8,#0x20
00ba33ec	add x9,x9,#0x38
00ba33f0	b.cc 0x00ba33cc
00ba33f4	mov w8,#0xffffff74
00ba33f8	mov w0,w8
00ba33fc	ret
00ba3400	ubfx w8,w0,#0x19,#0x5
00ba3404	cmp w8,#0x15
00ba3408	b.ls 0x00ba3418
00ba340c	mov w8,#0xffffff74
00ba3410	mov w0,w8
00ba3414	ret
00ba3418	and x9,x8,#0xffffffff
00ba341c	mov w10,#0x10
00ba3420	and w11,w0,#0x1ffffff
00ba3424	lsl w9,w10,w9
00ba3428	cmp w11,w9
00ba342c	b.cs 0x00ba34ac
00ba3430	adrp x9,0xd26000
00ba3434	add x9,x9,#0x28
00ba3438	ldr x10,[x9, x8, LSL #0x3]
00ba343c	mov w8,#0xffffff74
00ba3440	cbz x10,0x00ba34a4
00ba3444	orr w9,wzr,#0x38
00ba3448	umaddl x9,w11,w9,x10
00ba344c	cbz x9,0x00ba34a4
00ba3450	mov w8,w11
00ba3454	orr w11,wzr,#0x38
00ba3458	madd x11,x8,x11,x10
00ba345c	ldr w11,[x11, #0x18]
00ba3460	cmp w11,#0x2
00ba3464	b.ne 0x00ba34c4
00ba3468	orr w11,wzr,#0x38
00ba346c	madd x8,x8,x11,x10
00ba3470	ldr w8,[x8, #0x14]
00ba3474	cmp w8,w0
00ba3478	b.ne 0x00ba34dc
00ba347c	ldr w8,[x9, #0x18]
00ba3480	cmp w8,#0x2
00ba3484	b.ne 0x00ba34b8
00ba3488	ldr x10,[x9, #0x20]
00ba348c	cmn x10,#0x1
00ba3490	b.eq 0x00ba34d0
00ba3494	mov w8,wzr
00ba3498	add x10,x10,#0x1
00ba349c	str x10,[x9, #0x20]
00ba34a0	str x9,[x1]
00ba34a4	mov w0,w8
00ba34a8	ret
00ba34ac	mov w8,#0xffffff74
00ba34b0	mov w0,w8
00ba34b4	ret
00ba34b8	mov w8,#0xffffff69
00ba34bc	mov w0,w8
00ba34c0	ret
00ba34c4	mov w8,#0xffffff74
00ba34c8	mov w0,w8
00ba34cc	ret
00ba34d0	mov w8,#0xffffff69
00ba34d4	mov w0,w8
00ba34d8	ret
00ba34dc	mov w8,#0xffffff74
00ba34e0	mov w0,w8
00ba34e4	ret
