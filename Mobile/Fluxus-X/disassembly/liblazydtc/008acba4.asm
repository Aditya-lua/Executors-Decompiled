; FUN_008acba4 @ 008acba4
008acba4	sub sp,sp,#0x50
008acba8	stp x29,x30,[sp, #0x20]
008acbac	stp x22,x21,[sp, #0x30]
008acbb0	stp x20,x19,[sp, #0x40]
008acbb4	add x29,sp,#0x20
008acbb8	mrs x22,tpidr_el0
008acbbc	mov x20,x2
008acbc0	mov x19,x0
008acbc4	ldr x8,[x22, #0x28]
008acbc8	mov w21,w1
008acbcc	stur x8,[x29, #-0x8]
008acbd0	ldrb w8,[x0, #0x2]
008acbd4	tbz w8,#0x2,0x008acbe8
008acbd8	add x2,x19,#0x38
008acbdc	mov x0,x19
008acbe0	mov x1,x19
008acbe4	bl 0x008b63a4
008acbe8	ldr x9,[x19, #0x50]
008acbec	ldr x8,[x19, #0x68]
008acbf0	ldr x10,[x9, #0x18]
008acbf4	add x11,x8,#0x10
008acbf8	cmp x11,x10
008acbfc	b.ls 0x008acc64
008acc00	ldr x11,[x19, #0x70]
008acc04	mov w12,#0xf3f0
008acc08	movk w12,#0x1, LSL #16
008acc0c	sub x11,x8,x11
008acc10	cmp x11,x12
008acc14	b.gt 0x008acd34
008acc18	ldr x11,[x19, #0x48]
008acc1c	sub x11,x11,x8
008acc20	cmp x11,#0x10
008acc24	b.gt 0x008acc54
008acc28	mov w8,#0x1
008acc2c	nop
008acc30	adr x1,0x8aa604
008acc34	add x2,sp,#0x8
008acc38	mov x0,x19
008acc3c	str w8,[sp, #0x8]
008acc40	bl 0x008b3edc
008acc44	cbnz w0,0x008acd34
008acc48	ldr x9,[x19, #0x50]
008acc4c	ldr x8,[x19, #0x68]
008acc50	ldr x10,[x9, #0x18]
008acc54	add x11,x8,#0x10
008acc58	cmp x10,x11
008acc5c	b.cs 0x008acc64
008acc60	str x11,[x9, #0x18]
008acc64	cmp w21,#0x1
008acc68	b.lt 0x008acca4
008acc6c	ldr x9,[x19, #0x70]
008acc70	add x9,x9,w21, UXTW  #0x4
008acc74	sub x21,x9,#0x10
008acc78	cmp x21,x8
008acc7c	b.cc 0x008accc8
008acc80	adrp x8,0xd1f000
008acc84	add x8,x8,#0x1e0
008acc88	adrp x21,0xd1f000
008acc8c	ldarb w8,[x8]
008acc90	tbz w8,#0x0,0x008acd5c
008acc94	ldr x8,[x21, #0x1d8]
008acc98	add x8,x8,#0x7f2, LSL #12
008acc9c	add x21,x8,#0xef0
008acca0	b 0x008accc8
008acca4	mov w9,#0xffffd8f1
008acca8	cmp w21,w9
008accac	b.lt 0x008accb8
008accb0	add x21,x8,w21, SXTW  #0x4
008accb4	b 0x008accc8
008accb8	mov x0,x19
008accbc	mov w1,w21
008accc0	bl 0x008aea7c
008accc4	mov x21,x0
008accc8	mov x0,x20
008acccc	bl 0x00c2ff50
008accd0	mov x2,x0
008accd4	mov x0,x19
008accd8	mov x1,x20
008accdc	bl 0x008b9ff8
008acce0	ldr x3,[x19, #0x68]
008acce4	mov w8,#0x5
008acce8	str x0,[sp, #0x8]
008accec	add x2,sp,#0x8
008accf0	mov x0,x19
008accf4	mov x1,x21
008accf8	str w8,[sp, #0x14]
008accfc	bl 0x008cadd4
008acd00	ldr x8,[x19, #0x68]
008acd04	add x9,x8,#0x10
008acd08	str x9,[x19, #0x68]
008acd0c	ldr w0,[x8, #0xc]
008acd10	ldr x8,[x22, #0x28]
008acd14	ldur x9,[x29, #-0x8]
008acd18	cmp x8,x9
008acd1c	b.ne 0x008acdb4
008acd20	ldp x20,x19,[sp, #0x40]
008acd24	ldp x22,x21,[sp, #0x30]
008acd28	ldp x29,x30,[sp, #0x20]
008acd2c	add sp,sp,#0x50
008acd30	ret
008acd34	adrp x1,0x2b6000
008acd38	add x1,x1,#0xc71
008acd3c	mov x0,x19
008acd40	bl 0x008b9568
008acd44	ldr x8,[x22, #0x28]
008acd48	ldur x9,[x29, #-0x8]
008acd4c	cmp x8,x9
008acd50	b.ne 0x008acdb4
008acd54	mov x0,x19
008acd58	bl 0x008aa5f4
008acd5c	adrp x0,0xd1f000
008acd60	add x0,x0,#0x1e0
008acd64	bl 0x00c2fe90
008acd68	cbz w0,0x008acc94
008acd6c	adrp x8,0xcca000
008acd70	ldr x0,[x8, #0x8c8]
008acd74	bl 0x007fe1ec
008acd78	str x0,[x21, #0x1d8]
008acd7c	adrp x0,0xd1f000
008acd80	add x0,x0,#0x1e0
008acd84	bl 0x00c2fea0
008acd88	b 0x008acc94
008acdb4	bl 0x00c2fec0
