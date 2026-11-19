; mbedtls_ctr_drbg_write_seed_file @ 00b740ec
00b740ec	sub sp,sp,#0x140
00b740f0	stp x28,x21,[sp, #0x110]
00b740f4	stp x20,x19,[sp, #0x120]
00b740f8	stp x29,x30,[sp, #0x130]
00b740fc	add x29,sp,#0x130
00b74100	mrs x21,tpidr_el0
00b74104	ldr x9,[x21, #0x28]
00b74108	mov x8,x1
00b7410c	adrp x1,0x2a6000
00b74110	mov x20,x0
00b74114	add x1,x1,#0xd85
00b74118	mov x0,x8
00b7411c	stur x9,[x29, #-0x28]
00b74120	bl 0x00c30c10
00b74124	mov x19,x0
00b74128	cbz x0,0x00b74190
00b7412c	mov x0,x19
00b74130	mov x1,xzr
00b74134	bl 0x00c42490
00b74138	add x1,sp,#0x8
00b7413c	mov w2,#0x100
00b74140	mov x0,x20
00b74144	mov x3,xzr
00b74148	mov x4,xzr
00b7414c	bl 0x00c42470
00b74150	mov w20,w0
00b74154	cbnz w0,0x00b74178
00b74158	add x0,sp,#0x8
00b7415c	mov w1,#0x1
00b74160	mov w2,#0x100
00b74164	mov x3,x19
00b74168	bl 0x00c308f0
00b7416c	cmp x0,#0x100
00b74170	mov w8,#0xffffffc6
00b74174	csel w20,wzr,w8,eq
00b74178	add x0,sp,#0x8
00b7417c	mov w1,#0x100
00b74180	bl 0x00c42220
00b74184	mov x0,x19
00b74188	bl 0x00c30be0
00b7418c	b 0x00b74194
00b74190	mov w20,#0xffffffc6
00b74194	ldr x8,[x21, #0x28]
00b74198	ldur x9,[x29, #-0x28]
00b7419c	cmp x8,x9
00b741a0	b.ne 0x00b741bc
00b741a4	mov w0,w20
00b741a8	ldp x29,x30,[sp, #0x130]
00b741ac	ldp x20,x19,[sp, #0x120]
00b741b0	ldp x28,x21,[sp, #0x110]
00b741b4	add sp,sp,#0x140
00b741b8	ret
00b741bc	bl 0x00c2fec0
