; CRYPTO_secure_allocated @ 00a9a874
00a9a874	adrp x8,0xd22000
00a9a878	ldrb w8,[x8, #0xf0]
00a9a87c	cmp w8,#0x1
00a9a880	mov w8,wzr
00a9a884	b.ne 0x00a9a8ac
00a9a888	adrp x8,0xd22000
00a9a88c	add x8,x8,#0x108
00a9a890	ldp x9,x8,[x8, #0x10]
00a9a894	cmp x9,x0
00a9a898	add x8,x9,x8
00a9a89c	cset w9,ls
00a9a8a0	cmp x8,x0
00a9a8a4	cset w8,hi
00a9a8a8	and w8,w9,w8
00a9a8ac	mov w0,w8
00a9a8b0	ret
