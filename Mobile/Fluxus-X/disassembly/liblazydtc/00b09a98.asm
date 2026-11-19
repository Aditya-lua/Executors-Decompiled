; FUN_00b09a98 @ 00b09a98
00b09a98	sub sp,sp,#0x80
00b09a9c	str x21,[sp, #0x50]
00b09aa0	stp x20,x19,[sp, #0x60]
00b09aa4	stp x29,x30,[sp, #0x70]
00b09aa8	add x29,sp,#0x70
00b09aac	cbz x0,0x00b09b20
00b09ab0	mov w20,w1
00b09ab4	adrp x1,0x2cf000
00b09ab8	add x1,x1,#0x33a
00b09abc	mov x19,x2
00b09ac0	mov x21,x0
00b09ac4	bl 0x00c346e0
00b09ac8	cbz w0,0x00b09b20
00b09acc	mov x1,sp
00b09ad0	mov w2,#0x50
00b09ad4	sub x3,x29,#0x18
00b09ad8	mov x0,x21
00b09adc	bl 0x00c324a0
00b09ae0	cbz w0,0x00b09b28
00b09ae4	mov x0,sp
00b09ae8	bl 0x00c364a0
00b09aec	cmp w0,#0x19f
00b09af0	b.eq 0x00b09b40
00b09af4	cmp w0,#0x2cb
00b09af8	b.ne 0x00b09b28
00b09afc	cmp w20,#0x31b
00b09b00	b.eq 0x00b09b0c
00b09b04	cmn w20,#0x1
00b09b08	b.ne 0x00b09b60
00b09b0c	ldr x8,[x19]
00b09b10	tbz w8,#0x11,0x00b09b58
00b09b14	and x8,x8,#-0x10001
00b09b18	str x8,[x19]
00b09b1c	b 0x00b09b68
00b09b20	mov w0,#0x39
00b09b24	b 0x00b09b2c
00b09b28	mov w0,#0x3a
00b09b2c	ldp x29,x30,[sp, #0x70]
00b09b30	ldp x20,x19,[sp, #0x60]
00b09b34	ldr x21,[sp, #0x50]
00b09b38	add sp,sp,#0x80
00b09b3c	ret
00b09b40	cmp w20,#0x31a
00b09b44	b.eq 0x00b09b50
00b09b48	cmn w20,#0x1
00b09b4c	b.ne 0x00b09b60
00b09b50	ldrb w8,[x19, #0x2]
00b09b54	tbnz w8,#0x0,0x00b09b68
00b09b58	orr w0,wzr,#0x3c
00b09b5c	b 0x00b09b2c
00b09b60	mov w0,#0x3b
00b09b64	b 0x00b09b2c
00b09b68	mov w0,wzr
00b09b6c	b 0x00b09b2c
