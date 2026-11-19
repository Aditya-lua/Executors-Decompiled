; mbedtls_psa_hash_update @ 00b9d978
00b9d978	stp x29,x30,[sp, #-0x10]!
00b9d97c	mov x29,sp
00b9d980	ldr w8,[x0]
00b9d984	mov w9,#0xfffd
00b9d988	movk w9,#0xfdff, LSL #16
00b9d98c	add w8,w8,w9
00b9d990	cmp w8,#0x10
00b9d994	b.hi 0x00b9da0c
00b9d998	adrp x9,0x787000
00b9d99c	add x9,x9,#0x5f4
00b9d9a0	ldrsw x8,[x9, x8, LSL #0x2]
00b9d9a4	add x8,x8,x9
00b9d9a8	br x8
00b9d9ac	add x0,x0,#0x8
00b9d9b0	bl 0x00c42b30
00b9d9b4	ldp x29,x30,[sp], #0x10
00b9d9b8	b 0x00c42bf0
00b9d9bc	add x0,x0,#0x8
00b9d9c0	bl 0x00c42ad0
00b9d9c4	ldp x29,x30,[sp], #0x10
00b9d9c8	b 0x00c42bf0
00b9d9cc	add x0,x0,#0x8
00b9d9d0	bl 0x00c42ba0
00b9d9d4	ldp x29,x30,[sp], #0x10
00b9d9d8	b 0x00c42bf0
00b9d9dc	add x0,x0,#0x8
00b9d9e0	bl 0x00c42940
00b9d9e4	ldp x29,x30,[sp], #0x10
00b9d9e8	b 0x00c42bf0
00b9d9ec	add x0,x0,#0x8
00b9d9f0	bl 0x00c429f0
00b9d9f4	ldp x29,x30,[sp], #0x10
00b9d9f8	b 0x00c42bf0
00b9d9fc	add x0,x0,#0x8
00b9da00	bl 0x00c42a60
00b9da04	ldp x29,x30,[sp], #0x10
00b9da08	b 0x00c42bf0
00b9da0c	mov w0,#0xffffff77
00b9da10	ldp x29,x30,[sp], #0x10
00b9da14	ret
