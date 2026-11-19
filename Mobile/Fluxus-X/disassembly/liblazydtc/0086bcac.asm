; FUN_0086bcac @ 0086bcac
0086bcac	sub sp,sp,#0x100
0086bcb0	stp x29,x30,[sp, #0xa0]
0086bcb4	stp x28,x27,[sp, #0xb0]
0086bcb8	stp x26,x25,[sp, #0xc0]
0086bcbc	stp x24,x23,[sp, #0xd0]
0086bcc0	stp x22,x21,[sp, #0xe0]
0086bcc4	stp x20,x19,[sp, #0xf0]
0086bcc8	add x29,sp,#0xa0
0086bccc	mrs x26,tpidr_el0
0086bcd0	mov w22,w2
0086bcd4	mov x19,x0
0086bcd8	ldr x8,[x26, #0x28]
0086bcdc	mov x20,x1
0086bce0	stur x8,[x29, #-0x8]
0086bce4	ldr w8,[x0, #0x90]
0086bce8	sub w9,w8,#0x116
0086bcec	cmp w9,#0x2
0086bcf0	b.cc 0x0086bd20
0086bcf4	cmp w8,#0x7b
0086bcf8	b.eq 0x0086bdd0
0086bcfc	cmp w8,#0x28
0086bd00	b.ne 0x0086be8c
0086bd04	ldr w8,[x20, #0x14]
0086bd08	ldr w9,[x19, #0x94]
0086bd0c	ldur x25,[x19, #0x9c]
0086bd10	cmp w8,w9
0086bd14	b.ne 0x0086bec8
0086bd18	mov w8,#0x28
0086bd1c	b 0x0086bed4
0086bd20	ldur q0,[x19, #0x94]
0086bd24	mov x0,x19
0086bd28	stur q0,[x29, #-0x30]
0086bd2c	bl 0x0086d048
0086bd30	ldr x23,[x19, #0xe8]
0086bd34	ldur x8,[x20, #0xc]
0086bd38	mov x21,x0
0086bd3c	ldur x9,[x0, #0x14]
0086bd40	mov w1,#0x8
0086bd44	mov x0,x23
0086bd48	stp x8,x9,[x29, #-0x48]
0086bd4c	bl 0x0084e938
0086bd50	mov w8,#0x1
0086bd54	str x21,[x0]
0086bd58	mov w1,#0x60
0086bd5c	stp x0,x8,[sp, #0x48]
0086bd60	mov x0,x23
0086bd64	stp xzr,xzr,[sp, #0x38]
0086bd68	bl 0x0084e938
0086bd6c	sub x1,x29,#0x48
0086bd70	add x3,sp,#0x48
0086bd74	and w4,w22,#0x1
0086bd78	add x6,sp,#0x38
0086bd7c	sub x7,x29,#0x30
0086bd80	mov x2,x20
0086bd84	mov w5,wzr
0086bd88	mov x23,x0
0086bd8c	bl 0x0084edd0
0086bd90	ldrb w8,[x19, #0x68]
0086bd94	cmp w8,#0x1
0086bd98	b.ne 0x0086c188
0086bd9c	ldr x0,[x19, #0xe8]
0086bda0	mov w1,#0x30
0086bda4	bl 0x0084e938
0086bda8	mov x1,#-0x1
0086bdac	mov x2,#-0x1
0086bdb0	mov x3,xzr
0086bdb4	mov x4,xzr
0086bdb8	mov x20,x0
0086bdbc	bl 0x00851df0
0086bdc0	stur x23,[x29, #-0x48]
0086bdc4	add x0,x19,#0x4b0
0086bdc8	sub x1,x29,#0x48
0086bdcc	b 0x0086be80
0086bdd0	ldur x24,[x19, #0x9c]
0086bdd4	mov x0,x19
0086bdd8	bl 0x0086d1b8
0086bddc	ldr x23,[x19, #0xe8]
0086bde0	ldur x8,[x20, #0xc]
0086bde4	mov x21,x0
0086bde8	ldur x9,[x0, #0x14]
0086bdec	ldr x25,[x19, #0xb8]
0086bdf0	mov w1,#0x8
0086bdf4	mov x0,x23
0086bdf8	stp x8,x9,[x29, #-0x30]
0086bdfc	bl 0x0084e938
0086be00	mov w8,#0x1
0086be04	str x21,[x0]
0086be08	mov w1,#0x60
0086be0c	stp x0,x8,[x29, #-0x48]
0086be10	mov x0,x23
0086be14	stp xzr,xzr,[sp, #0x48]
0086be18	stp x24,x25,[sp, #0x38]
0086be1c	bl 0x0084e938
0086be20	sub x1,x29,#0x30
0086be24	sub x3,x29,#0x48
0086be28	and w4,w22,#0x1
0086be2c	add x6,sp,#0x48
0086be30	add x7,sp,#0x38
0086be34	mov x2,x20
0086be38	mov w5,#0x1
0086be3c	mov x23,x0
0086be40	bl 0x0084edd0
0086be44	ldrb w8,[x19, #0x68]
0086be48	cmp w8,#0x1
0086be4c	b.ne 0x0086c188
0086be50	ldr x0,[x19, #0xe8]
0086be54	mov w1,#0x30
0086be58	bl 0x0084e938
0086be5c	mov x1,#-0x1
0086be60	mov x2,#-0x1
0086be64	mov x3,xzr
0086be68	mov x4,xzr
0086be6c	mov x20,x0
0086be70	bl 0x00851df0
0086be74	add x0,x19,#0x4b0
0086be78	sub x1,x29,#0x30
0086be7c	stur x23,[x29, #-0x30]
0086be80	bl 0x00860fa0
0086be84	str x20,[x0]
0086be88	b 0x0086c188
0086be8c	ldr x8,[x26, #0x28]
0086be90	ldur x9,[x29, #-0x8]
0086be94	cmp x8,x9
0086be98	b.ne 0x0086c2c4
0086be9c	and w2,w22,#0x1
0086bea0	mov x0,x19
0086bea4	mov x1,x20
0086bea8	ldp x20,x19,[sp, #0xf0]
0086beac	ldp x22,x21,[sp, #0xe0]
0086beb0	ldp x24,x23,[sp, #0xd0]
0086beb4	ldp x26,x25,[sp, #0xc0]
0086beb8	ldp x28,x27,[sp, #0xb0]
0086bebc	ldp x29,x30,[sp, #0xa0]
0086bec0	add sp,sp,#0x100
0086bec4	b 0x0086db28
0086bec8	mov x0,x19
0086becc	bl 0x0086bc9c
0086bed0	ldr w8,[x19, #0x90]
0086bed4	ldur x21,[x19, #0x94]
0086bed8	mov x0,x19
0086bedc	stur w8,[x29, #-0x14]
0086bee0	stur x21,[x29, #-0x10]
0086bee4	bl 0x00858f2c
0086bee8	ldr x8,[x19, #0x2a8]
0086beec	ldr x9,[x19, #0x2a0]
0086bef0	ldr x10,[x19, #0x458]
0086bef4	ldr x11,[x19, #0x450]
0086bef8	str x21,[sp, #0x10]
0086befc	sub x8,x8,x9
0086bf00	add x9,x19,#0x2a0
0086bf04	asr x8,x8,#0x3
0086bf08	sub x10,x10,x11
0086bf0c	stp xzr,x9,[x29, #-0x38]
0086bf10	asr x9,x10,#0x3
0086bf14	add x11,x19,#0x450
0086bf18	stp x8,xzr,[x29, #-0x28]
0086bf1c	ldr w8,[x19, #0x90]
0086bf20	stp x11,x9,[x29, #-0x48]
0086bf24	cmp w8,#0x29
0086bf28	b.ne 0x0086bf34
0086bf2c	ldur x27,[x19, #0x9c]
0086bf30	b 0x0086bf60
0086bf34	ldrb w8,[x19, #0x68]
0086bf38	cmp w8,#0x0
0086bf3c	sub x8,x29,#0x48
0086bf40	csel x2,x8,xzr,ne
0086bf44	sub x1,x29,#0x30
0086bf48	mov x0,x19
0086bf4c	bl 0x00861848
0086bf50	ldr w8,[x19, #0x90]
0086bf54	ldur x27,[x19, #0x9c]
0086bf58	cmp w8,#0x29
0086bf5c	b.ne 0x0086bf70
0086bf60	mov x0,x19
0086bf64	bl 0x00858f2c
0086bf68	mov w24,#0x1
0086bf6c	b 0x0086bf98
0086bf70	sub x2,x29,#0x14
0086bf74	mov x0,x19
0086bf78	mov w1,#0x29
0086bf7c	mov x3,xzr
0086bf80	bl 0x0086b5f8
0086bf84	mov x0,x19
0086bf88	mov w1,#0x29
0086bf8c	mov w3,wzr
0086bf90	bl 0x0086e434
0086bf94	mov w24,w0
0086bf98	ldur x8,[x20, #0xc]
0086bf9c	ldur x28,[x29, #-0x20]
0086bfa0	ldr x23,[x19, #0xe8]
0086bfa4	stp x8,x27,[sp, #0x48]
0086bfa8	cbz x28,0x0086c018
0086bfac	str w24,[sp, #0xc]
0086bfb0	mov x24,x25
0086bfb4	lsl x1,x28,#0x3
0086bfb8	ldp x8,x25,[x29, #-0x30]
0086bfbc	ldr x21,[x8]
0086bfc0	mov x0,x23
0086bfc4	bl 0x0084e938
0086bfc8	cmp x28,#0x8
0086bfcc	b.cc 0x0086bfe4
0086bfd0	lsl x8,x25,#0x3
0086bfd4	add x10,x8,x21
0086bfd8	sub x8,x0,x10
0086bfdc	cmp x8,#0x20
0086bfe0	b.cs 0x0086c1bc
0086bfe4	mov x8,xzr
0086bfe8	lsl x10,x8,#0x3
0086bfec	sub x8,x28,x8
0086bff0	add x9,x10,x25, LSL #0x3
0086bff4	add x10,x0,x10
0086bff8	add x9,x21,x9
0086bffc	ldr x11,[x9], #0x8
0086c000	subs x8,x8,#0x1
0086c004	str x11,[x10], #0x8
0086c008	b.ne 0x0086bffc
0086c00c	mov x25,x24
0086c010	ldr w24,[sp, #0xc]
0086c014	b 0x0086c01c
0086c018	mov x0,xzr
0086c01c	stp x0,x28,[sp, #0x38]
0086c020	stp xzr,xzr,[sp, #0x28]
0086c024	stp x25,x27,[sp, #0x18]
0086c028	mov x0,x23
0086c02c	mov w1,#0x60
0086c030	bl 0x0084e938
0086c034	add x1,sp,#0x48
0086c038	add x3,sp,#0x38
0086c03c	and w4,w22,#0x1
0086c040	add x6,sp,#0x28
0086c044	add x7,sp,#0x18
0086c048	mov x2,x20
0086c04c	mov w5,wzr
0086c050	mov x23,x0
0086c054	bl 0x0084edd0
0086c058	ldrb w8,[x19, #0x68]
0086c05c	cmp w8,#0x1
0086c060	b.ne 0x0086c118
0086c064	ldr x8,[x19, #0xb0]
0086c068	ldur x20,[x29, #-0x38]
0086c06c	tst w24,#0x1
0086c070	ldr x25,[x19, #0xe8]
0086c074	csinv x22,x8,xzr,ne
0086c078	cbz x20,0x0086c0dc
0086c07c	ldp x8,x27,[x29, #-0x48]
0086c080	lsl x1,x20,#0x3
0086c084	ldr x21,[x8]
0086c088	mov x0,x25
0086c08c	bl 0x0084e938
0086c090	mov x24,x0
0086c094	cmp x20,#0x8
0086c098	b.cc 0x0086c0b0
0086c09c	lsl x8,x27,#0x3
0086c0a0	add x10,x8,x21
0086c0a4	sub x8,x24,x10
0086c0a8	cmp x8,#0x20
0086c0ac	b.cs 0x0086c1f0
0086c0b0	mov x8,xzr
0086c0b4	lsl x10,x8,#0x3
0086c0b8	sub x8,x20,x8
0086c0bc	add x9,x10,x27, LSL #0x3
0086c0c0	add x10,x24,x10
0086c0c4	add x9,x21,x9
0086c0c8	ldr x11,[x9], #0x8
0086c0cc	subs x8,x8,#0x1
0086c0d0	str x11,[x10], #0x8
0086c0d4	b.ne 0x0086c0c8
0086c0d8	b 0x0086c0e0
0086c0dc	mov x24,xzr
0086c0e0	mov x0,x25
0086c0e4	mov w1,#0x30
0086c0e8	bl 0x0084e938
0086c0ec	ldr x1,[sp, #0x10]
0086c0f0	mov x2,x22
0086c0f4	mov x3,x24
0086c0f8	mov x4,x20
0086c0fc	mov x25,x0
0086c100	bl 0x00851df0
0086c104	str x23,[sp, #0x48]
0086c108	add x0,x19,#0x4b0
0086c10c	add x1,sp,#0x48
0086c110	bl 0x00860fa0
0086c114	str x25,[x0]
0086c118	ldp x21,x9,[x29, #-0x48]
0086c11c	ldp x10,x8,[x21]
0086c120	add x19,x10,x9, LSL #0x3
0086c124	cmp x19,x8
0086c128	b.eq 0x0086c150
0086c12c	sub x9,x8,x19
0086c130	add x1,x19,x9
0086c134	subs x20,x8,x1
0086c138	b.eq 0x0086c148
0086c13c	mov x0,x19
0086c140	mov x2,x20
0086c144	bl 0x00c2ff60
0086c148	add x8,x19,x20
0086c14c	str x8,[x21, #0x8]
0086c150	ldp x21,x9,[x29, #-0x30]
0086c154	ldp x10,x8,[x21]
0086c158	add x19,x10,x9, LSL #0x3
0086c15c	cmp x19,x8
0086c160	b.eq 0x0086c188
0086c164	sub x9,x8,x19
0086c168	add x1,x19,x9
0086c16c	subs x20,x8,x1
0086c170	b.eq 0x0086c180
0086c174	mov x0,x19
0086c178	mov x2,x20
0086c17c	bl 0x00c2ff60
0086c180	add x8,x19,x20
0086c184	str x8,[x21, #0x8]
0086c188	ldr x8,[x26, #0x28]
0086c18c	ldur x9,[x29, #-0x8]
0086c190	cmp x8,x9
0086c194	b.ne 0x0086c2c4
0086c198	mov x0,x23
0086c19c	ldp x20,x19,[sp, #0xf0]
0086c1a0	ldp x22,x21,[sp, #0xe0]
0086c1a4	ldp x24,x23,[sp, #0xd0]
0086c1a8	ldp x26,x25,[sp, #0xc0]
0086c1ac	ldp x28,x27,[sp, #0xb0]
0086c1b0	ldp x29,x30,[sp, #0xa0]
0086c1b4	add sp,sp,#0x100
0086c1b8	ret
0086c1bc	and x8,x28,#-0x4
0086c1c0	add x9,x0,#0x10
0086c1c4	add x10,x10,#0x10
0086c1c8	mov x11,x8
0086c1cc	ldp q0,q1,[x10, #-0x10]
0086c1d0	subs x11,x11,#0x4
0086c1d4	add x10,x10,#0x20
0086c1d8	stp q0,q1,[x9, #-0x10]
0086c1dc	add x9,x9,#0x20
0086c1e0	b.ne 0x0086c1cc
0086c1e4	cmp x28,x8
0086c1e8	b.eq 0x0086c00c
0086c1ec	b 0x0086bfe8
0086c1f0	and x8,x20,#-0x4
0086c1f4	add x9,x24,#0x10
0086c1f8	add x10,x10,#0x10
0086c1fc	mov x11,x8
0086c200	ldp q0,q1,[x10, #-0x10]
0086c204	subs x11,x11,#0x4
0086c208	add x10,x10,#0x20
0086c20c	stp q0,q1,[x9, #-0x10]
0086c210	add x9,x9,#0x20
0086c214	b.ne 0x0086c200
0086c218	cmp x20,x8
0086c21c	b.eq 0x0086c0e0
0086c220	b 0x0086c0b4
0086c2c4	bl 0x00c2fec0
