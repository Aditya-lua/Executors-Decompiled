; EVP_PKEY_copy_parameters @ 00a6be6c
00a6be6c	sub sp,sp,#0x30
00a6be70	stp x20,x19,[sp, #0x10]
00a6be74	stp x29,x30,[sp, #0x20]
00a6be78	str xzr,[sp, #0x8]
00a6be7c	ldr w8,[x0]
00a6be80	mov x19,x0
00a6be84	mov x20,x1
00a6be88	add x29,sp,#0x20
00a6be8c	cbz w8,0x00a6beec
00a6be90	ldr x9,[x19, #0x60]
00a6be94	cbnz x9,0x00a6bef4
00a6be98	ldr x9,[x20, #0x60]
00a6be9c	cbz x9,0x00a6bebc
00a6bea0	add x0,sp,#0x8
00a6bea4	mov x1,x20
00a6bea8	bl 0x00a6c140
00a6beac	cbz w0,0x00a6c0bc
00a6beb0	ldr w8,[x19]
00a6beb4	ldr x20,[sp, #0x8]
00a6beb8	cbz w8,0x00a6beec
00a6bebc	ldr x9,[x19, #0x60]
00a6bec0	cbnz x9,0x00a6bef4
00a6bec4	ldr w9,[x20]
00a6bec8	cmp w8,w9
00a6becc	b.eq 0x00a6bef8
00a6bed0	bl 0x00c342a0
00a6bed4	adrp x0,0x2c1000
00a6bed8	adrp x2,0x2ad000
00a6bedc	add x0,x0,#0xcf9
00a6bee0	add x2,x2,#0xc9d
00a6bee4	mov w1,#0xa0
00a6bee8	b 0x00a6c130
00a6beec	ldr x8,[x19, #0x60]
00a6bef0	cbz x8,0x00a6bfec
00a6bef4	cbz x20,0x00a6bf5c
00a6bef8	ldr x8,[x20, #0x60]
00a6befc	cbz x8,0x00a6bf40
00a6bf00	mov w1,#0x4
00a6bf04	mov x0,x20
00a6bf08	bl 0x00c37d30
00a6bf0c	cmp w0,#0x0
00a6bf10	cset w0,eq
00a6bf14	cbz w0,0x00a6bf5c
00a6bf18	bl 0x00c342a0
00a6bf1c	adrp x0,0x2c1000
00a6bf20	adrp x2,0x2ad000
00a6bf24	add x0,x0,#0xcf9
00a6bf28	add x2,x2,#0xc9d
00a6bf2c	mov w1,#0xa6
00a6bf30	bl 0x00c342b0
00a6bf34	orr w0,wzr,#0x6
00a6bf38	mov w1,#0x67
00a6bf3c	b 0x00a6c080
00a6bf40	ldr x8,[x20, #0x8]
00a6bf44	cbz x8,0x00a6bf5c
00a6bf48	ldr x8,[x8, #0x80]
00a6bf4c	cbz x8,0x00a6bf5c
00a6bf50	mov x0,x20
00a6bf54	blr x8
00a6bf58	cbnz w0,0x00a6bf18
00a6bf5c	ldr x8,[x19, #0x60]
00a6bf60	cbz x8,0x00a6bfa0
00a6bf64	mov w1,#0x4
00a6bf68	mov x0,x19
00a6bf6c	bl 0x00c37d30
00a6bf70	cmp w0,#0x0
00a6bf74	cset w0,eq
00a6bf78	ldr x8,[x19, #0x60]
00a6bf7c	cbz w0,0x00a6bfc0
00a6bf80	cbz x8,0x00a6c098
00a6bf84	ldr x9,[x20, #0x60]
00a6bf88	cbz x9,0x00a6c090
00a6bf8c	mov w2,#0x4
00a6bf90	mov x0,x19
00a6bf94	mov x1,x20
00a6bf98	bl 0x00c3d2f0
00a6bf9c	b 0x00a6c0b4
00a6bfa0	ldr x8,[x19, #0x8]
00a6bfa4	cbz x8,0x00a6bfc4
00a6bfa8	ldr x8,[x8, #0x80]
00a6bfac	cbz x8,0x00a6bfc4
00a6bfb0	mov x0,x19
00a6bfb4	blr x8
00a6bfb8	ldr x8,[x19, #0x60]
00a6bfbc	cbnz w0,0x00a6bf80
00a6bfc0	cbnz x8,0x00a6bfcc
00a6bfc4	ldr x8,[x20, #0x60]
00a6bfc8	cbz x8,0x00a6c028
00a6bfcc	mov w2,#0x4
00a6bfd0	mov x0,x19
00a6bfd4	mov x1,x20
00a6bfd8	bl 0x00a6c90c
00a6bfdc	cmp w0,#0x1
00a6bfe0	b.ne 0x00a6c05c
00a6bfe4	mov w19,#0x1
00a6bfe8	b 0x00a6c0c0
00a6bfec	ldr w2,[x20]
00a6bff0	ldr x1,[x20, #0x60]
00a6bff4	cbz w2,0x00a6c018
00a6bff8	cbnz x1,0x00a6c018
00a6bffc	mov w4,#0xffffffff
00a6c000	mov x0,x19
00a6c004	mov x3,xzr
00a6c008	mov x5,xzr
00a6c00c	bl 0x00a6d2f4
00a6c010	cbnz w0,0x00a6bef8
00a6c014	b 0x00a6c0bc
00a6c018	mov x0,x19
00a6c01c	bl 0x00a6c3fc
00a6c020	cbnz w0,0x00a6bef8
00a6c024	b 0x00a6c0bc
00a6c028	ldr w8,[x19]
00a6c02c	ldr w9,[x20]
00a6c030	cmp w8,w9
00a6c034	b.ne 0x00a6c05c
00a6c038	ldr x8,[x19, #0x8]
00a6c03c	cbz x8,0x00a6c05c
00a6c040	ldr x8,[x8, #0x90]
00a6c044	cbz x8,0x00a6c05c
00a6c048	mov x0,x19
00a6c04c	mov x1,x20
00a6c050	blr x8
00a6c054	cmp w0,#0x1
00a6c058	b.eq 0x00a6bfe4
00a6c05c	bl 0x00c342a0
00a6c060	adrp x0,0x2c1000
00a6c064	adrp x2,0x2ad000
00a6c068	add x0,x0,#0xcf9
00a6c06c	add x2,x2,#0xc9d
00a6c070	mov w1,#0xae
00a6c074	bl 0x00c342b0
00a6c078	orr w0,wzr,#0x6
00a6c07c	mov w1,#0x99
00a6c080	mov x2,xzr
00a6c084	bl 0x00c342c0
00a6c088	mov w19,wzr
00a6c08c	b 0x00a6c0c0
00a6c090	ldr x9,[x19, #0x68]
00a6c094	cbz x9,0x00a6c0dc
00a6c098	ldr x8,[x20, #0x8]
00a6c09c	cbz x8,0x00a6c0bc
00a6c0a0	ldr x8,[x8, #0x88]
00a6c0a4	cbz x8,0x00a6c0bc
00a6c0a8	mov x0,x19
00a6c0ac	mov x1,x20
00a6c0b0	blr x8
00a6c0b4	mov w19,w0
00a6c0b8	b 0x00a6c0c0
00a6c0bc	mov w19,wzr
00a6c0c0	ldr x0,[sp, #0x8]
00a6c0c4	bl 0x00a6c7fc
00a6c0c8	mov w0,w19
00a6c0cc	ldp x29,x30,[sp, #0x20]
00a6c0d0	ldp x20,x19,[sp, #0x10]
00a6c0d4	add sp,sp,#0x30
00a6c0d8	ret
00a6c0dc	mov x2,sp
00a6c0e0	mov x0,x20
00a6c0e4	mov x1,xzr
00a6c0e8	mov x3,xzr
00a6c0ec	str x8,[sp]
00a6c0f0	bl 0x00a6c550
00a6c0f4	cbz x0,0x00a6c118
00a6c0f8	mov x1,x0
00a6c0fc	ldr x0,[x19, #0x60]
00a6c100	mov w2,#0x4
00a6c104	bl 0x00c3d360
00a6c108	cmp x0,#0x0
00a6c10c	str x0,[x19, #0x68]
00a6c110	cset w19,ne
00a6c114	b 0x00a6c0c0
00a6c118	bl 0x00c342a0
00a6c11c	adrp x0,0x2c1000
00a6c120	adrp x2,0x2ad000
00a6c124	add x0,x0,#0xcf9
00a6c128	add x2,x2,#0xc9d
00a6c12c	mov w1,#0xca
00a6c130	bl 0x00c342b0
00a6c134	orr w0,wzr,#0x6
00a6c138	mov w1,#0x65
00a6c13c	b 0x00a6c080
