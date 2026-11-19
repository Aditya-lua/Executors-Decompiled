; PKCS12_item_i2d_encrypt_ex @ 00abb9f8
00abb9f8	sub sp,sp,#0x70
00abb9fc	stp x27,xzr,[sp, #0x10]
00abba00	stp x26,x25,[sp, #0x20]
00abba04	stp x24,x23,[sp, #0x30]
00abba08	stp x22,x21,[sp, #0x40]
00abba0c	stp x20,x19,[sp, #0x50]
00abba10	stp x29,x30,[sp, #0x60]
00abba14	add x29,sp,#0x60
00abba18	mov x21,x7
00abba1c	mov x22,x6
00abba20	mov w20,w5
00abba24	mov x26,x4
00abba28	mov w23,w3
00abba2c	mov x24,x2
00abba30	mov x27,x1
00abba34	mov x25,x0
00abba38	bl 0x00c38170
00abba3c	mov x19,x0
00abba40	cbz x0,0x00abbab0
00abba44	add x1,sp,#0x18
00abba48	mov x0,x26
00abba4c	mov x2,x27
00abba50	bl 0x00c36170
00abba54	ldr x3,[sp, #0x18]
00abba58	mov w26,w0
00abba5c	cbz x3,0x00abbadc
00abba60	add x5,x19,#0x8
00abba64	mov w7,#0x1
00abba68	mov x0,x25
00abba6c	mov x1,x24
00abba70	mov w2,w23
00abba74	mov w4,w26
00abba78	mov x6,x19
00abba7c	stp x22,x21,[sp]
00abba80	bl 0x00abb5a4
00abba84	cbz x0,0x00abbb0c
00abba88	cbz w20,0x00abba98
00abba8c	ldr x0,[sp, #0x18]
00abba90	sxtw x1,w26
00abba94	bl 0x00c34750
00abba98	ldr x0,[sp, #0x18]
00abba9c	adrp x1,0x2d2000
00abbaa0	add x1,x1,#0x244
00abbaa4	mov w2,#0xc7
00abbaa8	bl 0x00c32310
00abbaac	b 0x00abbb58
00abbab0	bl 0x00c342a0
00abbab4	adrp x0,0x2d2000
00abbab8	adrp x2,0x2ce000
00abbabc	add x0,x0,#0x244
00abbac0	add x2,x2,#0x198
00abbac4	mov w1,#0xb7
00abbac8	bl 0x00c342b0
00abbacc	mov w1,#0x100
00abbad0	mov w0,#0x23
00abbad4	movk w1,#0xc, LSL #16
00abbad8	b 0x00abbb00
00abbadc	bl 0x00c342a0
00abbae0	adrp x0,0x2d2000
00abbae4	adrp x2,0x2ce000
00abbae8	add x0,x0,#0x244
00abbaec	add x2,x2,#0x198
00abbaf0	mov w1,#0xbc
00abbaf4	bl 0x00c342b0
00abbaf8	mov w0,#0x23
00abbafc	mov w1,#0x66
00abbb00	mov x2,xzr
00abbb04	bl 0x00c342c0
00abbb08	b 0x00abbb4c
00abbb0c	bl 0x00c342a0
00abbb10	adrp x20,0x2d2000
00abbb14	add x20,x20,#0x244
00abbb18	adrp x2,0x2ce000
00abbb1c	add x2,x2,#0x198
00abbb20	mov w1,#0xc1
00abbb24	mov x0,x20
00abbb28	bl 0x00c342b0
00abbb2c	mov w0,#0x23
00abbb30	mov w1,#0x67
00abbb34	mov x2,xzr
00abbb38	bl 0x00c342c0
00abbb3c	ldr x0,[sp, #0x18]
00abbb40	mov w2,#0xc2
00abbb44	mov x1,x20
00abbb48	bl 0x00c32310
00abbb4c	mov x0,x19
00abbb50	bl 0x00c35530
00abbb54	mov x19,xzr
00abbb58	mov x0,x19
00abbb5c	ldp x29,x30,[sp, #0x60]
00abbb60	ldp x20,x19,[sp, #0x50]
00abbb64	ldp x22,x21,[sp, #0x40]
00abbb68	ldp x24,x23,[sp, #0x30]
00abbb6c	ldp x26,x25,[sp, #0x20]
00abbb70	ldr x27,[sp, #0x10]
00abbb74	add sp,sp,#0x70
00abbb78	ret
