; mbedtls_rsa_set_padding @ 00ba6810
00ba6810	str x21,[sp, #-0x30]!
00ba6814	stp x20,x19,[sp, #0x10]
00ba6818	stp x29,x30,[sp, #0x20]
00ba681c	add x29,sp,#0x20
00ba6820	mov w19,w2
00ba6824	mov w20,w1
00ba6828	cmp w1,#0x1
00ba682c	mov x21,x0
00ba6830	b.hi 0x00ba6854
00ba6834	b.ne 0x00ba6848
00ba6838	cbz w19,0x00ba6848
00ba683c	mov w0,w19
00ba6840	bl 0x00c30210
00ba6844	cbz x0,0x00ba6854
00ba6848	mov w0,wzr
00ba684c	stp w20,w19,[x21, #0xe0]
00ba6850	b 0x00ba6858
00ba6854	mov w0,#0xffffbf00
00ba6858	ldp x29,x30,[sp, #0x20]
00ba685c	ldp x20,x19,[sp, #0x10]
00ba6860	ldr x21,[sp], #0x30
00ba6864	ret
