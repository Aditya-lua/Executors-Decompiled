; PKCS7_add_signature @ 00ac3044
00ac3044	str x23,[sp, #-0x40]!
00ac3048	stp x22,x21,[sp, #0x10]
00ac304c	stp x20,x19,[sp, #0x20]
00ac3050	mov x23,x3
00ac3054	mov x20,x2
00ac3058	mov x21,x1
00ac305c	mov x19,x0
00ac3060	stp x29,x30,[sp, #0x30]
00ac3064	add x29,sp,#0x30
00ac3068	cbz x3,0x00ac30a8
00ac306c	bl 0x00c3f6d0
00ac3070	mov x22,x0
00ac3074	cbz x0,0x00ac3104
00ac3078	mov x0,x22
00ac307c	mov x1,x21
00ac3080	mov x2,x20
00ac3084	mov x3,x23
00ac3088	bl 0x00ac2e2c
00ac308c	cmp w0,#0x1
00ac3090	b.lt 0x00ac3104
00ac3094	mov x0,x19
00ac3098	mov x1,x22
00ac309c	bl 0x00ac2b28
00ac30a0	cbnz w0,0x00ac3110
00ac30a4	b 0x00ac3104
00ac30a8	add x1,sp,#0xc
00ac30ac	mov x0,x20
00ac30b0	bl 0x00c3d6f0
00ac30b4	cmp w0,#0x1
00ac30b8	b.lt 0x00ac3100
00ac30bc	ldr w0,[sp, #0xc]
00ac30c0	bl 0x00c324f0
00ac30c4	bl 0x00c35310
00ac30c8	cbz x0,0x00ac30d4
00ac30cc	mov x23,x0
00ac30d0	b 0x00ac306c
00ac30d4	bl 0x00c342a0
00ac30d8	adrp x0,0x2ce000
00ac30dc	adrp x2,0x2d2000
00ac30e0	add x0,x0,#0x1ca
00ac30e4	add x2,x2,#0x27b
00ac30e8	mov w1,#0x18e
00ac30ec	bl 0x00c342b0
00ac30f0	mov w0,#0x21
00ac30f4	mov w1,#0x97
00ac30f8	mov x2,xzr
00ac30fc	bl 0x00c342c0
00ac3100	mov x22,xzr
00ac3104	mov x0,x22
00ac3108	bl 0x00c3f6c0
00ac310c	mov x22,xzr
00ac3110	mov x0,x22
00ac3114	ldp x29,x30,[sp, #0x30]
00ac3118	ldp x20,x19,[sp, #0x20]
00ac311c	ldp x22,x21,[sp, #0x10]
00ac3120	ldr x23,[sp], #0x40
00ac3124	ret
