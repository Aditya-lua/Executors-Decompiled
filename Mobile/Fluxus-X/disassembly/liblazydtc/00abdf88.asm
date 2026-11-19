; PKCS7_free @ 00abdf88
00abdf88	cbz x0,0x00abdfc8
00abdf8c	str x19,[sp, #-0x20]!
00abdf90	stp x29,x30,[sp, #0x10]
00abdf94	mov x19,x0
00abdf98	ldr x0,[x0, #0x30]
00abdf9c	adrp x1,0x2d8000
00abdfa0	add x1,x1,#0x632
00abdfa4	mov w2,#0x75
00abdfa8	add x29,sp,#0x10
00abdfac	bl 0x00c32310
00abdfb0	ldp x29,x30,[sp, #0x10]
00abdfb4	adrp x1,0xc7b000
00abdfb8	add x1,x1,#0x7a0
00abdfbc	mov x0,x19
00abdfc0	ldr x19,[sp], #0x20
00abdfc4	b 0x00c36160
00abdfc8	ret
