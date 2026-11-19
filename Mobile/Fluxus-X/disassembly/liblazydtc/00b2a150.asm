; ossl_chacha20_dinit @ 00b2a150
00b2a150	stp x22,x21,[sp, #-0x30]!
00b2a154	stp x20,x19,[sp, #0x10]
00b2a158	mov x19,x5
00b2a15c	mov x5,xzr
00b2a160	stp x29,x30,[sp, #0x20]
00b2a164	add x29,sp,#0x20
00b2a168	mov x22,x3
00b2a16c	mov x20,x0
00b2a170	bl 0x00c41240
00b2a174	mov w21,w0
00b2a178	cbz x22,0x00b2a190
00b2a17c	cbz w21,0x00b2a190
00b2a180	ldr x8,[x20, #0xa8]
00b2a184	mov x0,x20
00b2a188	ldr x8,[x8, #0x18]
00b2a18c	blr x8
00b2a190	cbz w21,0x00b2a1ac
00b2a194	mov x0,x20
00b2a198	mov x1,x19
00b2a19c	bl 0x00b2a034
00b2a1a0	cmp w0,#0x0
00b2a1a4	csel w0,wzr,w21,eq
00b2a1a8	b 0x00b2a1b0
00b2a1ac	mov w0,wzr
00b2a1b0	ldp x29,x30,[sp, #0x20]
00b2a1b4	ldp x20,x19,[sp, #0x10]
00b2a1b8	ldp x22,x21,[sp], #0x30
00b2a1bc	ret
