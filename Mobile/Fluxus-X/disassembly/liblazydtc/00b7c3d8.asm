; mbedtls_asn1_get_int @ 00b7c3d8
00b7c3d8	ldr x10,[x0]
00b7c3dc	sub x8,x1,x10
00b7c3e0	cmp x8,#0x1
00b7c3e4	b.lt 0x00b7c424
00b7c3e8	ldrb w8,[x10]
00b7c3ec	cmp w8,#0x2
00b7c3f0	b.ne 0x00b7c430
00b7c3f4	add x9,x10,#0x1
00b7c3f8	sub x8,x1,x9
00b7c3fc	cmp x8,#0x1
00b7c400	str x9,[x0]
00b7c404	b.lt 0x00b7c43c
00b7c408	ldrb w9,[x9]
00b7c40c	tbnz w9,#0x7,0x00b7c448
00b7c410	add x8,x10,#0x2
00b7c414	str x8,[x0]
00b7c418	ldrb w9,[x10, #0x1]
00b7c41c	mov x10,x8
00b7c420	b 0x00b7c49c
00b7c424	mov w8,#0xffffffa0
00b7c428	mov w0,w8
00b7c42c	ret
00b7c430	mov w8,#0xffffff9e
00b7c434	mov w0,w8
00b7c438	ret
00b7c43c	mov w8,#0xffffffa0
00b7c440	mov w0,w8
00b7c444	ret
00b7c448	and w12,w9,#0x7f
00b7c44c	sub w11,w12,#0x1
00b7c450	cmp w11,#0x3
00b7c454	b.ls 0x00b7c464
00b7c458	mov w8,#0xffffff9c
00b7c45c	mov w0,w8
00b7c460	ret
00b7c464	cmp x8,x12
00b7c468	b.le 0x00b7c4f4
00b7c46c	mov x9,xzr
00b7c470	add x8,x10,#0x2
00b7c474	neg w12,w12
00b7c478	str x8,[x0]
00b7c47c	ldrb w13,[x8], #0x1
00b7c480	adds w12,w12,#0x1
00b7c484	bfm x13,x9,#0x38,#0x37
00b7c488	mov x9,x13
00b7c48c	str x8,[x0]
00b7c490	b.ne 0x00b7c47c
00b7c494	add x10,x10,x11
00b7c498	add x10,x10,#0x3
00b7c49c	sub x10,x1,x10
00b7c4a0	cmp x9,x10
00b7c4a4	b.ls 0x00b7c4b4
00b7c4a8	mov w8,#0xffffffa0
00b7c4ac	mov w0,w8
00b7c4b0	ret
00b7c4b4	cbz x9,0x00b7c500
00b7c4b8	ldrsb w10,[x8]
00b7c4bc	tbnz w10,#0x1f,0x00b7c50c
00b7c4c0	cbnz w10,0x00b7c4e0
00b7c4c4	add x8,x8,#0x1
00b7c4c8	subs x9,x9,#0x1
00b7c4cc	str x8,[x0]
00b7c4d0	b.eq 0x00b7c530
00b7c4d4	ldrb w10,[x8], #0x1
00b7c4d8	cbz w10,0x00b7c4c8
00b7c4dc	sub x8,x8,#0x1
00b7c4e0	cmp x9,#0x4
00b7c4e4	b.ls 0x00b7c518
00b7c4e8	mov w8,#0xffffff9c
00b7c4ec	mov w0,w8
00b7c4f0	ret
00b7c4f4	mov w8,#0xffffffa0
00b7c4f8	mov w0,w8
00b7c4fc	ret
00b7c500	mov w8,#0xffffff9c
00b7c504	mov w0,w8
00b7c508	ret
00b7c50c	mov w8,#0xffffff9c
00b7c510	mov w0,w8
00b7c514	ret
00b7c518	b.ne 0x00b7c53c
00b7c51c	sxtb w10,w10
00b7c520	tbz w10,#0x1f,0x00b7c53c
00b7c524	mov w8,#0xffffff9c
00b7c528	mov w0,w8
00b7c52c	ret
00b7c530	mov w0,wzr
00b7c534	str wzr,[x2]
00b7c538	ret
00b7c53c	mov w11,wzr
00b7c540	add x10,x8,#0x1
00b7c544	mov w8,wzr
00b7c548	str wzr,[x2]
00b7c54c	ldurb w12,[x10, #-0x1]
00b7c550	subs x9,x9,#0x1
00b7c554	bfm w12,w11,#0x18,#0x17
00b7c558	str w12,[x2]
00b7c55c	str x10,[x0]
00b7c560	add x10,x10,#0x1
00b7c564	mov w11,w12
00b7c568	b.ne 0x00b7c54c
00b7c56c	mov w0,w8
00b7c570	ret
