; PEM_read_bio_DHparams @ 00ab5464
00ab5464	sub sp,sp,#0x40
00ab5468	mov x6,x3
00ab546c	adrp x3,0x2b8000
00ab5470	stp x20,x19,[sp, #0x20]
00ab5474	mov x5,x2
00ab5478	mov x19,x1
00ab547c	mov x4,x0
00ab5480	add x3,x3,#0x4cf
00ab5484	add x0,sp,#0x8
00ab5488	mov x1,sp
00ab548c	add x2,sp,#0x18
00ab5490	stp x29,x30,[sp, #0x30]
00ab5494	add x29,sp,#0x30
00ab5498	stp xzr,xzr,[sp, #0x10]
00ab549c	str xzr,[sp, #0x8]
00ab54a0	bl 0x00c3f200
00ab54a4	cbz w0,0x00ab5538
00ab54a8	ldr x8,[sp, #0x8]
00ab54ac	ldr x0,[sp, #0x18]
00ab54b0	adrp x1,0x2c6000
00ab54b4	add x1,x1,#0xe6
00ab54b8	str x8,[sp, #0x10]
00ab54bc	bl 0x00c301f0
00ab54c0	ldr x2,[sp]
00ab54c4	add x1,sp,#0x10
00ab54c8	cbz w0,0x00ab5550
00ab54cc	mov x0,x19
00ab54d0	bl 0x00c39bb0
00ab54d4	mov x19,x0
00ab54d8	cbnz x0,0x00ab550c
00ab54dc	bl 0x00c342a0
00ab54e0	adrp x0,0x2c6000
00ab54e4	adrp x2,0x2ba000
00ab54e8	add x0,x0,#0xfa
00ab54ec	add x2,x2,#0x60c
00ab54f0	mov w1,#0xca
00ab54f4	bl 0x00c342b0
00ab54f8	mov w1,#0xd
00ab54fc	mov w0,#0x9
00ab5500	movk w1,#0x8, LSL #16
00ab5504	mov x2,xzr
00ab5508	bl 0x00c342c0
00ab550c	ldr x0,[sp, #0x18]
00ab5510	adrp x20,0x2c6000
00ab5514	add x20,x20,#0xfa
00ab5518	mov w2,#0xcb
00ab551c	mov x1,x20
00ab5520	bl 0x00c32310
00ab5524	ldr x0,[sp, #0x8]
00ab5528	mov w2,#0xcc
00ab552c	mov x1,x20
00ab5530	bl 0x00c32310
00ab5534	b 0x00ab553c
00ab5538	mov x19,xzr
00ab553c	mov x0,x19
00ab5540	ldp x29,x30,[sp, #0x30]
00ab5544	ldp x20,x19,[sp, #0x20]
00ab5548	add sp,sp,#0x40
00ab554c	ret
00ab5550	mov x0,x19
00ab5554	bl 0x00c39bc0
00ab5558	mov x19,x0
00ab555c	cbnz x0,0x00ab550c
00ab5560	b 0x00ab54dc
