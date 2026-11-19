; BUF_MEM_new @ 00a0b94c
00a0b94c	stp x29,x30,[sp, #-0x10]!
00a0b950	adrp x1,0x29f000
00a0b954	add x1,x1,#0xf43
00a0b958	mov w0,#0x20
00a0b95c	mov w2,#0x23
00a0b960	mov x29,sp
00a0b964	bl 0x00c34250
00a0b968	cbz x0,0x00a0b974
00a0b96c	ldp x29,x30,[sp], #0x10
00a0b970	ret
00a0b974	bl 0x00c342a0
00a0b978	adrp x0,0x29f000
00a0b97c	adrp x2,0x2c5000
00a0b980	add x0,x0,#0xf43
00a0b984	add x2,x2,#0x7fe
00a0b988	mov w1,#0x25
00a0b98c	bl 0x00c342b0
00a0b990	mov w1,#0x100
00a0b994	orr w0,wzr,#0x7
00a0b998	movk w1,#0xc, LSL #16
00a0b99c	mov x2,xzr
00a0b9a0	bl 0x00c342c0
00a0b9a4	mov x0,xzr
00a0b9a8	ldp x29,x30,[sp], #0x10
00a0b9ac	ret
