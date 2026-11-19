; FUN_0095c6a8 @ 0095c6a8
0095c6a8	cbz x0,0x0095c6c4
0095c6ac	ldrsb w8,[x0]
0095c6b0	cbz w8,0x0095c6cc
0095c6b4	add x0,x0,#0x1
0095c6b8	tbz w8,#0x1f,0x0095c6ac
0095c6bc	mov w0,wzr
0095c6c0	ret
0095c6c4	mov w0,#0x1
0095c6c8	ret
0095c6cc	mov w0,#0x1
0095c6d0	ret
