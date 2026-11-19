; FUN_00bf717c @ 00bf717c
00bf717c	paciasp
00bf7180	sub sp,sp,#0x50
00bf7184	stp x29,x30,[sp, #0x20]
00bf7188	stp x22,x21,[sp, #0x30]
00bf718c	stp x20,x19,[sp, #0x40]
00bf7190	add x29,sp,#0x20
00bf7194	adrp x20,0xcb5000
00bf7198	mov x19,x1
00bf719c	mov x21,x0
00bf71a0	ldr x20,[x20, #0xd40]
00bf71a4	str x20,[sp, #0x8]
00bf71a8	ldar x8,[x20]
00bf71ac	cmn x8,#0x1
00bf71b0	b.eq 0x00bf71dc
00bf71b4	add x8,sp,#0x8
00bf71b8	sub x9,x29,#0x8
00bf71bc	adrp x0,0xcb5000
00bf71c0	stur x8,[x29, #-0x8]
00bf71c4	nop
00bf71c8	adr x2,0xc0bab0
00bf71cc	str x9,[sp, #0x10]
00bf71d0	add x1,sp,#0x10
00bf71d4	ldr x0,[x0, #0xd40]
00bf71d8	bl 0x00c305d0
00bf71dc	ldrsw x8,[x20, #0x8]
00bf71e0	add x1,x19,#0x8
00bf71e4	mov w0,#0x1
00bf71e8	sub x22,x8,#0x1
00bf71ec	bl 0x00c2bce0
00bf71f0	mov x20,x21
00bf71f4	ldp x8,x9,[x20, #0x10]!
00bf71f8	sub x9,x9,x8
00bf71fc	asr x10,x9,#0x3
00bf7200	cmp x10,x22
00bf7204	b.hi 0x00bf7230
00bf7208	add x9,x22,#0x1
00bf720c	subs x1,x9,x10
00bf7210	b.ls 0x00bf7224
00bf7214	mov x0,x20
00bf7218	bl 0x00c0b6e4
00bf721c	ldr x8,[x20]
00bf7220	b 0x00bf7230
00bf7224	b.cs 0x00bf7230
00bf7228	add x9,x8,x9, LSL #0x3
00bf722c	str x9,[x21, #0x18]
00bf7230	ldr x21,[x8, x22, LSL #0x3]
00bf7234	cbz x21,0x00bf7258
00bf7238	add x1,x21,#0x8
00bf723c	mov x0,#-0x1
00bf7240	bl 0x00c2bd10
00bf7244	cbnz x0,0x00bf7258
00bf7248	ldr x8,[x21]
00bf724c	mov x0,x21
00bf7250	ldr x8,[x8, #0x10]
00bf7254	blr x8
00bf7258	ldr x8,[x20]
00bf725c	str x19,[x8, x22, LSL #0x3]
00bf7260	ldp x20,x19,[sp, #0x40]
00bf7264	ldp x22,x21,[sp, #0x30]
00bf7268	ldp x29,x30,[sp, #0x20]
00bf726c	add sp,sp,#0x50
00bf7270	autiasp
00bf7274	ret
