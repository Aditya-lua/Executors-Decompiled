; BUF_reverse @ 00a0bce8
00a0bce8	cbz x1,0x00a0bd34
00a0bcec	cbz x2,0x00a0bd5c
00a0bcf0	add x9,x0,x2
00a0bcf4	cmp x2,#0x20
00a0bcf8	sub x8,x9,#0x1
00a0bcfc	b.cc 0x00a0bd14
00a0bd00	add x10,x1,x2
00a0bd04	cmp x10,x0
00a0bd08	b.ls 0x00a0bd60
00a0bd0c	cmp x9,x1
00a0bd10	b.ls 0x00a0bd60
00a0bd14	mov x11,xzr
00a0bd18	mov x9,x1
00a0bd1c	sub x10,x2,x11
00a0bd20	ldrb w11,[x9], #0x1
00a0bd24	subs x10,x10,#0x1
00a0bd28	strb w11,[x8], #-0x1
00a0bd2c	b.ne 0x00a0bd20
00a0bd30	b 0x00a0bd5c
00a0bd34	lsr x8,x2,#0x1
00a0bd38	cbz x8,0x00a0bd5c
00a0bd3c	add x9,x0,x2
00a0bd40	sub x9,x9,#0x1
00a0bd44	ldrb w10,[x0]
00a0bd48	ldrb w11,[x9]
00a0bd4c	subs x8,x8,#0x1
00a0bd50	strb w10,[x9], #-0x1
00a0bd54	strb w11,[x0], #0x1
00a0bd58	b.ne 0x00a0bd44
00a0bd5c	ret
00a0bd60	adrp x9,0x29d000
00a0bd64	ldr q0,[x9, #0x80]
00a0bd68	and x10,x2,#0x1f
00a0bd6c	sub x11,x2,x10
00a0bd70	sub x12,x10,x2
00a0bd74	add x13,x0,x2
00a0bd78	add x8,x8,x12
00a0bd7c	add x9,x1,x11
00a0bd80	add x12,x1,#0x10
00a0bd84	sub x13,x13,#0x10
00a0bd88	mov x14,x11
00a0bd8c	ldp q1,q2,[x12, #-0x10]
00a0bd90	add x12,x12,#0x20
00a0bd94	subs x14,x14,#0x20
00a0bd98	tbl v1.16B,{v1.16B},v0.16B
00a0bd9c	tbl v2.16B,{v2.16B},v0.16B
00a0bda0	stp q2,q1,[x13, #-0x10]
00a0bda4	sub x13,x13,#0x20
00a0bda8	b.ne 0x00a0bd8c
00a0bdac	cbnz x10,0x00a0bd1c
00a0bdb0	b 0x00a0bd5c
