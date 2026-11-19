; FUN_00b8bf2c @ 00b8bf2c
00b8bf2c	sub sp,sp,#0x60
00b8bf30	str x25,[sp, #0x10]
00b8bf34	stp x24,x23,[sp, #0x20]
00b8bf38	stp x22,x21,[sp, #0x30]
00b8bf3c	stp x20,x19,[sp, #0x40]
00b8bf40	stp x29,x30,[sp, #0x50]
00b8bf44	add x29,sp,#0x50
00b8bf48	mrs x23,tpidr_el0
00b8bf4c	ldr x8,[x23, #0x28]
00b8bf50	mov w24,#0x5000000
00b8bf54	and w9,w3,#0x7f000000
00b8bf58	mov w21,w3
00b8bf5c	mov w20,w1
00b8bf60	mov x19,x0
00b8bf64	cmp w9,w24
00b8bf68	str x8,[sp, #0x8]
00b8bf6c	str xzr,[sp]
00b8bf70	b.ne 0x00b8c054
00b8bf74	mov w9,#0x8ff
00b8bf78	and w8,w21,#0xffffff00
00b8bf7c	movk w9,#0x600, LSL #16
00b8bf80	cmp w8,w9
00b8bf84	b.gt 0x00b8bfa0
00b8bf88	mov w9,#0x200
00b8bf8c	movk w9,#0x600, LSL #16
00b8bf90	cmp w8,w9
00b8bf94	b.eq 0x00b8bfd4
00b8bf98	mov w9,#0x300
00b8bf9c	b 0x00b8bfb4
00b8bfa0	mov w9,#0x900
00b8bfa4	movk w9,#0x600, LSL #16
00b8bfa8	cmp w8,w9
00b8bfac	b.eq 0x00b8bfd4
00b8bfb0	mov w9,#0x1300
00b8bfb4	movk w9,#0x600, LSL #16
00b8bfb8	cmp w8,w9
00b8bfbc	b.eq 0x00b8bfd4
00b8bfc0	lsr w9,w21,#0x9
00b8bfc4	orr w9,w9,#0x1
00b8bfc8	orr w10,wzr,#0x30003
00b8bfcc	cmp w9,w10
00b8bfd0	b.ne 0x00b8c004
00b8bfd4	ands w9,w21,#0xff
00b8bfd8	b.eq 0x00b8c004
00b8bfdc	mov w10,#0x8ff
00b8bfe0	movk w10,#0x600, LSL #16
00b8bfe4	cmp w8,w10
00b8bfe8	b.gt 0x00b8c00c
00b8bfec	mov w10,#0x200
00b8bff0	movk w10,#0x600, LSL #16
00b8bff4	cmp w8,w10
00b8bff8	b.eq 0x00b8c040
00b8bffc	mov w10,#0x300
00b8c000	b 0x00b8c020
00b8c004	tbz w21,#0xf,0x00b8c05c
00b8c008	b 0x00b8c054
00b8c00c	mov w10,#0x900
00b8c010	movk w10,#0x600, LSL #16
00b8c014	cmp w8,w10
00b8c018	b.eq 0x00b8c040
00b8c01c	mov w10,#0x1300
00b8c020	movk w10,#0x600, LSL #16
00b8c024	cmp w8,w10
00b8c028	b.eq 0x00b8c040
00b8c02c	lsr w8,w21,#0x9
00b8c030	orr w8,w8,#0x1
00b8c034	orr w10,wzr,#0x30003
00b8c038	cmp w8,w10
00b8c03c	b.ne 0x00b8c05c
00b8c040	orr w8,w9,#0x2000000
00b8c044	mov w9,#0xff
00b8c048	movk w9,#0x200, LSL #16
00b8c04c	cmp w8,w9
00b8c050	b.ne 0x00b8c05c
00b8c054	mov w22,#0xffffff79
00b8c058	b 0x00b8c074
00b8c05c	ldr w8,[x19]
00b8c060	cbnz w8,0x00b8c070
00b8c064	ldrb w8,[x19, #0x20]
00b8c068	tst w8,#0xf
00b8c06c	b.eq 0x00b8c0d4
00b8c070	mov w22,#0xffffff77
00b8c074	ldr x0,[sp]
00b8c078	bl 0x00c431e0
00b8c07c	ldr w8,[x19]
00b8c080	cbz w8,0x00b8c0a4
00b8c084	cmp w8,#0x1
00b8c088	b.ne 0x00b8c094
00b8c08c	add x0,x19,#0x28
00b8c090	bl 0x00c42db0
00b8c094	mov w2,#0x1d8
00b8c098	mov x0,x19
00b8c09c	mov w1,wzr
00b8c0a0	bl 0x00c301c0
00b8c0a4	ldr x8,[x23, #0x28]
00b8c0a8	ldr x9,[sp, #0x8]
00b8c0ac	cmp x8,x9
00b8c0b0	b.ne 0x00b8c250
00b8c0b4	mov w0,w22
00b8c0b8	ldp x29,x30,[sp, #0x50]
00b8c0bc	ldp x20,x19,[sp, #0x40]
00b8c0c0	ldp x22,x21,[sp, #0x30]
00b8c0c4	ldp x24,x23,[sp, #0x20]
00b8c0c8	ldr x25,[sp, #0x10]
00b8c0cc	add sp,sp,#0x60
00b8c0d0	ret
00b8c0d4	cmp w20,#0x0
00b8c0d8	mov w8,#0x200
00b8c0dc	mov w9,#0x100
00b8c0e0	csel w8,w9,w8,ne
00b8c0e4	mov x1,sp
00b8c0e8	mov w0,w2
00b8c0ec	mov w2,w8
00b8c0f0	mov w3,w21
00b8c0f4	bl 0x00b86e5c
00b8c0f8	mov w22,w0
00b8c0fc	cbnz w0,0x00b8c074
00b8c100	mov w8,#0x500
00b8c104	and w25,w21,#0xffc07fff
00b8c108	movk w8,#0x500, LSL #16
00b8c10c	cmp w25,w8
00b8c110	ubfx w8,w21,#0x10,#0x6
00b8c114	b.eq 0x00b8c154
00b8c118	mov w9,#0x200
00b8c11c	movk w9,#0x540, LSL #16
00b8c120	cmp w25,w9
00b8c124	b.eq 0x00b8c160
00b8c128	mov w9,#0x100
00b8c12c	movk w9,#0x540, LSL #16
00b8c130	cmp w25,w9
00b8c134	b.ne 0x00b8c1b4
00b8c138	mov w22,#0xffffff79
00b8c13c	tbnz w21,#0x10,0x00b8c074
00b8c140	sub w8,w8,#0x4
00b8c144	and w8,w8,#0xff
00b8c148	cmp w8,#0xd
00b8c14c	b.cc 0x00b8c17c
00b8c150	b 0x00b8c074
00b8c154	cmp w8,#0x10
00b8c158	b.ne 0x00b8c054
00b8c15c	b 0x00b8c17c
00b8c160	cmp w8,#0x4
00b8c164	b.eq 0x00b8c17c
00b8c168	cmp w8,#0x8
00b8c16c	b.eq 0x00b8c17c
00b8c170	sub w8,w8,#0xc
00b8c174	cmp w8,#0x4
00b8c178	b.hi 0x00b8c054
00b8c17c	ldr x1,[sp]
00b8c180	ldr w8,[x1, #0x4]
00b8c184	ldp x2,x3,[x1, #0x28]
00b8c188	cmp w8,#0xff
00b8c18c	cbz w20,0x00b8c1bc
00b8c190	b.hi 0x00b8c054
00b8c194	mov w8,#0x1
00b8c198	mov x0,x19
00b8c19c	str w8,[x0], #0x28
00b8c1a0	mov w4,w21
00b8c1a4	bl 0x00c42df0
00b8c1a8	mov w22,w0
00b8c1ac	cbnz w0,0x00b8c074
00b8c1b0	b 0x00b8c1dc
00b8c1b4	mov w22,#0xffffff7a
00b8c1b8	b 0x00b8c074
00b8c1bc	b.hi 0x00b8c054
00b8c1c0	mov w8,#0x1
00b8c1c4	mov x0,x19
00b8c1c8	str w8,[x0], #0x28
00b8c1cc	mov w4,w21
00b8c1d0	bl 0x00c42dd0
00b8c1d4	mov w22,w0
00b8c1d8	cbnz w0,0x00b8c074
00b8c1dc	ldr x0,[sp]
00b8c1e0	mov w21,#0x100
00b8c1e4	movk w21,#0x550, LSL #16
00b8c1e8	ldrh w8,[x0]
00b8c1ec	strh w8,[x19, #0x8]
00b8c1f0	bl 0x00c431e0
00b8c1f4	mov w8,#0x100
00b8c1f8	movk w8,#0x540, LSL #16
00b8c1fc	cmp w25,w8
00b8c200	mov w22,w0
00b8c204	b.eq 0x00b8c234
00b8c208	mov w8,#0x200
00b8c20c	movk w8,#0x540, LSL #16
00b8c210	cmp w25,w8
00b8c214	b.ne 0x00b8c220
00b8c218	add w21,w21,#0x100
00b8c21c	b 0x00b8c234
00b8c220	add w8,w24,#0x500
00b8c224	cmp w25,w8
00b8c228	mov w8,#0x500
00b8c22c	movk w8,#0x510, LSL #16
00b8c230	csel w21,w8,wzr,eq
00b8c234	ldrb w8,[x19, #0x20]
00b8c238	ubfiz w9,w20,#0x4,#0x1
00b8c23c	str w21,[x19, #0x4]
00b8c240	and w8,w8,#0xffffffef
00b8c244	orr w8,w8,w9
00b8c248	strb w8,[x19, #0x20]
00b8c24c	b 0x00b8c0a4
00b8c250	bl 0x00c2fec0
