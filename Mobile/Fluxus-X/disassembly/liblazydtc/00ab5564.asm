; PEM_read_DHparams @ 00ab5564
00ab5564	str x23,[sp, #-0x40]!
00ab5568	stp x22,x21,[sp, #0x10]
00ab556c	stp x20,x19,[sp, #0x20]
00ab5570	stp x29,x30,[sp, #0x30]
00ab5574	add x29,sp,#0x30
00ab5578	mov x19,x3
00ab557c	mov x20,x2
00ab5580	mov x21,x1
00ab5584	mov x23,x0
00ab5588	bl 0x00c32270
00ab558c	bl 0x00c32240
00ab5590	cbz x0,0x00ab55d0
00ab5594	mov w1,#0x6a
00ab5598	mov x2,xzr
00ab559c	mov x3,x23
00ab55a0	mov x22,x0
00ab55a4	bl 0x00c321a0
00ab55a8	mov x0,x22
00ab55ac	mov x1,x21
00ab55b0	mov x2,x20
00ab55b4	mov x3,x19
00ab55b8	bl 0x00ab5464
00ab55bc	mov x19,x0
00ab55c0	mov x0,x22
00ab55c4	bl 0x00c31a40
00ab55c8	mov x0,x19
00ab55cc	b 0x00ab5604
00ab55d0	bl 0x00c342a0
00ab55d4	adrp x0,0x2c6000
00ab55d8	adrp x2,0x2a8000
00ab55dc	add x0,x0,#0xfa
00ab55e0	add x2,x2,#0x6d3
00ab55e4	mov w1,#0xd7
00ab55e8	bl 0x00c342b0
00ab55ec	mov w1,#0x7
00ab55f0	mov w0,#0x9
00ab55f4	movk w1,#0x8, LSL #16
00ab55f8	mov x2,xzr
00ab55fc	bl 0x00c342c0
00ab5600	mov x0,xzr
00ab5604	ldp x29,x30,[sp, #0x30]
00ab5608	ldp x20,x19,[sp, #0x20]
00ab560c	ldp x22,x21,[sp, #0x10]
00ab5610	ldr x23,[sp], #0x40
00ab5614	ret
