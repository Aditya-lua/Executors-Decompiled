; FUN_0090fa10 @ 0090fa10
0090fa10	stp x20,x19,[sp, #-0x20]!
0090fa14	stp x29,x30,[sp, #0x10]
0090fa18	add x29,sp,#0x10
0090fa1c	adrp x8,0xcb4000
0090fa20	ldp x20,x19,[x0]
0090fa24	ldr x8,[x8, #0xdd8]
0090fa28	ldr x8,[x8]
0090fa2c	blr x8
0090fa30	mov x0,x19
0090fa34	blr x20
0090fa38	ldp x29,x30,[sp, #0x10]
0090fa3c	mov x0,xzr
0090fa40	ldp x20,x19,[sp], #0x20
0090fa44	ret
