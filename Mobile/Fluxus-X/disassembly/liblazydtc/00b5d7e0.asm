; FUN_00b5d7e0 @ 00b5d7e0
00b5d7e0	stp x20,x19,[sp, #-0x20]!
00b5d7e4	stp x29,x30,[sp, #0x10]
00b5d7e8	add x29,sp,#0x10
00b5d7ec	mov x19,x0
00b5d7f0	bl 0x00c41000
00b5d7f4	cbz w0,0x00b5d824
00b5d7f8	adrp x1,0x2c6000
00b5d7fc	add x1,x1,#0x7b7
00b5d800	mov w0,#0x120
00b5d804	mov w2,#0x4b
00b5d808	bl 0x00c34250
00b5d80c	mov x20,x0
00b5d810	cbz x0,0x00b5d82c
00b5d814	mov x0,x19
00b5d818	bl 0x00c41210
00b5d81c	str x0,[x20]
00b5d820	b 0x00b5d85c
00b5d824	mov x20,xzr
00b5d828	b 0x00b5d85c
00b5d82c	bl 0x00c342a0
00b5d830	adrp x0,0x2c6000
00b5d834	adrp x2,0x2c4000
00b5d838	add x0,x0,#0x7b7
00b5d83c	add x2,x2,#0x755
00b5d840	mov w1,#0x4d
00b5d844	bl 0x00c342b0
00b5d848	mov w1,#0x100
00b5d84c	mov w0,#0x39
00b5d850	movk w1,#0xc, LSL #16
00b5d854	mov x2,xzr
00b5d858	bl 0x00c342c0
00b5d85c	ldp x29,x30,[sp, #0x10]
00b5d860	mov x0,x20
00b5d864	ldp x20,x19,[sp], #0x20
00b5d868	ret
