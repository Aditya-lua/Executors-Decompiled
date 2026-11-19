; FUN_0085cb14 @ 0085cb14
0085cb14	sub sp,sp,#0xb0
0085cb18	stp x29,x30,[sp, #0x50]
0085cb1c	stp x28,x27,[sp, #0x60]
0085cb20	stp x26,x25,[sp, #0x70]
0085cb24	stp x24,x23,[sp, #0x80]
0085cb28	stp x22,x21,[sp, #0x90]
0085cb2c	stp x20,x19,[sp, #0xa0]
0085cb30	add x29,sp,#0x50
0085cb34	mrs x26,tpidr_el0
0085cb38	mov x20,x0
0085cb3c	mov x19,x0
0085cb40	ldr x8,[x26, #0x28]
0085cb44	mov w22,w1
0085cb48	stur x8,[x29, #-0x8]
0085cb4c	ldr x21,[x20, #0x94]!
0085cb50	bl 0x0086b498
0085cb54	ldr w8,[x19, #0x124]
0085cb58	mov x23,x0
0085cb5c	add x28,sp,#0x10
0085cb60	adrp x27,0xd1e000
0085cb64	str w8,[sp, #0xc]
0085cb68	b 0x0085cb98
0085cb6c	mov x0,x19
0085cb70	mov x1,x23
0085cb74	mov w2,wzr
0085cb78	bl 0x0086bcac
0085cb7c	mov x23,x0
0085cb80	ldr w8,[x19, #0x124]
0085cb84	ldr w9,[x27, #0xba0]
0085cb88	add w8,w8,#0x1
0085cb8c	cmp w8,w9
0085cb90	str w8,[x19, #0x124]
0085cb94	b.hi 0x0085cd94
0085cb98	ldr w8,[x19, #0x90]
0085cb9c	cmp w8,#0x5a
0085cba0	b.gt 0x0085cbd0
0085cba4	cmp w8,#0x28
0085cba8	b.eq 0x0085cc20
0085cbac	cmp w8,#0x2e
0085cbb0	b.eq 0x0085cc38
0085cbb4	cmp w8,#0x3a
0085cbb8	b.ne 0x0085cbec
0085cbbc	mov x0,x19
0085cbc0	mov x1,x21
0085cbc4	mov x2,x23
0085cbc8	bl 0x0086b9c0
0085cbcc	b 0x0085cb7c
0085cbd0	sub w9,w8,#0x116
0085cbd4	cmp w9,#0x2
0085cbd8	b.cc 0x0085cb6c
0085cbdc	cmp w8,#0x5b
0085cbe0	b.eq 0x0085cc70
0085cbe4	cmp w8,#0x7b
0085cbe8	b.eq 0x0085cb6c
0085cbec	cmp w8,#0x3c
0085cbf0	b.ne 0x0085cd58
0085cbf4	add x8,sp,#0x10
0085cbf8	add x0,x19,#0x70
0085cbfc	bl 0x00853d20
0085cc00	ldr w8,[sp, #0x10]
0085cc04	cmp w8,#0x3c
0085cc08	b.ne 0x0085cd58
0085cc0c	mov x0,x19
0085cc10	mov x1,x21
0085cc14	mov x2,x23
0085cc18	bl 0x0086c2c8
0085cc1c	b 0x0085cb7c
0085cc20	tbnz w22,#0x0,0x0085cb6c
0085cc24	ldr w8,[x23, #0x14]
0085cc28	ldr w9,[x20]
0085cc2c	cmp w8,w9
0085cc30	b.eq 0x0085cb6c
0085cc34	b 0x0085cd50
0085cc38	ldur x8,[x19, #0x94]
0085cc3c	mov x0,x19
0085cc40	stur x8,[x29, #-0x10]
0085cc44	bl 0x00858f2c
0085cc48	ldr w8,[x19, #0x90]
0085cc4c	cmp w8,#0x119
0085cc50	b.ne 0x0085cc84
0085cc54	ldr q0,[x20]
0085cc58	ldr x24,[x19, #0xa8]
0085cc5c	mov x0,x19
0085cc60	stur q0,[x28, #0x8]
0085cc64	bl 0x00858f2c
0085cc68	str x24,[sp, #0x10]
0085cc6c	b 0x0085ccdc
0085cc70	mov x0,x19
0085cc74	mov x1,x21
0085cc78	mov x2,x23
0085cc7c	bl 0x0086b888
0085cc80	b 0x0085cb7c
0085cc84	mov x0,x19
0085cc88	mov x1,xzr
0085cc8c	bl 0x0086e040
0085cc90	ldr w8,[x19, #0x90]
0085cc94	sub w8,w8,#0x123
0085cc98	cmp w8,#0x14
0085cc9c	b.hi 0x0085cccc
0085cca0	ldr w8,[x20]
0085cca4	ldur w9,[x29, #-0x10]
0085cca8	cmp w8,w9
0085ccac	b.ne 0x0085cccc
0085ccb0	ldr x8,[x19, #0xa8]
0085ccb4	ldr q0,[x20]
0085ccb8	mov x0,x19
0085ccbc	str x8,[sp, #0x10]
0085ccc0	stur q0,[x28, #0x8]
0085ccc4	bl 0x00858f2c
0085ccc8	b 0x0085ccdc
0085cccc	ldr x8,[x19, #0x138]
0085ccd0	ldur x9,[x19, #0x94]
0085ccd4	stp x8,x9,[sp, #0x10]
0085ccd8	str x9,[sp, #0x20]
0085ccdc	ldrb w8,[x19, #0x178]
0085cce0	ldr x9,[sp, #0x20]
0085cce4	ldr x0,[x19, #0xe8]
0085cce8	cmp w8,#0x1
0085ccec	stp x21,x9,[x29, #-0x20]
0085ccf0	b.ne 0x0085cd18
0085ccf4	ldr x8,[sp, #0x10]
0085ccf8	cbz x8,0x0085cd18
0085ccfc	ldrb w9,[x8]
0085cd00	cmp w9,#0x5f
0085cd04	b.ne 0x0085cd18
0085cd08	ldrb w8,[x8, #0x1]
0085cd0c	cmp w8,#0x5f
0085cd10	cset w24,ne
0085cd14	b 0x0085cd1c
0085cd18	mov w24,wzr
0085cd1c	mov w1,#0x50
0085cd20	bl 0x0084e938
0085cd24	sub x1,x29,#0x20
0085cd28	add x3,sp,#0x10
0085cd2c	add x4,x28,#0x8
0085cd30	sub x5,x29,#0x10
0085cd34	mov x2,x23
0085cd38	mov w6,#0x2e
0085cd3c	mov w7,w24
0085cd40	mov x25,x0
0085cd44	bl 0x0084eea4
0085cd48	mov x23,x25
0085cd4c	b 0x0085cb80
0085cd50	mov x0,x19
0085cd54	bl 0x0086bc9c
0085cd58	ldr w8,[sp, #0xc]
0085cd5c	str w8,[x19, #0x124]
0085cd60	ldr x8,[x26, #0x28]
0085cd64	ldur x9,[x29, #-0x8]
0085cd68	cmp x8,x9
0085cd6c	b.ne 0x0085cdbc
0085cd70	mov x0,x23
0085cd74	ldp x20,x19,[sp, #0xa0]
0085cd78	ldp x22,x21,[sp, #0x90]
0085cd7c	ldp x24,x23,[sp, #0x80]
0085cd80	ldp x26,x25,[sp, #0x70]
0085cd84	ldp x28,x27,[sp, #0x60]
0085cd88	ldp x29,x30,[sp, #0x50]
0085cd8c	add sp,sp,#0xb0
0085cd90	ret
0085cd94	ldr x8,[x26, #0x28]
0085cd98	ldur x9,[x29, #-0x8]
0085cd9c	cmp x8,x9
0085cda0	b.ne 0x0085cdbc
0085cda4	adrp x1,0x2a1000
0085cda8	add x1,x1,#0x5df
0085cdac	adrp x2,0x2d4000
0085cdb0	add x2,x2,#0xdc3
0085cdb4	mov x0,x20
0085cdb8	bl 0x008578f8
0085cdbc	bl 0x00c2fec0
