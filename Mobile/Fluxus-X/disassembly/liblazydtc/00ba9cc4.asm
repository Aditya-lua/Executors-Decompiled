; mbedtls_oid_get_oid_by_ec_grp_algid @ 00ba9cc4
00ba9cc4	adrp x8,0xcab000
00ba9cc8	cmp w0,#0x9
00ba9ccc	add x8,x8,#0x910
00ba9cd0	b.eq 0x00ba9cec
00ba9cd4	cmp w0,#0xd
00ba9cd8	b.ne 0x00ba9d08
00ba9cdc	adrp x9,0x2c2000
00ba9ce0	add x8,x8,#0x28
00ba9ce4	add x9,x9,#0xc28
00ba9ce8	b 0x00ba9cf4
00ba9cec	adrp x9,0x2b6000
00ba9cf0	add x9,x9,#0xb02
00ba9cf4	str x9,[x1]
00ba9cf8	ldr x8,[x8, #0x8]
00ba9cfc	mov w0,wzr
00ba9d00	str x8,[x2]
00ba9d04	ret
00ba9d08	mov w0,#0xffffffd2
00ba9d0c	ret
