; FUN_0083c480 @ 0083c480
0083c480	sub sp,sp,#0x50
0083c484	stp x29,x30,[sp, #0x20]
0083c488	str x21,[sp, #0x30]
0083c48c	stp x20,x19,[sp, #0x40]
0083c490	add x29,sp,#0x20
0083c494	mrs x20,tpidr_el0
0083c498	mov x19,x1
0083c49c	sub x2,x29,#0xc
0083c4a0	ldr x8,[x20, #0x28]
0083c4a4	mov w1,#0x2
0083c4a8	stur x8,[x29, #-0x8]
0083c4ac	bl 0x008aba9c
0083c4b0	adrp x8,0xcca000
0083c4b4	add x8,x8,#0xb88
0083c4b8	ldarb w9,[x8]
0083c4bc	adrp x8,0xcca000
0083c4c0	tbz w9,#0x0,0x0083c53c
0083c4c4	ldr x8,[x8, #0xb80]
0083c4c8	ldursw x9,[x29, #-0xc]
0083c4cc	add x8,x8,x9, LSL #0x3
0083c4d0	mov w9,#0x52e0
0083c4d4	movk w9,#0x6d7, LSL #16
0083c4d8	ldr x8,[x8, x9#0x0]
0083c4dc	str x8,[sp, #0x8]
0083c4e0	cbz x8,0x0083c510
0083c4e4	adrp x8,0xd1b000
0083c4e8	ldr x9,[x19, #0x18]
0083c4ec	add x1,sp,#0x8
0083c4f0	ldr x8,[x8, #0x390]
0083c4f4	add x0,x9,#0x1d8
0083c4f8	blr x8
0083c4fc	cbz x0,0x0083c514
0083c500	ldr x0,[x0]
0083c504	ldrb w8,[x0, #0xa9]!
0083c508	ubfx x1,x8,#0x4,#0x1
0083c50c	b 0x0083c518
0083c510	mov x0,xzr
0083c514	mov x1,xzr
0083c518	ldr x8,[x20, #0x28]
0083c51c	ldur x9,[x29, #-0x8]
0083c520	cmp x8,x9
0083c524	b.ne 0x0083c5a0
0083c528	ldp x20,x19,[sp, #0x40]
0083c52c	ldr x21,[sp, #0x30]
0083c530	ldp x29,x30,[sp, #0x20]
0083c534	add sp,sp,#0x50
0083c538	ret
0083c53c	adrp x0,0xcca000
0083c540	add x0,x0,#0xb88
0083c544	bl 0x00c2fe90
0083c548	adrp x8,0xcca000
0083c54c	cbz w0,0x0083c4c4
0083c550	adrp x8,0xcca000
0083c554	ldr x0,[x8, #0x8c8]
0083c558	bl 0x007fe1ec
0083c55c	adrp x21,0xcca000
0083c560	str x0,[x21, #0xb80]
0083c564	adrp x0,0xcca000
0083c568	add x0,x0,#0xb88
0083c56c	bl 0x00c2fea0
0083c570	mov x8,x21
0083c574	b 0x0083c4c4
0083c5a0	bl 0x00c2fec0
