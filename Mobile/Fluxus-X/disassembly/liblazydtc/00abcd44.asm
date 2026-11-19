; PKCS12_add_localkeyid @ 00abcd44
00abcd44	stp x29,x30,[sp, #-0x10]!
00abcd48	mov w4,w2
00abcd4c	mov x3,x1
00abcd50	add x0,x0,#0x10
00abcd54	mov w1,#0x9d
00abcd58	mov w2,#0x4
00abcd5c	mov x29,sp
00abcd60	bl 0x00c37f00
00abcd64	cmp x0,#0x0
00abcd68	cset w0,ne
00abcd6c	ldp x29,x30,[sp], #0x10
00abcd70	ret
