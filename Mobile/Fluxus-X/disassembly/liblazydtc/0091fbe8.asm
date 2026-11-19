; FUN_0091fbe8 @ 0091fbe8
0091fbe8	subs x9,x1,#0xa
0091fbec	mov x8,x0
0091fbf0	b.ge 0x0091fbfc
0091fbf4	mov w0,#0x2
0091fbf8	ret
0091fbfc	ldrb w10,[x8]
0091fc00	cmp w10,#0x1f
0091fc04	b.ne 0x0091fc48
0091fc08	ldrb w10,[x8, #0x1]
0091fc0c	cmp w10,#0x8b
0091fc10	b.ne 0x0091fc50
0091fc14	ldrb w10,[x8, #0x2]
0091fc18	mov w0,#0x1
0091fc1c	cmp w10,#0x8
0091fc20	b.ne 0x0091fcf4
0091fc24	ldrb w10,[x8, #0x3]
0091fc28	and w11,w10,#0xe0
0091fc2c	cbnz w11,0x0091fcf4
0091fc30	add x11,x8,#0xa
0091fc34	tbz w10,#0x2,0x0091fc7c
0091fc38	cmp x1,#0xc
0091fc3c	b.ge 0x0091fc58
0091fc40	mov w0,#0x2
0091fc44	ret
0091fc48	mov w0,#0x1
0091fc4c	ret
0091fc50	mov w0,#0x1
0091fc54	ret
0091fc58	ldrb w12,[x8, #0xb]
0091fc5c	ldrb w8,[x8, #0xa]
0091fc60	bfm x8,x12,#0x38,#0x7
0091fc64	add x8,x8,#0x2
0091fc68	subs x9,x9,x8
0091fc6c	b.ge 0x0091fc78
0091fc70	mov w0,#0x2
0091fc74	ret
0091fc78	add x11,x11,x8
0091fc7c	tbz w10,#0x3,0x0091fc90
0091fc80	cbz x9,0x0091fcc0
0091fc84	ldrb w8,[x11], #0x1
0091fc88	sub x9,x9,#0x1
0091fc8c	cbnz w8,0x0091fc80
0091fc90	tbz w10,#0x4,0x0091fcd4
0091fc94	cbz x9,0x0091fcc8
0091fc98	mov w8,#0x1
0091fc9c	sub x8,x8,x9
0091fca0	mov w0,#0x2
0091fca4	ldrb w9,[x11]
0091fca8	cbz w9,0x0091fcd0
0091fcac	add x8,x8,#0x1
0091fcb0	add x11,x11,#0x1
0091fcb4	cmp x8,#0x1
0091fcb8	b.ne 0x0091fca4
0091fcbc	b 0x0091fcf4
0091fcc0	mov w0,#0x2
0091fcc4	ret
0091fcc8	mov w0,#0x2
0091fccc	ret
0091fcd0	neg x9,x8
0091fcd4	tbz w10,#0x1,0x0091fce8
0091fcd8	subs x9,x9,#0x2
0091fcdc	b.ge 0x0091fce8
0091fce0	mov w0,#0x2
0091fce4	ret
0091fce8	mov w0,wzr
0091fcec	sub x8,x1,x9
0091fcf0	str x8,[x2]
0091fcf4	ret
