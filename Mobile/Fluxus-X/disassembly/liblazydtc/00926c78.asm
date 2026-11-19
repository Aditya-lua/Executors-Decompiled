; FUN_00926c78 @ 00926c78
00926c78	stp x22,x21,[sp, #-0x30]!
00926c7c	stp x20,x19,[sp, #0x10]
00926c80	stp x29,x30,[sp, #0x20]
00926c84	add x29,sp,#0x20
00926c88	ldr x8,[x3, #0x70]
00926c8c	ldr x9,[x3, #0x88]
00926c90	mov x20,x0
00926c94	mov x21,x3
00926c98	mov x19,x2
00926c9c	sub x0,x8,x9
00926ca0	bl 0x00963a7c
00926ca4	cbz x19,0x00926cd4
00926ca8	cmp x0,x19
00926cac	csel x19,x19,x0,hi
00926cb0	cbz x19,0x00926cd8
00926cb4	ldr x0,[x21, #0x88]
00926cb8	ldr x22,[x21, #0x18]
00926cbc	bl 0x00963a7c
00926cc0	add x1,x22,x0
00926cc4	mov x0,x20
00926cc8	mov x2,x19
00926ccc	bl 0x00c2ffd0
00926cd0	b 0x00926cd8
00926cd4	orr x19,xzr,#-0x2
00926cd8	mov x0,x19
00926cdc	ldp x29,x30,[sp, #0x20]
00926ce0	ldp x20,x19,[sp, #0x10]
00926ce4	ldp x22,x21,[sp], #0x30
00926ce8	ret
