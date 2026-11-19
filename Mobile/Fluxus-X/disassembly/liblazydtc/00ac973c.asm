; EVP_RAND_is_a @ 00ac973c
00ac973c	cbz x0,0x00ac976c
00ac9740	stp x29,x30,[sp, #-0x10]!
00ac9744	ldr x8,[x0]
00ac9748	mov x3,x1
00ac974c	ldr w1,[x0, #0x8]
00ac9750	mov x2,xzr
00ac9754	mov x0,x8
00ac9758	mov x29,sp
00ac975c	bl 0x00c3bf70
00ac9760	cmp w0,#0x0
00ac9764	cset w0,ne
00ac9768	ldp x29,x30,[sp], #0x10
00ac976c	ret
