; ZSTD_nextInputType @ 00bb0f3c
00bb0f3c	mov w8,#0x752c
00bb0f40	ldr w8,[x0, x8#0x0]
00bb0f44	sub w8,w8,#0x2
00bb0f48	cmp w8,#0x5
00bb0f4c	b.hi 0x00bb0f60
00bb0f50	adrp x9,0x789000
00bb0f54	add x9,x9,#0x194
00bb0f58	ldr w0,[x9, w8, UXTW #0x2]
00bb0f5c	ret
00bb0f60	mov w0,wzr
00bb0f64	ret
