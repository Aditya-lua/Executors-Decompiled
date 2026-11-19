; ix::WebSocketTransport::sendPing @ 00997bfc
00997bfc	sub sp,sp,#0x70
00997c00	stp x22,x21,[sp, #0x40]
00997c04	stp x20,x19,[sp, #0x50]
00997c08	stp x29,x30,[sp, #0x60]
00997c0c	add x29,sp,#0x60
00997c10	mrs x21,tpidr_el0
00997c14	mov x20,x8
00997c18	ldr x8,[x21, #0x28]
00997c1c	mov x19,x0
00997c20	mov x2,x1
00997c24	stur x8,[x29, #-0x28]
00997c28	str xzr,[sp, #0x20]
00997c2c	mov w1,#0x9
00997c30	mov x4,sp
00997c34	mov x8,x20
00997c38	mov w3,wzr
00997c3c	mov x22,sp
00997c40	bl 0x00c33f00
00997c44	ldr x0,[sp, #0x20]
00997c48	cmp x22,x0
00997c4c	b.eq 0x00997c60
00997c50	cbz x0,0x00997c6c
00997c54	ldr x8,[x0]
00997c58	ldr x8,[x8, #0x28]
00997c5c	b 0x00997c68
00997c60	ldr x8,[x0]
00997c64	ldr x8,[x8, #0x20]
00997c68	blr x8
00997c6c	ldrb w8,[x20]
00997c70	cbz w8,0x00997c90
00997c74	add x20,x19,#0x2b0
00997c78	mov x0,x20
00997c7c	bl 0x00c2ff10
00997c80	bl 0x00c31900
00997c84	str x0,[x19, #0x2d8]
00997c88	mov x0,x20
00997c8c	bl 0x00c2ff20
00997c90	ldr x8,[x21, #0x28]
00997c94	ldur x9,[x29, #-0x28]
00997c98	cmp x8,x9
00997c9c	b.ne 0x00997cb4
00997ca0	ldp x29,x30,[sp, #0x60]
00997ca4	ldp x20,x19,[sp, #0x50]
00997ca8	ldp x22,x21,[sp, #0x40]
00997cac	add sp,sp,#0x70
00997cb0	ret
00997cb4	bl 0x00c2fec0
