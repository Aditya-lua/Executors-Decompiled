; BIO_callback_ctrl @ 009fcd74
009fcd74	str x19,[sp, #-0x20]!
009fcd78	stp x29,x30,[sp, #0x10]
009fcd7c	add x29,sp,#0x10
009fcd80	str x2,[sp, #0x8]
009fcd84	cbz x0,0x009fcdfc
009fcd88	ldr x8,[x0, #0x8]
009fcd8c	mov x19,x0
009fcd90	cbz x8,0x009fcdd0
009fcd94	cmp w1,#0xe
009fcd98	b.ne 0x009fcdd0
009fcd9c	ldr x9,[x8, #0x58]
009fcda0	cbz x9,0x009fcdd0
009fcda4	ldp x10,x8,[x19, #0x10]
009fcda8	cbz x10,0x009fce10
009fcdac	cbnz x8,0x009fce14
009fcdb0	orr w1,wzr,#0x6
009fcdb4	add x2,sp,#0x8
009fcdb8	orr w3,wzr,#0xe
009fcdbc	mov w5,#0x1
009fcdc0	mov x0,x19
009fcdc4	mov x4,xzr
009fcdc8	blr x10
009fcdcc	b 0x009fce38
009fcdd0	bl 0x00c342a0
009fcdd4	adrp x0,0x2b2000
009fcdd8	adrp x2,0x2b2000
009fcddc	add x0,x0,#0x42
009fcde0	add x2,x2,#0x57
009fcde4	mov w1,#0x255
009fcde8	bl 0x00c342b0
009fcdec	mov w0,#0x20
009fcdf0	mov w1,#0x79
009fcdf4	mov x2,xzr
009fcdf8	bl 0x00c342c0
009fcdfc	orr x6,xzr,#-0x2
009fce00	ldp x29,x30,[sp, #0x10]
009fce04	mov x0,x6
009fce08	ldr x19,[sp], #0x20
009fce0c	ret
009fce10	cbz x8,0x009fce50
009fce14	add x2,sp,#0x8
009fce18	orr w1,wzr,#0x6
009fce1c	orr w4,wzr,#0xe
009fce20	mov w6,#0x1
009fce24	mov x0,x19
009fce28	mov x3,xzr
009fce2c	mov x5,xzr
009fce30	mov x7,xzr
009fce34	blr x8
009fce38	mov x6,x0
009fce3c	cmp x0,#0x1
009fce40	b.lt 0x009fce00
009fce44	ldr x8,[x19, #0x8]
009fce48	ldr x2,[sp, #0x8]
009fce4c	ldr x9,[x8, #0x58]
009fce50	orr w1,wzr,#0xe
009fce54	mov x0,x19
009fce58	blr x9
009fce5c	ldp x9,x8,[x19, #0x10]
009fce60	mov x6,x0
009fce64	cbz x9,0x009fce8c
009fce68	cbnz x8,0x009fce90
009fce6c	mov w1,#0x86
009fce70	add x2,sp,#0x8
009fce74	orr w3,wzr,#0xe
009fce78	mov x0,x19
009fce7c	mov x4,xzr
009fce80	mov x5,x6
009fce84	blr x9
009fce88	b 0x009fceb0
009fce8c	cbz x8,0x009fce00
009fce90	add x2,sp,#0x8
009fce94	mov w1,#0x86
009fce98	orr w4,wzr,#0xe
009fce9c	mov x0,x19
009fcea0	mov x3,xzr
009fcea4	mov x5,xzr
009fcea8	mov x7,xzr
009fceac	blr x8
009fceb0	mov x6,x0
009fceb4	b 0x009fce00
