; FUN_00bf5c88 @ 00bf5c88
00bf5c88	paciasp
00bf5c8c	sub sp,sp,#0x50
00bf5c90	stp x29,x30,[sp, #0x20]
00bf5c94	stp x22,x21,[sp, #0x30]
00bf5c98	stp x20,x19,[sp, #0x40]
00bf5c9c	add x29,sp,#0x20
00bf5ca0	adrp x20,0xcb4000
00bf5ca4	mov x19,x1
00bf5ca8	mov x21,x0
00bf5cac	ldr x20,[x20, #0x998]
00bf5cb0	str x20,[sp, #0x8]
00bf5cb4	ldar x8,[x20]
00bf5cb8	cmn x8,#0x1
00bf5cbc	b.eq 0x00bf5ce8
00bf5cc0	add x8,sp,#0x8
00bf5cc4	sub x9,x29,#0x8
00bf5cc8	adrp x0,0xcb4000
00bf5ccc	stur x8,[x29, #-0x8]
00bf5cd0	nop
00bf5cd4	adr x2,0xc0bab0
00bf5cd8	str x9,[sp, #0x10]
00bf5cdc	add x1,sp,#0x10
00bf5ce0	ldr x0,[x0, #0x998]
00bf5ce4	bl 0x00c305d0
00bf5ce8	ldrsw x8,[x20, #0x8]
00bf5cec	add x1,x19,#0x8
00bf5cf0	mov w0,#0x1
00bf5cf4	sub x22,x8,#0x1
00bf5cf8	bl 0x00c2bce0
00bf5cfc	mov x20,x21
00bf5d00	ldp x8,x9,[x20, #0x10]!
00bf5d04	sub x9,x9,x8
00bf5d08	asr x10,x9,#0x3
00bf5d0c	cmp x10,x22
00bf5d10	b.hi 0x00bf5d3c
00bf5d14	add x9,x22,#0x1
00bf5d18	subs x1,x9,x10
00bf5d1c	b.ls 0x00bf5d30
00bf5d20	mov x0,x20
00bf5d24	bl 0x00c0b6e4
00bf5d28	ldr x8,[x20]
00bf5d2c	b 0x00bf5d3c
00bf5d30	b.cs 0x00bf5d3c
00bf5d34	add x9,x8,x9, LSL #0x3
00bf5d38	str x9,[x21, #0x18]
00bf5d3c	ldr x21,[x8, x22, LSL #0x3]
00bf5d40	cbz x21,0x00bf5d64
00bf5d44	add x1,x21,#0x8
00bf5d48	mov x0,#-0x1
00bf5d4c	bl 0x00c2bd10
00bf5d50	cbnz x0,0x00bf5d64
00bf5d54	ldr x8,[x21]
00bf5d58	mov x0,x21
00bf5d5c	ldr x8,[x8, #0x10]
00bf5d60	blr x8
00bf5d64	ldr x8,[x20]
00bf5d68	str x19,[x8, x22, LSL #0x3]
00bf5d6c	ldp x20,x19,[sp, #0x40]
00bf5d70	ldp x22,x21,[sp, #0x30]
00bf5d74	ldp x29,x30,[sp, #0x20]
00bf5d78	add sp,sp,#0x50
00bf5d7c	autiasp
00bf5d80	ret
