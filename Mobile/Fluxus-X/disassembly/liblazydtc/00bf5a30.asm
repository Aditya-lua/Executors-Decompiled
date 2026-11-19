; FUN_00bf5a30 @ 00bf5a30
00bf5a30	paciasp
00bf5a34	sub sp,sp,#0x50
00bf5a38	stp x29,x30,[sp, #0x20]
00bf5a3c	stp x22,x21,[sp, #0x30]
00bf5a40	stp x20,x19,[sp, #0x40]
00bf5a44	add x29,sp,#0x20
00bf5a48	adrp x20,0xcb4000
00bf5a4c	mov x19,x1
00bf5a50	mov x21,x0
00bf5a54	ldr x20,[x20, #0xa38]
00bf5a58	str x20,[sp, #0x8]
00bf5a5c	ldar x8,[x20]
00bf5a60	cmn x8,#0x1
00bf5a64	b.eq 0x00bf5a90
00bf5a68	add x8,sp,#0x8
00bf5a6c	sub x9,x29,#0x8
00bf5a70	adrp x0,0xcb4000
00bf5a74	stur x8,[x29, #-0x8]
00bf5a78	nop
00bf5a7c	adr x2,0xc0bab0
00bf5a80	str x9,[sp, #0x10]
00bf5a84	add x1,sp,#0x10
00bf5a88	ldr x0,[x0, #0xa38]
00bf5a8c	bl 0x00c305d0
00bf5a90	ldrsw x8,[x20, #0x8]
00bf5a94	add x1,x19,#0x8
00bf5a98	mov w0,#0x1
00bf5a9c	sub x22,x8,#0x1
00bf5aa0	bl 0x00c2bce0
00bf5aa4	mov x20,x21
00bf5aa8	ldp x8,x9,[x20, #0x10]!
00bf5aac	sub x9,x9,x8
00bf5ab0	asr x10,x9,#0x3
00bf5ab4	cmp x10,x22
00bf5ab8	b.hi 0x00bf5ae4
00bf5abc	add x9,x22,#0x1
00bf5ac0	subs x1,x9,x10
00bf5ac4	b.ls 0x00bf5ad8
00bf5ac8	mov x0,x20
00bf5acc	bl 0x00c0b6e4
00bf5ad0	ldr x8,[x20]
00bf5ad4	b 0x00bf5ae4
00bf5ad8	b.cs 0x00bf5ae4
00bf5adc	add x9,x8,x9, LSL #0x3
00bf5ae0	str x9,[x21, #0x18]
00bf5ae4	ldr x21,[x8, x22, LSL #0x3]
00bf5ae8	cbz x21,0x00bf5b0c
00bf5aec	add x1,x21,#0x8
00bf5af0	mov x0,#-0x1
00bf5af4	bl 0x00c2bd10
00bf5af8	cbnz x0,0x00bf5b0c
00bf5afc	ldr x8,[x21]
00bf5b00	mov x0,x21
00bf5b04	ldr x8,[x8, #0x10]
00bf5b08	blr x8
00bf5b0c	ldr x8,[x20]
00bf5b10	str x19,[x8, x22, LSL #0x3]
00bf5b14	ldp x20,x19,[sp, #0x40]
00bf5b18	ldp x22,x21,[sp, #0x30]
00bf5b1c	ldp x29,x30,[sp, #0x20]
00bf5b20	add sp,sp,#0x50
00bf5b24	autiasp
00bf5b28	ret
