; FUN_00bf5ee0 @ 00bf5ee0
00bf5ee0	paciasp
00bf5ee4	sub sp,sp,#0x50
00bf5ee8	stp x29,x30,[sp, #0x20]
00bf5eec	stp x22,x21,[sp, #0x30]
00bf5ef0	stp x20,x19,[sp, #0x40]
00bf5ef4	add x29,sp,#0x20
00bf5ef8	adrp x20,0xcb4000
00bf5efc	mov x19,x1
00bf5f00	mov x21,x0
00bf5f04	ldr x20,[x20, #0xf70]
00bf5f08	str x20,[sp, #0x8]
00bf5f0c	ldar x8,[x20]
00bf5f10	cmn x8,#0x1
00bf5f14	b.eq 0x00bf5f40
00bf5f18	add x8,sp,#0x8
00bf5f1c	sub x9,x29,#0x8
00bf5f20	adrp x0,0xcb4000
00bf5f24	stur x8,[x29, #-0x8]
00bf5f28	nop
00bf5f2c	adr x2,0xc0bab0
00bf5f30	str x9,[sp, #0x10]
00bf5f34	add x1,sp,#0x10
00bf5f38	ldr x0,[x0, #0xf70]
00bf5f3c	bl 0x00c305d0
00bf5f40	ldrsw x8,[x20, #0x8]
00bf5f44	add x1,x19,#0x8
00bf5f48	mov w0,#0x1
00bf5f4c	sub x22,x8,#0x1
00bf5f50	bl 0x00c2bce0
00bf5f54	mov x20,x21
00bf5f58	ldp x8,x9,[x20, #0x10]!
00bf5f5c	sub x9,x9,x8
00bf5f60	asr x10,x9,#0x3
00bf5f64	cmp x10,x22
00bf5f68	b.hi 0x00bf5f94
00bf5f6c	add x9,x22,#0x1
00bf5f70	subs x1,x9,x10
00bf5f74	b.ls 0x00bf5f88
00bf5f78	mov x0,x20
00bf5f7c	bl 0x00c0b6e4
00bf5f80	ldr x8,[x20]
00bf5f84	b 0x00bf5f94
00bf5f88	b.cs 0x00bf5f94
00bf5f8c	add x9,x8,x9, LSL #0x3
00bf5f90	str x9,[x21, #0x18]
00bf5f94	ldr x21,[x8, x22, LSL #0x3]
00bf5f98	cbz x21,0x00bf5fbc
00bf5f9c	add x1,x21,#0x8
00bf5fa0	mov x0,#-0x1
00bf5fa4	bl 0x00c2bd10
00bf5fa8	cbnz x0,0x00bf5fbc
00bf5fac	ldr x8,[x21]
00bf5fb0	mov x0,x21
00bf5fb4	ldr x8,[x8, #0x10]
00bf5fb8	blr x8
00bf5fbc	ldr x8,[x20]
00bf5fc0	str x19,[x8, x22, LSL #0x3]
00bf5fc4	ldp x20,x19,[sp, #0x40]
00bf5fc8	ldp x22,x21,[sp, #0x30]
00bf5fcc	ldp x29,x30,[sp, #0x20]
00bf5fd0	add sp,sp,#0x50
00bf5fd4	autiasp
00bf5fd8	ret
