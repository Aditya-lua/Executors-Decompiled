; FUN_0095ec08 @ 0095ec08
0095ec08	stp x20,x19,[sp, #-0x20]!
0095ec0c	stp x29,x30,[sp, #0x10]
0095ec10	add x29,sp,#0x10
0095ec14	mov w8,#0x4
0095ec18	strb w8,[x1, #0x572]
0095ec1c	mov x19,x0
0095ec20	ldr x0,[x0, #0x11a8]
0095ec24	mov x20,x1
0095ec28	adrp x1,0x2a5000
0095ec2c	add x1,x1,#0x5e5
0095ec30	bl 0x00c30c40
0095ec34	cbnz x0,0x0095ec4c
0095ec38	ldr x0,[x20, #0x40]
0095ec3c	adrp x1,0x2a5000
0095ec40	add x1,x1,#0x5e5
0095ec44	bl 0x00c30c40
0095ec48	cbz x0,0x0095ec88
0095ec4c	ldrb w8,[x0, #0x6]
0095ec50	strb wzr,[x0]
0095ec54	mov w0,w8
0095ec58	bl 0x009416cc
0095ec5c	and w8,w0,#0xff
0095ec60	cmp w8,#0x4e
0095ec64	b.eq 0x0095ec70
0095ec68	cmp w8,#0x41
0095ec6c	b.ne 0x0095ec7c
0095ec70	ldr w8,[x19, #0x131c]
0095ec74	orr w8,w8,#0x1000
0095ec78	b 0x0095ec84
0095ec7c	ldr w8,[x19, #0x131c]
0095ec80	and w8,w8,#0xffffefff
0095ec84	str w8,[x19, #0x131c]
0095ec88	ldp x29,x30,[sp, #0x10]
0095ec8c	mov w0,wzr
0095ec90	ldp x20,x19,[sp], #0x20
0095ec94	ret
