; FUN_00bd60c8 @ 00bd60c8
00bd60c8	paciasp
00bd60cc	sub sp,sp,#0x60
00bd60d0	stp x29,x30,[sp, #0x10]
00bd60d4	str x25,[sp, #0x20]
00bd60d8	stp x24,x23,[sp, #0x30]
00bd60dc	stp x22,x21,[sp, #0x40]
00bd60e0	stp x20,x19,[sp, #0x50]
00bd60e4	add x29,sp,#0x10
00bd60e8	mov w20,w1
00bd60ec	mov x19,x0
00bd60f0	mov x0,sp
00bd60f4	mov x1,x19
00bd60f8	bl 0x00c44040
00bd60fc	ldrb w8,[sp]
00bd6100	cmp w8,#0x1
00bd6104	b.ne 0x00bd61f8
00bd6108	ldr x8,[x19]
00bd610c	ldur x8,[x8, #-0x18]
00bd6110	add x0,x19,x8
00bd6114	ldr w24,[x0, #0x8]
00bd6118	add x8,x29,#0x18
00bd611c	bl 0x00c30070
00bd6120	adrp x1,0xcb5000
00bd6124	add x0,x29,#0x18
00bd6128	ldr x1,[x1, #0xbb0]
00bd612c	bl 0x00c30080
00bd6130	mov x21,x0
00bd6134	add x0,x29,#0x18
00bd6138	bl 0x00c30090
00bd613c	ldr x8,[x19]
00bd6140	ldur x8,[x8, #-0x18]
00bd6144	add x2,x19,x8
00bd6148	ldr w3,[x2, #0x90]
00bd614c	ldr x22,[x2, #0x28]
00bd6150	cmn w3,#0x1
00bd6154	b.ne 0x00bd61a0
00bd6158	add x8,x29,#0x18
00bd615c	mov x0,x2
00bd6160	mov x25,x2
00bd6164	bl 0x00c30070
00bd6168	adrp x1,0xcb5000
00bd616c	add x0,x29,#0x18
00bd6170	ldr x1,[x1, #0xb98]
00bd6174	bl 0x00c30080
00bd6178	ldr x8,[x0]
00bd617c	ldr x8,[x8, #0x58]
00bd6180	mov w1,#0x20
00bd6184	blr x8
00bd6188	mov w23,w0
00bd618c	add x0,x29,#0x18
00bd6190	bl 0x00c30090
00bd6194	mov x2,x25
00bd6198	mov w3,w23
00bd619c	str w23,[x25, #0x90]
00bd61a0	mov w8,#0x4a
00bd61a4	and w8,w24,w8
00bd61a8	cmp w8,#0x40
00bd61ac	b.eq 0x00bd61b8
00bd61b0	cmp w8,#0x8
00bd61b4	b.ne 0x00bd61c0
00bd61b8	mov w4,w20
00bd61bc	b 0x00bd61c4
00bd61c0	sxtw x4,w20
00bd61c4	ldr x8,[x21]
00bd61c8	ldr x8,[x8, #0x20]
00bd61cc	mov x0,x21
00bd61d0	mov x1,x22
00bd61d4	blr x8
00bd61d8	cbnz x0,0x00bd61f8
00bd61dc	ldr x8,[x19]
00bd61e0	mov w9,#0x5
00bd61e4	ldur x8,[x8, #-0x18]
00bd61e8	add x0,x19,x8
00bd61ec	ldr w8,[x0, #0x20]
00bd61f0	orr w1,w8,w9
00bd61f4	bl 0x00c30130
00bd61f8	mov x0,sp
00bd61fc	bl 0x00c44050
00bd6200	mov x0,x19
00bd6204	ldp x20,x19,[sp, #0x50]
00bd6208	ldr x25,[sp, #0x20]
00bd620c	ldp x22,x21,[sp, #0x40]
00bd6210	ldp x24,x23,[sp, #0x30]
00bd6214	ldp x29,x30,[sp, #0x10]
00bd6218	add sp,sp,#0x60
00bd621c	autiasp
00bd6220	ret
