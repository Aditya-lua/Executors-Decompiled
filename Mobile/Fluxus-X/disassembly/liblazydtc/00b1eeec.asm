; FUN_00b1eeec @ 00b1eeec
00b1eeec	stp x20,x19,[sp, #-0x20]!
00b1eef0	sub w8,w0,#0x1
00b1eef4	cmp w8,#0x10
00b1eef8	stp x29,x30,[sp, #0x10]
00b1eefc	add x29,sp,#0x10
00b1ef00	b.hi 0x00b1f0b8
00b1ef04	adrp x9,0x77b000
00b1ef08	add x9,x9,#0xb48
00b1ef0c	ldrsw x8,[x9, x8, LSL #0x2]
00b1ef10	ldr x19,[x1]
00b1ef14	add x8,x8,x9
00b1ef18	br x8
00b1ef1c	add x20,x19,#0xc8
00b1ef20	b 0x00b1f010
00b1ef24	add x2,x19,#0xc8
00b1ef28	orr w0,wzr,#0x3
00b1ef2c	mov x1,x19
00b1ef30	bl 0x00c356c0
00b1ef34	ldr x0,[x19, #0x150]
00b1ef38	bl 0x00c40f50
00b1ef3c	ldr x0,[x19, #0xf8]
00b1ef40	bl 0x00c35530
00b1ef44	ldr x0,[x19, #0x100]
00b1ef48	bl 0x00c40740
00b1ef4c	ldr x0,[x19, #0x110]
00b1ef50	bl 0x00c407d0
00b1ef54	ldr x0,[x19, #0x108]
00b1ef58	bl 0x00c40540
00b1ef5c	ldr x0,[x19, #0x118]
00b1ef60	bl 0x00c324e0
00b1ef64	ldr x0,[x19, #0x120]
00b1ef68	bl 0x00c409b0
00b1ef6c	adrp x1,0xcb5000
00b1ef70	ldr x0,[x19, #0x128]
00b1ef74	ldr x1,[x1, #0x810]
00b1ef78	bl 0x00c32600
00b1ef7c	ldr x0,[x19, #0x130]
00b1ef80	bl 0x00c40760
00b1ef84	ldr x0,[x19, #0x168]
00b1ef88	bl 0x00c35530
00b1ef8c	ldr x0,[x19, #0x178]
00b1ef90	adrp x1,0x29e000
00b1ef94	add x1,x1,#0xcf5
00b1ef98	mov w2,#0x62
00b1ef9c	bl 0x00c32310
00b1efa0	b 0x00b1f0b8
00b1efa4	add x20,x19,#0xc8
00b1efa8	orr w0,wzr,#0x3
00b1efac	mov x1,x19
00b1efb0	mov x2,x20
00b1efb4	bl 0x00c356c0
00b1efb8	ldr x0,[x19, #0x150]
00b1efbc	bl 0x00c40f50
00b1efc0	ldr x0,[x19, #0xf8]
00b1efc4	bl 0x00c35530
00b1efc8	ldr x0,[x19, #0x100]
00b1efcc	bl 0x00c40740
00b1efd0	ldr x0,[x19, #0x110]
00b1efd4	bl 0x00c407d0
00b1efd8	ldr x0,[x19, #0x108]
00b1efdc	bl 0x00c40540
00b1efe0	ldr x0,[x19, #0x118]
00b1efe4	bl 0x00c324e0
00b1efe8	ldr x0,[x19, #0x120]
00b1efec	bl 0x00c409b0
00b1eff0	adrp x1,0xcb5000
00b1eff4	ldr x0,[x19, #0x128]
00b1eff8	ldr x1,[x1, #0x810]
00b1effc	bl 0x00c32600
00b1f000	ldr x0,[x19, #0x130]
00b1f004	bl 0x00c40760
00b1f008	ldr x0,[x19, #0x168]
00b1f00c	bl 0x00c35530
00b1f010	movi v0.2D,#0x0
00b1f014	mov x8,#-0x1
00b1f018	add x9,x19,#0x108
00b1f01c	add x10,x19,#0x118
00b1f020	add x11,x19,#0x128
00b1f024	orr w0,wzr,#0x3
00b1f028	mov x1,x19
00b1f02c	mov x2,x20
00b1f030	str wzr,[x19, #0x160]
00b1f034	stur q0,[x19, #0xe8]
00b1f038	stp x8,x8,[x19, #0xd8]
00b1f03c	stur q0,[x19, #0xf8]
00b1f040	str q0,[x9]
00b1f044	str q0,[x10]
00b1f048	str q0,[x11]
00b1f04c	str xzr,[x19, #0x168]
00b1f050	str xzr,[x19, #0x150]
00b1f054	bl 0x00c356e0
00b1f058	cbnz w0,0x00b1f0b8
00b1f05c	b 0x00b1f0bc
00b1f060	cbz x19,0x00b1f0b8
00b1f064	ldp x8,x20,[x3, #0x170]
00b1f068	ldr x0,[x19, #0x178]
00b1f06c	adrp x1,0x29e000
00b1f070	add x1,x1,#0xcf5
00b1f074	mov w2,#0x96
00b1f078	str x8,[x19, #0x170]
00b1f07c	bl 0x00c32310
00b1f080	str xzr,[x19, #0x178]
00b1f084	cbz x20,0x00b1f0b8
00b1f088	adrp x1,0x29e000
00b1f08c	add x1,x1,#0xcf5
00b1f090	mov w2,#0x99
00b1f094	mov x0,x20
00b1f098	bl 0x00c34600
00b1f09c	str x0,[x19, #0x178]
00b1f0a0	cbnz x0,0x00b1f0b8
00b1f0a4	b 0x00b1f0bc
00b1f0a8	ldr x8,[x19, #0x170]
00b1f0ac	b 0x00b1f0b4
00b1f0b0	ldr x8,[x19, #0x178]
00b1f0b4	str x8,[x3]
00b1f0b8	mov w0,#0x1
00b1f0bc	ldp x29,x30,[sp, #0x10]
00b1f0c0	ldp x20,x19,[sp], #0x20
00b1f0c4	ret
