; FUN_00bf90ec @ 00bf90ec
00bf90ec	paciasp
00bf90f0	sub sp,sp,#0x50
00bf90f4	stp x29,x30,[sp, #0x20]
00bf90f8	stp x22,x21,[sp, #0x30]
00bf90fc	stp x20,x19,[sp, #0x40]
00bf9100	add x29,sp,#0x20
00bf9104	adrp x20,0xcb5000
00bf9108	mov x19,x1
00bf910c	mov x21,x0
00bf9110	ldr x20,[x20, #0xc20]
00bf9114	str x20,[sp, #0x8]
00bf9118	ldar x8,[x20]
00bf911c	cmn x8,#0x1
00bf9120	b.eq 0x00bf914c
00bf9124	add x8,sp,#0x8
00bf9128	sub x9,x29,#0x8
00bf912c	adrp x0,0xcb5000
00bf9130	stur x8,[x29, #-0x8]
00bf9134	nop
00bf9138	adr x2,0xc0bab0
00bf913c	str x9,[sp, #0x10]
00bf9140	add x1,sp,#0x10
00bf9144	ldr x0,[x0, #0xc20]
00bf9148	bl 0x00c305d0
00bf914c	ldp x8,x10,[x19, #0x10]
00bf9150	ldrsw x9,[x20, #0x8]
00bf9154	sub x22,x9,#0x1
00bf9158	sub x9,x10,x8
00bf915c	cmp x22,x9, ASR #0x3
00bf9160	b.cs 0x00bf9200
00bf9164	ldr x19,[x8, x22, LSL #0x3]
00bf9168	cbz x19,0x00bf9200
00bf916c	add x1,x19,#0x8
00bf9170	mov w0,#0x1
00bf9174	bl 0x00c2bce0
00bf9178	mov x20,x21
00bf917c	ldp x8,x9,[x20, #0x10]!
00bf9180	sub x9,x9,x8
00bf9184	asr x10,x9,#0x3
00bf9188	cmp x10,x22
00bf918c	b.hi 0x00bf91b8
00bf9190	add x9,x22,#0x1
00bf9194	subs x1,x9,x10
00bf9198	b.ls 0x00bf91ac
00bf919c	mov x0,x20
00bf91a0	bl 0x00c0b6e4
00bf91a4	ldr x8,[x20]
00bf91a8	b 0x00bf91b8
00bf91ac	b.cs 0x00bf91b8
00bf91b0	add x9,x8,x9, LSL #0x3
00bf91b4	str x9,[x21, #0x18]
00bf91b8	ldr x21,[x8, x22, LSL #0x3]
00bf91bc	cbz x21,0x00bf91e0
00bf91c0	add x1,x21,#0x8
00bf91c4	mov x0,#-0x1
00bf91c8	bl 0x00c2bd10
00bf91cc	cbnz x0,0x00bf91e0
00bf91d0	ldr x8,[x21]
00bf91d4	mov x0,x21
00bf91d8	ldr x8,[x8, #0x10]
00bf91dc	blr x8
00bf91e0	ldr x8,[x20]
00bf91e4	str x19,[x8, x22, LSL #0x3]
00bf91e8	ldp x20,x19,[sp, #0x40]
00bf91ec	ldp x22,x21,[sp, #0x30]
00bf91f0	ldp x29,x30,[sp, #0x20]
00bf91f4	add sp,sp,#0x50
00bf91f8	autiasp
00bf91fc	ret
00bf9200	bl 0x00bd8968
