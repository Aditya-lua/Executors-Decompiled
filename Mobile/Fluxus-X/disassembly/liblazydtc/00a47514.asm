; ossl_ed448_verify @ 00a47514
00a47514	sub sp,sp,#0x20
00a47518	mov x8,x6
00a4751c	mov x9,x2
00a47520	mov x10,x1
00a47524	mov x6,x5
00a47528	str x7,[sp]
00a4752c	mov x1,x3
00a47530	mov x2,x4
00a47534	mov x3,x10
00a47538	mov x4,x9
00a4753c	mov w5,wzr
00a47540	mov w7,w8
00a47544	stp x29,x30,[sp, #0x10]
00a47548	add x29,sp,#0x10
00a4754c	bl 0x00a472d4
00a47550	ldp x29,x30,[sp, #0x10]
00a47554	cmn w0,#0x1
00a47558	cset w0,eq
00a4755c	add sp,sp,#0x20
00a47560	ret
