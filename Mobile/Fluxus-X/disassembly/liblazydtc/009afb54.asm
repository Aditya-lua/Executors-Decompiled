; FUN_009afb54 @ 009afb54
009afb54	stp x24,x23,[sp, #-0x30]!
009afb58	ldp x9,x8,[sp, #0x38]
009afb5c	cmp w7,#0x3
009afb60	stp x22,x21,[sp, #0x10]
009afb64	stp x20,x19,[sp, #0x20]
009afb68	b.eq 0x009afb74
009afb6c	cmp w7,#0x6
009afb70	b.ne 0x009afe14
009afb74	ldr x10,[x9]
009afb78	ldr x12,[x8]
009afb7c	mov w11,#0x1
009afb80	mov x13,x10
009afb84	mov x14,x12
009afb88	cbz x14,0x009afe2c
009afb8c	cbz x10,0x009afe2c
009afb90	ldr w15,[sp, #0x30]
009afb94	adrp x19,0x74b000
009afb98	and w16,w6,#0x1f
009afb9c	and w17,w6,#0x20
009afba0	mov w18,#0x10
009afba4	orr w6,wzr,#0x18
009afba8	sub w7,w7,#0x1
009afbac	add x19,x19,#0x528
009afbb0	mov w20,#0x1
009afbb4	b 0x009afbc8
009afbb8	mov x13,x23
009afbbc	cmp x14,x12
009afbc0	b.ne 0x009afcf4
009afbc4	b 0x009afcf0
009afbc8	cmp w11,#0x0
009afbcc	csel x21,x6,x18,ne
009afbd0	ldr x21,[x14, x21#0x0]
009afbd4	ldr x22,[x14]
009afbd8	tbnz w15,#0x1f,0x009afc50
009afbdc	ldr w22,[x22, #0x44]
009afbe0	cmp w22,w15
009afbe4	b.ne 0x009afe00
009afbe8	cmp w7,#0x5
009afbec	b.hi 0x009afe00
009afbf0	ldrsw x22,[x19, x7, LSL #0x2]
009afbf4	add x23,x22,x19
009afbf8	add x22,x14,#0x10
009afbfc	br x23
009afc00	ldr w23,[x14, #0x8]
009afc04	cbnz w23,0x009afe00
009afc08	cmp x14,x12
009afc0c	b.eq 0x009afc44
009afc10	cmp x14,x13
009afc14	b.ne 0x009afc1c
009afc18	ldr x13,[x22]
009afc1c	ldr x23,[x14, #0x18]
009afc20	cbz x23,0x009afc2c
009afc24	ldr x24,[x22]
009afc28	str x24,[x23, #0x10]
009afc2c	ldr x22,[x22]
009afc30	cbz x22,0x009afc38
009afc34	str x23,[x22, #0x18]
009afc38	str x14,[x12, #0x10]
009afc3c	stp xzr,x12,[x14, #0x10]
009afc40	mov x12,x14
009afc44	str w20,[x14, #0x8]
009afc48	cbnz x21,0x009afe04
009afc4c	b 0x009afe2c
009afc50	cbz w0,0x009afc60
009afc54	ldr w23,[x22, #0x18]
009afc58	cmp w23,w0
009afc5c	b.ne 0x009afe00
009afc60	cbz w1,0x009afc70
009afc64	ldr w23,[x22, #0x1c]
009afc68	tst w23,w1
009afc6c	b.eq 0x009afe00
009afc70	cbz w2,0x009afc80
009afc74	ldr w23,[x22, #0x20]
009afc78	tst w23,w2
009afc7c	b.eq 0x009afe00
009afc80	cbz w3,0x009afc90
009afc84	ldr w23,[x22, #0x24]
009afc88	tst w23,w3
009afc8c	b.eq 0x009afe00
009afc90	cbz w4,0x009afca0
009afc94	ldr w23,[x22, #0x28]
009afc98	tst w23,w4
009afc9c	b.eq 0x009afe00
009afca0	cbz w5,0x009afcb0
009afca4	ldr w23,[x22, #0x2c]
009afca8	cmp w23,w5
009afcac	b.ne 0x009afe00
009afcb0	cbz w16,0x009afcc0
009afcb4	ldr w23,[x22, #0x3c]
009afcb8	tst w23,w16
009afcbc	b.eq 0x009afe00
009afcc0	cbz w17,0x009afbe8
009afcc4	ldr w22,[x22, #0x3c]
009afcc8	tst w22,w17
009afccc	b.ne 0x009afbe8
009afcd0	b 0x009afe00
009afcd4	ldr x23,[x14, #0x10]
009afcd8	cmp x14,x13
009afcdc	b.eq 0x009afbb8
009afce0	ldr x24,[x14, #0x18]
009afce4	str x23,[x24, #0x10]
009afce8	cmp x14,x12
009afcec	b.ne 0x009afcf4
009afcf0	ldr x12,[x14, #0x18]
009afcf4	ldr x23,[x14, #0x10]
009afcf8	str wzr,[x14, #0x8]
009afcfc	cbz x23,0x009afd08
009afd00	ldr x24,[x14, #0x18]
009afd04	str x24,[x23, #0x18]
009afd08	ldr x24,[x14, #0x18]
009afd0c	cbz x24,0x009afd14
009afd10	str x23,[x24, #0x10]
009afd14	stp xzr,xzr,[x22]
009afd18	cbnz x21,0x009afe04
009afd1c	b 0x009afe2c
009afd20	ldr w23,[x14, #0x8]
009afd24	cbz w23,0x009afe00
009afd28	cmp x14,x13
009afd2c	b.eq 0x009afd64
009afd30	cmp x14,x12
009afd34	b.ne 0x009afd3c
009afd38	ldr x12,[x14, #0x18]
009afd3c	ldr x22,[x22]
009afd40	cbz x22,0x009afd4c
009afd44	ldr x23,[x14, #0x18]
009afd48	str x23,[x22, #0x18]
009afd4c	ldr x23,[x14, #0x18]
009afd50	cbz x23,0x009afd58
009afd54	str x22,[x23, #0x10]
009afd58	str x14,[x13, #0x18]
009afd5c	stp x13,xzr,[x14, #0x10]
009afd60	mov x13,x14
009afd64	str wzr,[x14, #0x8]
009afd68	cbnz x21,0x009afe04
009afd6c	b 0x009afe2c
009afd70	ldr w23,[x14, #0x8]
009afd74	cbz w23,0x009afe00
009afd78	cmp x14,x12
009afd7c	b.eq 0x009afe00
009afd80	cmp x14,x13
009afd84	b.ne 0x009afd8c
009afd88	ldr x13,[x22]
009afd8c	ldr x23,[x14, #0x18]
009afd90	cbz x23,0x009afd9c
009afd94	ldr x24,[x22]
009afd98	str x24,[x23, #0x10]
009afd9c	ldr x22,[x22]
009afda0	cbz x22,0x009afda8
009afda4	str x23,[x22, #0x18]
009afda8	str x14,[x12, #0x10]
009afdac	stp xzr,x12,[x14, #0x10]
009afdb0	mov x12,x14
009afdb4	cbnz x21,0x009afe04
009afdb8	b 0x009afe2c
009afdbc	ldr w23,[x14, #0x8]
009afdc0	cbz w23,0x009afe00
009afdc4	cmp x14,x13
009afdc8	b.eq 0x009afe00
009afdcc	cmp x14,x12
009afdd0	b.ne 0x009afdd8
009afdd4	ldr x12,[x14, #0x18]
009afdd8	ldr x22,[x22]
009afddc	cbz x22,0x009afde8
009afde0	ldr x23,[x14, #0x18]
009afde4	str x23,[x22, #0x18]
009afde8	ldr x23,[x14, #0x18]
009afdec	cbz x23,0x009afdf4
009afdf0	str x22,[x23, #0x10]
009afdf4	str x14,[x13, #0x18]
009afdf8	stp x13,xzr,[x14, #0x10]
009afdfc	mov x13,x14
009afe00	cbz x21,0x009afe2c
009afe04	cmp x14,x10
009afe08	mov x14,x21
009afe0c	b.ne 0x009afbc8
009afe10	b 0x009afe2c
009afe14	ldr x13,[x9]
009afe18	ldr x10,[x8]
009afe1c	mov w11,wzr
009afe20	mov x14,x13
009afe24	mov x12,x10
009afe28	cbnz x14,0x009afb8c
009afe2c	str x13,[x9]
009afe30	str x12,[x8]
009afe34	ldp x20,x19,[sp, #0x20]
009afe38	ldp x22,x21,[sp, #0x10]
009afe3c	ldp x24,x23,[sp], #0x30
009afe40	ret
