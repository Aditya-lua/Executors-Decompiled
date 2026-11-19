; FUN_00b51b3c @ 00b51b3c
00b51b3c	stp x22,x21,[sp, #-0x30]!
00b51b40	stp x20,x19,[sp, #0x10]
00b51b44	stp x29,x30,[sp, #0x20]
00b51b48	add x29,sp,#0x20
00b51b4c	mov x20,x2
00b51b50	mov w21,w1
00b51b54	bl 0x00c41210
00b51b58	mov x22,x0
00b51b5c	bl 0x00c41000
00b51b60	cbz w0,0x00b51bf0
00b51b64	adrp x1,0x2be000
00b51b68	add x1,x1,#0xa4e
00b51b6c	orr w0,wzr,#0x38
00b51b70	mov w2,#0x185
00b51b74	bl 0x00c34250
00b51b78	mov x19,x0
00b51b7c	cbz x0,0x00b51bf4
00b51b80	mov x0,x19
00b51b84	mov x1,x20
00b51b88	str x22,[x19]
00b51b8c	str w21,[x19, #0x8]
00b51b90	bl 0x00b517e8
00b51b94	cbz w0,0x00b51bdc
00b51b98	mov x0,x19
00b51b9c	ldr x2,[x0], #0x20
00b51ba0	mov x1,x20
00b51ba4	bl 0x00c41100
00b51ba8	cbnz w0,0x00b51bf4
00b51bac	bl 0x00c342a0
00b51bb0	adrp x0,0x2be000
00b51bb4	adrp x2,0x2b6000
00b51bb8	add x0,x0,#0xa4e
00b51bbc	add x2,x2,#0x9d7
00b51bc0	mov w1,#0x1c7
00b51bc4	bl 0x00c342b0
00b51bc8	mov w1,#0x106
00b51bcc	mov w0,#0x39
00b51bd0	movk w1,#0x8, LSL #16
00b51bd4	mov x2,xzr
00b51bd8	bl 0x00c342c0
00b51bdc	adrp x1,0x2be000
00b51be0	add x1,x1,#0xa4e
00b51be4	mov w2,#0x19e
00b51be8	mov x0,x19
00b51bec	bl 0x00c32310
00b51bf0	mov x19,xzr
00b51bf4	mov x0,x19
00b51bf8	ldp x29,x30,[sp, #0x20]
00b51bfc	ldp x20,x19,[sp, #0x10]
00b51c00	ldp x22,x21,[sp], #0x30
00b51c04	ret
