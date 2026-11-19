; FUN_00b32db8 @ 00b32db8
00b32db8	stp x22,x21,[sp, #-0x30]!
00b32dbc	stp x20,x19,[sp, #0x10]
00b32dc0	stp x29,x30,[sp, #0x20]
00b32dc4	add x29,sp,#0x20
00b32dc8	mov x22,x3
00b32dcc	mov x19,x2
00b32dd0	mov x21,x1
00b32dd4	mov x20,x0
00b32dd8	bl 0x00c41000
00b32ddc	mov w8,w0
00b32de0	cmp x22,#0x20
00b32de4	mov w0,wzr
00b32de8	b.cc 0x00b32e0c
00b32dec	cbz w8,0x00b32e0c
00b32df0	mov x0,x21
00b32df4	mov x1,x20
00b32df8	bl 0x00c401d0
00b32dfc	cbz w0,0x00b32e0c
00b32e00	mov w8,#0x20
00b32e04	mov w0,#0x1
00b32e08	str x8,[x19]
00b32e0c	ldp x29,x30,[sp, #0x20]
00b32e10	ldp x20,x19,[sp, #0x10]
00b32e14	ldp x22,x21,[sp], #0x30
00b32e18	ret
