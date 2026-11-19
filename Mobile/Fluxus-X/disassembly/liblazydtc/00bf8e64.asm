; FUN_00bf8e64 @ 00bf8e64
00bf8e64	paciasp
00bf8e68	sub sp,sp,#0x50
00bf8e6c	stp x29,x30,[sp, #0x20]
00bf8e70	stp x22,x21,[sp, #0x30]
00bf8e74	stp x20,x19,[sp, #0x40]
00bf8e78	add x29,sp,#0x20
00bf8e7c	adrp x20,0xcb5000
00bf8e80	mov x19,x1
00bf8e84	mov x21,x0
00bf8e88	ldr x20,[x20, #0xbf0]
00bf8e8c	str x20,[sp, #0x8]
00bf8e90	ldar x8,[x20]
00bf8e94	cmn x8,#0x1
00bf8e98	b.eq 0x00bf8ec4
00bf8e9c	add x8,sp,#0x8
00bf8ea0	sub x9,x29,#0x8
00bf8ea4	adrp x0,0xcb5000
00bf8ea8	stur x8,[x29, #-0x8]
00bf8eac	nop
00bf8eb0	adr x2,0xc0bab0
00bf8eb4	str x9,[sp, #0x10]
00bf8eb8	add x1,sp,#0x10
00bf8ebc	ldr x0,[x0, #0xbf0]
00bf8ec0	bl 0x00c305d0
00bf8ec4	ldp x8,x10,[x19, #0x10]
00bf8ec8	ldrsw x9,[x20, #0x8]
00bf8ecc	sub x22,x9,#0x1
00bf8ed0	sub x9,x10,x8
00bf8ed4	cmp x22,x9, ASR #0x3
00bf8ed8	b.cs 0x00bf8f78
00bf8edc	ldr x19,[x8, x22, LSL #0x3]
00bf8ee0	cbz x19,0x00bf8f78
00bf8ee4	add x1,x19,#0x8
00bf8ee8	mov w0,#0x1
00bf8eec	bl 0x00c2bce0
00bf8ef0	mov x20,x21
00bf8ef4	ldp x8,x9,[x20, #0x10]!
00bf8ef8	sub x9,x9,x8
00bf8efc	asr x10,x9,#0x3
00bf8f00	cmp x10,x22
00bf8f04	b.hi 0x00bf8f30
00bf8f08	add x9,x22,#0x1
00bf8f0c	subs x1,x9,x10
00bf8f10	b.ls 0x00bf8f24
00bf8f14	mov x0,x20
00bf8f18	bl 0x00c0b6e4
00bf8f1c	ldr x8,[x20]
00bf8f20	b 0x00bf8f30
00bf8f24	b.cs 0x00bf8f30
00bf8f28	add x9,x8,x9, LSL #0x3
00bf8f2c	str x9,[x21, #0x18]
00bf8f30	ldr x21,[x8, x22, LSL #0x3]
00bf8f34	cbz x21,0x00bf8f58
00bf8f38	add x1,x21,#0x8
00bf8f3c	mov x0,#-0x1
00bf8f40	bl 0x00c2bd10
00bf8f44	cbnz x0,0x00bf8f58
00bf8f48	ldr x8,[x21]
00bf8f4c	mov x0,x21
00bf8f50	ldr x8,[x8, #0x10]
00bf8f54	blr x8
00bf8f58	ldr x8,[x20]
00bf8f5c	str x19,[x8, x22, LSL #0x3]
00bf8f60	ldp x20,x19,[sp, #0x40]
00bf8f64	ldp x22,x21,[sp, #0x30]
00bf8f68	ldp x29,x30,[sp, #0x20]
00bf8f6c	add sp,sp,#0x50
00bf8f70	autiasp
00bf8f74	ret
00bf8f78	bl 0x00bd8968
