; ossl_provider_up_ref @ 00aa2bec
00aa2bec	stp x20,x19,[sp, #-0x20]!
00aa2bf0	mov x19,x0
00aa2bf4	add x8,x0,#0x10
00aa2bf8	stp x29,x30,[sp, #0x10]
00aa2bfc	add x29,sp,#0x10
00aa2c00	ldxr w9,[x8]
00aa2c04	add w20,w9,#0x1
00aa2c08	stxr w9,w20,[x8]
00aa2c0c	cbnz w9,0x00aa2c00
00aa2c10	ldrb w8,[x19, #0xc8]
00aa2c14	tbz w8,#0x0,0x00aa2c34
00aa2c18	mov x0,x19
00aa2c1c	mov w1,wzr
00aa2c20	bl 0x00c3eb90
00aa2c24	cbnz w0,0x00aa2c34
00aa2c28	mov x0,x19
00aa2c2c	bl 0x00aa2c44
00aa2c30	mov w20,wzr
00aa2c34	ldp x29,x30,[sp, #0x10]
00aa2c38	mov w0,w20
00aa2c3c	ldp x20,x19,[sp], #0x20
00aa2c40	ret
