; WPACKET_init @ 00a9c87c
00a9c87c	str x19,[sp, #-0x20]!
00a9c880	stp x29,x30,[sp, #0x10]
00a9c884	add x29,sp,#0x10
00a9c888	cbz x1,0x00a9c900
00a9c88c	ldrb w8,[x0, #0x30]
00a9c890	stp x1,xzr,[x0]
00a9c894	mov x9,#-0x1
00a9c898	adrp x1,0x2bd000
00a9c89c	and w8,w8,#0xfe
00a9c8a0	mov x19,x0
00a9c8a4	stp xzr,x9,[x0, #0x18]
00a9c8a8	strb w8,[x0, #0x30]
00a9c8ac	str xzr,[x0, #0x10]
00a9c8b0	add x1,x1,#0xe31
00a9c8b4	mov w0,#0x28
00a9c8b8	mov w2,#0x6b
00a9c8bc	bl 0x00c34250
00a9c8c0	str x0,[x19, #0x28]
00a9c8c4	cbz x0,0x00a9c8d0
00a9c8c8	mov w0,#0x1
00a9c8cc	b 0x00a9c904
00a9c8d0	bl 0x00c342a0
00a9c8d4	adrp x0,0x2bd000
00a9c8d8	adrp x2,0x2b0000
00a9c8dc	add x0,x0,#0xe31
00a9c8e0	add x2,x2,#0x35a
00a9c8e4	mov w1,#0x6c
00a9c8e8	bl 0x00c342b0
00a9c8ec	mov w1,#0x100
00a9c8f0	orr w0,wzr,#0xf
00a9c8f4	movk w1,#0xc, LSL #16
00a9c8f8	mov x2,xzr
00a9c8fc	bl 0x00c342c0
00a9c900	mov w0,wzr
00a9c904	ldp x29,x30,[sp, #0x10]
00a9c908	ldr x19,[sp], #0x20
00a9c90c	ret
