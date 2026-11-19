; dtls_construct_hello_verify_request @ 009e7140
009e7140	str x23,[sp, #-0x40]!
009e7144	stp x22,x21,[sp, #0x10]
009e7148	stp x20,x19,[sp, #0x20]
009e714c	stp x29,x30,[sp, #0x30]
009e7150	ldr x8,[x0, #0x9a8]
009e7154	mov x19,x0
009e7158	add x29,sp,#0x30
009e715c	ldr x8,[x8, #0xd0]
009e7160	cbz x8,0x009e71ec
009e7164	mov x20,x1
009e7168	ldr x1,[x19, #0x4b8]
009e716c	add x2,sp,#0xc
009e7170	mov x0,x19
009e7174	blr x8
009e7178	cbz w0,0x009e71ec
009e717c	ldr w21,[sp, #0xc]
009e7180	cmp w21,#0x100
009e7184	b.cs 0x009e71ec
009e7188	ldr x22,[x19, #0x4b8]
009e718c	mov w1,#0xfeff
009e7190	mov w2,#0x2
009e7194	mov x0,x20
009e7198	str x21,[x22, #0x100]
009e719c	bl 0x00c343a0
009e71a0	cbz w0,0x009e71c0
009e71a4	mov w3,#0x1
009e71a8	mov x0,x20
009e71ac	mov x1,x22
009e71b0	mov x2,x21
009e71b4	mov w23,#0x1
009e71b8	bl 0x00c36f70
009e71bc	cbnz w0,0x009e7220
009e71c0	bl 0x00c342a0
009e71c4	adrp x0,0x2bd000
009e71c8	adrp x2,0x2ab000
009e71cc	add x0,x0,#0x74c
009e71d0	add x2,x2,#0xdb2
009e71d4	mov w1,#0x516
009e71d8	bl 0x00c342b0
009e71dc	mov w2,#0x103
009e71e0	mov w1,#0xffffffff
009e71e4	movk w2,#0xc, LSL #16
009e71e8	b 0x009e7210
009e71ec	bl 0x00c342a0
009e71f0	adrp x0,0x2bd000
009e71f4	adrp x2,0x2ab000
009e71f8	add x0,x0,#0x74c
009e71fc	add x2,x2,#0xdb2
009e7200	mov w1,#0x50f
009e7204	bl 0x00c342b0
009e7208	mov w1,#0xffffffff
009e720c	mov w2,#0x190
009e7210	mov x0,x19
009e7214	mov x3,xzr
009e7218	bl 0x00c34410
009e721c	mov w23,wzr
009e7220	ldp x29,x30,[sp, #0x30]
009e7224	ldp x20,x19,[sp, #0x20]
009e7228	ldp x22,x21,[sp, #0x10]
009e722c	mov w0,w23
009e7230	ldr x23,[sp], #0x40
009e7234	ret
