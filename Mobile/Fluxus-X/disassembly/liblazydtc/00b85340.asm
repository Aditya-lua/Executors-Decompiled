; mbedtls_asn1_write_tag @ 00b85340
00b85340	ldr x8,[x0]
00b85344	sub x9,x8,x1
00b85348	cmp x9,#0x1
00b8534c	b.lt 0x00b85364
00b85350	sub x9,x8,#0x1
00b85354	str x9,[x0]
00b85358	mov w0,#0x1
00b8535c	sturb w2,[x8, #-0x1]
00b85360	ret
00b85364	mov w0,#0xffffff94
00b85368	ret
