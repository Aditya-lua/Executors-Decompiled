; FUN_008cca4c @ 008cca4c
008cca4c	sub sp,sp,#0x70
008cca50	stp x29,x30,[sp, #0x20]
008cca54	str x25,[sp, #0x30]
008cca58	stp x24,x23,[sp, #0x40]
008cca5c	stp x22,x21,[sp, #0x50]
008cca60	stp x20,x19,[sp, #0x60]
008cca64	add x29,sp,#0x20
008cca68	mrs x22,tpidr_el0
008cca6c	mov x19,x3
008cca70	ldr x8,[x22, #0x28]
008cca74	stur x8,[x29, #-0x8]
008cca78	ldr w8,[x2, #0xc]
008cca7c	ldr w9,[x3, #0xc]
008cca80	cmp w8,#0x4
008cca84	csel x21,x2,xzr,eq
008cca88	cmp w9,#0x4
008cca8c	csel x20,x3,xzr,eq
008cca90	cbz x21,0x008ccac8
008cca94	cbz x20,0x008ccac8
008cca98	ldr s0,[x21]
008cca9c	ldr s1,[x20]
008ccaa0	fdiv s0,s0,s1
008ccaa4	str s0,[x1]
008ccaa8	ldr s0,[x21, #0x4]
008ccaac	ldr s1,[x20, #0x4]
008ccab0	fdiv s0,s0,s1
008ccab4	str s0,[x1, #0x4]
008ccab8	ldr s0,[x21, #0x8]
008ccabc	ldr s1,[x20, #0x8]
008ccac0	fdiv s0,s0,s1
008ccac4	b 0x008ccb50
008ccac8	cbz x21,0x008ccadc
008ccacc	cmp w9,#0x3
008ccad0	b.ne 0x008ccaf0
008ccad4	ldr d0,[x19]
008ccad8	b 0x008ccb2c
008ccadc	cbz x20,0x008ccbe4
008ccae0	cmp w8,#0x3
008ccae4	b.ne 0x008ccb88
008ccae8	ldr d0,[x2]
008ccaec	b 0x008ccbc4
008ccaf0	cmp w9,#0x5
008ccaf4	b.ne 0x008ccbe4
008ccaf8	ldr x8,[x19]
008ccafc	mov x20,x0
008ccb00	mov x23,x1
008ccb04	add x1,sp,#0x10
008ccb08	mov x24,x2
008ccb0c	add x0,x8,#0x18
008ccb10	bl 0x008b93c8
008ccb14	mov x2,x24
008ccb18	mov x1,x23
008ccb1c	mov w8,w0
008ccb20	mov x0,x20
008ccb24	cbz w8,0x008ccbe4
008ccb28	ldr d0,[sp, #0x10]
008ccb2c	fcvt s0,d0
008ccb30	ldr s1,[x21]
008ccb34	fdiv s1,s1,s0
008ccb38	str s1,[x1]
008ccb3c	ldr s1,[x21, #0x4]
008ccb40	fdiv s1,s1,s0
008ccb44	str s1,[x1, #0x4]
008ccb48	ldr s1,[x21, #0x8]
008ccb4c	fdiv s0,s1,s0
008ccb50	mov w8,#0x4
008ccb54	str s0,[x1, #0x8]
008ccb58	str w8,[x1, #0xc]
008ccb5c	ldr x8,[x22, #0x28]
008ccb60	ldur x9,[x29, #-0x8]
008ccb64	cmp x8,x9
008ccb68	b.ne 0x008ccd14
008ccb6c	ldp x20,x19,[sp, #0x60]
008ccb70	ldr x25,[sp, #0x30]
008ccb74	ldp x22,x21,[sp, #0x50]
008ccb78	ldp x24,x23,[sp, #0x40]
008ccb7c	ldp x29,x30,[sp, #0x20]
008ccb80	add sp,sp,#0x70
008ccb84	ret
008ccb88	cmp w8,#0x5
008ccb8c	b.ne 0x008ccbe4
008ccb90	ldr x8,[x2]
008ccb94	mov x21,x0
008ccb98	mov x23,x1
008ccb9c	add x1,sp,#0x10
008ccba0	mov x24,x2
008ccba4	add x0,x8,#0x18
008ccba8	bl 0x008b93c8
008ccbac	mov x2,x24
008ccbb0	mov x1,x23
008ccbb4	mov w8,w0
008ccbb8	mov x0,x21
008ccbbc	cbz w8,0x008ccbe4
008ccbc0	ldr d0,[sp, #0x10]
008ccbc4	fcvt s0,d0
008ccbc8	ldr s1,[x20]
008ccbcc	fdiv s1,s0,s1
008ccbd0	str s1,[x1]
008ccbd4	ldr s1,[x20, #0x4]
008ccbd8	fdiv s1,s0,s1
008ccbdc	str s1,[x1, #0x4]
008ccbe0	b 0x008ccabc
008ccbe4	ldr w8,[x2, #0xc]
008ccbe8	mov x20,x2
008ccbec	cmp w8,#0x3
008ccbf0	b.eq 0x008ccc38
008ccbf4	cmp w8,#0x5
008ccbf8	b.ne 0x008ccc80
008ccbfc	ldr x8,[x2]
008ccc00	mov x20,x0
008ccc04	mov x21,x1
008ccc08	add x1,sp,#0x10
008ccc0c	mov x23,x2
008ccc10	add x0,x8,#0x18
008ccc14	bl 0x008b93c8
008ccc18	mov x2,x23
008ccc1c	mov x1,x21
008ccc20	mov w8,w0
008ccc24	mov x0,x20
008ccc28	cbz w8,0x008ccc80
008ccc2c	ldr d0,[sp, #0x10]
008ccc30	add x20,sp,#0x8
008ccc34	str d0,[sp, #0x8]
008ccc38	ldr w8,[x19, #0xc]
008ccc3c	cmp w8,#0x3
008ccc40	b.eq 0x008cccd4
008ccc44	cmp w8,#0x5
008ccc48	b.ne 0x008ccc80
008ccc4c	ldr x8,[x19]
008ccc50	mov x23,x0
008ccc54	mov x24,x1
008ccc58	add x1,sp,#0x10
008ccc5c	add x21,sp,#0x10
008ccc60	mov x25,x2
008ccc64	add x0,x8,#0x18
008ccc68	bl 0x008b93c8
008ccc6c	mov x2,x25
008ccc70	mov x1,x24
008ccc74	mov w8,w0
008ccc78	mov x0,x23
008ccc7c	cbnz w8,0x008cccd8
008ccc80	mov x23,x1
008ccc84	mov x20,x2
008ccc88	mov x1,x2
008ccc8c	mov w2,#0xb
008ccc90	mov x21,x0
008ccc94	bl 0x008be028
008ccc98	ldr w8,[x0, #0xc]
008ccc9c	cbnz w8,0x008cccb8
008ccca0	mov x0,x21
008ccca4	mov x1,x19
008ccca8	mov w2,#0xb
008cccac	bl 0x008be028
008cccb0	ldr w8,[x0, #0xc]
008cccb4	cbz w8,0x008cccf0
008cccb8	mov x2,x0
008cccbc	mov x1,x23
008cccc0	mov x0,x21
008cccc4	mov x3,x20
008cccc8	mov x4,x19
008ccccc	bl 0x008cb070
008cccd0	b 0x008ccb5c
008cccd4	mov x21,x19
008cccd8	ldr d0,[x21]
008cccdc	ldr d1,[x20]
008ccce0	mov w8,#0x3
008ccce4	fdiv d0,d1,d0
008ccce8	str d0,[x1]
008cccec	b 0x008ccb58
008cccf0	ldr x8,[x22, #0x28]
008cccf4	ldur x9,[x29, #-0x8]
008cccf8	cmp x8,x9
008cccfc	b.ne 0x008ccd14
008ccd00	mov x0,x21
008ccd04	mov x1,x20
008ccd08	mov x2,x19
008ccd0c	mov w3,#0xb
008ccd10	bl 0x008b3afc
008ccd14	bl 0x00c2fec0
