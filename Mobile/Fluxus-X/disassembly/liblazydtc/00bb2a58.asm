; ZSTD_DCtx_setMaxWindowSize @ 00bb2a58
00bb2a58	mov w8,#0x761c
00bb2a5c	ldr w8,[x0, x8#0x0]
00bb2a60	cbz w8,0x00bb2a6c
00bb2a64	mov x0,#-0x3c
00bb2a68	ret
00bb2a6c	mov x8,#-0x80000001
00bb2a70	orr x9,xzr,#-0x7ffffc01
00bb2a74	add x8,x1,x8
00bb2a78	cmp x8,x9
00bb2a7c	b.cs 0x00bb2a88
00bb2a80	mov x0,#-0x2a
00bb2a84	ret
00bb2a88	mov x8,x0
00bb2a8c	mov x0,xzr
00bb2a90	str x1,[x8, #0x7638]
00bb2a94	ret
