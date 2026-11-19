; FUN_00914d68 @ 00914d68
00914d68	str x23,[sp, #-0x40]!
00914d6c	stp x22,x21,[sp, #0x10]
00914d70	stp x20,x19,[sp, #0x20]
00914d74	stp x29,x30,[sp, #0x30]
00914d78	add x29,sp,#0x30
00914d7c	mov x19,x0
00914d80	cbz x0,0x00914e14
00914d84	adrp x22,0xcc4000
00914d88	add x22,x22,#0x678
00914d8c	mov x21,xzr
00914d90	ldr x20,[x19, x21, LSL #0x3]
00914d94	cbz x20,0x00914dec
00914d98	ldr x8,[x22]
00914d9c	ldr x0,[x20, #0x28]
00914da0	ldr x23,[x20]
00914da4	blr x8
00914da8	ldr x8,[x22]
00914dac	ldr x0,[x20, #0x18]
00914db0	blr x8
00914db4	ldr x8,[x22]
00914db8	ldr x0,[x20, #0x20]
00914dbc	blr x8
00914dc0	ldr x8,[x22]
00914dc4	ldr x0,[x20, #0x8]
00914dc8	blr x8
00914dcc	ldr x8,[x22]
00914dd0	ldr x0,[x20, #0x10]
00914dd4	blr x8
00914dd8	ldr x8,[x22]
00914ddc	mov x0,x20
00914de0	blr x8
00914de4	mov x20,x23
00914de8	cbnz x23,0x00914d98
00914dec	add x21,x21,#0x1
00914df0	cmp x21,#0x3f
00914df4	b.ne 0x00914d90
00914df8	ldr x1,[x22]
00914dfc	mov x0,x19
00914e00	ldp x29,x30,[sp, #0x30]
00914e04	ldp x20,x19,[sp, #0x20]
00914e08	ldp x22,x21,[sp, #0x10]
00914e0c	ldr x23,[sp], #0x40
00914e10	br x1
00914e14	ldp x29,x30,[sp, #0x30]
00914e18	ldp x20,x19,[sp, #0x20]
00914e1c	ldp x22,x21,[sp, #0x10]
00914e20	ldr x23,[sp], #0x40
00914e24	ret
