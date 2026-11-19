; i2s_ASN1_IA5STRING @ 00afeb58
00afeb58	stp x20,x19,[sp, #-0x20]!
00afeb5c	stp x29,x30,[sp, #0x10]
00afeb60	add x29,sp,#0x10
00afeb64	cbz x1,0x00afebb0
00afeb68	ldrsw x8,[x1]
00afeb6c	mov x19,x1
00afeb70	cmp w8,#0x1
00afeb74	b.lt 0x00afebb0
00afeb78	adrp x1,0x2b4000
00afeb7c	add x0,x8,#0x1
00afeb80	add x1,x1,#0xa61
00afeb84	mov w2,#0x22
00afeb88	bl 0x00c32320
00afeb8c	mov x20,x0
00afeb90	cbz x0,0x00afebb8
00afeb94	ldr x1,[x19, #0x8]
00afeb98	ldrsw x2,[x19]
00afeb9c	mov x0,x20
00afeba0	bl 0x00c2ffd0
00afeba4	ldrsw x8,[x19]
00afeba8	strb wzr,[x20, x8]
00afebac	b 0x00afebe8
00afebb0	mov x20,xzr
00afebb4	b 0x00afebe8
00afebb8	bl 0x00c342a0
00afebbc	adrp x0,0x2b4000
00afebc0	adrp x2,0x2c8000
00afebc4	add x0,x0,#0xa61
00afebc8	add x2,x2,#0x3ed
00afebcc	mov w1,#0x23
00afebd0	bl 0x00c342b0
00afebd4	mov w1,#0x100
00afebd8	mov w0,#0x22
00afebdc	movk w1,#0xc, LSL #16
00afebe0	mov x2,xzr
00afebe4	bl 0x00c342c0
00afebe8	ldp x29,x30,[sp, #0x10]
00afebec	mov x0,x20
00afebf0	ldp x20,x19,[sp], #0x20
00afebf4	ret
