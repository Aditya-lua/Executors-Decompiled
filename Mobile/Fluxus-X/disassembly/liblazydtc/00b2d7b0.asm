; FUN_00b2d7b0 @ 00b2d7b0
00b2d7b0	stp x29,x30,[sp, #-0x10]!
00b2d7b4	mov x29,sp
00b2d7b8	str xzr,[x2]
00b2d7bc	cbz x5,0x00b2d7f0
00b2d7c0	cmp x3,x5
00b2d7c4	b.cs 0x00b2d7fc
00b2d7c8	bl 0x00c342a0
00b2d7cc	adrp x0,0x2c6000
00b2d7d0	adrp x2,0x2d0000
00b2d7d4	add x0,x0,#0x600
00b2d7d8	add x2,x2,#0x810
00b2d7dc	mov w1,#0x9f
00b2d7e0	bl 0x00c342b0
00b2d7e4	mov w0,#0x39
00b2d7e8	mov w1,#0x6a
00b2d7ec	b 0x00b2d834
00b2d7f0	mov w0,#0x1
00b2d7f4	ldp x29,x30,[sp], #0x10
00b2d7f8	ret
00b2d7fc	bl 0x00b2d43c
00b2d800	cbz w0,0x00b2d810
00b2d804	mov w0,#0x1
00b2d808	ldp x29,x30,[sp], #0x10
00b2d80c	ret
00b2d810	bl 0x00c342a0
00b2d814	adrp x0,0x2c6000
00b2d818	adrp x2,0x2d0000
00b2d81c	add x0,x0,#0x600
00b2d820	add x2,x2,#0x810
00b2d824	mov w1,#0xa4
00b2d828	bl 0x00c342b0
00b2d82c	mov w0,#0x39
00b2d830	mov w1,#0x66
00b2d834	mov x2,xzr
00b2d838	bl 0x00c342c0
00b2d83c	mov w0,wzr
00b2d840	ldp x29,x30,[sp], #0x10
00b2d844	ret
