; FUN_00870ce4 @ 00870ce4
00870ce4	stp x29,x30,[sp, #-0x50]!
00870ce8	stp x26,x25,[sp, #0x10]
00870cec	stp x24,x23,[sp, #0x20]
00870cf0	stp x22,x21,[sp, #0x30]
00870cf4	stp x20,x19,[sp, #0x40]
00870cf8	mov x29,sp
00870cfc	ldp x25,x8,[x0, #0x8]
00870d00	mov x19,x0
00870d04	mov x23,x1
00870d08	cmp x25,x8
00870d0c	b.cs 0x00870d1c
00870d10	ldr x8,[x23]
00870d14	str x8,[x25], #0x8
00870d18	b 0x00870da4
00870d1c	ldr x20,[x19]
00870d20	sub x22,x25,x20
00870d24	asr x26,x22,#0x3
00870d28	add x9,x26,#0x1
00870d2c	lsr x10,x9,#0x3d
00870d30	cbnz x10,0x00870dc0
00870d34	sub x21,x8,x20
00870d38	orr x10,xzr,#0x7ffffffffffffff8
00870d3c	asr x8,x21,#0x2
00870d40	cmp x8,x9
00870d44	csel x8,x8,x9,hi
00870d48	cmp x21,x10
00870d4c	mov x9,#0x1fffffffffffffff
00870d50	csel x8,x8,x9,cc
00870d54	lsr x9,x8,#0x3d
00870d58	cbnz x9,0x00870dc4
00870d5c	lsl x24,x8,#0x3
00870d60	mov x0,x24
00870d64	bl 0x00c2fed0
00870d68	add x25,x0,x22
00870d6c	ldr x8,[x23]
00870d70	add x24,x0,x24
00870d74	sub x23,x25,x26, LSL #0x3
00870d78	mov x1,x20
00870d7c	mov x2,x22
00870d80	str x8,[x25], #0x8
00870d84	mov x0,x23
00870d88	bl 0x00c2ffd0
00870d8c	stp x23,x25,[x19]
00870d90	str x24,[x19, #0x10]
00870d94	cbz x20,0x00870da4
00870d98	mov x0,x20
00870d9c	mov x1,x21
00870da0	bl 0x00c2fe80
00870da4	str x25,[x19, #0x8]
00870da8	ldp x20,x19,[sp, #0x40]
00870dac	ldp x22,x21,[sp, #0x30]
00870db0	ldp x24,x23,[sp, #0x20]
00870db4	ldp x26,x25,[sp, #0x10]
00870db8	ldp x29,x30,[sp], #0x50
00870dbc	ret
00870dc0	bl 0x00870dc8
00870dc4	bl 0x007fe1b8
