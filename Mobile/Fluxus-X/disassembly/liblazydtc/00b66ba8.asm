; FUN_00b66ba8 @ 00b66ba8
00b66ba8	stp x26,x25,[sp, #-0x50]!
00b66bac	stp x24,x23,[sp, #0x10]
00b66bb0	stp x22,x21,[sp, #0x20]
00b66bb4	stp x20,x19,[sp, #0x30]
00b66bb8	stp x29,x30,[sp, #0x40]
00b66bbc	add x29,sp,#0x40
00b66bc0	mov w25,w6
00b66bc4	mov x19,x5
00b66bc8	mov x23,x4
00b66bcc	mov x24,x3
00b66bd0	mov x21,x2
00b66bd4	mov x22,x1
00b66bd8	mov x20,x0
00b66bdc	bl 0x00c41000
00b66be0	cbz w0,0x00b66cc0
00b66be4	ldrb w26,[x20]
00b66be8	bfxil w26,w25,#0x0,#0x1
00b66bec	strb w26,[x20]
00b66bf0	cbz x24,0x00b66c20
00b66bf4	ldr x8,[x20, #0x8]
00b66bf8	orr w9,wzr,#0xf
00b66bfc	sub x8,x9,x8
00b66c00	cmp x8,x23
00b66c04	b.ne 0x00b66c6c
00b66c08	add x0,x20,#0x30
00b66c0c	mov x1,x24
00b66c10	mov x2,x23
00b66c14	bl 0x00c2ffd0
00b66c18	orr w8,w26,#0x4
00b66c1c	strb w8,[x20]
00b66c20	cbz x22,0x00b66c4c
00b66c24	ldr x8,[x20, #0x18]
00b66c28	cmp x8,x21
00b66c2c	b.ne 0x00b66c94
00b66c30	ldr x8,[x20, #0x90]
00b66c34	mov x0,x20
00b66c38	mov x1,x22
00b66c3c	mov x2,x21
00b66c40	ldr x8,[x8]
00b66c44	blr x8
00b66c48	cbz w0,0x00b66cc0
00b66c4c	mov x0,x20
00b66c50	mov x1,x19
00b66c54	ldp x29,x30,[sp, #0x40]
00b66c58	ldp x20,x19,[sp, #0x30]
00b66c5c	ldp x22,x21,[sp, #0x20]
00b66c60	ldp x24,x23,[sp, #0x10]
00b66c64	ldp x26,x25,[sp], #0x50
00b66c68	b 0x00b66598
00b66c6c	bl 0x00c342a0
00b66c70	adrp x0,0x2d8000
00b66c74	adrp x2,0x2a6000
00b66c78	add x0,x0,#0xcd7
00b66c7c	add x2,x2,#0xd7c
00b66c80	mov w1,#0xee
00b66c84	bl 0x00c342b0
00b66c88	mov w0,#0x39
00b66c8c	mov w1,#0x6d
00b66c90	b 0x00b66cb8
00b66c94	bl 0x00c342a0
00b66c98	adrp x0,0x2d8000
00b66c9c	adrp x2,0x2a6000
00b66ca0	add x0,x0,#0xcd7
00b66ca4	add x2,x2,#0xd7c
00b66ca8	mov w1,#0xf6
00b66cac	bl 0x00c342b0
00b66cb0	mov w0,#0x39
00b66cb4	mov w1,#0x69
00b66cb8	mov x2,xzr
00b66cbc	bl 0x00c342c0
00b66cc0	ldp x29,x30,[sp, #0x40]
00b66cc4	ldp x20,x19,[sp, #0x30]
00b66cc8	ldp x22,x21,[sp, #0x20]
00b66ccc	ldp x24,x23,[sp, #0x10]
00b66cd0	mov w0,wzr
00b66cd4	ldp x26,x25,[sp], #0x50
00b66cd8	ret
