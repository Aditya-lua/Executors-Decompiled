; FUN_008ac230 @ 008ac230
008ac230	sub sp,sp,#0x50
008ac234	stp x29,x30,[sp, #0x20]
008ac238	str x21,[sp, #0x30]
008ac23c	stp x20,x19,[sp, #0x40]
008ac240	add x29,sp,#0x20
008ac244	mrs x20,tpidr_el0
008ac248	ldr x8,[x20, #0x28]
008ac24c	stur x8,[x29, #-0x8]
008ac250	ldr x9,[x0, #0x50]
008ac254	ldr x8,[x0, #0x68]
008ac258	ldr x10,[x9, #0x18]
008ac25c	add x11,x8,#0x10
008ac260	cmp x11,x10
008ac264	b.ls 0x008ac2e0
008ac268	ldr x11,[x0, #0x70]
008ac26c	mov w12,#0xf3f0
008ac270	movk w12,#0x1, LSL #16
008ac274	sub x11,x8,x11
008ac278	cmp x11,x12
008ac27c	b.gt 0x008ac320
008ac280	ldr x11,[x0, #0x48]
008ac284	sub x11,x11,x8
008ac288	cmp x11,#0x10
008ac28c	b.gt 0x008ac2d0
008ac290	mov w8,#0x1
008ac294	sub x2,x29,#0xc
008ac298	mov w21,w1
008ac29c	stur w8,[x29, #-0xc]
008ac2a0	nop
008ac2a4	adr x8,0x8aa604
008ac2a8	mov x1,x8
008ac2ac	mov x19,x0
008ac2b0	bl 0x008b3edc
008ac2b4	mov w8,w0
008ac2b8	mov x0,x19
008ac2bc	cbnz w8,0x008ac320
008ac2c0	ldr x9,[x0, #0x50]
008ac2c4	ldr x8,[x0, #0x68]
008ac2c8	mov w1,w21
008ac2cc	ldr x10,[x9, #0x18]
008ac2d0	add x11,x8,#0x10
008ac2d4	cmp x10,x11
008ac2d8	b.cs 0x008ac2e0
008ac2dc	str x11,[x9, #0x18]
008ac2e0	scvtf d0,w1
008ac2e4	mov w10,#0x3
008ac2e8	str w10,[x8, #0xc]
008ac2ec	str d0,[x8]
008ac2f0	ldr x9,[x0, #0x68]
008ac2f4	add x8,x9,#0x10
008ac2f8	str x8,[x0, #0x68]
008ac2fc	ldr x8,[x20, #0x28]
008ac300	ldur x9,[x29, #-0x8]
008ac304	cmp x8,x9
008ac308	b.ne 0x008ac348
008ac30c	ldp x20,x19,[sp, #0x40]
008ac310	ldr x21,[sp, #0x30]
008ac314	ldp x29,x30,[sp, #0x20]
008ac318	add sp,sp,#0x50
008ac31c	ret
008ac320	adrp x1,0x2b6000
008ac324	add x1,x1,#0xc71
008ac328	str x0,[sp, #0x8]
008ac32c	bl 0x008b9568
008ac330	ldr x8,[x20, #0x28]
008ac334	ldur x9,[x29, #-0x8]
008ac338	cmp x8,x9
008ac33c	b.ne 0x008ac348
008ac340	ldr x0,[sp, #0x8]
008ac344	bl 0x008aa5f4
008ac348	bl 0x00c2fec0
