; FUN_00bf6e78 @ 00bf6e78
00bf6e78	paciasp
00bf6e7c	sub sp,sp,#0x50
00bf6e80	stp x29,x30,[sp, #0x20]
00bf6e84	stp x22,x21,[sp, #0x30]
00bf6e88	stp x20,x19,[sp, #0x40]
00bf6e8c	add x29,sp,#0x20
00bf6e90	adrp x20,0xcb5000
00bf6e94	mov x19,x1
00bf6e98	mov x21,x0
00bf6e9c	ldr x20,[x20, #0xc30]
00bf6ea0	str x20,[sp, #0x8]
00bf6ea4	ldar x8,[x20]
00bf6ea8	cmn x8,#0x1
00bf6eac	b.eq 0x00bf6ed8
00bf6eb0	add x8,sp,#0x8
00bf6eb4	sub x9,x29,#0x8
00bf6eb8	adrp x0,0xcb5000
00bf6ebc	stur x8,[x29, #-0x8]
00bf6ec0	nop
00bf6ec4	adr x2,0xc0bab0
00bf6ec8	str x9,[sp, #0x10]
00bf6ecc	add x1,sp,#0x10
00bf6ed0	ldr x0,[x0, #0xc30]
00bf6ed4	bl 0x00c305d0
00bf6ed8	ldrsw x8,[x20, #0x8]
00bf6edc	add x1,x19,#0x8
00bf6ee0	mov w0,#0x1
00bf6ee4	sub x22,x8,#0x1
00bf6ee8	bl 0x00c2bce0
00bf6eec	mov x20,x21
00bf6ef0	ldp x8,x9,[x20, #0x10]!
00bf6ef4	sub x9,x9,x8
00bf6ef8	asr x10,x9,#0x3
00bf6efc	cmp x10,x22
00bf6f00	b.hi 0x00bf6f2c
00bf6f04	add x9,x22,#0x1
00bf6f08	subs x1,x9,x10
00bf6f0c	b.ls 0x00bf6f20
00bf6f10	mov x0,x20
00bf6f14	bl 0x00c0b6e4
00bf6f18	ldr x8,[x20]
00bf6f1c	b 0x00bf6f2c
00bf6f20	b.cs 0x00bf6f2c
00bf6f24	add x9,x8,x9, LSL #0x3
00bf6f28	str x9,[x21, #0x18]
00bf6f2c	ldr x21,[x8, x22, LSL #0x3]
00bf6f30	cbz x21,0x00bf6f54
00bf6f34	add x1,x21,#0x8
00bf6f38	mov x0,#-0x1
00bf6f3c	bl 0x00c2bd10
00bf6f40	cbnz x0,0x00bf6f54
00bf6f44	ldr x8,[x21]
00bf6f48	mov x0,x21
00bf6f4c	ldr x8,[x8, #0x10]
00bf6f50	blr x8
00bf6f54	ldr x8,[x20]
00bf6f58	str x19,[x8, x22, LSL #0x3]
00bf6f5c	ldp x20,x19,[sp, #0x40]
00bf6f60	ldp x22,x21,[sp, #0x30]
00bf6f64	ldp x29,x30,[sp, #0x20]
00bf6f68	add sp,sp,#0x50
00bf6f6c	autiasp
00bf6f70	ret
