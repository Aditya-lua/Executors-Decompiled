; EVP_PKEY_print_private_fp @ 00a6e50c
00a6e50c	stp x22,x21,[sp, #-0x30]!
00a6e510	mov x21,x1
00a6e514	mov w1,wzr
00a6e518	stp x20,x19,[sp, #0x10]
00a6e51c	stp x29,x30,[sp, #0x20]
00a6e520	add x29,sp,#0x20
00a6e524	mov x19,x3
00a6e528	mov w20,w2
00a6e52c	bl 0x00c37810
00a6e530	cbz x0,0x00a6e574
00a6e534	ldr x8,[x21, #0x8]
00a6e538	mov x22,x0
00a6e53c	cbz x8,0x00a6e548
00a6e540	ldr x4,[x8, #0x50]
00a6e544	b 0x00a6e54c
00a6e548	mov x4,xzr
00a6e54c	mov w3,#0x85
00a6e550	mov x0,x21
00a6e554	mov x1,x22
00a6e558	mov w2,w20
00a6e55c	mov x5,x19
00a6e560	bl 0x00a6e250
00a6e564	mov w19,w0
00a6e568	mov x0,x22
00a6e56c	bl 0x00c31a40
00a6e570	mov w0,w19
00a6e574	ldp x29,x30,[sp, #0x20]
00a6e578	ldp x20,x19,[sp, #0x10]
00a6e57c	ldp x22,x21,[sp], #0x30
00a6e580	ret
