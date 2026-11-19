; FUN_00ac9078 @ 00ac9078
00ac9078	stp x20,x19,[sp, #-0x20]!
00ac907c	adrp x1,0x2da000
00ac9080	add x1,x1,#0x554
00ac9084	mov w0,#0x50
00ac9088	mov w2,#0x1be
00ac908c	stp x29,x30,[sp, #0x10]
00ac9090	add x29,sp,#0x10
00ac9094	bl 0x00c34250
00ac9098	mov x19,x0
00ac909c	cbz x0,0x00ac9104
00ac90a0	mov w0,#0x40000
00ac90a4	mov x1,xzr
00ac90a8	bl 0x00c35500
00ac90ac	bl 0x00c34d50
00ac90b0	str x0,[x19]
00ac90b4	cbz x0,0x00ac90e4
00ac90b8	add x20,x19,#0x1c
00ac90bc	mov x0,x20
00ac90c0	mov x1,xzr
00ac90c4	bl 0x00c38370
00ac90c8	cbz w0,0x00ac90e4
00ac90cc	add x0,x19,#0x18
00ac90d0	mov x1,xzr
00ac90d4	bl 0x00c38370
00ac90d8	cbnz w0,0x00ac9104
00ac90dc	mov x0,x20
00ac90e0	bl 0x00c38350
00ac90e4	ldr x0,[x19]
00ac90e8	bl 0x00c34d40
00ac90ec	adrp x1,0x2da000
00ac90f0	add x1,x1,#0x554
00ac90f4	mov w2,#0x1db
00ac90f8	mov x0,x19
00ac90fc	bl 0x00c32310
00ac9100	mov x19,xzr
00ac9104	ldp x29,x30,[sp, #0x10]
00ac9108	mov x0,x19
00ac910c	ldp x20,x19,[sp], #0x20
00ac9110	ret
