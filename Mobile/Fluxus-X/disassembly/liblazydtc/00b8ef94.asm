; psa_generate_random @ 00b8ef94
00b8ef94	stp x26,x25,[sp, #-0x50]!
00b8ef98	stp x24,x23,[sp, #0x10]
00b8ef9c	stp x22,x21,[sp, #0x20]
00b8efa0	stp x20,x19,[sp, #0x30]
00b8efa4	stp x29,x30,[sp, #0x40]
00b8efa8	add x29,sp,#0x40
00b8efac	mov x22,x1
00b8efb0	mov x19,x0
00b8efb4	cbz x1,0x00b8efd8
00b8efb8	mov w1,#0x1
00b8efbc	mov x0,x22
00b8efc0	bl 0x00c30a30
00b8efc4	mov x20,x0
00b8efc8	mov x21,x22
00b8efcc	cbnz x0,0x00b8efe4
00b8efd0	mov w23,#0xffffff73
00b8efd4	b 0x00b8f090
00b8efd8	mov x21,xzr
00b8efdc	mov x20,xzr
00b8efe0	mov x19,xzr
00b8efe4	adrp x8,0xd25000
00b8efe8	add x8,x8,#0xb10
00b8efec	ldrb w9,[x8, #0x1]
00b8eff0	ldrb w10,[x8]
00b8eff4	cmp w9,#0x2
00b8eff8	cset w9,ne
00b8effc	cmp w10,#0x7
00b8f000	cset w10,ne
00b8f004	orr w9,w9,w10
00b8f008	cmp w9,#0x0
00b8f00c	mov w10,#0xffffff77
00b8f010	csel w23,w10,wzr,ne
00b8f014	cbz x22,0x00b8f054
00b8f018	tbnz w9,#0x0,0x00b8f054
00b8f01c	mov w26,#0x400
00b8f020	add x23,x8,#0x358
00b8f024	mov x24,x20
00b8f028	cmp x22,#0x400
00b8f02c	csel x25,x22,x26,cc
00b8f030	mov x0,x23
00b8f034	mov x1,x24
00b8f038	mov x2,x25
00b8f03c	bl 0x00c303a0
00b8f040	cbnz w0,0x00b8f07c
00b8f044	subs x22,x22,x25
00b8f048	add x24,x24,x25
00b8f04c	b.ne 0x00b8f028
00b8f050	mov w23,wzr
00b8f054	cbz x20,0x00b8f090
00b8f058	cbz x19,0x00b8f08c
00b8f05c	cbz x21,0x00b8f070
00b8f060	mov x0,x19
00b8f064	mov x1,x20
00b8f068	mov x2,x21
00b8f06c	bl 0x00c2ffd0
00b8f070	mov x0,x20
00b8f074	bl 0x00c30960
00b8f078	b 0x00b8f090
00b8f07c	bl 0x00c42bf0
00b8f080	mov w23,w0
00b8f084	cbnz x20,0x00b8f058
00b8f088	b 0x00b8f090
00b8f08c	mov w23,#0xffffff69
00b8f090	mov w0,w23
00b8f094	ldp x29,x30,[sp, #0x40]
00b8f098	ldp x20,x19,[sp, #0x30]
00b8f09c	ldp x22,x21,[sp, #0x20]
00b8f0a0	ldp x24,x23,[sp, #0x10]
00b8f0a4	ldp x26,x25,[sp], #0x50
00b8f0a8	ret
