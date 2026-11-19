; i2d_ASN1_OBJECT @ 009ec074
009ec074	sub sp,sp,#0x40
009ec078	stp x22,x21,[sp, #0x10]
009ec07c	stp x20,x19,[sp, #0x20]
009ec080	stp x29,x30,[sp, #0x30]
009ec084	add x29,sp,#0x30
009ec088	cbz x0,0x009ec0d0
009ec08c	ldr x8,[x0, #0x18]
009ec090	mov x21,x0
009ec094	cbz x8,0x009ec0d0
009ec098	mov x19,x1
009ec09c	ldr w1,[x21, #0x14]
009ec0a0	orr w2,wzr,#0x6
009ec0a4	mov w0,wzr
009ec0a8	bl 0x00c376b0
009ec0ac	mov w20,w0
009ec0b0	cbz x19,0x009ec134
009ec0b4	cmn w20,#0x1
009ec0b8	b.eq 0x009ec134
009ec0bc	ldr x8,[x19]
009ec0c0	cbz x8,0x009ec0d8
009ec0c4	mov x22,xzr
009ec0c8	str x8,[sp, #0x8]
009ec0cc	b 0x009ec0f8
009ec0d0	mov w20,wzr
009ec0d4	b 0x009ec134
009ec0d8	adrp x1,0x2b7000
009ec0dc	sxtw x0,w20
009ec0e0	add x1,x1,#0x892
009ec0e4	mov w2,#0x22
009ec0e8	bl 0x00c32320
009ec0ec	mov x22,x0
009ec0f0	str x0,[sp, #0x8]
009ec0f4	cbz x0,0x009ec14c
009ec0f8	ldr w2,[x21, #0x14]
009ec0fc	add x0,sp,#0x8
009ec100	orr w3,wzr,#0x6
009ec104	mov w1,wzr
009ec108	mov w4,wzr
009ec10c	bl 0x00c376c0
009ec110	ldr x0,[sp, #0x8]
009ec114	ldr x1,[x21, #0x18]
009ec118	ldrsw x2,[x21, #0x14]
009ec11c	bl 0x00c2ffd0
009ec120	cbnz x22,0x009ec130
009ec124	ldr x8,[sp, #0x8]
009ec128	ldrsw x9,[x21, #0x14]
009ec12c	add x22,x8,x9
009ec130	str x22,[x19]
009ec134	mov w0,w20
009ec138	ldp x29,x30,[sp, #0x30]
009ec13c	ldp x20,x19,[sp, #0x20]
009ec140	ldp x22,x21,[sp, #0x10]
009ec144	add sp,sp,#0x40
009ec148	ret
009ec14c	bl 0x00c342a0
009ec150	adrp x0,0x2b7000
009ec154	adrp x2,0x2b9000
009ec158	add x0,x0,#0x892
009ec15c	add x2,x2,#0xadd
009ec160	mov w1,#0x23
009ec164	bl 0x00c342b0
009ec168	mov w1,#0x100
009ec16c	mov w0,#0xd
009ec170	movk w1,#0xc, LSL #16
009ec174	mov x2,xzr
009ec178	bl 0x00c342c0
009ec17c	mov w20,wzr
009ec180	b 0x009ec134
