; FUN_00a3d508 @ 00a3d508
00a3d508	sub sp,sp,#0x30
00a3d50c	stp x20,x19,[sp, #0x10]
00a3d510	mov x19,x2
00a3d514	mov x20,x1
00a3d518	add x1,sp,#0x8
00a3d51c	mov x2,sp
00a3d520	stp x29,x30,[sp, #0x20]
00a3d524	add x29,sp,#0x20
00a3d528	bl 0x00a3d570
00a3d52c	cbz w0,0x00a3d550
00a3d530	cbz x20,0x00a3d544
00a3d534	ldp x2,x1,[sp]
00a3d538	mov x0,x20
00a3d53c	bl 0x00c3a6a0
00a3d540	cbz w0,0x00a3d550
00a3d544	mov w8,#0x20
00a3d548	mov w0,#0x1
00a3d54c	str x8,[x19]
00a3d550	ldp x29,x30,[sp, #0x20]
00a3d554	ldp x20,x19,[sp, #0x10]
00a3d558	add sp,sp,#0x30
00a3d55c	ret
