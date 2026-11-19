; FUN_008be288 @ 008be288
008be288	stp x29,x30,[sp, #-0x30]!
008be28c	stp x22,x21,[sp, #0x10]
008be290	stp x20,x19,[sp, #0x20]
008be294	mov x29,sp
008be298	mov w8,#0xffe8
008be29c	mov x21,x0
008be2a0	movk w8,#0x7fff, LSL #16
008be2a4	cmp x1,x8
008be2a8	b.cs 0x008be318
008be2ac	mov x20,x1
008be2b0	cmp x1,#0x10
008be2b4	mov w19,w2
008be2b8	add w8,w20,#0xf
008be2bc	ldrb w2,[x21, #0x4]
008be2c0	mov x0,x21
008be2c4	and x8,x8,#0xfffffff0
008be2c8	mov w3,#0x8
008be2cc	mov w4,w19
008be2d0	csel x8,x8,x1,hi
008be2d4	mov w22,#0x8
008be2d8	add x1,x8,#0x10
008be2dc	bl 0x008b78d0
008be2e0	ldr x8,[x21, #0x60]
008be2e4	ldrb w9,[x21, #0x4]
008be2e8	strb w22,[x0]
008be2ec	str w20,[x0, #0x4]
008be2f0	ldrb w8,[x8, #0x2]
008be2f4	str xzr,[x0, #0x8]
008be2f8	strb w9,[x0, #0x1]
008be2fc	and w8,w8,#0x3
008be300	strb w8,[x0, #0x2]
008be304	strb w19,[x0, #0x3]
008be308	ldp x20,x19,[sp, #0x20]
008be30c	ldp x22,x21,[sp, #0x10]
008be310	ldp x29,x30,[sp], #0x30
008be314	ret
008be318	mov x0,x21
008be31c	bl 0x008b75fc
