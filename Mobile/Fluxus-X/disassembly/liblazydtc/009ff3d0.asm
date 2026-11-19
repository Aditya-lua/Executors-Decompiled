; BIO_get_accept_socket @ 009ff3d0
009ff3d0	sub sp,sp,#0x40
009ff3d4	stp x20,x19,[sp, #0x20]
009ff3d8	mov w19,w1
009ff3dc	add x1,sp,#0x18
009ff3e0	add x2,sp,#0x8
009ff3e4	mov w3,#0x1
009ff3e8	stp x21,xzr,[sp, #0x10]
009ff3ec	stp x29,x30,[sp, #0x30]
009ff3f0	add x29,sp,#0x30
009ff3f4	stp xzr,xzr,[sp]
009ff3f8	bl 0x00c385a0
009ff3fc	cbz w0,0x009ff458
009ff400	ldr x0,[sp, #0x18]
009ff404	ldr x1,[sp, #0x8]
009ff408	mov w2,#0x1
009ff40c	mov w4,#0x1
009ff410	mov x5,sp
009ff414	mov w3,wzr
009ff418	bl 0x00c38590
009ff41c	cbz w0,0x009ff474
009ff420	mov w20,#0xffffffff
009ff424	ldr x0,[sp]
009ff428	bl 0x00c384d0
009ff42c	ldr x0,[sp, #0x18]
009ff430	adrp x19,0x2c3000
009ff434	add x19,x19,#0x72e
009ff438	mov w2,#0xf4
009ff43c	mov x1,x19
009ff440	bl 0x00c32310
009ff444	ldr x0,[sp, #0x8]
009ff448	mov w2,#0xf5
009ff44c	mov x1,x19
009ff450	bl 0x00c32310
009ff454	b 0x009ff45c
009ff458	mov w20,#0xffffffff
009ff45c	mov w0,w20
009ff460	ldp x29,x30,[sp, #0x30]
009ff464	ldp x20,x19,[sp, #0x20]
009ff468	ldr x21,[sp, #0x10]
009ff46c	add sp,sp,#0x40
009ff470	ret
009ff474	ldr x0,[sp]
009ff478	bl 0x00c384c0
009ff47c	ldr x8,[sp]
009ff480	mov w20,w0
009ff484	mov x0,x8
009ff488	bl 0x00c38500
009ff48c	ldr x8,[sp]
009ff490	mov w21,w0
009ff494	mov x0,x8
009ff498	bl 0x00c384f0
009ff49c	mov w2,w0
009ff4a0	mov w0,w20
009ff4a4	mov w1,w21
009ff4a8	mov w3,wzr
009ff4ac	bl 0x00c38780
009ff4b0	mov w20,w0
009ff4b4	cmn w0,#0x1
009ff4b8	b.eq 0x009ff424
009ff4bc	ldr x0,[sp]
009ff4c0	bl 0x00c384b0
009ff4c4	cmp w19,#0x0
009ff4c8	mov x1,x0
009ff4cc	cset w2,ne
009ff4d0	mov w0,w20
009ff4d4	bl 0x00c38760
009ff4d8	cbnz w0,0x009ff424
009ff4dc	mov w0,w20
009ff4e0	bl 0x00c38750
009ff4e4	b 0x009ff420
