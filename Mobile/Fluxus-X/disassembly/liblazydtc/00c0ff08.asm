; FUN_00c0ff08 @ 00c0ff08
00c0ff08	paciasp
00c0ff0c	stp x29,x30,[sp, #-0x20]!
00c0ff10	stp x20,x19,[sp, #0x10]
00c0ff14	mov x29,sp
00c0ff18	mov x19,x0
00c0ff1c	ldr x0,[x0, #0x1330]
00c0ff20	add x20,x19,#0x330
00c0ff24	cbnz x0,0x00c0ff38
00c0ff28	b 0x00c0ff50
00c0ff2c	bl 0x00c30960
00c0ff30	ldr x0,[x19, #0x1330]
00c0ff34	cbz x0,0x00c0ff50
00c0ff38	ldr x8,[x0]
00c0ff3c	cmp x0,x20
00c0ff40	str x8,[x19, #0x1330]
00c0ff44	b.ne 0x00c0ff2c
00c0ff48	mov x0,x8
00c0ff4c	cbnz x0,0x00c0ff38
00c0ff50	ldr x0,[x19, #0x2d0]
00c0ff54	add x8,x19,#0x2e8
00c0ff58	stp xzr,xzr,[x20]
00c0ff5c	str x20,[x19, #0x1330]
00c0ff60	cmp x0,x8
00c0ff64	b.eq 0x00c0ff6c
00c0ff68	bl 0x00c30960
00c0ff6c	ldr x0,[x19, #0x298]
00c0ff70	add x8,x19,#0x2b0
00c0ff74	cmp x0,x8
00c0ff78	b.eq 0x00c0ff80
00c0ff7c	bl 0x00c30960
00c0ff80	ldr x0,[x19, #0x240]
00c0ff84	add x8,x19,#0x258
00c0ff88	cmp x0,x8
00c0ff8c	b.eq 0x00c0ff94
00c0ff90	bl 0x00c30960
00c0ff94	ldr x0,[x19, #0x128]
00c0ff98	add x8,x19,#0x140
00c0ff9c	cmp x0,x8
00c0ffa0	b.eq 0x00c0ffa8
00c0ffa4	bl 0x00c30960
00c0ffa8	ldr x0,[x19, #0x10]
00c0ffac	add x8,x19,#0x28
00c0ffb0	cmp x0,x8
00c0ffb4	b.eq 0x00c0ffc8
00c0ffb8	ldp x20,x19,[sp, #0x10]
00c0ffbc	ldp x29,x30,[sp], #0x20
00c0ffc0	autiasp
00c0ffc4	b 0x00c30960
00c0ffc8	ldp x20,x19,[sp, #0x10]
00c0ffcc	ldp x29,x30,[sp], #0x20
00c0ffd0	autiasp
00c0ffd4	ret
