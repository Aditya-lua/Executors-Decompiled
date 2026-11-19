; FUN_00906f54 @ 00906f54
00906f54	stp x22,x21,[sp, #-0x30]!
00906f58	stp x20,x19,[sp, #0x10]
00906f5c	stp x29,x30,[sp, #0x20]
00906f60	add x29,sp,#0x20
00906f64	add x8,x1,w2, SXTW  #0x3
00906f68	ldr x20,[x8, #0x248]
00906f6c	mov x19,x0
00906f70	cbz x20,0x00906fb0
00906f74	add x8,x8,#0x248
00906f78	str xzr,[x8]
00906f7c	adrp x21,0xcc4000
00906f80	add x21,x21,#0x678
00906f84	ldp x8,x22,[x20]
00906f88	str xzr,[x20, #0x8]
00906f8c	mov x0,x20
00906f90	mov x1,x19
00906f94	ldr x8,[x8, #0x10]
00906f98	blr x8
00906f9c	ldr x8,[x21]
00906fa0	mov x0,x20
00906fa4	blr x8
00906fa8	mov x20,x22
00906fac	cbnz x22,0x00906f84
00906fb0	ldp x29,x30,[sp, #0x20]
00906fb4	ldp x20,x19,[sp, #0x10]
00906fb8	ldp x22,x21,[sp], #0x30
00906fbc	ret
