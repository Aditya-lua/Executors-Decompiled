; FUN_008aec14 @ 008aec14
008aec14	stp x29,x30,[sp, #-0x30]!
008aec18	stp x22,x21,[sp, #0x10]
008aec1c	stp x20,x19,[sp, #0x20]
008aec20	mov x29,sp
008aec24	ldr x8,[x0, #0x50]
008aec28	ldr x9,[x0, #0x20]
008aec2c	mov x19,x2
008aec30	mov w20,w1
008aec34	cmp x8,x9
008aec38	b.ls 0x008aec58
008aec3c	ldr x8,[x8, #0x8]
008aec40	ldr x8,[x8]
008aec44	cbz x8,0x008aec58
008aec48	ldrb w9,[x8, #0x6]
008aec4c	cbz w9,0x008aec58
008aec50	ldr x8,[x8, #0x18]
008aec54	cbnz x8,0x008aec6c
008aec58	adrp x1,0x2a7000
008aec5c	add x1,x1,#0x1a1
008aec60	mov w2,w20
008aec64	mov x3,x19
008aec68	bl 0x008aecb4
008aec6c	add x21,x8,#0x18
008aec70	adrp x1,0x2b1000
008aec74	add x1,x1,#0x404
008aec78	mov x22,x0
008aec7c	mov x0,x21
008aec80	bl 0x00c301f0
008aec84	mov w8,w0
008aec88	mov x0,x22
008aec8c	cbnz w8,0x008aec9c
008aec90	ldr x8,[x0, #0x8]
008aec94	cbz x8,0x008aec58
008aec98	add x21,x8,#0x18
008aec9c	adrp x1,0x2db000
008aeca0	add x1,x1,#0x38
008aeca4	mov w2,w20
008aeca8	mov x3,x21
008aecac	mov x4,x19
008aecb0	bl 0x008aecb4
