; EVP_PKEY_CTX_get_ecdh_cofactor_mode @ 00a7aabc
00a7aabc	sub sp,sp,#0xa0
00a7aac0	str x19,[sp, #0x80]
00a7aac4	stp x29,x30,[sp, #0x90]
00a7aac8	add x29,sp,#0x90
00a7aacc	cbz x0,0x00a7ab68
00a7aad0	ldr w8,[x0]
00a7aad4	mov x19,x0
00a7aad8	cmp w8,#0x800
00a7aadc	b.ne 0x00a7ab68
00a7aae0	ldr x8,[x19, #0x20]
00a7aae4	cbz x8,0x00a7aba8
00a7aae8	adrp x0,0x2b7000
00a7aaec	add x0,x0,#0xd2b
00a7aaf0	add x8,sp,#0x8
00a7aaf4	sub x1,x29,#0x4
00a7aaf8	bl 0x00c36260
00a7aafc	ldr x8,[sp, #0x28]
00a7ab00	ldur q0,[sp, #0x18]
00a7ab04	ldur q1,[sp, #0x8]
00a7ab08	str x8,[sp, #0x50]
00a7ab0c	add x8,sp,#0x8
00a7ab10	stp q1,q0,[sp, #0x30]
00a7ab14	bl 0x00c34c40
00a7ab18	ldr x8,[sp, #0x28]
00a7ab1c	ldur q0,[sp, #0x18]
00a7ab20	ldur q1,[sp, #0x8]
00a7ab24	add x1,sp,#0x30
00a7ab28	mov x0,x19
00a7ab2c	str x8,[sp, #0x78]
00a7ab30	stur q0,[sp, #0x68]
00a7ab34	stur q1,[sp, #0x58]
00a7ab38	bl 0x00c3c110
00a7ab3c	cmp w0,#0x1
00a7ab40	b.eq 0x00a7abc4
00a7ab44	cmn w0,#0x2
00a7ab48	b.ne 0x00a7abbc
00a7ab4c	bl 0x00c342a0
00a7ab50	adrp x0,0x2d9000
00a7ab54	adrp x2,0x2c5000
00a7ab58	add x0,x0,#0xd63
00a7ab5c	add x2,x2,#0xb52
00a7ab60	mov w1,#0x57
00a7ab64	b 0x00a7ab80
00a7ab68	bl 0x00c342a0
00a7ab6c	adrp x0,0x2d9000
00a7ab70	adrp x2,0x2bd000
00a7ab74	add x0,x0,#0xd63
00a7ab78	add x2,x2,#0xbcb
00a7ab7c	mov w1,#0x1b
00a7ab80	bl 0x00c342b0
00a7ab84	orr w0,wzr,#0x6
00a7ab88	mov w1,#0x93
00a7ab8c	mov x2,xzr
00a7ab90	bl 0x00c342c0
00a7ab94	orr w0,wzr,#0xfffffffe
00a7ab98	ldp x29,x30,[sp, #0x90]
00a7ab9c	ldr x19,[sp, #0x80]
00a7aba0	add sp,sp,#0xa0
00a7aba4	ret
00a7aba8	ldr x8,[x19, #0x78]
00a7abac	cbz x8,0x00a7aae8
00a7abb0	ldr w8,[x8]
00a7abb4	cmp w8,#0x198
00a7abb8	b.eq 0x00a7aae8
00a7abbc	mov w0,#0xffffffff
00a7abc0	b 0x00a7ab98
00a7abc4	ldur w8,[x29, #-0x4]
00a7abc8	cmp w8,#0x1
00a7abcc	csinv w0,w8,wzr,ls
00a7abd0	b 0x00a7ab98
