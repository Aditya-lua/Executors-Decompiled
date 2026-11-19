; i2d_PKCS8PrivateKey_nid_fp @ 00ab9314
00ab9314	sub sp,sp,#0x60
00ab9318	str x25,[sp, #0x10]
00ab931c	mov x25,x1
00ab9320	mov w1,wzr
00ab9324	stp x24,x23,[sp, #0x20]
00ab9328	stp x22,x21,[sp, #0x30]
00ab932c	stp x20,x19,[sp, #0x40]
00ab9330	stp x29,x30,[sp, #0x50]
00ab9334	add x29,sp,#0x50
00ab9338	mov x21,x6
00ab933c	mov x19,x5
00ab9340	mov w20,w4
00ab9344	mov x22,x3
00ab9348	mov w23,w2
00ab934c	bl 0x00c37810
00ab9350	cbz x0,0x00ab9390
00ab9354	mov w2,#0x1
00ab9358	mov x1,x25
00ab935c	mov w3,w23
00ab9360	mov x4,xzr
00ab9364	mov x5,x22
00ab9368	mov w6,w20
00ab936c	mov x7,x19
00ab9370	mov x24,x0
00ab9374	str x21,[sp]
00ab9378	bl 0x00ab8d5c
00ab937c	mov w19,w0
00ab9380	mov x0,x24
00ab9384	bl 0x00c31a40
00ab9388	mov w0,w19
00ab938c	b 0x00ab93c4
00ab9390	bl 0x00c342a0
00ab9394	adrp x0,0x2d6000
00ab9398	adrp x2,0x2bc000
00ab939c	add x0,x0,#0x469
00ab93a0	add x2,x2,#0x307
00ab93a4	mov w1,#0xf4
00ab93a8	bl 0x00c342b0
00ab93ac	mov w1,#0x7
00ab93b0	mov w0,#0x9
00ab93b4	movk w1,#0x8, LSL #16
00ab93b8	mov x2,xzr
00ab93bc	bl 0x00c342c0
00ab93c0	mov w0,wzr
00ab93c4	ldp x29,x30,[sp, #0x50]
00ab93c8	ldp x20,x19,[sp, #0x40]
00ab93cc	ldp x22,x21,[sp, #0x30]
00ab93d0	ldp x24,x23,[sp, #0x20]
00ab93d4	ldr x25,[sp, #0x10]
00ab93d8	add sp,sp,#0x60
00ab93dc	ret
