; FUN_007fcd7c @ 007fcd7c
007fcd7c	stp x29,x30,[sp, #-0x30]!
007fcd80	stp x22,x21,[sp, #0x10]
007fcd84	stp x20,x19,[sp, #0x20]
007fcd88	mov x29,sp
007fcd8c	mov x19,x0
007fcd90	add x0,x0,#0x60
007fcd94	bl 0x00c2ff10
007fcd98	ldr x8,[x19, #0x58]
007fcd9c	cbz x8,0x007fce34
007fcda0	ldr x9,[x19, #0x50]
007fcda4	orr x20,xzr,#-0x3f3f3f3f3f3f3f40
007fcda8	mov w21,#0xaa
007fcdac	movk x20,#0xc0c1
007fcdb0	mov w22,#0x18
007fcdb4	b 0x007fcdbc
007fcdb8	cbz x8,0x007fce34
007fcdbc	umulh x10,x9,x20
007fcdc0	ldr x12,[x19, #0x38]
007fcdc4	lsr x10,x10,#0x7
007fcdc8	msub x11,x10,x21,x9
007fcdcc	ldr x10,[x12, x10, LSL #0x3]
007fcdd0	nop
007fcdd4	madd x10,x11,x22,x10
007fcdd8	ldrb w11,[x10]
007fcddc	tbz w11,#0x0,0x007fcdf4
007fcde0	ldr x8,[x10]
007fcde4	ldr x0,[x10, #0x10]
007fcde8	and x1,x8,#-0x2
007fcdec	bl 0x00c2fe80
007fcdf0	ldp x9,x8,[x19, #0x50]
007fcdf4	add x9,x9,#0x1
007fcdf8	sub x8,x8,#0x1
007fcdfc	cmp x9,#0x154
007fce00	stp x9,x8,[x19, #0x50]
007fce04	b.cc 0x007fcdb8
007fce08	ldr x8,[x19, #0x38]
007fce0c	mov w1,#0xff0
007fce10	ldr x0,[x8]
007fce14	bl 0x00c2fe80
007fce18	ldr x8,[x19, #0x38]
007fce1c	add x10,x8,#0x8
007fce20	ldp x9,x8,[x19, #0x50]
007fce24	str x10,[x19, #0x38]
007fce28	sub x9,x9,#0xaa
007fce2c	str x9,[x19, #0x50]
007fce30	b 0x007fcdb8
007fce34	add x0,x19,#0x60
007fce38	ldp x20,x19,[sp, #0x20]
007fce3c	ldp x22,x21,[sp, #0x10]
007fce40	ldp x29,x30,[sp], #0x30
007fce44	b 0x00c2ff20
