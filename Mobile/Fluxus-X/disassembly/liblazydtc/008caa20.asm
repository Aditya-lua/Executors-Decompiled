; FUN_008caa20 @ 008caa20
008caa20	sub sp,sp,#0x60
008caa24	stp x29,x30,[sp, #0x20]
008caa28	stp x24,x23,[sp, #0x30]
008caa2c	stp x22,x21,[sp, #0x40]
008caa30	stp x20,x19,[sp, #0x50]
008caa34	add x29,sp,#0x20
008caa38	mrs x22,tpidr_el0
008caa3c	mov x19,x0
008caa40	mov x21,x1
008caa44	ldr x8,[x22, #0x28]
008caa48	stur x8,[x29, #-0x8]
008caa4c	ldr x8,[x0, #0x48]
008caa50	ldr x20,[x0, #0x68]
008caa54	sub x8,x8,x20
008caa58	cmp x8,#0x10
008caa5c	b.gt 0x008caa70
008caa60	mov x0,x19
008caa64	mov w1,#0x1
008caa68	bl 0x008b41e4
008caa6c	ldr x20,[x19, #0x68]
008caa70	ldr w23,[x21, #0x10]
008caa74	ldp x9,x21,[x21]
008caa78	add x8,x20,#0x10
008caa7c	ldr x24,[x19, #0x58]
008caa80	add x1,sp,#0x8
008caa84	ubfx x10,x23,#0x14,#0xa
008caa88	str x8,[x19, #0x68]
008caa8c	mov w8,#0x6
008caa90	mov x0,x19
008caa94	mov x3,x20
008caa98	str wzr,[x20, #0xc]
008caa9c	add x2,x21,x10, LSL #0x4
008caaa0	str x9,[sp, #0x8]
008caaa4	str w8,[sp, #0x14]
008caaa8	bl 0x008cadd4
008caaac	tbnz w23,#0x1f,0x008caad8
008caab0	ldr x8,[x22, #0x28]
008caab4	ldur x9,[x29, #-0x8]
008caab8	cmp x8,x9
008caabc	b.ne 0x008cab34
008caac0	ldp x20,x19,[sp, #0x50]
008caac4	ldp x22,x21,[sp, #0x40]
008caac8	ldp x24,x23,[sp, #0x30]
008caacc	ldp x29,x30,[sp, #0x20]
008caad0	add sp,sp,#0x60
008caad4	ret
008caad8	ldr x8,[x19, #0x58]
008caadc	sub x20,x20,x24
008caae0	add x1,x8,x20
008caae4	ldr w8,[x1, #0xc]
008caae8	cbz w8,0x008caab0
008caaec	ubfx x8,x23,#0xa,#0xa
008caaf0	mov x0,x19
008caaf4	mov x3,x1
008caaf8	add x2,x21,x8, LSL #0x4
008caafc	bl 0x008cadd4
008cab00	lsr w8,w23,#0x1e
008cab04	cmp w8,#0x3
008cab08	b.cc 0x008caab0
008cab0c	ldr x8,[x19, #0x58]
008cab10	add x1,x8,x20
008cab14	ldr w8,[x1, #0xc]
008cab18	cbz w8,0x008caab0
008cab1c	and x8,x23,#0x3ff
008cab20	mov x0,x19
008cab24	mov x3,x1
008cab28	add x2,x21,x8, LSL #0x4
008cab2c	bl 0x008cadd4
008cab30	b 0x008caab0
008cab34	bl 0x00c2fec0
