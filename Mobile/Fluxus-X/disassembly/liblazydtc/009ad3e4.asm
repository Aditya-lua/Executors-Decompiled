; SSL_add_file_cert_subjects_to_stack @ 009ad3e4
009ad3e4	sub sp,sp,#0x40
009ad3e8	stp x22,x21,[sp, #0x10]
009ad3ec	mov x22,x1
009ad3f0	adrp x1,0x9ad000
009ad3f4	add x1,x1,#0x51c
009ad3f8	stp x20,x19,[sp, #0x20]
009ad3fc	stp x29,x30,[sp, #0x30]
009ad400	add x29,sp,#0x30
009ad404	mov x19,x0
009ad408	str xzr,[sp, #0x8]
009ad40c	bl 0x00c34df0
009ad410	mov x20,x0
009ad414	bl 0x00c32270
009ad418	bl 0x00c32240
009ad41c	mov x21,x0
009ad420	cbz x0,0x009ad4a8
009ad424	mov w1,#0x6c
009ad428	orr w2,wzr,#0x3
009ad42c	mov x0,x21
009ad430	mov x3,x22
009ad434	bl 0x00c321a0
009ad438	cmp w0,#0x1
009ad43c	b.ge 0x009ad44c
009ad440	b 0x009ad4d8
009ad444	mov x0,x22
009ad448	bl 0x00c34810
009ad44c	add x1,sp,#0x8
009ad450	mov x0,x21
009ad454	mov x2,xzr
009ad458	mov x3,xzr
009ad45c	bl 0x00c31a60
009ad460	cbz x0,0x009ad4e0
009ad464	ldr x0,[sp, #0x8]
009ad468	bl 0x00c32d20
009ad46c	cbz x0,0x009ad4d8
009ad470	bl 0x00c34f50
009ad474	mov x22,x0
009ad478	cbz x0,0x009ad4e8
009ad47c	mov x0,x19
009ad480	mov x1,x22
009ad484	bl 0x00c34760
009ad488	tbz w0,#0x1f,0x009ad444
009ad48c	mov x0,x19
009ad490	mov x1,x22
009ad494	bl 0x00c347a0
009ad498	cbnz w0,0x009ad44c
009ad49c	mov x0,x22
009ad4a0	bl 0x00c34810
009ad4a4	b 0x009ad4d8
009ad4a8	bl 0x00c342a0
009ad4ac	adrp x0,0x2d5000
009ad4b0	adrp x2,0x2d3000
009ad4b4	add x0,x0,#0x6b3
009ad4b8	add x2,x2,#0x51e
009ad4bc	mov w1,#0x2cc
009ad4c0	bl 0x00c342b0
009ad4c4	mov w1,#0x100
009ad4c8	mov w0,#0x14
009ad4cc	movk w1,#0xc, LSL #16
009ad4d0	mov x2,xzr
009ad4d4	bl 0x00c342c0
009ad4d8	mov w22,wzr
009ad4dc	b 0x009ad4e8
009ad4e0	bl 0x00c323e0
009ad4e4	mov w22,#0x1
009ad4e8	mov x0,x21
009ad4ec	bl 0x00c31a40
009ad4f0	ldr x0,[sp, #0x8]
009ad4f4	bl 0x00c31a90
009ad4f8	mov x0,x19
009ad4fc	mov x1,x20
009ad500	bl 0x00c34df0
009ad504	mov w0,w22
009ad508	ldp x29,x30,[sp, #0x30]
009ad50c	ldp x20,x19,[sp, #0x20]
009ad510	ldp x22,x21,[sp, #0x10]
009ad514	add sp,sp,#0x40
009ad518	ret
