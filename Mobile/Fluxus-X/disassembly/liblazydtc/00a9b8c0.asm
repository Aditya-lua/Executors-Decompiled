; ossl_hexstr2buf_sep @ 00a9b8c0
00a9b8c0	str x23,[sp, #-0x40]!
00a9b8c4	stp x22,x21,[sp, #0x10]
00a9b8c8	stp x20,x19,[sp, #0x20]
00a9b8cc	stp x29,x30,[sp, #0x30]
00a9b8d0	add x29,sp,#0x30
00a9b8d4	mov w21,w2
00a9b8d8	mov x19,x1
00a9b8dc	mov x22,x0
00a9b8e0	bl 0x00c2ff50
00a9b8e4	cmp x0,#0x1
00a9b8e8	b.hi 0x00a9b91c
00a9b8ec	bl 0x00c342a0
00a9b8f0	adrp x0,0x2c9000
00a9b8f4	adrp x2,0x2d1000
00a9b8f8	add x0,x0,#0xd7c
00a9b8fc	add x2,x2,#0xdd4
00a9b900	mov w1,#0xc3
00a9b904	bl 0x00c342b0
00a9b908	orr w0,wzr,#0xf
00a9b90c	mov w1,#0x79
00a9b910	mov x2,xzr
00a9b914	bl 0x00c342c0
00a9b918	b 0x00a9b9bc
00a9b91c	lsr x23,x0,#0x1
00a9b920	adrp x1,0x2c9000
00a9b924	add x1,x1,#0xd7c
00a9b928	mov w2,#0xc7
00a9b92c	mov x0,x23
00a9b930	bl 0x00c32320
00a9b934	mov x20,x0
00a9b938	cbz x0,0x00a9b974
00a9b93c	cbz x19,0x00a9b944
00a9b940	str xzr,[x19]
00a9b944	add x2,sp,#0x8
00a9b948	mov x0,x20
00a9b94c	mov x1,x23
00a9b950	mov x3,x22
00a9b954	mov w4,w21
00a9b958	str xzr,[sp, #0x8]
00a9b95c	bl 0x00a9b780
00a9b960	cbz w0,0x00a9b9a8
00a9b964	cbz x19,0x00a9b9c0
00a9b968	ldr x8,[sp, #0x8]
00a9b96c	str x8,[x19]
00a9b970	b 0x00a9b9c0
00a9b974	bl 0x00c342a0
00a9b978	adrp x0,0x2c9000
00a9b97c	adrp x2,0x2d1000
00a9b980	add x0,x0,#0xd7c
00a9b984	add x2,x2,#0xdd4
00a9b988	mov w1,#0xc8
00a9b98c	bl 0x00c342b0
00a9b990	mov w1,#0x100
00a9b994	orr w0,wzr,#0xf
00a9b998	movk w1,#0xc, LSL #16
00a9b99c	mov x2,xzr
00a9b9a0	bl 0x00c342c0
00a9b9a4	b 0x00a9b9c0
00a9b9a8	adrp x1,0x2c9000
00a9b9ac	add x1,x1,#0xd7c
00a9b9b0	mov w2,#0xd4
00a9b9b4	mov x0,x20
00a9b9b8	bl 0x00c32310
00a9b9bc	mov x20,xzr
00a9b9c0	mov x0,x20
00a9b9c4	ldp x29,x30,[sp, #0x30]
00a9b9c8	ldp x20,x19,[sp, #0x20]
00a9b9cc	ldp x22,x21,[sp, #0x10]
00a9b9d0	ldr x23,[sp], #0x40
00a9b9d4	ret
