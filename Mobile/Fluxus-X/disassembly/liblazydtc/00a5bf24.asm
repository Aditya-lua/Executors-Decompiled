; EVP_CIPHER_CTX_set_key_length @ 00a5bf24
00a5bf24	sub sp,sp,#0xa0
00a5bf28	stp x20,x19,[sp, #0x80]
00a5bf2c	stp x29,x30,[sp, #0x90]
00a5bf30	ldr x8,[x0]
00a5bf34	mov x19,x0
00a5bf38	mov w20,w1
00a5bf3c	add x29,sp,#0x90
00a5bf40	ldr x9,[x8, #0x78]
00a5bf44	cbz x9,0x00a5bfa0
00a5bf48	add x0,sp,#0x30
00a5bf4c	mov w2,#0x50
00a5bf50	mov w1,wzr
00a5bf54	bl 0x00c301c0
00a5bf58	sxtw x8,w20
00a5bf5c	mov x0,x19
00a5bf60	str x8,[sp, #0x28]
00a5bf64	bl 0x00c3cca0
00a5bf68	cmp w0,w20
00a5bf6c	b.eq 0x00a5bfb8
00a5bf70	ldr x20,[x19]
00a5bf74	cbz x20,0x00a5bfe0
00a5bf78	ldr x8,[x20, #0xf8]
00a5bf7c	cbz x8,0x00a5bfe0
00a5bf80	mov x0,x20
00a5bf84	bl 0x00c34bb0
00a5bf88	bl 0x00c3b680
00a5bf8c	ldr x8,[x20, #0xf8]
00a5bf90	mov x1,x0
00a5bf94	mov x0,xzr
00a5bf98	blr x8
00a5bf9c	b 0x00a5bfe4
00a5bfa0	ldrb w8,[x8, #0x10]
00a5bfa4	tbnz w8,#0x7,0x00a5bfc0
00a5bfa8	mov x0,x19
00a5bfac	bl 0x00c3cca0
00a5bfb0	cmp w0,w20
00a5bfb4	b.ne 0x00a5c050
00a5bfb8	mov w0,#0x1
00a5bfbc	b 0x00a5c094
00a5bfc0	mov x0,x19
00a5bfc4	mov w2,w20
00a5bfc8	ldp x29,x30,[sp, #0x90]
00a5bfcc	ldp x20,x19,[sp, #0x80]
00a5bfd0	mov w1,#0x1
00a5bfd4	mov x3,xzr
00a5bfd8	add sp,sp,#0xa0
00a5bfdc	b 0x00a5c100
00a5bfe0	mov x0,xzr
00a5bfe4	adrp x1,0x2bd000
00a5bfe8	add x1,x1,#0xa97
00a5bfec	bl 0x00c36530
00a5bff0	cbz x0,0x00a5c034
00a5bff4	adrp x0,0x2bd000
00a5bff8	add x0,x0,#0xa97
00a5bffc	mov x8,sp
00a5c000	add x1,sp,#0x28
00a5c004	bl 0x00c36270
00a5c008	ldr x8,[sp, #0x20]
00a5c00c	ldp q1,q0,[sp]
00a5c010	add x2,sp,#0x30
00a5c014	str x8,[sp, #0x50]
00a5c018	stp q1,q0,[sp, #0x30]
00a5c01c	ldr x0,[x19]
00a5c020	ldr x1,[x19, #0xa8]
00a5c024	bl 0x00c3cd70
00a5c028	cmp w0,#0x0
00a5c02c	cset w0,gt
00a5c030	b 0x00a5c094
00a5c034	bl 0x00c342a0
00a5c038	adrp x0,0x2a5000
00a5c03c	adrp x2,0x2b4000
00a5c040	add x0,x0,#0xf9d
00a5c044	add x2,x2,#0x256
00a5c048	mov w1,#0x416
00a5c04c	b 0x00a5c07c
00a5c050	cmp w20,#0x1
00a5c054	b.lt 0x00a5c064
00a5c058	ldr x8,[x19]
00a5c05c	ldrb w8,[x8, #0x10]
00a5c060	tbnz w8,#0x3,0x00a5c0a4
00a5c064	bl 0x00c342a0
00a5c068	adrp x0,0x2a5000
00a5c06c	adrp x2,0x2b4000
00a5c070	add x0,x0,#0xf9d
00a5c074	add x2,x2,#0x256
00a5c078	mov w1,#0x42e
00a5c07c	bl 0x00c342b0
00a5c080	orr w0,wzr,#0x6
00a5c084	mov w1,#0x82
00a5c088	mov x2,xzr
00a5c08c	bl 0x00c342c0
00a5c090	mov w0,wzr
00a5c094	ldp x29,x30,[sp, #0x90]
00a5c098	ldp x20,x19,[sp, #0x80]
00a5c09c	add sp,sp,#0xa0
00a5c0a0	ret
00a5c0a4	str w20,[x19, #0x68]
00a5c0a8	mov w0,#0x1
00a5c0ac	b 0x00a5c094
