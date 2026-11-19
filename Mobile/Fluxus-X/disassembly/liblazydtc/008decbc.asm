; FUN_008decbc @ 008decbc
008decbc	sub sp,sp,#0xc0
008decc0	stp x29,x30,[sp, #0x60]
008decc4	stp x28,x27,[sp, #0x70]
008decc8	stp x26,x25,[sp, #0x80]
008deccc	stp x24,x23,[sp, #0x90]
008decd0	stp x22,x21,[sp, #0xa0]
008decd4	stp x20,x19,[sp, #0xb0]
008decd8	add x29,sp,#0x60
008decdc	mrs x8,tpidr_el0
008dece0	lsr x9,x1,#0x8
008dece4	mov x19,x0
008dece8	str x8,[sp, #0x8]
008decec	mov x21,xzr
008decf0	mov x20,xzr
008decf4	ldr x8,[x8, #0x28]
008decf8	stur x8,[x29, #-0x8]
008decfc	lsr x8,x1,#0x10
008ded00	sturb w9,[x29, #-0x17]
008ded04	lsr x9,x1,#0x18
008ded08	ldr q0,[x0]
008ded0c	sturb w8,[x29, #-0x16]
008ded10	lsr x8,x1,#0x20
008ded14	sturb w9,[x29, #-0x15]
008ded18	lsr x9,x1,#0x28
008ded1c	sturb w8,[x29, #-0x14]
008ded20	lsr x8,x1,#0x30
008ded24	sturb w9,[x29, #-0x13]
008ded28	lsr x9,x1,#0x38
008ded2c	sturb w8,[x29, #-0x12]
008ded30	lsr x8,x2,#0x8
008ded34	sturb w9,[x29, #-0x11]
008ded38	lsr x9,x2,#0x10
008ded3c	sturb w8,[x29, #-0xf]
008ded40	lsr x8,x2,#0x18
008ded44	sturb w9,[x29, #-0xe]
008ded48	lsr x9,x2,#0x20
008ded4c	sturb w8,[x29, #-0xd]
008ded50	lsr x8,x2,#0x28
008ded54	sturb w9,[x29, #-0xc]
008ded58	lsr x9,x2,#0x30
008ded5c	sturb w8,[x29, #-0xb]
008ded60	lsr x8,x2,#0x38
008ded64	sturb w1,[x29, #-0x18]
008ded68	sturb w8,[x29, #-0x9]
008ded6c	mov x8,#-0x800
008ded70	sturb w2,[x29, #-0x10]
008ded74	sturb w9,[x29, #-0xa]
008ded78	str x8,[sp, #0x20]
008ded7c	str q0,[sp, #0x30]
008ded80	b 0x008deda8
008ded84	ldr x20,[sp, #0x10]
008ded88	mov w8,#0x7800
008ded8c	add x21,x21,x8
008ded90	ldr x8,[sp, #0x20]
008ded94	add x20,x20,#0x1
008ded98	cmp x20,#0x10
008ded9c	add x8,x8,#0x800
008deda0	str x8,[sp, #0x20]
008deda4	b.eq 0x008defcc
008deda8	sub x8,x29,#0x18
008dedac	ldrb w26,[x8, x20]
008dedb0	cbz x26,0x008dede8
008dedb4	mov x8,x26
008dedb8	ldr x9,[x19, #0x10]
008dedbc	ldr x10,[x19, #0x28]
008dedc0	bfm x8,x20,#0x38,#0x17
008dedc4	lsl x8,x8,#0x4
008dedc8	add x9,x9,x8
008dedcc	add x8,x10,x8
008dedd0	ldp x0,x1,[x9]
008dedd4	ldp x2,x3,[x8]
008dedd8	bl 0x008dd964
008deddc	mov x3,x0
008dede0	mov x2,x1
008dede4	b 0x008dedf0
008dede8	mov x3,xzr
008dedec	mov x2,xzr
008dedf0	add x0,sp,#0x30
008dedf4	mov x1,x3
008dedf8	bl 0x008dd950
008dedfc	str x20,[sp, #0x10]
008dee00	cbz x20,0x008ded84
008dee04	ldr x8,[sp, #0x20]
008dee08	sxtb w9,w26
008dee0c	mov w27,wzr
008dee10	mov x28,xzr
008dee14	mov x20,xzr
008dee18	mov w25,#0x2
008dee1c	mov w8,w8
008dee20	str w9,[sp, #0x2c]
008dee24	add x24,x8,#0x100
008dee28	add x8,x8,#0x500
008dee2c	str x8,[sp, #0x18]
008dee30	b 0x008dee54
008dee34	mov w8,#0x7800
008dee38	add w27,w27,w25
008dee3c	add x28,x28,#0x1
008dee40	add x20,x20,x8
008dee44	add w8,w25,#0x2
008dee48	cmp x21,x20
008dee4c	mov w25,w8
008dee50	b.eq 0x008ded84
008dee54	sub x8,x29,#0x18
008dee58	ldrb w23,[x8, x28]
008dee5c	cbz x23,0x008dee34
008dee60	lsr w8,w27,#0x1
008dee64	neg w22,w8, LSL #0xb
008dee68	ldr w8,[sp, #0x2c]
008dee6c	tbnz w8,#0x1f,0x008dee90
008dee70	tbnz w26,#0x6,0x008deeb8
008dee74	tbnz w26,#0x5,0x008deedc
008dee78	tbnz w26,#0x4,0x008def04
008dee7c	tbnz w26,#0x3,0x008def2c
008dee80	tbnz w26,#0x2,0x008def54
008dee84	tbnz w26,#0x1,0x008def7c
008dee88	tbz w26,#0x0,0x008dee34
008dee8c	b 0x008defa4
008dee90	ldr x8,[sp, #0x20]
008dee94	ldr x9,[x19, #0x40]
008dee98	add x0,sp,#0x30
008dee9c	add x8,x8,x20
008deea0	add x8,x8,x23
008deea4	add x8,x8,x22
008deea8	add x8,x9,w8, SXTW  #0x4
008deeac	ldp x1,x2,[x8]
008deeb0	bl 0x008dd950
008deeb4	tbz w26,#0x6,0x008dee74
008deeb8	add w8,w24,w20
008deebc	ldr x9,[x19, #0x40]
008deec0	add x0,sp,#0x30
008deec4	add w8,w8,w23
008deec8	add w8,w8,w22
008deecc	add x8,x9,w8, SXTW  #0x4
008deed0	ldp x1,x2,[x8]
008deed4	bl 0x008dd950
008deed8	tbz w26,#0x5,0x008dee78
008deedc	add w8,w24,w20
008deee0	ldr x9,[x19, #0x40]
008deee4	add x0,sp,#0x30
008deee8	add w8,w8,w23
008deeec	add w8,w8,w22
008deef0	add w8,w8,#0x100
008deef4	add x8,x9,w8, SXTW  #0x4
008deef8	ldp x1,x2,[x8]
008deefc	bl 0x008dd950
008def00	tbz w26,#0x4,0x008dee7c
008def04	add w8,w24,w20
008def08	ldr x9,[x19, #0x40]
008def0c	add x0,sp,#0x30
008def10	add w8,w8,w23
008def14	add w8,w8,w22
008def18	add w8,w8,#0x200
008def1c	add x8,x9,w8, SXTW  #0x4
008def20	ldp x1,x2,[x8]
008def24	bl 0x008dd950
008def28	tbz w26,#0x3,0x008dee80
008def2c	add w8,w24,w20
008def30	ldr x9,[x19, #0x40]
008def34	add x0,sp,#0x30
008def38	add w8,w8,w23
008def3c	add w8,w8,w22
008def40	add w8,w8,#0x300
008def44	add x8,x9,w8, SXTW  #0x4
008def48	ldp x1,x2,[x8]
008def4c	bl 0x008dd950
008def50	tbz w26,#0x2,0x008dee84
008def54	ldr x8,[sp, #0x18]
008def58	ldr x9,[x19, #0x40]
008def5c	add x0,sp,#0x30
008def60	add w8,w8,w20
008def64	add w8,w8,w23
008def68	add w8,w8,w22
008def6c	add x8,x9,w8, SXTW  #0x4
008def70	ldp x1,x2,[x8]
008def74	bl 0x008dd950
008def78	tbz w26,#0x1,0x008dee88
008def7c	add w8,w24,w20
008def80	ldr x9,[x19, #0x40]
008def84	add x0,sp,#0x30
008def88	add w8,w8,w23
008def8c	add w8,w8,w22
008def90	add w8,w8,#0x500
008def94	add x8,x9,w8, SXTW  #0x4
008def98	ldp x1,x2,[x8]
008def9c	bl 0x008dd950
008defa0	tbz w26,#0x0,0x008dee34
008defa4	add w8,w24,w20
008defa8	ldr x9,[x19, #0x40]
008defac	add x0,sp,#0x30
008defb0	add w8,w8,w23
008defb4	add w8,w8,w22
008defb8	add w8,w8,#0x600
008defbc	add x8,x9,w8, SXTW  #0x4
008defc0	ldp x1,x2,[x8]
008defc4	bl 0x008dd950
008defc8	b 0x008dee34
008defcc	ldr x8,[sp, #0x8]
008defd0	ldp x0,x1,[sp, #0x30]
008defd4	ldr x8,[x8, #0x28]
008defd8	ldur x9,[x29, #-0x8]
008defdc	cmp x8,x9
008defe0	b.ne 0x008df004
008defe4	ldp x20,x19,[sp, #0xb0]
008defe8	ldp x22,x21,[sp, #0xa0]
008defec	ldp x24,x23,[sp, #0x90]
008deff0	ldp x26,x25,[sp, #0x80]
008deff4	ldp x28,x27,[sp, #0x70]
008deff8	ldp x29,x30,[sp, #0x60]
008deffc	add sp,sp,#0xc0
008df000	ret
008df004	bl 0x00c2fec0
