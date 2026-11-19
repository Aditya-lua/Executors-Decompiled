; FUN_00c2be38 @ 00c2be38
00c2be38	paciasp
00c2be3c	sub sp,sp,#0xb0
00c2be40	stp x29,x30,[sp, #0x50]
00c2be44	str x27,[sp, #0x60]
00c2be48	stp x26,x25,[sp, #0x70]
00c2be4c	stp x24,x23,[sp, #0x80]
00c2be50	stp x22,x21,[sp, #0x90]
00c2be54	stp x20,x19,[sp, #0xa0]
00c2be58	add x29,sp,#0x50
00c2be5c	mov x19,x1
00c2be60	mov x1,x0
00c2be64	mov x21,x2
00c2be68	mov x0,x19
00c2be6c	bl 0x00c2c354
00c2be70	mov w16,#0x1
00c2be74	hint 0x28
00c2be78	mov x20,x16
00c2be7c	cmp x16,#0x1
00c2be80	b.ne 0x00c2be98
00c2be84	mov x0,x19
00c2be88	bl 0x00c2c578
00c2be8c	cbz w0,0x00c2c020
00c2be90	add x23,x21,#0x18
00c2be94	b 0x00c2bf64
00c2be98	mov x0,x19
00c2be9c	mrs x24,sreg(0x3, 0x3, c0x2, c0x5, 0x1)
00c2bea0	bl 0x00c2c578
00c2bea4	cbz w0,0x00c2c020
00c2bea8	add x23,x21,#0x18
00c2beac	cbz x24,0x00c2bf64
00c2beb0	mov w25,#0x2
00c2beb4	mov w26,#0x8
00c2beb8	mov w27,#0x6
00c2bebc	mov w22,#0x2
00c2bec0	b 0x00c2bed8
00c2bec4	mov x0,x19
00c2bec8	bl 0x00c2c578
00c2becc	add w22,w22,#0x1
00c2bed0	add w26,w26,#0x8
00c2bed4	cbz w0,0x00c2c020
00c2bed8	tbnz w0,#0x1f,0x00c2c068
00c2bedc	add x2,x29,#0x18
00c2bee0	mov x0,x19
00c2bee4	mov w1,#0xfffffffe
00c2bee8	bl 0x00c2c3fc
00c2beec	add x1,sp,#0x8
00c2bef0	mov x0,x19
00c2bef4	bl 0x00c2c58c
00c2bef8	cbnz w0,0x00c2c068
00c2befc	mov x2,sp
00c2bf00	mov x0,x19
00c2bf04	mov w1,#0xffffffff
00c2bf08	bl 0x00c2c3fc
00c2bf0c	ldr x8,[x24, w26, UXTW #0x0]
00c2bf10	ldr x9,[sp]
00c2bf14	cmp x9,x8
00c2bf18	b.ne 0x00c2c068
00c2bf1c	ldr x8,[sp, #0x20]
00c2bf20	cbz x8,0x00c2bec4
00c2bf24	ldr x9,[x29, #0x18]
00c2bf28	ldr x10,[x21, #0x18]
00c2bf2c	mov w0,#0x1
00c2bf30	ldr x2,[x21]
00c2bf34	mov x3,x21
00c2bf38	mov x4,x19
00c2bf3c	cmp x9,x10
00c2bf40	csel w1,w27,w25,eq
00c2bf44	blr x8
00c2bf48	cmp w0,#0x8
00c2bf4c	b.ne 0x00c2c028
00c2bf50	ldr x8,[x29, #0x18]
00c2bf54	ldr x9,[x23]
00c2bf58	cmp x8,x9
00c2bf5c	b.ne 0x00c2bec4
00c2bf60	b 0x00c2bfec
00c2bf64	mov w24,#0x2
00c2bf68	mov w25,#0x6
00c2bf6c	mov w22,#0x2
00c2bf70	b 0x00c2bf84
00c2bf74	mov x0,x19
00c2bf78	bl 0x00c2c578
00c2bf7c	add w22,w22,#0x1
00c2bf80	cbz w0,0x00c2c020
00c2bf84	tbnz w0,#0x1f,0x00c2c068
00c2bf88	add x2,x29,#0x18
00c2bf8c	mov x0,x19
00c2bf90	mov w1,#0xfffffffe
00c2bf94	bl 0x00c2c3fc
00c2bf98	add x1,sp,#0x8
00c2bf9c	mov x0,x19
00c2bfa0	bl 0x00c2c58c
00c2bfa4	cbnz w0,0x00c2c068
00c2bfa8	ldr x8,[sp, #0x20]
00c2bfac	cbz x8,0x00c2bf74
00c2bfb0	ldr x9,[x29, #0x18]
00c2bfb4	ldr x10,[x21, #0x18]
00c2bfb8	mov w0,#0x1
00c2bfbc	ldr x2,[x21]
00c2bfc0	mov x3,x21
00c2bfc4	mov x4,x19
00c2bfc8	cmp x9,x10
00c2bfcc	csel w1,w25,w24,eq
00c2bfd0	blr x8
00c2bfd4	cmp w0,#0x8
00c2bfd8	b.ne 0x00c2c028
00c2bfdc	ldr x8,[x29, #0x18]
00c2bfe0	ldr x9,[x23]
00c2bfe4	cmp x8,x9
00c2bfe8	b.ne 0x00c2bf74
00c2bfec	adrp x19,0xcb4000
00c2bff0	adrp x1,0x2a1000
00c2bff4	add x1,x1,#0x45d
00c2bff8	ldr x19,[x19, #0xba0]
00c2bffc	adrp x2,0x2b6000
00c2c000	add x2,x2,#0xbf9
00c2c004	adrp x3,0x2c4000
00c2c008	add x3,x3,#0xa4a
00c2c00c	add x0,x19,#0x130
00c2c010	bl 0x00c30940
00c2c014	add x0,x19,#0x130
00c2c018	bl 0x00c30c50
00c2c01c	bl 0x00c30b40
00c2c020	mov w0,#0x5
00c2c024	b 0x00c2c06c
00c2c028	cmp w0,#0x7
00c2c02c	b.ne 0x00c2c068
00c2c030	cmp x20,#0x1
00c2c034	b.eq 0x00c2c04c
00c2c038	cbz w22,0x00c2c04c
00c2c03c	mov x8,xzr
00c2c040	subs w22,w22,#0x1
00c2c044	sysl x8,0x3,0x7,0x7,0x1
00c2c048	b.ne 0x00c2c03c
00c2c04c	mov x0,x19
00c2c050	bl 0x00c2c344
00c2c054	mov x19,x0
00c2c058	bl 0x00c2c334
00c2c05c	mov x8,x0
00c2c060	mov x0,x19
00c2c064	br x8
00c2c068	mov w0,#0x2
00c2c06c	ldp x20,x19,[sp, #0xa0]
00c2c070	ldr x27,[sp, #0x60]
00c2c074	ldp x22,x21,[sp, #0x90]
00c2c078	ldp x24,x23,[sp, #0x80]
00c2c07c	ldp x26,x25,[sp, #0x70]
00c2c080	ldp x29,x30,[sp, #0x50]
00c2c084	add sp,sp,#0xb0
00c2c088	autiasp
00c2c08c	ret
