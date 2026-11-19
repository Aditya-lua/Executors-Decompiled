; ossl_ffc_validate_public_key_partial @ 00a7cd0c
00a7cd0c	str x23,[sp, #-0x40]!
00a7cd10	stp x20,x19,[sp, #0x20]
00a7cd14	mov x20,x2
00a7cd18	stp x22,x21,[sp, #0x10]
00a7cd1c	stp x29,x30,[sp, #0x30]
00a7cd20	add x29,sp,#0x30
00a7cd24	str wzr,[x2]
00a7cd28	cbz x0,0x00a7cdd4
00a7cd2c	mov x21,x1
00a7cd30	cbz x1,0x00a7cdd4
00a7cd34	ldr x8,[x0]
00a7cd38	mov x22,x0
00a7cd3c	cbz x8,0x00a7cdd4
00a7cd40	mov x0,xzr
00a7cd44	bl 0x00c38a60
00a7cd48	cbz x0,0x00a7cdfc
00a7cd4c	mov x19,x0
00a7cd50	bl 0x00c38a90
00a7cd54	mov x0,x19
00a7cd58	bl 0x00c38a40
00a7cd5c	cbz x0,0x00a7cde4
00a7cd60	mov w1,#0x1
00a7cd64	mov x23,x0
00a7cd68	bl 0x00c37720
00a7cd6c	cbz w0,0x00a7cde4
00a7cd70	mov x0,x21
00a7cd74	mov x1,x23
00a7cd78	bl 0x00c38cc0
00a7cd7c	cmp w0,#0x0
00a7cd80	b.gt 0x00a7cd90
00a7cd84	ldr w8,[x20]
00a7cd88	orr w8,w8,#0x1
00a7cd8c	str w8,[x20]
00a7cd90	ldr x1,[x22]
00a7cd94	mov x0,x23
00a7cd98	bl 0x00c36990
00a7cd9c	cbz x0,0x00a7cde4
00a7cda0	mov w1,#0x1
00a7cda4	mov x0,x23
00a7cda8	bl 0x00c38fd0
00a7cdac	cbz w0,0x00a7cde4
00a7cdb0	mov x0,x21
00a7cdb4	mov x1,x23
00a7cdb8	bl 0x00c38cc0
00a7cdbc	tbnz w0,#0x1f,0x00a7cdcc
00a7cdc0	ldr w8,[x20]
00a7cdc4	orr w8,w8,#0x2
00a7cdc8	str w8,[x20]
00a7cdcc	mov w20,#0x1
00a7cdd0	b 0x00a7cde8
00a7cdd4	mov w8,#0x40
00a7cdd8	str w8,[x20]
00a7cddc	mov w20,#0x1
00a7cde0	b 0x00a7ce00
00a7cde4	mov w20,wzr
00a7cde8	mov x0,x19
00a7cdec	bl 0x00c38a20
00a7cdf0	mov x0,x19
00a7cdf4	bl 0x00c38a30
00a7cdf8	b 0x00a7ce00
00a7cdfc	mov w20,wzr
00a7ce00	mov w0,w20
00a7ce04	ldp x29,x30,[sp, #0x30]
00a7ce08	ldp x20,x19,[sp, #0x20]
00a7ce0c	ldp x22,x21,[sp, #0x10]
00a7ce10	ldr x23,[sp], #0x40
00a7ce14	ret
