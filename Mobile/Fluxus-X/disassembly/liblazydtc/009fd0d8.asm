; BIO_dup_chain @ 009fd0d8
009fd0d8	stp x22,x21,[sp, #-0x30]!
009fd0dc	stp x20,x19,[sp, #0x10]
009fd0e0	stp x29,x30,[sp, #0x20]
009fd0e4	add x29,sp,#0x20
009fd0e8	cbz x0,0x009fd1e8
009fd0ec	mov x19,x0
009fd0f0	mov x20,xzr
009fd0f4	mov x22,xzr
009fd0f8	ldr x1,[x19, #0x8]
009fd0fc	mov x0,xzr
009fd100	mov x21,x20
009fd104	bl 0x009fbcb8
009fd108	cbz x0,0x009fd1b8
009fd10c	ldr q0,[x19, #0x10]
009fd110	mov x20,x0
009fd114	orr w1,wzr,#0xc
009fd118	mov x2,xzr
009fd11c	str q0,[x0, #0x10]
009fd120	ldr x8,[x19, #0x20]
009fd124	mov x3,x20
009fd128	str x8,[x0, #0x20]
009fd12c	ldr x8,[x19, #0x28]
009fd130	str x8,[x0, #0x28]
009fd134	ldr w8,[x19, #0x30]
009fd138	str w8,[x0, #0x30]
009fd13c	ldr w8,[x19, #0x38]
009fd140	str w8,[x0, #0x38]
009fd144	mov x0,x19
009fd148	bl 0x009fcb54
009fd14c	cmp x0,#0x0
009fd150	b.le 0x009fd1b0
009fd154	add x1,x20,#0x70
009fd158	add x2,x19,#0x70
009fd15c	orr w0,wzr,#0xc
009fd160	bl 0x00c356b0
009fd164	cbz w0,0x009fd1b0
009fd168	mov x0,x20
009fd16c	cbz x22,0x009fd1a0
009fd170	cbz x21,0x009fd19c
009fd174	mov x8,x21
009fd178	mov x3,x8
009fd17c	ldr x8,[x8, #0x48]
009fd180	cbnz x8,0x009fd178
009fd184	orr w1,wzr,#0x6
009fd188	mov x0,x21
009fd18c	mov x2,xzr
009fd190	str x20,[x3, #0x48]
009fd194	str x3,[x20, #0x50]
009fd198	bl 0x009fcb54
009fd19c	mov x0,x22
009fd1a0	ldr x19,[x19, #0x48]
009fd1a4	mov x22,x0
009fd1a8	cbnz x19,0x009fd0f8
009fd1ac	b 0x009fd1e8
009fd1b0	mov x0,x20
009fd1b4	bl 0x009fbe48
009fd1b8	cbz x22,0x009fd1e4
009fd1bc	add x8,x22,#0x58
009fd1c0	mov x0,x22
009fd1c4	ldar w19,[x8]
009fd1c8	ldr x22,[x22, #0x48]
009fd1cc	bl 0x009fbe48
009fd1d0	cmp w19,#0x1
009fd1d4	b.gt 0x009fd1e4
009fd1d8	mov x0,xzr
009fd1dc	cbnz x22,0x009fd1bc
009fd1e0	b 0x009fd1e8
009fd1e4	mov x0,xzr
009fd1e8	ldp x29,x30,[sp, #0x20]
009fd1ec	ldp x20,x19,[sp, #0x10]
009fd1f0	ldp x22,x21,[sp], #0x30
009fd1f4	ret
