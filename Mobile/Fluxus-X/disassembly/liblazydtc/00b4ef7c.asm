; FUN_00b4ef7c @ 00b4ef7c
00b4ef7c	sub sp,sp,#0x70
00b4ef80	stp x27,xzr,[sp, #0x10]
00b4ef84	stp x26,x25,[sp, #0x20]
00b4ef88	stp x24,x23,[sp, #0x30]
00b4ef8c	stp x22,x21,[sp, #0x40]
00b4ef90	stp x20,x19,[sp, #0x50]
00b4ef94	stp x29,x30,[sp, #0x60]
00b4ef98	add x29,sp,#0x60
00b4ef9c	mov x22,x3
00b4efa0	mov x21,x2
00b4efa4	mov w24,w1
00b4efa8	mov x23,x0
00b4efac	str xzr,[sp, #0x8]
00b4efb0	bl 0x00c41000
00b4efb4	mov w25,wzr
00b4efb8	tbz w24,#0x2,0x00b4f110
00b4efbc	cbz x23,0x00b4f110
00b4efc0	cbz w0,0x00b4f110
00b4efc4	and w27,w24,#0x3
00b4efc8	cmp w27,#0x1
00b4efcc	mov w25,wzr
00b4efd0	b.eq 0x00b4f110
00b4efd4	bl 0x00c364c0
00b4efd8	cbz x0,0x00b4f084
00b4efdc	mov x20,x0
00b4efe0	mov x0,x23
00b4efe4	bl 0x00c3ad30
00b4efe8	bl 0x00c38a60
00b4efec	mov x19,x0
00b4eff0	cbz x0,0x00b4f0cc
00b4eff4	mov x0,x19
00b4eff8	bl 0x00c38a90
00b4effc	mov x0,x23
00b4f000	bl 0x00c36880
00b4f004	mov x25,x0
00b4f008	mov x0,x23
00b4f00c	bl 0x00c3ad30
00b4f010	mov x26,x0
00b4f014	mov x0,x23
00b4f018	bl 0x00c3ad20
00b4f01c	mov x4,x0
00b4f020	add x6,sp,#0x8
00b4f024	mov x0,x25
00b4f028	mov x1,x20
00b4f02c	mov x2,xzr
00b4f030	mov x3,x26
00b4f034	mov x5,x19
00b4f038	bl 0x00c3a980
00b4f03c	cmp w0,#0x0
00b4f040	cset w8,ne
00b4f044	cmp w27,#0x0
00b4f048	cset w9,eq
00b4f04c	and w8,w9,w8
00b4f050	cbz w27,0x00b4f078
00b4f054	cbz w0,0x00b4f078
00b4f058	and w3,w24,#0x1
00b4f05c	add x4,sp,#0x18
00b4f060	mov x0,x23
00b4f064	mov x1,x20
00b4f068	mov x2,xzr
00b4f06c	bl 0x00b4fc00
00b4f070	cmp w0,#0x0
00b4f074	cset w8,ne
00b4f078	tbnz w24,#0x7,0x00b4f08c
00b4f07c	cbnz w8,0x00b4f0a4
00b4f080	b 0x00b4f0cc
00b4f084	mov w25,wzr
00b4f088	b 0x00b4f110
00b4f08c	cbz w8,0x00b4f0cc
00b4f090	mov x0,x23
00b4f094	mov x1,x20
00b4f098	mov x2,xzr
00b4f09c	bl 0x00b4fe4c
00b4f0a0	cbz w0,0x00b4f0cc
00b4f0a4	mov x0,x20
00b4f0a8	bl 0x00c364f0
00b4f0ac	cbz x0,0x00b4f0cc
00b4f0b0	mov x1,x22
00b4f0b4	mov x23,x0
00b4f0b8	blr x21
00b4f0bc	mov w25,w0
00b4f0c0	mov x0,x23
00b4f0c4	bl 0x00c36500
00b4f0c8	b 0x00b4f0d0
00b4f0cc	mov w25,wzr
00b4f0d0	mov x0,x20
00b4f0d4	bl 0x00c364b0
00b4f0d8	ldr x0,[sp, #0x18]
00b4f0dc	adrp x20,0x2c6000
00b4f0e0	add x20,x20,#0x737
00b4f0e4	mov w2,#0x204
00b4f0e8	mov x1,x20
00b4f0ec	bl 0x00c32310
00b4f0f0	ldr x0,[sp, #0x8]
00b4f0f4	mov w2,#0x205
00b4f0f8	mov x1,x20
00b4f0fc	bl 0x00c32310
00b4f100	mov x0,x19
00b4f104	bl 0x00c38a20
00b4f108	mov x0,x19
00b4f10c	bl 0x00c38a30
00b4f110	mov w0,w25
00b4f114	ldp x29,x30,[sp, #0x60]
00b4f118	ldp x20,x19,[sp, #0x50]
00b4f11c	ldp x22,x21,[sp, #0x40]
00b4f120	ldp x24,x23,[sp, #0x30]
00b4f124	ldp x26,x25,[sp, #0x20]
00b4f128	ldr x27,[sp, #0x10]
00b4f12c	add sp,sp,#0x70
00b4f130	ret
