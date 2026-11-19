; mbedtls_ecdsa_der_to_raw @ 00b7bf08
00b7bf08	sub sp,sp,#0x120
00b7bf0c	stp x28,x27,[sp, #0xc0]
00b7bf10	stp x26,x25,[sp, #0xd0]
00b7bf14	stp x24,x23,[sp, #0xe0]
00b7bf18	stp x22,x21,[sp, #0xf0]
00b7bf1c	stp x20,x19,[sp, #0x100]
00b7bf20	stp x29,x30,[sp, #0x110]
00b7bf24	add x29,sp,#0x110
00b7bf28	mrs x26,tpidr_el0
00b7bf2c	ldr x9,[x26, #0x28]
00b7bf30	add x8,x0,#0x7
00b7bf34	mov x19,x5
00b7bf38	mov x20,x3
00b7bf3c	mov x21,x2
00b7bf40	mov x22,x1
00b7bf44	cmp x8,#0x217
00b7bf48	mov w0,#0xffffff94
00b7bf4c	stur x9,[x29, #-0x60]
00b7bf50	str x1,[sp, #0x10]
00b7bf54	b.hi 0x00b7c0d8
00b7bf58	lsr x27,x8,#0x3
00b7bf5c	lsl x23,x27,#0x1
00b7bf60	cmp x23,x4
00b7bf64	b.hi 0x00b7c0d8
00b7bf68	add x1,x22,x21
00b7bf6c	add x0,sp,#0x10
00b7bf70	add x2,sp,#0x8
00b7bf74	orr w3,wzr,#0x30
00b7bf78	bl 0x00c41a70
00b7bf7c	cbnz w0,0x00b7c0d8
00b7bf80	add x0,sp,#0x2c
00b7bf84	mov w1,wzr
00b7bf88	mov x2,x23
00b7bf8c	bl 0x00c301c0
00b7bf90	ldp x8,x28,[sp, #0x8]
00b7bf94	add x0,sp,#0x20
00b7bf98	add x2,sp,#0x18
00b7bf9c	mov w3,#0x2
00b7bfa0	add x1,x28,x8
00b7bfa4	str x28,[sp, #0x20]
00b7bfa8	bl 0x00c41a70
00b7bfac	cbz w0,0x00b7c024
00b7bfb0	tbnz w0,#0x1f,0x00b7c0d8
00b7bfb4	ldp x9,x8,[sp, #0x8]
00b7bfb8	sxtw x10,w0
00b7bfbc	add x0,sp,#0x20
00b7bfc0	add x2,sp,#0x18
00b7bfc4	add x28,x8,x10
00b7bfc8	sub x10,x9,x10
00b7bfcc	add x1,x8,x9
00b7bfd0	mov w3,#0x2
00b7bfd4	stp x10,x28,[sp, #0x8]
00b7bfd8	str x28,[sp, #0x20]
00b7bfdc	bl 0x00c41a70
00b7bfe0	cbz w0,0x00b7c048
00b7bfe4	tbnz w0,#0x1f,0x00b7c0d8
00b7bfe8	ldp x9,x8,[sp, #0x8]
00b7bfec	sxtw x10,w0
00b7bff0	add x8,x8,x10
00b7bff4	sub x9,x9,x10
00b7bff8	stp x9,x8,[sp, #0x8]
00b7bffc	sub x8,x8,x22
00b7c000	cmp x8,x21
00b7c004	b.ne 0x00b7c06c
00b7c008	add x1,sp,#0x2c
00b7c00c	mov x0,x20
00b7c010	mov x2,x23
00b7c014	bl 0x00c2ffd0
00b7c018	mov w0,wzr
00b7c01c	str x23,[x19]
00b7c020	b 0x00b7c0d8
00b7c024	ldr x24,[sp, #0x18]
00b7c028	cbz x24,0x00b7c0d4
00b7c02c	ldr x25,[sp, #0x20]
00b7c030	ldrsb w8,[x25]
00b7c034	tbnz w8,#0x1f,0x00b7c0d4
00b7c038	cbz w8,0x00b7c074
00b7c03c	cmp x24,x27
00b7c040	b.ls 0x00b7c090
00b7c044	b 0x00b7c0d4
00b7c048	ldr x24,[sp, #0x18]
00b7c04c	cbz x24,0x00b7c0d4
00b7c050	ldr x25,[sp, #0x20]
00b7c054	ldrsb w8,[x25]
00b7c058	tbnz w8,#0x1f,0x00b7c0d4
00b7c05c	cbz w8,0x00b7c0bc
00b7c060	cmp x24,x27
00b7c064	b.hi 0x00b7c0d4
00b7c068	b 0x00b7c108
00b7c06c	mov w0,#0xffffff9a
00b7c070	b 0x00b7c0d8
00b7c074	add x25,x25,#0x1
00b7c078	subs x24,x24,#0x1
00b7c07c	stp x24,x25,[sp, #0x18]
00b7c080	b.eq 0x00b7c090
00b7c084	ldrb w8,[x25]
00b7c088	cbnz w8,0x00b7c03c
00b7c08c	b 0x00b7c0d4
00b7c090	sub x8,x27,x24
00b7c094	add x9,sp,#0x2c
00b7c098	add x0,x9,x8
00b7c09c	mov x1,x25
00b7c0a0	mov x2,x24
00b7c0a4	bl 0x00c2ffd0
00b7c0a8	add x8,x25,x24
00b7c0ac	sub w0,w8,w28
00b7c0b0	str x8,[sp, #0x20]
00b7c0b4	tbz w0,#0x1f,0x00b7bfb4
00b7c0b8	b 0x00b7c0d8
00b7c0bc	add x25,x25,#0x1
00b7c0c0	subs x24,x24,#0x1
00b7c0c4	stp x24,x25,[sp, #0x18]
00b7c0c8	b.eq 0x00b7c108
00b7c0cc	ldrb w8,[x25]
00b7c0d0	cbnz w8,0x00b7c060
00b7c0d4	mov w0,#0xffffff98
00b7c0d8	ldr x8,[x26, #0x28]
00b7c0dc	ldur x9,[x29, #-0x60]
00b7c0e0	cmp x8,x9
00b7c0e4	b.ne 0x00b7c138
00b7c0e8	ldp x29,x30,[sp, #0x110]
00b7c0ec	ldp x20,x19,[sp, #0x100]
00b7c0f0	ldp x22,x21,[sp, #0xf0]
00b7c0f4	ldp x24,x23,[sp, #0xe0]
00b7c0f8	ldp x26,x25,[sp, #0xd0]
00b7c0fc	ldp x28,x27,[sp, #0xc0]
00b7c100	add sp,sp,#0x120
00b7c104	ret
00b7c108	add x8,sp,#0x2c
00b7c10c	add x8,x8,x27
00b7c110	sub x9,x27,x24
00b7c114	add x0,x8,x9
00b7c118	mov x1,x25
00b7c11c	mov x2,x24
00b7c120	bl 0x00c2ffd0
00b7c124	add x8,x25,x24
00b7c128	sub w0,w8,w28
00b7c12c	str x8,[sp, #0x20]
00b7c130	tbz w0,#0x1f,0x00b7bfe8
00b7c134	b 0x00b7c0d8
00b7c138	bl 0x00c2fec0
