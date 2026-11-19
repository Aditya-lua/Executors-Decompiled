; FUN_0089c4e4 @ 0089c4e4
0089c4e4	stp x29,x30,[sp, #-0x20]!
0089c4e8	str x19,[sp, #0x10]
0089c4ec	mov x29,sp
0089c4f0	mov x19,x0
0089c4f4	ldr x0,[x0, #0x10]
0089c4f8	adrp x8,0xc4b000
0089c4fc	add x8,x8,#0xbd8
0089c500	str x8,[x19]
0089c504	cbz x0,0x0089c534
0089c508	bl 0x00c301d0
0089c50c	ldr x0,[x19, #0x28]
0089c510	str xzr,[x19, #0x10]
0089c514	bl 0x00c301d0
0089c518	mov x0,xzr
0089c51c	stp xzr,xzr,[x19, #0x18]
0089c520	str xzr,[x19, #0x28]
0089c524	bl 0x00c301d0
0089c528	mov w8,#0x40
0089c52c	str xzr,[x19, #0x30]
0089c530	strb w8,[x19, #0x40]
0089c534	ldr x0,[x19, #0x28]
0089c538	bl 0x00c301d0
0089c53c	mov x0,x19
0089c540	mov w1,#0x48
0089c544	ldr x19,[sp, #0x10]
0089c548	ldp x29,x30,[sp], #0x20
0089c54c	b 0x00c2fe80
