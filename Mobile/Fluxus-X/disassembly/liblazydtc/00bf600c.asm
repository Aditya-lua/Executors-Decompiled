; FUN_00bf600c @ 00bf600c
00bf600c	paciasp
00bf6010	sub sp,sp,#0x50
00bf6014	stp x29,x30,[sp, #0x20]
00bf6018	stp x22,x21,[sp, #0x30]
00bf601c	stp x20,x19,[sp, #0x40]
00bf6020	add x29,sp,#0x20
00bf6024	adrp x20,0xcb5000
00bf6028	mov x19,x1
00bf602c	mov x21,x0
00bf6030	ldr x20,[x20, #0xbf0]
00bf6034	str x20,[sp, #0x8]
00bf6038	ldar x8,[x20]
00bf603c	cmn x8,#0x1
00bf6040	b.eq 0x00bf606c
00bf6044	add x8,sp,#0x8
00bf6048	sub x9,x29,#0x8
00bf604c	adrp x0,0xcb5000
00bf6050	stur x8,[x29, #-0x8]
00bf6054	nop
00bf6058	adr x2,0xc0bab0
00bf605c	str x9,[sp, #0x10]
00bf6060	add x1,sp,#0x10
00bf6064	ldr x0,[x0, #0xbf0]
00bf6068	bl 0x00c305d0
00bf606c	ldrsw x8,[x20, #0x8]
00bf6070	add x1,x19,#0x8
00bf6074	mov w0,#0x1
00bf6078	sub x22,x8,#0x1
00bf607c	bl 0x00c2bce0
00bf6080	mov x20,x21
00bf6084	ldp x8,x9,[x20, #0x10]!
00bf6088	sub x9,x9,x8
00bf608c	asr x10,x9,#0x3
00bf6090	cmp x10,x22
00bf6094	b.hi 0x00bf60c0
00bf6098	add x9,x22,#0x1
00bf609c	subs x1,x9,x10
00bf60a0	b.ls 0x00bf60b4
00bf60a4	mov x0,x20
00bf60a8	bl 0x00c0b6e4
00bf60ac	ldr x8,[x20]
00bf60b0	b 0x00bf60c0
00bf60b4	b.cs 0x00bf60c0
00bf60b8	add x9,x8,x9, LSL #0x3
00bf60bc	str x9,[x21, #0x18]
00bf60c0	ldr x21,[x8, x22, LSL #0x3]
00bf60c4	cbz x21,0x00bf60e8
00bf60c8	add x1,x21,#0x8
00bf60cc	mov x0,#-0x1
00bf60d0	bl 0x00c2bd10
00bf60d4	cbnz x0,0x00bf60e8
00bf60d8	ldr x8,[x21]
00bf60dc	mov x0,x21
00bf60e0	ldr x8,[x8, #0x10]
00bf60e4	blr x8
00bf60e8	ldr x8,[x20]
00bf60ec	str x19,[x8, x22, LSL #0x3]
00bf60f0	ldp x20,x19,[sp, #0x40]
00bf60f4	ldp x22,x21,[sp, #0x30]
00bf60f8	ldp x29,x30,[sp, #0x20]
00bf60fc	add sp,sp,#0x50
00bf6100	autiasp
00bf6104	ret
