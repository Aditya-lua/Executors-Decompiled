; FUN_007feb50 @ 007feb50
007feb50	sub sp,sp,#0x90
007feb54	stp x29,x30,[sp, #0x30]
007feb58	str x27,[sp, #0x40]
007feb5c	stp x26,x25,[sp, #0x50]
007feb60	stp x24,x23,[sp, #0x60]
007feb64	stp x22,x21,[sp, #0x70]
007feb68	stp x20,x19,[sp, #0x80]
007feb6c	add x29,sp,#0x30
007feb70	mrs x26,tpidr_el0
007feb74	mov x19,x0
007feb78	ldr x8,[x26, #0x28]
007feb7c	stur x8,[x29, #-0x8]
007feb80	ldr x8,[x0, #0x20]
007feb84	subs x8,x8,#0xaa
007feb88	b.cc 0x007febb0
007feb8c	ldr x9,[x19, #0x8]
007feb90	str x8,[x19, #0x20]
007feb94	ldr x8,[x9], #0x8
007feb98	str x9,[x19, #0x8]
007feb9c	str x8,[sp]
007feba0	mov x1,sp
007feba4	mov x0,x19
007feba8	bl 0x007fedac
007febac	b 0x007fed28
007febb0	mov x8,x19
007febb4	ldp x27,x20,[x19, #0x8]
007febb8	ldr x9,[x8, #0x18]!
007febbc	ldr x10,[x19]
007febc0	sub x21,x20,x27
007febc4	sub x11,x9,x10
007febc8	cmp x21,x11
007febcc	b.cs 0x007febf4
007febd0	mov w0,#0xff0
007febd4	cmp x9,x20
007febd8	b.eq 0x007fec64
007febdc	bl 0x00c2fed0
007febe0	str x0,[sp]
007febe4	mov x1,sp
007febe8	mov x0,x19
007febec	bl 0x007fef2c
007febf0	b 0x007fed28
007febf4	asr x11,x11,#0x2
007febf8	cmp x9,x10
007febfc	str x8,[sp, #0x20]
007fec00	csinc x9,x11,xzr,ne
007fec04	lsr x10,x9,#0x3d
007fec08	cbnz x10,0x007fed58
007fec0c	lsl x25,x9,#0x3
007fec10	mov x0,x25
007fec14	bl 0x00c2fed0
007fec18	mov x24,x0
007fec1c	add x22,x0,x21
007fec20	add x8,x0,x25
007fec24	stp x0,x22,[sp]
007fec28	stp x22,x8,[sp, #0x10]
007fec2c	mov w0,#0xff0
007fec30	bl 0x00c2fed0
007fec34	mov x23,x0
007fec38	cmp x21,x25
007fec3c	b.ne 0x007fecb4
007fec40	cmp x20,x27
007fec44	b.eq 0x007fec8c
007fec48	asr x8,x21,#0x3
007fec4c	add x8,x8,#0x1
007fec50	add x8,x8,x8, LSR #0x3f
007fec54	lsr x8,x8,#0x1
007fec58	sub x22,x22,x8, LSL #0x3
007fec5c	str x22,[sp, #0x8]
007fec60	b 0x007fecb4
007fec64	bl 0x00c2fed0
007fec68	str x0,[sp]
007fec6c	mov x1,sp
007fec70	mov x0,x19
007fec74	bl 0x007ff0ac
007fec78	ldr x8,[x19, #0x8]
007fec7c	ldr x9,[x8], #0x8
007fec80	str x8,[x19, #0x8]
007fec84	str x9,[sp]
007fec88	b 0x007feba0
007fec8c	mov w0,#0x8
007fec90	bl 0x00c2fed0
007fec94	mov x22,x0
007fec98	stp x0,x0,[sp]
007fec9c	add x8,x0,#0x8
007feca0	mov x0,x24
007feca4	mov x1,x21
007feca8	str x8,[sp, #0x18]
007fecac	bl 0x00c2fe80
007fecb0	ldr x20,[x19, #0x10]
007fecb4	mov x8,#-0x7
007fecb8	str x23,[x22], #0x8
007fecbc	sub x21,x8,x20
007fecc0	str x22,[sp, #0x10]
007fecc4	ldr x8,[x19, #0x8]
007fecc8	cmp x20,x8
007feccc	b.eq 0x007fece8
007fecd0	sub x20,x20,#0x8
007fecd4	add x21,x21,#0x8
007fecd8	mov x0,sp
007fecdc	mov x1,x20
007fece0	bl 0x007ff240
007fece4	b 0x007fecc4
007fece8	ldr x0,[x19]
007fecec	ldp q0,q1,[sp]
007fecf0	stp x0,x8,[sp]
007fecf4	ldp x9,x8,[x19, #0x10]
007fecf8	stp q0,q1,[x19]
007fecfc	cmp x20,x9
007fed00	stp x9,x8,[sp, #0x10]
007fed04	b.eq 0x007fed1c
007fed08	neg x10,x21
007fed0c	sub x10,x10,x9
007fed10	and x10,x10,#-0x8
007fed14	add x9,x9,x10
007fed18	str x9,[sp, #0x10]
007fed1c	cbz x0,0x007fed28
007fed20	sub x1,x8,x0
007fed24	bl 0x00c2fe80
007fed28	ldr x8,[x26, #0x28]
007fed2c	ldur x9,[x29, #-0x8]
007fed30	cmp x8,x9
007fed34	b.ne 0x007feda8
007fed38	ldp x20,x19,[sp, #0x80]
007fed3c	ldr x27,[sp, #0x40]
007fed40	ldp x22,x21,[sp, #0x70]
007fed44	ldp x24,x23,[sp, #0x60]
007fed48	ldp x26,x25,[sp, #0x50]
007fed4c	ldp x29,x30,[sp, #0x30]
007fed50	add sp,sp,#0x90
007fed54	ret
007fed58	ldr x8,[x26, #0x28]
007fed5c	ldur x9,[x29, #-0x8]
007fed60	cmp x8,x9
007fed64	b.ne 0x007feda8
007fed68	bl 0x007fe1b8
007feda8	bl 0x00c2fec0
