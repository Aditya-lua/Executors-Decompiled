; FUN_00ac00d0 @ 00ac00d0
00ac00d0	str x25,[sp, #-0x50]!
00ac00d4	stp x24,x23,[sp, #0x10]
00ac00d8	stp x22,x21,[sp, #0x20]
00ac00dc	stp x20,x19,[sp, #0x30]
00ac00e0	stp x29,x30,[sp, #0x40]
00ac00e4	ldr x23,[x2, #0x28]
00ac00e8	mov x21,x0
00ac00ec	add x29,sp,#0x40
00ac00f0	mov x22,x4
00ac00f4	mov x0,x23
00ac00f8	mov x19,x3
00ac00fc	mov x24,x2
00ac0100	mov x20,x1
00ac0104	bl 0x00c3f7d0
00ac0108	mov x25,x0
00ac010c	mov x0,x23
00ac0110	bl 0x00c3f7e0
00ac0114	mov x2,x0
00ac0118	mov x0,x25
00ac011c	mov x1,x19
00ac0120	bl 0x00c34640
00ac0124	cbz x0,0x00ac020c
00ac0128	mov x19,x0
00ac012c	bl 0x00c37330
00ac0130	cmp w0,#0x1
00ac0134	b.lt 0x00ac0204
00ac0138	ldr x8,[x24, #0x18]
00ac013c	add x2,sp,#0x8
00ac0140	mov x0,x19
00ac0144	mov x1,xzr
00ac0148	ldr x3,[x8, #0x8]
00ac014c	ldrsw x4,[x8]
00ac0150	bl 0x00c37320
00ac0154	cmp w0,#0x1
00ac0158	b.lt 0x00ac0204
00ac015c	ldr x0,[sp, #0x8]
00ac0160	adrp x1,0x29e000
00ac0164	add x1,x1,#0x913
00ac0168	mov w2,#0xb1
00ac016c	bl 0x00c32320
00ac0170	cbz x0,0x00ac0214
00ac0174	ldr x8,[x24, #0x18]
00ac0178	mov x23,x0
00ac017c	add x2,sp,#0x8
00ac0180	mov x0,x19
00ac0184	ldr x3,[x8, #0x8]
00ac0188	ldrsw x4,[x8]
00ac018c	mov x1,x23
00ac0190	bl 0x00c37320
00ac0194	cmp w0,#0x1
00ac0198	b.lt 0x00ac01b0
00ac019c	ldr x8,[sp, #0x8]
00ac01a0	cbz x8,0x00ac01b0
00ac01a4	cbz x22,0x00ac024c
00ac01a8	cmp x8,x22
00ac01ac	b.eq 0x00ac024c
00ac01b0	bl 0x00c342a0
00ac01b4	adrp x20,0x29e000
00ac01b8	add x20,x20,#0x913
00ac01bc	adrp x2,0x2c8000
00ac01c0	add x2,x2,#0x118
00ac01c4	mov w1,#0xbd
00ac01c8	mov x0,x20
00ac01cc	bl 0x00c342b0
00ac01d0	mov w1,#0x6
00ac01d4	mov w0,#0x21
00ac01d8	movk w1,#0x8, LSL #16
00ac01dc	mov x2,xzr
00ac01e0	bl 0x00c342c0
00ac01e4	mov x0,x19
00ac01e8	bl 0x00c34620
00ac01ec	mov w2,#0xca
00ac01f0	mov x0,x23
00ac01f4	mov x1,x20
00ac01f8	bl 0x00c32310
00ac01fc	mov w20,wzr
00ac0200	b 0x00ac027c
00ac0204	mov w20,#0xffffffff
00ac0208	b 0x00ac0274
00ac020c	mov w20,#0xffffffff
00ac0210	b 0x00ac027c
00ac0214	bl 0x00c342a0
00ac0218	adrp x0,0x29e000
00ac021c	adrp x2,0x2c8000
00ac0220	add x0,x0,#0x913
00ac0224	add x2,x2,#0x118
00ac0228	mov w1,#0xb4
00ac022c	bl 0x00c342b0
00ac0230	mov w1,#0x100
00ac0234	mov w0,#0x21
00ac0238	movk w1,#0xc, LSL #16
00ac023c	mov x2,xzr
00ac0240	bl 0x00c342c0
00ac0244	mov w20,#0xffffffff
00ac0248	b 0x00ac0274
00ac024c	ldr x0,[x21]
00ac0250	ldrsw x1,[x20]
00ac0254	adrp x2,0x29e000
00ac0258	add x2,x2,#0x913
00ac025c	mov w3,#0xc3
00ac0260	bl 0x00c345e0
00ac0264	str x23,[x21]
00ac0268	ldr x8,[sp, #0x8]
00ac026c	str w8,[x20]
00ac0270	mov w20,#0x1
00ac0274	mov x0,x19
00ac0278	bl 0x00c34620
00ac027c	mov w0,w20
00ac0280	ldp x29,x30,[sp, #0x40]
00ac0284	ldp x20,x19,[sp, #0x30]
00ac0288	ldp x22,x21,[sp, #0x20]
00ac028c	ldp x24,x23,[sp, #0x10]
00ac0290	ldr x25,[sp], #0x50
00ac0294	ret
