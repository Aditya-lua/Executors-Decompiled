; FUN_00a1eea4 @ 00a1eea4
00a1eea4	str x21,[sp, #-0x30]!
00a1eea8	mov x21,x1
00a1eeac	adrp x1,0x2db000
00a1eeb0	stp x20,x19,[sp, #0x10]
00a1eeb4	mov x20,x0
00a1eeb8	add x1,x1,#0xe57
00a1eebc	mov w0,#0xd0
00a1eec0	mov w2,#0x4c
00a1eec4	stp x29,x30,[sp, #0x20]
00a1eec8	add x29,sp,#0x20
00a1eecc	bl 0x00c34250
00a1eed0	mov x19,x0
00a1eed4	cbz x0,0x00a1ef1c
00a1eed8	add x8,x19,#0x90
00a1eedc	mov w9,#0x1
00a1eee0	stlr w9,[x8]
00a1eee4	bl 0x00c34d50
00a1eee8	str x0,[x19, #0xc0]
00a1eeec	cbz x0,0x00a1ef50
00a1eef0	str x21,[x19, #0xb0]
00a1eef4	bl 0x00c39fb0
00a1eef8	str x0,[x19, #0xb8]
00a1eefc	ldr w8,[x0, #0x30]
00a1ef00	str w8,[x19, #0x80]
00a1ef04	cbz x20,0x00a1ef98
00a1ef08	mov x0,x20
00a1ef0c	bl 0x00c323b0
00a1ef10	cbz w0,0x00a1efd4
00a1ef14	str x20,[x19, #0xa8]
00a1ef18	b 0x00a1efa8
00a1ef1c	bl 0x00c342a0
00a1ef20	adrp x0,0x2db000
00a1ef24	adrp x2,0x2a5000
00a1ef28	add x0,x0,#0xe57
00a1ef2c	add x2,x2,#0xd60
00a1ef30	mov w1,#0x4f
00a1ef34	bl 0x00c342b0
00a1ef38	mov w1,#0x100
00a1ef3c	mov w0,#0x5
00a1ef40	movk w1,#0xc, LSL #16
00a1ef44	mov x2,xzr
00a1ef48	bl 0x00c342c0
00a1ef4c	b 0x00a1f084
00a1ef50	bl 0x00c342a0
00a1ef54	adrp x20,0x2db000
00a1ef58	add x20,x20,#0xe57
00a1ef5c	adrp x2,0x2a5000
00a1ef60	add x2,x2,#0xd60
00a1ef64	mov w1,#0x56
00a1ef68	mov x0,x20
00a1ef6c	bl 0x00c342b0
00a1ef70	mov w1,#0x100
00a1ef74	mov w0,#0x5
00a1ef78	movk w1,#0xc, LSL #16
00a1ef7c	mov x2,xzr
00a1ef80	bl 0x00c342c0
00a1ef84	mov w2,#0x57
00a1ef88	mov x0,x19
00a1ef8c	mov x1,x20
00a1ef90	bl 0x00c32310
00a1ef94	b 0x00a1f080
00a1ef98	bl 0x00c3a020
00a1ef9c	mov x20,x0
00a1efa0	str x0,[x19, #0xa8]
00a1efa4	cbz x0,0x00a1f008
00a1efa8	mov x0,x20
00a1efac	bl 0x00c3a010
00a1efb0	str x0,[x19, #0xb8]
00a1efb4	cbnz x0,0x00a1f00c
00a1efb8	bl 0x00c342a0
00a1efbc	adrp x0,0x2db000
00a1efc0	adrp x2,0x2a5000
00a1efc4	add x0,x0,#0xe57
00a1efc8	add x2,x2,#0xd60
00a1efcc	mov w1,#0x6a
00a1efd0	b 0x00a1efec
00a1efd4	bl 0x00c342a0
00a1efd8	adrp x0,0x2db000
00a1efdc	adrp x2,0x2a5000
00a1efe0	add x0,x0,#0xe57
00a1efe4	add x2,x2,#0xd60
00a1efe8	mov w1,#0x61
00a1efec	bl 0x00c342b0
00a1eff0	mov w1,#0x26
00a1eff4	mov w0,#0x5
00a1eff8	movk w1,#0x8, LSL #16
00a1effc	mov x2,xzr
00a1f000	bl 0x00c342c0
00a1f004	b 0x00a1f078
00a1f008	ldr x0,[x19, #0xb8]
00a1f00c	ldr w8,[x0, #0x30]
00a1f010	add x2,x19,#0x98
00a1f014	orr w0,wzr,#0x6
00a1f018	mov x1,x19
00a1f01c	str w8,[x19, #0x80]
00a1f020	bl 0x00c356e0
00a1f024	cbz w0,0x00a1f078
00a1f028	add x0,x19,#0x8
00a1f02c	bl 0x00c3a050
00a1f030	ldr x8,[x19, #0xb8]
00a1f034	ldr x8,[x8, #0x20]
00a1f038	cbz x8,0x00a1f084
00a1f03c	mov x0,x19
00a1f040	blr x8
00a1f044	cbnz w0,0x00a1f084
00a1f048	bl 0x00c342a0
00a1f04c	adrp x0,0x2db000
00a1f050	adrp x2,0x2a5000
00a1f054	add x0,x0,#0xe57
00a1f058	add x2,x2,#0xd60
00a1f05c	mov w1,#0x7a
00a1f060	bl 0x00c342b0
00a1f064	mov w8,#0x100
00a1f068	movk w8,#0xc, LSL #16
00a1f06c	add w1,w8,#0x5
00a1f070	mov w0,#0x5
00a1f074	b 0x00a1effc
00a1f078	mov x0,x19
00a1f07c	bl 0x00a1f0ac
00a1f080	mov x19,xzr
00a1f084	mov x0,x19
00a1f088	ldp x29,x30,[sp, #0x20]
00a1f08c	ldp x20,x19,[sp, #0x10]
00a1f090	ldr x21,[sp], #0x30
00a1f094	ret
