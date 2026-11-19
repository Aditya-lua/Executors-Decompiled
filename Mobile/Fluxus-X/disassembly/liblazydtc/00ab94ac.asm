; PEM_write_PKCS8PrivateKey @ 00ab94ac
00ab94ac	sub sp,sp,#0x60
00ab94b0	str x25,[sp, #0x10]
00ab94b4	mov x25,x1
00ab94b8	mov w1,wzr
00ab94bc	stp x24,x23,[sp, #0x20]
00ab94c0	stp x22,x21,[sp, #0x30]
00ab94c4	stp x20,x19,[sp, #0x40]
00ab94c8	stp x29,x30,[sp, #0x50]
00ab94cc	add x29,sp,#0x50
00ab94d0	mov x21,x6
00ab94d4	mov x19,x5
00ab94d8	mov w20,w4
00ab94dc	mov x22,x3
00ab94e0	mov x23,x2
00ab94e4	bl 0x00c37810
00ab94e8	cbz x0,0x00ab9528
00ab94ec	mov w3,#0xffffffff
00ab94f0	mov x1,x25
00ab94f4	mov w2,wzr
00ab94f8	mov x4,x23
00ab94fc	mov x5,x22
00ab9500	mov w6,w20
00ab9504	mov x7,x19
00ab9508	mov x24,x0
00ab950c	str x21,[sp]
00ab9510	bl 0x00ab8d5c
00ab9514	mov w19,w0
00ab9518	mov x0,x24
00ab951c	bl 0x00c31a40
00ab9520	mov w0,w19
00ab9524	b 0x00ab955c
00ab9528	bl 0x00c342a0
00ab952c	adrp x0,0x2d6000
00ab9530	adrp x2,0x2bc000
00ab9534	add x0,x0,#0x469
00ab9538	add x2,x2,#0x307
00ab953c	mov w1,#0xf4
00ab9540	bl 0x00c342b0
00ab9544	mov w1,#0x7
00ab9548	mov w0,#0x9
00ab954c	movk w1,#0x8, LSL #16
00ab9550	mov x2,xzr
00ab9554	bl 0x00c342c0
00ab9558	mov w0,wzr
00ab955c	ldp x29,x30,[sp, #0x50]
00ab9560	ldp x20,x19,[sp, #0x40]
00ab9564	ldp x22,x21,[sp, #0x30]
00ab9568	ldp x24,x23,[sp, #0x20]
00ab956c	ldr x25,[sp, #0x10]
00ab9570	add sp,sp,#0x60
00ab9574	ret
