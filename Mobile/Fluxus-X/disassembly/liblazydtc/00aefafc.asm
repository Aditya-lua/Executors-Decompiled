; FUN_00aefafc @ 00aefafc
00aefafc	stp x28,x27,[sp, #-0x60]!
00aefb00	stp x26,x25,[sp, #0x10]
00aefb04	stp x24,x23,[sp, #0x20]
00aefb08	stp x22,x21,[sp, #0x30]
00aefb0c	stp x20,x19,[sp, #0x40]
00aefb10	stp x29,x30,[sp, #0x50]
00aefb14	add x29,sp,#0x50
00aefb18	sub sp,sp,#0x410
00aefb1c	adrp x9,0xd22000
00aefb20	adrp x8,0xaef000
00aefb24	add x9,x9,#0x368
00aefb28	mov w22,w3
00aefb2c	mov w19,w2
00aefb30	mov x20,x1
00aefb34	mov x21,x0
00aefb38	adrp x26,0xd22000
00aefb3c	adrp x25,0xd22000
00aefb40	add x8,x8,#0xdd0
00aefb44	orr x27,xzr,#-0x1f
00aefb48	mov w28,#0x1
00aefb4c	add x23,x9,#0x20
00aefb50	mov w24,#0x1600
00aefb54	str wzr,[x26, #0x360]
00aefb58	str wzr,[x25, #0x35c]
00aefb5c	stp xzr,xzr,[sp, #0x10]
00aefb60	stp xzr,x8,[sp]
00aefb64	add w8,w27,#0x20
00aefb68	and w8,w8,#0x7fffffff
00aefb6c	cmp w8,#0xc
00aefb70	b.hi 0x00aefb80
00aefb74	lsl w8,w28,w8
00aefb78	tst w8,w24
00aefb7c	b.ne 0x00aefb90
00aefb80	add w0,w27,#0x20
00aefb84	mov x1,sp
00aefb88	mov x2,x23
00aefb8c	bl 0x00c31b20
00aefb90	adds x27,x27,#0x1
00aefb94	add x23,x23,#0x20
00aefb98	b.ne 0x00aefb64
00aefb9c	orr w0,wzr,#0x1c
00aefba0	mov x1,xzr
00aefba4	bl 0x00c40400
00aefba8	mov w8,#0x1
00aefbac	str w8,[x25, #0x35c]
00aefbb0	cbnz w19,0x00aefc14
00aefbb4	adrp x8,0xd22000
00aefbb8	add x8,x8,#0x338
00aefbbc	ldp q0,q1,[x8]
00aefbc0	adrp x9,0xd22000
00aefbc4	add x9,x9,#0x768
00aefbc8	adrp x10,0xd22000
00aefbcc	stp q0,q1,[x9]
00aefbd0	ldr w11,[x8, #0x20]
00aefbd4	ldr w8,[x9, #0xc]
00aefbd8	ldrb w10,[x10, #0x320]
00aefbdc	str w11,[x9, #0x20]
00aefbe0	and w8,w8,#0xfffffff7
00aefbe4	cmp w10,#0x1
00aefbe8	str w8,[x9, #0xc]
00aefbec	b.ne 0x00aefc14
00aefbf0	adrp x8,0xd22000
00aefbf4	ldr x0,[x8, #0x328]
00aefbf8	bl 0x00c31d60
00aefbfc	adrp x2,0xd22000
00aefc00	add x2,x2,#0x768
00aefc04	mov w1,wzr
00aefc08	bl 0x00c40420
00aefc0c	cmn w0,#0x1
00aefc10	b.eq 0x00aefd4c
00aefc14	adrp x23,0xd22000
00aefc18	ldr x2,[x23, #0x328]
00aefc1c	mov w8,#0x2
00aefc20	mov x0,sp
00aefc24	orr w1,wzr,#0x3ff
00aefc28	str w8,[x25, #0x35c]
00aefc2c	strb wzr,[sp]
00aefc30	bl 0x00c30c00
00aefc34	cbz x0,0x00aefcb8
00aefc38	ldr x0,[x23, #0x328]
00aefc3c	bl 0x00c30bf0
00aefc40	mov w8,wzr
00aefc44	cbnz w0,0x00aefcbc
00aefc48	ldr x23,[x23, #0x328]
00aefc4c	mov x0,x23
00aefc50	bl 0x00c38800
00aefc54	mov w8,wzr
00aefc58	cbnz w0,0x00aefcbc
00aefc5c	mov x0,sp
00aefc60	mov w1,#0xa
00aefc64	bl 0x00c30890
00aefc68	cbz x0,0x00aefc78
00aefc6c	cbz w22,0x00aefc9c
00aefc70	strb wzr,[x0]
00aefc74	b 0x00aefc9c
00aefc78	sub x0,x29,#0x60
00aefc7c	mov w1,#0x4
00aefc80	mov x2,x23
00aefc84	bl 0x00c30c00
00aefc88	cbz x0,0x00aefcb8
00aefc8c	sub x0,x29,#0x60
00aefc90	mov w1,#0xa
00aefc94	bl 0x00c30890
00aefc98	cbz x0,0x00aefc78
00aefc9c	mov x2,sp
00aefca0	mov x0,x21
00aefca4	mov x1,x20
00aefca8	bl 0x00c32b30
00aefcac	lsr w8,w0,#0x1f
00aefcb0	eor w8,w8,#0x1
00aefcb4	b 0x00aefcbc
00aefcb8	mov w8,wzr
00aefcbc	ldr w9,[x26, #0x360]
00aefcc0	cmp w9,#0x2
00aefcc4	csinv w20,w8,wzr,ne
00aefcc8	cbz w19,0x00aefd58
00aefccc	ldr w8,[x25, #0x35c]
00aefcd0	cmp w8,#0x1
00aefcd4	b.lt 0x00aefd1c
00aefcd8	adrp x8,0xd22000
00aefcdc	add x8,x8,#0x368
00aefce0	add x19,x8,#0x20
00aefce4	orr x21,xzr,#-0x1f
00aefce8	add w8,w21,#0x20
00aefcec	and w8,w8,#0x7fffffff
00aefcf0	cmp w8,#0xa
00aefcf4	b.eq 0x00aefd10
00aefcf8	cmp w8,#0xc
00aefcfc	b.eq 0x00aefd10
00aefd00	add w0,w21,#0x20
00aefd04	mov x1,x19
00aefd08	mov x2,xzr
00aefd0c	bl 0x00c31b20
00aefd10	adds x21,x21,#0x1
00aefd14	add x19,x19,#0x20
00aefd18	b.ne 0x00aefce8
00aefd1c	mov x0,sp
00aefd20	mov w1,#0x400
00aefd24	bl 0x00c34750
00aefd28	mov w0,w20
00aefd2c	add sp,sp,#0x410
00aefd30	ldp x29,x30,[sp, #0x50]
00aefd34	ldp x20,x19,[sp, #0x40]
00aefd38	ldp x22,x21,[sp, #0x30]
00aefd3c	ldp x24,x23,[sp, #0x20]
00aefd40	ldp x26,x25,[sp, #0x10]
00aefd44	ldp x28,x27,[sp], #0x60
00aefd48	ret
00aefd4c	ldr w8,[x26, #0x360]
00aefd50	cmp w8,#0x2
00aefd54	csetm w20,eq
00aefd58	adrp x8,0xd22000
00aefd5c	ldr x1,[x8, #0x330]
00aefd60	mov w0,#0xa
00aefd64	bl 0x00c30900
00aefd68	ldr w8,[x25, #0x35c]
00aefd6c	cbnz w19,0x00aefcd0
00aefd70	cmp w8,#0x1
00aefd74	b.le 0x00aefcd0
00aefd78	adrp x8,0xd22000
00aefd7c	add x8,x8,#0x338
00aefd80	adrp x9,0xd22000
00aefd84	ldr w10,[x8, #0x20]
00aefd88	ldp q0,q1,[x8]
00aefd8c	ldrb w8,[x9, #0x320]
00aefd90	adrp x9,0xd22000
00aefd94	add x9,x9,#0x768
00aefd98	str w10,[x9, #0x20]
00aefd9c	cmp w8,#0x1
00aefda0	stp q0,q1,[x9]
00aefda4	b.ne 0x00aefccc
00aefda8	adrp x8,0xd22000
00aefdac	ldr x0,[x8, #0x328]
00aefdb0	bl 0x00c31d60
00aefdb4	adrp x2,0xd22000
00aefdb8	add x2,x2,#0x768
00aefdbc	mov w1,wzr
00aefdc0	bl 0x00c40420
00aefdc4	cmn w0,#0x1
00aefdc8	csel w20,wzr,w20,eq
00aefdcc	b 0x00aefccc
