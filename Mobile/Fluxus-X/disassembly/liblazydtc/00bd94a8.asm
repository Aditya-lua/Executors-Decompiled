; FUN_00bd94a8 @ 00bd94a8
00bd94a8	paciasp
00bd94ac	sub sp,sp,#0x40
00bd94b0	stp x29,x30,[sp, #0x10]
00bd94b4	stp x22,x21,[sp, #0x20]
00bd94b8	stp x20,x19,[sp, #0x30]
00bd94bc	add x29,sp,#0x10
00bd94c0	adrp x8,0xcb4000
00bd94c4	mov x20,x2
00bd94c8	mov x21,x1
00bd94cc	ldr x8,[x8, #0xa08]
00bd94d0	mov x19,x0
00bd94d4	add x22,x8,#0x10
00bd94d8	str x22,[x0], #0x8
00bd94dc	bl 0x00c30480
00bd94e0	movi v0.2D,#0x0
00bd94e4	adrp x8,0xcad000
00bd94e8	add x8,x8,#0x368
00bd94ec	add x0,sp,#0x8
00bd94f0	add x1,x19,#0x8
00bd94f4	str x8,[x19]
00bd94f8	str x21,[x19, #0x40]
00bd94fc	stp q0,q0,[x19, #0x20]
00bd9500	str q0,[x19, #0x10]
00bd9504	bl 0x00c30660
00bd9508	adrp x1,0xcb4000
00bd950c	add x0,sp,#0x8
00bd9510	ldr x1,[x1, #0xf70]
00bd9514	bl 0x00c30080
00bd9518	mov x21,x0
00bd951c	add x0,sp,#0x8
00bd9520	bl 0x00c30090
00bd9524	ldr x8,[x21]
00bd9528	stp x21,x20,[x19, #0x48]
00bd952c	mov x0,x21
00bd9530	ldr x8,[x8, #0x38]
00bd9534	blr x8
00bd9538	and w8,w0,#0x1
00bd953c	strb w8,[x19, #0x58]
00bd9540	ldp x20,x19,[sp, #0x30]
00bd9544	ldp x22,x21,[sp, #0x20]
00bd9548	ldp x29,x30,[sp, #0x10]
00bd954c	add sp,sp,#0x40
00bd9550	autiasp
00bd9554	ret
