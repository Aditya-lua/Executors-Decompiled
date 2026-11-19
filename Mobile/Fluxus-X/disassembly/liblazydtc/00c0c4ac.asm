; FUN_00c0c4ac @ 00c0c4ac
00c0c4ac	paciasp
00c0c4b0	sub sp,sp,#0x60
00c0c4b4	stp x29,x30,[sp, #0x10]
00c0c4b8	stp x26,x25,[sp, #0x20]
00c0c4bc	stp x24,x23,[sp, #0x30]
00c0c4c0	stp x22,x21,[sp, #0x40]
00c0c4c4	stp x20,x19,[sp, #0x50]
00c0c4c8	add x29,sp,#0x10
00c0c4cc	cmp x0,x1
00c0c4d0	mov x19,x2
00c0c4d4	b.eq 0x00c0c56c
00c0c4d8	ldrb w24,[x0]
00c0c4dc	mov w21,w3
00c0c4e0	mov x20,x1
00c0c4e4	mov x22,x0
00c0c4e8	cmp w24,#0x2d
00c0c4ec	b.ne 0x00c0c4fc
00c0c4f0	add x22,x22,#0x1
00c0c4f4	cmp x22,x20
00c0c4f8	b.eq 0x00c0c56c
00c0c4fc	bl 0x00c30710
00c0c500	ldr w25,[x0]
00c0c504	str wzr,[x0]
00c0c508	adrp x8,0xd27000
00c0c50c	add x8,x8,#0xf8
00c0c510	mov x23,x0
00c0c514	adrp x26,0xd27000
00c0c518	ldarb w8,[x8]
00c0c51c	tbz w8,#0x0,0x00c0c5a4
00c0c520	ldr x3,[x26, #0xf0]
00c0c524	add x1,sp,#0x8
00c0c528	mov x0,x22
00c0c52c	mov w2,w21
00c0c530	bl 0x00c43950
00c0c534	ldr w8,[x23]
00c0c538	cbz w8,0x00c0c55c
00c0c53c	ldr x9,[sp, #0x8]
00c0c540	cmp x9,x20
00c0c544	b.ne 0x00c0c56c
00c0c548	cmp w8,#0x22
00c0c54c	b.ne 0x00c0c598
00c0c550	mov w8,#0x4
00c0c554	mov x0,#-0x1
00c0c558	b 0x00c0c574
00c0c55c	ldr x8,[sp, #0x8]
00c0c560	str w25,[x23]
00c0c564	cmp x8,x20
00c0c568	b.eq 0x00c0c598
00c0c56c	mov x0,xzr
00c0c570	mov w8,#0x4
00c0c574	str w8,[x19]
00c0c578	ldp x20,x19,[sp, #0x50]
00c0c57c	ldp x22,x21,[sp, #0x40]
00c0c580	ldp x24,x23,[sp, #0x30]
00c0c584	ldp x26,x25,[sp, #0x20]
00c0c588	ldp x29,x30,[sp, #0x10]
00c0c58c	add sp,sp,#0x60
00c0c590	autiasp
00c0c594	ret
00c0c598	cmp w24,#0x2d
00c0c59c	cneg x0,x0,eq
00c0c5a0	b 0x00c0c578
00c0c5a4	adrp x0,0xd27000
00c0c5a8	add x0,x0,#0xf8
00c0c5ac	bl 0x00c2fe90
00c0c5b0	cbz w0,0x00c0c520
00c0c5b4	adrp x1,0x2c6000
00c0c5b8	add x1,x1,#0xbfc
00c0c5bc	mov w0,#0x1fbf
00c0c5c0	mov x2,xzr
00c0c5c4	bl 0x00c43890
00c0c5c8	str x0,[x26, #0xf0]
00c0c5cc	adrp x0,0xd27000
00c0c5d0	add x0,x0,#0xf8
00c0c5d4	bl 0x00c2fea0
00c0c5d8	b 0x00c0c520
