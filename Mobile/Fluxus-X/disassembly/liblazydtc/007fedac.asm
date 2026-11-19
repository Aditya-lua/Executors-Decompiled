; FUN_007fedac @ 007fedac
007fedac	stp x29,x30,[sp, #-0x50]!
007fedb0	stp x26,x25,[sp, #0x10]
007fedb4	stp x24,x23,[sp, #0x20]
007fedb8	stp x22,x21,[sp, #0x30]
007fedbc	stp x20,x19,[sp, #0x40]
007fedc0	mov x29,sp
007fedc4	ldp x25,x8,[x0, #0x10]
007fedc8	mov x19,x0
007fedcc	mov x20,x1
007fedd0	cmp x25,x8
007fedd4	b.ne 0x007fef04
007fedd8	ldp x21,x23,[x19]
007feddc	subs x8,x23,x21
007fede0	b.ls 0x007fee28
007fede4	asr x8,x8,#0x3
007fede8	subs x22,x25,x23
007fedec	add x8,x8,#0x1
007fedf0	add x8,x8,x8, LSR #0x3f
007fedf4	asr x8,x8,#0x1
007fedf8	sub x21,x23,x8, LSL #0x3
007fedfc	neg x24,x8
007fee00	b.eq 0x007fee18
007fee04	mov x0,x21
007fee08	mov x1,x23
007fee0c	mov x2,x22
007fee10	bl 0x00c2ff60
007fee14	ldr x23,[x19, #0x8]
007fee18	add x8,x23,x24, LSL #0x3
007fee1c	add x25,x21,x22
007fee20	str x8,[x19, #0x8]
007fee24	b 0x007fef04
007fee28	subs x22,x25,x21
007fee2c	asr x8,x22,#0x2
007fee30	csinc x8,x8,xzr,ne
007fee34	lsr x9,x8,#0x3d
007fee38	cbnz x9,0x007fef28
007fee3c	lsl x24,x8,#0x3
007fee40	lsr x26,x8,#0x2
007fee44	mov x0,x24
007fee48	bl 0x00c2fed0
007fee4c	add x8,x0,x26, LSL #0x3
007fee50	subs x10,x25,x23
007fee54	add x9,x0,x24
007fee58	mov x25,x8
007fee5c	b.eq 0x007feee8
007fee60	sub x11,x10,#0x8
007fee64	add x25,x8,x10
007fee68	cmp x11,#0x38
007fee6c	b.cs 0x007fee78
007fee70	mov x10,x8
007fee74	b 0x007feed8
007fee78	lsl x10,x26,#0x3
007fee7c	add x15,x10,x0
007fee80	sub x10,x15,x23
007fee84	cmp x10,#0x20
007fee88	mov x10,x8
007fee8c	b.cc 0x007feed8
007fee90	lsr x10,x11,#0x3
007fee94	add x14,x23,#0x10
007fee98	add x15,x15,#0x10
007fee9c	add x11,x10,#0x1
007feea0	and x12,x11,#0x3ffffffffffffffc
007feea4	lsl x13,x12,#0x3
007feea8	mov x16,x12
007feeac	add x10,x8,x13
007feeb0	add x13,x23,x13
007feeb4	ldp q0,q1,[x14, #-0x10]
007feeb8	subs x16,x16,#0x4
007feebc	add x14,x14,#0x20
007feec0	stp q0,q1,[x15, #-0x10]
007feec4	add x15,x15,#0x20
007feec8	b.ne 0x007feeb4
007feecc	cmp x11,x12
007feed0	mov x23,x13
007feed4	b.eq 0x007feee8
007feed8	ldr x11,[x23], #0x8
007feedc	str x11,[x10], #0x8
007feee0	cmp x10,x25
007feee4	b.ne 0x007feed8
007feee8	stp x0,x8,[x19]
007feeec	stp x25,x9,[x19, #0x10]
007feef0	cbz x21,0x007fef04
007feef4	mov x0,x21
007feef8	mov x1,x22
007feefc	bl 0x00c2fe80
007fef00	ldr x25,[x19, #0x10]
007fef04	ldr x8,[x20]
007fef08	str x8,[x25], #0x8
007fef0c	str x25,[x19, #0x10]
007fef10	ldp x20,x19,[sp, #0x40]
007fef14	ldp x22,x21,[sp, #0x30]
007fef18	ldp x24,x23,[sp, #0x20]
007fef1c	ldp x26,x25,[sp, #0x10]
007fef20	ldp x29,x30,[sp], #0x50
007fef24	ret
007fef28	bl 0x007fe1b8
