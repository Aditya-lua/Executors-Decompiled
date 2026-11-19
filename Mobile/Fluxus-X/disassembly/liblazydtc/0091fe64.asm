; FUN_0091fe64 @ 0091fe64
0091fe64	stp x28,x27,[sp, #-0x60]!
0091fe68	stp x26,x25,[sp, #0x10]
0091fe6c	stp x24,x23,[sp, #0x20]
0091fe70	stp x22,x21,[sp, #0x30]
0091fe74	stp x20,x19,[sp, #0x40]
0091fe78	stp x29,x30,[sp, #0x50]
0091fe7c	add x29,sp,#0x50
0091fe80	ldr x8,[x0, #0x18]
0091fe84	mov x21,x4
0091fe88	mov x22,x3
0091fe8c	mov x23,x2
0091fe90	mov x19,x0
0091fe94	mov x24,x1
0091fe98	cbz x8,0x0091fea8
0091fe9c	ldr x9,[x19, #0x8]
0091fea0	cmp x9,x8
0091fea4	b.cs 0x0091ffd8
0091fea8	ldp x8,x9,[x19, #0x20]
0091feac	add x25,x21,x23
0091feb0	add x8,x25,x8
0091feb4	cmp x8,x9
0091feb8	b.hi 0x0091ffd8
0091febc	adrp x26,0xcb4000
0091fec0	ldr w27,[x19, #0x30]
0091fec4	ldr x26,[x26, #0xdd0]
0091fec8	add x1,x25,#0x22
0091fecc	mov w0,#0x1
0091fed0	ldr x8,[x26]
0091fed4	blr x8
0091fed8	mov x20,x0
0091fedc	cbz x0,0x0091ffd8
0091fee0	add x0,x20,#0x20
0091fee4	mov x1,x24
0091fee8	mov x2,x23
0091feec	add x28,x0,x23
0091fef0	str x0,[x20]
0091fef4	bl 0x00c2ffd0
0091fef8	add x0,x28,#0x1
0091fefc	mov x1,x22
0091ff00	mov x2,x21
0091ff04	stp x0,x23,[x20, #0x8]
0091ff08	bl 0x00c2ffd0
0091ff0c	str x21,[x20, #0x18]
0091ff10	tbz w27,#0x0,0x0091ff24
0091ff14	ldr x0,[x20]
0091ff18	ldr x2,[x20, #0x10]
0091ff1c	mov x1,x0
0091ff20	bl 0x00941848
0091ff24	ldp x8,x10,[x19, #0x8]
0091ff28	add x9,x8,#0x1
0091ff2c	cmp x9,x10
0091ff30	b.cs 0x0091ff3c
0091ff34	ldr x21,[x19]
0091ff38	b 0x0091ffa8
0091ff3c	ldr x9,[x19, #0x18]
0091ff40	add x8,x8,#0x10
0091ff44	ldr x10,[x26]
0091ff48	mov w1,#0x8
0091ff4c	cmp x8,x9
0091ff50	ccmp x9,#0x0,#0x4,hi
0091ff54	csel x22,x9,x8,ne
0091ff58	mov x0,x22
0091ff5c	blr x10
0091ff60	mov x21,x0
0091ff64	cbz x0,0x0091ffc4
0091ff68	ldr x1,[x19]
0091ff6c	cbz x1,0x0091ff98
0091ff70	ldr x8,[x19, #0x8]
0091ff74	mov x0,x21
0091ff78	lsl x2,x8,#0x3
0091ff7c	bl 0x00c2ffd0
0091ff80	adrp x8,0xcc4000
0091ff84	add x8,x8,#0x678
0091ff88	ldr x0,[x19]
0091ff8c	ldr x8,[x8]
0091ff90	blr x8
0091ff94	str xzr,[x19]
0091ff98	ldr x8,[x19, #0x8]
0091ff9c	str x21,[x19]
0091ffa0	str x22,[x19, #0x10]
0091ffa4	add x9,x8,#0x1
0091ffa8	str x9,[x19, #0x8]
0091ffac	str x20,[x21, x8, LSL #0x3]
0091ffb0	ldr x8,[x19, #0x20]
0091ffb4	mov w0,wzr
0091ffb8	add x8,x25,x8
0091ffbc	str x8,[x19, #0x20]
0091ffc0	b 0x0091ffdc
0091ffc4	adrp x8,0xcc4000
0091ffc8	add x8,x8,#0x678
0091ffcc	mov x0,x20
0091ffd0	ldr x8,[x8]
0091ffd4	blr x8
0091ffd8	mov w0,#0x1b
0091ffdc	ldp x29,x30,[sp, #0x50]
0091ffe0	ldp x20,x19,[sp, #0x40]
0091ffe4	ldp x22,x21,[sp, #0x30]
0091ffe8	ldp x24,x23,[sp, #0x20]
0091ffec	ldp x26,x25,[sp, #0x10]
0091fff0	ldp x28,x27,[sp], #0x60
0091fff4	ret
