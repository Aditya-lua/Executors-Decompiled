; ZSTD_XXH32_reset @ 00bc1a64
00bc1a64	dup v1.2S,w1
00bc1a68	adrp x9,0x29a000
00bc1a6c	movi v0.2D,#0x0
00bc1a70	ldr d2,[x9, #0x868]
00bc1a74	mov w9,#0x864f
00bc1a78	mov x8,x0
00bc1a7c	movk w9,#0x61c8, LSL #16
00bc1a80	mov w0,wzr
00bc1a84	add w9,w1,w9
00bc1a88	add v1.2S,v1.2S,v2.2S
00bc1a8c	stp q0,q0,[x8]
00bc1a90	str q0,[x8, #0x20]
00bc1a94	stp w1,w9,[x8, #0x10]
00bc1a98	str d1,[x8, #0x8]
00bc1a9c	ret
