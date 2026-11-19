; ossl_rsa_multip_info_new @ 00ad30ec
00ad30ec	str x19,[sp, #-0x20]!
00ad30f0	adrp x1,0x2a2000
00ad30f4	add x1,x1,#0xc80
00ad30f8	mov w0,#0x28
00ad30fc	mov w2,#0x24
00ad3100	stp x29,x30,[sp, #0x10]
00ad3104	add x29,sp,#0x10
00ad3108	bl 0x00c34250
00ad310c	mov x19,x0
00ad3110	cbz x0,0x00ad3180
00ad3114	bl 0x00c38d90
00ad3118	str x0,[x19]
00ad311c	cbz x0,0x00ad3144
00ad3120	bl 0x00c38d90
00ad3124	str x0,[x19, #0x8]
00ad3128	cbz x0,0x00ad3144
00ad312c	bl 0x00c38d90
00ad3130	str x0,[x19, #0x10]
00ad3134	cbz x0,0x00ad3144
00ad3138	bl 0x00c38d90
00ad313c	str x0,[x19, #0x18]
00ad3140	cbnz x0,0x00ad31b0
00ad3144	ldr x0,[x19]
00ad3148	bl 0x00c36290
00ad314c	ldr x0,[x19, #0x8]
00ad3150	bl 0x00c36290
00ad3154	ldr x0,[x19, #0x10]
00ad3158	bl 0x00c36290
00ad315c	ldr x0,[x19, #0x18]
00ad3160	bl 0x00c36290
00ad3164	adrp x1,0x2a2000
00ad3168	add x1,x1,#0xc80
00ad316c	orr w2,wzr,#0x38
00ad3170	mov x0,x19
00ad3174	bl 0x00c32310
00ad3178	mov x19,xzr
00ad317c	b 0x00ad31b0
00ad3180	bl 0x00c342a0
00ad3184	adrp x0,0x2a2000
00ad3188	adrp x2,0x2d0000
00ad318c	add x0,x0,#0xc80
00ad3190	add x2,x2,#0x376
00ad3194	mov w1,#0x25
00ad3198	bl 0x00c342b0
00ad319c	mov w1,#0x100
00ad31a0	mov w0,#0x4
00ad31a4	movk w1,#0xc, LSL #16
00ad31a8	mov x2,xzr
00ad31ac	bl 0x00c342c0
00ad31b0	ldp x29,x30,[sp, #0x10]
00ad31b4	mov x0,x19
00ad31b8	ldr x19,[sp], #0x20
00ad31bc	ret
