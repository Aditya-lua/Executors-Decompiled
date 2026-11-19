; psa_aead_finish @ 00b8cb7c
00b8cb7c	sub sp,sp,#0x70
00b8cb80	stp x28,x27,[sp, #0x10]
00b8cb84	stp x26,x25,[sp, #0x20]
00b8cb88	stp x24,x23,[sp, #0x30]
00b8cb8c	stp x22,x21,[sp, #0x40]
00b8cb90	stp x20,x19,[sp, #0x50]
00b8cb94	stp x29,x30,[sp, #0x60]
00b8cb98	add x29,sp,#0x60
00b8cb9c	mov x28,x6
00b8cba0	mov x27,x5
00b8cba4	mov x19,x4
00b8cba8	mov x26,x3
00b8cbac	mov x25,x2
00b8cbb0	mov x20,x1
00b8cbb4	mov x23,x0
00b8cbb8	cbz x2,0x00b8cc08
00b8cbbc	mov w1,#0x1
00b8cbc0	mov x0,x25
00b8cbc4	bl 0x00c30a30
00b8cbc8	mov x22,x0
00b8cbcc	mov x8,x25
00b8cbd0	cbz x0,0x00b8cc54
00b8cbd4	str x8,[sp, #0x8]
00b8cbd8	cbz x27,0x00b8cc1c
00b8cbdc	mov w1,#0x1
00b8cbe0	mov x0,x27
00b8cbe4	bl 0x00c30a30
00b8cbe8	mov x21,x0
00b8cbec	mov x24,x27
00b8cbf0	cbnz x0,0x00b8cc28
00b8cbf4	mov x24,xzr
00b8cbf8	mov x19,xzr
00b8cbfc	mov x8,xzr
00b8cc00	mov w26,#0xffffff73
00b8cc04	b 0x00b8ccd0
00b8cc08	mov x8,xzr
00b8cc0c	mov x22,xzr
00b8cc10	mov x20,xzr
00b8cc14	str x8,[sp, #0x8]
00b8cc18	cbnz x27,0x00b8cbdc
00b8cc1c	mov x24,xzr
00b8cc20	mov x21,xzr
00b8cc24	mov x19,xzr
00b8cc28	str xzr,[x26]
00b8cc2c	str x27,[x28]
00b8cc30	ldr w8,[x23]
00b8cc34	cbz w8,0x00b8cc48
00b8cc38	ldrb w9,[x23, #0x20]
00b8cc3c	tbz w9,#0x0,0x00b8cc48
00b8cc40	tbnz w9,#0x1,0x00b8cc74
00b8cc44	tbnz w9,#0x4,0x00b8cc88
00b8cc48	mov w26,#0xffffff77
00b8cc4c	cbnz x27,0x00b8ccc4
00b8cc50	b 0x00b8cce0
00b8cc54	mov x20,xzr
00b8cc58	str xzr,[sp, #0x8]
00b8cc5c	mov x24,xzr
00b8cc60	mov x21,xzr
00b8cc64	mov x19,xzr
00b8cc68	mov w26,#0xffffff73
00b8cc6c	cbnz x27,0x00b8ccc4
00b8cc70	b 0x00b8cce0
00b8cc74	ldr x10,[x23, #0x10]
00b8cc78	cbnz x10,0x00b8ccbc
00b8cc7c	ldr x10,[x23, #0x18]
00b8cc80	cbnz x10,0x00b8ccbc
00b8cc84	b 0x00b8cc44
00b8cc88	cmp w8,#0x1
00b8cc8c	b.ne 0x00b8ccbc
00b8cc90	add x0,x23,#0x28
00b8cc94	mov x1,x22
00b8cc98	mov x2,x25
00b8cc9c	mov x3,x26
00b8cca0	mov x4,x21
00b8cca4	mov x5,x27
00b8cca8	mov x6,x28
00b8ccac	bl 0x00c42e00
00b8ccb0	mov w26,w0
00b8ccb4	cbnz x27,0x00b8ccc4
00b8ccb8	b 0x00b8cce0
00b8ccbc	mov w26,#0xffffff79
00b8ccc0	cbz x27,0x00b8cce0
00b8ccc4	ldr x8,[x28]
00b8ccc8	cmp w26,#0x0
00b8cccc	csel x8,x8,xzr,eq
00b8ccd0	add x0,x21,x8
00b8ccd4	sub x2,x27,x8
00b8ccd8	mov w1,#0x21
00b8ccdc	bl 0x00c301c0
00b8cce0	ldr w8,[x23]
00b8cce4	cbz w8,0x00b8cd08
00b8cce8	cmp w8,#0x1
00b8ccec	b.ne 0x00b8ccf8
00b8ccf0	add x0,x23,#0x28
00b8ccf4	bl 0x00c42db0
00b8ccf8	mov w2,#0x1d8
00b8ccfc	mov x0,x23
00b8cd00	mov w1,wzr
00b8cd04	bl 0x00c301c0
00b8cd08	cbz x22,0x00b8cd2c
00b8cd0c	cbz x20,0x00b8cd54
00b8cd10	ldr x2,[sp, #0x8]
00b8cd14	cbz x2,0x00b8cd24
00b8cd18	mov x0,x20
00b8cd1c	mov x1,x22
00b8cd20	bl 0x00c2ffd0
00b8cd24	mov x0,x22
00b8cd28	bl 0x00c30960
00b8cd2c	cbz x21,0x00b8cd64
00b8cd30	cbz x19,0x00b8cd60
00b8cd34	cbz x24,0x00b8cd48
00b8cd38	mov x0,x19
00b8cd3c	mov x1,x21
00b8cd40	mov x2,x24
00b8cd44	bl 0x00c2ffd0
00b8cd48	mov x0,x21
00b8cd4c	bl 0x00c30960
00b8cd50	b 0x00b8cd64
00b8cd54	mov w26,#0xffffff69
00b8cd58	cbnz x21,0x00b8cd30
00b8cd5c	b 0x00b8cd64
00b8cd60	mov w26,#0xffffff69
00b8cd64	mov w0,w26
00b8cd68	ldp x29,x30,[sp, #0x60]
00b8cd6c	ldp x20,x19,[sp, #0x50]
00b8cd70	ldp x22,x21,[sp, #0x40]
00b8cd74	ldp x24,x23,[sp, #0x30]
00b8cd78	ldp x26,x25,[sp, #0x20]
00b8cd7c	ldp x28,x27,[sp, #0x10]
00b8cd80	add sp,sp,#0x70
00b8cd84	ret
