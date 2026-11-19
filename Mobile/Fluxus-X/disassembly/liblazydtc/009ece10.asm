; ASN1_UNIVERSALSTRING_to_string @ 009ece10
009ece10	stp x24,x23,[sp, #-0x40]!
009ece14	stp x22,x21,[sp, #0x10]
009ece18	stp x20,x19,[sp, #0x20]
009ece1c	stp x29,x30,[sp, #0x30]
009ece20	ldr w8,[x0, #0x4]
009ece24	mov x19,x0
009ece28	mov w0,wzr
009ece2c	add x29,sp,#0x30
009ece30	cmp w8,#0x1c
009ece34	b.ne 0x009ecf5c
009ece38	ldr w9,[x19]
009ece3c	mov w0,wzr
009ece40	tst w9,#0x3
009ece44	b.ne 0x009ecf5c
009ece48	ldr x8,[x19, #0x8]
009ece4c	cmp w9,#0x1
009ece50	b.lt 0x009ecebc
009ece54	mov x10,xzr
009ece58	add x11,x8,x10
009ece5c	ldrb w12,[x11]
009ece60	cbnz w12,0x009ecf3c
009ece64	ldrb w12,[x11, #0x1]
009ece68	cbnz w12,0x009ecf3c
009ece6c	ldrb w11,[x11, #0x2]
009ece70	cbnz w11,0x009ecf3c
009ece74	add x10,x10,#0x4
009ece78	cmp w10,w9
009ece7c	b.lt 0x009ece58
009ece80	cmp w9,#0x4
009ece84	b.lt 0x009ecebc
009ece88	ldrb w9,[x8, #0x3]
009ece8c	strb w9,[x8], #0x1
009ece90	ldr w9,[x19]
009ece94	cmp w9,#0x8
009ece98	b.lt 0x009ecebc
009ece9c	orr w9,wzr,#0x7
009ecea0	ldr x10,[x19, #0x8]
009ecea4	ldrb w10,[x10, x9]
009ecea8	add x9,x9,#0x4
009eceac	strb w10,[x8], #0x1
009eceb0	ldrsw x10,[x19]
009eceb4	cmp x9,x10
009eceb8	b.lt 0x009ecea0
009ecebc	strb wzr,[x8]
009ecec0	ldr w8,[x19]
009ecec4	ldr x20,[x19, #0x8]
009ecec8	add w9,w8,#0x3
009ececc	cmp w8,#0x0
009eced0	csel w9,w9,w8,lt
009eced4	asr w0,w9,#0x2
009eced8	str w0,[x19]
009ecedc	cbz x20,0x009ecf50
009ecee0	cmn w8,#0x4
009ecee4	b.gt 0x009ecef0
009ecee8	mov x0,x20
009eceec	bl 0x00c2ff50
009ecef0	cmp w0,#0x1
009ecef4	b.lt 0x009ecf50
009ecef8	mov w23,wzr
009ecefc	mov w22,wzr
009ecf00	add w24,w0,#0x1
009ecf04	ldrb w21,[x20], #0x1
009ecf08	mov w1,#0x800
009ecf0c	mov w0,w21
009ecf10	bl 0x00c377c0
009ecf14	cmp w0,#0x0
009ecf18	sub w24,w24,#0x1
009ecf1c	csinc w22,w22,wzr,ne
009ecf20	tst w21,#0x80
009ecf24	csinc w23,w23,wzr,eq
009ecf28	cmp w24,#0x1
009ecf2c	b.gt 0x009ecf04
009ecf30	cbz w23,0x009ecf44
009ecf34	mov w8,#0x14
009ecf38	b 0x009ecf54
009ecf3c	mov w0,wzr
009ecf40	b 0x009ecf5c
009ecf44	cbz w22,0x009ecf50
009ecf48	mov w8,#0x16
009ecf4c	b 0x009ecf54
009ecf50	mov w8,#0x13
009ecf54	mov w0,#0x1
009ecf58	str w8,[x19, #0x4]
009ecf5c	ldp x29,x30,[sp, #0x30]
009ecf60	ldp x20,x19,[sp, #0x20]
009ecf64	ldp x22,x21,[sp, #0x10]
009ecf68	ldp x24,x23,[sp], #0x40
009ecf6c	ret
