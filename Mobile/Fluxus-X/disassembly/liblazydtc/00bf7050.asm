; FUN_00bf7050 @ 00bf7050
00bf7050	paciasp
00bf7054	sub sp,sp,#0x50
00bf7058	stp x29,x30,[sp, #0x20]
00bf705c	stp x22,x21,[sp, #0x30]
00bf7060	stp x20,x19,[sp, #0x40]
00bf7064	add x29,sp,#0x20
00bf7068	adrp x20,0xcb5000
00bf706c	mov x19,x1
00bf7070	mov x21,x0
00bf7074	ldr x20,[x20, #0xd30]
00bf7078	str x20,[sp, #0x8]
00bf707c	ldar x8,[x20]
00bf7080	cmn x8,#0x1
00bf7084	b.eq 0x00bf70b0
00bf7088	add x8,sp,#0x8
00bf708c	sub x9,x29,#0x8
00bf7090	adrp x0,0xcb5000
00bf7094	stur x8,[x29, #-0x8]
00bf7098	nop
00bf709c	adr x2,0xc0bab0
00bf70a0	str x9,[sp, #0x10]
00bf70a4	add x1,sp,#0x10
00bf70a8	ldr x0,[x0, #0xd30]
00bf70ac	bl 0x00c305d0
00bf70b0	ldrsw x8,[x20, #0x8]
00bf70b4	add x1,x19,#0x8
00bf70b8	mov w0,#0x1
00bf70bc	sub x22,x8,#0x1
00bf70c0	bl 0x00c2bce0
00bf70c4	mov x20,x21
00bf70c8	ldp x8,x9,[x20, #0x10]!
00bf70cc	sub x9,x9,x8
00bf70d0	asr x10,x9,#0x3
00bf70d4	cmp x10,x22
00bf70d8	b.hi 0x00bf7104
00bf70dc	add x9,x22,#0x1
00bf70e0	subs x1,x9,x10
00bf70e4	b.ls 0x00bf70f8
00bf70e8	mov x0,x20
00bf70ec	bl 0x00c0b6e4
00bf70f0	ldr x8,[x20]
00bf70f4	b 0x00bf7104
00bf70f8	b.cs 0x00bf7104
00bf70fc	add x9,x8,x9, LSL #0x3
00bf7100	str x9,[x21, #0x18]
00bf7104	ldr x21,[x8, x22, LSL #0x3]
00bf7108	cbz x21,0x00bf712c
00bf710c	add x1,x21,#0x8
00bf7110	mov x0,#-0x1
00bf7114	bl 0x00c2bd10
00bf7118	cbnz x0,0x00bf712c
00bf711c	ldr x8,[x21]
00bf7120	mov x0,x21
00bf7124	ldr x8,[x8, #0x10]
00bf7128	blr x8
00bf712c	ldr x8,[x20]
00bf7130	str x19,[x8, x22, LSL #0x3]
00bf7134	ldp x20,x19,[sp, #0x40]
00bf7138	ldp x22,x21,[sp, #0x30]
00bf713c	ldp x29,x30,[sp, #0x20]
00bf7140	add sp,sp,#0x50
00bf7144	autiasp
00bf7148	ret
