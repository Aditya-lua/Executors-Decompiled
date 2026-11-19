; FUN_009fa008 @ 009fa008
009fa008	stp x24,x23,[sp, #-0x40]!
009fa00c	stp x22,x21,[sp, #0x10]
009fa010	stp x20,x19,[sp, #0x20]
009fa014	stp x29,x30,[sp, #0x30]
009fa018	ldr x23,[x0, #0x40]
009fa01c	mov x19,x1
009fa020	orr w1,wzr,#0xf
009fa024	add x29,sp,#0x30
009fa028	mov x21,x0
009fa02c	sub w24,w2,#0x1
009fa030	bl 0x00c32190
009fa034	ldr w22,[x23, #0x10]
009fa038	mov w20,wzr
009fa03c	cmp w22,#0x1
009fa040	b.lt 0x009fa054
009fa044	b 0x009fa074
009fa048	stp w22,wzr,[x23, #0x10]
009fa04c	cmp w22,#0x1
009fa050	b.ge 0x009fa074
009fa054	ldr x0,[x21, #0x48]
009fa058	ldr x1,[x23, #0x8]
009fa05c	ldr w2,[x23]
009fa060	bl 0x00c34220
009fa064	mov w22,w0
009fa068	cmp w0,#0x0
009fa06c	b.gt 0x009fa048
009fa070	b 0x009fa110
009fa074	cmp w24,#0x1
009fa078	b.lt 0x009fa0c8
009fa07c	ldr x9,[x23, #0x8]
009fa080	ldrsw x10,[x23, #0x14]
009fa084	mov x8,xzr
009fa088	add x9,x9,x10
009fa08c	sxtw x10,w24
009fa090	ldrb w11,[x9, x8]
009fa094	strb w11,[x19, x8]
009fa098	ldrb w11,[x9, x8]
009fa09c	cmp w11,#0xa
009fa0a0	b.eq 0x009fa0d4
009fa0a4	ldr w22,[x23, #0x10]
009fa0a8	add x8,x8,#0x1
009fa0ac	cmp x8,x10
009fa0b0	b.ge 0x009fa0c0
009fa0b4	sxtw x11,w22
009fa0b8	cmp x8,x11
009fa0bc	b.lt 0x009fa090
009fa0c0	add x19,x19,x8
009fa0c4	b 0x009fa0cc
009fa0c8	mov x8,xzr
009fa0cc	mov w9,wzr
009fa0d0	b 0x009fa0e8
009fa0d4	ldr w22,[x23, #0x10]
009fa0d8	add x9,x19,x8
009fa0dc	add w8,w8,#0x1
009fa0e0	add x19,x9,#0x1
009fa0e4	mov w9,#0x1
009fa0e8	ldr w10,[x23, #0x14]
009fa0ec	add w20,w8,w20
009fa0f0	sub w22,w22,w8
009fa0f4	add w10,w10,w8
009fa0f8	stp w22,w10,[x23, #0x10]
009fa0fc	tbnz w9,#0x0,0x009fa108
009fa100	sub w24,w24,w8
009fa104	cbnz w24,0x009fa04c
009fa108	strb wzr,[x19]
009fa10c	b 0x009fa128
009fa110	mov x0,x21
009fa114	bl 0x00c38460
009fa118	strb wzr,[x19]
009fa11c	tbz w22,#0x1f,0x009fa128
009fa120	cmp w20,#0x0
009fa124	csel w20,w20,w22,gt
009fa128	mov w0,w20
009fa12c	ldp x29,x30,[sp, #0x30]
009fa130	ldp x20,x19,[sp, #0x20]
009fa134	ldp x22,x21,[sp, #0x10]
009fa138	ldp x24,x23,[sp], #0x40
009fa13c	ret
