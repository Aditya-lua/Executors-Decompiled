; FUN_00a3d664 @ 00a3d664
00a3d664	sub sp,sp,#0x30
00a3d668	stp x20,x19,[sp, #0x10]
00a3d66c	mov x19,x2
00a3d670	mov x20,x1
00a3d674	add x1,sp,#0x8
00a3d678	mov x2,sp
00a3d67c	stp x29,x30,[sp, #0x20]
00a3d680	add x29,sp,#0x20
00a3d684	bl 0x00a3d570
00a3d688	cbz w0,0x00a3d6ac
00a3d68c	cbz x20,0x00a3d6a0
00a3d690	ldp x2,x1,[sp]
00a3d694	mov x0,x20
00a3d698	bl 0x00c3a540
00a3d69c	cbz w0,0x00a3d6ac
00a3d6a0	orr w8,wzr,#0x38
00a3d6a4	mov w0,#0x1
00a3d6a8	str x8,[x19]
00a3d6ac	ldp x29,x30,[sp, #0x20]
00a3d6b0	ldp x20,x19,[sp, #0x10]
00a3d6b4	add sp,sp,#0x30
00a3d6b8	ret
