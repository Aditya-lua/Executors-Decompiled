; FUN_00a3d814 @ 00a3d814
00a3d814	stp x22,x21,[sp, #-0x30]!
00a3d818	stp x20,x19,[sp, #0x10]
00a3d81c	stp x29,x30,[sp, #0x20]
00a3d820	add x29,sp,#0x20
00a3d824	mov x19,x4
00a3d828	mov x21,x3
00a3d82c	mov x22,x2
00a3d830	mov x20,x1
00a3d834	bl 0x00c36dc0
00a3d838	ldr x0,[x0, #0x88]
00a3d83c	bl 0x00c3b2e0
00a3d840	cbz x0,0x00a3d870
00a3d844	cmp x22,#0x40
00a3d848	b.ne 0x00a3d89c
00a3d84c	ldp x4,x5,[x0]
00a3d850	mov x1,x19
00a3d854	mov x2,x20
00a3d858	ldp x29,x30,[sp, #0x20]
00a3d85c	ldp x20,x19,[sp, #0x10]
00a3d860	add x3,x0,#0x11
00a3d864	mov x0,x21
00a3d868	ldp x22,x21,[sp], #0x30
00a3d86c	b 0x00c3a690
00a3d870	bl 0x00c342a0
00a3d874	adrp x0,0x2aa000
00a3d878	adrp x2,0x2b2000
00a3d87c	add x0,x0,#0x129
00a3d880	add x2,x2,#0x1b8
00a3d884	mov w1,#0x362
00a3d888	bl 0x00c342b0
00a3d88c	mov w0,#0x10
00a3d890	mov w1,#0x74
00a3d894	mov x2,xzr
00a3d898	bl 0x00c342c0
00a3d89c	ldp x29,x30,[sp, #0x20]
00a3d8a0	ldp x20,x19,[sp, #0x10]
00a3d8a4	mov w0,wzr
00a3d8a8	ldp x22,x21,[sp], #0x30
00a3d8ac	ret
