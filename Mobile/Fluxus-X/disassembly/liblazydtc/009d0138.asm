; tls_validate_all_contexts @ 009d0138
009d0138	str x25,[sp, #-0x50]!
009d013c	stp x20,x19,[sp, #0x30]
009d0140	mov w19,w1
009d0144	mov x20,x0
009d0148	stp x24,x23,[sp, #0x10]
009d014c	stp x22,x21,[sp, #0x20]
009d0150	stp x29,x30,[sp, #0x40]
009d0154	add x29,sp,#0x40
009d0158	tbnz w1,#0x7,0x009d0168
009d015c	mov w8,#0x2
009d0160	bic w21,w8,w19, LSR #0x7
009d0164	b 0x009d016c
009d0168	mov w21,#0x1
009d016c	ldr x8,[x20, #0x898]
009d0170	ldr x8,[x8, #0x1e0]
009d0174	adds x22,x8,#0x1a
009d0178	b.eq 0x009d0200
009d017c	adrp x8,0xc58000
009d0180	add x8,x8,#0x1e8
009d0184	mov x23,xzr
009d0188	add x24,x2,#0x18
009d018c	add x25,x8,#0x4
009d0190	ldur w8,[x24, #-0x8]
009d0194	cbz w8,0x009d01ec
009d0198	cmp x23,#0x1a
009d019c	mov x8,x25
009d01a0	b.cc 0x009d01c4
009d01a4	ldr x8,[x20, #0x898]
009d01a8	ldr w2,[x24]
009d01ac	add x3,sp,#0x8
009d01b0	mov w1,w21
009d01b4	add x0,x8,#0x1d8
009d01b8	bl 0x00c36ec0
009d01bc	cbz x0,0x009d020c
009d01c0	add x8,x0,#0x8
009d01c4	ldr w8,[x8]
009d01c8	tst w8,w19
009d01cc	b.eq 0x009d0208
009d01d0	ldr x9,[x20, #0x8]
009d01d4	ldr x9,[x9, #0xc0]
009d01d8	ldrb w9,[x9, #0x60]
009d01dc	tbnz w9,#0x3,0x009d01e8
009d01e0	tbz w8,#0x1,0x009d01ec
009d01e4	b 0x009d0208
009d01e8	tbnz w8,#0x0,0x009d0208
009d01ec	add x23,x23,#0x1
009d01f0	add x24,x24,#0x28
009d01f4	cmp x23,x22
009d01f8	add x25,x25,#0x38
009d01fc	b.cc 0x009d0190
009d0200	mov w0,#0x1
009d0204	b 0x009d020c
009d0208	mov w0,wzr
009d020c	ldp x29,x30,[sp, #0x40]
009d0210	ldp x20,x19,[sp, #0x30]
009d0214	ldp x22,x21,[sp, #0x20]
009d0218	ldp x24,x23,[sp, #0x10]
009d021c	ldr x25,[sp], #0x50
009d0220	ret
