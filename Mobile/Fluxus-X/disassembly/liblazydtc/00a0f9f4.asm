; _CONF_get_string @ 00a0f9f4
00a0f9f4	sub sp,sp,#0x50
00a0f9f8	str x21,[sp, #0x20]
00a0f9fc	stp x20,x19,[sp, #0x30]
00a0fa00	stp x29,x30,[sp, #0x40]
00a0fa04	add x29,sp,#0x40
00a0fa08	cbz x2,0x00a0fa7c
00a0fa0c	mov x19,x2
00a0fa10	mov x20,x0
00a0fa14	cbz x0,0x00a0fa84
00a0fa18	ldr x0,[x20, #0x10]
00a0fa1c	cbz x0,0x00a0fa8c
00a0fa20	mov x21,x1
00a0fa24	cbz x1,0x00a0fa58
00a0fa28	add x1,sp,#0x8
00a0fa2c	stp x21,x19,[sp, #0x8]
00a0fa30	bl 0x00c34de0
00a0fa34	cbnz x0,0x00a0fa74
00a0fa38	adrp x1,0x2d9000
00a0fa3c	add x1,x1,#0xa13
00a0fa40	mov x0,x21
00a0fa44	bl 0x00c301f0
00a0fa48	cbnz w0,0x00a0fa58
00a0fa4c	mov x0,x19
00a0fa50	bl 0x00c395b0
00a0fa54	cbnz x0,0x00a0fa8c
00a0fa58	adrp x8,0x2c1000
00a0fa5c	add x8,x8,#0x1ad
00a0fa60	stp x8,x19,[sp, #0x8]
00a0fa64	ldr x0,[x20, #0x10]
00a0fa68	add x1,sp,#0x8
00a0fa6c	bl 0x00c34de0
00a0fa70	cbz x0,0x00a0fa8c
00a0fa74	ldr x0,[x0, #0x10]
00a0fa78	b 0x00a0fa8c
00a0fa7c	mov x0,xzr
00a0fa80	b 0x00a0fa8c
00a0fa84	mov x0,x19
00a0fa88	bl 0x00c395b0
00a0fa8c	ldp x29,x30,[sp, #0x40]
00a0fa90	ldp x20,x19,[sp, #0x30]
00a0fa94	ldr x21,[sp, #0x20]
00a0fa98	add sp,sp,#0x50
00a0fa9c	ret
