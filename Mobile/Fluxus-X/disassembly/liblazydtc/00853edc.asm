; FUN_00853edc @ 00853edc
00853edc	stp x29,x30,[sp, #-0x50]!
00853ee0	stp x26,x25,[sp, #0x10]
00853ee4	stp x24,x23,[sp, #0x20]
00853ee8	stp x22,x21,[sp, #0x30]
00853eec	stp x20,x19,[sp, #0x40]
00853ef0	mov x29,sp
00853ef4	ldp x25,x8,[x0, #0x8]
00853ef8	mov x19,x0
00853efc	mov x23,x1
00853f00	cmp x25,x8
00853f04	b.cs 0x00853f14
00853f08	ldr w8,[x23]
00853f0c	str w8,[x25], #0x4
00853f10	b 0x00853f9c
00853f14	ldr x20,[x19]
00853f18	sub x22,x25,x20
00853f1c	asr x26,x22,#0x2
00853f20	add x9,x26,#0x1
00853f24	lsr x10,x9,#0x3e
00853f28	cbnz x10,0x00853fb8
00853f2c	sub x21,x8,x20
00853f30	orr x10,xzr,#0x7ffffffffffffffc
00853f34	asr x8,x21,#0x1
00853f38	cmp x8,x9
00853f3c	csel x8,x8,x9,hi
00853f40	cmp x21,x10
00853f44	mov x9,#0x3fffffffffffffff
00853f48	csel x8,x8,x9,cc
00853f4c	lsr x9,x8,#0x3e
00853f50	cbnz x9,0x00853fbc
00853f54	lsl x24,x8,#0x2
00853f58	mov x0,x24
00853f5c	bl 0x00c2fed0
00853f60	add x25,x0,x22
00853f64	ldr w8,[x23]
00853f68	add x24,x0,x24
00853f6c	sub x23,x25,x26, LSL #0x2
00853f70	mov x1,x20
00853f74	mov x2,x22
00853f78	str w8,[x25], #0x4
00853f7c	mov x0,x23
00853f80	bl 0x00c2ffd0
00853f84	stp x23,x25,[x19]
00853f88	str x24,[x19, #0x10]
00853f8c	cbz x20,0x00853f9c
00853f90	mov x0,x20
00853f94	mov x1,x21
00853f98	bl 0x00c2fe80
00853f9c	str x25,[x19, #0x8]
00853fa0	ldp x20,x19,[sp, #0x40]
00853fa4	ldp x22,x21,[sp, #0x30]
00853fa8	ldp x24,x23,[sp, #0x20]
00853fac	ldp x26,x25,[sp, #0x10]
00853fb0	ldp x29,x30,[sp], #0x50
00853fb4	ret
00853fb8	bl 0x0085532c
00853fbc	bl 0x007fe1b8
