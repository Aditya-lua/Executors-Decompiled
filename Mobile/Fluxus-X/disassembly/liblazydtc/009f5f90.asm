; ASN1_BIT_STRING_check @ 009f5f90
009f5f90	cbz x0,0x009f5ff0
009f5f94	ldr x8,[x0, #0x8]
009f5f98	cbz x8,0x009f5ff8
009f5f9c	ldrsw x9,[x0]
009f5fa0	cmp w9,#0x1
009f5fa4	b.lt 0x009f6000
009f5fa8	mov x10,xzr
009f5fac	sxtw x11,w2
009f5fb0	cmp x10,x11
009f5fb4	b.ge 0x009f5fc4
009f5fb8	ldrb w12,[x1, x10]
009f5fbc	mvn w12,w12
009f5fc0	b 0x009f5fc8
009f5fc4	orr w12,wzr,#0xff
009f5fc8	ldrb w13,[x8, x10]
009f5fcc	and w12,w13,w12
009f5fd0	tst w12,#0xff
009f5fd4	b.ne 0x009f5fe4
009f5fd8	add x10,x10,#0x1
009f5fdc	cmp x10,x9
009f5fe0	b.lt 0x009f5fb0
009f5fe4	tst w12,#0xff
009f5fe8	cset w0,eq
009f5fec	ret
009f5ff0	mov w0,#0x1
009f5ff4	ret
009f5ff8	mov w0,#0x1
009f5ffc	ret
009f6000	mov w0,#0x1
009f6004	ret
