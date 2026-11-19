; mbedtls_oid_get_oid_by_pk_alg @ 00ba99c4
00ba99c4	sub w8,w0,#0x1
00ba99c8	cmp w8,#0x2
00ba99cc	b.hi 0x00ba9a00
00ba99d0	adrp x9,0xcac000
00ba99d4	sbfiz x8,x8,#0x3,#0x20
00ba99d8	add x9,x9,#0x560
00ba99dc	adrp x10,0xcac000
00ba99e0	ldr x9,[x9, x8#0x0]
00ba99e4	add x10,x10,#0x580
00ba99e8	ldr x8,[x10, x8#0x0]
00ba99ec	mov w0,wzr
00ba99f0	str x9,[x1]
00ba99f4	ldr x8,[x8, #0x8]
00ba99f8	str x8,[x2]
00ba99fc	ret
00ba9a00	mov w0,#0xffffffd2
00ba9a04	ret
