; FUN_008cab38 @ 008cab38
008cab38	sub sp,sp,#0x90
008cab3c	stp x29,x30,[sp, #0x70]
008cab40	stp x20,x19,[sp, #0x80]
008cab44	add x29,sp,#0x70
008cab48	mrs x19,tpidr_el0
008cab4c	mov x7,x3
008cab50	mov x9,x2
008cab54	ldr x10,[x19, #0x28]
008cab58	mov x8,x4
008cab5c	stur x10,[x29, #-0x8]
008cab60	ldr x10,[x1, #0x70]
008cab64	ldrsw x11,[x2, #0x98]
008cab68	ldrb w3,[x1, #0x3a]
008cab6c	stp x0,xzr,[x29, #-0x28]
008cab70	ldr w10,[x10, x11, LSL #0x2]
008cab74	stp x2,xzr,[sp, #0x28]
008cab78	ldr x11,[x1]
008cab7c	ldrb w2,[x1, #0x39]
008cab80	stp xzr,x1,[sp, #0x18]
008cab84	stp x1,x10,[x29, #-0x18]
008cab88	stp xzr,xzr,[sp, #0x38]
008cab8c	sub x10,x29,#0x10
008cab90	add x4,x1,#0x3b
008cab94	sub x5,x29,#0x28
008cab98	add x6,sp,#0x18
008cab9c	mov x1,x9
008caba0	stp x11,x10,[sp, #0x8]
008caba4	str x8,[sp]
008caba8	bl 0x008c9360
008cabac	ldr x1,[sp, #0x38]
008cabb0	cbz x1,0x008cabc8
008cabb4	ldr x8,[sp, #0x40]
008cabb8	ldr x0,[sp, #0x30]
008cabbc	lsl x2,x8,#0x3
008cabc0	mov w3,wzr
008cabc4	bl 0x008b7a9c
008cabc8	ldr x8,[x19, #0x28]
008cabcc	ldur x9,[x29, #-0x8]
008cabd0	cmp x8,x9
008cabd4	b.ne 0x008cac14
008cabd8	ldp x20,x19,[sp, #0x80]
008cabdc	ldp x29,x30,[sp, #0x70]
008cabe0	add sp,sp,#0x90
008cabe4	ret
008cac14	bl 0x00c2fec0
