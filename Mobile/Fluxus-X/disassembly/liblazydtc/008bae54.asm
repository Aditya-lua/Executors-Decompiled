; FUN_008bae54 @ 008bae54
008bae54	stp x29,x30,[sp, #-0x40]!
008bae58	str x23,[sp, #0x10]
008bae5c	stp x22,x21,[sp, #0x20]
008bae60	stp x20,x19,[sp, #0x30]
008bae64	mov x29,sp
008bae68	mov w21,w2
008bae6c	ldrb w2,[x0, #0x4]
008bae70	mov w22,w1
008bae74	mov w1,#0x30
008bae78	mov w3,#0x6
008bae7c	mov w4,wzr
008bae80	mov x20,x0
008bae84	mov w23,#0x6
008bae88	bl 0x008b78d0
008bae8c	ldr x8,[x20, #0x60]
008bae90	movi d0,#-0xffffff01000000
008bae94	ldrb w9,[x20, #0x4]
008bae98	strb w23,[x0]
008bae9c	mov x19,x0
008baea0	ldrb w8,[x8, #0x2]
008baea4	str xzr,[x0, #0x10]
008baea8	str xzr,[x0, #0x20]
008baeac	and w8,w8,#0x3
008baeb0	strb w9,[x0, #0x1]
008baeb4	stur s0,[x0, #0x3]
008baeb8	strb w8,[x0, #0x2]
008baebc	adrp x8,0xd1f000
008baec0	add x8,x8,#0xc90
008baec4	strb wzr,[x0, #0xf]
008baec8	stur xzr,[x0, #0x7]
008baecc	ldarb w9,[x8]
008baed0	adrp x8,0xd1f000
008baed4	tbz w9,#0x0,0x008bb020
008baed8	ldr x8,[x8, #0xc88]
008baedc	cmp w22,#0x1
008baee0	add x8,x8,#0x7f3, LSL #12
008baee4	add x8,x8,#0x700
008baee8	str x8,[x19, #0x28]
008baeec	b.lt 0x008baf88
008baef0	mov w8,#0x1
008baef4	movk w8,#0x400, LSL #16
008baef8	cmp w22,w8
008baefc	b.cs 0x008bb010
008baf00	ldrsw x8,[x19, #0x8]
008baf04	ldr x1,[x19, #0x20]
008baf08	lsl w3,w22,#0x4
008baf0c	ldrb w4,[x19, #0x1]
008baf10	mov x0,x20
008baf14	lsl x2,x8,#0x4
008baf18	bl 0x008b8498
008baf1c	ldrsw x12,[x19, #0x8]
008baf20	str x0,[x19, #0x20]
008baf24	cmp w12,w22
008baf28	b.ge 0x008baf84
008baf2c	mov w8,w22
008baf30	mov x10,x12
008baf34	sub x9,x8,x12
008baf38	cmp x9,#0x2
008baf3c	b.cc 0x008baf6c
008baf40	add x13,x0,x12, LSL #0x4
008baf44	and x11,x9,#-0x2
008baf48	add x10,x11,x12
008baf4c	add x12,x13,#0x1c
008baf50	mov x13,x11
008baf54	subs x13,x13,#0x2
008baf58	stur wzr,[x12, #-0x10]
008baf5c	str wzr,[x12], #0x20
008baf60	b.ne 0x008baf54
008baf64	cmp x9,x11
008baf68	b.eq 0x008baf84
008baf6c	add x9,x0,x10, LSL #0x4
008baf70	sub x8,x8,x10
008baf74	add x9,x9,#0xc
008baf78	subs x8,x8,#0x1
008baf7c	str wzr,[x9], #0x10
008baf80	b.ne 0x008baf78
008baf84	str w22,[x19, #0x8]
008baf88	subs w0,w21,#0x1
008baf8c	b.lt 0x008baff8
008baf90	bl 0x008b91dc
008baf94	cmp w0,#0x1a
008baf98	b.ge 0x008bb010
008baf9c	add w21,w0,#0x1
008bafa0	mov w8,#0x1
008bafa4	ldrb w2,[x19, #0x1]
008bafa8	lsl w22,w8,w21
008bafac	mov x0,x20
008bafb0	ubfiz x1,x22,#0x5,#0x20
008bafb4	bl 0x008b7610
008bafb8	mov x8,xzr
008bafbc	mov x9,x22
008bafc0	str x0,[x19, #0x28]
008bafc4	ldr x10,[x19, #0x28]
008bafc8	subs x9,x9,#0x1
008bafcc	add x10,x10,x8
008bafd0	add x8,x8,#0x20
008bafd4	str wzr,[x10, #0x1c]
008bafd8	str wzr,[x10, #0xc]
008bafdc	b.ne 0x008bafc4
008bafe0	mov w8,#0xffffffff
008bafe4	strb w21,[x19, #0x5]
008bafe8	lsl w8,w8,w21
008bafec	str w22,[x19, #0xc]
008baff0	mvn w8,w8
008baff4	strb w8,[x19, #0x4]
008baff8	mov x0,x19
008baffc	ldp x20,x19,[sp, #0x30]
008bb000	ldr x23,[sp, #0x10]
008bb004	ldp x22,x21,[sp, #0x20]
008bb008	ldp x29,x30,[sp], #0x40
008bb00c	ret
008bb010	adrp x1,0x2d2000
008bb014	add x1,x1,#0xd52
008bb018	mov x0,x20
008bb01c	bl 0x008b39cc
008bb020	adrp x0,0xd1f000
008bb024	add x0,x0,#0xc90
008bb028	bl 0x00c2fe90
008bb02c	adrp x8,0xd1f000
008bb030	cbz w0,0x008baed8
008bb034	adrp x8,0xcca000
008bb038	ldr x0,[x8, #0x8c8]
008bb03c	bl 0x007fe1ec
008bb040	adrp x23,0xd1f000
008bb044	str x0,[x23, #0xc88]
008bb048	adrp x0,0xd1f000
008bb04c	add x0,x0,#0xc90
008bb050	bl 0x00c2fea0
008bb054	mov x8,x23
008bb058	b 0x008baed8
