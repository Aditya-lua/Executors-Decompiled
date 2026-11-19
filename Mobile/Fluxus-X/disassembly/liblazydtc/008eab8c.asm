; cpr::CurlHolder::urlEncode @ 008eab8c
008eab8c	str x23,[sp, #-0x40]!
008eab90	stp x22,x21,[sp, #0x10]
008eab94	stp x20,x19,[sp, #0x20]
008eab98	stp x29,x30,[sp, #0x30]
008eab9c	add x29,sp,#0x30
008eaba0	mov x19,x8
008eaba4	ldrb w8,[x1]
008eaba8	ldr x9,[x1, #0x10]
008eabac	ldr w10,[x1, #0x8]
008eabb0	ldr x0,[x0]
008eabb4	lsr w11,w8,#0x1
008eabb8	tst w8,#0x1
008eabbc	csinc x1,x9,x1,ne
008eabc0	csel w2,w11,w10,eq
008eabc4	bl 0x00c30ff0
008eabc8	mov x20,x0
008eabcc	stp xzr,xzr,[x19, #0x8]
008eabd0	str xzr,[x19]
008eabd4	cbz x0,0x008eac08
008eabd8	mov x0,x20
008eabdc	bl 0x00c2ff50
008eabe0	mov x21,x0
008eabe4	cmn x0,#0x10
008eabe8	b.cs 0x008eac60
008eabec	cmp x21,#0x17
008eabf0	b.cs 0x008eac10
008eabf4	lsl w8,w21,#0x1
008eabf8	mov x22,x19
008eabfc	strb w8,[x22], #0x1
008eac00	cbnz x21,0x008eac30
008eac04	b 0x008eac40
008eac08	strh wzr,[x19]
008eac0c	b 0x008eac4c
008eac10	add x8,x21,#0x10
008eac14	and x23,x8,#-0x10
008eac18	mov x0,x23
008eac1c	bl 0x00c2fed0
008eac20	orr x8,x23,#0x1
008eac24	mov x22,x0
008eac28	stp x21,x0,[x19, #0x8]
008eac2c	str x8,[x19]
008eac30	mov x0,x22
008eac34	mov x1,x20
008eac38	mov x2,x21
008eac3c	bl 0x00c2ffd0
008eac40	strb wzr,[x22, x21]
008eac44	mov x0,x20
008eac48	bl 0x00c31020
008eac4c	ldp x29,x30,[sp, #0x30]
008eac50	ldp x20,x19,[sp, #0x20]
008eac54	ldp x22,x21,[sp, #0x10]
008eac58	ldr x23,[sp], #0x40
008eac5c	ret
008eac60	mov x0,x19
008eac64	bl 0x00c30ce0
