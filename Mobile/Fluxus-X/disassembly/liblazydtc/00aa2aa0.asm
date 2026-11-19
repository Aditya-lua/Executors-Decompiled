; ossl_provider_find @ 00aa2aa0
00aa2aa0	sub sp,sp,#0x120
00aa2aa4	stp x22,x21,[sp, #0xf0]
00aa2aa8	mov w22,w2
00aa2aac	adrp x2,0xc6d000
00aa2ab0	stp x20,x19,[sp, #0x100]
00aa2ab4	mov x20,x1
00aa2ab8	add x2,x2,#0x4c8
00aa2abc	mov w1,#0x1
00aa2ac0	str x28,[sp, #0xe0]
00aa2ac4	stp x29,x30,[sp, #0x110]
00aa2ac8	add x29,sp,#0x110
00aa2acc	mov x21,x0
00aa2ad0	bl 0x00c3b520
00aa2ad4	mov x19,x0
00aa2ad8	cbz x0,0x00aa2b84
00aa2adc	mov x0,sp
00aa2ae0	orr w2,wzr,#0xe0
00aa2ae4	mov w1,wzr
00aa2ae8	bl 0x00c301c0
00aa2aec	cbnz w22,0x00aa2b08
00aa2af0	mov x0,x21
00aa2af4	bl 0x00c3def0
00aa2af8	cbz w0,0x00aa2b08
00aa2afc	mov w0,#0x40
00aa2b00	mov x1,xzr
00aa2b04	bl 0x00c35500
00aa2b08	str x20,[sp, #0x28]
00aa2b0c	ldr x0,[x19, #0x20]
00aa2b10	bl 0x00c356a0
00aa2b14	cbz w0,0x00aa2bc0
00aa2b18	ldr x0,[x19, #0x8]
00aa2b1c	mov x1,sp
00aa2b20	bl 0x00c34760
00aa2b24	cmn w0,#0x1
00aa2b28	b.eq 0x00aa2bb8
00aa2b2c	mov w1,w0
00aa2b30	ldr x0,[x19, #0x8]
00aa2b34	bl 0x00c32610
00aa2b38	ldr x8,[x19, #0x20]
00aa2b3c	mov x19,x0
00aa2b40	mov x0,x8
00aa2b44	bl 0x00c35690
00aa2b48	cbz x19,0x00aa2bc4
00aa2b4c	add x8,x19,#0x10
00aa2b50	ldxr w20,[x8]
00aa2b54	add w9,w20,#0x1
00aa2b58	stxr w10,w9,[x8]
00aa2b5c	cbnz w10,0x00aa2b50
00aa2b60	ldrb w8,[x19, #0xc8]
00aa2b64	tbz w8,#0x0,0x00aa2b78
00aa2b68	mov x0,x19
00aa2b6c	mov w1,wzr
00aa2b70	bl 0x00c3eb90
00aa2b74	cbz w0,0x00aa2be0
00aa2b78	cmn w20,#0x1
00aa2b7c	b.ne 0x00aa2bc4
00aa2b80	b 0x00aa2bc0
00aa2b84	bl 0x00c342a0
00aa2b88	adrp x0,0x2aa000
00aa2b8c	adrp x2,0x2bb000
00aa2b90	add x0,x0,#0x4b5
00aa2b94	add x2,x2,#0xf7d
00aa2b98	mov w1,#0x156
00aa2b9c	bl 0x00c342b0
00aa2ba0	mov w1,#0x103
00aa2ba4	orr w0,wzr,#0xf
00aa2ba8	movk w1,#0xc, LSL #16
00aa2bac	mov x2,xzr
00aa2bb0	bl 0x00c342c0
00aa2bb4	b 0x00aa2bc4
00aa2bb8	ldr x0,[x19, #0x20]
00aa2bbc	bl 0x00c35690
00aa2bc0	mov x19,xzr
00aa2bc4	mov x0,x19
00aa2bc8	ldp x29,x30,[sp, #0x110]
00aa2bcc	ldp x20,x19,[sp, #0x100]
00aa2bd0	ldp x22,x21,[sp, #0xf0]
00aa2bd4	ldr x28,[sp, #0xe0]
00aa2bd8	add sp,sp,#0x120
00aa2bdc	ret
00aa2be0	mov x0,x19
00aa2be4	bl 0x00aa2c44
00aa2be8	b 0x00aa2bc0
