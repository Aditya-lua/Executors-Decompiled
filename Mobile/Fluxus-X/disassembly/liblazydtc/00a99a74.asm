; CRYPTO_realloc @ 00a99a74
00a99a74	stp x29,x30,[sp, #-0x10]!
00a99a78	adrp x8,0xcc9000
00a99a7c	ldr x4,[x8, #0x140]
00a99a80	adrp x8,0xcb5000
00a99a84	ldr x8,[x8, #0x188]
00a99a88	mov x29,sp
00a99a8c	cmp x4,x8
00a99a90	b.eq 0x00a99a9c
00a99a94	ldp x29,x30,[sp], #0x10
00a99a98	br x4
00a99a9c	cbz x0,0x00a99aac
00a99aa0	cbz x1,0x00a99ad8
00a99aa4	ldp x29,x30,[sp], #0x10
00a99aa8	b 0x00c30950
00a99aac	adrp x8,0xcc9000
00a99ab0	ldr x4,[x8, #0x138]
00a99ab4	adrp x8,0xcb4000
00a99ab8	ldr x8,[x8, #0xe68]
00a99abc	cmp x4,x8
00a99ac0	b.eq 0x00a99b00
00a99ac4	mov x0,x1
00a99ac8	mov x1,x2
00a99acc	mov w2,w3
00a99ad0	ldp x29,x30,[sp], #0x10
00a99ad4	br x4
00a99ad8	adrp x8,0xcc9000
00a99adc	adrp x9,0xcb4000
00a99ae0	ldr x8,[x8, #0x148]
00a99ae4	ldr x9,[x9, #0xe60]
00a99ae8	cmp x8,x9
00a99aec	b.eq 0x00a99b24
00a99af0	mov x1,x2
00a99af4	mov w2,w3
00a99af8	blr x8
00a99afc	b 0x00a99b28
00a99b00	cbz x1,0x00a99b28
00a99b04	adrp x8,0xd22000
00a99b08	ldrb w9,[x8, #0xe8]
00a99b0c	tbnz w9,#0x0,0x00a99b18
00a99b10	mov w9,#0x1
00a99b14	strb w9,[x8, #0xe8]
00a99b18	mov x0,x1
00a99b1c	ldp x29,x30,[sp], #0x10
00a99b20	b 0x00c308d0
00a99b24	bl 0x00c30960
00a99b28	mov x0,xzr
00a99b2c	ldp x29,x30,[sp], #0x10
00a99b30	ret
