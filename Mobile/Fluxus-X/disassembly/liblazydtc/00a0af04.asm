; bn_rshift_fixed_top @ 00a0af04
00a0af04	str x23,[sp, #-0x40]!
00a0af08	stp x22,x21,[sp, #0x10]
00a0af0c	stp x20,x19,[sp, #0x20]
00a0af10	stp x29,x30,[sp, #0x30]
00a0af14	ldr w9,[x1, #0x8]
00a0af18	add w8,w2,#0x3f
00a0af1c	cmp w2,#0x0
00a0af20	csel w8,w8,w2,lt
00a0af24	asr w23,w8,#0x6
00a0af28	subs w21,w9,w23
00a0af2c	mov x20,x0
00a0af30	add x29,sp,#0x30
00a0af34	b.le 0x00a0afd8
00a0af38	mov w22,w2
00a0af3c	mov x19,x1
00a0af40	cmp x20,x1
00a0af44	b.eq 0x00a0af58
00a0af48	mov x0,x20
00a0af4c	mov w1,w21
00a0af50	bl 0x00c38e80
00a0af54	cbz x0,0x00a0afe4
00a0af58	ldr x14,[x19]
00a0af5c	ldr x8,[x20]
00a0af60	subs w12,w21,#0x1
00a0af64	and w9,w22,#0x3f
00a0af68	ldr x10,[x14, w23, SXTW #0x3]
00a0af6c	mov x11,xzr
00a0af70	b.le 0x00a0afc0
00a0af74	neg w13,w22
00a0af78	sxtw x15,w23
00a0af7c	and w13,w13,#0x3f
00a0af80	add x15,x14,x15, LSL #0x3
00a0af84	neg x14,x13
00a0af88	sxtw x12,w12
00a0af8c	orr x14,x14,x14, LSR #0x8
00a0af90	add x15,x15,#0x8
00a0af94	lsl x17,x11,#0x3
00a0af98	mov x16,x10
00a0af9c	ldr x10,[x15, x17#0x0]
00a0afa0	lsr x16,x16,x9
00a0afa4	add x11,x11,#0x1
00a0afa8	cmp x11,x12
00a0afac	lsl x18,x10,x13
00a0afb0	and x18,x18,x14
00a0afb4	orr x16,x18,x16
00a0afb8	str x16,[x8, x17#0x0]
00a0afbc	b.lt 0x00a0af94
00a0afc0	lsr x9,x10,x9
00a0afc4	str x9,[x8, x11, LSL #0x3]
00a0afc8	ldr w8,[x19, #0x10]
00a0afcc	str w21,[x20, #0x8]
00a0afd0	str w8,[x20, #0x10]
00a0afd4	b 0x00a0afe0
00a0afd8	mov x0,x20
00a0afdc	bl 0x00c38e00
00a0afe0	mov w0,#0x1
00a0afe4	ldp x29,x30,[sp, #0x30]
00a0afe8	ldp x20,x19,[sp, #0x20]
00a0afec	ldp x22,x21,[sp, #0x10]
00a0aff0	ldr x23,[sp], #0x40
00a0aff4	ret
