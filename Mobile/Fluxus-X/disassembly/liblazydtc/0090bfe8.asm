; FUN_0090bfe8 @ 0090bfe8
0090bfe8	sub sp,sp,#0xf0
0090bfec	str x25,[sp, #0xa0]
0090bff0	stp x24,x23,[sp, #0xb0]
0090bff4	stp x22,x21,[sp, #0xc0]
0090bff8	stp x20,x19,[sp, #0xd0]
0090bffc	stp x29,x30,[sp, #0xe0]
0090c000	add x29,sp,#0xe0
0090c004	mrs x25,tpidr_el0
0090c008	ldr x8,[x25, #0x28]
0090c00c	cmp x2,#0x0
0090c010	mov x21,x4
0090c014	mov x20,x0
0090c018	stur x8,[x29, #-0x48]
0090c01c	ldr w22,[x1, #0x4]
0090c020	add x8,sp,#0x8
0090c024	csel x19,x8,x2,eq
0090c028	cmp w3,#0x3
0090c02c	str w22,[x19]
0090c030	b.eq 0x0090c048
0090c034	cmp w3,#0x6
0090c038	b.ne 0x0090c054
0090c03c	mov w23,wzr
0090c040	mov w24,#0x1
0090c044	b 0x0090c05c
0090c048	orr w23,wzr,#0x6
0090c04c	mov w24,#0x1
0090c050	b 0x0090c05c
0090c054	mov w23,#0x11
0090c058	mov w24,#0x2
0090c05c	stp w24,w23,[x19, #0x4]
0090c060	ldr w8,[x1, #0x10]
0090c064	mov w9,#0x80
0090c068	add x0,x19,#0x10
0090c06c	cmp w8,#0x80
0090c070	csel w2,w8,w9,cc
0090c074	str w2,[x19, #0xc]
0090c078	ldr x1,[x1, #0x20]
0090c07c	bl 0x00c2ffd0
0090c080	ldr x8,[x20, #0x278]
0090c084	cbz x8,0x0090c0ec
0090c088	mov w1,#0x1
0090c08c	mov x0,x20
0090c090	bl 0x0092f198
0090c094	ldr x8,[x20, #0x278]
0090c098	ldr x0,[x20, #0x280]
0090c09c	mov w1,wzr
0090c0a0	mov x2,x19
0090c0a4	blr x8
0090c0a8	str w0,[x21]
0090c0ac	mov x0,x20
0090c0b0	mov w1,wzr
0090c0b4	bl 0x0092f198
0090c0b8	ldr w0,[x21]
0090c0bc	cmn w0,#0x1
0090c0c0	b.eq 0x0090c108
0090c0c4	ldr x8,[x20, #0x20]
0090c0c8	ldr w8,[x8, #0x568]
0090c0cc	cbz w8,0x0090c110
0090c0d0	ldr w9,[x19]
0090c0d4	mov w0,wzr
0090c0d8	cmp w9,#0xa
0090c0dc	b.ne 0x0090c114
0090c0e0	mov w0,wzr
0090c0e4	str w8,[x19, #0x28]
0090c0e8	b 0x0090c114
0090c0ec	mov w0,w22
0090c0f0	mov w1,w24
0090c0f4	mov w2,w23
0090c0f8	bl 0x00c31c70
0090c0fc	str w0,[x21]
0090c100	cmn w0,#0x1
0090c104	b.ne 0x0090c0c4
0090c108	orr w0,wzr,#0x7
0090c10c	b 0x0090c114
0090c110	mov w0,wzr
0090c114	ldr x8,[x25, #0x28]
0090c118	ldur x9,[x29, #-0x48]
0090c11c	cmp x8,x9
0090c120	b.ne 0x0090c140
0090c124	ldp x29,x30,[sp, #0xe0]
0090c128	ldp x20,x19,[sp, #0xd0]
0090c12c	ldp x22,x21,[sp, #0xc0]
0090c130	ldp x24,x23,[sp, #0xb0]
0090c134	ldr x25,[sp, #0xa0]
0090c138	add sp,sp,#0xf0
0090c13c	ret
0090c140	bl 0x00c2fec0
