; FUN_0081ed5c @ 0081ed5c
0081ed5c	stp x29,x30,[sp, #-0x50]!
0081ed60	str x25,[sp, #0x10]
0081ed64	stp x24,x23,[sp, #0x20]
0081ed68	stp x22,x21,[sp, #0x30]
0081ed6c	stp x20,x19,[sp, #0x40]
0081ed70	mov x29,sp
0081ed74	adrp x24,0xcb4000
0081ed78	adrp x22,0xcb4000
0081ed7c	mov x19,x0
0081ed80	ldr x24,[x24, #0xa18]
0081ed84	ldr x22,[x22, #0x9f8]
0081ed88	str xzr,[x0, #0xa0]
0081ed8c	mov x20,x0
0081ed90	ldp x8,x9,[x22, #0x8]
0081ed94	add x25,x24,#0x40
0081ed98	str x25,[x19, #0x70]!
0081ed9c	str x8,[x0]
0081eda0	ldur x8,[x8, #-0x18]
0081eda4	str x9,[x0, x8#0x0]
0081eda8	ldr x8,[x0]
0081edac	ldur x8,[x8, #-0x18]
0081edb0	add x21,x0,x8
0081edb4	add x1,x0,#0x8
0081edb8	mov x0,x21
0081edbc	bl 0x00c30100
0081edc0	str xzr,[x21, #0x88]
0081edc4	adrp x23,0xcb4000
0081edc8	mov w8,#0xffffffff
0081edcc	ldr x23,[x23, #0xa08]
0081edd0	str w8,[x21, #0x90]
0081edd4	add x8,x24,#0x18
0081edd8	add x0,x20,#0x10
0081eddc	str x25,[x20, #0x70]
0081ede0	add x9,x23,#0x10
0081ede4	stp x8,x9,[x20]
0081ede8	bl 0x00c30480
0081edec	adrp x8,0xcb4000
0081edf0	movi v0.2D,#0x0
0081edf4	mov x21,x20
0081edf8	ldr x8,[x8, #0xa00]
0081edfc	add x8,x8,#0x10
0081ee00	str x8,[x20, #0x8]
0081ee04	mov w8,#0x10
0081ee08	str q0,[x21, #0x48]!
0081ee0c	stp q0,q0,[x21, #-0x20]
0081ee10	stur q0,[x21, #-0x30]
0081ee14	str q0,[x21, #0x10]
0081ee18	str w8,[x21, #0x20]
0081ee1c	add x0,x20,#0x8
0081ee20	bl 0x0081f034
0081ee24	ldp x20,x19,[sp, #0x40]
0081ee28	ldr x25,[sp, #0x10]
0081ee2c	ldp x22,x21,[sp, #0x30]
0081ee30	ldp x24,x23,[sp, #0x20]
0081ee34	ldp x29,x30,[sp], #0x50
0081ee38	ret
