; FUN_00914c78 @ 00914c78
00914c78	str x25,[sp, #-0x50]!
00914c7c	stp x24,x23,[sp, #0x10]
00914c80	stp x22,x21,[sp, #0x20]
00914c84	stp x20,x19,[sp, #0x30]
00914c88	stp x29,x30,[sp, #0x40]
00914c8c	add x29,sp,#0x40
00914c90	mov x19,x0
00914c94	cbz x0,0x00914d50
00914c98	adrp x22,0xcc4000
00914c9c	add x22,x22,#0x678
00914ca0	mov x21,xzr
00914ca4	ldr x8,[x19, x21, LSL #0x3]
00914ca8	cbz x8,0x00914d44
00914cac	mov x23,x8
00914cb0	mov x20,x8
00914cb4	ldr x9,[x20, #0x30]
00914cb8	ldr x24,[x20]
00914cbc	cbnz x9,0x00914d34
00914cc0	cmp x23,x20
00914cc4	csel x23,x24,x23,eq
00914cc8	cmp x8,x20
00914ccc	mov x25,x24
00914cd0	b.eq 0x00914cdc
00914cd4	mov x25,x8
00914cd8	str x24,[x8]
00914cdc	ldr x8,[x22]
00914ce0	ldr x0,[x20, #0x28]
00914ce4	blr x8
00914ce8	ldr x8,[x22]
00914cec	ldr x0,[x20, #0x18]
00914cf0	blr x8
00914cf4	ldr x8,[x22]
00914cf8	ldr x0,[x20, #0x20]
00914cfc	blr x8
00914d00	ldr x8,[x22]
00914d04	ldr x0,[x20, #0x8]
00914d08	blr x8
00914d0c	ldr x8,[x22]
00914d10	ldr x0,[x20, #0x10]
00914d14	blr x8
00914d18	ldr x8,[x22]
00914d1c	mov x0,x20
00914d20	blr x8
00914d24	ldr w8,[x19, #0x200]
00914d28	mov x20,x25
00914d2c	sub w8,w8,#0x1
00914d30	str w8,[x19, #0x200]
00914d34	mov x8,x20
00914d38	mov x20,x24
00914d3c	cbnz x24,0x00914cb4
00914d40	str x23,[x19, x21, LSL #0x3]
00914d44	add x21,x21,#0x1
00914d48	cmp x21,#0x3f
00914d4c	b.ne 0x00914ca4
00914d50	ldp x29,x30,[sp, #0x40]
00914d54	ldp x20,x19,[sp, #0x30]
00914d58	ldp x22,x21,[sp, #0x20]
00914d5c	ldp x24,x23,[sp, #0x10]
00914d60	ldr x25,[sp], #0x50
00914d64	ret
