; FUN_00b3fb1c @ 00b3fb1c
00b3fb1c	sub sp,sp,#0x50
00b3fb20	stp x24,x23,[sp, #0x10]
00b3fb24	stp x22,x21,[sp, #0x20]
00b3fb28	stp x20,x19,[sp, #0x30]
00b3fb2c	stp x29,x30,[sp, #0x40]
00b3fb30	add x29,sp,#0x40
00b3fb34	mov x23,x4
00b3fb38	mov w21,w3
00b3fb3c	mov x20,x2
00b3fb40	mov w22,w1
00b3fb44	mov x24,x0
00b3fb48	str xzr,[sp, #0x8]
00b3fb4c	bl 0x00c40ee0
00b3fb50	mov x19,x0
00b3fb54	cbz x0,0x00b3fb98
00b3fb58	add x1,sp,#0x8
00b3fb5c	mov x0,x24
00b3fb60	blr x23
00b3fb64	cmp w0,#0x1
00b3fb68	b.lt 0x00b3fb98
00b3fb6c	mov w23,w0
00b3fb70	mov w0,w22
00b3fb74	bl 0x00c37740
00b3fb78	ldr x4,[sp, #0x8]
00b3fb7c	mov x1,x0
00b3fb80	mov x0,x19
00b3fb84	mov w2,w21
00b3fb88	mov x3,x20
00b3fb8c	mov w5,w23
00b3fb90	bl 0x00c39ba0
00b3fb94	cbnz w0,0x00b3fbe8
00b3fb98	bl 0x00c342a0
00b3fb9c	adrp x20,0x2c2000
00b3fba0	add x20,x20,#0x9ea
00b3fba4	adrp x2,0x2ce000
00b3fba8	add x2,x2,#0x84e
00b3fbac	mov w1,#0x9d
00b3fbb0	mov x0,x20
00b3fbb4	bl 0x00c342b0
00b3fbb8	mov w1,#0x100
00b3fbbc	mov w0,#0x39
00b3fbc0	movk w1,#0xc, LSL #16
00b3fbc4	mov x2,xzr
00b3fbc8	bl 0x00c342c0
00b3fbcc	mov x0,x19
00b3fbd0	bl 0x00c39900
00b3fbd4	ldr x0,[sp, #0x8]
00b3fbd8	mov w2,#0x9f
00b3fbdc	mov x1,x20
00b3fbe0	bl 0x00c32310
00b3fbe4	mov x19,xzr
00b3fbe8	mov x0,x19
00b3fbec	ldp x29,x30,[sp, #0x40]
00b3fbf0	ldp x20,x19,[sp, #0x30]
00b3fbf4	ldp x22,x21,[sp, #0x20]
00b3fbf8	ldp x24,x23,[sp, #0x10]
00b3fbfc	add sp,sp,#0x50
00b3fc00	ret
