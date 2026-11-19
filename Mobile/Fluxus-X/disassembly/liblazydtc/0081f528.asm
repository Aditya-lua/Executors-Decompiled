; FUN_0081f528 @ 0081f528
0081f528	stp x29,x30,[sp, #-0x50]!
0081f52c	stp x26,x25,[sp, #0x10]
0081f530	stp x24,x23,[sp, #0x20]
0081f534	stp x22,x21,[sp, #0x30]
0081f538	stp x20,x19,[sp, #0x40]
0081f53c	mov x29,sp
0081f540	adrp x25,0xcb4000
0081f544	adrp x24,0xcb4000
0081f548	mov x19,x0
0081f54c	ldr x25,[x25, #0xa20]
0081f550	ldr x24,[x24, #0xa10]
0081f554	str xzr,[x0, #0xe0]
0081f558	mov w21,w2
0081f55c	mov x22,x1
0081f560	mov x20,x0
0081f564	ldp x8,x9,[x24, #0x8]
0081f568	add x26,x25,#0x40
0081f56c	str x26,[x19, #0xb0]!
0081f570	str x8,[x0]
0081f574	ldur x8,[x8, #-0x18]
0081f578	str x9,[x0, x8#0x0]
0081f57c	ldr x8,[x0]
0081f580	ldur x8,[x8, #-0x18]
0081f584	add x23,x0,x8
0081f588	add x1,x0,#0x8
0081f58c	mov x0,x23
0081f590	bl 0x00c30100
0081f594	mov w8,#0xffffffff
0081f598	add x9,x25,#0x18
0081f59c	str xzr,[x23, #0x88]
0081f5a0	str w8,[x23, #0x90]
0081f5a4	str x9,[x20]
0081f5a8	str x26,[x20, #0xb0]
0081f5ac	add x0,x20,#0x8
0081f5b0	bl 0x00c30110
0081f5b4	ldrb w8,[x22]
0081f5b8	ldr x9,[x22, #0x10]
0081f5bc	tst w8,#0x1
0081f5c0	csinc x1,x9,x22,ne
0081f5c4	add x0,x20,#0x8
0081f5c8	orr w2,w21,#0x10
0081f5cc	bl 0x00c30120
0081f5d0	cbnz x0,0x0081f5ec
0081f5d4	ldr x8,[x20]
0081f5d8	ldur x8,[x8, #-0x18]
0081f5dc	add x0,x20,x8
0081f5e0	ldr w8,[x0, #0x20]
0081f5e4	orr w1,w8,#0x4
0081f5e8	bl 0x00c30130
0081f5ec	ldp x20,x19,[sp, #0x40]
0081f5f0	ldp x22,x21,[sp, #0x30]
0081f5f4	ldp x24,x23,[sp, #0x20]
0081f5f8	ldp x26,x25,[sp, #0x10]
0081f5fc	ldp x29,x30,[sp], #0x50
0081f600	ret
