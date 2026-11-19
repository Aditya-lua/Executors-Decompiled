; FUN_008dfd24 @ 008dfd24
008dfd24	stp x29,x30,[sp, #-0x50]!
008dfd28	stp x26,x25,[sp, #0x10]
008dfd2c	stp x24,x23,[sp, #0x20]
008dfd30	stp x22,x21,[sp, #0x30]
008dfd34	stp x20,x19,[sp, #0x40]
008dfd38	mov x29,sp
008dfd3c	ldp x21,x8,[x0, #0x8]
008dfd40	mov x19,x0
008dfd44	sub x9,x8,x21
008dfd48	cmp x1,x9, ASR #0x4
008dfd4c	b.ls 0x008dfda8
008dfd50	ldr x20,[x19]
008dfd54	sub x22,x21,x20
008dfd58	asr x25,x22,#0x4
008dfd5c	add x9,x25,x1
008dfd60	lsr x10,x9,#0x3c
008dfd64	cbnz x10,0x008dfe48
008dfd68	sub x21,x8,x20
008dfd6c	orr x10,xzr,#0x7ffffffffffffff0
008dfd70	asr x8,x21,#0x3
008dfd74	cmp x8,x9
008dfd78	csel x8,x8,x9,hi
008dfd7c	cmp x21,x10
008dfd80	mov x9,#0xfffffffffffffff
008dfd84	csel x23,x8,x9,cc
008dfd88	cbz x23,0x008dfdcc
008dfd8c	lsr x8,x23,#0x3c
008dfd90	cbnz x8,0x008dfe4c
008dfd94	lsl x0,x23,#0x4
008dfd98	mov x24,x1
008dfd9c	bl 0x00c2fed0
008dfda0	mov x1,x24
008dfda4	b 0x008dfdd0
008dfda8	cbz x1,0x008dfdc4
008dfdac	lsl x20,x1,#0x4
008dfdb0	mov x0,x21
008dfdb4	mov w1,wzr
008dfdb8	mov x2,x20
008dfdbc	bl 0x00c301c0
008dfdc0	add x21,x21,x20
008dfdc4	str x21,[x19, #0x8]
008dfdc8	b 0x008dfe30
008dfdcc	mov x0,xzr
008dfdd0	add x26,x0,x23, LSL #0x4
008dfdd4	lsl x23,x1,#0x4
008dfdd8	add x24,x0,x22
008dfddc	mov x0,x24
008dfde0	mov w1,wzr
008dfde4	mov x2,x23
008dfde8	bl 0x00c301c0
008dfdec	sub x25,x24,x25, LSL #0x4
008dfdf0	mov x1,x20
008dfdf4	mov x2,x22
008dfdf8	add x23,x24,x23
008dfdfc	mov x0,x25
008dfe00	bl 0x00c2ffd0
008dfe04	stp x25,x23,[x19]
008dfe08	str x26,[x19, #0x10]
008dfe0c	cbz x20,0x008dfe30
008dfe10	mov x0,x20
008dfe14	mov x1,x21
008dfe18	ldp x20,x19,[sp, #0x40]
008dfe1c	ldp x22,x21,[sp, #0x30]
008dfe20	ldp x24,x23,[sp, #0x20]
008dfe24	ldp x26,x25,[sp, #0x10]
008dfe28	ldp x29,x30,[sp], #0x50
008dfe2c	b 0x00c2fe80
008dfe30	ldp x20,x19,[sp, #0x40]
008dfe34	ldp x22,x21,[sp, #0x30]
008dfe38	ldp x24,x23,[sp, #0x20]
008dfe3c	ldp x26,x25,[sp, #0x10]
008dfe40	ldp x29,x30,[sp], #0x50
008dfe44	ret
008dfe48	bl 0x008ddc5c
008dfe4c	bl 0x007fe1b8
