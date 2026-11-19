; ossl_ccm_stream_update @ 00b66ce4
00b66ce4	stp x29,x30,[sp, #-0x10]!
00b66ce8	cmp x3,x5
00b66cec	mov x29,sp
00b66cf0	b.cs 0x00b66d1c
00b66cf4	bl 0x00c342a0
00b66cf8	adrp x0,0x2d8000
00b66cfc	adrp x2,0x2a1000
00b66d00	add x0,x0,#0xcd7
00b66d04	add x2,x2,#0x19f
00b66d08	mov w1,#0x114
00b66d0c	bl 0x00c342b0
00b66d10	mov w0,#0x39
00b66d14	mov w1,#0x6a
00b66d18	b 0x00b66d5c
00b66d1c	mov x3,x4
00b66d20	mov x4,x5
00b66d24	bl 0x00b66d70
00b66d28	cbz w0,0x00b66d38
00b66d2c	mov w0,#0x1
00b66d30	ldp x29,x30,[sp], #0x10
00b66d34	ret
00b66d38	bl 0x00c342a0
00b66d3c	adrp x0,0x2d8000
00b66d40	adrp x2,0x2a1000
00b66d44	add x0,x0,#0xcd7
00b66d48	add x2,x2,#0x19f
00b66d4c	mov w1,#0x119
00b66d50	bl 0x00c342b0
00b66d54	mov w0,#0x39
00b66d58	mov w1,#0x66
00b66d5c	mov x2,xzr
00b66d60	bl 0x00c342c0
00b66d64	mov w0,wzr
00b66d68	ldp x29,x30,[sp], #0x10
00b66d6c	ret
