; ssl_set_client_hello_version @ 009e5a30
009e5a30	str x23,[sp, #-0x40]!
009e5a34	stp x22,x21,[sp, #0x10]
009e5a38	stp x20,x19,[sp, #0x20]
009e5a3c	stp x29,x30,[sp, #0x30]
009e5a40	ldr x8,[x0, #0x240]
009e5a44	mov x19,x0
009e5a48	add x29,sp,#0x30
009e5a4c	cbz x8,0x009e5a5c
009e5a50	ldr x8,[x19, #0x2c8]
009e5a54	mov w0,wzr
009e5a58	cbnz x8,0x009e5b2c
009e5a5c	ldr x8,[x19, #0x8]
009e5a60	ldr w9,[x8]
009e5a64	cmp w9,#0x10, LSL #12
009e5a68	b.eq 0x009e5a8c
009e5a6c	orr w10,wzr,#0x1ffff
009e5a70	cmp w9,w10
009e5a74	b.ne 0x009e5b04
009e5a78	adrp x8,0xc58000
009e5a7c	add x8,x8,#0x828
009e5a80	ldr w9,[x8]
009e5a84	cbnz w9,0x009e5a9c
009e5a88	b 0x009e5afc
009e5a8c	adrp x8,0xc58000
009e5a90	add x8,x8,#0x798
009e5a94	ldr w9,[x8]
009e5a98	cbz w9,0x009e5afc
009e5a9c	mov w21,wzr
009e5aa0	add x22,x8,#0x18
009e5aa4	mov w23,#0x1
009e5aa8	b 0x009e5ac0
009e5aac	mov w8,wzr
009e5ab0	cbz w23,0x009e5ae4
009e5ab4	ldr w21,[x20]
009e5ab8	mov w8,wzr
009e5abc	b 0x009e5ae4
009e5ac0	ldur x8,[x22, #-0x10]
009e5ac4	cbz x8,0x009e5ae0
009e5ac8	blr x8
009e5acc	mov x20,x0
009e5ad0	mov x0,x19
009e5ad4	mov x1,x20
009e5ad8	bl 0x009e4f38
009e5adc	cbz w0,0x009e5aac
009e5ae0	mov w8,#0x1
009e5ae4	ldr w9,[x22], #0x18
009e5ae8	mov w23,w8
009e5aec	cbnz w9,0x009e5ac0
009e5af0	cbz w21,0x009e5afc
009e5af4	ldr x8,[x19, #0x8]
009e5af8	b 0x009e5b08
009e5afc	mov w0,#0xbf
009e5b00	b 0x009e5b2c
009e5b04	ldr w21,[x19]
009e5b08	str w21,[x19]
009e5b0c	ldr x8,[x8, #0xc0]
009e5b10	mov w0,wzr
009e5b14	ldr w8,[x8, #0x60]
009e5b18	tst w8,#0x8
009e5b1c	mov w8,#0x303
009e5b20	ccmp w21,w8,#0x4,eq
009e5b24	csel w8,w8,w21,gt
009e5b28	str w8,[x19, #0xa0c]
009e5b2c	ldp x29,x30,[sp, #0x30]
009e5b30	ldp x20,x19,[sp, #0x20]
009e5b34	ldp x22,x21,[sp, #0x10]
009e5b38	ldr x23,[sp], #0x40
009e5b3c	ret
