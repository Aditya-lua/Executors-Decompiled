; FUN_0091afe4 @ 0091afe4
0091afe4	sub sp,sp,#0xf0
0091afe8	str x23,[sp, #0xb0]
0091afec	stp x22,x21,[sp, #0xc0]
0091aff0	stp x20,x19,[sp, #0xd0]
0091aff4	stp x29,x30,[sp, #0xe0]
0091aff8	add x29,sp,#0xe0
0091affc	mrs x23,tpidr_el0
0091b000	ldr x8,[x23, #0x28]
0091b004	mov x21,x0
0091b008	mov x19,x1
0091b00c	stur x8,[x29, #-0x38]
0091b010	ldrb w8,[x0, #0x528]
0091b014	cbz w8,0x0091b040
0091b018	ldr x0,[x21, #0x520]
0091b01c	add x1,sp,#0x20
0091b020	bl 0x00931434
0091b024	mov w22,w0
0091b028	cbz w0,0x0091b048
0091b02c	adrp x1,0x2d7000
0091b030	add x1,x1,#0x1ab
0091b034	mov x0,x21
0091b038	bl 0x00904b80
0091b03c	b 0x0091b108
0091b040	mov w22,wzr
0091b044	b 0x0091b108
0091b048	ldrb w8,[x21, #0x528]
0091b04c	sub w8,w8,#0x1
0091b050	cmp w8,#0x2
0091b054	b.hi 0x0091b104
0091b058	adrp x9,0xc4f000
0091b05c	sbfiz x8,x8,#0x3,#0x8
0091b060	add x9,x9,#0x510
0091b064	adrp x10,0x746000
0091b068	add x10,x10,#0xaa0
0091b06c	ldr x20,[x9, x8#0x0]
0091b070	ldr x2,[x10, x8#0x0]
0091b074	mov x0,x21
0091b078	mov x1,x20
0091b07c	bl 0x00941e8c
0091b080	mov w22,wzr
0091b084	cbnz x0,0x0091b108
0091b088	ldp w13,w8,[sp, #0x34]
0091b08c	adrp x10,0xc4f000
0091b090	add x10,x10,#0x930
0091b094	ldp w5,w11,[sp, #0x2c]
0091b098	adrp x12,0xc4f000
0091b09c	add x12,x12,#0x968
0091b0a0	sxtw x8,w8
0091b0a4	orr w9,wzr,#0x6
0091b0a8	cmp w8,#0x0
0091b0ac	sub x8,x8,#0x1
0091b0b0	sxtw x11,w11
0091b0b4	csel x8,x9,x8,eq
0091b0b8	ldr x6,[x12, x11, LSL #0x3]
0091b0bc	ldp w9,w11,[sp, #0x24]
0091b0c0	ldr x4,[x10, x8, LSL #0x3]
0091b0c4	ldr w8,[sp, #0x20]
0091b0c8	adrp x2,0x2c6000
0091b0cc	add w7,w13,#0x76c
0091b0d0	add x2,x2,#0xd85
0091b0d4	add x0,sp,#0x58
0091b0d8	mov w1,#0x50
0091b0dc	mov x3,x20
0091b0e0	str w8,[sp, #0x10]
0091b0e4	str w9,[sp, #0x8]
0091b0e8	str w11,[sp]
0091b0ec	bl 0x00c31b70
0091b0f0	add x1,sp,#0x58
0091b0f4	mov x0,x19
0091b0f8	bl 0x00904728
0091b0fc	mov w22,w0
0091b100	b 0x0091b108
0091b104	mov w22,#0x2b
0091b108	ldr x8,[x23, #0x28]
0091b10c	ldur x9,[x29, #-0x38]
0091b110	cmp x8,x9
0091b114	b.ne 0x0091b134
0091b118	mov w0,w22
0091b11c	ldp x29,x30,[sp, #0xe0]
0091b120	ldp x20,x19,[sp, #0xd0]
0091b124	ldp x22,x21,[sp, #0xc0]
0091b128	ldr x23,[sp, #0xb0]
0091b12c	add sp,sp,#0xf0
0091b130	ret
0091b134	bl 0x00c2fec0
