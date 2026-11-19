; X509_CRL_diff @ 00b0ee70
00b0ee70	str x25,[sp, #-0x50]!
00b0ee74	stp x24,x23,[sp, #0x10]
00b0ee78	stp x22,x21,[sp, #0x20]
00b0ee7c	stp x20,x19,[sp, #0x30]
00b0ee80	stp x29,x30,[sp, #0x40]
00b0ee84	ldr x8,[x0, #0xa8]
00b0ee88	add x29,sp,#0x40
00b0ee8c	cbnz x8,0x00b0ee9c
00b0ee90	ldr x8,[x1, #0xa8]
00b0ee94	mov x23,x1
00b0ee98	cbz x8,0x00b0eee8
00b0ee9c	bl 0x00c342a0
00b0eea0	adrp x0,0x2a0000
00b0eea4	adrp x2,0x2cc000
00b0eea8	add x0,x0,#0xe02
00b0eeac	add x2,x2,#0x2a6
00b0eeb0	mov w1,#0x7ed
00b0eeb4	bl 0x00c342b0
00b0eeb8	mov w0,#0xb
00b0eebc	orr w1,wzr,#0x7f
00b0eec0	mov x2,xzr
00b0eec4	bl 0x00c342c0
00b0eec8	mov x22,xzr
00b0eecc	mov x0,x22
00b0eed0	ldp x29,x30,[sp, #0x40]
00b0eed4	ldp x20,x19,[sp, #0x30]
00b0eed8	ldp x22,x21,[sp, #0x20]
00b0eedc	ldp x24,x23,[sp, #0x10]
00b0eee0	ldr x25,[sp], #0x50
00b0eee4	ret
00b0eee8	ldr x8,[x0, #0xa0]
00b0eeec	mov x21,x0
00b0eef0	cbz x8,0x00b0ef50
00b0eef4	ldr x8,[x23, #0xa0]
00b0eef8	cbz x8,0x00b0ef50
00b0eefc	mov x0,x21
00b0ef00	mov x19,x3
00b0ef04	mov x20,x2
00b0ef08	bl 0x00c40d90
00b0ef0c	mov x22,x0
00b0ef10	mov x0,x23
00b0ef14	bl 0x00c40d90
00b0ef18	mov x1,x0
00b0ef1c	mov x0,x22
00b0ef20	bl 0x00c36560
00b0ef24	cbz w0,0x00b0ef78
00b0ef28	bl 0x00c342a0
00b0ef2c	adrp x0,0x2a0000
00b0ef30	adrp x2,0x2cc000
00b0ef34	add x0,x0,#0xe02
00b0ef38	add x2,x2,#0x2a6
00b0ef3c	orr w1,wzr,#0x7f8
00b0ef40	bl 0x00c342b0
00b0ef44	mov w0,#0xb
00b0ef48	mov w1,#0x81
00b0ef4c	b 0x00b0eec0
00b0ef50	bl 0x00c342a0
00b0ef54	adrp x0,0x2a0000
00b0ef58	adrp x2,0x2cc000
00b0ef5c	add x0,x0,#0xe02
00b0ef60	add x2,x2,#0x2a6
00b0ef64	mov w1,#0x7f2
00b0ef68	bl 0x00c342b0
00b0ef6c	mov w0,#0xb
00b0ef70	mov w1,#0x82
00b0ef74	b 0x00b0eec0
00b0ef78	mov w2,#0x5a
00b0ef7c	mov x0,x21
00b0ef80	mov x1,x23
00b0ef84	bl 0x00b0f224
00b0ef88	cbz w0,0x00b0f140
00b0ef8c	mov w2,#0x302
00b0ef90	mov x0,x21
00b0ef94	mov x1,x23
00b0ef98	bl 0x00b0f224
00b0ef9c	cbz w0,0x00b0f168
00b0efa0	ldr x0,[x23, #0xa0]
00b0efa4	ldr x1,[x21, #0xa0]
00b0efa8	bl 0x00c37560
00b0efac	cmp w0,#0x0
00b0efb0	b.le 0x00b0f190
00b0efb4	cbz x20,0x00b0efe0
00b0efb8	mov x0,x21
00b0efbc	mov x1,x20
00b0efc0	bl 0x00c40e00
00b0efc4	cmp w0,#0x1
00b0efc8	b.lt 0x00b0f1b8
00b0efcc	mov x0,x23
00b0efd0	mov x1,x20
00b0efd4	bl 0x00c40e00
00b0efd8	cmp w0,#0x0
00b0efdc	b.le 0x00b0f1b8
00b0efe0	ldp x0,x1,[x21, #0xe8]
00b0efe4	bl 0x00c40da0
00b0efe8	mov x22,x0
00b0efec	cbz x0,0x00b0f1e8
00b0eff0	mov w1,#0x1
00b0eff4	mov x0,x22
00b0eff8	bl 0x00c40de0
00b0effc	cbz w0,0x00b0f1e8
00b0f000	mov x0,x23
00b0f004	bl 0x00c40d90
00b0f008	mov x1,x0
00b0f00c	mov x0,x22
00b0f010	bl 0x00c40dd0
00b0f014	cbz w0,0x00b0f1e8
00b0f018	mov x0,x23
00b0f01c	bl 0x00c40d60
00b0f020	mov x1,x0
00b0f024	mov x0,x22
00b0f028	bl 0x00c40db0
00b0f02c	cbz w0,0x00b0f1e8
00b0f030	mov x0,x23
00b0f034	bl 0x00c40d70
00b0f038	mov x1,x0
00b0f03c	mov x0,x22
00b0f040	bl 0x00c40dc0
00b0f044	cbz w0,0x00b0f1e8
00b0f048	ldr x2,[x21, #0xa0]
00b0f04c	mov w1,#0x8c
00b0f050	mov w3,#0x1
00b0f054	mov x0,x22
00b0f058	mov x4,xzr
00b0f05c	bl 0x00c40bf0
00b0f060	cbz w0,0x00b0f1e8
00b0f064	mov x0,x23
00b0f068	bl 0x00c40c30
00b0f06c	cmp w0,#0x1
00b0f070	b.lt 0x00b0f0ac
00b0f074	mov w24,wzr
00b0f078	mov x0,x23
00b0f07c	mov w1,w24
00b0f080	bl 0x00c40c10
00b0f084	mov x1,x0
00b0f088	mov w2,#0xffffffff
00b0f08c	mov x0,x22
00b0f090	bl 0x00c40c00
00b0f094	cbz w0,0x00b0f1e8
00b0f098	mov x0,x23
00b0f09c	add w24,w24,#0x1
00b0f0a0	bl 0x00c40c30
00b0f0a4	cmp w24,w0
00b0f0a8	b.lt 0x00b0f078
00b0f0ac	mov x0,x23
00b0f0b0	bl 0x00c40d80
00b0f0b4	mov x23,x0
00b0f0b8	bl 0x00c325e0
00b0f0bc	cmp w0,#0x1
00b0f0c0	b.lt 0x00b0f120
00b0f0c4	mov w24,wzr
00b0f0c8	mov x0,x23
00b0f0cc	mov w1,w24
00b0f0d0	bl 0x00c32610
00b0f0d4	mov x25,x0
00b0f0d8	add x1,sp,#0x8
00b0f0dc	mov x0,x21
00b0f0e0	mov x2,x25
00b0f0e4	bl 0x00c40d50
00b0f0e8	cbnz w0,0x00b0f10c
00b0f0ec	mov x0,x25
00b0f0f0	bl 0x00c40e10
00b0f0f4	str x0,[sp, #0x8]
00b0f0f8	cbz x0,0x00b0f1e8
00b0f0fc	mov x1,x0
00b0f100	mov x0,x22
00b0f104	bl 0x00c40d30
00b0f108	cbz w0,0x00b0f1e0
00b0f10c	mov x0,x23
00b0f110	add w24,w24,#0x1
00b0f114	bl 0x00c325e0
00b0f118	cmp w24,w0
00b0f11c	b.lt 0x00b0f0c8
00b0f120	cbz x20,0x00b0eecc
00b0f124	cbz x19,0x00b0eecc
00b0f128	mov x0,x22
00b0f12c	mov x1,x20
00b0f130	mov x2,x19
00b0f134	bl 0x00c40df0
00b0f138	cbnz w0,0x00b0eecc
00b0f13c	b 0x00b0f1e8
00b0f140	bl 0x00c342a0
00b0f144	adrp x0,0x2a0000
00b0f148	adrp x2,0x2cc000
00b0f14c	add x0,x0,#0xe02
00b0f150	add x2,x2,#0x2a6
00b0f154	mov w1,#0x7fd
00b0f158	bl 0x00c342b0
00b0f15c	mov w0,#0xb
00b0f160	mov w1,#0x6e
00b0f164	b 0x00b0eec0
00b0f168	bl 0x00c342a0
00b0f16c	adrp x0,0x2a0000
00b0f170	adrp x2,0x2cc000
00b0f174	add x0,x0,#0xe02
00b0f178	add x2,x2,#0x2a6
00b0f17c	mov w1,#0x801
00b0f180	bl 0x00c342b0
00b0f184	mov w0,#0xb
00b0f188	mov w1,#0x80
00b0f18c	b 0x00b0eec0
00b0f190	bl 0x00c342a0
00b0f194	adrp x0,0x2a0000
00b0f198	adrp x2,0x2cc000
00b0f19c	add x0,x0,#0xe02
00b0f1a0	add x2,x2,#0x2a6
00b0f1a4	mov w1,#0x806
00b0f1a8	bl 0x00c342b0
00b0f1ac	mov w0,#0xb
00b0f1b0	mov w1,#0x84
00b0f1b4	b 0x00b0eec0
00b0f1b8	bl 0x00c342a0
00b0f1bc	adrp x0,0x2a0000
00b0f1c0	adrp x2,0x2cc000
00b0f1c4	add x0,x0,#0xe02
00b0f1c8	add x2,x2,#0x2a6
00b0f1cc	mov w1,#0x80c
00b0f1d0	bl 0x00c342b0
00b0f1d4	mov w0,#0xb
00b0f1d8	mov w1,#0x83
00b0f1dc	b 0x00b0eec0
00b0f1e0	ldr x0,[sp, #0x8]
00b0f1e4	bl 0x00c40e20
00b0f1e8	bl 0x00c342a0
00b0f1ec	adrp x0,0x2a0000
00b0f1f0	adrp x2,0x2cc000
00b0f1f4	add x0,x0,#0xe02
00b0f1f8	add x2,x2,#0x2a6
00b0f1fc	mov w1,#0x848
00b0f200	bl 0x00c342b0
00b0f204	mov w1,#0x100
00b0f208	mov w0,#0xb
00b0f20c	movk w1,#0xc, LSL #16
00b0f210	mov x2,xzr
00b0f214	bl 0x00c342c0
00b0f218	mov x0,x22
00b0f21c	bl 0x00c382b0
00b0f220	b 0x00b0eec8
