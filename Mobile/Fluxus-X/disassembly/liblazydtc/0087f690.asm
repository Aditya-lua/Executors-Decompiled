; FUN_0087f690 @ 0087f690
0087f690	stp x29,x30,[sp, #-0x20]!
0087f694	stp x20,x19,[sp, #0x10]
0087f698	mov x29,sp
0087f69c	mov x20,x1
0087f6a0	mov x19,x0
0087f6a4	bl 0x0087f788
0087f6a8	ldr x8,[x20]
0087f6ac	mov x11,#0x2d69
0087f6b0	movk x11,#0xeb38, LSL #16
0087f6b4	lsl w9,w8,#0x3
0087f6b8	lsr x10,x8,#0x20
0087f6bc	movk x11,#0xea08, LSL #32
0087f6c0	movk x11,#0x9ddf, LSL #48
0087f6c4	add x9,x9,#0x8
0087f6c8	eor x9,x9,x10
0087f6cc	mul x9,x9,x11
0087f6d0	eor x10,x10,x9, LSR #0x2f
0087f6d4	eor x9,x10,x9
0087f6d8	mov x10,#0x959d
0087f6dc	mul x9,x9,x11
0087f6e0	movk x10,#0xb8f4, LSL #16
0087f6e4	ldr x11,[x19, #0x18]
0087f6e8	movk x10,#0xd34f, LSL #32
0087f6ec	movk x10,#0x949d, LSL #48
0087f6f0	eor x9,x9,x9, LSR #0x2f
0087f6f4	mul x9,x9,x10
0087f6f8	ldrb w10,[x19, #0x30]
0087f6fc	lsr x9,x9,x10
0087f700	mov w10,#0x1
0087f704	lsr x12,x9,#0x6
0087f708	lsl x14,x10,x9
0087f70c	ldr x10,[x19]
0087f710	ldr x13,[x11, x12, LSL #0x3]
0087f714	tst x14,x13
0087f718	b.eq 0x0087f754
0087f71c	ldr x12,[x19, #0x20]
0087f720	mov w16,#0x1
0087f724	sub x15,x12,#0x1
0087f728	lsl x12,x9,#0x4
0087f72c	ldr x12,[x10, x12#0x0]
0087f730	cmp x12,x8
0087f734	b.eq 0x0087f774
0087f738	add x9,x9,#0x1
0087f73c	and x9,x9,x15
0087f740	lsr x12,x9,#0x6
0087f744	lsl x14,x16,x9
0087f748	ldr x13,[x11, x12, LSL #0x3]
0087f74c	tst x13,x14
0087f750	b.ne 0x0087f728
0087f754	orr x13,x13,x14
0087f758	str x13,[x11, x12, LSL #0x3]
0087f75c	add x11,x10,x9, LSL #0x4
0087f760	ldr x12,[x19, #0x28]
0087f764	str x8,[x11]
0087f768	add x8,x12,#0x1
0087f76c	str wzr,[x11, #0x8]
0087f770	str x8,[x19, #0x28]
0087f774	add x8,x10,x9, LSL #0x4
0087f778	add x0,x8,#0x8
0087f77c	ldp x20,x19,[sp, #0x10]
0087f780	ldp x29,x30,[sp], #0x20
0087f784	ret
