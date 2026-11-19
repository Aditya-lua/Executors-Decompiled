; CONF_set_nconf @ 00a0cd34
00a0cd34	str x21,[sp, #-0x30]!
00a0cd38	adrp x21,0xd21000
00a0cd3c	ldr x8,[x21, #0x950]
00a0cd40	stp x20,x19,[sp, #0x10]
00a0cd44	mov x19,x1
00a0cd48	mov x20,x0
00a0cd4c	stp x29,x30,[sp, #0x20]
00a0cd50	add x29,sp,#0x20
00a0cd54	cbnz x8,0x00a0cd64
00a0cd58	bl 0x00c39420
00a0cd5c	mov x8,x0
00a0cd60	str x0,[x21, #0x950]
00a0cd64	ldr x8,[x8, #0x10]
00a0cd68	mov x0,x20
00a0cd6c	blr x8
00a0cd70	str x19,[x20, #0x10]
00a0cd74	ldp x29,x30,[sp, #0x20]
00a0cd78	ldp x20,x19,[sp, #0x10]
00a0cd7c	ldr x21,[sp], #0x30
00a0cd80	ret
