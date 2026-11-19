; OPENSSL_sk_shift @ 00ae912c
00ae912c	stp x20,x19,[sp, #-0x20]!
00ae9130	stp x29,x30,[sp, #0x10]
00ae9134	add x29,sp,#0x10
00ae9138	cbz x0,0x00ae9174
00ae913c	ldr w8,[x0]
00ae9140	mov x20,x0
00ae9144	cbz w8,0x00ae9174
00ae9148	ldr x0,[x20, #0x8]
00ae914c	subs w8,w8,#0x1
00ae9150	ldr x19,[x0]
00ae9154	b.eq 0x00ae916c
00ae9158	add x1,x0,#0x8
00ae915c	sbfiz x2,x8,#0x3,#0x20
00ae9160	bl 0x00c2ff60
00ae9164	ldr w8,[x20]
00ae9168	sub w8,w8,#0x1
00ae916c	str w8,[x20]
00ae9170	b 0x00ae9178
00ae9174	mov x19,xzr
00ae9178	ldp x29,x30,[sp, #0x10]
00ae917c	mov x0,x19
00ae9180	ldp x20,x19,[sp], #0x20
00ae9184	ret
