; FUN_008e51e4 @ 008e51e4
008e51e4	stp x30,x21,[sp, #-0x20]!
008e51e8	stp x20,x19,[sp, #0x10]
008e51ec	ldp w8,w9,[x0, #0x18]
008e51f0	mov x19,x0
008e51f4	mov x20,x1
008e51f8	add w21,w8,#0x1
008e51fc	cmp w21,w9
008e5200	b.ls 0x008e5230
008e5204	ldr x8,[x19]
008e5208	mov x0,x19
008e520c	mov w1,w21
008e5210	ldr x8,[x8, #0x20]
008e5214	blr x8
008e5218	cmp w21,w0
008e521c	b.ls 0x008e5228
008e5220	mov w0,wzr
008e5224	b 0x008e5240
008e5228	ldr w8,[x19, #0x18]
008e522c	add w21,w8,#0x1
008e5230	ldr x9,[x19, #0x10]
008e5234	mov w0,#0x1
008e5238	str x20,[x9, w8, UXTW #0x3]
008e523c	str w21,[x19, #0x18]
008e5240	ldp x20,x19,[sp, #0x10]
008e5244	ldp x30,x21,[sp], #0x20
008e5248	ret
