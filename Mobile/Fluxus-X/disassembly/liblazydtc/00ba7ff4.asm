; mbedtls_rsa_pkcs1_decrypt @ 00ba7ff4
00ba7ff4	ldr w9,[x0, #0xe0]
00ba7ff8	mov x7,x5
00ba7ffc	mov x8,x4
00ba8000	mov x5,x3
00ba8004	cmp w9,#0x1
00ba8008	b.eq 0x00ba8020
00ba800c	cbnz w9,0x00ba804c
00ba8010	mov x3,x5
00ba8014	mov x4,x8
00ba8018	mov x5,x7
00ba801c	b 0x00c43480
00ba8020	sub sp,sp,#0x20
00ba8024	stp x29,x30,[sp, #0x10]
00ba8028	add x29,sp,#0x10
00ba802c	str x6,[sp]
00ba8030	mov x3,xzr
00ba8034	mov x4,xzr
00ba8038	mov x6,x8
00ba803c	bl 0x00c43370
00ba8040	ldp x29,x30,[sp, #0x10]
00ba8044	add sp,sp,#0x20
00ba8048	ret
00ba804c	mov w0,#0xffffbf00
00ba8050	ret
