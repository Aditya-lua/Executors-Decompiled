; FUN_00bf6138 @ 00bf6138
00bf6138	paciasp
00bf613c	sub sp,sp,#0x50
00bf6140	stp x29,x30,[sp, #0x20]
00bf6144	stp x22,x21,[sp, #0x30]
00bf6148	stp x20,x19,[sp, #0x40]
00bf614c	add x29,sp,#0x20
00bf6150	adrp x20,0xcb5000
00bf6154	mov x19,x1
00bf6158	mov x21,x0
00bf615c	ldr x20,[x20, #0xc70]
00bf6160	str x20,[sp, #0x8]
00bf6164	ldar x8,[x20]
00bf6168	cmn x8,#0x1
00bf616c	b.eq 0x00bf6198
00bf6170	add x8,sp,#0x8
00bf6174	sub x9,x29,#0x8
00bf6178	adrp x0,0xcb5000
00bf617c	stur x8,[x29, #-0x8]
00bf6180	nop
00bf6184	adr x2,0xc0bab0
00bf6188	str x9,[sp, #0x10]
00bf618c	add x1,sp,#0x10
00bf6190	ldr x0,[x0, #0xc70]
00bf6194	bl 0x00c305d0
00bf6198	ldrsw x8,[x20, #0x8]
00bf619c	add x1,x19,#0x8
00bf61a0	mov w0,#0x1
00bf61a4	sub x22,x8,#0x1
00bf61a8	bl 0x00c2bce0
00bf61ac	mov x20,x21
00bf61b0	ldp x8,x9,[x20, #0x10]!
00bf61b4	sub x9,x9,x8
00bf61b8	asr x10,x9,#0x3
00bf61bc	cmp x10,x22
00bf61c0	b.hi 0x00bf61ec
00bf61c4	add x9,x22,#0x1
00bf61c8	subs x1,x9,x10
00bf61cc	b.ls 0x00bf61e0
00bf61d0	mov x0,x20
00bf61d4	bl 0x00c0b6e4
00bf61d8	ldr x8,[x20]
00bf61dc	b 0x00bf61ec
00bf61e0	b.cs 0x00bf61ec
00bf61e4	add x9,x8,x9, LSL #0x3
00bf61e8	str x9,[x21, #0x18]
00bf61ec	ldr x21,[x8, x22, LSL #0x3]
00bf61f0	cbz x21,0x00bf6214
00bf61f4	add x1,x21,#0x8
00bf61f8	mov x0,#-0x1
00bf61fc	bl 0x00c2bd10
00bf6200	cbnz x0,0x00bf6214
00bf6204	ldr x8,[x21]
00bf6208	mov x0,x21
00bf620c	ldr x8,[x8, #0x10]
00bf6210	blr x8
00bf6214	ldr x8,[x20]
00bf6218	str x19,[x8, x22, LSL #0x3]
00bf621c	ldp x20,x19,[sp, #0x40]
00bf6220	ldp x22,x21,[sp, #0x30]
00bf6224	ldp x29,x30,[sp, #0x20]
00bf6228	add sp,sp,#0x50
00bf622c	autiasp
00bf6230	ret
