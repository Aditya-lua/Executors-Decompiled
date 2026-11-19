; FUN_008dfafc @ 008dfafc
008dfafc	sub sp,sp,#0x90
008dfb00	stp x29,x30,[sp, #0x30]
008dfb04	str x27,[sp, #0x40]
008dfb08	stp x26,x25,[sp, #0x50]
008dfb0c	stp x24,x23,[sp, #0x60]
008dfb10	stp x22,x21,[sp, #0x70]
008dfb14	stp x20,x19,[sp, #0x80]
008dfb18	add x29,sp,#0x30
008dfb1c	mrs x23,tpidr_el0
008dfb20	lsr x9,x2,#0x20
008dfb24	ldr x8,[x23, #0x28]
008dfb28	stur x8,[x29, #-0x8]
008dfb2c	cbnz x9,0x008dfc98
008dfb30	ldr x22,[x0, #0x878]
008dfb34	ldr x8,[x0, #0x870]
008dfb38	mov x19,x2
008dfb3c	mov x20,x1
008dfb40	mov x21,x0
008dfb44	stp xzr,xzr,[sp, #0x18]
008dfb48	cmp x22,x8
008dfb4c	b.eq 0x008dfc04
008dfb50	sub x24,x22,#0x610
008dfb54	mov x25,#-0x1408
008dfb58	ldp x1,x2,[sp, #0x18]
008dfb5c	mov x0,x21
008dfb60	add x22,x22,x25
008dfb64	bl 0x008df008
008dfb68	mov x2,x0
008dfb6c	mov x3,x1
008dfb70	mov x0,x20
008dfb74	mov x1,x19
008dfb78	bl 0x008dd964
008dfb7c	mov x2,x0
008dfb80	mov x3,x1
008dfb84	mov x0,x22
008dfb88	mov x1,x2
008dfb8c	mov x2,x3
008dfb90	bl 0x008dd9cc
008dfb94	mov x26,x24
008dfb98	mov w27,#0x60
008dfb9c	stp x0,x1,[sp, #0x8]
008dfba0	b 0x008dfbb0
008dfba4	sub x27,x27,#0x1
008dfba8	sub x26,x26,#0x10
008dfbac	cbz x27,0x008dfbe0
008dfbb0	sub w1,w27,#0x1
008dfbb4	add x0,sp,#0x8
008dfbb8	bl 0x008dd8dc
008dfbbc	tbz w0,#0x0,0x008dfba4
008dfbc0	ldp x1,x2,[x26]
008dfbc4	add x0,sp,#0x8
008dfbc8	bl 0x008dd950
008dfbcc	ldr x1,[x26, #0x600]
008dfbd0	ldr x2,[x26, #0x608]
008dfbd4	add x0,sp,#0x18
008dfbd8	bl 0x008dd950
008dfbdc	b 0x008dfba4
008dfbe0	add x0,sp,#0x8
008dfbe4	bl 0x008dd93c
008dfbe8	tbz w0,#0x0,0x008dfc58
008dfbec	ldr x8,[x21, #0x870]
008dfbf0	add x24,x24,x25
008dfbf4	cmp x22,x8
008dfbf8	b.ne 0x008dfb58
008dfbfc	ldp x1,x2,[sp, #0x18]
008dfc00	b 0x008dfc0c
008dfc04	mov x2,xzr
008dfc08	mov x1,xzr
008dfc0c	mov x0,x21
008dfc10	bl 0x008decbc
008dfc14	cmp x0,x20
008dfc18	b.ne 0x008dfcd8
008dfc1c	cmp x1,x19
008dfc20	b.ne 0x008dfcd8
008dfc24	ldp x0,x1,[sp, #0x18]
008dfc28	ldr x8,[x23, #0x28]
008dfc2c	ldur x9,[x29, #-0x8]
008dfc30	cmp x8,x9
008dfc34	b.ne 0x008dfd20
008dfc38	ldp x20,x19,[sp, #0x80]
008dfc3c	ldr x27,[sp, #0x40]
008dfc40	ldp x22,x21,[sp, #0x70]
008dfc44	ldp x24,x23,[sp, #0x60]
008dfc48	ldp x26,x25,[sp, #0x50]
008dfc4c	ldp x29,x30,[sp, #0x30]
008dfc50	add sp,sp,#0x90
008dfc54	ret
008dfc58	mov w0,#0x10
008dfc5c	bl 0x00c30000
008dfc60	mov x20,x0
008dfc64	adrp x1,0x2a9000
008dfc68	add x1,x1,#0x438
008dfc6c	bl 0x00c30a80
008dfc70	ldr x8,[x23, #0x28]
008dfc74	ldur x9,[x29, #-0x8]
008dfc78	cmp x8,x9
008dfc7c	b.ne 0x008dfd20
008dfc80	adrp x1,0xcb4000
008dfc84	adrp x2,0xcb4000
008dfc88	mov x0,x20
008dfc8c	ldr x1,[x1, #0xc20]
008dfc90	ldr x2,[x2, #0xc28]
008dfc94	bl 0x00c30020
008dfc98	mov w0,#0x10
008dfc9c	bl 0x00c30000
008dfca0	mov x20,x0
008dfca4	adrp x1,0x2c2000
008dfca8	add x1,x1,#0xeab
008dfcac	bl 0x008de29c
008dfcb0	ldr x8,[x23, #0x28]
008dfcb4	ldur x9,[x29, #-0x8]
008dfcb8	cmp x8,x9
008dfcbc	b.ne 0x008dfd20
008dfcc0	adrp x1,0xcb4000
008dfcc4	adrp x2,0xcb4000
008dfcc8	mov x0,x20
008dfccc	ldr x1,[x1, #0xc10]
008dfcd0	ldr x2,[x2, #0xc18]
008dfcd4	bl 0x00c30020
008dfcd8	mov w0,#0x10
008dfcdc	bl 0x00c30000
008dfce0	mov x20,x0
008dfce4	adrp x1,0x2cc000
008dfce8	add x1,x1,#0xc5c
008dfcec	bl 0x00c30a80
008dfcf0	b 0x008dfc70
008dfd20	bl 0x00c2fec0
