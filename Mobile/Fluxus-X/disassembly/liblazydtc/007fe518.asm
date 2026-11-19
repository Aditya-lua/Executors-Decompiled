; FUN_007fe518 @ 007fe518
007fe518	stp x29,x30,[sp, #-0x50]!
007fe51c	stp x26,x25,[sp, #0x10]
007fe520	stp x24,x23,[sp, #0x20]
007fe524	stp x22,x21,[sp, #0x30]
007fe528	stp x20,x19,[sp, #0x40]
007fe52c	mov x29,sp
007fe530	adrp x25,0xcb4000
007fe534	adrp x24,0xcb4000
007fe538	mov x19,x0
007fe53c	ldr x25,[x25, #0x9a8]
007fe540	ldr x24,[x24, #0x9a0]
007fe544	str xzr,[x0, #0xe8]
007fe548	mov w22,w2
007fe54c	mov x21,x1
007fe550	mov x20,x0
007fe554	ldp x8,x9,[x24, #0x8]
007fe558	add x26,x25,#0x40
007fe55c	str x26,[x19, #0xb8]!
007fe560	str x8,[x0]
007fe564	ldur x8,[x8, #-0x18]
007fe568	str xzr,[x0, #0x8]
007fe56c	str x9,[x0, x8#0x0]
007fe570	ldr x8,[x0]
007fe574	ldur x8,[x8, #-0x18]
007fe578	add x23,x0,x8
007fe57c	add x1,x0,#0x10
007fe580	mov x0,x23
007fe584	bl 0x00c30100
007fe588	mov w8,#0xffffffff
007fe58c	add x9,x25,#0x18
007fe590	str xzr,[x23, #0x88]
007fe594	str w8,[x23, #0x90]
007fe598	str x9,[x20]
007fe59c	str x26,[x20, #0xb8]
007fe5a0	add x0,x20,#0x10
007fe5a4	bl 0x00c30110
007fe5a8	add x0,x20,#0x10
007fe5ac	orr w2,w22,#0x8
007fe5b0	mov x1,x21
007fe5b4	bl 0x00c30120
007fe5b8	cbnz x0,0x007fe5d4
007fe5bc	ldr x8,[x20]
007fe5c0	ldur x8,[x8, #-0x18]
007fe5c4	add x0,x20,x8
007fe5c8	ldr w8,[x0, #0x20]
007fe5cc	orr w1,w8,#0x4
007fe5d0	bl 0x00c30130
007fe5d4	ldp x20,x19,[sp, #0x40]
007fe5d8	ldp x22,x21,[sp, #0x30]
007fe5dc	ldp x24,x23,[sp, #0x20]
007fe5e0	ldp x26,x25,[sp, #0x10]
007fe5e4	ldp x29,x30,[sp], #0x50
007fe5e8	ret
