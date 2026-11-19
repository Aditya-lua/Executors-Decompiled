; FUN_0084cdb0 @ 0084cdb0
0084cdb0	stp x29,x30,[sp, #-0x60]!
0084cdb4	str x27,[sp, #0x10]
0084cdb8	stp x26,x25,[sp, #0x20]
0084cdbc	stp x24,x23,[sp, #0x30]
0084cdc0	stp x22,x21,[sp, #0x40]
0084cdc4	stp x20,x19,[sp, #0x50]
0084cdc8	mov x29,sp
0084cdcc	ldp x23,x21,[x0]
0084cdd0	mov x19,x0
0084cdd4	mov x20,x1
0084cdd8	cmp x21,x23
0084cddc	b.eq 0x0084cde8
0084cde0	mov x22,x21
0084cde4	b 0x0084cf18
0084cde8	ldp x26,x8,[x19, #0x10]
0084cdec	cmp x26,x8
0084cdf0	b.cs 0x0084ce38
0084cdf4	sub x8,x8,x26
0084cdf8	subs x9,x26,x21
0084cdfc	asr x8,x8,#0x3
0084ce00	subs x2,x26,x21
0084ce04	add x8,x8,#0x1
0084ce08	add x8,x8,x8, LSR #0x3f
0084ce0c	asr x23,x8,#0x1
0084ce10	add x8,x26,x23, LSL #0x3
0084ce14	sub x22,x8,x9
0084ce18	b.eq 0x0084ce2c
0084ce1c	mov x0,x22
0084ce20	mov x1,x21
0084ce24	bl 0x00c2ff60
0084ce28	ldr x26,[x19, #0x10]
0084ce2c	add x8,x26,x23, LSL #0x3
0084ce30	str x8,[x19, #0x10]
0084ce34	b 0x0084cf18
0084ce38	subs x24,x8,x21
0084ce3c	asr x8,x24,#0x2
0084ce40	csinc x8,x8,xzr,ne
0084ce44	lsr x9,x8,#0x3d
0084ce48	cbnz x9,0x0084cf40
0084ce4c	lsl x25,x8,#0x3
0084ce50	add x9,x8,#0x3
0084ce54	lsr x27,x9,#0x2
0084ce58	mov x0,x25
0084ce5c	bl 0x00c2fed0
0084ce60	add x22,x0,x27, LSL #0x3
0084ce64	subs x10,x26,x21
0084ce68	add x8,x0,x25
0084ce6c	mov x9,x22
0084ce70	b.eq 0x0084cefc
0084ce74	sub x12,x10,#0x8
0084ce78	add x9,x22,x10
0084ce7c	mov x10,x22
0084ce80	cmp x12,#0x38
0084ce84	mov x11,x21
0084ce88	b.cc 0x0084ceec
0084ce8c	lsl x10,x27,#0x3
0084ce90	mov x11,x21
0084ce94	add x15,x10,x0
0084ce98	sub x10,x15,x21
0084ce9c	cmp x10,#0x20
0084cea0	mov x10,x22
0084cea4	b.cc 0x0084ceec
0084cea8	lsr x10,x12,#0x3
0084ceac	add x14,x21,#0x10
0084ceb0	add x15,x15,#0x10
0084ceb4	add x12,x10,#0x1
0084ceb8	and x13,x12,#0x3ffffffffffffffc
0084cebc	lsl x11,x13,#0x3
0084cec0	mov x16,x13
0084cec4	add x10,x22,x11
0084cec8	add x11,x21,x11
0084cecc	ldp q0,q1,[x14, #-0x10]
0084ced0	subs x16,x16,#0x4
0084ced4	add x14,x14,#0x20
0084ced8	stp q0,q1,[x15, #-0x10]
0084cedc	add x15,x15,#0x20
0084cee0	b.ne 0x0084cecc
0084cee4	cmp x12,x13
0084cee8	b.eq 0x0084cefc
0084ceec	ldr x12,[x11], #0x8
0084cef0	str x12,[x10], #0x8
0084cef4	cmp x10,x9
0084cef8	b.ne 0x0084ceec
0084cefc	stp x0,x22,[x19]
0084cf00	stp x9,x8,[x19, #0x10]
0084cf04	cbz x21,0x0084cf18
0084cf08	mov x0,x23
0084cf0c	mov x1,x24
0084cf10	bl 0x00c2fe80
0084cf14	ldr x22,[x19, #0x8]
0084cf18	ldr x8,[x20]
0084cf1c	str x8,[x22, #-0x8]!
0084cf20	str x22,[x19, #0x8]
0084cf24	ldp x20,x19,[sp, #0x50]
0084cf28	ldr x27,[sp, #0x10]
0084cf2c	ldp x22,x21,[sp, #0x40]
0084cf30	ldp x24,x23,[sp, #0x30]
0084cf34	ldp x26,x25,[sp, #0x20]
0084cf38	ldp x29,x30,[sp], #0x60
0084cf3c	ret
0084cf40	bl 0x007fe1b8
