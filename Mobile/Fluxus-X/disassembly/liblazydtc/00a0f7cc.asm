; FUN_00a0f7cc @ 00a0f7cc
00a0f7cc	stp x20,x19,[sp, #-0x20]!
00a0f7d0	mov x19,x1
00a0f7d4	adrp x1,0x2cb000
00a0f7d8	add x1,x1,#0x74a
00a0f7dc	stp x29,x30,[sp, #0x10]
00a0f7e0	add x29,sp,#0x10
00a0f7e4	mov x20,x0
00a0f7e8	bl 0x00c35ee0
00a0f7ec	cbz w0,0x00a0f860
00a0f7f0	adrp x1,0x2b8000
00a0f7f4	add x1,x1,#0xdd9
00a0f7f8	mov x0,x20
00a0f7fc	bl 0x00c35ee0
00a0f800	cbz w0,0x00a0f860
00a0f804	adrp x1,0x2b7000
00a0f808	add x1,x1,#0x925
00a0f80c	mov x0,x20
00a0f810	bl 0x00c35ee0
00a0f814	cbz w0,0x00a0f868
00a0f818	adrp x1,0x29d000
00a0f81c	add x1,x1,#0x3bb
00a0f820	mov x0,x20
00a0f824	bl 0x00c35ee0
00a0f828	cbz w0,0x00a0f868
00a0f82c	bl 0x00c342a0
00a0f830	adrp x0,0x2d7000
00a0f834	adrp x2,0x2d1000
00a0f838	add x0,x0,#0xc86
00a0f83c	add x2,x2,#0x769
00a0f840	mov w1,#0xca
00a0f844	bl 0x00c342b0
00a0f848	orr w0,wzr,#0xe
00a0f84c	mov w1,#0x7a
00a0f850	mov x2,xzr
00a0f854	bl 0x00c342c0
00a0f858	mov w0,wzr
00a0f85c	b 0x00a0f874
00a0f860	mov w8,#0x1
00a0f864	b 0x00a0f86c
00a0f868	mov w8,wzr
00a0f86c	mov w0,#0x1
00a0f870	str w8,[x19]
00a0f874	ldp x29,x30,[sp, #0x10]
00a0f878	ldp x20,x19,[sp], #0x20
00a0f87c	ret
