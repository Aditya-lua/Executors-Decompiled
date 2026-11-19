; FUN_00bfa160 @ 00bfa160
00bfa160	paciasp
00bfa164	sub sp,sp,#0x50
00bfa168	stp x29,x30,[sp, #0x20]
00bfa16c	stp x22,x21,[sp, #0x30]
00bfa170	stp x20,x19,[sp, #0x40]
00bfa174	add x29,sp,#0x20
00bfa178	adrp x20,0xcb5000
00bfa17c	mov x19,x1
00bfa180	mov x21,x0
00bfa184	ldr x20,[x20, #0xd30]
00bfa188	str x20,[sp, #0x8]
00bfa18c	ldar x8,[x20]
00bfa190	cmn x8,#0x1
00bfa194	b.eq 0x00bfa1c0
00bfa198	add x8,sp,#0x8
00bfa19c	sub x9,x29,#0x8
00bfa1a0	adrp x0,0xcb5000
00bfa1a4	stur x8,[x29, #-0x8]
00bfa1a8	nop
00bfa1ac	adr x2,0xc0bab0
00bfa1b0	str x9,[sp, #0x10]
00bfa1b4	add x1,sp,#0x10
00bfa1b8	ldr x0,[x0, #0xd30]
00bfa1bc	bl 0x00c305d0
00bfa1c0	ldp x8,x10,[x19, #0x10]
00bfa1c4	ldrsw x9,[x20, #0x8]
00bfa1c8	sub x22,x9,#0x1
00bfa1cc	sub x9,x10,x8
00bfa1d0	cmp x22,x9, ASR #0x3
00bfa1d4	b.cs 0x00bfa274
00bfa1d8	ldr x19,[x8, x22, LSL #0x3]
00bfa1dc	cbz x19,0x00bfa274
00bfa1e0	add x1,x19,#0x8
00bfa1e4	mov w0,#0x1
00bfa1e8	bl 0x00c2bce0
00bfa1ec	mov x20,x21
00bfa1f0	ldp x8,x9,[x20, #0x10]!
00bfa1f4	sub x9,x9,x8
00bfa1f8	asr x10,x9,#0x3
00bfa1fc	cmp x10,x22
00bfa200	b.hi 0x00bfa22c
00bfa204	add x9,x22,#0x1
00bfa208	subs x1,x9,x10
00bfa20c	b.ls 0x00bfa220
00bfa210	mov x0,x20
00bfa214	bl 0x00c0b6e4
00bfa218	ldr x8,[x20]
00bfa21c	b 0x00bfa22c
00bfa220	b.cs 0x00bfa22c
00bfa224	add x9,x8,x9, LSL #0x3
00bfa228	str x9,[x21, #0x18]
00bfa22c	ldr x21,[x8, x22, LSL #0x3]
00bfa230	cbz x21,0x00bfa254
00bfa234	add x1,x21,#0x8
00bfa238	mov x0,#-0x1
00bfa23c	bl 0x00c2bd10
00bfa240	cbnz x0,0x00bfa254
00bfa244	ldr x8,[x21]
00bfa248	mov x0,x21
00bfa24c	ldr x8,[x8, #0x10]
00bfa250	blr x8
00bfa254	ldr x8,[x20]
00bfa258	str x19,[x8, x22, LSL #0x3]
00bfa25c	ldp x20,x19,[sp, #0x40]
00bfa260	ldp x22,x21,[sp, #0x30]
00bfa264	ldp x29,x30,[sp, #0x20]
00bfa268	add sp,sp,#0x50
00bfa26c	autiasp
00bfa270	ret
00bfa274	bl 0x00bd8968
