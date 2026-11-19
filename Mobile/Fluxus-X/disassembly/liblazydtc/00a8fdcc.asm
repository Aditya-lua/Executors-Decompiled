; FUN_00a8fdcc @ 00a8fdcc
00a8fdcc	sub sp,sp,#0x80
00a8fdd0	stp x24,x23,[sp, #0x40]
00a8fdd4	stp x22,x21,[sp, #0x50]
00a8fdd8	stp x20,x19,[sp, #0x60]
00a8fddc	mov x19,x3
00a8fde0	mov x23,x2
00a8fde4	mov x20,x1
00a8fde8	lsr x8,x3,#0x1e
00a8fdec	mov x21,x0
00a8fdf0	stp x28,x27,[sp, #0x20]
00a8fdf4	stp x26,x25,[sp, #0x30]
00a8fdf8	stp x29,x30,[sp, #0x70]
00a8fdfc	add x29,sp,#0x70
00a8fe00	cbz x8,0x00a8fe8c
00a8fe04	orr x28,xzr,#-0x40000000
00a8fe08	add x8,x19,x28
00a8fe0c	str x8,[sp, #0x10]
00a8fe10	and x8,x8,#-0x40000000
00a8fe14	mov w22,#0x40000000
00a8fe18	add x27,x8,x22
00a8fe1c	add x24,x21,#0x28
00a8fe20	str x8,[sp, #0x8]
00a8fe24	add x8,x23,x27
00a8fe28	mov x25,x20
00a8fe2c	str x8,[sp, #0x18]
00a8fe30	mov x0,x21
00a8fe34	bl 0x00c3cea0
00a8fe38	mov x26,x0
00a8fe3c	mov x0,x21
00a8fe40	bl 0x00c3cec0
00a8fe44	mov w5,w0
00a8fe48	mov w2,#0x40000000
00a8fe4c	mov x0,x23
00a8fe50	mov x1,x25
00a8fe54	mov x3,x26
00a8fe58	mov x4,x24
00a8fe5c	bl 0x00c39290
00a8fe60	add x19,x19,x28
00a8fe64	add x23,x23,x22
00a8fe68	lsr x8,x19,#0x1e
00a8fe6c	add x25,x25,x22
00a8fe70	cbnz x8,0x00a8fe30
00a8fe74	ldp x9,x8,[sp, #0x8]
00a8fe78	ldr x22,[sp, #0x18]
00a8fe7c	add x20,x20,x27
00a8fe80	sub x19,x8,x9
00a8fe84	cbnz x19,0x00a8fe94
00a8fe88	b 0x00a8fec8
00a8fe8c	mov x22,x23
00a8fe90	cbz x19,0x00a8fec8
00a8fe94	mov x0,x21
00a8fe98	bl 0x00c3cea0
00a8fe9c	mov x23,x0
00a8fea0	mov x0,x21
00a8fea4	add x24,x21,#0x28
00a8fea8	bl 0x00c3cec0
00a8feac	mov w5,w0
00a8feb0	mov x0,x22
00a8feb4	mov x1,x20
00a8feb8	mov x2,x19
00a8febc	mov x3,x23
00a8fec0	mov x4,x24
00a8fec4	bl 0x00c39290
00a8fec8	ldp x29,x30,[sp, #0x70]
00a8fecc	ldp x20,x19,[sp, #0x60]
00a8fed0	ldp x22,x21,[sp, #0x50]
00a8fed4	ldp x24,x23,[sp, #0x40]
00a8fed8	ldp x26,x25,[sp, #0x30]
00a8fedc	ldp x28,x27,[sp, #0x20]
00a8fee0	mov w0,#0x1
00a8fee4	add sp,sp,#0x80
00a8fee8	ret
