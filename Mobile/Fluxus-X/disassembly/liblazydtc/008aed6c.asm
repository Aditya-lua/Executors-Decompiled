; FUN_008aed6c @ 008aed6c
008aed6c	stp x29,x30,[sp, #-0x30]!
008aed70	stp x22,x21,[sp, #0x10]
008aed74	stp x20,x19,[sp, #0x20]
008aed78	mov x29,sp
008aed7c	ldr x8,[x0, #0x50]
008aed80	ldr x9,[x0, #0x20]
008aed84	mov x19,x2
008aed88	mov x21,x0
008aed8c	mov w20,w1
008aed90	cmp x8,x9
008aed94	b.ls 0x008aedb4
008aed98	ldr x8,[x8, #0x8]
008aed9c	ldr x8,[x8]
008aeda0	cbz x8,0x008aedb4
008aeda4	ldrb w9,[x8, #0x6]
008aeda8	cbz w9,0x008aedb4
008aedac	ldr x8,[x8, #0x18]
008aedb0	cbnz x8,0x008aee4c
008aedb4	mov x22,xzr
008aedb8	mov x0,x21
008aedbc	mov w1,w20
008aedc0	bl 0x008aa2e4
008aedc4	cbnz x0,0x008aede4
008aedc8	cbnz x22,0x008aee14
008aedcc	adrp x1,0x2ac000
008aedd0	add x1,x1,#0xfc1
008aedd4	mov x0,x21
008aedd8	mov w2,w20
008aeddc	mov x3,x19
008aede0	bl 0x008aecb4
008aede4	mov x1,x0
008aede8	mov x0,x21
008aedec	bl 0x008be244
008aedf0	mov x5,x0
008aedf4	cbnz x22,0x008aee30
008aedf8	adrp x1,0x2ac000
008aedfc	add x1,x1,#0xf96
008aee00	mov x0,x21
008aee04	mov w2,w20
008aee08	mov x3,x19
008aee0c	mov x4,x5
008aee10	bl 0x008aecb4
008aee14	adrp x1,0x2ce000
008aee18	add x1,x1,#0xe0a
008aee1c	mov x0,x21
008aee20	mov w2,w20
008aee24	mov x3,x22
008aee28	mov x4,x19
008aee2c	bl 0x008aecb4
008aee30	adrp x1,0x2cc000
008aee34	add x1,x1,#0xbb9
008aee38	mov x0,x21
008aee3c	mov w2,w20
008aee40	mov x3,x22
008aee44	mov x4,x19
008aee48	bl 0x008aecb4
008aee4c	add x22,x8,#0x18
008aee50	adrp x1,0x2b1000
008aee54	add x1,x1,#0x404
008aee58	mov x0,x22
008aee5c	bl 0x00c301f0
008aee60	cbnz w0,0x008aedb8
008aee64	ldr x8,[x21, #0x8]
008aee68	add x9,x8,#0x18
008aee6c	cmp x8,#0x0
008aee70	csel x22,xzr,x9,eq
008aee74	b 0x008aedb8
