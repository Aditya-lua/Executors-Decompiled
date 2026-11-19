; ssl3_release_write_buffer @ 009cce04
009cce04	stp x24,x23,[sp, #-0x40]!
009cce08	stp x22,x21,[sp, #0x10]
009cce0c	stp x20,x19,[sp, #0x20]
009cce10	stp x29,x30,[sp, #0x30]
009cce14	ldr x21,[x0, #0xc70]
009cce18	mov x19,x0
009cce1c	add x29,sp,#0x30
009cce20	cbz x21,0x009cce78
009cce24	orr w22,wzr,#0x30
009cce28	madd x8,x21,x22,x19
009cce2c	adrp x20,0x2d7000
009cce30	add x23,x8,#0xc78
009cce34	add x20,x20,#0xa7b
009cce38	ldr w8,[x23, #0x28]
009cce3c	sub x21,x21,#0x1
009cce40	cbz w8,0x009cce50
009cce44	str wzr,[x23, #0x28]
009cce48	mov x24,x23
009cce4c	b 0x009cce6c
009cce50	ldr x0,[x23]
009cce54	nop
009cce58	madd x8,x21,x22,x19
009cce5c	mov w2,#0xb1
009cce60	mov x1,x20
009cce64	add x24,x8,#0xca8
009cce68	bl 0x00c32310
009cce6c	sub x23,x23,#0x30
009cce70	str xzr,[x24]
009cce74	cbnz x21,0x009cce38
009cce78	str xzr,[x19, #0xc70]
009cce7c	ldp x29,x30,[sp, #0x30]
009cce80	ldp x20,x19,[sp, #0x20]
009cce84	ldp x22,x21,[sp, #0x10]
009cce88	mov w0,#0x1
009cce8c	ldp x24,x23,[sp], #0x40
009cce90	ret
