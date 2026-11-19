; mbedtls_psa_hash_clone @ 00b9d8b0
00b9d8b0	stp x20,x19,[sp, #-0x20]!
00b9d8b4	stp x29,x30,[sp, #0x10]
00b9d8b8	add x29,sp,#0x10
00b9d8bc	ldr w8,[x0]
00b9d8c0	mov w9,#0xfffd
00b9d8c4	movk w9,#0xfdff, LSL #16
00b9d8c8	mov x19,x0
00b9d8cc	add w9,w8,w9
00b9d8d0	cmp w9,#0x10
00b9d8d4	mov x20,x1
00b9d8d8	b.hi 0x00b9d920
00b9d8dc	adrp x8,0x787000
00b9d8e0	add x8,x8,#0x5b0
00b9d8e4	ldrsw x9,[x8, x9, LSL #0x2]
00b9d8e8	add x8,x9,x8
00b9d8ec	br x8
00b9d8f0	add x0,x20,#0x8
00b9d8f4	add x1,x19,#0x8
00b9d8f8	bl 0x00c42ae0
00b9d8fc	b 0x00b9d960
00b9d900	add x0,x20,#0x8
00b9d904	add x1,x19,#0x8
00b9d908	bl 0x00c42a80
00b9d90c	b 0x00b9d960
00b9d910	add x0,x20,#0x8
00b9d914	add x1,x19,#0x8
00b9d918	bl 0x00c42b50
00b9d91c	b 0x00b9d960
00b9d920	cbnz w8,0x00b9d92c
00b9d924	mov w0,#0xffffff77
00b9d928	b 0x00b9d96c
00b9d92c	mov w0,#0xffffff7a
00b9d930	b 0x00b9d96c
00b9d934	add x0,x20,#0x8
00b9d938	add x1,x19,#0x8
00b9d93c	bl 0x00c428f0
00b9d940	b 0x00b9d960
00b9d944	add x0,x20,#0x8
00b9d948	add x1,x19,#0x8
00b9d94c	bl 0x00c429a0
00b9d950	b 0x00b9d960
00b9d954	add x0,x20,#0x8
00b9d958	add x1,x19,#0x8
00b9d95c	bl 0x00c42a10
00b9d960	ldr w8,[x19]
00b9d964	mov w0,wzr
00b9d968	str w8,[x20]
00b9d96c	ldp x29,x30,[sp, #0x10]
00b9d970	ldp x20,x19,[sp], #0x20
00b9d974	ret
