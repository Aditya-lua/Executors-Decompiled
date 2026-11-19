; mbedtls_oid_get_oid_by_ec_grp @ 00ba9be0
00ba9be0	sub w8,w0,#0x1
00ba9be4	cmp w8,#0xb
00ba9be8	b.hi 0x00ba9c04
00ba9bec	and x9,x8,#0xffff
00ba9bf0	mov w10,#0xeff
00ba9bf4	lsr w9,w10,w9
00ba9bf8	tbnz w9,#0x0,0x00ba9c0c
00ba9bfc	mov w0,#0xffffffd2
00ba9c00	ret
00ba9c04	mov w0,#0xffffffd2
00ba9c08	ret
00ba9c0c	adrp x9,0xcac000
00ba9c10	sbfiz x8,x8,#0x3,#0x20
00ba9c14	add x9,x9,#0x5a0
00ba9c18	adrp x10,0xcac000
00ba9c1c	ldr x9,[x9, x8#0x0]
00ba9c20	add x10,x10,#0x600
00ba9c24	ldr x8,[x10, x8#0x0]
00ba9c28	mov w0,wzr
00ba9c2c	str x9,[x1]
00ba9c30	ldr x8,[x8, #0x8]
00ba9c34	str x8,[x2]
00ba9c38	ret
