; FUN_00bf9ed8 @ 00bf9ed8
00bf9ed8	paciasp
00bf9edc	sub sp,sp,#0x50
00bf9ee0	stp x29,x30,[sp, #0x20]
00bf9ee4	stp x22,x21,[sp, #0x30]
00bf9ee8	stp x20,x19,[sp, #0x40]
00bf9eec	add x29,sp,#0x20
00bf9ef0	adrp x20,0xcb4000
00bf9ef4	mov x19,x1
00bf9ef8	mov x21,x0
00bf9efc	ldr x20,[x20, #0xf40]
00bf9f00	str x20,[sp, #0x8]
00bf9f04	ldar x8,[x20]
00bf9f08	cmn x8,#0x1
00bf9f0c	b.eq 0x00bf9f38
00bf9f10	add x8,sp,#0x8
00bf9f14	sub x9,x29,#0x8
00bf9f18	adrp x0,0xcb4000
00bf9f1c	stur x8,[x29, #-0x8]
00bf9f20	nop
00bf9f24	adr x2,0xc0bab0
00bf9f28	str x9,[sp, #0x10]
00bf9f2c	add x1,sp,#0x10
00bf9f30	ldr x0,[x0, #0xf40]
00bf9f34	bl 0x00c305d0
00bf9f38	ldp x8,x10,[x19, #0x10]
00bf9f3c	ldrsw x9,[x20, #0x8]
00bf9f40	sub x22,x9,#0x1
00bf9f44	sub x9,x10,x8
00bf9f48	cmp x22,x9, ASR #0x3
00bf9f4c	b.cs 0x00bf9fec
00bf9f50	ldr x19,[x8, x22, LSL #0x3]
00bf9f54	cbz x19,0x00bf9fec
00bf9f58	add x1,x19,#0x8
00bf9f5c	mov w0,#0x1
00bf9f60	bl 0x00c2bce0
00bf9f64	mov x20,x21
00bf9f68	ldp x8,x9,[x20, #0x10]!
00bf9f6c	sub x9,x9,x8
00bf9f70	asr x10,x9,#0x3
00bf9f74	cmp x10,x22
00bf9f78	b.hi 0x00bf9fa4
00bf9f7c	add x9,x22,#0x1
00bf9f80	subs x1,x9,x10
00bf9f84	b.ls 0x00bf9f98
00bf9f88	mov x0,x20
00bf9f8c	bl 0x00c0b6e4
00bf9f90	ldr x8,[x20]
00bf9f94	b 0x00bf9fa4
00bf9f98	b.cs 0x00bf9fa4
00bf9f9c	add x9,x8,x9, LSL #0x3
00bf9fa0	str x9,[x21, #0x18]
00bf9fa4	ldr x21,[x8, x22, LSL #0x3]
00bf9fa8	cbz x21,0x00bf9fcc
00bf9fac	add x1,x21,#0x8
00bf9fb0	mov x0,#-0x1
00bf9fb4	bl 0x00c2bd10
00bf9fb8	cbnz x0,0x00bf9fcc
00bf9fbc	ldr x8,[x21]
00bf9fc0	mov x0,x21
00bf9fc4	ldr x8,[x8, #0x10]
00bf9fc8	blr x8
00bf9fcc	ldr x8,[x20]
00bf9fd0	str x19,[x8, x22, LSL #0x3]
00bf9fd4	ldp x20,x19,[sp, #0x40]
00bf9fd8	ldp x22,x21,[sp, #0x30]
00bf9fdc	ldp x29,x30,[sp, #0x20]
00bf9fe0	add sp,sp,#0x50
00bf9fe4	autiasp
00bf9fe8	ret
00bf9fec	bl 0x00bd8968
