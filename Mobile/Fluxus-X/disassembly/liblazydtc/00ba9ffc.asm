; mbedtls_oid_get_oid_by_md @ 00ba9ffc
00ba9ffc	sub w8,w0,#0x3
00baa000	cmp w8,#0x10
00baa004	b.hi 0x00baa020
00baa008	mov w9,#0xe1e7
00baa00c	movk w9,#0x1, LSL #16
00baa010	lsr w9,w9,w8
00baa014	tbnz w9,#0x0,0x00baa028
00baa018	mov w0,#0xffffffd2
00baa01c	ret
00baa020	mov w0,#0xffffffd2
00baa024	ret
00baa028	adrp x9,0xcac000
00baa02c	sbfiz x8,x8,#0x3,#0x20
00baa030	add x9,x9,#0x660
00baa034	adrp x10,0xcac000
00baa038	ldr x9,[x9, x8#0x0]
00baa03c	add x10,x10,#0x6f0
00baa040	ldr x8,[x10, x8#0x0]
00baa044	mov w0,wzr
00baa048	str x9,[x1]
00baa04c	ldr x8,[x8, #0x8]
00baa050	str x8,[x2]
00baa054	ret
