; BUF_MEM_new_ex @ 00a0b8dc
00a0b8dc	str x19,[sp, #-0x20]!
00a0b8e0	adrp x1,0x29f000
00a0b8e4	mov x19,x0
00a0b8e8	add x1,x1,#0xf43
00a0b8ec	mov w0,#0x20
00a0b8f0	mov w2,#0x23
00a0b8f4	stp x29,x30,[sp, #0x10]
00a0b8f8	add x29,sp,#0x10
00a0b8fc	bl 0x00c34250
00a0b900	cbz x0,0x00a0b90c
00a0b904	str x19,[x0, #0x18]
00a0b908	b 0x00a0b940
00a0b90c	bl 0x00c342a0
00a0b910	adrp x0,0x29f000
00a0b914	adrp x2,0x2c5000
00a0b918	add x0,x0,#0xf43
00a0b91c	add x2,x2,#0x7fe
00a0b920	mov w1,#0x25
00a0b924	bl 0x00c342b0
00a0b928	mov w1,#0x100
00a0b92c	orr w0,wzr,#0x7
00a0b930	movk w1,#0xc, LSL #16
00a0b934	mov x2,xzr
00a0b938	bl 0x00c342c0
00a0b93c	mov x0,xzr
00a0b940	ldp x29,x30,[sp, #0x10]
00a0b944	ldr x19,[sp], #0x20
00a0b948	ret
