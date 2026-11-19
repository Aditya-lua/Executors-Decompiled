; FUN_00b29ea0 @ 00b29ea0
00b29ea0	stp x20,x19,[sp, #-0x20]!
00b29ea4	stp x29,x30,[sp, #0x10]
00b29ea8	ldr w20,[x0, #0x40]
00b29eac	mov x9,x1
00b29eb0	add x8,x0,#0xc0
00b29eb4	mov x19,x0
00b29eb8	str x8,[x0, #0xb0]
00b29ebc	lsl w1,w2,#0x3
00b29ec0	mov x0,x9
00b29ec4	mov x2,x8
00b29ec8	add x29,sp,#0x10
00b29ecc	bl 0x00c39260
00b29ed0	tbnz w0,#0x1f,0x00b29ef4
00b29ed4	sub w8,w20,#0x1
00b29ed8	cmp w8,#0x1
00b29edc	b.hi 0x00b29f28
00b29ee0	ldrb w8,[x19, #0x6c]
00b29ee4	tbnz w8,#0x1,0x00b29f28
00b29ee8	adrp x8,0xcb5000
00b29eec	ldr x8,[x8, #0x458]
00b29ef0	b 0x00b29f30
00b29ef4	bl 0x00c342a0
00b29ef8	adrp x0,0x2c6000
00b29efc	adrp x2,0x2aa000
00b29f00	add x0,x0,#0x5c9
00b29f04	add x2,x2,#0xec0
00b29f08	orr w1,wzr,#0x1e
00b29f0c	bl 0x00c342b0
00b29f10	mov w0,#0x39
00b29f14	mov w1,#0x65
00b29f18	mov x2,xzr
00b29f1c	bl 0x00c342c0
00b29f20	mov w0,wzr
00b29f24	b 0x00b29f48
00b29f28	adrp x8,0xcb5000
00b29f2c	ldr x8,[x8, #0x460]
00b29f30	adrp x9,0xcb5000
00b29f34	ldr x9,[x9, #0x450]
00b29f38	cmp w20,#0x2
00b29f3c	mov w0,#0x1
00b29f40	csel x9,x9,xzr,eq
00b29f44	stp x8,x9,[x19, #0x30]
00b29f48	ldp x29,x30,[sp, #0x10]
00b29f4c	ldp x20,x19,[sp], #0x20
00b29f50	ret
