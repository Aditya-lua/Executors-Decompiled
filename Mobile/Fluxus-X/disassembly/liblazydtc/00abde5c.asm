; d2i_PKCS7 @ 00abde5c
00abde5c	cbz x0,0x00abde70
00abde60	ldr x8,[x0]
00abde64	cbz x8,0x00abde70
00abde68	ldp x4,x5,[x8, #0x28]
00abde6c	b 0x00abde78
00abde70	mov x4,xzr
00abde74	mov x5,xzr
00abde78	str x19,[sp, #-0x20]!
00abde7c	adrp x3,0xc7b000
00abde80	add x3,x3,#0x7a0
00abde84	stp x29,x30,[sp, #0x10]
00abde88	add x29,sp,#0x10
00abde8c	bl 0x00c37a00
00abde90	mov x19,x0
00abde94	cbz x0,0x00abdea0
00abde98	mov x0,x19
00abde9c	bl 0x00c3f720
00abdea0	ldp x29,x30,[sp, #0x10]
00abdea4	mov x0,x19
00abdea8	ldr x19,[sp], #0x20
00abdeac	ret
