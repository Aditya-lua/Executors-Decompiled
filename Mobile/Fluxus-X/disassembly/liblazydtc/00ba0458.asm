; mbedtls_psa_pake_get_implicit_key @ 00ba0458
00ba0458	ldr w8,[x0]
00ba045c	mov w9,#0x100
00ba0460	movk w9,#0xa00, LSL #16
00ba0464	cmp w8,w9
00ba0468	b.ne 0x00ba04b8
00ba046c	stp x29,x30,[sp, #-0x10]!
00ba0470	mov x29,sp
00ba0474	adrp x4,0xcb5000
00ba0478	ldr x4,[x4, #0xac0]
00ba047c	add x0,x0,#0x180
00ba0480	mov x5,xzr
00ba0484	bl 0x00c42600
00ba0488	mov w8,#0xffffb37f
00ba048c	cmp w0,w8
00ba0490	ldp x29,x30,[sp], #0x10
00ba0494	b.le 0x00ba04c0
00ba0498	cmn w0,#0x9
00ba049c	b.le 0x00ba04e8
00ba04a0	cbz w0,0x00ba0520
00ba04a4	cmn w0,#0x4
00ba04a8	b.eq 0x00ba051c
00ba04ac	cmn w0,#0x8
00ba04b0	b.eq 0x00ba0524
00ba04b4	b 0x00ba0534
00ba04b8	mov w0,#0xffffff7a
00ba04bc	ret
00ba04c0	mov w8,#0xffffb0ff
00ba04c4	cmp w0,w8
00ba04c8	b.gt 0x00ba0504
00ba04cc	mov w8,#0xffffaf80
00ba04d0	cmp w0,w8
00ba04d4	b.eq 0x00ba052c
00ba04d8	mov w8,#0xffffb080
00ba04dc	cmp w0,w8
00ba04e0	b.eq 0x00ba051c
00ba04e4	b 0x00ba0534
00ba04e8	mov w8,#0xffffb380
00ba04ec	cmp w0,w8
00ba04f0	b.eq 0x00ba051c
00ba04f4	cmn w0,#0x6e
00ba04f8	b.ne 0x00ba0534
00ba04fc	mov w0,#0xffffff69
00ba0500	ret
00ba0504	mov w8,#0xffffb100
00ba0508	cmp w0,w8
00ba050c	b.eq 0x00ba0524
00ba0510	mov w8,#0xffffb200
00ba0514	cmp w0,w8
00ba0518	b.ne 0x00ba0534
00ba051c	mov w0,#0xffffff67
00ba0520	ret
00ba0524	mov w0,#0xffffff76
00ba0528	ret
00ba052c	mov w0,#0xffffff7a
00ba0530	ret
00ba0534	mov w0,#0xffffff7c
00ba0538	ret
