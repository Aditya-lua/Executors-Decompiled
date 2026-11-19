; X509_get_pubkey_parameters @ 00b0ed4c
00b0ed4c	stp x22,x21,[sp, #-0x30]!
00b0ed50	stp x20,x19,[sp, #0x10]
00b0ed54	mov x20,x1
00b0ed58	mov x19,x0
00b0ed5c	stp x29,x30,[sp, #0x20]
00b0ed60	add x29,sp,#0x20
00b0ed64	cbz x0,0x00b0ed74
00b0ed68	mov x0,x19
00b0ed6c	bl 0x00c35f80
00b0ed70	cbz w0,0x00b0ee5c
00b0ed74	mov x0,x20
00b0ed78	bl 0x00c325e0
00b0ed7c	cmp w0,#0x1
00b0ed80	b.lt 0x00b0edbc
00b0ed84	mov w21,wzr
00b0ed88	mov x0,x20
00b0ed8c	mov w1,w21
00b0ed90	bl 0x00c32610
00b0ed94	bl 0x00c32cb0
00b0ed98	cbz x0,0x00b0ee0c
00b0ed9c	mov x22,x0
00b0eda0	bl 0x00c35f80
00b0eda4	cbz w0,0x00b0ede4
00b0eda8	mov x0,x20
00b0edac	add w21,w21,#0x1
00b0edb0	bl 0x00c325e0
00b0edb4	cmp w21,w0
00b0edb8	b.lt 0x00b0ed88
00b0edbc	bl 0x00c342a0
00b0edc0	adrp x0,0x2a0000
00b0edc4	adrp x2,0x2ae000
00b0edc8	add x0,x0,#0xe02
00b0edcc	add x2,x2,#0x80d
00b0edd0	mov w1,#0x7d0
00b0edd4	bl 0x00c342b0
00b0edd8	mov w0,#0xb
00b0eddc	mov w1,#0x6b
00b0ede0	b 0x00b0ee30
00b0ede4	subs w21,w21,#0x1
00b0ede8	b.lt 0x00b0ee40
00b0edec	mov x0,x20
00b0edf0	mov w1,w21
00b0edf4	bl 0x00c32610
00b0edf8	bl 0x00c32cb0
00b0edfc	mov x1,x22
00b0ee00	bl 0x00c32440
00b0ee04	cbnz w0,0x00b0ede4
00b0ee08	b 0x00b0ee60
00b0ee0c	bl 0x00c342a0
00b0ee10	adrp x0,0x2a0000
00b0ee14	adrp x2,0x2ae000
00b0ee18	add x0,x0,#0xe02
00b0ee1c	add x2,x2,#0x80d
00b0ee20	mov w1,#0x7c8
00b0ee24	bl 0x00c342b0
00b0ee28	mov w0,#0xb
00b0ee2c	mov w1,#0x6c
00b0ee30	mov x2,xzr
00b0ee34	bl 0x00c342c0
00b0ee38	mov w0,wzr
00b0ee3c	b 0x00b0ee60
00b0ee40	cbz x19,0x00b0ee5c
00b0ee44	mov x0,x19
00b0ee48	ldp x29,x30,[sp, #0x20]
00b0ee4c	ldp x20,x19,[sp, #0x10]
00b0ee50	mov x1,x22
00b0ee54	ldp x22,x21,[sp], #0x30
00b0ee58	b 0x00c32440
00b0ee5c	mov w0,#0x1
00b0ee60	ldp x29,x30,[sp, #0x20]
00b0ee64	ldp x20,x19,[sp, #0x10]
00b0ee68	ldp x22,x21,[sp], #0x30
00b0ee6c	ret
