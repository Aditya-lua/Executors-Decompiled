; ossl_rsa_pss_get_param @ 00acda58
00acda58	str x19,[sp, #-0x20]!
00acda5c	stp x29,x30,[sp, #0x10]
00acda60	add x29,sp,#0x10
00acda64	sub x4,x29,#0x4
00acda68	mov x19,x3
00acda6c	stur wzr,[x29, #-0x4]
00acda70	bl 0x00c3fb50
00acda74	cbz w0,0x00acdaf0
00acda78	cbz x19,0x00acda84
00acda7c	ldr w8,[x19]
00acda80	tbnz w8,#0x1f,0x00acdac0
00acda84	ldur w8,[x29, #-0x4]
00acda88	cmp w8,#0x1
00acda8c	b.ne 0x00acda98
00acda90	mov w0,#0x1
00acda94	b 0x00acdaf0
00acda98	bl 0x00c342a0
00acda9c	adrp x0,0x2aa000
00acdaa0	adrp x2,0x2d0000
00acdaa4	add x0,x0,#0x8f8
00acdaa8	add x2,x2,#0x2e5
00acdaac	mov w1,#0x24a
00acdab0	bl 0x00c342b0
00acdab4	mov w0,#0x4
00acdab8	mov w1,#0x8b
00acdabc	b 0x00acdae4
00acdac0	bl 0x00c342a0
00acdac4	adrp x0,0x2aa000
00acdac8	adrp x2,0x2d0000
00acdacc	add x0,x0,#0x8f8
00acdad0	add x2,x2,#0x2e5
00acdad4	mov w1,#0x242
00acdad8	bl 0x00c342b0
00acdadc	mov w0,#0x4
00acdae0	mov w1,#0x96
00acdae4	mov x2,xzr
00acdae8	bl 0x00c342c0
00acdaec	mov w0,wzr
00acdaf0	ldp x29,x30,[sp, #0x10]
00acdaf4	ldr x19,[sp], #0x20
00acdaf8	ret
