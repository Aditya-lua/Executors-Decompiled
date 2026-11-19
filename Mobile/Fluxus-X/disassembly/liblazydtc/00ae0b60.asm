; ossl_keccak_kmac_init @ 00ae0b60
00ae0b60	stp x22,x21,[sp, #-0x30]!
00ae0b64	mov w8,#0x640
00ae0b68	sub x8,x8,x2, LSL #0x1
00ae0b6c	stp x20,x19,[sp, #0x10]
00ae0b70	mov x19,x0
00ae0b74	cmp x8,#0x547
00ae0b78	mov w0,wzr
00ae0b7c	stp x29,x30,[sp, #0x20]
00ae0b80	add x29,sp,#0x20
00ae0b84	b.hi 0x00ae0bbc
00ae0b88	mov x21,x2
00ae0b8c	mov w20,w1
00ae0b90	mov w2,#0xc8
00ae0b94	mov x0,x19
00ae0b98	mov w1,wzr
00ae0b9c	lsr x22,x8,#0x3
00ae0ba0	bl 0x00c301c0
00ae0ba4	lsr x8,x21,#0x2
00ae0ba8	and x8,x8,#0x3ffffffffffffffe
00ae0bac	mov w0,#0x1
00ae0bb0	strb w20,[x19, #0x188]
00ae0bb4	str x22,[x19, #0xc8]
00ae0bb8	stp x8,xzr,[x19, #0xd0]
00ae0bbc	ldp x29,x30,[sp, #0x20]
00ae0bc0	ldp x20,x19,[sp, #0x10]
00ae0bc4	ldp x22,x21,[sp], #0x30
00ae0bc8	ret
