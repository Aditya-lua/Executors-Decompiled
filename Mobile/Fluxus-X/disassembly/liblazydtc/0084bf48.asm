; FUN_0084bf48 @ 0084bf48
0084bf48	stp x29,x30,[sp, #-0x40]!
0084bf4c	str x23,[sp, #0x10]
0084bf50	stp x22,x21,[sp, #0x20]
0084bf54	stp x20,x19,[sp, #0x30]
0084bf58	mov x29,sp
0084bf5c	ldp x8,x9,[x0, #0x8]
0084bf60	mov x19,x0
0084bf64	cmp x9,x8
0084bf68	b.eq 0x0084c038
0084bf6c	mov x20,x19
0084bf70	mov x13,#0xc30d
0084bf74	ldr x10,[x20, #0x28]!
0084bf78	ldur x11,[x20, #-0x8]
0084bf7c	movk x13,#0xc30, LSL #16
0084bf80	add x10,x10,x11
0084bf84	lsr x12,x11,#0x1
0084bf88	movk x13,#0x30c3, LSL #32
0084bf8c	lsr x14,x10,#0x1
0084bf90	movk x13,#0xc30c, LSL #48
0084bf94	umulh x12,x12,x13
0084bf98	umulh x13,x14,x13
0084bf9c	mov w14,#0x2a
0084bfa0	lsr x12,x12,#0x4
0084bfa4	lsr x13,x13,#0x4
0084bfa8	msub x11,x12,x14,x11
0084bfac	add x21,x8,x12, LSL #0x3
0084bfb0	mov w12,#0x60
0084bfb4	msub x10,x13,x14,x10
0084bfb8	ldr x14,[x21]
0084bfbc	nop
0084bfc0	madd x23,x11,x12,x14
0084bfc4	ldr x11,[x8, x13, LSL #0x3]
0084bfc8	nop
0084bfcc	madd x22,x10,x12,x11
0084bfd0	cmp x23,x22
0084bfd4	b.ne 0x0084bfe4
0084bfd8	b 0x0084c03c
0084bfdc	cmp x23,x22
0084bfe0	b.eq 0x0084c030
0084bfe4	ldr x0,[x23, #0x38]
0084bfe8	cbz x0,0x0084bffc
0084bfec	ldr x8,[x23, #0x48]
0084bff0	str x0,[x23, #0x40]
0084bff4	sub x1,x8,x0
0084bff8	bl 0x00c2fe80
0084bffc	ldr x0,[x23, #0x20]
0084c000	cbz x0,0x0084c014
0084c004	ldr x8,[x23, #0x30]
0084c008	str x0,[x23, #0x28]
0084c00c	sub x1,x8,x0
0084c010	bl 0x00c2fe80
0084c014	ldr x8,[x21]
0084c018	add x23,x23,#0x60
0084c01c	sub x8,x23,x8
0084c020	cmp x8,#0xfc0
0084c024	b.ne 0x0084bfdc
0084c028	ldr x23,[x21, #0x8]!
0084c02c	b 0x0084bfdc
0084c030	ldp x8,x9,[x19, #0x8]
0084c034	b 0x0084c03c
0084c038	add x20,x19,#0x28
0084c03c	sub x9,x9,x8
0084c040	str xzr,[x20]
0084c044	asr x9,x9,#0x3
0084c048	cmp x9,#0x3
0084c04c	b.cc 0x0084c078
0084c050	ldr x0,[x8]
0084c054	mov w1,#0xfc0
0084c058	bl 0x00c2fe80
0084c05c	ldp x8,x9,[x19, #0x8]
0084c060	add x8,x8,#0x8
0084c064	sub x9,x9,x8
0084c068	str x8,[x19, #0x8]
0084c06c	asr x9,x9,#0x3
0084c070	cmp x9,#0x2
0084c074	b.hi 0x0084c050
0084c078	cmp x9,#0x1
0084c07c	b.eq 0x0084c090
0084c080	cmp x9,#0x2
0084c084	b.ne 0x0084c098
0084c088	mov w8,#0x2a
0084c08c	b 0x0084c094
0084c090	mov w8,#0x15
0084c094	str x8,[x19, #0x20]
0084c098	ldp x20,x19,[sp, #0x30]
0084c09c	ldr x23,[sp, #0x10]
0084c0a0	ldp x22,x21,[sp, #0x20]
0084c0a4	ldp x29,x30,[sp], #0x40
0084c0a8	ret
