; mbedtls_psa_hash_abort @ 00b9d648
00b9d648	str x19,[sp, #-0x20]!
00b9d64c	stp x29,x30,[sp, #0x10]
00b9d650	add x29,sp,#0x10
00b9d654	ldr w8,[x0]
00b9d658	mov w9,#0xfffd
00b9d65c	movk w9,#0xfdff, LSL #16
00b9d660	mov x19,x0
00b9d664	add w9,w8,w9
00b9d668	cmp w9,#0x10
00b9d66c	mov w0,#0xffffff77
00b9d670	b.hi 0x00b9d6ac
00b9d674	adrp x8,0x787000
00b9d678	add x8,x8,#0x528
00b9d67c	ldrsw x9,[x8, x9, LSL #0x2]
00b9d680	add x8,x9,x8
00b9d684	br x8
00b9d688	add x0,x19,#0x8
00b9d68c	bl 0x00c42b00
00b9d690	b 0x00b9d6d4
00b9d694	add x0,x19,#0x8
00b9d698	bl 0x00c42b70
00b9d69c	b 0x00b9d6d4
00b9d6a0	add x0,x19,#0x8
00b9d6a4	bl 0x00c42aa0
00b9d6a8	b 0x00b9d6d4
00b9d6ac	cbz w8,0x00b9d6d4
00b9d6b0	b 0x00b9d6dc
00b9d6b4	add x0,x19,#0x8
00b9d6b8	bl 0x00c42910
00b9d6bc	b 0x00b9d6d4
00b9d6c0	add x0,x19,#0x8
00b9d6c4	bl 0x00c429c0
00b9d6c8	b 0x00b9d6d4
00b9d6cc	add x0,x19,#0x8
00b9d6d0	bl 0x00c42a30
00b9d6d4	mov w0,wzr
00b9d6d8	str wzr,[x19]
00b9d6dc	ldp x29,x30,[sp, #0x10]
00b9d6e0	ldr x19,[sp], #0x20
00b9d6e4	ret
