; ASN1_UTCTIME_adj @ 009eff0c
009eff0c	sub sp,sp,#0x70
009eff10	stp x29,x30,[sp, #0x60]
009eff14	add x29,sp,#0x60
009eff18	stp x20,x19,[sp, #0x50]
009eff1c	mov x19,x0
009eff20	stur x1,[x29, #-0x28]
009eff24	sub x0,x29,#0x28
009eff28	mov x1,sp
009eff2c	stp x22,x21,[sp, #0x40]
009eff30	mov x20,x3
009eff34	mov w22,w2
009eff38	bl 0x00c37980
009eff3c	cbz x0,0x009eff78
009eff40	mov x21,x0
009eff44	cbnz w22,0x009eff4c
009eff48	cbz x20,0x009eff60
009eff4c	mov x0,x21
009eff50	mov w1,w22
009eff54	mov x2,x20
009eff58	bl 0x00c37990
009eff5c	cbz w0,0x009eff74
009eff60	mov w2,#0x17
009eff64	mov x0,x19
009eff68	mov x1,x21
009eff6c	bl 0x00c379c0
009eff70	b 0x009eff78
009eff74	mov x0,xzr
009eff78	ldp x29,x30,[sp, #0x60]
009eff7c	ldp x20,x19,[sp, #0x50]
009eff80	ldp x22,x21,[sp, #0x40]
009eff84	add sp,sp,#0x70
009eff88	ret
