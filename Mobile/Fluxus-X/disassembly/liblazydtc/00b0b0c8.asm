; X509_STORE_get1_all_certs @ 00b0b0c8
00b0b0c8	stp x22,x21,[sp, #-0x30]!
00b0b0cc	stp x20,x19,[sp, #0x10]
00b0b0d0	stp x29,x30,[sp, #0x20]
00b0b0d4	add x29,sp,#0x20
00b0b0d8	cbz x0,0x00b0b164
00b0b0dc	mov x20,x0
00b0b0e0	bl 0x00c34780
00b0b0e4	mov x19,x0
00b0b0e8	cbz x0,0x00b0b1b4
00b0b0ec	ldr x0,[x20, #0x98]
00b0b0f0	bl 0x00c356a0
00b0b0f4	cbz w0,0x00b0b1a0
00b0b0f8	ldr x21,[x20, #0x8]
00b0b0fc	mov x0,x21
00b0b100	bl 0x00c325e0
00b0b104	cmp w0,#0x1
00b0b108	b.lt 0x00b0b158
00b0b10c	mov w22,wzr
00b0b110	mov x0,x21
00b0b114	mov w1,w22
00b0b118	bl 0x00c32610
00b0b11c	cbz x0,0x00b0b144
00b0b120	ldr w8,[x0]
00b0b124	cmp w8,#0x1
00b0b128	b.ne 0x00b0b144
00b0b12c	ldr x1,[x0, #0x8]
00b0b130	cbz x1,0x00b0b144
00b0b134	mov w2,#0x1
00b0b138	mov x0,x19
00b0b13c	bl 0x00c40bc0
00b0b140	cbz w0,0x00b0b198
00b0b144	mov x0,x21
00b0b148	add w22,w22,#0x1
00b0b14c	bl 0x00c325e0
00b0b150	cmp w22,w0
00b0b154	b.lt 0x00b0b110
00b0b158	ldr x0,[x20, #0x98]
00b0b15c	bl 0x00c35690
00b0b160	b 0x00b0b1b4
00b0b164	bl 0x00c342a0
00b0b168	adrp x0,0x2aa000
00b0b16c	adrp x2,0x2c0000
00b0b170	add x0,x0,#0xba3
00b0b174	add x2,x2,#0x6ad
00b0b178	mov w1,#0x22e
00b0b17c	bl 0x00c342b0
00b0b180	mov w1,#0x102
00b0b184	mov w0,#0xb
00b0b188	movk w1,#0xc, LSL #16
00b0b18c	mov x2,xzr
00b0b190	bl 0x00c342c0
00b0b194	b 0x00b0b1b0
00b0b198	ldr x0,[x20, #0x98]
00b0b19c	bl 0x00c35690
00b0b1a0	adrp x1,0xcb4000
00b0b1a4	ldr x1,[x1, #0xd88]
00b0b1a8	mov x0,x19
00b0b1ac	bl 0x00c32600
00b0b1b0	mov x19,xzr
00b0b1b4	mov x0,x19
00b0b1b8	ldp x29,x30,[sp, #0x20]
00b0b1bc	ldp x20,x19,[sp, #0x10]
00b0b1c0	ldp x22,x21,[sp], #0x30
00b0b1c4	ret
