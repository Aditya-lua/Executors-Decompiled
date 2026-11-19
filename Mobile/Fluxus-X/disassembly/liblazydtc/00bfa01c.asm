; FUN_00bfa01c @ 00bfa01c
00bfa01c	paciasp
00bfa020	sub sp,sp,#0x50
00bfa024	stp x29,x30,[sp, #0x20]
00bfa028	stp x22,x21,[sp, #0x30]
00bfa02c	stp x20,x19,[sp, #0x40]
00bfa030	add x29,sp,#0x20
00bfa034	adrp x20,0xcb5000
00bfa038	mov x19,x1
00bfa03c	mov x21,x0
00bfa040	ldr x20,[x20, #0xbb0]
00bfa044	str x20,[sp, #0x8]
00bfa048	ldar x8,[x20]
00bfa04c	cmn x8,#0x1
00bfa050	b.eq 0x00bfa07c
00bfa054	add x8,sp,#0x8
00bfa058	sub x9,x29,#0x8
00bfa05c	adrp x0,0xcb5000
00bfa060	stur x8,[x29, #-0x8]
00bfa064	nop
00bfa068	adr x2,0xc0bab0
00bfa06c	str x9,[sp, #0x10]
00bfa070	add x1,sp,#0x10
00bfa074	ldr x0,[x0, #0xbb0]
00bfa078	bl 0x00c305d0
00bfa07c	ldp x8,x10,[x19, #0x10]
00bfa080	ldrsw x9,[x20, #0x8]
00bfa084	sub x22,x9,#0x1
00bfa088	sub x9,x10,x8
00bfa08c	cmp x22,x9, ASR #0x3
00bfa090	b.cs 0x00bfa130
00bfa094	ldr x19,[x8, x22, LSL #0x3]
00bfa098	cbz x19,0x00bfa130
00bfa09c	add x1,x19,#0x8
00bfa0a0	mov w0,#0x1
00bfa0a4	bl 0x00c2bce0
00bfa0a8	mov x20,x21
00bfa0ac	ldp x8,x9,[x20, #0x10]!
00bfa0b0	sub x9,x9,x8
00bfa0b4	asr x10,x9,#0x3
00bfa0b8	cmp x10,x22
00bfa0bc	b.hi 0x00bfa0e8
00bfa0c0	add x9,x22,#0x1
00bfa0c4	subs x1,x9,x10
00bfa0c8	b.ls 0x00bfa0dc
00bfa0cc	mov x0,x20
00bfa0d0	bl 0x00c0b6e4
00bfa0d4	ldr x8,[x20]
00bfa0d8	b 0x00bfa0e8
00bfa0dc	b.cs 0x00bfa0e8
00bfa0e0	add x9,x8,x9, LSL #0x3
00bfa0e4	str x9,[x21, #0x18]
00bfa0e8	ldr x21,[x8, x22, LSL #0x3]
00bfa0ec	cbz x21,0x00bfa110
00bfa0f0	add x1,x21,#0x8
00bfa0f4	mov x0,#-0x1
00bfa0f8	bl 0x00c2bd10
00bfa0fc	cbnz x0,0x00bfa110
00bfa100	ldr x8,[x21]
00bfa104	mov x0,x21
00bfa108	ldr x8,[x8, #0x10]
00bfa10c	blr x8
00bfa110	ldr x8,[x20]
00bfa114	str x19,[x8, x22, LSL #0x3]
00bfa118	ldp x20,x19,[sp, #0x40]
00bfa11c	ldp x22,x21,[sp, #0x30]
00bfa120	ldp x29,x30,[sp, #0x20]
00bfa124	add sp,sp,#0x50
00bfa128	autiasp
00bfa12c	ret
00bfa130	bl 0x00bd8968
