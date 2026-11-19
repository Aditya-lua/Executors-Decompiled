; FUN_00b5ee30 @ 00b5ee30
00b5ee30	sub sp,sp,#0x50
00b5ee34	stp x24,x23,[sp, #0x10]
00b5ee38	stp x22,x21,[sp, #0x20]
00b5ee3c	stp x20,x19,[sp, #0x30]
00b5ee40	stp x29,x30,[sp, #0x40]
00b5ee44	add x29,sp,#0x40
00b5ee48	mov x23,x5
00b5ee4c	mov x24,x4
00b5ee50	mov x21,x3
00b5ee54	mov x19,x2
00b5ee58	mov x20,x1
00b5ee5c	mov x22,x0
00b5ee60	bl 0x00c41000
00b5ee64	cbz w0,0x00b5f064
00b5ee68	cbz x20,0x00b5ef58
00b5ee6c	ldr x8,[x22, #0x20]
00b5ee70	cbz x8,0x00b5ef68
00b5ee74	ldr w8,[x22, #0x68]
00b5ee78	cmp w8,#0x1
00b5ee7c	b.eq 0x00b5efa4
00b5ee80	cmp w8,#0x5
00b5ee84	b.ne 0x00b5efe4
00b5ee88	ldr x2,[x22, #0xb8]
00b5ee8c	cbnz x2,0x00b5eeb8
00b5ee90	ldr x0,[x22, #0x10]
00b5ee94	bl 0x00c3fab0
00b5ee98	adrp x1,0x2a3000
00b5ee9c	sxtw x0,w0
00b5eea0	add x1,x1,#0x265
00b5eea4	mov w2,#0x1e7
00b5eea8	bl 0x00c32320
00b5eeac	mov x2,x0
00b5eeb0	str x0,[x22, #0xb8]
00b5eeb4	cbz x0,0x00b5f0a4
00b5eeb8	ldr x3,[x22, #0x10]
00b5eebc	mov w4,#0x5
00b5eec0	mov w0,w23
00b5eec4	mov x1,x24
00b5eec8	bl 0x00c3fdf0
00b5eecc	cmp w0,#0x0
00b5eed0	b.le 0x00b5f030
00b5eed4	ldr x8,[x22, #0xb8]
00b5eed8	sxtw x9,w0
00b5eedc	sub x23,x9,#0x1
00b5eee0	ldr w0,[x22, #0x30]
00b5eee4	ldrb w24,[x8, x23]
00b5eee8	bl 0x00c3ffd0
00b5eeec	cmp w0,w24
00b5eef0	b.ne 0x00b5f07c
00b5eef4	ldr x0,[x22, #0x20]
00b5eef8	bl 0x00c34c20
00b5eefc	cmp w23,w0
00b5ef00	b.ne 0x00b5f0d0
00b5ef04	str x23,[x19]
00b5ef08	ldr x1,[x22, #0xb8]
00b5ef0c	cmp x1,x20
00b5ef10	b.eq 0x00b5efd4
00b5ef14	cmp x23,x21
00b5ef18	b.ls 0x00b5f114
00b5ef1c	bl 0x00c342a0
00b5ef20	adrp x0,0x2a3000
00b5ef24	adrp x2,0x2a8000
00b5ef28	add x0,x0,#0x265
00b5ef2c	add x2,x2,#0xda0
00b5ef30	mov w1,#0x2c9
00b5ef34	bl 0x00c342b0
00b5ef38	adrp x2,0x2d6000
00b5ef3c	add x2,x2,#0xc6b
00b5ef40	mov w0,#0x39
00b5ef44	mov w1,#0x6a
00b5ef48	mov x3,x21
00b5ef4c	mov w4,w23
00b5ef50	bl 0x00c342c0
00b5ef54	b 0x00b5f060
00b5ef58	ldr x0,[x22, #0x10]
00b5ef5c	bl 0x00c3fab0
00b5ef60	sxtw x8,w0
00b5ef64	b 0x00b5efd8
00b5ef68	ldr x3,[x22, #0x10]
00b5ef6c	ldr w4,[x22, #0x68]
00b5ef70	mov w0,w23
00b5ef74	mov x1,x24
00b5ef78	mov x2,x20
00b5ef7c	bl 0x00c3fdf0
00b5ef80	mov w23,w0
00b5ef84	tbz w0,#0x1f,0x00b5efd4
00b5ef88	bl 0x00c342a0
00b5ef8c	adrp x0,0x2a3000
00b5ef90	adrp x2,0x2a8000
00b5ef94	add x0,x0,#0x265
00b5ef98	add x2,x2,#0xda0
00b5ef9c	mov w1,#0x2e9
00b5efa0	b 0x00b5f048
00b5efa4	ldr w0,[x22, #0x30]
00b5efa8	ldr x7,[x22, #0x10]
00b5efac	add x4,sp,#0x8
00b5efb0	mov x1,xzr
00b5efb4	mov w2,wzr
00b5efb8	mov x3,x20
00b5efbc	mov x5,x24
00b5efc0	mov x6,x23
00b5efc4	bl 0x00c40030
00b5efc8	cmp w0,#0x1
00b5efcc	b.lt 0x00b5f014
00b5efd0	ldr w23,[sp, #0x8]
00b5efd4	sxtw x8,w23
00b5efd8	mov w0,#0x1
00b5efdc	str x8,[x19]
00b5efe0	b 0x00b5f064
00b5efe4	bl 0x00c342a0
00b5efe8	adrp x0,0x2a3000
00b5efec	adrp x2,0x2a8000
00b5eff0	add x0,x0,#0x265
00b5eff4	add x2,x2,#0xda0
00b5eff8	mov w1,#0x2e1
00b5effc	bl 0x00c342b0
00b5f000	adrp x2,0x2a1000
00b5f004	add x2,x2,#0x113
00b5f008	mov w0,#0x39
00b5f00c	mov w1,#0xa8
00b5f010	b 0x00b5f05c
00b5f014	bl 0x00c342a0
00b5f018	adrp x0,0x2a3000
00b5f01c	adrp x2,0x2a8000
00b5f020	add x0,x0,#0x265
00b5f024	add x2,x2,#0xda0
00b5f028	mov w1,#0x2d9
00b5f02c	b 0x00b5f048
00b5f030	bl 0x00c342a0
00b5f034	adrp x0,0x2a3000
00b5f038	adrp x2,0x2a8000
00b5f03c	add x0,x0,#0x265
00b5f040	add x2,x2,#0xda0
00b5f044	mov w1,#0x2b7
00b5f048	bl 0x00c342b0
00b5f04c	mov w1,#0x4
00b5f050	mov w0,#0x39
00b5f054	movk w1,#0x8, LSL #16
00b5f058	mov x2,xzr
00b5f05c	bl 0x00c342c0
00b5f060	mov w0,wzr
00b5f064	ldp x29,x30,[sp, #0x40]
00b5f068	ldp x20,x19,[sp, #0x30]
00b5f06c	ldp x22,x21,[sp, #0x20]
00b5f070	ldp x24,x23,[sp, #0x10]
00b5f074	add sp,sp,#0x50
00b5f078	ret
00b5f07c	bl 0x00c342a0
00b5f080	adrp x0,0x2a3000
00b5f084	adrp x2,0x2a8000
00b5f088	add x0,x0,#0x265
00b5f08c	add x2,x2,#0xda0
00b5f090	mov w1,#0x2bc
00b5f094	bl 0x00c342b0
00b5f098	mov w0,#0x39
00b5f09c	mov w1,#0xad
00b5f0a0	b 0x00b5f058
00b5f0a4	bl 0x00c342a0
00b5f0a8	adrp x0,0x2a3000
00b5f0ac	adrp x2,0x2c2000
00b5f0b0	add x0,x0,#0x265
00b5f0b4	add x2,x2,#0x3a7
00b5f0b8	mov w1,#0x1e8
00b5f0bc	bl 0x00c342b0
00b5f0c0	mov w1,#0x100
00b5f0c4	mov w0,#0x39
00b5f0c8	movk w1,#0xc, LSL #16
00b5f0cc	b 0x00b5f058
00b5f0d0	bl 0x00c342a0
00b5f0d4	adrp x0,0x2a3000
00b5f0d8	adrp x2,0x2a8000
00b5f0dc	add x0,x0,#0x265
00b5f0e0	add x2,x2,#0xda0
00b5f0e4	mov w1,#0x2c0
00b5f0e8	bl 0x00c342b0
00b5f0ec	ldr x0,[x22, #0x20]
00b5f0f0	bl 0x00c34c20
00b5f0f4	adrp x2,0x29e000
00b5f0f8	mov w3,w0
00b5f0fc	add x2,x2,#0xf86
00b5f100	mov w0,#0x39
00b5f104	mov w1,#0xa6
00b5f108	mov w4,w23
00b5f10c	bl 0x00c342c0
00b5f110	b 0x00b5f060
00b5f114	mov x0,x20
00b5f118	mov x2,x23
00b5f11c	bl 0x00c2ffd0
00b5f120	b 0x00b5efd4
