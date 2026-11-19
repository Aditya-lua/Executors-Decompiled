; FUN_00844cfc @ 00844cfc
00844cfc	stp x29,x30,[sp, #-0x50]!
00844d00	stp x26,x25,[sp, #0x10]
00844d04	stp x24,x23,[sp, #0x20]
00844d08	stp x22,x21,[sp, #0x30]
00844d0c	stp x20,x19,[sp, #0x40]
00844d10	mov x29,sp
00844d14	ldp x21,x8,[x0, #0x8]
00844d18	mov x19,x0
00844d1c	sub x9,x8,x21
00844d20	cmp x1,x9, ASR #0x4
00844d24	b.ls 0x00844d80
00844d28	ldr x20,[x19]
00844d2c	sub x22,x21,x20
00844d30	asr x25,x22,#0x4
00844d34	add x9,x25,x1
00844d38	lsr x10,x9,#0x3c
00844d3c	cbnz x10,0x00844e20
00844d40	sub x21,x8,x20
00844d44	orr x10,xzr,#0x7ffffffffffffff0
00844d48	asr x8,x21,#0x3
00844d4c	cmp x8,x9
00844d50	csel x8,x8,x9,hi
00844d54	cmp x21,x10
00844d58	mov x9,#0xfffffffffffffff
00844d5c	csel x23,x8,x9,cc
00844d60	cbz x23,0x00844da4
00844d64	lsr x8,x23,#0x3c
00844d68	cbnz x8,0x00844e24
00844d6c	lsl x0,x23,#0x4
00844d70	mov x24,x1
00844d74	bl 0x00c2fed0
00844d78	mov x1,x24
00844d7c	b 0x00844da8
00844d80	cbz x1,0x00844d9c
00844d84	lsl x20,x1,#0x4
00844d88	mov x0,x21
00844d8c	mov w1,wzr
00844d90	mov x2,x20
00844d94	bl 0x00c301c0
00844d98	add x21,x21,x20
00844d9c	str x21,[x19, #0x8]
00844da0	b 0x00844e08
00844da4	mov x0,xzr
00844da8	add x26,x0,x23, LSL #0x4
00844dac	lsl x23,x1,#0x4
00844db0	add x24,x0,x22
00844db4	mov x0,x24
00844db8	mov w1,wzr
00844dbc	mov x2,x23
00844dc0	bl 0x00c301c0
00844dc4	sub x25,x24,x25, LSL #0x4
00844dc8	mov x1,x20
00844dcc	mov x2,x22
00844dd0	add x23,x24,x23
00844dd4	mov x0,x25
00844dd8	bl 0x00c2ffd0
00844ddc	stp x25,x23,[x19]
00844de0	str x26,[x19, #0x10]
00844de4	cbz x20,0x00844e08
00844de8	mov x0,x20
00844dec	mov x1,x21
00844df0	ldp x20,x19,[sp, #0x40]
00844df4	ldp x22,x21,[sp, #0x30]
00844df8	ldp x24,x23,[sp, #0x20]
00844dfc	ldp x26,x25,[sp, #0x10]
00844e00	ldp x29,x30,[sp], #0x50
00844e04	b 0x00c2fe80
00844e08	ldp x20,x19,[sp, #0x40]
00844e0c	ldp x22,x21,[sp, #0x30]
00844e10	ldp x24,x23,[sp, #0x20]
00844e14	ldp x26,x25,[sp, #0x10]
00844e18	ldp x29,x30,[sp], #0x50
00844e1c	ret
00844e20	bl 0x00844e28
00844e24	bl 0x007fe1b8
