; FUN_00bf9c50 @ 00bf9c50
00bf9c50	paciasp
00bf9c54	sub sp,sp,#0x50
00bf9c58	stp x29,x30,[sp, #0x20]
00bf9c5c	stp x22,x21,[sp, #0x30]
00bf9c60	stp x20,x19,[sp, #0x40]
00bf9c64	add x29,sp,#0x20
00bf9c68	adrp x20,0xcb4000
00bf9c6c	mov x19,x1
00bf9c70	mov x21,x0
00bf9c74	ldr x20,[x20, #0xf38]
00bf9c78	str x20,[sp, #0x8]
00bf9c7c	ldar x8,[x20]
00bf9c80	cmn x8,#0x1
00bf9c84	b.eq 0x00bf9cb0
00bf9c88	add x8,sp,#0x8
00bf9c8c	sub x9,x29,#0x8
00bf9c90	adrp x0,0xcb4000
00bf9c94	stur x8,[x29, #-0x8]
00bf9c98	nop
00bf9c9c	adr x2,0xc0bab0
00bf9ca0	str x9,[sp, #0x10]
00bf9ca4	add x1,sp,#0x10
00bf9ca8	ldr x0,[x0, #0xf38]
00bf9cac	bl 0x00c305d0
00bf9cb0	ldp x8,x10,[x19, #0x10]
00bf9cb4	ldrsw x9,[x20, #0x8]
00bf9cb8	sub x22,x9,#0x1
00bf9cbc	sub x9,x10,x8
00bf9cc0	cmp x22,x9, ASR #0x3
00bf9cc4	b.cs 0x00bf9d64
00bf9cc8	ldr x19,[x8, x22, LSL #0x3]
00bf9ccc	cbz x19,0x00bf9d64
00bf9cd0	add x1,x19,#0x8
00bf9cd4	mov w0,#0x1
00bf9cd8	bl 0x00c2bce0
00bf9cdc	mov x20,x21
00bf9ce0	ldp x8,x9,[x20, #0x10]!
00bf9ce4	sub x9,x9,x8
00bf9ce8	asr x10,x9,#0x3
00bf9cec	cmp x10,x22
00bf9cf0	b.hi 0x00bf9d1c
00bf9cf4	add x9,x22,#0x1
00bf9cf8	subs x1,x9,x10
00bf9cfc	b.ls 0x00bf9d10
00bf9d00	mov x0,x20
00bf9d04	bl 0x00c0b6e4
00bf9d08	ldr x8,[x20]
00bf9d0c	b 0x00bf9d1c
00bf9d10	b.cs 0x00bf9d1c
00bf9d14	add x9,x8,x9, LSL #0x3
00bf9d18	str x9,[x21, #0x18]
00bf9d1c	ldr x21,[x8, x22, LSL #0x3]
00bf9d20	cbz x21,0x00bf9d44
00bf9d24	add x1,x21,#0x8
00bf9d28	mov x0,#-0x1
00bf9d2c	bl 0x00c2bd10
00bf9d30	cbnz x0,0x00bf9d44
00bf9d34	ldr x8,[x21]
00bf9d38	mov x0,x21
00bf9d3c	ldr x8,[x8, #0x10]
00bf9d40	blr x8
00bf9d44	ldr x8,[x20]
00bf9d48	str x19,[x8, x22, LSL #0x3]
00bf9d4c	ldp x20,x19,[sp, #0x40]
00bf9d50	ldp x22,x21,[sp, #0x30]
00bf9d54	ldp x29,x30,[sp, #0x20]
00bf9d58	add sp,sp,#0x50
00bf9d5c	autiasp
00bf9d60	ret
00bf9d64	bl 0x00bd8968
