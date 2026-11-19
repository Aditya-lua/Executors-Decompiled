; BN_rshift1 @ 00a0ab88
00a0ab88	stp x22,x21,[sp, #-0x30]!
00a0ab8c	stp x20,x19,[sp, #0x10]
00a0ab90	mov x19,x0
00a0ab94	mov x0,x1
00a0ab98	stp x29,x30,[sp, #0x20]
00a0ab9c	add x29,sp,#0x20
00a0aba0	mov x21,x1
00a0aba4	bl 0x00c369b0
00a0aba8	cbz w0,0x00a0abb8
00a0abac	mov x0,x19
00a0abb0	bl 0x00c38e00
00a0abb4	b 0x00a0ac40
00a0abb8	ldrsw x20,[x21, #0x8]
00a0abbc	ldr x22,[x21]
00a0abc0	cmp x21,x19
00a0abc4	b.eq 0x00a0abe0
00a0abc8	mov x0,x19
00a0abcc	mov w1,w20
00a0abd0	bl 0x00c38e80
00a0abd4	cbz x0,0x00a0ac44
00a0abd8	ldr w8,[x21, #0x10]
00a0abdc	str w8,[x19, #0x10]
00a0abe0	sub w8,w20,#0x1
00a0abe4	sbfiz x10,x8,#0x3,#0x20
00a0abe8	ldr x9,[x22, x10#0x0]
00a0abec	ldr x8,[x19]
00a0abf0	lsr x11,x9,#0x1
00a0abf4	cmp x9,#0x1
00a0abf8	str x11,[x8, x10#0x0]
00a0abfc	cset w10,eq
00a0ac00	sub w10,w20,w10
00a0ac04	cmp w20,#0x2
00a0ac08	str w10,[x19, #0x8]
00a0ac0c	b.lt 0x00a0ac38
00a0ac10	sub x11,x20,#0x2
00a0ac14	lsl x12,x11,#0x3
00a0ac18	ldr x13,[x22, x12#0x0]
00a0ac1c	add x14,x11,#0x1
00a0ac20	sub x11,x11,#0x1
00a0ac24	cmp x14,#0x1
00a0ac28	extr x9,x9,x13,#0x1
00a0ac2c	str x9,[x8, x12#0x0]
00a0ac30	mov x9,x13
00a0ac34	b.gt 0x00a0ac14
00a0ac38	cbnz w10,0x00a0ac40
00a0ac3c	str wzr,[x19, #0x10]
00a0ac40	mov w0,#0x1
00a0ac44	ldp x29,x30,[sp, #0x20]
00a0ac48	ldp x20,x19,[sp, #0x10]
00a0ac4c	ldp x22,x21,[sp], #0x30
00a0ac50	ret
