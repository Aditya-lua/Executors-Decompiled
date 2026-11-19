; mbedtls_asn1_find_named_data @ 00b7d168
00b7d168	str x21,[sp, #-0x30]!
00b7d16c	stp x20,x19,[sp, #0x10]
00b7d170	stp x29,x30,[sp, #0x20]
00b7d174	add x29,sp,#0x20
00b7d178	mov x20,x2
00b7d17c	mov x21,x1
00b7d180	mov x19,x0
00b7d184	cbz x0,0x00b7d1b0
00b7d188	ldr x8,[x19, #0x8]
00b7d18c	cmp x8,x20
00b7d190	b.ne 0x00b7d1a8
00b7d194	ldr x0,[x19, #0x10]
00b7d198	mov x1,x21
00b7d19c	mov x2,x20
00b7d1a0	bl 0x00c300b0
00b7d1a4	cbz w0,0x00b7d1b0
00b7d1a8	ldr x19,[x19, #0x30]
00b7d1ac	cbnz x19,0x00b7d188
00b7d1b0	mov x0,x19
00b7d1b4	ldp x29,x30,[sp, #0x20]
00b7d1b8	ldp x20,x19,[sp, #0x10]
00b7d1bc	ldr x21,[sp], #0x30
00b7d1c0	ret
