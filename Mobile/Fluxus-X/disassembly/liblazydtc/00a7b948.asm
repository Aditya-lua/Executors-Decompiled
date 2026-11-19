; EVP_SIGNATURE_is_a @ 00a7b948
00a7b948	cbz x0,0x00a7b978
00a7b94c	stp x29,x30,[sp, #-0x10]!
00a7b950	ldr x8,[x0, #0x18]
00a7b954	mov x3,x1
00a7b958	ldr w1,[x0]
00a7b95c	mov x2,xzr
00a7b960	mov x0,x8
00a7b964	mov x29,sp
00a7b968	bl 0x00c3bf70
00a7b96c	cmp w0,#0x0
00a7b970	cset w0,ne
00a7b974	ldp x29,x30,[sp], #0x10
00a7b978	ret
