; BN_clear_bit @ 00a027b8
00a027b8	tbnz w1,#0x1f,0x00a02834
00a027bc	ldr w9,[x0, #0x8]
00a027c0	lsr w10,w1,#0x6
00a027c4	mov w8,wzr
00a027c8	cmp w9,w10
00a027cc	b.le 0x00a0282c
00a027d0	ldr x8,[x0]
00a027d4	mov w10,w10
00a027d8	lsl x10,x10,#0x3
00a027dc	and w12,w1,#0x3f
00a027e0	ldr x11,[x8, x10#0x0]
00a027e4	mov w13,#0x1
00a027e8	lsl x12,x13,x12
00a027ec	cmp w9,#0x1
00a027f0	bic x11,x11,x12
00a027f4	str x11,[x8, x10#0x0]
00a027f8	b.lt 0x00a02820
00a027fc	sxtw x10,w9
00a02800	add x8,x8,x10, LSL #0x3
00a02804	sub x8,x8,#0x8
00a02808	ldr x10,[x8]
00a0280c	cbnz x10,0x00a0281c
00a02810	subs w9,w9,#0x1
00a02814	sub x8,x8,#0x8
00a02818	b.gt 0x00a02808
00a0281c	str w9,[x0, #0x8]
00a02820	cbnz w9,0x00a02828
00a02824	str wzr,[x0, #0x10]
00a02828	mov w8,#0x1
00a0282c	mov w0,w8
00a02830	ret
00a02834	mov w0,wzr
00a02838	ret
