; FUN_00b1cd70 @ 00b1cd70
00b1cd70	stp x22,x21,[sp, #-0x30]!
00b1cd74	stp x20,x19,[sp, #0x10]
00b1cd78	stp x29,x30,[sp, #0x20]
00b1cd7c	ldr x8,[x1]
00b1cd80	mov x20,x0
00b1cd84	add x29,sp,#0x20
00b1cd88	mov x21,x1
00b1cd8c	ldr x8,[x8]
00b1cd90	mov x0,x8
00b1cd94	bl 0x00c37750
00b1cd98	ldrb w8,[x21, #0x28]
00b1cd9c	mov w22,w0
00b1cda0	tbnz w8,#0x0,0x00b1cdb4
00b1cda4	mov w0,w22
00b1cda8	bl 0x00c3bd70
00b1cdac	cbz x0,0x00b1ce8c
00b1cdb0	bl 0x00c32360
00b1cdb4	bl 0x00c36450
00b1cdb8	cbz x0,0x00b1cdf4
00b1cdbc	mov w1,w22
00b1cdc0	mov x19,x0
00b1cdc4	bl 0x00c36470
00b1cdc8	cbz w0,0x00b1ce2c
00b1cdcc	ldr x8,[x19, #0x8]
00b1cdd0	ldr x8,[x8, #0x20]
00b1cdd4	cbz x8,0x00b1ce54
00b1cdd8	mov x0,x19
00b1cddc	mov x1,x21
00b1cde0	blr x8
00b1cde4	cbz w0,0x00b1ce80
00b1cde8	mov w0,#0x1
00b1cdec	str x19,[x20]
00b1cdf0	b 0x00b1ce8c
00b1cdf4	bl 0x00c342a0
00b1cdf8	adrp x0,0x2bc000
00b1cdfc	adrp x2,0x2ca000
00b1ce00	add x0,x0,#0x79f
00b1ce04	add x2,x2,#0x6e9
00b1ce08	mov w1,#0x1a3
00b1ce0c	bl 0x00c342b0
00b1ce10	mov w1,#0x100
00b1ce14	mov w0,#0xb
00b1ce18	movk w1,#0xc, LSL #16
00b1ce1c	mov x2,xzr
00b1ce20	bl 0x00c342c0
00b1ce24	mov w0,#0xffffffff
00b1ce28	b 0x00b1ce8c
00b1ce2c	bl 0x00c342a0
00b1ce30	adrp x0,0x2bc000
00b1ce34	adrp x2,0x2ca000
00b1ce38	add x0,x0,#0x79f
00b1ce3c	add x2,x2,#0x6e9
00b1ce40	mov w1,#0x1a8
00b1ce44	bl 0x00c342b0
00b1ce48	mov w0,#0xb
00b1ce4c	mov w1,#0x6f
00b1ce50	b 0x00b1ce78
00b1ce54	bl 0x00c342a0
00b1ce58	adrp x0,0x2bc000
00b1ce5c	adrp x2,0x2ca000
00b1ce60	add x0,x0,#0x79f
00b1ce64	add x2,x2,#0x6e9
00b1ce68	mov w1,#0x1b5
00b1ce6c	bl 0x00c342b0
00b1ce70	mov w0,#0xb
00b1ce74	orr w1,wzr,#0x7c
00b1ce78	mov x2,xzr
00b1ce7c	bl 0x00c342c0
00b1ce80	mov x0,x19
00b1ce84	bl 0x00c32450
00b1ce88	mov w0,wzr
00b1ce8c	ldp x29,x30,[sp, #0x20]
00b1ce90	ldp x20,x19,[sp, #0x10]
00b1ce94	ldp x22,x21,[sp], #0x30
00b1ce98	ret
