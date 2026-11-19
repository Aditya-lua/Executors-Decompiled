; mbedtls_mpi_add_abs @ 00b7efa4
00b7efa4	stp x26,x25,[sp, #-0x50]!
00b7efa8	stp x24,x23,[sp, #0x10]
00b7efac	stp x22,x21,[sp, #0x20]
00b7efb0	stp x20,x19,[sp, #0x30]
00b7efb4	stp x29,x30,[sp, #0x40]
00b7efb8	add x29,sp,#0x40
00b7efbc	cmp x0,x2
00b7efc0	mov x8,x1
00b7efc4	csel x1,x0,x1,eq
00b7efc8	mov x19,x0
00b7efcc	csel x25,x8,x2,eq
00b7efd0	cmp x1,x0
00b7efd4	b.eq 0x00b7efe4
00b7efd8	mov x0,x19
00b7efdc	bl 0x00c41b60
00b7efe0	cbnz w0,0x00b7f14c
00b7efe4	mov w8,#0x1
00b7efe8	strh w8,[x19, #0x8]
00b7efec	ldrh w8,[x25, #0xa]
00b7eff0	orr x9,xzr,#-0x8
00b7eff4	sub x24,x9,x8, LSL #0x3
00b7eff8	cbz x8,0x00b7f148
00b7effc	ldr x2,[x25]
00b7f000	sub x26,x8,#0x1
00b7f004	add x24,x24,#0x8
00b7f008	add x9,x2,x8, LSL #0x3
00b7f00c	ldur x9,[x9, #-0x8]
00b7f010	mov x8,x26
00b7f014	cbz x9,0x00b7eff8
00b7f018	add x20,x26,#0x1
00b7f01c	mov w8,#0x2710
00b7f020	cmp x20,x8
00b7f024	b.ls 0x00b7f030
00b7f028	orr w0,wzr,#0xfffffff0
00b7f02c	b 0x00b7f14c
00b7f030	ldrh w23,[x19, #0xa]
00b7f034	cmp x20,x23
00b7f038	b.ls 0x00b7f088
00b7f03c	mov w1,#0x8
00b7f040	mov x0,x20
00b7f044	bl 0x00c30a30
00b7f048	mov x22,x0
00b7f04c	cbz x0,0x00b7f028
00b7f050	ldr x21,[x19]
00b7f054	cbz x21,0x00b7f078
00b7f058	lsl x23,x23,#0x3
00b7f05c	mov x0,x22
00b7f060	mov x1,x21
00b7f064	mov x2,x23
00b7f068	bl 0x00c2ffd0
00b7f06c	mov x0,x21
00b7f070	mov x1,x23
00b7f074	bl 0x00c42230
00b7f078	strh w20,[x19, #0xa]
00b7f07c	str x22,[x19]
00b7f080	ldr x2,[x25]
00b7f084	b 0x00b7f08c
00b7f088	ldr x22,[x19]
00b7f08c	mov x0,x22
00b7f090	mov x1,x22
00b7f094	mov x3,x20
00b7f098	bl 0x00c41db0
00b7f09c	mov x20,x0
00b7f0a0	cbz x0,0x00b7f14c
00b7f0a4	ldrh w8,[x19, #0xa]
00b7f0a8	neg x25,x24
00b7f0ac	add x21,x26,#0x2
00b7f0b0	sub x9,x22,x24
00b7f0b4	mov w26,#0x2710
00b7f0b8	sub x10,x21,#0x1
00b7f0bc	and x24,x8,#0xffff
00b7f0c0	cmp x10,x24
00b7f0c4	b.cc 0x00b7f12c
00b7f0c8	cmp x21,x26
00b7f0cc	b.hi 0x00b7f028
00b7f0d0	cmp x21,x24
00b7f0d4	b.ls 0x00b7f124
00b7f0d8	mov w1,#0x8
00b7f0dc	mov x0,x21
00b7f0e0	bl 0x00c30a30
00b7f0e4	mov x22,x0
00b7f0e8	cbz x0,0x00b7f028
00b7f0ec	ldr x23,[x19]
00b7f0f0	cbz x23,0x00b7f114
00b7f0f4	lsl x24,x24,#0x3
00b7f0f8	mov x0,x22
00b7f0fc	mov x1,x23
00b7f100	mov x2,x24
00b7f104	bl 0x00c2ffd0
00b7f108	mov x0,x23
00b7f10c	mov x1,x24
00b7f110	bl 0x00c42230
00b7f114	mov w8,w21
00b7f118	strh w21,[x19, #0xa]
00b7f11c	str x22,[x19]
00b7f120	b 0x00b7f128
00b7f124	ldr x22,[x19]
00b7f128	add x9,x22,x25
00b7f12c	ldr x10,[x9]
00b7f130	add x21,x21,#0x1
00b7f134	add x25,x25,#0x8
00b7f138	adds x10,x10,x20
00b7f13c	str x10,[x9], #0x8
00b7f140	mov w20,#0x1
00b7f144	b.cs 0x00b7f0b8
00b7f148	mov w0,wzr
00b7f14c	ldp x29,x30,[sp, #0x40]
00b7f150	ldp x20,x19,[sp, #0x30]
00b7f154	ldp x22,x21,[sp, #0x20]
00b7f158	ldp x24,x23,[sp, #0x10]
00b7f15c	ldp x26,x25,[sp], #0x50
00b7f160	ret
