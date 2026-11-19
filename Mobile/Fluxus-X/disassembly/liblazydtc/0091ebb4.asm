; FUN_0091ebb4 @ 0091ebb4
0091ebb4	sub sp,sp,#0xa0
0091ebb8	stp x28,x27,[sp, #0x40]
0091ebbc	stp x26,x25,[sp, #0x50]
0091ebc0	stp x24,x23,[sp, #0x60]
0091ebc4	stp x22,x21,[sp, #0x70]
0091ebc8	stp x20,x19,[sp, #0x80]
0091ebcc	stp x29,x30,[sp, #0x90]
0091ebd0	add x29,sp,#0x90
0091ebd4	adrp x12,0xcb4000
0091ebd8	mrs x11,tpidr_el0
0091ebdc	ldr x12,[x12, #0xe38]
0091ebe0	adrp x9,0x2b6000
0091ebe4	adrp x10,0x2d0000
0091ebe8	cmp w2,#0x0
0091ebec	add x9,x9,#0xeee
0091ebf0	add x10,x10,#0xe72
0091ebf4	str x11,[sp, #0x8]
0091ebf8	csel x9,x10,x9,ne
0091ebfc	ldr x11,[x11, #0x28]
0091ec00	str x9,[sp, #0x10]
0091ec04	ldp x22,x9,[x12]
0091ec08	orr w8,wzr,#0x3
0091ec0c	mov x28,#0x20000000200
0091ec10	mov w20,w2
0091ec14	mov x25,x1
0091ec18	mov x19,x0
0091ec1c	add x21,x0,#0xa82
0091ec20	mov w26,#0x1
0091ec24	cset w13,eq
0091ec28	csinc w8,w8,wzr,eq
0091ec2c	movk x28,#0x1001, LSL #32
0091ec30	str x9,[sp, #0x20]
0091ec34	stp w13,w8,[sp, #0x28]
0091ec38	str x11,[sp, #0x38]
0091ec3c	str x22,[sp, #0x18]
0091ec40	b 0x0091ec48
0091ec44	add x25,x25,#0x1
0091ec48	ldrb w8,[x25]
0091ec4c	cmp w8,#0x2c
0091ec50	b.hi 0x0091ec60
0091ec54	lsl x9,x26,x8
0091ec58	tst x9,x28
0091ec5c	b.ne 0x0091ec44
0091ec60	mov x23,xzr
0091ec64	sub x9,x26,x25
0091ec68	mov x27,x25
0091ec6c	b 0x0091ec74
0091ec70	ldrb w8,[x27, #0x1]!
0091ec74	and w10,w8,#0xff
0091ec78	cmp w10,#0x1f
0091ec7c	b.gt 0x0091ec90
0091ec80	cmp w10,#0x9
0091ec84	b.eq 0x0091ec70
0091ec88	cbnz w10,0x0091eca0
0091ec8c	b 0x0091ecb8
0091ec90	cmp w10,#0x20
0091ec94	b.eq 0x0091ec70
0091ec98	cmp w10,#0x2c
0091ec9c	b.eq 0x0091ecb8
0091eca0	sub w8,w8,#0xa
0091eca4	and w8,w8,#0xff
0091eca8	cmp w8,#0x4
0091ecac	b.cc 0x0091ec70
0091ecb0	add x23,x9,x27
0091ecb4	b 0x0091ec70
0091ecb8	cbz x23,0x0091ef6c
0091ecbc	cbz x19,0x0091ed0c
0091ecc0	ldrb w8,[x21, #0x3]
0091ecc4	tbz w8,#0x4,0x0091ed0c
0091ecc8	ldr x8,[x19, #0x12a0]
0091eccc	cbz x8,0x0091ef94
0091ecd0	ldr w8,[x8, #0x8]
0091ecd4	cmp w8,#0x1
0091ecd8	b.lt 0x0091ed0c
0091ecdc	adrp x8,0xcc4000
0091ece0	add x8,x8,#0x6a8
0091ece4	ldr w8,[x8, #0x8]
0091ece8	cmp w8,#0x0
0091ecec	b.le 0x0091ed0c
0091ecf0	ldr x2,[sp, #0x10]
0091ecf4	adrp x1,0x2bb000
0091ecf8	mov x0,x19
0091ecfc	add x1,x1,#0xaa
0091ed00	mov w3,w23
0091ed04	mov x4,x25
0091ed08	bl 0x009050ec
0091ed0c	cbz w20,0x0091ed50
0091ed10	cmp x23,#0x7
0091ed14	mov w24,wzr
0091ed18	b.ne 0x0091ed38
0091ed1c	adrp x1,0x2ad000
0091ed20	orr w2,wzr,#0x7
0091ed24	mov x0,x25
0091ed28	add x1,x1,#0xfb
0091ed2c	bl 0x00c31b50
0091ed30	cmp w0,#0x0
0091ed34	cset w24,ne
0091ed38	ldr x8,[x21]
0091ed3c	cbz w20,0x0091ed5c
0091ed40	ubfx x9,x8,#0x16,#0x1
0091ed44	orr w9,w24,w9
0091ed48	tbnz w9,#0x0,0x0091ed60
0091ed4c	b 0x0091efac
0091ed50	mov w24,wzr
0091ed54	ldr x8,[x21]
0091ed58	cbnz w20,0x0091ed40
0091ed5c	tbnz x8,#0x23,0x0091efac
0091ed60	ldr w1,[sp, #0x2c]
0091ed64	mov x0,x19
0091ed68	bl 0x00935568
0091ed6c	add x8,x0,#0x1
0091ed70	cmp x8,#0x5
0091ed74	b.cs 0x0091efe4
0091ed78	cbz w20,0x0091edc0
0091ed7c	mov x0,x25
0091ed80	mov x1,x22
0091ed84	mov x2,x23
0091ed88	bl 0x00c31b50
0091ed8c	cbz w0,0x0091ed98
0091ed90	ldrb w8,[x22, x23]
0091ed94	cbz w8,0x0091ee8c
0091ed98	ldr x8,[sp, #0x20]
0091ed9c	cbz x8,0x0091edc0
0091eda0	ldr x1,[sp, #0x20]
0091eda4	mov x0,x25
0091eda8	mov x2,x23
0091edac	bl 0x00c31b50
0091edb0	cbz w0,0x0091edc0
0091edb4	ldr x8,[sp, #0x20]
0091edb8	ldrb w8,[x8, x23]
0091edbc	cbz w8,0x0091ee8c
0091edc0	adrp x1,0x2ca000
0091edc4	mov x0,x25
0091edc8	add x1,x1,#0xe27
0091edcc	mov x2,x23
0091edd0	bl 0x00c31b50
0091edd4	cmp x23,#0x8
0091edd8	b.ne 0x0091ede8
0091eddc	adrp x22,0xc4f000
0091ede0	add x22,x22,#0x588
0091ede4	cbnz w0,0x0091ee94
0091ede8	adrp x1,0x2c6000
0091edec	mov x0,x25
0091edf0	add x1,x1,#0xe43
0091edf4	mov x2,x23
0091edf8	bl 0x00c31b50
0091edfc	cmp x23,#0x4
0091ee00	b.ne 0x0091ee10
0091ee04	adrp x22,0xc4f000
0091ee08	add x22,x22,#0x588
0091ee0c	cbnz w0,0x0091ee94
0091ee10	adrp x1,0x2a1000
0091ee14	mov x0,x25
0091ee18	add x1,x1,#0x7fa
0091ee1c	mov x2,x23
0091ee20	bl 0x00c31b50
0091ee24	cmp x23,#0x7
0091ee28	b.ne 0x0091ee38
0091ee2c	adrp x22,0xc4f000
0091ee30	add x22,x22,#0x5b8
0091ee34	cbnz w0,0x0091ee94
0091ee38	adrp x1,0x2af000
0091ee3c	mov x0,x25
0091ee40	add x1,x1,#0x2db
0091ee44	mov x2,x23
0091ee48	bl 0x00c31b50
0091ee4c	cmp x23,#0x4
0091ee50	b.ne 0x0091ee60
0091ee54	adrp x22,0xc4f000
0091ee58	add x22,x22,#0x5e8
0091ee5c	cbnz w0,0x0091ee94
0091ee60	adrp x1,0x2b3000
0091ee64	mov x0,x25
0091ee68	add x1,x1,#0x5e2
0091ee6c	mov x2,x23
0091ee70	bl 0x00c31b50
0091ee74	cmp w0,#0x0
0091ee78	adrp x8,0xc4f000
0091ee7c	ccmp x23,#0x6,#0x0,ne
0091ee80	add x8,x8,#0x5e8
0091ee84	csel x22,x8,xzr,eq
0091ee88	b 0x0091ee94
0091ee8c	adrp x22,0xc4f000
0091ee90	add x22,x22,#0x648
0091ee94	cmp x22,#0x0
0091ee98	cset w8,eq
0091ee9c	eor w9,w24,#0x1
0091eea0	orr w8,w9,w8
0091eea4	tbnz w8,#0x0,0x0091eeb8
0091eea8	mov x0,x19
0091eeac	mov x1,x22
0091eeb0	bl 0x00935644
0091eeb4	cbnz x0,0x0091f010
0091eeb8	ldr w8,[sp, #0x28]
0091eebc	orr w8,w24,w8
0091eec0	tbnz w8,#0x0,0x0091eed8
0091eec4	adrp x1,0x2ad000
0091eec8	mov x0,x19
0091eecc	add x1,x1,#0xfb
0091eed0	bl 0x00935600
0091eed4	cbnz x0,0x0091f04c
0091eed8	adrp x8,0xc4f000
0091eedc	ldr w3,[sp, #0x2c]
0091eee0	cmp x22,#0x0
0091eee4	add x8,x8,#0x558
0091eee8	csel x23,x22,x8,ne
0091eeec	add x0,sp,#0x30
0091eef0	mov x1,x19
0091eef4	mov x2,x23
0091eef8	bl 0x00935470
0091eefc	ldrb w8,[x21, #0x3]
0091ef00	mov w22,w0
0091ef04	tbz w8,#0x4,0x0091ef4c
0091ef08	ldr x8,[x19, #0x12a0]
0091ef0c	cbz x8,0x0091ef7c
0091ef10	ldr w8,[x8, #0x8]
0091ef14	cmp w8,#0x1
0091ef18	b.lt 0x0091ef4c
0091ef1c	adrp x8,0xcc4000
0091ef20	add x8,x8,#0x6a8
0091ef24	ldr w8,[x8, #0x8]
0091ef28	cmp w8,#0x0
0091ef2c	b.le 0x0091ef4c
0091ef30	ldr x3,[x23]
0091ef34	ldr x2,[sp, #0x10]
0091ef38	adrp x1,0x2a9000
0091ef3c	mov x0,x19
0091ef40	add x1,x1,#0x528
0091ef44	mov w4,w22
0091ef48	bl 0x009050ec
0091ef4c	cbnz w22,0x0091f0bc
0091ef50	ldr x1,[sp, #0x30]
0091ef54	mov x0,x19
0091ef58	bl 0x00935594
0091ef5c	mov w22,w0
0091ef60	cbnz w0,0x0091f000
0091ef64	ldrb w8,[x27]
0091ef68	ldr x22,[sp, #0x18]
0091ef6c	tst w8,#0xff
0091ef70	mov x25,x27
0091ef74	b.ne 0x0091ec48
0091ef78	b 0x0091f0b8
0091ef7c	adrp x8,0xcc4000
0091ef80	add x8,x8,#0x6a8
0091ef84	ldr w8,[x8, #0x8]
0091ef88	cmp w8,#0x1
0091ef8c	b.ge 0x0091ef30
0091ef90	b 0x0091ef4c
0091ef94	adrp x8,0xcc4000
0091ef98	add x8,x8,#0x6a8
0091ef9c	ldr w8,[x8, #0x8]
0091efa0	cmp w8,#0x1
0091efa4	b.ge 0x0091ecf0
0091efa8	b 0x0091ed0c
0091efac	mov w22,wzr
0091efb0	tbz w8,#0x1c,0x0091f0bc
0091efb4	ldr x8,[x19, #0x12a0]
0091efb8	cbz x8,0x0091f064
0091efbc	ldr w8,[x8, #0x8]
0091efc0	cmp w8,#0x1
0091efc4	b.lt 0x0091f0b8
0091efc8	adrp x8,0xcc4000
0091efcc	add x8,x8,#0x6a8
0091efd0	mov w22,wzr
0091efd4	ldr w8,[x8, #0x8]
0091efd8	cmp w8,#0x0
0091efdc	b.gt 0x0091f078
0091efe0	b 0x0091f0bc
0091efe4	adrp x1,0x2c6000
0091efe8	add x1,x1,#0xe0d
0091efec	mov w2,#0x5
0091eff0	mov x0,x19
0091eff4	bl 0x00904b80
0091eff8	mov w22,#0x3d
0091effc	b 0x0091f0bc
0091f000	ldr x1,[sp, #0x30]
0091f004	mov x0,x19
0091f008	bl 0x0093551c
0091f00c	b 0x0091f0bc
0091f010	ldrb w8,[x21, #0x3]
0091f014	mov w22,wzr
0091f018	tbz w8,#0x4,0x0091f0bc
0091f01c	ldr x8,[x19, #0x12a0]
0091f020	cbz x8,0x0091f094
0091f024	ldr w8,[x8, #0x8]
0091f028	cmp w8,#0x1
0091f02c	b.lt 0x0091f0b8
0091f030	adrp x8,0xcc4000
0091f034	add x8,x8,#0x6a8
0091f038	mov w22,wzr
0091f03c	ldr w8,[x8, #0x8]
0091f040	cmp w8,#0x0
0091f044	b.gt 0x0091f0a8
0091f048	b 0x0091f0bc
0091f04c	adrp x1,0x2bc000
0091f050	add x1,x1,#0xedb
0091f054	mov x0,x19
0091f058	bl 0x00904b80
0091f05c	mov w22,#0x3d
0091f060	b 0x0091f0bc
0091f064	adrp x8,0xcc4000
0091f068	add x8,x8,#0x6a8
0091f06c	ldr w8,[x8, #0x8]
0091f070	cmp w8,#0x1
0091f074	b.lt 0x0091f0b8
0091f078	adrp x1,0x2b3000
0091f07c	add x1,x1,#0x5bd
0091f080	mov x0,x19
0091f084	mov w2,w23
0091f088	mov x3,x25
0091f08c	bl 0x009050ec
0091f090	b 0x0091f0b8
0091f094	adrp x8,0xcc4000
0091f098	add x8,x8,#0x6a8
0091f09c	ldr w8,[x8, #0x8]
0091f0a0	cmp w8,#0x1
0091f0a4	b.lt 0x0091f0b8
0091f0a8	adrp x1,0x2d7000
0091f0ac	add x1,x1,#0x1d6
0091f0b0	mov x0,x19
0091f0b4	bl 0x009050ec
0091f0b8	mov w22,wzr
0091f0bc	ldr x8,[sp, #0x8]
0091f0c0	ldr x8,[x8, #0x28]
0091f0c4	ldr x9,[sp, #0x38]
0091f0c8	cmp x8,x9
0091f0cc	b.ne 0x0091f0f4
0091f0d0	mov w0,w22
0091f0d4	ldp x29,x30,[sp, #0x90]
0091f0d8	ldp x20,x19,[sp, #0x80]
0091f0dc	ldp x22,x21,[sp, #0x70]
0091f0e0	ldp x24,x23,[sp, #0x60]
0091f0e4	ldp x26,x25,[sp, #0x50]
0091f0e8	ldp x28,x27,[sp, #0x40]
0091f0ec	add sp,sp,#0xa0
0091f0f0	ret
0091f0f4	bl 0x00c2fec0
