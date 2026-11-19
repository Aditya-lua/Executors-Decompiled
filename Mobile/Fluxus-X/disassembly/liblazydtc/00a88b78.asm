; FUN_00a88b78 @ 00a88b78
00a88b78	stp x22,x21,[sp, #-0x30]!
00a88b7c	stp x20,x19,[sp, #0x10]
00a88b80	stp x29,x30,[sp, #0x20]
00a88b84	add x29,sp,#0x20
00a88b88	mov x20,x2
00a88b8c	mov x21,x1
00a88b90	mov x22,x0
00a88b94	bl 0x00c3cea0
00a88b98	orr x8,x21,x20
00a88b9c	cbz x8,0x00a88c38
00a88ba0	mov x19,x0
00a88ba4	cbz x21,0x00a88c40
00a88ba8	mov x0,x22
00a88bac	bl 0x00c3cca0
00a88bb0	lsl w1,w0,#0x3
00a88bb4	mov x0,x21
00a88bb8	mov x2,x19
00a88bbc	bl 0x00c37370
00a88bc0	mov x0,x22
00a88bc4	bl 0x00c3cca0
00a88bc8	add x22,x19,#0xf8
00a88bcc	lsl w1,w0,#0x3
00a88bd0	mov x0,x21
00a88bd4	mov x2,x22
00a88bd8	bl 0x00c37360
00a88bdc	adrp x3,0xcb5000
00a88be0	adrp x4,0xcb5000
00a88be4	ldr x3,[x3, #0x310]
00a88be8	ldr x4,[x4, #0x308]
00a88bec	add x21,x19,#0x1f8
00a88bf0	mov x0,x21
00a88bf4	mov x1,x19
00a88bf8	mov x2,x22
00a88bfc	mov x5,xzr
00a88c00	bl 0x00c3e420
00a88c04	cbz w0,0x00a88c94
00a88c08	cbz x20,0x00a88c60
00a88c0c	ldrsw x2,[x19, #0x2e8]
00a88c10	ldrsw x3,[x19, #0x2ec]
00a88c14	mov x0,x21
00a88c18	mov x1,x20
00a88c1c	bl 0x00c3e430
00a88c20	cmp w0,#0x1
00a88c24	mov w0,wzr
00a88c28	b.ne 0x00a88c94
00a88c2c	mov w8,#0x1
00a88c30	str w8,[x19, #0x1f4]
00a88c34	b 0x00a88c70
00a88c38	mov w0,#0x1
00a88c3c	b 0x00a88c94
00a88c40	ldr w8,[x19, #0x1f0]
00a88c44	cbz w8,0x00a88c7c
00a88c48	ldrsw x2,[x19, #0x2e8]
00a88c4c	ldrsw x3,[x19, #0x2ec]
00a88c50	add x0,x19,#0x1f8
00a88c54	mov x1,x20
00a88c58	bl 0x00c3e430
00a88c5c	b 0x00a88c8c
00a88c60	ldr w8,[x19, #0x1f4]
00a88c64	cbz w8,0x00a88c70
00a88c68	ldr x20,[x19, #0x2a8]
00a88c6c	cbnz x20,0x00a88c0c
00a88c70	mov w0,#0x1
00a88c74	str w0,[x19, #0x1f0]
00a88c78	b 0x00a88c94
00a88c7c	ldr x0,[x19, #0x2a8]
00a88c80	ldrsw x2,[x19, #0x2e8]
00a88c84	mov x1,x20
00a88c88	bl 0x00c2ffd0
00a88c8c	mov w0,#0x1
00a88c90	str w0,[x19, #0x1f4]
00a88c94	ldp x29,x30,[sp, #0x20]
00a88c98	ldp x20,x19,[sp, #0x10]
00a88c9c	ldp x22,x21,[sp], #0x30
00a88ca0	ret
