; BN_asc2bn @ 00aa0b84
00aa0b84	stp x20,x19,[sp, #-0x20]!
00aa0b88	stp x29,x30,[sp, #0x10]
00aa0b8c	mov x8,x1
00aa0b90	ldrb w9,[x8], #0x1
00aa0b94	mov x19,x1
00aa0b98	mov x20,x0
00aa0b9c	add x29,sp,#0x10
00aa0ba0	cmp w9,#0x2d
00aa0ba4	csel x9,x1,x8,ne
00aa0ba8	ldrb w9,[x9]
00aa0bac	csel x1,x8,x1,eq
00aa0bb0	cmp w9,#0x30
00aa0bb4	b.ne 0x00aa0bdc
00aa0bb8	ldrb w8,[x1, #0x1]
00aa0bbc	orr w8,w8,#0x20
00aa0bc0	cmp w8,#0x78
00aa0bc4	b.ne 0x00aa0bdc
00aa0bc8	add x1,x1,#0x2
00aa0bcc	mov x0,x20
00aa0bd0	bl 0x00aa07d8
00aa0bd4	cbnz w0,0x00aa0be8
00aa0bd8	b 0x00aa0c10
00aa0bdc	mov x0,x20
00aa0be0	bl 0x00aa09d0
00aa0be4	cbz w0,0x00aa0c10
00aa0be8	ldrb w8,[x19]
00aa0bec	cmp w8,#0x2d
00aa0bf0	b.ne 0x00aa0c0c
00aa0bf4	ldr x8,[x20]
00aa0bf8	mov w0,#0x1
00aa0bfc	ldr w9,[x8, #0x8]
00aa0c00	cbz w9,0x00aa0c10
00aa0c04	str w0,[x8, #0x10]
00aa0c08	b 0x00aa0c10
00aa0c0c	mov w0,#0x1
00aa0c10	ldp x29,x30,[sp, #0x10]
00aa0c14	ldp x20,x19,[sp], #0x20
00aa0c18	ret
