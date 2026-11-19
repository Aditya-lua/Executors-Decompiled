; FUN_00bf99c8 @ 00bf99c8
00bf99c8	paciasp
00bf99cc	sub sp,sp,#0x50
00bf99d0	stp x29,x30,[sp, #0x20]
00bf99d4	stp x22,x21,[sp, #0x30]
00bf99d8	stp x20,x19,[sp, #0x40]
00bf99dc	add x29,sp,#0x20
00bf99e0	adrp x20,0xcb5000
00bf99e4	mov x19,x1
00bf99e8	mov x21,x0
00bf99ec	ldr x20,[x20, #0xc00]
00bf99f0	str x20,[sp, #0x8]
00bf99f4	ldar x8,[x20]
00bf99f8	cmn x8,#0x1
00bf99fc	b.eq 0x00bf9a28
00bf9a00	add x8,sp,#0x8
00bf9a04	sub x9,x29,#0x8
00bf9a08	adrp x0,0xcb5000
00bf9a0c	stur x8,[x29, #-0x8]
00bf9a10	nop
00bf9a14	adr x2,0xc0bab0
00bf9a18	str x9,[sp, #0x10]
00bf9a1c	add x1,sp,#0x10
00bf9a20	ldr x0,[x0, #0xc00]
00bf9a24	bl 0x00c305d0
00bf9a28	ldp x8,x10,[x19, #0x10]
00bf9a2c	ldrsw x9,[x20, #0x8]
00bf9a30	sub x22,x9,#0x1
00bf9a34	sub x9,x10,x8
00bf9a38	cmp x22,x9, ASR #0x3
00bf9a3c	b.cs 0x00bf9adc
00bf9a40	ldr x19,[x8, x22, LSL #0x3]
00bf9a44	cbz x19,0x00bf9adc
00bf9a48	add x1,x19,#0x8
00bf9a4c	mov w0,#0x1
00bf9a50	bl 0x00c2bce0
00bf9a54	mov x20,x21
00bf9a58	ldp x8,x9,[x20, #0x10]!
00bf9a5c	sub x9,x9,x8
00bf9a60	asr x10,x9,#0x3
00bf9a64	cmp x10,x22
00bf9a68	b.hi 0x00bf9a94
00bf9a6c	add x9,x22,#0x1
00bf9a70	subs x1,x9,x10
00bf9a74	b.ls 0x00bf9a88
00bf9a78	mov x0,x20
00bf9a7c	bl 0x00c0b6e4
00bf9a80	ldr x8,[x20]
00bf9a84	b 0x00bf9a94
00bf9a88	b.cs 0x00bf9a94
00bf9a8c	add x9,x8,x9, LSL #0x3
00bf9a90	str x9,[x21, #0x18]
00bf9a94	ldr x21,[x8, x22, LSL #0x3]
00bf9a98	cbz x21,0x00bf9abc
00bf9a9c	add x1,x21,#0x8
00bf9aa0	mov x0,#-0x1
00bf9aa4	bl 0x00c2bd10
00bf9aa8	cbnz x0,0x00bf9abc
00bf9aac	ldr x8,[x21]
00bf9ab0	mov x0,x21
00bf9ab4	ldr x8,[x8, #0x10]
00bf9ab8	blr x8
00bf9abc	ldr x8,[x20]
00bf9ac0	str x19,[x8, x22, LSL #0x3]
00bf9ac4	ldp x20,x19,[sp, #0x40]
00bf9ac8	ldp x22,x21,[sp, #0x30]
00bf9acc	ldp x29,x30,[sp, #0x20]
00bf9ad0	add sp,sp,#0x50
00bf9ad4	autiasp
00bf9ad8	ret
00bf9adc	bl 0x00bd8968
