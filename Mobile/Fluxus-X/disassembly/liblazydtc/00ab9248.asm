; i2d_PKCS8PrivateKey_fp @ 00ab9248
00ab9248	sub sp,sp,#0x60
00ab924c	stp x24,x23,[sp, #0x20]
00ab9250	mov x24,x1
00ab9254	mov w1,wzr
00ab9258	str x25,[sp, #0x10]
00ab925c	stp x22,x21,[sp, #0x30]
00ab9260	stp x20,x19,[sp, #0x40]
00ab9264	stp x29,x30,[sp, #0x50]
00ab9268	add x29,sp,#0x50
00ab926c	mov x21,x6
00ab9270	mov x19,x5
00ab9274	mov w20,w4
00ab9278	mov x22,x3
00ab927c	mov x23,x2
00ab9280	bl 0x00c37810
00ab9284	cbz x0,0x00ab92c4
00ab9288	mov w2,#0x1
00ab928c	mov w3,#0xffffffff
00ab9290	mov x1,x24
00ab9294	mov x4,x23
00ab9298	mov x5,x22
00ab929c	mov w6,w20
00ab92a0	mov x7,x19
00ab92a4	mov x25,x0
00ab92a8	str x21,[sp]
00ab92ac	bl 0x00ab8d5c
00ab92b0	mov w19,w0
00ab92b4	mov x0,x25
00ab92b8	bl 0x00c31a40
00ab92bc	mov w0,w19
00ab92c0	b 0x00ab92f8
00ab92c4	bl 0x00c342a0
00ab92c8	adrp x0,0x2d6000
00ab92cc	adrp x2,0x2bc000
00ab92d0	add x0,x0,#0x469
00ab92d4	add x2,x2,#0x307
00ab92d8	mov w1,#0xf4
00ab92dc	bl 0x00c342b0
00ab92e0	mov w1,#0x7
00ab92e4	mov w0,#0x9
00ab92e8	movk w1,#0x8, LSL #16
00ab92ec	mov x2,xzr
00ab92f0	bl 0x00c342c0
00ab92f4	mov w0,wzr
00ab92f8	ldp x29,x30,[sp, #0x50]
00ab92fc	ldp x20,x19,[sp, #0x40]
00ab9300	ldp x22,x21,[sp, #0x30]
00ab9304	ldp x24,x23,[sp, #0x20]
00ab9308	ldr x25,[sp, #0x10]
00ab930c	add sp,sp,#0x60
00ab9310	ret
