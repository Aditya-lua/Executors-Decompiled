; FUN_008df9c0 @ 008df9c0
008df9c0	stp x29,x30,[sp, #-0x60]!
008df9c4	str x27,[sp, #0x10]
008df9c8	stp x26,x25,[sp, #0x20]
008df9cc	stp x24,x23,[sp, #0x30]
008df9d0	stp x22,x21,[sp, #0x40]
008df9d4	stp x20,x19,[sp, #0x50]
008df9d8	mov x29,sp
008df9dc	ldp x21,x8,[x0, #0x8]
008df9e0	mov x19,x0
008df9e4	cmp x21,x8
008df9e8	b.cs 0x008dfa04
008df9ec	mov x0,x21
008df9f0	mov w2,#0x1408
008df9f4	mov w20,#0x1408
008df9f8	bl 0x00c2ffd0
008df9fc	add x23,x21,x20
008dfa00	b 0x008dfad4
008dfa04	ldr x20,[x19]
008dfa08	mov x11,#0x3d81
008dfa0c	mov x10,#0x1
008dfa10	movk x11,#0x66, LSL #16
008dfa14	sub x22,x21,x20
008dfa18	movk x11,#0xc27f, LSL #32
008dfa1c	asr x9,x22,#0x3
008dfa20	movk x11,#0xff99, LSL #48
008dfa24	madd x10,x9,x11,x10
008dfa28	mov x9,#0x384f
008dfa2c	movk x9,#0x1ff3, LSL #16
008dfa30	movk x9,#0xc7b0, LSL #32
008dfa34	movk x9,#0xc, LSL #48
008dfa38	cmp x10,x9
008dfa3c	b.hi 0x008dfaf4
008dfa40	sub x21,x8,x20
008dfa44	mov x12,#0x9c27
008dfa48	asr x8,x21,#0x3
008dfa4c	movk x12,#0xff9, LSL #16
008dfa50	movk x12,#0x63d8, LSL #32
008dfa54	mul x8,x8,x11
008dfa58	movk x12,#0x6, LSL #48
008dfa5c	lsl x11,x8,#0x1
008dfa60	cmp x11,x10
008dfa64	csel x10,x11,x10,hi
008dfa68	cmp x8,x12
008dfa6c	csel x8,x10,x9,cc
008dfa70	cmp x8,x9
008dfa74	b.hi 0x008dfaf8
008dfa78	mov w27,#0x1408
008dfa7c	mov x23,x1
008dfa80	mul x24,x8,x27
008dfa84	mov x0,x24
008dfa88	bl 0x00c2fed0
008dfa8c	add x26,x0,x22
008dfa90	mov x25,x0
008dfa94	add x24,x0,x24
008dfa98	mov x0,x26
008dfa9c	mov x1,x23
008dfaa0	mov w2,#0x1408
008dfaa4	bl 0x00c2ffd0
008dfaa8	mov x0,x25
008dfaac	mov x1,x20
008dfab0	mov x2,x22
008dfab4	add x23,x26,x27
008dfab8	bl 0x00c2ffd0
008dfabc	stp x25,x23,[x19]
008dfac0	str x24,[x19, #0x10]
008dfac4	cbz x20,0x008dfad4
008dfac8	mov x0,x20
008dfacc	mov x1,x21
008dfad0	bl 0x00c2fe80
008dfad4	str x23,[x19, #0x8]
008dfad8	ldp x20,x19,[sp, #0x50]
008dfadc	ldr x27,[sp, #0x10]
008dfae0	ldp x22,x21,[sp, #0x40]
008dfae4	ldp x24,x23,[sp, #0x30]
008dfae8	ldp x26,x25,[sp, #0x20]
008dfaec	ldp x29,x30,[sp], #0x60
008dfaf0	ret
008dfaf4	bl 0x008dfe50
008dfaf8	bl 0x007fe1b8
