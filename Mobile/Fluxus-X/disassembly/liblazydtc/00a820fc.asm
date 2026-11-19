; ossl_method_construct @ 00a820fc
00a820fc	sub sp,sp,#0x60
00a82100	str x21,[sp, #0x30]
00a82104	stp x20,x19,[sp, #0x40]
00a82108	mov x19,x5
00a8210c	mov x21,x4
00a82110	mov x20,x2
00a82114	stp x29,x30,[sp, #0x50]
00a82118	add x29,sp,#0x50
00a8211c	cbz x2,0x00a82124
00a82120	ldr x2,[x20]
00a82124	str w3,[sp, #0x1c]
00a82128	adrp x3,0xa82000
00a8212c	adrp x4,0xa82000
00a82130	adrp x5,0xa82000
00a82134	adrp x6,0xa82000
00a82138	adrp x7,0xa82000
00a8213c	add x8,sp,#0x8
00a82140	add x3,x3,#0x1a8
00a82144	add x4,x4,#0x23c
00a82148	add x5,x5,#0x298
00a8214c	add x6,x6,#0x318
00a82150	add x7,x7,#0x328
00a82154	str xzr,[sp, #0x10]
00a82158	stp x21,x19,[sp, #0x20]
00a8215c	str x8,[sp]
00a82160	bl 0x00c3df80
00a82164	ldr x0,[sp, #0x10]
00a82168	cbz x0,0x00a82180
00a8216c	ldr x8,[x21, #0x18]
00a82170	mov x1,x20
00a82174	mov x2,x19
00a82178	blr x8
00a8217c	cbnz x0,0x00a82194
00a82180	ldr x8,[x21, #0x18]
00a82184	mov x0,xzr
00a82188	mov x1,x20
00a8218c	mov x2,x19
00a82190	blr x8
00a82194	ldp x29,x30,[sp, #0x50]
00a82198	ldp x20,x19,[sp, #0x40]
00a8219c	ldr x21,[sp, #0x30]
00a821a0	add sp,sp,#0x60
00a821a4	ret
