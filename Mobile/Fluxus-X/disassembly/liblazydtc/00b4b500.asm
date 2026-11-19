; FUN_00b4b500 @ 00b4b500
00b4b500	sub sp,sp,#0x50
00b4b504	stp x22,x21,[sp, #0x20]
00b4b508	stp x20,x19,[sp, #0x30]
00b4b50c	mov x21,x3
00b4b510	mov x22,x2
00b4b514	mov w20,w1
00b4b518	mov x19,x0
00b4b51c	stp x29,x30,[sp, #0x40]
00b4b520	add x29,sp,#0x40
00b4b524	str wzr,[sp, #0xc]
00b4b528	tbnz w1,#0x1f,0x00b4b544
00b4b52c	cmp w20,#0x1e
00b4b530	mov w0,wzr
00b4b534	b.gt 0x00b4b5e0
00b4b538	mov x0,x19
00b4b53c	bl 0x00c37240
00b4b540	cbz w0,0x00b4b5e0
00b4b544	mov x0,x19
00b4b548	bl 0x00c37240
00b4b54c	cbz w0,0x00b4b5e0
00b4b550	add x2,sp,#0xc
00b4b554	mov x0,x19
00b4b558	mov x1,x21
00b4b55c	blr x22
00b4b560	cbz w0,0x00b4b5e0
00b4b564	ldrb w8,[sp, #0xc]
00b4b568	tbz w8,#0x7,0x00b4b580
00b4b56c	mov w2,#0x1
00b4b570	mov x0,x19
00b4b574	mov x1,xzr
00b4b578	bl 0x00c343a0
00b4b57c	cbz w0,0x00b4b5e0
00b4b580	mov x0,x19
00b4b584	bl 0x00c34350
00b4b588	cbz w0,0x00b4b5e0
00b4b58c	mov w1,#0x2
00b4b590	mov w2,#0x1
00b4b594	mov x0,x19
00b4b598	bl 0x00c343a0
00b4b59c	cbz w0,0x00b4b5e0
00b4b5a0	tbnz w20,#0x1f,0x00b4b5dc
00b4b5a4	add x1,sp,#0x18
00b4b5a8	mov x0,x19
00b4b5ac	bl 0x00c34370
00b4b5b0	cbz w0,0x00b4b5e0
00b4b5b4	mov x0,x19
00b4b5b8	bl 0x00c34350
00b4b5bc	cbz w0,0x00b4b5e0
00b4b5c0	add x1,sp,#0x10
00b4b5c4	mov x0,x19
00b4b5c8	bl 0x00c34370
00b4b5cc	cbz w0,0x00b4b5e0
00b4b5d0	ldp x9,x8,[sp, #0x10]
00b4b5d4	cmp x8,x9
00b4b5d8	b.ne 0x00b4b5f4
00b4b5dc	mov w0,#0x1
00b4b5e0	ldp x29,x30,[sp, #0x40]
00b4b5e4	ldp x20,x19,[sp, #0x30]
00b4b5e8	ldp x22,x21,[sp, #0x20]
00b4b5ec	add sp,sp,#0x50
00b4b5f0	ret
00b4b5f4	mov w8,#0xa0
00b4b5f8	orr w8,w20,w8
00b4b5fc	sxtw x1,w8
00b4b600	mov w2,#0x1
00b4b604	mov x0,x19
00b4b608	bl 0x00c343a0
00b4b60c	cmp w0,#0x0
00b4b610	cset w0,ne
00b4b614	b 0x00b4b5e0
