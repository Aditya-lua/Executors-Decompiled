; cpr::CurlHolder::urlDecode @ 008eac84
008eac84	str x23,[sp, #-0x40]!
008eac88	stp x22,x21,[sp, #0x10]
008eac8c	stp x20,x19,[sp, #0x20]
008eac90	stp x29,x30,[sp, #0x30]
008eac94	add x29,sp,#0x30
008eac98	mov x19,x8
008eac9c	ldrb w8,[x1]
008eaca0	ldr x9,[x1, #0x10]
008eaca4	ldr w10,[x1, #0x8]
008eaca8	ldr x0,[x0]
008eacac	lsr w11,w8,#0x1
008eacb0	tst w8,#0x1
008eacb4	csinc x1,x9,x1,ne
008eacb8	csel w2,w11,w10,eq
008eacbc	mov x3,xzr
008eacc0	bl 0x00c31010
008eacc4	mov x20,x0
008eacc8	stp xzr,xzr,[x19, #0x8]
008eaccc	str xzr,[x19]
008eacd0	cbz x0,0x008ead04
008eacd4	mov x0,x20
008eacd8	bl 0x00c2ff50
008eacdc	mov x21,x0
008eace0	cmn x0,#0x10
008eace4	b.cs 0x008ead5c
008eace8	cmp x21,#0x17
008eacec	b.cs 0x008ead0c
008eacf0	lsl w8,w21,#0x1
008eacf4	mov x22,x19
008eacf8	strb w8,[x22], #0x1
008eacfc	cbnz x21,0x008ead2c
008ead00	b 0x008ead3c
008ead04	strh wzr,[x19]
008ead08	b 0x008ead48
008ead0c	add x8,x21,#0x10
008ead10	and x23,x8,#-0x10
008ead14	mov x0,x23
008ead18	bl 0x00c2fed0
008ead1c	orr x8,x23,#0x1
008ead20	mov x22,x0
008ead24	stp x21,x0,[x19, #0x8]
008ead28	str x8,[x19]
008ead2c	mov x0,x22
008ead30	mov x1,x20
008ead34	mov x2,x21
008ead38	bl 0x00c2ffd0
008ead3c	strb wzr,[x22, x21]
008ead40	mov x0,x20
008ead44	bl 0x00c31020
008ead48	ldp x29,x30,[sp, #0x30]
008ead4c	ldp x20,x19,[sp, #0x20]
008ead50	ldp x22,x21,[sp, #0x10]
008ead54	ldr x23,[sp], #0x40
008ead58	ret
008ead5c	mov x0,x19
008ead60	bl 0x00c30ce0
