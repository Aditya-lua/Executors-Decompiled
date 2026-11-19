; FUN_0090ee24 @ 0090ee24
0090ee24	sub sp,sp,#0x90
0090ee28	str x27,[sp, #0x30]
0090ee2c	stp x26,x25,[sp, #0x40]
0090ee30	stp x24,x23,[sp, #0x50]
0090ee34	stp x22,x21,[sp, #0x60]
0090ee38	stp x20,x19,[sp, #0x70]
0090ee3c	stp x29,x30,[sp, #0x80]
0090ee40	add x29,sp,#0x80
0090ee44	mrs x25,tpidr_el0
0090ee48	ldr x8,[x25, #0x28]
0090ee4c	mov x21,x3
0090ee50	mov w24,w2
0090ee54	mov x19,x0
0090ee58	str x8,[sp, #0x28]
0090ee5c	ldr x20,[x0, #0xda8]
0090ee60	str wzr,[x3]
0090ee64	ldr x8,[x0, #0x20]
0090ee68	mov x23,x1
0090ee6c	ldrb w9,[x8, #0x573]
0090ee70	cmp w9,#0x1
0090ee74	b.eq 0x0090ee9c
0090ee78	mov x0,x19
0090ee7c	bl 0x0091724c
0090ee80	ldr x8,[x19, #0x20]
0090ee84	tbz w0,#0x0,0x0090ee9c
0090ee88	ldrb w9,[x8, #0x573]
0090ee8c	cmp w9,#0x2
0090ee90	mov w9,#0xa
0090ee94	csel w26,w9,wzr,eq
0090ee98	b 0x0090eea0
0090ee9c	mov w26,#0x2
0090eea0	movi v0.2D,#0x0
0090eea4	str wzr,[sp, #0x20]
0090eea8	stp q0,q0,[sp]
0090eeac	ldrb w22,[x8, #0x572]
0090eeb0	bl 0x00941cb8
0090eeb4	stp x0,x1,[x20]
0090eeb8	adrp x8,0xcc4000
0090eebc	add x8,x8,#0x690
0090eec0	mov w0,#0x1
0090eec4	mov w1,#0x88
0090eec8	mov w27,#0x1
0090eecc	ldr x8,[x8]
0090eed0	blr x8
0090eed4	mov x20,x0
0090eed8	str x0,[x19, #0xda0]
0090eedc	cbz x0,0x0090f078
0090eee0	ldrb w8,[x19, #0xdb8]
0090eee4	cmp w22,#0x3
0090eee8	mov x22,x20
0090eeec	str w24,[x19, #0xdb0]
0090eef0	and w8,w8,#0xfe
0090eef4	strb w8,[x19, #0xdb8]
0090eef8	cinc w8,w27,ne
0090eefc	str wzr,[x19, #0xdb4]
0090ef00	str xzr,[x19, #0xd98]
0090ef04	str xzr,[x20]
0090ef08	str xzr,[x22, #0x18]!
0090ef0c	stp xzr,xzr,[x20, #0x20]
0090ef10	stp xzr,xzr,[x20, #0x40]
0090ef14	stp xzr,xzr,[x20, #0x30]
0090ef18	str x20,[x20, #0x80]
0090ef1c	stp w27,w24,[x20, #0x20]
0090ef20	stp wzr,w26,[x20, #0x50]
0090ef24	str w8,[x20, #0x58]
0090ef28	ldr w8,[sp, #0x20]
0090ef2c	mov w0,#0x28
0090ef30	str w8,[x20, #0x7c]
0090ef34	ldr q0,[sp, #0x10]
0090ef38	adrp x8,0xcb4000
0090ef3c	stur q0,[x20, #0x6c]
0090ef40	ldr q0,[sp]
0090ef44	stur q0,[x20, #0x5c]
0090ef48	ldr x8,[x8, #0xde0]
0090ef4c	ldr x8,[x8]
0090ef50	blr x8
0090ef54	str x0,[x22]
0090ef58	cbz x0,0x0090efec
0090ef5c	mov x1,xzr
0090ef60	bl 0x00c31c90
0090ef64	add x24,x20,#0x38
0090ef68	mov x0,x24
0090ef6c	mov w1,wzr
0090ef70	bl 0x0093f910
0090ef74	tbnz w0,#0x1f,0x0090f0c8
0090ef78	str wzr,[x20, #0x40]
0090ef7c	adrp x26,0xcc4000
0090ef80	add x26,x26,#0x688
0090ef84	mov x0,x23
0090ef88	ldr x8,[x26]
0090ef8c	blr x8
0090ef90	str x0,[x20, #0x28]
0090ef94	cbz x0,0x0090eff0
0090ef98	adrp x8,0xcc4000
0090ef9c	add x8,x8,#0x678
0090efa0	add x24,x19,#0xd90
0090efa4	ldr x0,[x24]
0090efa8	ldr x8,[x8]
0090efac	blr x8
0090efb0	ldr x8,[x26]
0090efb4	mov x0,x23
0090efb8	blr x8
0090efbc	str x0,[x24]
0090efc0	cbz x0,0x0090f0dc
0090efc4	nop
0090efc8	adr x0,0x90f100
0090efcc	mov x1,x22
0090efd0	str wzr,[x20, #0x20]
0090efd4	bl 0x0090f970
0090efd8	mov w8,#0x1
0090efdc	str x0,[x20]
0090efe0	cbz x0,0x0090f0e4
0090efe4	str w8,[x21]
0090efe8	b 0x0090f094
0090efec	add x24,x20,#0x38
0090eff0	ldr w0,[x24]
0090eff4	cmn w0,#0x1
0090eff8	b.eq 0x0090f008
0090effc	bl 0x00c31bf0
0090f000	mov w8,#0xffffffff
0090f004	str w8,[x24]
0090f008	ldr x0,[x22]
0090f00c	cbz x0,0x0090f028
0090f010	bl 0x00c31c80
0090f014	adrp x8,0xcc4000
0090f018	add x8,x8,#0x678
0090f01c	ldr x0,[x22]
0090f020	ldr x8,[x8]
0090f024	blr x8
0090f028	adrp x21,0xcc4000
0090f02c	add x21,x21,#0x678
0090f030	ldr x0,[x20, #0x28]
0090f034	ldr x8,[x21]
0090f038	blr x8
0090f03c	ldr x0,[x20, #0x48]
0090f040	cbz x0,0x0090f048
0090f044	bl 0x0090f270
0090f048	ldr w0,[x20, #0x3c]
0090f04c	cmn w0,#0x1
0090f050	b.eq 0x0090f058
0090f054	bl 0x00c31bf0
0090f058	orr w2,wzr,#0x70
0090f05c	mov x0,x22
0090f060	mov w1,wzr
0090f064	bl 0x00c301c0
0090f068	str xzr,[x19, #0xda0]
0090f06c	ldr x8,[x21]
0090f070	mov x0,x20
0090f074	blr x8
0090f078	orr w20,wzr,#0xc
0090f07c	bl 0x00c30710
0090f080	adrp x1,0x2bb000
0090f084	str w20,[x0]
0090f088	add x1,x1,#0x24
0090f08c	mov x0,x19
0090f090	bl 0x00904b80
0090f094	ldr x8,[x25, #0x28]
0090f098	ldr x9,[sp, #0x28]
0090f09c	cmp x8,x9
0090f0a0	b.ne 0x0090f0fc
0090f0a4	ldp x29,x30,[sp, #0x80]
0090f0a8	ldp x20,x19,[sp, #0x70]
0090f0ac	ldp x22,x21,[sp, #0x60]
0090f0b0	ldp x24,x23,[sp, #0x50]
0090f0b4	ldp x26,x25,[sp, #0x40]
0090f0b8	ldr x27,[sp, #0x30]
0090f0bc	mov x0,xzr
0090f0c0	add sp,sp,#0x90
0090f0c4	ret
0090f0c8	movi d0,#-0x1
0090f0cc	str d0,[x24]
0090f0d0	ldr x0,[x22]
0090f0d4	cbnz x0,0x0090f010
0090f0d8	b 0x0090f028
0090f0dc	orr w20,wzr,#0xc
0090f0e0	b 0x0090f0f0
0090f0e4	str w8,[x20, #0x20]
0090f0e8	bl 0x00c30710
0090f0ec	ldr w20,[x0]
0090f0f0	mov x0,x24
0090f0f4	bl 0x0090ea5c
0090f0f8	b 0x0090f07c
0090f0fc	bl 0x00c2fec0
