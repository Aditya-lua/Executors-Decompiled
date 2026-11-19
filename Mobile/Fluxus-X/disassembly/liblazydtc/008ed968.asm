; cpr::Session::SetResolves @ 008ed968
008ed968	sub sp,sp,#0x110
008ed96c	stp x28,x27,[sp, #0xb0]
008ed970	stp x26,x25,[sp, #0xc0]
008ed974	stp x24,x23,[sp, #0xd0]
008ed978	stp x22,x21,[sp, #0xe0]
008ed97c	stp x20,x19,[sp, #0xf0]
008ed980	stp x29,x30,[sp, #0x100]
008ed984	add x29,sp,#0x100
008ed988	mrs x22,tpidr_el0
008ed98c	ldr x8,[x22, #0x28]
008ed990	mov x19,x0
008ed994	mov x21,x1
008ed998	stur x8,[x29, #-0x60]
008ed99c	ldr x8,[x0, #0x18]
008ed9a0	ldr x0,[x8, #0x10]
008ed9a4	bl 0x00c31040
008ed9a8	ldr x8,[x19, #0x18]
008ed9ac	str xzr,[x8, #0x10]
008ed9b0	ldp x20,x9,[x21]
008ed9b4	cmp x20,x9
008ed9b8	str x9,[sp, #0x8]
008ed9bc	b.eq 0x008edbc8
008ed9c0	add x8,sp,#0x10
008ed9c4	add x9,sp,#0x80
008ed9c8	adrp x21,0x2bc000
008ed9cc	orr x26,x8,#0x1
008ed9d0	orr x27,x9,#0x1
008ed9d4	add x21,x21,#0xda4
008ed9d8	str x22,[sp]
008ed9dc	ldr x25,[x20, #0x30]
008ed9e0	add x28,x20,#0x38
008ed9e4	cmp x25,x28
008ed9e8	b.eq 0x008edba8
008ed9ec	add x24,x20,#0x19
008ed9f0	ldr x8,[x19, #0x18]
008ed9f4	ldrh w23,[x25, #0x1a]
008ed9f8	mov x0,x20
008ed9fc	mov x1,x21
008eda00	ldr x22,[x8, #0x10]
008eda04	add x8,sp,#0x28
008eda08	bl 0x00c30fa0
008eda0c	add x8,sp,#0x10
008eda10	mov w0,w23
008eda14	bl 0x00c305a0
008eda18	ldrb w8,[sp, #0x10]
008eda1c	ldp x10,x9,[sp, #0x18]
008eda20	tst w8,#0x1
008eda24	lsr w11,w8,#0x1
008eda28	csel x1,x26,x9,eq
008eda2c	csel x2,x11,x10,eq
008eda30	add x0,sp,#0x28
008eda34	bl 0x00c308c0
008eda38	ldr x8,[x0, #0x10]
008eda3c	str x8,[sp, #0x50]
008eda40	ldr q0,[x0]
008eda44	str q0,[sp, #0x40]
008eda48	stp xzr,xzr,[x0]
008eda4c	str xzr,[x0, #0x10]
008eda50	add x0,sp,#0x40
008eda54	mov w2,#0x1
008eda58	mov x1,x21
008eda5c	bl 0x00c308c0
008eda60	ldr x8,[x0, #0x10]
008eda64	str x8,[sp, #0x70]
008eda68	ldr q0,[x0]
008eda6c	str q0,[sp, #0x60]
008eda70	stp xzr,xzr,[x0, #0x8]
008eda74	str xzr,[x0]
008eda78	ldrb w8,[x20, #0x18]
008eda7c	ldp x10,x9,[x20, #0x20]
008eda80	tst w8,#0x1
008eda84	lsr w11,w8,#0x1
008eda88	csel x1,x24,x9,eq
008eda8c	csel x2,x11,x10,eq
008eda90	add x0,sp,#0x60
008eda94	bl 0x00c308c0
008eda98	ldr x8,[x0, #0x10]
008eda9c	str x8,[sp, #0x90]
008edaa0	ldr q0,[x0]
008edaa4	str q0,[sp, #0x80]
008edaa8	stp xzr,xzr,[x0, #0x8]
008edaac	str xzr,[x0]
008edab0	ldrb w8,[sp, #0x80]
008edab4	ldr x9,[sp, #0x90]
008edab8	tst w8,#0x1
008edabc	csel x1,x27,x9,eq
008edac0	mov x0,x22
008edac4	bl 0x00c31840
008edac8	ldr x8,[x19, #0x18]
008edacc	str x0,[x8, #0x10]
008edad0	ldrb w8,[sp, #0x80]
008edad4	tbnz w8,#0x0,0x008edb04
008edad8	ldrb w8,[sp, #0x60]
008edadc	tbnz w8,#0x0,0x008edb14
008edae0	ldrb w8,[sp, #0x40]
008edae4	tbnz w8,#0x0,0x008edb24
008edae8	ldrb w8,[sp, #0x10]
008edaec	tbnz w8,#0x0,0x008edb34
008edaf0	ldrb w8,[sp, #0x28]
008edaf4	tbnz w8,#0x0,0x008edb44
008edaf8	ldr x8,[x25, #0x8]
008edafc	cbnz x8,0x008edb54
008edb00	b 0x008edb64
008edb04	ldr x0,[sp, #0x90]
008edb08	bl 0x00c301d0
008edb0c	ldrb w8,[sp, #0x60]
008edb10	tbz w8,#0x0,0x008edae0
008edb14	ldr x0,[sp, #0x70]
008edb18	bl 0x00c301d0
008edb1c	ldrb w8,[sp, #0x40]
008edb20	tbz w8,#0x0,0x008edae8
008edb24	ldr x0,[sp, #0x50]
008edb28	bl 0x00c301d0
008edb2c	ldrb w8,[sp, #0x10]
008edb30	tbz w8,#0x0,0x008edaf0
008edb34	ldr x0,[sp, #0x20]
008edb38	bl 0x00c301d0
008edb3c	ldrb w8,[sp, #0x28]
008edb40	tbz w8,#0x0,0x008edaf8
008edb44	ldr x0,[sp, #0x38]
008edb48	bl 0x00c301d0
008edb4c	ldr x8,[x25, #0x8]
008edb50	cbz x8,0x008edb64
008edb54	mov x25,x8
008edb58	ldr x8,[x8]
008edb5c	cbnz x8,0x008edb54
008edb60	b 0x008edb90
008edb64	mov x8,x25
008edb68	ldr x9,[x8, #0x10]!
008edb6c	ldr x10,[x9]
008edb70	cmp x10,x25
008edb74	b.eq 0x008edb9c
008edb78	ldr x9,[x8]
008edb7c	mov x8,x9
008edb80	ldr x25,[x8, #0x10]!
008edb84	ldr x10,[x25]
008edb88	cmp x10,x9
008edb8c	b.ne 0x008edb78
008edb90	cmp x25,x28
008edb94	b.ne 0x008ed9f0
008edb98	b 0x008edba8
008edb9c	mov x25,x9
008edba0	cmp x25,x28
008edba4	b.ne 0x008ed9f0
008edba8	ldr x8,[sp, #0x8]
008edbac	add x20,x20,#0x48
008edbb0	cmp x20,x8
008edbb4	b.ne 0x008ed9dc
008edbb8	ldr x8,[x19, #0x18]
008edbbc	ldr x22,[sp]
008edbc0	ldr x2,[x8, #0x10]
008edbc4	b 0x008edbcc
008edbc8	mov x2,xzr
008edbcc	ldr x0,[x8]
008edbd0	mov w1,#0x27db
008edbd4	bl 0x00c317c0
008edbd8	ldr x8,[x22, #0x28]
008edbdc	ldur x9,[x29, #-0x60]
008edbe0	cmp x8,x9
008edbe4	b.ne 0x008edc08
008edbe8	ldp x29,x30,[sp, #0x100]
008edbec	ldp x20,x19,[sp, #0xf0]
008edbf0	ldp x22,x21,[sp, #0xe0]
008edbf4	ldp x24,x23,[sp, #0xd0]
008edbf8	ldp x26,x25,[sp, #0xc0]
008edbfc	ldp x28,x27,[sp, #0xb0]
008edc00	add sp,sp,#0x110
008edc04	ret
008edc08	bl 0x00c2fec0
