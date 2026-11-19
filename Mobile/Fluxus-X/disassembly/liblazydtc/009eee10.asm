; ASN1_TIME_adj @ 009eee10
009eee10	sub sp,sp,#0x70
009eee14	stp x29,x30,[sp, #0x60]
009eee18	add x29,sp,#0x60
009eee1c	stp x20,x19,[sp, #0x50]
009eee20	mov x19,x0
009eee24	stur x1,[x29, #-0x28]
009eee28	sub x0,x29,#0x28
009eee2c	mov x1,sp
009eee30	stp x22,x21,[sp, #0x40]
009eee34	mov x20,x3
009eee38	mov w22,w2
009eee3c	bl 0x00c37980
009eee40	cbz x0,0x009eee78
009eee44	mov x21,x0
009eee48	cbnz w22,0x009eee50
009eee4c	cbz x20,0x009eee64
009eee50	mov x0,x21
009eee54	mov w1,w22
009eee58	mov x2,x20
009eee5c	bl 0x00c37990
009eee60	cbz w0,0x009eeea4
009eee64	mov w2,#0xffffffff
009eee68	mov x0,x19
009eee6c	mov x1,x21
009eee70	bl 0x009eec44
009eee74	b 0x009eeea8
009eee78	bl 0x00c342a0
009eee7c	adrp x0,0x2c9000
009eee80	adrp x2,0x2db000
009eee84	add x0,x0,#0x598
009eee88	add x2,x2,#0xd21
009eee8c	mov w1,#0x14c
009eee90	bl 0x00c342b0
009eee94	mov w0,#0xd
009eee98	mov w1,#0xad
009eee9c	mov x2,xzr
009eeea0	bl 0x00c342c0
009eeea4	mov x0,xzr
009eeea8	ldp x29,x30,[sp, #0x60]
009eeeac	ldp x20,x19,[sp, #0x50]
009eeeb0	ldp x22,x21,[sp, #0x40]
009eeeb4	add sp,sp,#0x70
009eeeb8	ret
