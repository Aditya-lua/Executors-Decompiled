; FUN_00bf6ca0 @ 00bf6ca0
00bf6ca0	paciasp
00bf6ca4	sub sp,sp,#0x50
00bf6ca8	stp x29,x30,[sp, #0x20]
00bf6cac	stp x22,x21,[sp, #0x30]
00bf6cb0	stp x20,x19,[sp, #0x40]
00bf6cb4	add x29,sp,#0x20
00bf6cb8	adrp x20,0xcb5000
00bf6cbc	mov x19,x1
00bf6cc0	mov x21,x0
00bf6cc4	ldr x20,[x20, #0xc38]
00bf6cc8	str x20,[sp, #0x8]
00bf6ccc	ldar x8,[x20]
00bf6cd0	cmn x8,#0x1
00bf6cd4	b.eq 0x00bf6d00
00bf6cd8	add x8,sp,#0x8
00bf6cdc	sub x9,x29,#0x8
00bf6ce0	adrp x0,0xcb5000
00bf6ce4	stur x8,[x29, #-0x8]
00bf6ce8	nop
00bf6cec	adr x2,0xc0bab0
00bf6cf0	str x9,[sp, #0x10]
00bf6cf4	add x1,sp,#0x10
00bf6cf8	ldr x0,[x0, #0xc38]
00bf6cfc	bl 0x00c305d0
00bf6d00	ldrsw x8,[x20, #0x8]
00bf6d04	add x1,x19,#0x8
00bf6d08	mov w0,#0x1
00bf6d0c	sub x22,x8,#0x1
00bf6d10	bl 0x00c2bce0
00bf6d14	mov x20,x21
00bf6d18	ldp x8,x9,[x20, #0x10]!
00bf6d1c	sub x9,x9,x8
00bf6d20	asr x10,x9,#0x3
00bf6d24	cmp x10,x22
00bf6d28	b.hi 0x00bf6d54
00bf6d2c	add x9,x22,#0x1
00bf6d30	subs x1,x9,x10
00bf6d34	b.ls 0x00bf6d48
00bf6d38	mov x0,x20
00bf6d3c	bl 0x00c0b6e4
00bf6d40	ldr x8,[x20]
00bf6d44	b 0x00bf6d54
00bf6d48	b.cs 0x00bf6d54
00bf6d4c	add x9,x8,x9, LSL #0x3
00bf6d50	str x9,[x21, #0x18]
00bf6d54	ldr x21,[x8, x22, LSL #0x3]
00bf6d58	cbz x21,0x00bf6d7c
00bf6d5c	add x1,x21,#0x8
00bf6d60	mov x0,#-0x1
00bf6d64	bl 0x00c2bd10
00bf6d68	cbnz x0,0x00bf6d7c
00bf6d6c	ldr x8,[x21]
00bf6d70	mov x0,x21
00bf6d74	ldr x8,[x8, #0x10]
00bf6d78	blr x8
00bf6d7c	ldr x8,[x20]
00bf6d80	str x19,[x8, x22, LSL #0x3]
00bf6d84	ldp x20,x19,[sp, #0x40]
00bf6d88	ldp x22,x21,[sp, #0x30]
00bf6d8c	ldp x29,x30,[sp, #0x20]
00bf6d90	add sp,sp,#0x50
00bf6d94	autiasp
00bf6d98	ret
