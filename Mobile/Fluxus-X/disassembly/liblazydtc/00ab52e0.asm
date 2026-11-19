; PEM_read_ECPrivateKey @ 00ab52e0
00ab52e0	str x21,[sp, #-0x30]!
00ab52e4	stp x20,x19,[sp, #0x10]
00ab52e8	mov x19,x1
00ab52ec	mov x1,xzr
00ab52f0	stp x29,x30,[sp, #0x20]
00ab52f4	add x29,sp,#0x20
00ab52f8	bl 0x00c3f210
00ab52fc	cbz x0,0x00ab532c
00ab5300	mov x21,x0
00ab5304	bl 0x00c3d8e0
00ab5308	mov x20,x0
00ab530c	mov x0,x21
00ab5310	bl 0x00c32450
00ab5314	cbz x20,0x00ab5330
00ab5318	cbz x19,0x00ab5330
00ab531c	ldr x0,[x19]
00ab5320	bl 0x00c3a7c0
00ab5324	str x20,[x19]
00ab5328	b 0x00ab5330
00ab532c	mov x20,xzr
00ab5330	mov x0,x20
00ab5334	ldp x29,x30,[sp, #0x20]
00ab5338	ldp x20,x19,[sp, #0x10]
00ab533c	ldr x21,[sp], #0x30
00ab5340	ret
