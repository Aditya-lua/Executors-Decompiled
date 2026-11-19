; FUN_00ac5b80 @ 00ac5b80
00ac5b80	sub sp,sp,#0xd0
00ac5b84	stp x26,x25,[sp, #0x80]
00ac5b88	stp x24,x23,[sp, #0x90]
00ac5b8c	stp x22,x21,[sp, #0xa0]
00ac5b90	stp x20,x19,[sp, #0xb0]
00ac5b94	stp x29,x30,[sp, #0xc0]
00ac5b98	ldr x23,[x1]
00ac5b9c	mov x19,x1
00ac5ba0	mov x21,x0
00ac5ba4	orr w1,wzr,#0x3
00ac5ba8	ldrb w8,[x23]
00ac5bac	str x27,[sp, #0x70]
00ac5bb0	add x29,sp,#0xc0
00ac5bb4	mov x20,x2
00ac5bb8	mov w0,w8
00ac5bbc	bl 0x00c377c0
00ac5bc0	cbz w0,0x00ac5c64
00ac5bc4	mov w22,wzr
00ac5bc8	mov x25,xzr
00ac5bcc	mov w24,wzr
00ac5bd0	add x26,sp,#0xc
00ac5bd4	mov w27,#0x2e
00ac5bd8	add x23,x23,#0x2
00ac5bdc	cmp x25,#0x62
00ac5be0	b.ls 0x00ac5bf4
00ac5be4	b 0x00ac5c0c
00ac5be8	add x23,x23,#0x1
00ac5bec	cmp x25,#0x62
00ac5bf0	b.hi 0x00ac5c0c
00ac5bf4	ldurb w0,[x23, #-0x2]
00ac5bf8	bl 0x00c3de30
00ac5bfc	add x8,x25,#0x1
00ac5c00	strb w0,[x26, x25]
00ac5c04	mov x25,x8
00ac5c08	b 0x00ac5c10
00ac5c0c	mov w24,#0x1
00ac5c10	ldurb w0,[x23, #-0x1]
00ac5c14	cmp w0,#0x5f
00ac5c18	b.eq 0x00ac5be8
00ac5c1c	orr w1,wzr,#0x7
00ac5c20	bl 0x00c377c0
00ac5c24	cbnz w0,0x00ac5be8
00ac5c28	ldurb w8,[x23, #-0x1]
00ac5c2c	cmp w8,#0x2e
00ac5c30	b.ne 0x00ac5c98
00ac5c34	cmp x25,#0x62
00ac5c38	b.hi 0x00ac5c4c
00ac5c3c	add x8,x25,#0x1
00ac5c40	strb w27,[x26, x25]
00ac5c44	mov x25,x8
00ac5c48	b 0x00ac5c50
00ac5c4c	mov w24,#0x1
00ac5c50	ldrb w0,[x23]
00ac5c54	orr w1,wzr,#0x3
00ac5c58	bl 0x00c377c0
00ac5c5c	mov w22,#0x1
00ac5c60	cbnz w0,0x00ac5bd8
00ac5c64	bl 0x00c342a0
00ac5c68	adrp x0,0x2d8000
00ac5c6c	adrp x2,0x2d4000
00ac5c70	add x0,x0,#0x6ba
00ac5c74	add x2,x2,#0x3b5
00ac5c78	mov w1,#0x43
00ac5c7c	bl 0x00c342b0
00ac5c80	ldr x3,[x19]
00ac5c84	adrp x2,0x2b7000
00ac5c88	add x2,x2,#0x91b
00ac5c8c	mov w0,#0x37
00ac5c90	mov w1,#0x67
00ac5c94	b 0x00ac5cd4
00ac5c98	add x8,sp,#0xc
00ac5c9c	strb wzr,[x8, x25]
00ac5ca0	cbz w24,0x00ac5cfc
00ac5ca4	bl 0x00c342a0
00ac5ca8	adrp x0,0x2d8000
00ac5cac	adrp x2,0x2d4000
00ac5cb0	add x0,x0,#0x6ba
00ac5cb4	add x2,x2,#0x3b5
00ac5cb8	mov w1,#0x58
00ac5cbc	bl 0x00c342b0
00ac5cc0	ldr x3,[x19]
00ac5cc4	adrp x2,0x2b7000
00ac5cc8	add x2,x2,#0x91b
00ac5ccc	mov w0,#0x37
00ac5cd0	mov w1,#0x64
00ac5cd4	bl 0x00c342c0
00ac5cd8	mov w0,wzr
00ac5cdc	ldp x29,x30,[sp, #0xc0]
00ac5ce0	ldp x20,x19,[sp, #0xb0]
00ac5ce4	ldp x22,x21,[sp, #0xa0]
00ac5ce8	ldp x24,x23,[sp, #0x90]
00ac5cec	ldp x26,x25,[sp, #0x80]
00ac5cf0	ldr x27,[sp, #0x70]
00ac5cf4	add sp,sp,#0xd0
00ac5cf8	ret
00ac5cfc	sub x23,x23,#0x2
00ac5d00	ldrb w0,[x23, #0x1]!
00ac5d04	mov w1,#0x8
00ac5d08	bl 0x00c377c0
00ac5d0c	cbnz w0,0x00ac5d00
00ac5d10	add x1,sp,#0xc
00ac5d14	mov x0,x21
00ac5d18	mov w2,w22
00ac5d1c	str x23,[x19]
00ac5d20	bl 0x00c3f870
00ac5d24	str w0,[x20]
00ac5d28	mov w0,#0x1
00ac5d2c	b 0x00ac5cdc
