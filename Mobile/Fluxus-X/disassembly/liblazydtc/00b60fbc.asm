; FUN_00b60fbc @ 00b60fbc
00b60fbc	stp x20,x19,[sp, #-0x20]!
00b60fc0	stp x29,x30,[sp, #0x10]
00b60fc4	mov x19,x0
00b60fc8	ldr x0,[x0, #0x168]
00b60fcc	add x29,sp,#0x10
00b60fd0	bl 0x00c31f90
00b60fd4	ldr x0,[x19, #0x160]
00b60fd8	bl 0x00c35800
00b60fdc	ldr x0,[x19, #0x10]
00b60fe0	stp xzr,xzr,[x19, #0x160]
00b60fe4	bl 0x00c3a7c0
00b60fe8	ldr x0,[x19, #0x8]
00b60fec	adrp x20,0x2dc000
00b60ff0	add x20,x20,#0xfe5
00b60ff4	mov w2,#0x14d
00b60ff8	mov x1,x20
00b60ffc	bl 0x00c32310
00b61000	ldr x0,[x19, #0x178]
00b61004	mov w2,#0x14e
00b61008	mov x1,x20
00b6100c	bl 0x00c32310
00b61010	ldp x29,x30,[sp, #0x10]
00b61014	mov w2,#0x14f
00b61018	mov x0,x19
00b6101c	mov x1,x20
00b61020	ldp x20,x19,[sp], #0x20
00b61024	b 0x00c32310
