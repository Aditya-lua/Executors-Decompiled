; OBJ_dup @ 00aaf22c
00aaf22c	stp x20,x19,[sp, #-0x20]!
00aaf230	mov x19,x0
00aaf234	stp x29,x30,[sp, #0x10]
00aaf238	add x29,sp,#0x10
00aaf23c	cbz x0,0x00aaf350
00aaf240	ldrb w8,[x19, #0x20]
00aaf244	tbz w8,#0x0,0x00aaf350
00aaf248	bl 0x00c37670
00aaf24c	cbz x0,0x00aaf2e8
00aaf250	ldr w8,[x19, #0x20]
00aaf254	mov w9,#0xd
00aaf258	mov x20,x0
00aaf25c	orr w8,w8,w9
00aaf260	str w8,[x0, #0x20]
00aaf264	ldr w8,[x19, #0x14]
00aaf268	cmp w8,#0x1
00aaf26c	b.lt 0x00aaf294
00aaf270	ldr x0,[x19, #0x18]
00aaf274	adrp x2,0x2d2000
00aaf278	sxtw x1,w8
00aaf27c	add x2,x2,#0x18a
00aaf280	mov w3,#0x26
00aaf284	bl 0x00c345f0
00aaf288	str x0,[x20, #0x18]
00aaf28c	cbz x0,0x00aaf314
00aaf290	ldr w8,[x19, #0x14]
00aaf294	str w8,[x20, #0x14]
00aaf298	ldr w8,[x19, #0x10]
00aaf29c	str w8,[x20, #0x10]
00aaf2a0	ldr x0,[x19, #0x8]
00aaf2a4	cbz x0,0x00aaf2c0
00aaf2a8	adrp x1,0x2d2000
00aaf2ac	add x1,x1,#0x18a
00aaf2b0	mov w2,#0x2c
00aaf2b4	bl 0x00c34600
00aaf2b8	str x0,[x20, #0x8]
00aaf2bc	cbz x0,0x00aaf314
00aaf2c0	ldr x0,[x19]
00aaf2c4	cbz x0,0x00aaf2e0
00aaf2c8	adrp x1,0x2d2000
00aaf2cc	add x1,x1,#0x18a
00aaf2d0	mov w2,#0x2f
00aaf2d4	bl 0x00c34600
00aaf2d8	str x0,[x20]
00aaf2dc	cbz x0,0x00aaf314
00aaf2e0	mov x19,x20
00aaf2e4	b 0x00aaf350
00aaf2e8	bl 0x00c342a0
00aaf2ec	adrp x0,0x2d2000
00aaf2f0	adrp x2,0x2d0000
00aaf2f4	add x0,x0,#0x18a
00aaf2f8	add x2,x2,#0x1c1
00aaf2fc	orr w1,wzr,#0x1c
00aaf300	bl 0x00c342b0
00aaf304	mov w1,#0xd
00aaf308	mov w0,#0x8
00aaf30c	movk w1,#0x8, LSL #16
00aaf310	b 0x00aaf344
00aaf314	mov x0,x20
00aaf318	bl 0x00c37660
00aaf31c	bl 0x00c342a0
00aaf320	adrp x0,0x2d2000
00aaf324	adrp x2,0x2d0000
00aaf328	add x0,x0,#0x18a
00aaf32c	add x2,x2,#0x1c1
00aaf330	mov w1,#0x35
00aaf334	bl 0x00c342b0
00aaf338	mov w1,#0x100
00aaf33c	mov w0,#0x8
00aaf340	movk w1,#0xc, LSL #16
00aaf344	mov x2,xzr
00aaf348	bl 0x00c342c0
00aaf34c	mov x19,xzr
00aaf350	ldp x29,x30,[sp, #0x10]
00aaf354	mov x0,x19
00aaf358	ldp x20,x19,[sp], #0x20
00aaf35c	ret
