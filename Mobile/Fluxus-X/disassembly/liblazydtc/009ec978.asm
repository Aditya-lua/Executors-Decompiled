; ossl_c2i_ASN1_OBJECT @ 009ec978
009ec978	sub sp,sp,#0x80
009ec97c	stp x26,x25,[sp, #0x30]
009ec980	stp x24,x23,[sp, #0x40]
009ec984	stp x22,x21,[sp, #0x50]
009ec988	stp x20,x19,[sp, #0x60]
009ec98c	stp x29,x30,[sp, #0x70]
009ec990	add x29,sp,#0x70
009ec994	cbz x1,0x009eca04
009ec998	sub x8,x2,#0x1
009ec99c	orr w9,wzr,#0x7ffffffe
009ec9a0	mov x21,x2
009ec9a4	cmp x8,x9
009ec9a8	b.hi 0x009eca04
009ec9ac	ldr x22,[x1]
009ec9b0	mov x20,x1
009ec9b4	cbz x22,0x009eca04
009ec9b8	ldrsb w8,[x22, x8]
009ec9bc	tbnz w8,#0x1f,0x009eca04
009ec9c0	mov x19,x0
009ec9c4	add x0,sp,#0x8
009ec9c8	stp wzr,w21,[sp, #0x18]
009ec9cc	str x22,[sp, #0x20]
009ec9d0	str wzr,[sp, #0x28]
009ec9d4	bl 0x00c37750
009ec9d8	cbz w0,0x009eca54
009ec9dc	bl 0x00c37740
009ec9e0	mov x22,x0
009ec9e4	cbz x19,0x009ec9f4
009ec9e8	ldr x0,[x19]
009ec9ec	bl 0x009ecc24
009ec9f0	str x22,[x19]
009ec9f4	ldr x8,[x20]
009ec9f8	add x8,x8,x21
009ec9fc	str x8,[x20]
009eca00	b 0x009eca34
009eca04	bl 0x00c342a0
009eca08	adrp x0,0x2b7000
009eca0c	adrp x2,0x2a9000
009eca10	add x0,x0,#0x892
009eca14	add x2,x2,#0xf49
009eca18	mov w1,#0x103
009eca1c	bl 0x00c342b0
009eca20	mov w0,#0xd
009eca24	mov w1,#0xd8
009eca28	mov x2,xzr
009eca2c	bl 0x00c342c0
009eca30	mov x22,xzr
009eca34	mov x0,x22
009eca38	ldp x29,x30,[sp, #0x70]
009eca3c	ldp x20,x19,[sp, #0x60]
009eca40	ldp x22,x21,[sp, #0x50]
009eca44	ldp x24,x23,[sp, #0x40]
009eca48	ldp x26,x25,[sp, #0x30]
009eca4c	add sp,sp,#0x80
009eca50	ret
009eca54	mov x8,xzr
009eca58	ldrb w9,[x22, x8]
009eca5c	cmp w9,#0x80
009eca60	b.ne 0x009eca74
009eca64	cbz w8,0x009ecb1c
009eca68	add x9,x22,x8
009eca6c	ldursb w9,[x9, #-0x1]
009eca70	tbz w9,#0x1f,0x009ecb1c
009eca74	add x8,x8,#0x1
009eca78	cmp w8,w21
009eca7c	b.lt 0x009eca58
009eca80	cbz x19,0x009eca94
009eca84	ldr x22,[x19]
009eca88	cbz x22,0x009eca94
009eca8c	ldrb w8,[x22, #0x20]
009eca90	tbnz w8,#0x0,0x009ecab8
009eca94	adrp x1,0x2b7000
009eca98	add x1,x1,#0x892
009eca9c	mov w0,#0x28
009ecaa0	mov w2,#0x15b
009ecaa4	bl 0x00c34250
009ecaa8	mov x22,x0
009ecaac	cbz x0,0x009ecb38
009ecab0	mov w8,#0x1
009ecab4	str w8,[x22, #0x20]
009ecab8	ldr x24,[x22, #0x18]
009ecabc	ldr x23,[x20]
009ecac0	str xzr,[x22, #0x18]
009ecac4	cbz x24,0x009ecad4
009ecac8	ldr w8,[x22, #0x14]
009ecacc	cmp w8,w21
009ecad0	b.ge 0x009ecb6c
009ecad4	adrp x26,0x2b7000
009ecad8	add x26,x26,#0x892
009ecadc	mov w2,#0x135
009ecae0	mov x0,x24
009ecae4	mov x1,x26
009ecae8	str wzr,[x22, #0x14]
009ecaec	bl 0x00c32310
009ecaf0	sxtw x25,w21
009ecaf4	mov w2,#0x136
009ecaf8	mov x0,x25
009ecafc	mov x1,x26
009ecb00	bl 0x00c32320
009ecb04	cbz x0,0x009ecbd8
009ecb08	ldr w8,[x22, #0x20]
009ecb0c	mov x24,x0
009ecb10	orr w8,w8,#0x8
009ecb14	str w8,[x22, #0x20]
009ecb18	b 0x009ecb70
009ecb1c	bl 0x00c342a0
009ecb20	adrp x0,0x2b7000
009ecb24	adrp x2,0x2a9000
009ecb28	add x0,x0,#0x892
009ecb2c	add x2,x2,#0xf49
009ecb30	mov w1,#0x121
009ecb34	b 0x009eca1c
009ecb38	bl 0x00c342a0
009ecb3c	adrp x0,0x2b7000
009ecb40	adrp x2,0x2c3000
009ecb44	add x0,x0,#0x892
009ecb48	add x2,x2,#0x693
009ecb4c	mov w1,#0x15d
009ecb50	bl 0x00c342b0
009ecb54	mov w1,#0x100
009ecb58	mov w0,#0xd
009ecb5c	movk w1,#0xc, LSL #16
009ecb60	mov x2,xzr
009ecb64	bl 0x00c342c0
009ecb68	b 0x009eca34
009ecb6c	sxtw x25,w21
009ecb70	mov x0,x24
009ecb74	mov x1,x23
009ecb78	mov x2,x25
009ecb7c	bl 0x00c2ffd0
009ecb80	ldrb w8,[x22, #0x20]
009ecb84	tbz w8,#0x2,0x009ecbbc
009ecb88	ldr x0,[x22]
009ecb8c	adrp x26,0x2b7000
009ecb90	add x26,x26,#0x892
009ecb94	mov w2,#0x140
009ecb98	mov x1,x26
009ecb9c	bl 0x00c32310
009ecba0	ldr x0,[x22, #0x8]
009ecba4	mov w2,#0x141
009ecba8	mov x1,x26
009ecbac	bl 0x00c32310
009ecbb0	ldr w8,[x22, #0x20]
009ecbb4	and w8,w8,#0xfffffffb
009ecbb8	str w8,[x22, #0x20]
009ecbbc	add x8,x23,x25
009ecbc0	str x24,[x22, #0x18]
009ecbc4	str w21,[x22, #0x14]
009ecbc8	stp xzr,xzr,[x22]
009ecbcc	cbz x19,0x009ec9fc
009ecbd0	str x22,[x19]
009ecbd4	b 0x009ec9fc
009ecbd8	bl 0x00c342a0
009ecbdc	adrp x0,0x2b7000
009ecbe0	adrp x2,0x2a9000
009ecbe4	add x0,x0,#0x892
009ecbe8	add x2,x2,#0xf49
009ecbec	mov w1,#0x151
009ecbf0	bl 0x00c342b0
009ecbf4	mov w1,#0x100
009ecbf8	mov w0,#0xd
009ecbfc	movk w1,#0xc, LSL #16
009ecc00	mov x2,xzr
009ecc04	bl 0x00c342c0
009ecc08	cbz x19,0x009ecc18
009ecc0c	ldr x8,[x19]
009ecc10	cmp x8,x22
009ecc14	b.eq 0x009eca30
009ecc18	mov x0,x22
009ecc1c	bl 0x009ecc24
009ecc20	b 0x009eca30
