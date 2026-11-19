; FUN_00934ba4 @ 00934ba4
00934ba4	str x27,[sp, #-0x60]!
00934ba8	stp x26,x25,[sp, #0x10]
00934bac	stp x24,x23,[sp, #0x20]
00934bb0	stp x22,x21,[sp, #0x30]
00934bb4	stp x20,x19,[sp, #0x40]
00934bb8	stp x29,x30,[sp, #0x50]
00934bbc	add x29,sp,#0x50
00934bc0	ldr w8,[x1, #0x14]
00934bc4	mov x19,x1
00934bc8	mov x20,x0
00934bcc	cbz w8,0x00934ce4
00934bd0	adrp x24,0xcb4000
00934bd4	adrp x25,0xcb4000
00934bd8	ldr x24,[x24, #0xdd0]
00934bdc	ldr x25,[x25, #0xdd8]
00934be0	mov x23,xzr
00934be4	add x9,x19,x23
00934be8	ldrb w9,[x9, #0x18]
00934bec	lsr w10,w9,#0x1
00934bf0	and w26,w9,#0x1
00934bf4	bfm w26,w10,#0x1e,#0x0
00934bf8	cbz w26,0x00934cd8
00934bfc	ldr w9,[x20, #0x8]
00934c00	ldr w27,[x19, x23, LSL #0x2]
00934c04	tbnz w9,#0x1f,0x00934c50
00934c08	sxtw x11,w9
00934c0c	add x10,x11,#0x1
00934c10	lsl x11,x11,#0x3
00934c14	sub x10,x10,#0x1
00934c18	cmp x10,#0x1
00934c1c	b.lt 0x00934c50
00934c20	ldr x12,[x20]
00934c24	add x13,x12,x11
00934c28	ldur w14,[x13, #-0x8]
00934c2c	sub x13,x11,#0x8
00934c30	mov x11,x13
00934c34	cmp w14,w27
00934c38	b.ne 0x00934c14
00934c3c	add x9,x12,x13
00934c40	ldrh w10,[x9, #0x4]
00934c44	orr w10,w10,w26
00934c48	strh w10,[x9, #0x4]
00934c4c	b 0x00934cd8
00934c50	ldr w10,[x20, #0xc]
00934c54	cmp w9,w10
00934c58	b.cs 0x00934c64
00934c5c	ldr x21,[x20]
00934c60	b 0x00934cc4
00934c64	ldr x8,[x24]
00934c68	add w22,w10,#0x64
00934c6c	mov w1,#0x8
00934c70	mov x0,x22
00934c74	blr x8
00934c78	mov x21,x0
00934c7c	cbz x0,0x00934d04
00934c80	ldr w8,[x20, #0xc]
00934c84	ldr x1,[x20]
00934c88	mov x0,x21
00934c8c	lsl x2,x8,#0x3
00934c90	bl 0x00c2ffd0
00934c94	ldrb w8,[x20, #0x10]
00934c98	tbz w8,#0x0,0x00934cac
00934c9c	ldr x8,[x25]
00934ca0	ldr x0,[x20]
00934ca4	blr x8
00934ca8	ldrb w8,[x20, #0x10]
00934cac	orr w8,w8,#0x1
00934cb0	str x21,[x20]
00934cb4	str w22,[x20, #0xc]
00934cb8	strb w8,[x20, #0x10]
00934cbc	ldr w9,[x20, #0x8]
00934cc0	ldr w8,[x19, #0x14]
00934cc4	add x10,x21,w9, UXTW  #0x3
00934cc8	add w9,w9,#0x1
00934ccc	str w27,[x10]
00934cd0	strh w26,[x10, #0x4]
00934cd4	str w9,[x20, #0x8]
00934cd8	add x23,x23,#0x1
00934cdc	cmp x23,w8, UXTW 
00934ce0	b.cc 0x00934be4
00934ce4	mov w0,wzr
00934ce8	ldp x29,x30,[sp, #0x50]
00934cec	ldp x20,x19,[sp, #0x40]
00934cf0	ldp x22,x21,[sp, #0x30]
00934cf4	ldp x24,x23,[sp, #0x20]
00934cf8	ldp x26,x25,[sp, #0x10]
00934cfc	ldr x27,[sp], #0x60
00934d00	ret
00934d04	mov w0,#0x1b
00934d08	b 0x00934ce8
