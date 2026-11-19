; FUN_008a2738 @ 008a2738
008a2738	ldr x8,[x0, #0x28]
008a273c	cbz x8,0x008a27e8
008a2740	ldr x8,[x1]
008a2744	mov x11,#0x2d69
008a2748	movk x11,#0xeb38, LSL #16
008a274c	lsl w9,w8,#0x3
008a2750	lsr x10,x8,#0x20
008a2754	movk x11,#0xea08, LSL #32
008a2758	movk x11,#0x9ddf, LSL #48
008a275c	add x9,x9,#0x8
008a2760	eor x9,x9,x10
008a2764	mul x9,x9,x11
008a2768	eor x10,x10,x9, LSR #0x2f
008a276c	eor x9,x10,x9
008a2770	mov x10,#0x959d
008a2774	mul x9,x9,x11
008a2778	movk x10,#0xb8f4, LSL #16
008a277c	movk x10,#0xd34f, LSL #32
008a2780	movk x10,#0x949d, LSL #48
008a2784	eor x9,x9,x9, LSR #0x2f
008a2788	mul x9,x9,x10
008a278c	ldrb w10,[x0, #0x30]
008a2790	lsr x9,x9,x10
008a2794	ldr x10,[x0, #0x18]
008a2798	lsr x11,x9,#0x6
008a279c	ldr x11,[x10, x11, LSL #0x3]
008a27a0	lsr x11,x11,x9
008a27a4	tbz w11,#0x0,0x008a27dc
008a27a8	ldr x12,[x0, #0x20]
008a27ac	ldr x11,[x0]
008a27b0	sub x12,x12,#0x1
008a27b4	lsl x13,x9,#0x4
008a27b8	ldr x13,[x11, x13#0x0]
008a27bc	cmp x13,x8
008a27c0	b.eq 0x008a27e4
008a27c4	add x9,x9,#0x1
008a27c8	and x9,x9,x12
008a27cc	lsr x13,x9,#0x6
008a27d0	ldr x13,[x10, x13, LSL #0x3]
008a27d4	lsr x13,x13,x9
008a27d8	tbnz w13,#0x0,0x008a27b4
008a27dc	mov x8,xzr
008a27e0	b 0x008a27e8
008a27e4	add x8,x11,x9, LSL #0x4
008a27e8	add x9,x8,#0x8
008a27ec	cmp x8,#0x0
008a27f0	csel x0,xzr,x9,eq
008a27f4	ret
