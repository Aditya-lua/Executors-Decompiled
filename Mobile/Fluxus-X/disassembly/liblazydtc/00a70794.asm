; FUN_00a70794 @ 00a70794
00a70794	sub sp,sp,#0x140
00a70798	stp x28,x27,[sp, #0xe0]
00a7079c	stp x26,x25,[sp, #0xf0]
00a707a0	stp x24,x23,[sp, #0x100]
00a707a4	stp x22,x21,[sp, #0x110]
00a707a8	stp x20,x19,[sp, #0x120]
00a707ac	stp x29,x30,[sp, #0x130]
00a707b0	ldr w8,[x0]
00a707b4	add x29,sp,#0x130
00a707b8	cmp w8,#0x0
00a707bc	csinv w22,w8,wzr,ne
00a707c0	cbz x2,0x00a708ec
00a707c4	ldr x8,[x2]
00a707c8	mov x19,x2
00a707cc	cbz x8,0x00a708ec
00a707d0	ldr w23,[x0, #0x74]
00a707d4	add x8,sp,#0x8
00a707d8	adrp x24,0xa6f000
00a707dc	mov w20,w1
00a707e0	mov x21,x0
00a707e4	add x28,x8,#0x10
00a707e8	add x24,x24,#0xd84
00a707ec	add x0,sp,#0x48
00a707f0	mov w2,#0x90
00a707f4	mov w1,wzr
00a707f8	bl 0x00c301c0
00a707fc	movi v0.2D,#0x0
00a70800	stp q0,q0,[x28, #0x10]
00a70804	str q0,[x28]
00a70808	stp w20,w23,[sp, #0x8]
00a7080c	stp w23,w22,[sp, #0x10]
00a70810	ldr x8,[x19]
00a70814	adrp x1,0xc5e000
00a70818	add x0,sp,#0x8
00a7081c	mov w2,#0x55
00a70820	add x1,x1,#0xc98
00a70824	str x8,[sp, #0x30]
00a70828	bl 0x00a70be0
00a7082c	mov x26,x0
00a70830	cbz x0,0x00a70854
00a70834	ldr w8,[x26]
00a70838	ldr x9,[x26, #0x38]
00a7083c	str w8,[sp, #0x50]
00a70840	ldr w8,[x26, #0x10]
00a70844	cmp x9,#0x0
00a70848	csel x25,x24,x9,eq
00a7084c	str w8,[sp, #0x54]
00a70850	b 0x00a70858
00a70854	mov x25,x24
00a70858	orr w0,wzr,#0x7
00a7085c	add x2,sp,#0x48
00a70860	mov x1,x26
00a70864	str x21,[sp, #0x48]
00a70868	str x19,[sp, #0x78]
00a7086c	blr x25
00a70870	mov w27,w0
00a70874	cmp w0,#0x1
00a70878	b.lt 0x00a708c4
00a7087c	ldr w8,[sp, #0x50]
00a70880	cbz w8,0x00a708ac
00a70884	ldr w3,[sp, #0x54]
00a70888	ldr w4,[sp, #0x64]
00a7088c	ldr x5,[sp, #0x68]
00a70890	mov x0,x21
00a70894	mov w1,w23
00a70898	mov w2,w22
00a7089c	bl 0x00c370f0
00a708a0	mov w27,w0
00a708a4	cmp w0,#0x1
00a708a8	b.lt 0x00a708c4
00a708ac	mov w0,#0x8
00a708b0	add x2,sp,#0x48
00a708b4	mov x1,x26
00a708b8	str w27,[sp, #0x64]
00a708bc	blr x25
00a708c0	ldr w27,[sp, #0x64]
00a708c4	ldr x0,[sp, #0xc0]
00a708c8	cbz x0,0x00a708dc
00a708cc	adrp x1,0x2b9000
00a708d0	mov w2,#0x2cb
00a708d4	add x1,x1,#0xe99
00a708d8	bl 0x00c32310
00a708dc	cmp w27,#0x0
00a708e0	b.le 0x00a708f4
00a708e4	ldr x8,[x19, #0x28]!
00a708e8	cbnz x8,0x00a707ec
00a708ec	mov w0,#0x1
00a708f0	b 0x00a708f8
00a708f4	mov w0,wzr
00a708f8	ldp x29,x30,[sp, #0x130]
00a708fc	ldp x20,x19,[sp, #0x120]
00a70900	ldp x22,x21,[sp, #0x110]
00a70904	ldp x24,x23,[sp, #0x100]
00a70908	ldp x26,x25,[sp, #0xf0]
00a7090c	ldp x28,x27,[sp, #0xe0]
00a70910	add sp,sp,#0x140
00a70914	ret
