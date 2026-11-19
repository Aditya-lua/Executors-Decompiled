; EVP_MAC_is_a @ 00a6895c
00a6895c	cbz x0,0x00a6898c
00a68960	stp x29,x30,[sp, #-0x10]!
00a68964	ldr x8,[x0]
00a68968	mov x3,x1
00a6896c	ldr w1,[x0, #0x8]
00a68970	mov x2,xzr
00a68974	mov x0,x8
00a68978	mov x29,sp
00a6897c	bl 0x00c3bf70
00a68980	cmp w0,#0x0
00a68984	cset w0,ne
00a68988	ldp x29,x30,[sp], #0x10
00a6898c	ret
