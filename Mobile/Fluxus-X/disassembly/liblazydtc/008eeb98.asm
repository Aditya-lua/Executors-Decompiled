; cpr::Session::SetSslOptions @ 008eeb98
008eeb98	sub sp,sp,#0x90
008eeb9c	str x25,[sp, #0x40]
008eeba0	stp x24,x23,[sp, #0x50]
008eeba4	stp x22,x21,[sp, #0x60]
008eeba8	stp x20,x19,[sp, #0x70]
008eebac	stp x29,x30,[sp, #0x80]
008eebb0	add x29,sp,#0x80
008eebb4	mrs x25,tpidr_el0
008eebb8	ldr x8,[x25, #0x28]
008eebbc	mov x19,x1
008eebc0	mov x20,x0
008eebc4	str x8,[sp, #0x38]
008eebc8	ldrb w8,[x1]
008eebcc	tbnz w8,#0x0,0x008eebdc
008eebd0	lsr w9,w8,#0x1
008eebd4	cbnz x9,0x008eebe4
008eebd8	b 0x008eec44
008eebdc	ldr x9,[x19, #0x8]
008eebe0	cbz x9,0x008eec44
008eebe4	ldr x9,[x20, #0x18]
008eebe8	ldr x0,[x9]
008eebec	tbnz w8,#0x0,0x008eebf8
008eebf0	add x2,x19,#0x1
008eebf4	b 0x008eebfc
008eebf8	ldr x2,[x19, #0x10]
008eebfc	mov w1,#0x2729
008eec00	bl 0x00c317c0
008eec04	mov x8,x19
008eec08	ldrb w9,[x8, #0x18]!
008eec0c	tbnz w9,#0x0,0x008eec1c
008eec10	lsr w10,w9,#0x1
008eec14	cbnz x10,0x008eec24
008eec18	b 0x008eec44
008eec1c	ldr x10,[x19, #0x20]
008eec20	cbz x10,0x008eec44
008eec24	ldr x10,[x20, #0x18]
008eec28	ldr x0,[x10]
008eec2c	tbnz w9,#0x0,0x008eec38
008eec30	add x2,x8,#0x1
008eec34	b 0x008eec3c
008eec38	ldr x2,[x19, #0x28]
008eec3c	mov w1,#0x2766
008eec40	bl 0x00c317c0
008eec44	mov x8,x19
008eec48	ldrb w9,[x8, #0x30]!
008eec4c	tbnz w9,#0x0,0x008eec6c
008eec50	lsr w10,w9,#0x1
008eec54	cbz x10,0x008eec74
008eec58	ldr x10,[x20, #0x18]
008eec5c	ldr x0,[x10]
008eec60	tbnz w9,#0x0,0x008eec8c
008eec64	add x2,x8,#0x1
008eec68	b 0x008eec90
008eec6c	ldr x10,[x19, #0x38]
008eec70	cbnz x10,0x008eec58
008eec74	mov x8,x19
008eec78	ldrb w9,[x8, #0x48]!
008eec7c	tbnz w9,#0x0,0x008eed1c
008eec80	lsr w10,w9,#0x1
008eec84	cbnz x10,0x008eed24
008eec88	b 0x008eee78
008eec8c	ldr x2,[x19, #0x40]
008eec90	mov w1,#0x2767
008eec94	bl 0x00c317c0
008eec98	mov x8,x19
008eec9c	ldrb w9,[x8, #0x60]!
008eeca0	tbnz w9,#0x0,0x008eecb0
008eeca4	lsr w10,w9,#0x1
008eeca8	cbnz x10,0x008eecb8
008eecac	b 0x008eecd8
008eecb0	ldr x10,[x19, #0x68]
008eecb4	cbz x10,0x008eecd8
008eecb8	ldr x10,[x20, #0x18]
008eecbc	ldr x0,[x10]
008eecc0	tbnz w9,#0x0,0x008eeccc
008eecc4	add x2,x8,#0x1
008eecc8	b 0x008eecd0
008eeccc	ldr x2,[x19, #0x70]
008eecd0	mov w1,#0x2768
008eecd4	bl 0x00c317c0
008eecd8	mov x8,x19
008eecdc	ldrb w9,[x8, #0x78]!
008eece0	tbnz w9,#0x0,0x008eecf0
008eece4	lsr w10,w9,#0x1
008eece8	cbnz x10,0x008eecf8
008eecec	b 0x008eee78
008eecf0	ldr x10,[x19, #0x80]
008eecf4	cbz x10,0x008eee78
008eecf8	ldr x10,[x20, #0x18]
008eecfc	ldr x0,[x10]
008eed00	tbnz w9,#0x0,0x008eed0c
008eed04	add x2,x8,#0x1
008eed08	b 0x008eed10
008eed0c	ldr x2,[x19, #0x88]
008eed10	mov w1,#0x272a
008eed14	bl 0x00c317c0
008eed18	b 0x008eee78
008eed1c	ldr x10,[x19, #0x50]
008eed20	cbz x10,0x008eee78
008eed24	stp xzr,xzr,[sp, #0x20]
008eed28	str xzr,[sp, #0x30]
008eed2c	tbnz w9,#0x0,0x008eed44
008eed30	ldr x9,[x8, #0x10]
008eed34	str x9,[sp, #0x30]
008eed38	ldr q0,[x8]
008eed3c	str q0,[sp, #0x20]
008eed40	b 0x008eeda8
008eed44	ldr x21,[x19, #0x50]
008eed48	cmn x21,#0x10
008eed4c	b.cs 0x008ef13c
008eed50	ldr x22,[x19, #0x58]
008eed54	cmp x21,#0x17
008eed58	b.cs 0x008eed74
008eed5c	add x9,sp,#0x20
008eed60	lsl w8,w21,#0x1
008eed64	orr x23,x9,#0x1
008eed68	strb w8,[sp, #0x20]
008eed6c	cbnz x21,0x008eed94
008eed70	b 0x008eeda4
008eed74	add x8,x21,#0x10
008eed78	and x24,x8,#-0x10
008eed7c	mov x0,x24
008eed80	bl 0x00c2fed0
008eed84	orr x8,x24,#0x1
008eed88	mov x23,x0
008eed8c	stp x21,x0,[sp, #0x28]
008eed90	str x8,[sp, #0x20]
008eed94	mov x0,x23
008eed98	mov x1,x22
008eed9c	mov x2,x21
008eeda0	bl 0x00c2ffd0
008eeda4	strb wzr,[x23, x21]
008eeda8	ldrb w8,[sp, #0x20]
008eedac	stp xzr,xzr,[sp, #0x8]
008eedb0	str xzr,[sp, #0x18]
008eedb4	tbnz w8,#0x0,0x008eedc8
008eedb8	add x9,sp,#0x20
008eedbc	orr x9,x9,#0x1
008eedc0	lsr w8,w8,#0x1
008eedc4	b 0x008eedcc
008eedc8	ldp x8,x9,[sp, #0x28]
008eedcc	str x9,[sp, #0x8]
008eedd0	str x8,[sp, #0x10]
008eedd4	ldr x8,[x20, #0x18]
008eedd8	ldr x0,[x8]
008eeddc	mov w1,#0x9d64
008eede0	add x2,sp,#0x8
008eede4	bl 0x00c317c0
008eede8	mov x8,x19
008eedec	ldrb w9,[x8, #0x60]!
008eedf0	tbnz w9,#0x0,0x008eee00
008eedf4	lsr w10,w9,#0x1
008eedf8	cbnz x10,0x008eee08
008eedfc	b 0x008eee28
008eee00	ldr x10,[x19, #0x68]
008eee04	cbz x10,0x008eee28
008eee08	ldr x10,[x20, #0x18]
008eee0c	ldr x0,[x10]
008eee10	tbnz w9,#0x0,0x008eee1c
008eee14	add x2,x8,#0x1
008eee18	b 0x008eee20
008eee1c	ldr x2,[x19, #0x70]
008eee20	mov w1,#0x2768
008eee24	bl 0x00c317c0
008eee28	mov x8,x19
008eee2c	ldrb w9,[x8, #0x78]!
008eee30	tbnz w9,#0x0,0x008eee40
008eee34	lsr w10,w9,#0x1
008eee38	cbnz x10,0x008eee48
008eee3c	b 0x008eee68
008eee40	ldr x10,[x19, #0x80]
008eee44	cbz x10,0x008eee68
008eee48	ldr x10,[x20, #0x18]
008eee4c	ldr x0,[x10]
008eee50	tbnz w9,#0x0,0x008eee5c
008eee54	add x2,x8,#0x1
008eee58	b 0x008eee60
008eee5c	ldr x2,[x19, #0x88]
008eee60	mov w1,#0x272a
008eee64	bl 0x00c317c0
008eee68	ldrb w8,[sp, #0x20]
008eee6c	tbz w8,#0x0,0x008eee78
008eee70	ldr x0,[sp, #0x30]
008eee74	bl 0x00c301d0
008eee78	mov x8,x19
008eee7c	ldrb w9,[x8, #0x90]!
008eee80	tbnz w9,#0x0,0x008eee90
008eee84	lsr w10,w9,#0x1
008eee88	cbnz x10,0x008eee98
008eee8c	b 0x008eeeb8
008eee90	ldr x10,[x19, #0x98]
008eee94	cbz x10,0x008eeeb8
008eee98	ldr x10,[x20, #0x18]
008eee9c	ldr x0,[x10]
008eeea0	tbnz w9,#0x0,0x008eeeac
008eeea4	add x2,x8,#0x1
008eeea8	b 0x008eeeb0
008eeeac	ldr x2,[x19, #0xa0]
008eeeb0	mov w1,#0x27f6
008eeeb4	bl 0x00c317c0
008eeeb8	ldr x8,[x20, #0x18]
008eeebc	ldrb w2,[x19, #0xa8]
008eeec0	mov w1,#0xe2
008eeec4	ldr x0,[x8]
008eeec8	bl 0x00c317c0
008eeecc	ldr x8,[x20, #0x18]
008eeed0	ldrb w2,[x19, #0xaa]
008eeed4	mov w1,#0x40
008eeed8	ldr x0,[x8]
008eeedc	bl 0x00c317c0
008eeee0	ldr x8,[x20, #0x18]
008eeee4	ldrb w9,[x19, #0xa9]
008eeee8	mov w1,#0x51
008eeeec	ldr x0,[x8]
008eeef0	cmp w9,#0x0
008eeef4	mov w8,#0x2
008eeef8	csel x2,xzr,x8,eq
008eeefc	bl 0x00c317c0
008eef00	ldr x8,[x20, #0x18]
008eef04	ldrb w2,[x19, #0xab]
008eef08	mov w1,#0xe8
008eef0c	ldr x0,[x8]
008eef10	bl 0x00c317c0
008eef14	ldr x8,[x20, #0x18]
008eef18	ldr w9,[x19, #0xac]
008eef1c	ldr w10,[x19, #0xb4]
008eef20	mov w1,#0x20
008eef24	ldr x0,[x8]
008eef28	orr w2,w10,w9
008eef2c	bl 0x00c317c0
008eef30	ldrb w8,[x19, #0xb0]
008eef34	cbz w8,0x008eef4c
008eef38	ldr x8,[x20, #0x18]
008eef3c	mov w1,#0xd8
008eef40	mov w2,#0x2
008eef44	ldr x0,[x8]
008eef48	bl 0x00c317c0
008eef4c	mov x8,x19
008eef50	ldrb w9,[x8, #0xb8]!
008eef54	tbnz w9,#0x0,0x008eef64
008eef58	lsr w10,w9,#0x1
008eef5c	cbnz x10,0x008eef6c
008eef60	b 0x008eef8c
008eef64	ldr x10,[x19, #0xc0]
008eef68	cbz x10,0x008eef8c
008eef6c	ldr x10,[x20, #0x18]
008eef70	ldr x0,[x10]
008eef74	tbnz w9,#0x0,0x008eef80
008eef78	add x2,x8,#0x1
008eef7c	b 0x008eef84
008eef80	ldr x2,[x19, #0xc8]
008eef84	mov w1,#0x2751
008eef88	bl 0x00c317c0
008eef8c	mov x8,x19
008eef90	ldrb w9,[x8, #0xd0]!
008eef94	tbnz w9,#0x0,0x008eefa4
008eef98	lsr w10,w9,#0x1
008eef9c	cbnz x10,0x008eefac
008eefa0	b 0x008eefcc
008eefa4	ldr x10,[x19, #0xd8]
008eefa8	cbz x10,0x008eefcc
008eefac	ldr x10,[x20, #0x18]
008eefb0	ldr x0,[x10]
008eefb4	tbnz w9,#0x0,0x008eefc0
008eefb8	add x2,x8,#0x1
008eefbc	b 0x008eefc4
008eefc0	ldr x2,[x19, #0xe0]
008eefc4	mov w1,#0x2771
008eefc8	bl 0x00c317c0
008eefcc	mov x21,x19
008eefd0	ldrb w8,[x21, #0xe8]!
008eefd4	tbnz w8,#0x0,0x008ef010
008eefd8	lsr w8,w8,#0x1
008eefdc	cbz x8,0x008ef018
008eefe0	ldr x8,[x20, #0x18]
008eefe4	adrp x2,0xcb4000
008eefe8	mov w1,#0x4e8c
008eefec	ldr x0,[x8]
008eeff0	ldr x2,[x2, #0xcc8]
008eeff4	bl 0x00c317c0
008eeff8	ldr x8,[x20, #0x18]
008eeffc	ldrb w9,[x21]
008ef000	ldr x0,[x8]
008ef004	tbnz w9,#0x0,0x008ef040
008ef008	add x2,x21,#0x1
008ef00c	b 0x008ef044
008ef010	ldr x8,[x19, #0xf0]
008ef014	cbnz x8,0x008eefe0
008ef018	ldrb w8,[x19, #0x100]
008ef01c	tbnz w8,#0x0,0x008ef054
008ef020	lsr w9,w8,#0x1
008ef024	cbz x9,0x008ef05c
008ef028	ldr x9,[x20, #0x18]
008ef02c	ldr x0,[x9]
008ef030	tbnz w8,#0x0,0x008ef084
008ef034	add x8,x19,#0x100
008ef038	add x2,x8,#0x1
008ef03c	b 0x008ef088
008ef040	ldr x2,[x19, #0xf8]
008ef044	mov w1,#0x277d
008ef048	bl 0x00c317c0
008ef04c	ldrb w8,[x19, #0x100]
008ef050	tbz w8,#0x0,0x008ef020
008ef054	ldr x9,[x19, #0x108]
008ef058	cbnz x9,0x008ef028
008ef05c	ldrb w8,[x19, #0x118]
008ef060	tbnz w8,#0x0,0x008ef098
008ef064	lsr w9,w8,#0x1
008ef068	add x21,x19,#0x118
008ef06c	cbz x9,0x008ef0a4
008ef070	ldr x9,[x20, #0x18]
008ef074	ldr x0,[x9]
008ef078	tbnz w8,#0x0,0x008ef0b8
008ef07c	add x2,x21,#0x1
008ef080	b 0x008ef0bc
008ef084	ldr x2,[x19, #0x110]
008ef088	mov w1,#0x27b9
008ef08c	bl 0x00c317c0
008ef090	ldrb w8,[x19, #0x118]
008ef094	tbz w8,#0x0,0x008ef064
008ef098	ldr x9,[x19, #0x120]
008ef09c	add x21,x19,#0x118
008ef0a0	cbnz x9,0x008ef070
008ef0a4	ldrb w8,[x19, #0x130]
008ef0a8	tbnz w8,#0x0,0x008ef0cc
008ef0ac	lsr w8,w8,#0x1
008ef0b0	cbnz x8,0x008ef0d4
008ef0b4	b 0x008ef0f8
008ef0b8	ldr x2,[x19, #0x128]
008ef0bc	mov w1,#0x2763
008ef0c0	bl 0x00c317c0
008ef0c4	ldrb w8,[x19, #0x130]
008ef0c8	tbz w8,#0x0,0x008ef0ac
008ef0cc	ldr x8,[x19, #0x138]
008ef0d0	cbz x8,0x008ef0f8
008ef0d4	ldr x8,[x20, #0x18]
008ef0d8	ldrb w9,[x21]
008ef0dc	ldr x0,[x8]
008ef0e0	tbnz w9,#0x0,0x008ef0ec
008ef0e4	add x2,x21,#0x1
008ef0e8	b 0x008ef0f0
008ef0ec	ldr x2,[x19, #0x128]
008ef0f0	mov w1,#0x2824
008ef0f4	bl 0x00c317c0
008ef0f8	ldr x8,[x20, #0x18]
008ef0fc	ldrb w2,[x19, #0x148]
008ef100	mov w1,#0x96
008ef104	ldr x0,[x8]
008ef108	bl 0x00c317c0
008ef10c	ldr x8,[x25, #0x28]
008ef110	ldr x9,[sp, #0x38]
008ef114	cmp x8,x9
008ef118	b.ne 0x008ef138
008ef11c	ldp x29,x30,[sp, #0x80]
008ef120	ldp x20,x19,[sp, #0x70]
008ef124	ldp x22,x21,[sp, #0x60]
008ef128	ldp x24,x23,[sp, #0x50]
008ef12c	ldr x25,[sp, #0x40]
008ef130	add sp,sp,#0x90
008ef134	ret
008ef138	bl 0x00c2fec0
008ef13c	add x0,sp,#0x20
008ef140	bl 0x00c30ce0
