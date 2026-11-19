; CRYPTO_zalloc @ 00a999e8
00a999e8	stp x20,x19,[sp, #-0x20]!
00a999ec	stp x29,x30,[sp, #0x10]
00a999f0	adrp x8,0xcc9000
00a999f4	adrp x9,0xcb4000
00a999f8	ldr x8,[x8, #0x138]
00a999fc	ldr x9,[x9, #0xe68]
00a99a00	mov x19,x0
00a99a04	add x29,sp,#0x10
00a99a08	cmp x8,x9
00a99a0c	b.eq 0x00a99a24
00a99a10	mov x0,x19
00a99a14	blr x8
00a99a18	mov x20,x0
00a99a1c	cbnz x0,0x00a99a4c
00a99a20	b 0x00a99a64
00a99a24	cbz x19,0x00a99a60
00a99a28	adrp x8,0xd22000
00a99a2c	ldrb w9,[x8, #0xe8]
00a99a30	tbnz w9,#0x0,0x00a99a3c
00a99a34	mov w9,#0x1
00a99a38	strb w9,[x8, #0xe8]
00a99a3c	mov x0,x19
00a99a40	bl 0x00c308d0
00a99a44	mov x20,x0
00a99a48	cbz x0,0x00a99a64
00a99a4c	mov x0,x20
00a99a50	mov w1,wzr
00a99a54	mov x2,x19
00a99a58	bl 0x00c301c0
00a99a5c	b 0x00a99a64
00a99a60	mov x20,xzr
00a99a64	ldp x29,x30,[sp, #0x10]
00a99a68	mov x0,x20
00a99a6c	ldp x20,x19,[sp], #0x20
00a99a70	ret
