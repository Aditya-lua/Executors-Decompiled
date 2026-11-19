; ossl_asn1_template_free @ 009f70a0
009f70a0	sub sp,sp,#0x50
009f70a4	stp x22,x21,[sp, #0x20]
009f70a8	stp x20,x19,[sp, #0x30]
009f70ac	stp x29,x30,[sp, #0x40]
009f70b0	ldr x8,[x1]
009f70b4	mov x21,x1
009f70b8	mov x19,x0
009f70bc	str x23,[sp, #0x10]
009f70c0	and w20,w8,#0x1000
009f70c4	add x29,sp,#0x40
009f70c8	tbz w8,#0xc,0x009f70d4
009f70cc	str x19,[sp, #0x18]
009f70d0	add x19,sp,#0x18
009f70d4	tst x8,#0x6
009f70d8	b.eq 0x009f7140
009f70dc	ldr x22,[x19]
009f70e0	mov x0,x22
009f70e4	bl 0x00c325e0
009f70e8	cmp w0,#0x1
009f70ec	b.lt 0x009f7130
009f70f0	mov w23,wzr
009f70f4	mov x0,x22
009f70f8	mov w1,w23
009f70fc	bl 0x00c32610
009f7100	str x0,[sp, #0x8]
009f7104	ldr x8,[x21, #0x20]
009f7108	blr x8
009f710c	mov x1,x0
009f7110	add x0,sp,#0x8
009f7114	mov w2,w20
009f7118	bl 0x009f6e3c
009f711c	mov x0,x22
009f7120	add w23,w23,#0x1
009f7124	bl 0x00c325e0
009f7128	cmp w23,w0
009f712c	b.lt 0x009f70f4
009f7130	mov x0,x22
009f7134	bl 0x00c34770
009f7138	str xzr,[x19]
009f713c	b 0x009f7158
009f7140	ldr x8,[x21, #0x20]
009f7144	blr x8
009f7148	mov x1,x0
009f714c	mov x0,x19
009f7150	mov w2,w20
009f7154	bl 0x009f6e3c
009f7158	ldp x29,x30,[sp, #0x40]
009f715c	ldp x20,x19,[sp, #0x30]
009f7160	ldp x22,x21,[sp, #0x20]
009f7164	ldr x23,[sp, #0x10]
009f7168	add sp,sp,#0x50
009f716c	ret
