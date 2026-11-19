; FUN_0096a4cc @ 0096a4cc
0096a4cc	sub sp,sp,#0x50
0096a4d0	str x23,[sp, #0x10]
0096a4d4	stp x22,x21,[sp, #0x20]
0096a4d8	stp x20,x19,[sp, #0x30]
0096a4dc	stp x29,x30,[sp, #0x40]
0096a4e0	add x29,sp,#0x40
0096a4e4	mrs x22,tpidr_el0
0096a4e8	ldr x8,[x22, #0x28]
0096a4ec	adrp x21,0xcb4000
0096a4f0	mov x19,x0
0096a4f4	orr w1,wzr,#0x60
0096a4f8	str x8,[sp, #0x8]
0096a4fc	ldr x8,[x0, #0x18]
0096a500	ldr x21,[x21, #0xdd0]
0096a504	str xzr,[sp]
0096a508	mov w0,#0x1
0096a50c	ldr x23,[x8, #0x3a0]
0096a510	ldr x8,[x21]
0096a514	blr x8
0096a518	mov x20,x0
0096a51c	cbz x0,0x0096a594
0096a520	adrp x9,0x749000
0096a524	lsl x8,x23,#0x27
0096a528	add x9,x9,#0x238
0096a52c	and x8,x9,x8, ASR #0x3f
0096a530	str x8,[x20, #0x28]
0096a534	adrp x8,0xcc4000
0096a538	ldr x8,[x8, #0xd08]
0096a53c	ldr x9,[x21]
0096a540	mov w0,#0x1
0096a544	ldr x1,[x8, #0x18]
0096a548	blr x9
0096a54c	str x0,[x20, #0x30]
0096a550	cbz x0,0x0096a59c
0096a554	adrp x1,0xcc4000
0096a558	add x1,x1,#0xd98
0096a55c	mov x0,sp
0096a560	mov x2,x20
0096a564	bl 0x00907328
0096a568	mov w21,w0
0096a56c	cbz w0,0x0096a5b8
0096a570	adrp x19,0xcc4000
0096a574	add x19,x19,#0x678
0096a578	ldr x0,[x20, #0x30]
0096a57c	ldr x8,[x19]
0096a580	blr x8
0096a584	ldr x8,[x19]
0096a588	mov x0,x20
0096a58c	blr x8
0096a590	b 0x0096a5c4
0096a594	mov w21,#0x1b
0096a598	b 0x0096a5c4
0096a59c	adrp x8,0xcc4000
0096a5a0	add x8,x8,#0x678
0096a5a4	mov x0,x20
0096a5a8	ldr x8,[x8]
0096a5ac	blr x8
0096a5b0	mov w21,#0x1b
0096a5b4	b 0x0096a5c4
0096a5b8	ldr x1,[sp]
0096a5bc	mov x0,x19
0096a5c0	bl 0x009073e8
0096a5c4	ldr x8,[x22, #0x28]
0096a5c8	ldr x9,[sp, #0x8]
0096a5cc	cmp x8,x9
0096a5d0	b.ne 0x0096a5f0
0096a5d4	mov w0,w21
0096a5d8	ldp x29,x30,[sp, #0x40]
0096a5dc	ldp x20,x19,[sp, #0x30]
0096a5e0	ldp x22,x21,[sp, #0x20]
0096a5e4	ldr x23,[sp, #0x10]
0096a5e8	add sp,sp,#0x50
0096a5ec	ret
0096a5f0	bl 0x00c2fec0
