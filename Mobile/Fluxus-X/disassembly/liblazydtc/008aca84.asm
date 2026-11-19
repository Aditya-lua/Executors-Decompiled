; FUN_008aca84 @ 008aca84
008aca84	sub sp,sp,#0x50
008aca88	stp x29,x30,[sp, #0x20]
008aca8c	stp x22,x21,[sp, #0x30]
008aca90	stp x20,x19,[sp, #0x40]
008aca94	add x29,sp,#0x20
008aca98	mrs x20,tpidr_el0
008aca9c	ldr x8,[x20, #0x28]
008acaa0	stur x8,[x29, #-0x8]
008acaa4	ldr x9,[x0, #0x50]
008acaa8	ldr x8,[x0, #0x68]
008acaac	ldr x10,[x9, #0x18]
008acab0	add x11,x8,#0x10
008acab4	cmp x11,x10
008acab8	b.ls 0x008acb3c
008acabc	ldr x11,[x0, #0x70]
008acac0	mov w12,#0xf3f0
008acac4	movk w12,#0x1, LSL #16
008acac8	sub x11,x8,x11
008acacc	cmp x11,x12
008acad0	b.gt 0x008acb78
008acad4	ldr x11,[x0, #0x48]
008acad8	sub x11,x11,x8
008acadc	cmp x11,#0x10
008acae0	b.gt 0x008acb2c
008acae4	mov w8,#0x1
008acae8	mov w21,w2
008acaec	sub x2,x29,#0xc
008acaf0	stur w8,[x29, #-0xc]
008acaf4	nop
008acaf8	adr x8,0x8aa604
008acafc	mov x22,x1
008acb00	mov x1,x8
008acb04	mov x19,x0
008acb08	bl 0x008b3edc
008acb0c	mov w8,w0
008acb10	mov x0,x19
008acb14	cbnz w8,0x008acb78
008acb18	ldr x9,[x0, #0x50]
008acb1c	ldr x8,[x0, #0x68]
008acb20	mov x1,x22
008acb24	mov w2,w21
008acb28	ldr x10,[x9, #0x18]
008acb2c	add x11,x8,#0x10
008acb30	cmp x10,x11
008acb34	b.cs 0x008acb3c
008acb38	str x11,[x9, #0x18]
008acb3c	str x1,[x8]
008acb40	mov w10,#0x2
008acb44	ldr x9,[x0, #0x68]
008acb48	stp w2,w10,[x8, #0x8]
008acb4c	add x8,x9,#0x10
008acb50	str x8,[x0, #0x68]
008acb54	ldr x8,[x20, #0x28]
008acb58	ldur x9,[x29, #-0x8]
008acb5c	cmp x8,x9
008acb60	b.ne 0x008acba0
008acb64	ldp x20,x19,[sp, #0x40]
008acb68	ldp x22,x21,[sp, #0x30]
008acb6c	ldp x29,x30,[sp, #0x20]
008acb70	add sp,sp,#0x50
008acb74	ret
008acb78	adrp x1,0x2b6000
008acb7c	add x1,x1,#0xc71
008acb80	str x0,[sp, #0x8]
008acb84	bl 0x008b9568
008acb88	ldr x8,[x20, #0x28]
008acb8c	ldur x9,[x29, #-0x8]
008acb90	cmp x8,x9
008acb94	b.ne 0x008acba0
008acb98	ldr x0,[sp, #0x8]
008acb9c	bl 0x008aa5f4
008acba0	bl 0x00c2fec0
