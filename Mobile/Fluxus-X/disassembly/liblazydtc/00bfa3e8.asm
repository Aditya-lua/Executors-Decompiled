; FUN_00bfa3e8 @ 00bfa3e8
00bfa3e8	paciasp
00bfa3ec	sub sp,sp,#0x50
00bfa3f0	stp x29,x30,[sp, #0x20]
00bfa3f4	stp x22,x21,[sp, #0x30]
00bfa3f8	stp x20,x19,[sp, #0x40]
00bfa3fc	add x29,sp,#0x20
00bfa400	adrp x20,0xcb4000
00bfa404	mov x19,x1
00bfa408	mov x21,x0
00bfa40c	ldr x20,[x20, #0xc80]
00bfa410	str x20,[sp, #0x8]
00bfa414	ldar x8,[x20]
00bfa418	cmn x8,#0x1
00bfa41c	b.eq 0x00bfa448
00bfa420	add x8,sp,#0x8
00bfa424	sub x9,x29,#0x8
00bfa428	adrp x0,0xcb4000
00bfa42c	stur x8,[x29, #-0x8]
00bfa430	nop
00bfa434	adr x2,0xc0bab0
00bfa438	str x9,[sp, #0x10]
00bfa43c	add x1,sp,#0x10
00bfa440	ldr x0,[x0, #0xc80]
00bfa444	bl 0x00c305d0
00bfa448	ldp x8,x10,[x19, #0x10]
00bfa44c	ldrsw x9,[x20, #0x8]
00bfa450	sub x22,x9,#0x1
00bfa454	sub x9,x10,x8
00bfa458	cmp x22,x9, ASR #0x3
00bfa45c	b.cs 0x00bfa4fc
00bfa460	ldr x19,[x8, x22, LSL #0x3]
00bfa464	cbz x19,0x00bfa4fc
00bfa468	add x1,x19,#0x8
00bfa46c	mov w0,#0x1
00bfa470	bl 0x00c2bce0
00bfa474	mov x20,x21
00bfa478	ldp x8,x9,[x20, #0x10]!
00bfa47c	sub x9,x9,x8
00bfa480	asr x10,x9,#0x3
00bfa484	cmp x10,x22
00bfa488	b.hi 0x00bfa4b4
00bfa48c	add x9,x22,#0x1
00bfa490	subs x1,x9,x10
00bfa494	b.ls 0x00bfa4a8
00bfa498	mov x0,x20
00bfa49c	bl 0x00c0b6e4
00bfa4a0	ldr x8,[x20]
00bfa4a4	b 0x00bfa4b4
00bfa4a8	b.cs 0x00bfa4b4
00bfa4ac	add x9,x8,x9, LSL #0x3
00bfa4b0	str x9,[x21, #0x18]
00bfa4b4	ldr x21,[x8, x22, LSL #0x3]
00bfa4b8	cbz x21,0x00bfa4dc
00bfa4bc	add x1,x21,#0x8
00bfa4c0	mov x0,#-0x1
00bfa4c4	bl 0x00c2bd10
00bfa4c8	cbnz x0,0x00bfa4dc
00bfa4cc	ldr x8,[x21]
00bfa4d0	mov x0,x21
00bfa4d4	ldr x8,[x8, #0x10]
00bfa4d8	blr x8
00bfa4dc	ldr x8,[x20]
00bfa4e0	str x19,[x8, x22, LSL #0x3]
00bfa4e4	ldp x20,x19,[sp, #0x40]
00bfa4e8	ldp x22,x21,[sp, #0x30]
00bfa4ec	ldp x29,x30,[sp, #0x20]
00bfa4f0	add sp,sp,#0x50
00bfa4f4	autiasp
00bfa4f8	ret
00bfa4fc	bl 0x00bd8968
