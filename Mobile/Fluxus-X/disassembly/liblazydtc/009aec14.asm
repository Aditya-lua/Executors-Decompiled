; ssl_create_cipher_list @ 009aec14
009aec14	sub sp,sp,#0x90
009aec18	stp x26,x25,[sp, #0x40]
009aec1c	mov x26,xzr
009aec20	stp x28,x27,[sp, #0x30]
009aec24	stp x24,x23,[sp, #0x50]
009aec28	stp x22,x21,[sp, #0x60]
009aec2c	stp x20,x19,[sp, #0x70]
009aec30	stp x29,x30,[sp, #0x80]
009aec34	add x29,sp,#0x80
009aec38	stp xzr,xzr,[sp, #0x20]
009aec3c	cbz x3,0x009af4c0
009aec40	mov x19,x2
009aec44	cbz x2,0x009af4c0
009aec48	mov x25,x4
009aec4c	cbz x4,0x009af4c0
009aec50	ldr x23,[x0, #0x8]
009aec54	mov x21,x1
009aec58	adrp x1,0x2a3000
009aec5c	mov x22,x0
009aec60	add x1,x1,#0xb5c
009aec64	mov w2,#0xd
009aec68	mov x0,x25
009aec6c	mov x24,x5
009aec70	mov x20,x3
009aec74	bl 0x00c31bb0
009aec78	cbz w0,0x009aecd8
009aec7c	adrp x1,0x2bd000
009aec80	add x1,x1,#0x4b7
009aec84	mov w2,#0xb
009aec88	mov x0,x25
009aec8c	bl 0x00c31bb0
009aec90	cbz w0,0x009aece4
009aec94	adrp x1,0x2c3000
009aec98	add x1,x1,#0x47d
009aec9c	mov w2,#0x9
009aeca0	mov x0,x25
009aeca4	bl 0x00c31bb0
009aeca8	cbz w0,0x009aecf0
009aecac	adrp x1,0x2a7000
009aecb0	add x1,x1,#0x9cd
009aecb4	mov w2,#0x9
009aecb8	mov x0,x25
009aecbc	bl 0x00c31bb0
009aecc0	cbz w0,0x009aecfc
009aecc4	ldr w8,[x24, #0x1c]
009aecc8	ands w9,w8,#0x30000
009aeccc	b.eq 0x009aed90
009aecd0	mov w8,wzr
009aecd4	b 0x009aed14
009aecd8	mov w8,wzr
009aecdc	mov w9,#0x10000
009aece0	b 0x009aed04
009aece4	mov w8,#0x1
009aece8	orr w9,wzr,#0x30000
009aecec	b 0x009aed04
009aecf0	mov w8,wzr
009aecf4	orr w9,wzr,#0x30000
009aecf8	b 0x009aed04
009aecfc	mov w8,wzr
009aed00	mov w9,#0x20000
009aed04	ldr w10,[x24, #0x1c]
009aed08	and w10,w10,#0xfffcffff
009aed0c	orr w10,w10,w9
009aed10	str w10,[x24, #0x1c]
009aed14	ldr x10,[x23, #0xc0]
009aed18	ldrb w10,[x10, #0x60]
009aed1c	tbnz w10,#0x4,0x009aed48
009aed20	bl 0x00c342a0
009aed24	adrp x0,0x2af000
009aed28	adrp x2,0x2ad000
009aed2c	add x0,x0,#0x931
009aed30	add x2,x2,#0x6c5
009aed34	mov w1,#0x503
009aed38	bl 0x00c342b0
009aed3c	mov w0,#0x14
009aed40	mov w1,#0x9e
009aed44	b 0x009aefc4
009aed48	cmp w9,#0x10, LSL #12
009aed4c	b.eq 0x009aed7c
009aed50	cmp w9,#0x20, LSL #12
009aed54	b.eq 0x009aed88
009aed58	cmp w9,#0x30, LSL #12
009aed5c	b.ne 0x009aed90
009aed60	adrp x9,0x2a9000
009aed64	adrp x10,0x2b7000
009aed68	add x9,x9,#0xbab
009aed6c	add x10,x10,#0x608
009aed70	cmp w8,#0x0
009aed74	csel x25,x10,x9,eq
009aed78	b 0x009aed90
009aed7c	adrp x25,0x2af000
009aed80	add x25,x25,#0x86e
009aed84	b 0x009aed90
009aed88	adrp x25,0x2a9000
009aed8c	add x25,x25,#0xbab
009aed90	ldr w8,[x22, #0x648]
009aed94	ldr w28,[x22, #0x640]
009aed98	str w8,[sp, #0x1c]
009aed9c	ldr w8,[x22, #0x64c]
009aeda0	str w8,[sp, #0x18]
009aeda4	ldr w8,[x22, #0x644]
009aeda8	str w8,[sp, #0x14]
009aedac	ldr x8,[x23, #0xa8]
009aedb0	blr x8
009aedb4	mov w26,w0
009aedb8	adrp x1,0x2af000
009aedbc	sbfiz x0,x26,#0x5,#0x20
009aedc0	add x1,x1,#0x931
009aedc4	mov w2,#0x5cb
009aedc8	bl 0x00c32320
009aedcc	cbz x0,0x009aef9c
009aedd0	mov x27,x0
009aedd4	cmp w26,#0x1
009aedd8	str x19,[sp]
009aeddc	b.lt 0x009aeef0
009aede0	str x25,[sp, #0x8]
009aede4	mov x25,x22
009aede8	mov x22,x21
009aedec	mov x21,x24
009aedf0	mov x24,x20
009aedf4	mov x20,x27
009aedf8	mov w27,wzr
009aedfc	mov w19,wzr
009aee00	ldr x8,[x23, #0xb0]
009aee04	mov w0,w27
009aee08	blr x8
009aee0c	cbz x0,0x009aee8c
009aee10	ldr w8,[x0]
009aee14	cbz w8,0x009aee8c
009aee18	ldr w8,[x0, #0x1c]
009aee1c	ldr w9,[sp, #0x1c]
009aee20	tst w8,w9
009aee24	b.ne 0x009aee8c
009aee28	ldr w8,[x0, #0x20]
009aee2c	ldr w9,[sp, #0x18]
009aee30	tst w8,w9
009aee34	b.ne 0x009aee8c
009aee38	ldr w8,[x0, #0x24]
009aee3c	tst w8,w28
009aee40	b.ne 0x009aee8c
009aee44	ldr w8,[x0, #0x28]
009aee48	ldr w9,[sp, #0x14]
009aee4c	tst w8,w9
009aee50	b.ne 0x009aee8c
009aee54	ldr x8,[x23, #0xc0]
009aee58	ldrb w8,[x8, #0x60]
009aee5c	tbnz w8,#0x3,0x009aee6c
009aee60	ldr w8,[x0, #0x2c]
009aee64	cbnz w8,0x009aee74
009aee68	b 0x009aee8c
009aee6c	ldr w8,[x0, #0x34]
009aee70	cbz w8,0x009aee8c
009aee74	sxtw x8,w19
009aee78	add w19,w19,#0x1
009aee7c	add x8,x20,x8, LSL #0x5
009aee80	str x0,[x8]
009aee84	str wzr,[x8, #0x8]
009aee88	stp xzr,xzr,[x8, #0x10]
009aee8c	add w27,w27,#0x1
009aee90	cmp w26,w27
009aee94	b.ne 0x009aee00
009aee98	mov x27,x20
009aee9c	mov x20,x24
009aeea0	mov x24,x21
009aeea4	mov x21,x22
009aeea8	mov x22,x25
009aeeac	ldr x25,[sp, #0x8]
009aeeb0	cmp w19,#0x1
009aeeb4	b.lt 0x009aeef0
009aeeb8	mov x9,xzr
009aeebc	subs w8,w19,#0x1
009aeec0	str xzr,[x27, #0x18]
009aeec4	b.eq 0x009af554
009aeec8	add x9,x27,#0x20
009aeecc	cmp w19,#0x3
009aeed0	str x9,[x27, #0x10]
009aeed4	b.lt 0x009af53c
009aeed8	mov w9,w8
009aeedc	sub x10,x9,#0x1
009aeee0	cmp x10,#0x2
009aeee4	b.cs 0x009af4e4
009aeee8	mov w10,#0x1
009aeeec	b 0x009af51c
009aeef0	mov x8,xzr
009aeef4	mov x10,xzr
009aeef8	stp xzr,xzr,[sp, #0x20]
009aeefc	add x0,sp,#0x28
009aef00	add x1,sp,#0x20
009aef04	stp x10,x8,[sp, #0x20]
009aef08	bl 0x009afe44
009aef0c	cbz w0,0x009aefd0
009aef10	mov x23,x27
009aef14	ldp x10,x27,[sp, #0x20]
009aef18	cbz x27,0x009aefe4
009aef1c	cbz x10,0x009aefe4
009aef20	mov x8,x10
009aef24	mov x9,x27
009aef28	ldr x11,[x10]
009aef2c	ldr w12,[x11, #0x2c]
009aef30	ldr x11,[x10, #0x18]
009aef34	cmp w12,#0x303
009aef38	b.ne 0x009aef7c
009aef3c	ldr w12,[x10, #0x8]
009aef40	cbz w12,0x009aef7c
009aef44	cmp x10,x9
009aef48	b.eq 0x009aef7c
009aef4c	ldr x12,[x10, #0x10]
009aef50	cmp x10,x8
009aef54	csel x8,x11,x8,eq
009aef58	mov x13,x11
009aef5c	cbz x12,0x009aef68
009aef60	str x11,[x12, #0x18]
009aef64	ldr x13,[x10, #0x18]
009aef68	cbz x13,0x009aef70
009aef6c	str x12,[x13, #0x10]
009aef70	str x10,[x9, #0x18]
009aef74	stp x9,xzr,[x10, #0x10]
009aef78	mov x9,x10
009aef7c	cmp x10,x27
009aef80	b.eq 0x009aef8c
009aef84	mov x10,x11
009aef88	cbnz x11,0x009aef28
009aef8c	mov x27,x9
009aef90	stp x8,x9,[sp, #0x20]
009aef94	cbnz x9,0x009aeff4
009aef98	b 0x009af060
009aef9c	bl 0x00c342a0
009aefa0	adrp x0,0x2af000
009aefa4	adrp x2,0x2b3000
009aefa8	add x0,x0,#0x931
009aefac	add x2,x2,#0xc79
009aefb0	mov w1,#0x5cd
009aefb4	bl 0x00c342b0
009aefb8	mov w1,#0x100
009aefbc	mov w0,#0x14
009aefc0	movk w1,#0xc, LSL #16
009aefc4	mov x2,xzr
009aefc8	bl 0x00c342c0
009aefcc	b 0x009af4bc
009aefd0	adrp x1,0x2af000
009aefd4	add x1,x1,#0x931
009aefd8	mov w2,#0x610
009aefdc	mov x0,x27
009aefe0	b 0x009af4b8
009aefe4	mov x9,x27
009aefe8	mov x8,x10
009aefec	stp x8,x9,[sp, #0x20]
009aeff0	cbz x9,0x009af060
009aeff4	cbz x8,0x009af060
009aeff8	mov x10,x8
009aeffc	ldr x11,[x10]
009af000	ldrb w12,[x11, #0x28]
009af004	ldr x11,[x10, #0x18]
009af008	tbz w12,#0x6,0x009af04c
009af00c	ldr w12,[x10, #0x8]
009af010	cbz w12,0x009af04c
009af014	cmp x10,x9
009af018	b.eq 0x009af04c
009af01c	ldr x12,[x10, #0x10]
009af020	cmp x10,x8
009af024	csel x8,x11,x8,eq
009af028	mov x13,x11
009af02c	cbz x12,0x009af038
009af030	str x11,[x12, #0x18]
009af034	ldr x13,[x10, #0x18]
009af038	cbz x13,0x009af040
009af03c	str x12,[x13, #0x10]
009af040	str x10,[x9, #0x18]
009af044	stp x9,xzr,[x10, #0x10]
009af048	mov x9,x10
009af04c	cmp x10,x27
009af050	b.eq 0x009af05c
009af054	mov x10,x11
009af058	cbnz x11,0x009aeffc
009af05c	mov x27,x9
009af060	mov x10,x8
009af064	stp x8,x9,[sp, #0x20]
009af068	cbz x9,0x009af0dc
009af06c	cbz x8,0x009af0dc
009af070	ldr x11,[x10]
009af074	ldrb w12,[x11, #0x1c]
009af078	ldr x11,[x10, #0x18]
009af07c	tst w12,#0x6
009af080	b.eq 0x009af0c4
009af084	ldr w12,[x10, #0x8]
009af088	cbz w12,0x009af0c4
009af08c	cmp x10,x9
009af090	b.eq 0x009af0c4
009af094	ldr x12,[x10, #0x10]
009af098	cmp x10,x8
009af09c	csel x8,x11,x8,eq
009af0a0	mov x13,x11
009af0a4	cbz x12,0x009af0b0
009af0a8	str x11,[x12, #0x18]
009af0ac	ldr x13,[x10, #0x18]
009af0b0	cbz x13,0x009af0b8
009af0b4	str x12,[x13, #0x10]
009af0b8	str x10,[x9, #0x18]
009af0bc	stp x9,xzr,[x10, #0x10]
009af0c0	mov x9,x10
009af0c4	cmp x10,x27
009af0c8	b.eq 0x009af0d4
009af0cc	mov x10,x11
009af0d0	cbnz x11,0x009af070
009af0d4	mov x27,x9
009af0d8	mov x10,x8
009af0dc	stp x8,x9,[sp, #0x20]
009af0e0	cbz x9,0x009af15c
009af0e4	cbz x8,0x009af15c
009af0e8	ldr x12,[x10]
009af0ec	ldr x11,[x10, #0x18]
009af0f0	ldrb w13,[x12, #0x1c]
009af0f4	tst w13,#0x6
009af0f8	b.eq 0x009af144
009af0fc	ldrb w12,[x12, #0x28]
009af100	tbz w12,#0x6,0x009af144
009af104	ldr w12,[x10, #0x8]
009af108	cbz w12,0x009af144
009af10c	cmp x10,x9
009af110	b.eq 0x009af144
009af114	ldr x12,[x10, #0x10]
009af118	cmp x10,x8
009af11c	csel x8,x11,x8,eq
009af120	mov x13,x11
009af124	cbz x12,0x009af130
009af128	str x11,[x12, #0x18]
009af12c	ldr x13,[x10, #0x18]
009af130	cbz x13,0x009af138
009af134	str x12,[x13, #0x10]
009af138	str x10,[x9, #0x18]
009af13c	stp x9,xzr,[x10, #0x10]
009af140	mov x9,x10
009af144	cmp x10,x27
009af148	b.eq 0x009af154
009af14c	mov x10,x11
009af150	cbnz x11,0x009af0e8
009af154	mov x27,x9
009af158	mov x10,x8
009af15c	stp x8,x9,[sp, #0x20]
009af160	cbz x9,0x009af1c4
009af164	cbz x8,0x009af1c4
009af168	ldr w12,[x10, #0x8]
009af16c	ldr x11,[x10, #0x18]
009af170	cbz w12,0x009af1b0
009af174	cmp x10,x9
009af178	b.eq 0x009af1ac
009af17c	ldr x12,[x10, #0x10]
009af180	cmp x10,x8
009af184	csel x8,x11,x8,eq
009af188	mov x13,x11
009af18c	cbz x12,0x009af198
009af190	str x11,[x12, #0x18]
009af194	ldr x13,[x10, #0x18]
009af198	cbz x13,0x009af1a0
009af19c	str x12,[x13, #0x10]
009af1a0	str x10,[x9, #0x18]
009af1a4	stp x9,xzr,[x10, #0x10]
009af1a8	mov x9,x10
009af1ac	str wzr,[x10, #0x8]
009af1b0	cmp x10,x27
009af1b4	b.eq 0x009af1c0
009af1b8	mov x10,x11
009af1bc	cbnz x11,0x009af168
009af1c0	mov x27,x9
009af1c4	stp x8,x9,[sp, #0x20]
009af1c8	add w8,w26,#0x50
009af1cc	adrp x1,0x2af000
009af1d0	sbfiz x0,x8,#0x3,#0x20
009af1d4	add x1,x1,#0x931
009af1d8	mov w2,#0x63b
009af1dc	bl 0x00c32320
009af1e0	mov x26,x0
009af1e4	cbz x0,0x009af204
009af1e8	cbz x27,0x009af24c
009af1ec	mov x8,x26
009af1f0	ldr x9,[x27]
009af1f4	str x9,[x8], #0x8
009af1f8	ldr x27,[x27, #0x10]
009af1fc	cbnz x27,0x009af1f0
009af200	b 0x009af250
009af204	adrp x19,0x2af000
009af208	add x19,x19,#0x931
009af20c	mov w2,#0x63d
009af210	mov x0,x23
009af214	mov x1,x19
009af218	bl 0x00c32310
009af21c	bl 0x00c342a0
009af220	adrp x2,0x2b3000
009af224	add x2,x2,#0xc79
009af228	mov w1,#0x63e
009af22c	mov x0,x19
009af230	bl 0x00c342b0
009af234	mov w1,#0x100
009af238	mov w0,#0x14
009af23c	movk w1,#0xc, LSL #16
009af240	mov x2,xzr
009af244	bl 0x00c342c0
009af248	b 0x009af4c0
009af24c	mov x8,x26
009af250	ldp w10,w9,[sp, #0x18]
009af254	ldr w12,[sp, #0x14]
009af258	adrp x13,0xc53000
009af25c	mvn w11,w28
009af260	mvn w9,w9
009af264	mvn w10,w10
009af268	mvn w12,w12
009af26c	add x13,x13,#0xc80
009af270	mov w14,#0x4f
009af274	ldp w18,w17,[x13, #0x1c]
009af278	ldp w16,w15,[x13, #0x24]
009af27c	cbz w18,0x009af288
009af280	and w18,w18,w9
009af284	cbz w18,0x009af2b0
009af288	cbz w17,0x009af294
009af28c	and w17,w17,w10
009af290	cbz w17,0x009af2b0
009af294	cbz w16,0x009af2a0
009af298	and w16,w16,w11
009af29c	cbz w16,0x009af2b0
009af2a0	cbz w15,0x009af2ac
009af2a4	and w15,w15,w12
009af2a8	cbz w15,0x009af2b0
009af2ac	str x13,[x8], #0x8
009af2b0	subs x14,x14,#0x1
009af2b4	add x13,x13,#0x50
009af2b8	b.ne 0x009af274
009af2bc	adrp x1,0x2d1000
009af2c0	add x1,x1,#0x31e
009af2c4	orr w2,wzr,#0x7
009af2c8	mov x0,x25
009af2cc	str xzr,[x8]
009af2d0	bl 0x00c31bb0
009af2d4	cbnz w0,0x009af304
009af2d8	adrp x0,0x2b1000
009af2dc	add x0,x0,#0xd1f
009af2e0	add x1,sp,#0x28
009af2e4	add x2,sp,#0x20
009af2e8	mov x3,x26
009af2ec	mov x4,x24
009af2f0	bl 0x009affdc
009af2f4	ldrb w8,[x25, #0x7]!
009af2f8	cmp w8,#0x3a
009af2fc	cinc x25,x25,eq
009af300	cbz w0,0x009af494
009af304	ldrb w8,[x25]
009af308	cbz w8,0x009af344
009af30c	add x1,sp,#0x28
009af310	add x2,sp,#0x20
009af314	mov x0,x25
009af318	mov x3,x26
009af31c	mov x4,x24
009af320	bl 0x009affdc
009af324	adrp x1,0x2af000
009af328	mov w24,w0
009af32c	add x1,x1,#0x931
009af330	mov w2,#0x656
009af334	mov x0,x26
009af338	bl 0x00c32310
009af33c	cbnz w24,0x009af358
009af340	b 0x009af4a8
009af344	adrp x1,0x2af000
009af348	add x1,x1,#0x931
009af34c	mov w2,#0x656
009af350	mov x0,x26
009af354	bl 0x00c32310
009af358	bl 0x00c34780
009af35c	mov x26,x0
009af360	cbz x0,0x009af47c
009af364	mov x0,x21
009af368	bl 0x00c325e0
009af36c	cmp w0,#0x1
009af370	b.lt 0x009af3f8
009af374	adrp x19,0x74b000
009af378	mov w24,wzr
009af37c	add x19,x19,#0xf1c
009af380	mov x0,x21
009af384	mov w1,w24
009af388	bl 0x00c32610
009af38c	ldr w8,[x0, #0x24]
009af390	tst w8,w28
009af394	b.ne 0x009af3b4
009af398	ldrb w8,[x0, #0x40]
009af39c	ldr w9,[x22, #0x644]
009af3a0	mov x1,x0
009af3a4	lsl x8,x8,#0x3
009af3a8	ldr w8,[x19, x8#0x0]
009af3ac	tst w9,w8
009af3b0	b.eq 0x009af3dc
009af3b4	mov x0,x21
009af3b8	mov w1,w24
009af3bc	bl 0x00c35320
009af3c0	sub w24,w24,#0x1
009af3c4	mov x0,x21
009af3c8	add w24,w24,#0x1
009af3cc	bl 0x00c325e0
009af3d0	cmp w24,w0
009af3d4	b.lt 0x009af380
009af3d8	b 0x009af3f8
009af3dc	mov x0,x26
009af3e0	bl 0x00c347a0
009af3e4	cbnz w0,0x009af3c4
009af3e8	adrp x1,0x2af000
009af3ec	add x1,x1,#0x931
009af3f0	mov w2,#0x675
009af3f4	b 0x009afb40
009af3f8	ldr x19,[sp, #0x28]
009af3fc	cbz x19,0x009af420
009af400	ldr w8,[x19, #0x8]
009af404	cbz w8,0x009af418
009af408	ldr x1,[x19]
009af40c	mov x0,x26
009af410	bl 0x00c347a0
009af414	cbz w0,0x009afb34
009af418	ldr x19,[x19, #0x10]
009af41c	cbnz x19,0x009af400
009af420	adrp x1,0x2af000
009af424	add x1,x1,#0x931
009af428	mov w2,#0x68e
009af42c	mov x0,x23
009af430	bl 0x00c32310
009af434	mov x0,x26
009af438	bl 0x00c35330
009af43c	cbz x0,0x009afb48
009af440	mov x21,x0
009af444	ldr x0,[x20]
009af448	bl 0x00c34770
009af44c	str x21,[x20]
009af450	adrp x1,0xcb5000
009af454	ldr x1,[x1, #0x180]
009af458	mov x0,x21
009af45c	bl 0x00c34df0
009af460	ldr x0,[x20]
009af464	bl 0x00c35350
009af468	ldr x19,[sp]
009af46c	ldr x0,[x19]
009af470	bl 0x00c34770
009af474	str x26,[x19]
009af478	b 0x009af4c0
009af47c	adrp x1,0x2af000
009af480	add x1,x1,#0x931
009af484	mov w2,#0x662
009af488	mov x0,x23
009af48c	bl 0x00c32310
009af490	b 0x009af4c0
009af494	adrp x1,0x2af000
009af498	add x1,x1,#0x931
009af49c	mov w2,#0x656
009af4a0	mov x0,x26
009af4a4	bl 0x00c32310
009af4a8	adrp x1,0x2af000
009af4ac	add x1,x1,#0x931
009af4b0	mov w2,#0x659
009af4b4	mov x0,x23
009af4b8	bl 0x00c32310
009af4bc	mov x26,xzr
009af4c0	mov x0,x26
009af4c4	ldp x29,x30,[sp, #0x80]
009af4c8	ldp x20,x19,[sp, #0x70]
009af4cc	ldp x22,x21,[sp, #0x60]
009af4d0	ldp x24,x23,[sp, #0x50]
009af4d4	ldp x26,x25,[sp, #0x40]
009af4d8	ldp x28,x27,[sp, #0x30]
009af4dc	add sp,sp,#0x90
009af4e0	ret
009af4e4	mvn w11,w8
009af4e8	and w11,w11,#0x1
009af4ec	sub x12,x10,x11
009af4f0	add x10,x12,#0x1
009af4f4	add x13,x27,#0x60
009af4f8	sub x14,x13,#0x60
009af4fc	sub x15,x13,#0x40
009af500	sub x16,x13,#0x20
009af504	subs x12,x12,#0x2
009af508	stp x16,x14,[x13, #-0x30]
009af50c	stp x13,x15,[x13, #-0x10]
009af510	add x13,x13,#0x40
009af514	b.ne 0x009af4f8
009af518	cbz w11,0x009af53c
009af51c	add x11,x27,x10, LSL #0x5
009af520	add x11,x11,#0x20
009af524	sub x9,x9,x10
009af528	sub x10,x11,#0x40
009af52c	subs x9,x9,#0x1
009af530	stp x11,x10,[x11, #-0x10]
009af534	add x11,x11,#0x20
009af538	b.ne 0x009af528
009af53c	sub w10,w19,#0x2
009af540	sxtw x9,w8
009af544	sxtw x8,w10
009af548	add x8,x27,x8, LSL #0x5
009af54c	add x10,x27,x9, LSL #0x5
009af550	str x8,[x10, #0x18]
009af554	adds x10,x27,x9, LSL #0x5
009af558	str xzr,[x10, #0x10]
009af55c	stp x10,x27,[sp, #0x20]
009af560	b.eq 0x009af670
009af564	mov w11,#0x1
009af568	mov x12,x27
009af56c	mov x9,x10
009af570	mov x8,x27
009af574	ldr x14,[x12]
009af578	ldr x13,[x12, #0x10]
009af57c	ldrb w15,[x14, #0x1c]
009af580	tbz w15,#0x2,0x009af5d0
009af584	ldrb w14,[x14, #0x20]
009af588	tbz w14,#0x3,0x009af5d0
009af58c	ldr w14,[x12, #0x8]
009af590	cbnz w14,0x009af5d0
009af594	cmp x12,x9
009af598	b.eq 0x009af5cc
009af59c	ldr x14,[x12, #0x18]
009af5a0	cmp x12,x8
009af5a4	csel x8,x13,x8,eq
009af5a8	mov x15,x13
009af5ac	cbz x14,0x009af5b8
009af5b0	str x13,[x14, #0x10]
009af5b4	ldr x15,[x12, #0x10]
009af5b8	cbz x15,0x009af5c0
009af5bc	str x14,[x15, #0x18]
009af5c0	str x12,[x9, #0x10]
009af5c4	stp xzr,x9,[x12, #0x10]
009af5c8	mov x9,x12
009af5cc	str w11,[x12, #0x8]
009af5d0	cmp x12,x10
009af5d4	b.eq 0x009af5e0
009af5d8	mov x12,x13
009af5dc	cbnz x13,0x009af574
009af5e0	mov x11,x8
009af5e4	stp x9,x8,[sp, #0x20]
009af5e8	cbz x8,0x009af684
009af5ec	cbz x9,0x009af684
009af5f0	mov w12,#0x1
009af5f4	mov x10,x9
009af5f8	ldr x13,[x11]
009af5fc	ldrb w14,[x13, #0x1c]
009af600	ldr x13,[x11, #0x10]
009af604	tbz w14,#0x2,0x009af64c
009af608	ldr w14,[x11, #0x8]
009af60c	cbnz w14,0x009af64c
009af610	cmp x11,x10
009af614	b.eq 0x009af648
009af618	ldr x14,[x11, #0x18]
009af61c	cmp x11,x8
009af620	csel x8,x13,x8,eq
009af624	mov x15,x13
009af628	cbz x14,0x009af634
009af62c	str x13,[x14, #0x10]
009af630	ldr x15,[x11, #0x10]
009af634	cbz x15,0x009af63c
009af638	str x14,[x15, #0x18]
009af63c	str x11,[x10, #0x10]
009af640	stp xzr,x10,[x11, #0x10]
009af644	mov x10,x11
009af648	str w12,[x11, #0x8]
009af64c	cmp x11,x9
009af650	b.eq 0x009af65c
009af654	mov x11,x13
009af658	cbnz x13,0x009af5f8
009af65c	mov x11,x8
009af660	mov x9,x10
009af664	stp x10,x8,[sp, #0x20]
009af668	cbnz x8,0x009af690
009af66c	b 0x009af700
009af670	mov x11,x27
009af674	mov x8,x27
009af678	mov x9,x10
009af67c	stp x9,x8,[sp, #0x20]
009af680	cbnz x8,0x009af5ec
009af684	mov x10,x9
009af688	stp x10,x8,[sp, #0x20]
009af68c	cbz x8,0x009af700
009af690	cbz x10,0x009af700
009af694	ldr x12,[x9]
009af698	ldrb w13,[x12, #0x1c]
009af69c	ldr x12,[x9, #0x18]
009af6a0	tbz w13,#0x2,0x009af6e8
009af6a4	ldr w13,[x9, #0x8]
009af6a8	cbz w13,0x009af6e8
009af6ac	cmp x9,x8
009af6b0	b.eq 0x009af6e4
009af6b4	ldr x13,[x9, #0x10]
009af6b8	cmp x9,x10
009af6bc	csel x10,x12,x10,eq
009af6c0	mov x14,x12
009af6c4	cbz x13,0x009af6d0
009af6c8	str x12,[x13, #0x18]
009af6cc	ldr x14,[x9, #0x18]
009af6d0	cbz x14,0x009af6d8
009af6d4	str x13,[x14, #0x10]
009af6d8	str x9,[x8, #0x18]
009af6dc	stp x8,xzr,[x9, #0x10]
009af6e0	mov x8,x9
009af6e4	str wzr,[x9, #0x8]
009af6e8	cmp x9,x11
009af6ec	b.eq 0x009af6f8
009af6f0	mov x9,x12
009af6f4	cbnz x12,0x009af694
009af6f8	mov x11,x8
009af6fc	mov x9,x10
009af700	stp x10,x8,[sp, #0x20]
009af704	cbz x8,0x009af780
009af708	cbz x10,0x009af780
009af70c	mov w12,#0x1
009af710	ldr x13,[x11]
009af714	ldrb w14,[x13, #0x25]
009af718	ldr x13,[x11, #0x10]
009af71c	tst w14,#0x30
009af720	b.eq 0x009af768
009af724	ldr w14,[x11, #0x8]
009af728	cbnz w14,0x009af768
009af72c	cmp x11,x10
009af730	b.eq 0x009af764
009af734	ldr x14,[x11, #0x18]
009af738	cmp x11,x8
009af73c	csel x8,x13,x8,eq
009af740	mov x15,x13
009af744	cbz x14,0x009af750
009af748	str x13,[x14, #0x10]
009af74c	ldr x15,[x11, #0x10]
009af750	cbz x15,0x009af758
009af754	str x14,[x15, #0x18]
009af758	str x11,[x10, #0x10]
009af75c	stp xzr,x10,[x11, #0x10]
009af760	mov x10,x11
009af764	str w12,[x11, #0x8]
009af768	cmp x11,x9
009af76c	b.eq 0x009af778
009af770	mov x11,x13
009af774	cbnz x13,0x009af710
009af778	mov x11,x8
009af77c	mov x9,x10
009af780	stp x10,x8,[sp, #0x20]
009af784	cbz x8,0x009af7fc
009af788	cbz x10,0x009af7fc
009af78c	mov w12,#0x1
009af790	ldr x13,[x11]
009af794	ldrb w14,[x13, #0x26]
009af798	ldr x13,[x11, #0x10]
009af79c	tbz w14,#0x3,0x009af7e4
009af7a0	ldr w14,[x11, #0x8]
009af7a4	cbnz w14,0x009af7e4
009af7a8	cmp x11,x10
009af7ac	b.eq 0x009af7e0
009af7b0	ldr x14,[x11, #0x18]
009af7b4	cmp x11,x8
009af7b8	csel x8,x13,x8,eq
009af7bc	mov x15,x13
009af7c0	cbz x14,0x009af7cc
009af7c4	str x13,[x14, #0x10]
009af7c8	ldr x15,[x11, #0x10]
009af7cc	cbz x15,0x009af7d4
009af7d0	str x14,[x15, #0x18]
009af7d4	str x11,[x10, #0x10]
009af7d8	stp xzr,x10,[x11, #0x10]
009af7dc	mov x10,x11
009af7e0	str w12,[x11, #0x8]
009af7e4	cmp x11,x9
009af7e8	b.eq 0x009af7f4
009af7ec	mov x11,x13
009af7f0	cbnz x13,0x009af790
009af7f4	mov x11,x8
009af7f8	mov x9,x10
009af7fc	stp x10,x8,[sp, #0x20]
009af800	cbz x8,0x009af884
009af804	cbz x10,0x009af884
009af808	mov w12,#0xc0c0
009af80c	movk w12,#0x3, LSL #16
009af810	mov w13,#0x1
009af814	ldr x14,[x11]
009af818	ldr w15,[x14, #0x24]
009af81c	ldr x14,[x11, #0x10]
009af820	tst w15,w12
009af824	b.eq 0x009af86c
009af828	ldr w15,[x11, #0x8]
009af82c	cbnz w15,0x009af86c
009af830	cmp x11,x10
009af834	b.eq 0x009af868
009af838	ldr x15,[x11, #0x18]
009af83c	cmp x11,x8
009af840	csel x8,x14,x8,eq
009af844	mov x16,x14
009af848	cbz x15,0x009af854
009af84c	str x14,[x15, #0x10]
009af850	ldr x16,[x11, #0x10]
009af854	cbz x16,0x009af85c
009af858	str x15,[x16, #0x18]
009af85c	str x11,[x10, #0x10]
009af860	stp xzr,x10,[x11, #0x10]
009af864	mov x10,x11
009af868	str w13,[x11, #0x8]
009af86c	cmp x11,x9
009af870	b.eq 0x009af87c
009af874	mov x11,x14
009af878	cbnz x14,0x009af814
009af87c	mov x11,x8
009af880	mov x9,x10
009af884	stp x10,x8,[sp, #0x20]
009af888	cbz x8,0x009af8f4
009af88c	cbz x10,0x009af8f4
009af890	mov w12,#0x1
009af894	ldr w14,[x11, #0x8]
009af898	ldr x13,[x11, #0x10]
009af89c	cbnz w14,0x009af8dc
009af8a0	cmp x11,x10
009af8a4	b.eq 0x009af8d8
009af8a8	ldr x14,[x11, #0x18]
009af8ac	cmp x11,x8
009af8b0	csel x8,x13,x8,eq
009af8b4	mov x15,x13
009af8b8	cbz x14,0x009af8c4
009af8bc	str x13,[x14, #0x10]
009af8c0	ldr x15,[x11, #0x10]
009af8c4	cbz x15,0x009af8cc
009af8c8	str x14,[x15, #0x18]
009af8cc	str x11,[x10, #0x10]
009af8d0	stp xzr,x10,[x11, #0x10]
009af8d4	mov x10,x11
009af8d8	str w12,[x11, #0x8]
009af8dc	cmp x11,x9
009af8e0	b.eq 0x009af8ec
009af8e4	mov x11,x13
009af8e8	cbnz x13,0x009af894
009af8ec	mov x11,x8
009af8f0	mov x9,x10
009af8f4	stp x10,x8,[sp, #0x20]
009af8f8	cbz x8,0x009af968
009af8fc	cbz x10,0x009af968
009af900	ldr x12,[x11]
009af904	ldrb w13,[x12, #0x28]
009af908	ldr x12,[x11, #0x10]
009af90c	tbz w13,#0x0,0x009af950
009af910	ldr w13,[x11, #0x8]
009af914	cbz w13,0x009af950
009af918	cmp x11,x10
009af91c	b.eq 0x009af950
009af920	ldr x13,[x11, #0x18]
009af924	cmp x11,x8
009af928	csel x8,x12,x8,eq
009af92c	mov x14,x12
009af930	cbz x13,0x009af93c
009af934	str x12,[x13, #0x10]
009af938	ldr x14,[x11, #0x10]
009af93c	cbz x14,0x009af944
009af940	str x13,[x14, #0x18]
009af944	str x11,[x10, #0x10]
009af948	stp xzr,x10,[x11, #0x10]
009af94c	mov x10,x11
009af950	cmp x11,x9
009af954	b.eq 0x009af960
009af958	mov x11,x12
009af95c	cbnz x12,0x009af900
009af960	mov x11,x8
009af964	mov x9,x10
009af968	stp x10,x8,[sp, #0x20]
009af96c	cbz x8,0x009af9dc
009af970	cbz x10,0x009af9dc
009af974	ldr x12,[x11]
009af978	ldrb w13,[x12, #0x20]
009af97c	ldr x12,[x11, #0x10]
009af980	tbz w13,#0x2,0x009af9c4
009af984	ldr w13,[x11, #0x8]
009af988	cbz w13,0x009af9c4
009af98c	cmp x11,x10
009af990	b.eq 0x009af9c4
009af994	ldr x13,[x11, #0x18]
009af998	cmp x11,x8
009af99c	csel x8,x12,x8,eq
009af9a0	mov x14,x12
009af9a4	cbz x13,0x009af9b0
009af9a8	str x12,[x13, #0x10]
009af9ac	ldr x14,[x11, #0x10]
009af9b0	cbz x14,0x009af9b8
009af9b4	str x13,[x14, #0x18]
009af9b8	str x11,[x10, #0x10]
009af9bc	stp xzr,x10,[x11, #0x10]
009af9c0	mov x10,x11
009af9c4	cmp x11,x9
009af9c8	b.eq 0x009af9d4
009af9cc	mov x11,x12
009af9d0	cbnz x12,0x009af974
009af9d4	mov x11,x8
009af9d8	mov x9,x10
009af9dc	stp x10,x8,[sp, #0x20]
009af9e0	cbz x8,0x009afa50
009af9e4	cbz x10,0x009afa50
009af9e8	ldr x12,[x11]
009af9ec	ldrb w13,[x12, #0x1c]
009af9f0	ldr x12,[x11, #0x10]
009af9f4	tbz w13,#0x0,0x009afa38
009af9f8	ldr w13,[x11, #0x8]
009af9fc	cbz w13,0x009afa38
009afa00	cmp x11,x10
009afa04	b.eq 0x009afa38
009afa08	ldr x13,[x11, #0x18]
009afa0c	cmp x11,x8
009afa10	csel x8,x12,x8,eq
009afa14	mov x14,x12
009afa18	cbz x13,0x009afa24
009afa1c	str x12,[x13, #0x10]
009afa20	ldr x14,[x11, #0x10]
009afa24	cbz x14,0x009afa2c
009afa28	str x13,[x14, #0x18]
009afa2c	str x11,[x10, #0x10]
009afa30	stp xzr,x10,[x11, #0x10]
009afa34	mov x10,x11
009afa38	cmp x11,x9
009afa3c	b.eq 0x009afa48
009afa40	mov x11,x12
009afa44	cbnz x12,0x009af9e8
009afa48	mov x11,x8
009afa4c	mov x9,x10
009afa50	stp x10,x8,[sp, #0x20]
009afa54	cbz x8,0x009afac4
009afa58	cbz x10,0x009afac4
009afa5c	ldr x12,[x11]
009afa60	ldrb w13,[x12, #0x1c]
009afa64	ldr x12,[x11, #0x10]
009afa68	tbz w13,#0x3,0x009afaac
009afa6c	ldr w13,[x11, #0x8]
009afa70	cbz w13,0x009afaac
009afa74	cmp x11,x10
009afa78	b.eq 0x009afaac
009afa7c	ldr x13,[x11, #0x18]
009afa80	cmp x11,x8
009afa84	csel x8,x12,x8,eq
009afa88	mov x14,x12
009afa8c	cbz x13,0x009afa98
009afa90	str x12,[x13, #0x10]
009afa94	ldr x14,[x11, #0x10]
009afa98	cbz x14,0x009afaa0
009afa9c	str x13,[x14, #0x18]
009afaa0	str x11,[x10, #0x10]
009afaa4	stp xzr,x10,[x11, #0x10]
009afaa8	mov x10,x11
009afaac	cmp x11,x9
009afab0	b.eq 0x009afabc
009afab4	mov x11,x12
009afab8	cbnz x12,0x009afa5c
009afabc	mov x11,x8
009afac0	mov x9,x10
009afac4	stp x10,x8,[sp, #0x20]
009afac8	cbz x8,0x009aeefc
009afacc	cbz x10,0x009aeefc
009afad0	ldr x12,[x11]
009afad4	ldrb w13,[x12, #0x24]
009afad8	ldr x12,[x11, #0x10]
009afadc	tbz w13,#0x2,0x009afb20
009afae0	ldr w13,[x11, #0x8]
009afae4	cbz w13,0x009afb20
009afae8	cmp x11,x10
009afaec	b.eq 0x009afb20
009afaf0	ldr x13,[x11, #0x18]
009afaf4	cmp x11,x8
009afaf8	csel x8,x12,x8,eq
009afafc	mov x14,x12
009afb00	cbz x13,0x009afb0c
009afb04	str x12,[x13, #0x10]
009afb08	ldr x14,[x11, #0x10]
009afb0c	cbz x14,0x009afb14
009afb10	str x13,[x14, #0x18]
009afb14	str x11,[x10, #0x10]
009afb18	stp xzr,x10,[x11, #0x10]
009afb1c	mov x10,x11
009afb20	cmp x11,x9
009afb24	b.eq 0x009aeefc
009afb28	mov x11,x12
009afb2c	cbnz x12,0x009afad0
009afb30	b 0x009aeefc
009afb34	adrp x1,0x2af000
009afb38	add x1,x1,#0x931
009afb3c	mov w2,#0x685
009afb40	mov x0,x23
009afb44	bl 0x00c32310
009afb48	mov x0,x26
009afb4c	bl 0x00c34770
009afb50	b 0x009af4bc
