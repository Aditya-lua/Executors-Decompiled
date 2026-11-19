; operator.new @ 00c2fd2c
00c2fd2c	paciasp
00c2fd30	stp x29,x30,[sp, #-0x20]!
00c2fd34	str x19,[sp, #0x10]
00c2fd38	mov x29,sp
00c2fd3c	cmp x0,#0x1
00c2fd40	csinc x19,x0,xzr,hi
00c2fd44	mov x0,x19
00c2fd48	bl 0x00c308d0
00c2fd4c	cbnz x0,0x00c2fd60
00c2fd50	bl 0x00c44760
00c2fd54	cbz x0,0x00c2fd70
00c2fd58	blr x0
00c2fd5c	b 0x00c2fd44
00c2fd60	ldr x19,[sp, #0x10]
00c2fd64	ldp x29,x30,[sp], #0x20
00c2fd68	autiasp
00c2fd6c	ret
00c2fd70	mov w0,#0x8
00c2fd74	bl 0x00c30000
00c2fd78	mov x19,x0
00c2fd7c	bl 0x00c43f60
00c2fd80	adrp x1,0xcb5000
00c2fd84	adrp x2,0xcb5000
00c2fd88	mov x0,x19
00c2fd8c	ldr x1,[x1, #0xb58]
00c2fd90	ldr x2,[x2, #0xb60]
00c2fd94	bl 0x00c30020
