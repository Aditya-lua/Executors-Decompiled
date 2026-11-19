; FUN_00c1449c @ 00c1449c
00c1449c	paciasp
00c144a0	stp x29,x30,[sp, #-0x30]!
00c144a4	str x21,[sp, #0x10]
00c144a8	stp x20,x19,[sp, #0x20]
00c144ac	mov x29,sp
00c144b0	ldr x21,[x0, #0x1330]
00c144b4	mov x19,x1
00c144b8	ldr x8,[x21, #0x8]
00c144bc	sub x9,x8,#0xfd0
00c144c0	cmn x9,#0xff1
00c144c4	b.hi 0x00c144e8
00c144c8	mov x20,x0
00c144cc	mov w0,#0x1000
00c144d0	bl 0x00c308d0
00c144d4	cbz x0,0x00c14544
00c144d8	mov x8,xzr
00c144dc	stp x21,xzr,[x0]
00c144e0	mov x21,x0
00c144e4	str x0,[x20, #0x1330]
00c144e8	add x9,x8,#0x20
00c144ec	mov x0,x19
00c144f0	add x20,x21,x8
00c144f4	str x9,[x21, #0x8]
00c144f8	bl 0x00c2ff50
00c144fc	adrp x9,0xcb1000
00c14500	add x9,x9,#0x4c0
00c14504	mov w11,#0x540
00c14508	str x9,[x20, #0x10]!
00c1450c	ldurh w9,[x20, #0x9]
00c14510	mov x8,x0
00c14514	mov w10,#0x8
00c14518	and w9,w9,#0xf000
00c1451c	strb w10,[x20, #0x8]
00c14520	orr w9,w9,w11
00c14524	stp x19,x8,[x20, #0x10]
00c14528	sturh w9,[x20, #0x9]
00c1452c	mov x0,x20
00c14530	ldp x20,x19,[sp, #0x20]
00c14534	ldr x21,[sp, #0x10]
00c14538	ldp x29,x30,[sp], #0x30
00c1453c	autiasp
00c14540	ret
00c14544	bl 0x00c2fff0
