; FUN_0090fe90 @ 0090fe90
0090fe90	str x21,[sp, #-0x30]!
0090fe94	stp x20,x19,[sp, #0x10]
0090fe98	stp x29,x30,[sp, #0x20]
0090fe9c	add x29,sp,#0x20
0090fea0	ldr x21,[x0, #0xc38]
0090fea4	mov x19,x0
0090fea8	mov x20,x1
0090feac	tbz w2,#0x0,0x0090fef4
0090feb0	ldr x8,[x19, #0xd0]
0090feb4	cbz x8,0x0090fec8
0090feb8	mov w1,#0x5
0090febc	mov w2,#0x2
0090fec0	mov x0,x19
0090fec4	bl 0x0093f628
0090fec8	mov x0,x21
0090fecc	mov x1,x20
0090fed0	bl 0x0090ff1c
0090fed4	ldr x8,[x19, #0xd0]
0090fed8	cbz x8,0x0090ff0c
0090fedc	mov x0,x19
0090fee0	ldp x29,x30,[sp, #0x20]
0090fee4	ldp x20,x19,[sp, #0x10]
0090fee8	mov w1,#0x5
0090feec	ldr x21,[sp], #0x30
0090fef0	b 0x0093f680
0090fef4	mov x1,x20
0090fef8	ldp x29,x30,[sp, #0x20]
0090fefc	ldp x20,x19,[sp, #0x10]
0090ff00	mov x0,x21
0090ff04	ldr x21,[sp], #0x30
0090ff08	b 0x0090ff1c
0090ff0c	ldp x29,x30,[sp, #0x20]
0090ff10	ldp x20,x19,[sp, #0x10]
0090ff14	ldr x21,[sp], #0x30
0090ff18	ret
