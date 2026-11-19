; dtls1_get_record @ 009cf908
009cf908	sub sp,sp,#0x70
009cf90c	stp x28,x27,[sp, #0x10]
009cf910	stp x26,x25,[sp, #0x20]
009cf914	stp x24,x23,[sp, #0x30]
009cf918	stp x22,x21,[sp, #0x40]
009cf91c	stp x20,x19,[sp, #0x50]
009cf920	stp x29,x30,[sp, #0x60]
009cf924	add x29,sp,#0x60
009cf928	mov x19,x0
009cf92c	bl 0x00c36b50
009cf930	cbz w0,0x009cfb94
009cf934	mov w8,#0x12a8
009cf938	mov w9,#0x1cfa
009cf93c	mov w10,#0x12f0
009cf940	mov w23,#0x1
009cf944	mov w24,#0xf1
009cf948	mov w25,#0x4541
009cf94c	mov w26,#0x200
009cf950	add x20,x19,x8
009cf954	add x27,x19,x9
009cf958	add x21,x19,x10
009cf95c	orr w28,wzr,#0xf0
009cf960	ldr x8,[x19, #0x1d10]
009cf964	mov x0,x19
009cf968	add x1,x8,#0x38
009cf96c	bl 0x00c36b90
009cf970	cbnz w0,0x009cfb9c
009cf974	ldr w8,[x19, #0xc64]
009cf978	cmp w8,#0xf1
009cf97c	b.ne 0x009cf98c
009cf980	ldr x8,[x19, #0x1cb0]
009cf984	cmp x8,#0xd
009cf988	b.cs 0x009cfa58
009cf98c	ldr x2,[x19, #0xc88]
009cf990	mov w1,#0xd
009cf994	mov w4,#0x1
009cf998	add x5,sp,#0x8
009cf99c	mov x0,x19
009cf9a0	mov w3,wzr
009cf9a4	bl 0x00c36cc0
009cf9a8	cmp w0,#0x1
009cf9ac	b.lt 0x009cfba0
009cf9b0	ldr x8,[x19, #0x1cb0]
009cf9b4	cmp x8,#0xd
009cf9b8	b.ne 0x009cfb84
009cf9bc	ldr x8,[x19, #0x4c0]
009cf9c0	ldr x22,[x19, #0x1ca8]
009cf9c4	str w24,[x19, #0xc64]
009cf9c8	cbz x8,0x009cf9ec
009cf9cc	ldr x6,[x19, #0x4c8]
009cf9d0	mov w2,#0x100
009cf9d4	mov w4,#0xd
009cf9d8	mov w0,wzr
009cf9dc	mov w1,wzr
009cf9e0	mov x3,x22
009cf9e4	mov x5,x19
009cf9e8	blr x8
009cf9ec	ldrb w9,[x22]
009cf9f0	str w9,[x19, #0x12ac]
009cf9f4	ldrb w10,[x22, #0x3]
009cf9f8	ldrb w11,[x22, #0x4]
009cf9fc	ldrb w12,[x22, #0x1]
009cfa00	ldrb w8,[x22, #0x2]
009cfa04	cmp w9,#0x15
009cfa08	bfm x11,x10,#0x38,#0x7
009cfa0c	str x11,[x19, #0x12e8]
009cfa10	ldurh w10,[x22, #0x9]
009cfa14	lsl w9,w12,#0x8
009cfa18	strh w10,[x27, #0x4]
009cfa1c	ldur w10,[x22, #0x5]
009cfa20	str w10,[x27]
009cfa24	ldrb w10,[x22, #0xb]
009cfa28	ldrb w22,[x22, #0xc]
009cfa2c	str wzr,[x19, #0x12e0]
009cfa30	bfm x22,x10,#0x38,#0x7
009cfa34	str x22,[x19, #0x12b0]
009cfa38	b.eq 0x009cfb0c
009cfa3c	ldr w10,[x19, #0xa08]
009cfa40	cbnz w10,0x009cfb0c
009cfa44	ldr w10,[x19]
009cfa48	orr w8,w9,w8
009cfa4c	cmp w10,w8
009cfa50	b.eq 0x009cfb10
009cfa54	b 0x009cfb7c
009cfa58	ldr x22,[x19, #0x12b0]
009cfa5c	ldr x8,[x19, #0x1cb0]
009cfa60	sub x8,x8,#0xd
009cfa64	cmp x22,x8
009cfa68	b.ls 0x009cfa9c
009cfa6c	mov w3,#0x1
009cfa70	mov w4,#0x1
009cfa74	add x5,sp,#0x8
009cfa78	mov x0,x19
009cfa7c	mov x1,x22
009cfa80	mov x2,x22
009cfa84	bl 0x00c36cc0
009cfa88	cmp w0,#0x1
009cfa8c	b.lt 0x009cfb70
009cfa90	ldr x8,[sp, #0x8]
009cfa94	cmp x8,x22
009cfa98	b.ne 0x009cfb70
009cfa9c	add x2,sp,#0x4
009cfaa0	mov x0,x19
009cfaa4	mov x1,x20
009cfaa8	str w28,[x19, #0xc64]
009cfaac	bl 0x00c36b20
009cfab0	cbz x0,0x009cfb50
009cfab4	mov x22,x0
009cfab8	mov x0,x19
009cfabc	mov x1,x22
009cfac0	bl 0x00c36ae0
009cfac4	cbz w0,0x009cfb7c
009cfac8	ldr x8,[x19, #0x12b0]
009cfacc	cbz x8,0x009cfb58
009cfad0	ldr w8,[sp, #0x4]
009cfad4	cbz w8,0x009cfb60
009cfad8	mov x0,x19
009cfadc	bl 0x00c344e0
009cfae0	cbnz w0,0x009cfaf0
009cfae4	mov x0,x19
009cfae8	bl 0x00c34510
009cfaec	cbz w0,0x009cfb7c
009cfaf0	ldr x8,[x19, #0x1d10]
009cfaf4	mov x0,x19
009cfaf8	mov x2,x21
009cfafc	add x1,x8,#0x28
009cfb00	bl 0x00c36b10
009cfb04	tbz w0,#0x1f,0x009cfb7c
009cfb08	b 0x009cfb94
009cfb0c	ldr w8,[x19]
009cfb10	and w8,w8,#0xff00
009cfb14	cmp w8,w9
009cfb18	b.ne 0x009cfb7c
009cfb1c	cmp x22,x25
009cfb20	b.cs 0x009cfb7c
009cfb24	ldr x8,[x19, #0x918]
009cfb28	cbz x8,0x009cfa5c
009cfb2c	ldrb w8,[x8, #0x368]
009cfb30	sub w8,w8,#0x1
009cfb34	cmp w8,#0x3
009cfb38	b.hi 0x009cfa5c
009cfb3c	lsl w8,w26,w8
009cfb40	add w8,w8,#0x140
009cfb44	cmp x22,x8
009cfb48	b.ls 0x009cfa5c
009cfb4c	b 0x009cfb7c
009cfb50	str xzr,[x19, #0x12b0]
009cfb54	b 0x009cfb84
009cfb58	str w23,[x19, #0x12e0]
009cfb5c	b 0x009cfb88
009cfb60	mov x0,x19
009cfb64	mov x1,x22
009cfb68	bl 0x009cf51c
009cfb6c	cbnz w0,0x009cfb9c
009cfb70	mov x0,x19
009cfb74	bl 0x00c35ce0
009cfb78	cbnz w0,0x009cfb94
009cfb7c	str xzr,[x19, #0x12b0]
009cfb80	str w23,[x19, #0x12e0]
009cfb84	str xzr,[x19, #0x1cb0]
009cfb88	mov x0,x19
009cfb8c	bl 0x00c36b50
009cfb90	cbnz w0,0x009cf960
009cfb94	mov w0,#0xffffffff
009cfb98	b 0x009cfba0
009cfb9c	mov w0,#0x1
009cfba0	ldp x29,x30,[sp, #0x60]
009cfba4	ldp x20,x19,[sp, #0x50]
009cfba8	ldp x22,x21,[sp, #0x40]
009cfbac	ldp x24,x23,[sp, #0x30]
009cfbb0	ldp x26,x25,[sp, #0x20]
009cfbb4	ldp x28,x27,[sp, #0x10]
009cfbb8	add sp,sp,#0x70
009cfbbc	ret
