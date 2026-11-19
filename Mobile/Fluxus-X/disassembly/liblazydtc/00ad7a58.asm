; FUN_00ad7a58 @ 00ad7a58
00ad7a58	sub sp,sp,#0x40
00ad7a5c	stp x20,x19,[sp, #0x20]
00ad7a60	stp x29,x30,[sp, #0x30]
00ad7a64	ldr x9,[x0, #0x78]
00ad7a68	mov x8,x0
00ad7a6c	mov w0,wzr
00ad7a70	str x21,[sp, #0x10]
00ad7a74	ldr w9,[x9]
00ad7a78	add x29,sp,#0x30
00ad7a7c	cmp w9,#0x390
00ad7a80	b.ne 0x00ad7b3c
00ad7a84	ldr x0,[x8, #0x88]
00ad7a88	ldr x21,[x8, #0x98]
00ad7a8c	bl 0x00c3d8d0
00ad7a90	mov x19,x0
00ad7a94	ldr x0,[x0, #0x80]
00ad7a98	cbz x0,0x00ad7b38
00ad7a9c	add x1,sp,#0x18
00ad7aa0	add x2,sp,#0x8
00ad7aa4	add x3,sp,#0x4
00ad7aa8	bl 0x00c3fb40
00ad7aac	cbz w0,0x00ad7b3c
00ad7ab0	mov x0,x19
00ad7ab4	bl 0x00c3fab0
00ad7ab8	ldr x8,[sp, #0x18]
00ad7abc	mov w20,w0
00ad7ac0	mov x0,x8
00ad7ac4	bl 0x00c34c20
00ad7ac8	sub w20,w20,w0
00ad7acc	mov x0,x19
00ad7ad0	bl 0x00c3fdc0
00ad7ad4	and w9,w0,#0x7
00ad7ad8	ldr w8,[sp, #0x4]
00ad7adc	cmp w9,#0x1
00ad7ae0	cset w9,eq
00ad7ae4	sub w9,w20,w9
00ad7ae8	cmp w8,w9
00ad7aec	b.le 0x00ad7b24
00ad7af0	bl 0x00c342a0
00ad7af4	adrp x0,0x2ae000
00ad7af8	adrp x2,0x2b2000
00ad7afc	add x0,x0,#0x623
00ad7b00	add x2,x2,#0xb39
00ad7b04	mov w1,#0x357
00ad7b08	bl 0x00c342b0
00ad7b0c	mov w0,#0x4
00ad7b10	mov w1,#0x96
00ad7b14	mov x2,xzr
00ad7b18	bl 0x00c342c0
00ad7b1c	mov w0,wzr
00ad7b20	b 0x00ad7b3c
00ad7b24	stp w8,w8,[x21, #0x30]
00ad7b28	ldr x9,[sp, #0x18]
00ad7b2c	str x9,[x21, #0x20]
00ad7b30	ldr x9,[sp, #0x8]
00ad7b34	str x9,[x21, #0x28]
00ad7b38	mov w0,#0x1
00ad7b3c	ldp x29,x30,[sp, #0x30]
00ad7b40	ldp x20,x19,[sp, #0x20]
00ad7b44	ldr x21,[sp, #0x10]
00ad7b48	add sp,sp,#0x40
00ad7b4c	ret
