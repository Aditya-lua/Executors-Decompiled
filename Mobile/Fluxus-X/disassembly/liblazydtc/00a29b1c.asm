; BN_nist_mod_func @ 00a29b1c
00a29b1c	str x19,[sp, #-0x20]!
00a29b20	mov x19,x0
00a29b24	adrp x0,0xc5b000
00a29b28	add x0,x0,#0xe78
00a29b2c	mov x1,x19
00a29b30	stp x29,x30,[sp, #0x10]
00a29b34	add x29,sp,#0x10
00a29b38	bl 0x00c369c0
00a29b3c	cbz w0,0x00a29ba0
00a29b40	adrp x0,0xc5b000
00a29b44	add x0,x0,#0xe90
00a29b48	mov x1,x19
00a29b4c	bl 0x00c369c0
00a29b50	cbz w0,0x00a29bac
00a29b54	adrp x0,0xc5b000
00a29b58	add x0,x0,#0xea8
00a29b5c	mov x1,x19
00a29b60	bl 0x00c369c0
00a29b64	cbz w0,0x00a29bb8
00a29b68	adrp x0,0xc5b000
00a29b6c	add x0,x0,#0xec0
00a29b70	mov x1,x19
00a29b74	bl 0x00c369c0
00a29b78	cbz w0,0x00a29bc4
00a29b7c	adrp x0,0xc5b000
00a29b80	add x0,x0,#0xed8
00a29b84	mov x1,x19
00a29b88	bl 0x00c369c0
00a29b8c	adrp x8,0xcb5000
00a29b90	ldr x8,[x8, #0x440]
00a29b94	cmp w0,#0x0
00a29b98	csel x0,x8,xzr,eq
00a29b9c	b 0x00a29bcc
00a29ba0	adrp x0,0xcb5000
00a29ba4	ldr x0,[x0, #0x420]
00a29ba8	b 0x00a29bcc
00a29bac	adrp x0,0xcb5000
00a29bb0	ldr x0,[x0, #0x428]
00a29bb4	b 0x00a29bcc
00a29bb8	adrp x0,0xcb5000
00a29bbc	ldr x0,[x0, #0x430]
00a29bc0	b 0x00a29bcc
00a29bc4	adrp x0,0xcb5000
00a29bc8	ldr x0,[x0, #0x438]
00a29bcc	ldp x29,x30,[sp, #0x10]
00a29bd0	ldr x19,[sp], #0x20
00a29bd4	ret
