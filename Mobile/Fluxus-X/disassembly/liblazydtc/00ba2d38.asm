; psa_wipe_all_key_slots @ 00ba2d38
00ba2d38	stp x26,x25,[sp, #-0x50]!
00ba2d3c	stp x24,x23,[sp, #0x10]
00ba2d40	stp x22,x21,[sp, #0x20]
00ba2d44	stp x20,x19,[sp, #0x30]
00ba2d48	stp x29,x30,[sp, #0x40]
00ba2d4c	add x29,sp,#0x40
00ba2d50	adrp x20,0xd26000
00ba2d54	mov x19,xzr
00ba2d58	add x20,x20,#0x28
00ba2d5c	mov w21,#0x10
00ba2d60	mov w22,#0x20
00ba2d64	mov w23,#0x1
00ba2d68	orr w24,wzr,#0x3
00ba2d6c	ldr x0,[x20, x19, LSL #0x3]
00ba2d70	cbz x0,0x00ba2dc8
00ba2d74	and x8,x19,#0xffffffff
00ba2d78	lsl w8,w21,w8
00ba2d7c	cmp x19,#0x16
00ba2d80	csel x8,x22,x8,eq
00ba2d84	cbz x8,0x00ba2dc0
00ba2d88	mov x25,xzr
00ba2d8c	sub x26,x8,#0x1
00ba2d90	b 0x00ba2da0
00ba2d94	ldr x0,[x20, x19, LSL #0x3]
00ba2d98	sub x26,x26,#0x1
00ba2d9c	add x25,x25,#0x38
00ba2da0	add x0,x0,x25
00ba2da4	ldr w8,[x0, #0x18]
00ba2da8	cbz w8,0x00ba2db8
00ba2dac	str x23,[x0, #0x20]
00ba2db0	str w24,[x0, #0x18]
00ba2db4	bl 0x00c42da0
00ba2db8	cbnz x26,0x00ba2d94
00ba2dbc	ldr x0,[x20, x19, LSL #0x3]
00ba2dc0	bl 0x00c30960
00ba2dc4	str xzr,[x20, x19, LSL #0x3]
00ba2dc8	add x19,x19,#0x1
00ba2dcc	cmp x19,#0x17
00ba2dd0	b.ne 0x00ba2d6c
00ba2dd4	adrp x0,0xd26000
00ba2dd8	add x0,x0,#0xe0
00ba2ddc	mov w2,#0xb0
00ba2de0	mov w1,wzr
00ba2de4	bl 0x00c301c0
00ba2de8	ldp x29,x30,[sp, #0x40]
00ba2dec	ldp x20,x19,[sp, #0x30]
00ba2df0	ldp x22,x21,[sp, #0x20]
00ba2df4	ldp x24,x23,[sp, #0x10]
00ba2df8	adrp x8,0xd26000
00ba2dfc	strb wzr,[x8, #0x190]
00ba2e00	ldp x26,x25,[sp], #0x50
00ba2e04	ret
