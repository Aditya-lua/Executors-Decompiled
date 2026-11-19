; FUN_00c2ad94 @ 00c2ad94
00c2ad94	bti c
00c2ad98	fmov x8,d0
00c2ad9c	ubfx x10,x8,#0x34,#0xb
00c2ada0	and x9,x8,#0xfffffffffffff
00c2ada4	cbz x10,0x00c2ade4
00c2ada8	lsr x11,x9,#0x4
00c2adac	lsl x9,x9,#0x3c
00c2adb0	mov w12,#0x3c00
00c2adb4	cmp x10,#0x7ff
00c2adb8	mov w13,#0x7fff
00c2adbc	add x12,x10,x12
00c2adc0	mov x9,x9
00c2adc4	mov x10,x11
00c2adc8	csel x11,x13,x12,eq
00c2adcc	and x8,x8,#-0x8000000000000000
00c2add0	orr x8,x8,x11, LSL #0x30
00c2add4	orr x8,x8,x10
00c2add8	stp x9,x8,[sp, #-0x10]!
00c2addc	ldr q0,[sp], #0x10
00c2ade0	ret
00c2ade4	cbz x9,0x00c2ae30
00c2ade8	clz x10,x9
00c2adec	lsr x12,x9,#0x1
00c2adf0	add w11,w10,#0x31
00c2adf4	mvn w13,w11
00c2adf8	lsl x9,x9,x11
00c2adfc	tst x11,#0x40
00c2ae00	lsr x12,x12,x13
00c2ae04	mov w11,#0x3c0c
00c2ae08	sub w11,w11,w10
00c2ae0c	csel x12,x9,x12,ne
00c2ae10	csel x9,xzr,x9,ne
00c2ae14	eor x10,x12,#0x1000000000000
00c2ae18	and x8,x8,#-0x8000000000000000
00c2ae1c	orr x8,x8,x11, LSL #0x30
00c2ae20	orr x8,x8,x10
00c2ae24	stp x9,x8,[sp, #-0x10]!
00c2ae28	ldr q0,[sp], #0x10
00c2ae2c	ret
00c2ae30	and x8,x8,#-0x8000000000000000
00c2ae34	orr x8,x8,xzr, LSL #0x30
00c2ae38	orr x8,x8,xzr
00c2ae3c	stp x9,x8,[sp, #-0x10]!
00c2ae40	ldr q0,[sp], #0x10
00c2ae44	ret
