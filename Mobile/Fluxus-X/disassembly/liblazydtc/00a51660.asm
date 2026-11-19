; ENGINE_set_name @ 00a51660
00a51660	cbz x1,0x00a51670
00a51664	str x1,[x0, #0x8]
00a51668	mov w0,#0x1
00a5166c	ret
00a51670	stp x29,x30,[sp, #-0x10]!
00a51674	mov x29,sp
00a51678	bl 0x00c342a0
00a5167c	adrp x0,0x2a2000
00a51680	adrp x2,0x2ad000
00a51684	add x0,x0,#0x2ee
00a51688	add x2,x2,#0xbb0
00a5168c	mov w1,#0xd6
00a51690	bl 0x00c342b0
00a51694	mov w1,#0x102
00a51698	mov w0,#0x26
00a5169c	movk w1,#0xc, LSL #16
00a516a0	mov x2,xzr
00a516a4	bl 0x00c342c0
00a516a8	mov w0,wzr
00a516ac	ldp x29,x30,[sp], #0x10
00a516b0	ret
