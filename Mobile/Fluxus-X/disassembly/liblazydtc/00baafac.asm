; mbedtls_rsa_validate_crt @ 00baafac
00baafac	sub sp,sp,#0x80
00baafb0	stp x26,x25,[sp, #0x30]
00baafb4	stp x24,x23,[sp, #0x40]
00baafb8	stp x22,x21,[sp, #0x50]
00baafbc	stp x20,x19,[sp, #0x60]
00baafc0	stp x29,x30,[sp, #0x70]
00baafc4	add x29,sp,#0x70
00baafc8	mrs x26,tpidr_el0
00baafcc	ldr x8,[x26, #0x28]
00baafd0	mov x19,x0
00baafd4	add x0,sp,#0x18
00baafd8	mov x20,x5
00baafdc	mov x23,x4
00baafe0	mov x25,x3
00baafe4	mov x24,x2
00baafe8	mov x21,x1
00baafec	str x8,[sp, #0x28]
00baaff0	bl 0x00c41c00
00baaff4	add x0,sp,#0x8
00baaff8	bl 0x00c41c00
00baaffc	cbz x25,0x00bab05c
00bab000	cbz x19,0x00bab0c4
00bab004	add x0,sp,#0x18
00bab008	mov w2,#0x1
00bab00c	mov x1,x19
00bab010	bl 0x00c41d50
00bab014	mov w22,w0
00bab018	cbnz w0,0x00bab13c
00bab01c	add x0,sp,#0x8
00bab020	mov x1,x25
00bab024	mov x2,x24
00bab028	bl 0x00c41d60
00bab02c	mov w22,w0
00bab030	cbnz w0,0x00bab13c
00bab034	add x0,sp,#0x8
00bab038	add x1,sp,#0x8
00bab03c	add x2,sp,#0x18
00bab040	bl 0x00c41c60
00bab044	mov w22,w0
00bab048	cbnz w0,0x00bab13c
00bab04c	add x0,sp,#0x8
00bab050	mov x1,xzr
00bab054	bl 0x00c41b40
00bab058	cbnz w0,0x00bab0bc
00bab05c	cbz x23,0x00bab0cc
00bab060	cbz x21,0x00bab0c4
00bab064	add x0,sp,#0x18
00bab068	mov w2,#0x1
00bab06c	mov x1,x21
00bab070	bl 0x00c41d50
00bab074	mov w22,w0
00bab078	cbnz w0,0x00bab13c
00bab07c	add x0,sp,#0x8
00bab080	mov x1,x23
00bab084	mov x2,x24
00bab088	bl 0x00c41d60
00bab08c	mov w22,w0
00bab090	cbnz w0,0x00bab13c
00bab094	add x0,sp,#0x8
00bab098	add x1,sp,#0x8
00bab09c	add x2,sp,#0x18
00bab0a0	bl 0x00c41c60
00bab0a4	mov w22,w0
00bab0a8	cbnz w0,0x00bab13c
00bab0ac	add x0,sp,#0x8
00bab0b0	mov x1,xzr
00bab0b4	bl 0x00c41b40
00bab0b8	cbz w0,0x00bab0cc
00bab0bc	mov w22,#0xffffbe00
00bab0c0	b 0x00bab168
00bab0c4	mov w22,#0xffffbf80
00bab0c8	b 0x00bab168
00bab0cc	cbz x20,0x00bab164
00bab0d0	mov w22,#0xffffbf80
00bab0d4	cbz x19,0x00bab168
00bab0d8	cbz x21,0x00bab168
00bab0dc	add x0,sp,#0x18
00bab0e0	mov x1,x20
00bab0e4	mov x2,x21
00bab0e8	bl 0x00c41c80
00bab0ec	mov w22,w0
00bab0f0	cbnz w0,0x00bab13c
00bab0f4	add x0,sp,#0x18
00bab0f8	add x1,sp,#0x18
00bab0fc	mov w2,#0x1
00bab100	bl 0x00c41d50
00bab104	mov w22,w0
00bab108	cbnz w0,0x00bab13c
00bab10c	add x0,sp,#0x18
00bab110	add x1,sp,#0x18
00bab114	mov x2,x19
00bab118	bl 0x00c41c60
00bab11c	mov w22,w0
00bab120	cbnz w0,0x00bab13c
00bab124	add x0,sp,#0x18
00bab128	mov x1,xzr
00bab12c	bl 0x00c41b40
00bab130	cmp w0,#0x0
00bab134	mov w8,#0xffffbe00
00bab138	csel w22,wzr,w8,eq
00bab13c	mov w8,#0xffffbe00
00bab140	cmp w22,w8
00bab144	b.eq 0x00bab168
00bab148	mov w8,#0xffffbf80
00bab14c	cmp w22,w8
00bab150	b.eq 0x00bab168
00bab154	cbz w22,0x00bab168
00bab158	mov w8,#0xffffbe00
00bab15c	add w22,w22,w8
00bab160	b 0x00bab168
00bab164	mov w22,wzr
00bab168	add x0,sp,#0x18
00bab16c	bl 0x00c41bb0
00bab170	add x0,sp,#0x8
00bab174	bl 0x00c41bb0
00bab178	ldr x8,[x26, #0x28]
00bab17c	ldr x9,[sp, #0x28]
00bab180	cmp x8,x9
00bab184	b.ne 0x00bab1a8
00bab188	mov w0,w22
00bab18c	ldp x29,x30,[sp, #0x70]
00bab190	ldp x20,x19,[sp, #0x60]
00bab194	ldp x22,x21,[sp, #0x50]
00bab198	ldp x24,x23,[sp, #0x40]
00bab19c	ldp x26,x25,[sp, #0x30]
00bab1a0	add sp,sp,#0x80
00bab1a4	ret
00bab1a8	bl 0x00c2fec0
