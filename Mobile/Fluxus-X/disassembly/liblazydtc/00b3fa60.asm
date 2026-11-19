; FUN_00b3fa60 @ 00b3fa60
00b3fa60	sub sp,sp,#0x40
00b3fa64	stp x22,x21,[sp, #0x10]
00b3fa68	stp x20,x19,[sp, #0x20]
00b3fa6c	mov x20,x5
00b3fa70	mov w21,w2
00b3fa74	mov x22,x1
00b3fa78	mov x19,x0
00b3fa7c	mov w3,#0xffffffff
00b3fa80	stp x29,x30,[sp, #0x30]
00b3fa84	add x29,sp,#0x30
00b3fa88	str xzr,[sp, #0x8]
00b3fa8c	str w3,[sp, #0x4]
00b3fa90	cbz x4,0x00b3fac0
00b3fa94	ldr w2,[x6, #0x8]
00b3fa98	mov x8,x4
00b3fa9c	add x3,sp,#0x8
00b3faa0	add x4,sp,#0x4
00b3faa4	mov x0,x22
00b3faa8	mov w1,w21
00b3faac	blr x8
00b3fab0	cbz w0,0x00b3fb00
00b3fab4	ldr x2,[sp, #0x8]
00b3fab8	ldr w3,[sp, #0x4]
00b3fabc	b 0x00b3fac4
00b3fac0	mov x2,xzr
00b3fac4	mov x0,x22
00b3fac8	mov w1,w21
00b3facc	mov x4,x20
00b3fad0	bl 0x00b3fb1c
00b3fad4	mov x20,x0
00b3fad8	cbz x0,0x00b3faf0
00b3fadc	mov x0,x19
00b3fae0	mov x1,x20
00b3fae4	bl 0x00c40f10
00b3fae8	mov w19,w0
00b3faec	b 0x00b3faf4
00b3faf0	mov w19,wzr
00b3faf4	mov x0,x20
00b3faf8	bl 0x00c39900
00b3fafc	b 0x00b3fb04
00b3fb00	mov w19,wzr
00b3fb04	mov w0,w19
00b3fb08	ldp x29,x30,[sp, #0x30]
00b3fb0c	ldp x20,x19,[sp, #0x20]
00b3fb10	ldp x22,x21,[sp, #0x10]
00b3fb14	add sp,sp,#0x40
00b3fb18	ret
