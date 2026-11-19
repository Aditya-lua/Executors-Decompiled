; FUN_00bcab58 @ 00bcab58
00bcab58	paciasp
00bcab5c	stp x29,x30,[sp, #-0x50]!
00bcab60	stp x26,x25,[sp, #0x10]
00bcab64	stp x24,x23,[sp, #0x20]
00bcab68	stp x22,x21,[sp, #0x30]
00bcab6c	stp x20,x19,[sp, #0x40]
00bcab70	mov x29,sp
00bcab74	ldrb w25,[x0]
00bcab78	mov x23,x8
00bcab7c	ldr x8,[x0, #0x8]
00bcab80	mov x22,x0
00bcab84	mov x0,x1
00bcab88	mov x19,x1
00bcab8c	lsr x9,x25,#0x1
00bcab90	tst w25,#0x1
00bcab94	csel x21,x9,x8,eq
00bcab98	bl 0x00c2ff50
00bcab9c	add x26,x21,x0
00bcaba0	cmn x26,#0x8
00bcaba4	b.cs 0x00bcac50
00bcaba8	mov x20,x0
00bcabac	cmp x26,#0x16
00bcabb0	b.hi 0x00bcabcc
00bcabb4	lsl w8,w26,#0x1
00bcabb8	mov x0,xzr
00bcabbc	stp xzr,xzr,[x23]
00bcabc0	str xzr,[x23, #0x10]
00bcabc4	strb w8,[x23]
00bcabc8	b 0x00bcabf4
00bcabcc	orr x8,x26,#0x7
00bcabd0	mov w9,#0x1a
00bcabd4	cmp x8,#0x17
00bcabd8	csinc x24,x9,x8,eq
00bcabdc	mov x0,x24
00bcabe0	bl 0x00c2fed0
00bcabe4	orr x8,x24,#0x1
00bcabe8	stp x26,x0,[x23, #0x8]
00bcabec	str x8,[x23]
00bcabf0	and w8,w8,#0xff
00bcabf4	tst w8,#0x1
00bcabf8	csinc x23,x0,x23,ne
00bcabfc	cbz x21,0x00bcac18
00bcac00	ldr x8,[x22, #0x10]
00bcac04	tst w25,#0x1
00bcac08	mov x0,x23
00bcac0c	mov x2,x21
00bcac10	csinc x1,x8,x22,ne
00bcac14	bl 0x00c2ff60
00bcac18	add x21,x23,x21
00bcac1c	cbz x20,0x00bcac30
00bcac20	mov x0,x21
00bcac24	mov x1,x19
00bcac28	mov x2,x20
00bcac2c	bl 0x00c2ff60
00bcac30	strb wzr,[x21, x20]
00bcac34	ldp x20,x19,[sp, #0x40]
00bcac38	ldp x22,x21,[sp, #0x30]
00bcac3c	ldp x24,x23,[sp, #0x20]
00bcac40	ldp x26,x25,[sp, #0x10]
00bcac44	ldp x29,x30,[sp], #0x50
00bcac48	autiasp
00bcac4c	ret
00bcac50	bl 0x007fe124
