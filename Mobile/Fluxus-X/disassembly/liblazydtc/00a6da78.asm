; EVP_PKEY_set1_DSA @ 00a6da78
00a6da78	stp x20,x19,[sp, #-0x20]!
00a6da7c	mov x19,x1
00a6da80	mov w1,#0x74
00a6da84	mov x2,x19
00a6da88	stp x29,x30,[sp, #0x10]
00a6da8c	add x29,sp,#0x10
00a6da90	bl 0x00a6d628
00a6da94	mov w20,w0
00a6da98	cbz w0,0x00a6daa4
00a6da9c	mov x0,x19
00a6daa0	bl 0x00c3a2f0
00a6daa4	ldp x29,x30,[sp, #0x10]
00a6daa8	mov w0,w20
00a6daac	ldp x20,x19,[sp], #0x20
00a6dab0	ret
