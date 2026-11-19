; PEM_write_PKCS8PrivateKey_nid @ 00ab93e0
00ab93e0	sub sp,sp,#0x60
00ab93e4	str x25,[sp, #0x10]
00ab93e8	mov x25,x1
00ab93ec	mov w1,wzr
00ab93f0	stp x24,x23,[sp, #0x20]
00ab93f4	stp x22,x21,[sp, #0x30]
00ab93f8	stp x20,x19,[sp, #0x40]
00ab93fc	stp x29,x30,[sp, #0x50]
00ab9400	add x29,sp,#0x50
00ab9404	mov x24,x6
00ab9408	mov x19,x5
00ab940c	mov w20,w4
00ab9410	mov x21,x3
00ab9414	mov w23,w2
00ab9418	bl 0x00c37810
00ab941c	cbz x0,0x00ab945c
00ab9420	mov x1,x25
00ab9424	mov w2,wzr
00ab9428	mov w3,w23
00ab942c	mov x4,xzr
00ab9430	mov x5,x21
00ab9434	mov w6,w20
00ab9438	mov x7,x19
00ab943c	mov x22,x0
00ab9440	str x24,[sp]
00ab9444	bl 0x00ab8d5c
00ab9448	mov w19,w0
00ab944c	mov x0,x22
00ab9450	bl 0x00c31a40
00ab9454	mov w0,w19
00ab9458	b 0x00ab9490
00ab945c	bl 0x00c342a0
00ab9460	adrp x0,0x2d6000
00ab9464	adrp x2,0x2bc000
00ab9468	add x0,x0,#0x469
00ab946c	add x2,x2,#0x307
00ab9470	mov w1,#0xf4
00ab9474	bl 0x00c342b0
00ab9478	mov w1,#0x7
00ab947c	mov w0,#0x9
00ab9480	movk w1,#0x8, LSL #16
00ab9484	mov x2,xzr
00ab9488	bl 0x00c342c0
00ab948c	mov w0,wzr
00ab9490	ldp x29,x30,[sp, #0x50]
00ab9494	ldp x20,x19,[sp, #0x40]
00ab9498	ldp x22,x21,[sp, #0x30]
00ab949c	ldp x24,x23,[sp, #0x20]
00ab94a0	ldr x25,[sp, #0x10]
00ab94a4	add sp,sp,#0x60
00ab94a8	ret
