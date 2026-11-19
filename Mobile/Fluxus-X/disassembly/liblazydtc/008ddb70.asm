; FUN_008ddb70 @ 008ddb70
008ddb70	stp x29,x30,[sp, #-0x50]!
008ddb74	str x25,[sp, #0x10]
008ddb78	stp x24,x23,[sp, #0x20]
008ddb7c	stp x22,x21,[sp, #0x30]
008ddb80	stp x20,x19,[sp, #0x40]
008ddb84	mov x29,sp
008ddb88	ldp x9,x8,[x0, #0x8]
008ddb8c	mov x19,x0
008ddb90	mov x23,x1
008ddb94	cmp x9,x8
008ddb98	b.cs 0x008ddbac
008ddb9c	ldr q0,[x23]
008ddba0	add x24,x9,#0x10
008ddba4	str q0,[x9]
008ddba8	b 0x008ddc38
008ddbac	ldr x20,[x19]
008ddbb0	sub x22,x9,x20
008ddbb4	asr x25,x22,#0x4
008ddbb8	add x9,x25,#0x1
008ddbbc	lsr x10,x9,#0x3c
008ddbc0	cbnz x10,0x008ddc54
008ddbc4	sub x21,x8,x20
008ddbc8	orr x10,xzr,#0x7ffffffffffffff0
008ddbcc	asr x8,x21,#0x3
008ddbd0	cmp x8,x9
008ddbd4	csel x8,x8,x9,hi
008ddbd8	cmp x21,x10
008ddbdc	mov x9,#0xfffffffffffffff
008ddbe0	csel x8,x8,x9,cc
008ddbe4	lsr x9,x8,#0x3c
008ddbe8	cbnz x9,0x008ddc58
008ddbec	lsl x24,x8,#0x4
008ddbf0	mov x0,x24
008ddbf4	bl 0x00c2fed0
008ddbf8	add x8,x0,x22
008ddbfc	ldr q0,[x23]
008ddc00	mov x1,x20
008ddc04	sub x23,x8,x25, LSL #0x4
008ddc08	add x25,x0,x24
008ddc0c	mov x2,x22
008ddc10	str q0,[x8]
008ddc14	add x24,x8,#0x10
008ddc18	mov x0,x23
008ddc1c	bl 0x00c2ffd0
008ddc20	stp x23,x24,[x19]
008ddc24	str x25,[x19, #0x10]
008ddc28	cbz x20,0x008ddc38
008ddc2c	mov x0,x20
008ddc30	mov x1,x21
008ddc34	bl 0x00c2fe80
008ddc38	str x24,[x19, #0x8]
008ddc3c	ldp x20,x19,[sp, #0x40]
008ddc40	ldr x25,[sp, #0x10]
008ddc44	ldp x22,x21,[sp, #0x30]
008ddc48	ldp x24,x23,[sp, #0x20]
008ddc4c	ldp x29,x30,[sp], #0x50
008ddc50	ret
008ddc54	bl 0x008ddc5c
008ddc58	bl 0x007fe1b8
