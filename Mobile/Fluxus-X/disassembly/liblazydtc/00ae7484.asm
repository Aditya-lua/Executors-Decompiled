; SRP_VBASE_new @ 00ae7484
00ae7484	stp x20,x19,[sp, #-0x20]!
00ae7488	adrp x1,0x2ce000
00ae748c	mov x20,x0
00ae7490	add x1,x1,#0x365
00ae7494	mov w0,#0x28
00ae7498	mov w2,#0x118
00ae749c	stp x29,x30,[sp, #0x10]
00ae74a0	add x29,sp,#0x10
00ae74a4	bl 0x00c32320
00ae74a8	mov x19,x0
00ae74ac	cbz x0,0x00ae7530
00ae74b0	bl 0x00c34780
00ae74b4	str x0,[x19]
00ae74b8	cbz x0,0x00ae7514
00ae74bc	bl 0x00c34780
00ae74c0	str x0,[x19, #0x8]
00ae74c4	cbz x0,0x00ae7510
00ae74c8	stp xzr,xzr,[x19, #0x10]
00ae74cc	str xzr,[x19, #0x20]
00ae74d0	cbz x20,0x00ae7530
00ae74d4	adrp x1,0x2ce000
00ae74d8	add x1,x1,#0x365
00ae74dc	mov w2,#0x125
00ae74e0	mov x0,x20
00ae74e4	bl 0x00c34600
00ae74e8	str x0,[x19, #0x10]
00ae74ec	cbnz x0,0x00ae7530
00ae74f0	ldr x0,[x19]
00ae74f4	bl 0x00c34770
00ae74f8	ldr x0,[x19, #0x8]
00ae74fc	bl 0x00c34770
00ae7500	adrp x1,0x2ce000
00ae7504	add x1,x1,#0x365
00ae7508	mov w2,#0x128
00ae750c	b 0x00ae7524
00ae7510	ldr x0,[x19]
00ae7514	bl 0x00c34770
00ae7518	adrp x1,0x2ce000
00ae751c	add x1,x1,#0x365
00ae7520	mov w2,#0x11f
00ae7524	mov x0,x19
00ae7528	bl 0x00c32310
00ae752c	mov x19,xzr
00ae7530	ldp x29,x30,[sp, #0x10]
00ae7534	mov x0,x19
00ae7538	ldp x20,x19,[sp], #0x20
00ae753c	ret
