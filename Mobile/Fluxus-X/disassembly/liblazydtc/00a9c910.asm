; WPACKET_init_null @ 00a9c910
00a9c910	str x19,[sp, #-0x20]!
00a9c914	sub x8,x1,#0x1
00a9c918	mov x19,x0
00a9c91c	cmp x8,#0x6
00a9c920	stp x29,x30,[sp, #0x10]
00a9c924	add x29,sp,#0x10
00a9c928	stp xzr,xzr,[x0]
00a9c92c	b.ls 0x00a9c938
00a9c930	mov x8,#-0x1
00a9c934	b 0x00a9c948
00a9c938	lsl x9,x1,#0x3
00a9c93c	mov w10,#0x1
00a9c940	lsl x9,x10,x9
00a9c944	add x8,x9,x8
00a9c948	ldrb w9,[x19, #0x30]
00a9c94c	adrp x1,0x2bd000
00a9c950	stp xzr,x8,[x19, #0x18]
00a9c954	add x1,x1,#0xe31
00a9c958	and w8,w9,#0xfe
00a9c95c	mov w0,#0x28
00a9c960	mov w2,#0x6b
00a9c964	strb w8,[x19, #0x30]
00a9c968	str xzr,[x19, #0x10]
00a9c96c	bl 0x00c34250
00a9c970	str x0,[x19, #0x28]
00a9c974	cbz x0,0x00a9c980
00a9c978	mov w0,#0x1
00a9c97c	b 0x00a9c9b4
00a9c980	bl 0x00c342a0
00a9c984	adrp x0,0x2bd000
00a9c988	adrp x2,0x2b0000
00a9c98c	add x0,x0,#0xe31
00a9c990	add x2,x2,#0x35a
00a9c994	mov w1,#0x6c
00a9c998	bl 0x00c342b0
00a9c99c	mov w1,#0x100
00a9c9a0	orr w0,wzr,#0xf
00a9c9a4	movk w1,#0xc, LSL #16
00a9c9a8	mov x2,xzr
00a9c9ac	bl 0x00c342c0
00a9c9b0	mov w0,wzr
00a9c9b4	ldp x29,x30,[sp, #0x10]
00a9c9b8	ldr x19,[sp], #0x20
00a9c9bc	ret
