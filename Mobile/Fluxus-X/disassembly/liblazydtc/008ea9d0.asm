; cpr::CaseInsensitiveCompare::operator() @ 008ea9d0
008ea9d0	stp x24,x23,[sp, #-0x40]!
008ea9d4	stp x22,x21,[sp, #0x10]
008ea9d8	stp x20,x19,[sp, #0x20]
008ea9dc	stp x29,x30,[sp, #0x30]
008ea9e0	add x29,sp,#0x30
008ea9e4	ldrb w8,[x1]
008ea9e8	ldp x10,x9,[x1, #0x8]
008ea9ec	ldrb w11,[x2]
008ea9f0	tst w8,#0x1
008ea9f4	csinc x21,x9,x1,ne
008ea9f8	ldp x9,x12,[x2, #0x8]
008ea9fc	lsr w8,w8,#0x1
008eaa00	csel x22,x8,x10,eq
008eaa04	lsr w8,w11,#0x1
008eaa08	tst w11,#0x1
008eaa0c	csel x23,x8,x9,eq
008eaa10	csinc x24,x12,x2,ne
008eaa14	cbz x23,0x008eaa58
008eaa18	cbz x22,0x008eaa60
008eaa1c	ldrb w0,[x21]
008eaa20	ldrb w20,[x24]
008eaa24	bl 0x00c30f10
008eaa28	mov w19,w0
008eaa2c	mov w0,w20
008eaa30	bl 0x00c30f10
008eaa34	cmp w19,w0
008eaa38	b.lt 0x008eaa60
008eaa3c	cmp w0,w19
008eaa40	b.lt 0x008eaa58
008eaa44	add x21,x21,#0x1
008eaa48	add x24,x24,#0x1
008eaa4c	subs x23,x23,#0x1
008eaa50	sub x22,x22,#0x1
008eaa54	b.ne 0x008eaa18
008eaa58	mov w0,wzr
008eaa5c	b 0x008eaa64
008eaa60	mov w0,#0x1
008eaa64	ldp x29,x30,[sp, #0x30]
008eaa68	ldp x20,x19,[sp, #0x20]
008eaa6c	ldp x22,x21,[sp, #0x10]
008eaa70	ldp x24,x23,[sp], #0x40
008eaa74	ret
