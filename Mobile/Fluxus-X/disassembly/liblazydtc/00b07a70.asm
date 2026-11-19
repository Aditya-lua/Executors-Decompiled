; FUN_00b07a70 @ 00b07a70
00b07a70	str x25,[sp, #-0x50]!
00b07a74	stp x24,x23,[sp, #0x10]
00b07a78	stp x22,x21,[sp, #0x20]
00b07a7c	stp x20,x19,[sp, #0x30]
00b07a80	stp x29,x30,[sp, #0x40]
00b07a84	mov x21,x0
00b07a88	ldr x0,[x0, #0x8]
00b07a8c	add x29,sp,#0x40
00b07a90	cbz x0,0x00b07b18
00b07a94	mov w8,w1
00b07a98	ldrsw x1,[x21]
00b07a9c	cbz w1,0x00b07b18
00b07aa0	mov x19,x6
00b07aa4	mov x22,x5
00b07aa8	mov x23,x4
00b07aac	mov w25,w3
00b07ab0	mov x24,x2
00b07ab4	cmp w8,#0x1
00b07ab8	b.lt 0x00b07b38
00b07abc	ldr w9,[x21, #0x4]
00b07ac0	mov w20,wzr
00b07ac4	cmp w9,w8
00b07ac8	b.ne 0x00b07b1c
00b07acc	cmp w8,#0x16
00b07ad0	b.ne 0x00b07bb0
00b07ad4	mov x2,x23
00b07ad8	mov x3,x22
00b07adc	mov w4,w25
00b07ae0	blr x24
00b07ae4	mov w20,w0
00b07ae8	cbz x19,0x00b07b1c
00b07aec	cmp w20,#0x1
00b07af0	b.lt 0x00b07b1c
00b07af4	ldr x0,[x21, #0x8]
00b07af8	ldrsw x1,[x21]
00b07afc	adrp x2,0x2c2000
00b07b00	add x2,x2,#0x5ca
00b07b04	mov w3,#0x350
00b07b08	bl 0x00c36180
00b07b0c	str x0,[x19]
00b07b10	cbnz x0,0x00b07b1c
00b07b14	b 0x00b07bec
00b07b18	mov w20,wzr
00b07b1c	mov w0,w20
00b07b20	ldp x29,x30,[sp, #0x40]
00b07b24	ldp x20,x19,[sp, #0x30]
00b07b28	ldp x22,x21,[sp, #0x20]
00b07b2c	ldp x24,x23,[sp, #0x10]
00b07b30	ldr x25,[sp], #0x50
00b07b34	ret
00b07b38	add x0,sp,#0x8
00b07b3c	mov x1,x21
00b07b40	bl 0x00c32160
00b07b44	tbnz w0,#0x1f,0x00b07bec
00b07b48	ldr x8,[sp, #0x8]
00b07b4c	sxtw x21,w0
00b07b50	mov x1,x21
00b07b54	mov x2,x23
00b07b58	mov x0,x8
00b07b5c	mov x3,x22
00b07b60	mov w4,w25
00b07b64	blr x24
00b07b68	mov w20,w0
00b07b6c	cbz x19,0x00b07b98
00b07b70	cmp w20,#0x1
00b07b74	b.lt 0x00b07b98
00b07b78	ldr x0,[sp, #0x8]
00b07b7c	adrp x2,0x2c2000
00b07b80	add x2,x2,#0x5ca
00b07b84	mov w3,#0x361
00b07b88	mov x1,x21
00b07b8c	bl 0x00c36180
00b07b90	str x0,[x19]
00b07b94	cbz x0,0x00b07bd8
00b07b98	ldr x0,[sp, #0x8]
00b07b9c	adrp x1,0x2c2000
00b07ba0	add x1,x1,#0x5ca
00b07ba4	mov w2,#0x367
00b07ba8	bl 0x00c32310
00b07bac	b 0x00b07b1c
00b07bb0	cmp w1,w22
00b07bb4	mov w20,wzr
00b07bb8	b.ne 0x00b07b1c
00b07bbc	mov x1,x23
00b07bc0	mov x2,x22
00b07bc4	bl 0x00c300b0
00b07bc8	cmp w0,#0x0
00b07bcc	cset w20,eq
00b07bd0	cbnz x19,0x00b07aec
00b07bd4	b 0x00b07b1c
00b07bd8	ldr x0,[sp, #0x8]
00b07bdc	adrp x1,0x2c2000
00b07be0	add x1,x1,#0x5ca
00b07be4	mov w2,#0x363
00b07be8	bl 0x00c32310
00b07bec	mov w20,#0xffffffff
00b07bf0	b 0x00b07b1c
