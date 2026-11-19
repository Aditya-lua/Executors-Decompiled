; FUN_0085a45c @ 0085a45c
0085a45c	sub sp,sp,#0x80
0085a460	stp x29,x30,[sp, #0x20]
0085a464	str x27,[sp, #0x30]
0085a468	stp x26,x25,[sp, #0x40]
0085a46c	stp x24,x23,[sp, #0x50]
0085a470	stp x22,x21,[sp, #0x60]
0085a474	stp x20,x19,[sp, #0x70]
0085a478	add x29,sp,#0x20
0085a47c	mrs x24,tpidr_el0
0085a480	mov x19,x0
0085a484	ldr x8,[x24, #0x28]
0085a488	stur x8,[x29, #-0x8]
0085a48c	ldur x22,[x0, #0x94]
0085a490	ldr w23,[x0, #0x90]
0085a494	bl 0x00858f2c
0085a498	ldp x9,x8,[x19, #0x1b8]
0085a49c	mov x0,x19
0085a4a0	ldur x21,[x19, #0x94]
0085a4a4	sub x20,x8,x9
0085a4a8	bl 0x00859498
0085a4ac	ldp x9,x8,[x19, #0x1b8]
0085a4b0	ubfx x25,x20,#0x3,#0x20
0085a4b4	mov x20,x0
0085a4b8	sub x8,x8,x9
0085a4bc	asr x8,x8,#0x3
0085a4c0	cmp x8,x25
0085a4c4	b.ls 0x0085a500
0085a4c8	ldr x9,[x19, #0x1b8]
0085a4cc	add x0,x19,#0x180
0085a4d0	sub x27,x8,#0x1
0085a4d4	add x9,x9,x8, LSL #0x3
0085a4d8	ldur x1,[x9, #-0x8]
0085a4dc	ldr x26,[x1, #0x18]
0085a4e0	bl 0x0086e18c
0085a4e4	cmp x27,x25
0085a4e8	mov x8,x27
0085a4ec	str x26,[x0]
0085a4f0	b.hi 0x0085a4c8
0085a4f4	ldp x9,x8,[x19, #0x1b8]
0085a4f8	sub x8,x8,x9
0085a4fc	asr x8,x8,#0x3
0085a500	subs x1,x25,x8
0085a504	b.ls 0x0085a514
0085a508	add x0,x19,#0x1b8
0085a50c	bl 0x00870174
0085a510	b 0x0085a520
0085a514	b.cs 0x0085a520
0085a518	add x8,x9,x25, LSL #0x3
0085a51c	str x8,[x19, #0x1c0]
0085a520	stur x22,[x20, #0xc]
0085a524	add x2,sp,#0x8
0085a528	mov x0,x19
0085a52c	ldur x25,[x19, #0x94]
0085a530	ldur x26,[x19, #0x9c]
0085a534	mov w1,#0x128
0085a538	str w23,[sp, #0x8]
0085a53c	stur x22,[sp, #0xc]
0085a540	bl 0x00861094
0085a544	and w8,w0,#0x1
0085a548	strb w8,[x20, #0x30]
0085a54c	tbz w0,#0x0,0x0085a554
0085a550	stur x26,[x20, #0x14]
0085a554	ldrb w8,[x19, #0x68]
0085a558	cmp w8,#0x1
0085a55c	b.ne 0x0085a59c
0085a560	ldr x8,[x19, #0xe8]
0085a564	tst w0,#0x1
0085a568	mov w1,#0x14
0085a56c	csinv x22,x25,xzr,ne
0085a570	mov x0,x8
0085a574	bl 0x0084e938
0085a578	mov x1,x21
0085a57c	mov x2,x22
0085a580	mov x23,x0
0085a584	bl 0x00851ef4
0085a588	add x0,x19,#0x4b0
0085a58c	add x1,sp,#0x8
0085a590	str x20,[sp, #0x8]
0085a594	bl 0x00860fa0
0085a598	str x23,[x0]
0085a59c	ldr x8,[x24, #0x28]
0085a5a0	ldur x9,[x29, #-0x8]
0085a5a4	cmp x8,x9
0085a5a8	b.ne 0x0085a5d0
0085a5ac	mov x0,x20
0085a5b0	ldp x20,x19,[sp, #0x70]
0085a5b4	ldr x27,[sp, #0x30]
0085a5b8	ldp x22,x21,[sp, #0x60]
0085a5bc	ldp x24,x23,[sp, #0x50]
0085a5c0	ldp x26,x25,[sp, #0x40]
0085a5c4	ldp x29,x30,[sp, #0x20]
0085a5c8	add sp,sp,#0x80
0085a5cc	ret
0085a5d0	bl 0x00c2fec0
