; FUN_00824ea0 @ 00824ea0
00824ea0	sub sp,sp,#0x40
00824ea4	stp x29,x30,[sp, #0x20]
00824ea8	stp x20,x19,[sp, #0x30]
00824eac	add x29,sp,#0x20
00824eb0	mrs x19,tpidr_el0
00824eb4	adrp x9,0x35e000
00824eb8	add x9,x9,#0x56a
00824ebc	ldr x8,[x19, #0x28]
00824ec0	ldr q0,[x9]
00824ec4	stur x8,[x29, #-0x8]
00824ec8	mov w8,#0x622b
00824ecc	movk w8,#0xc991, LSL #16
00824ed0	str q0,[sp]
00824ed4	stur w8,[sp, #0xf]
00824ed8	adrp x8,0xd1c000
00824edc	add x8,x8,#0xec8
00824ee0	ldarb w8,[x8]
00824ee4	tbz w8,#0x0,0x00824f08
00824ee8	ldr x8,[x19, #0x28]
00824eec	ldur x9,[x29, #-0x8]
00824ef0	cmp x8,x9
00824ef4	b.ne 0x00824f7c
00824ef8	ldp x20,x19,[sp, #0x30]
00824efc	ldp x29,x30,[sp, #0x20]
00824f00	add sp,sp,#0x40
00824f04	ret
00824f08	adrp x0,0xd1c000
00824f0c	add x0,x0,#0xec8
00824f10	bl 0x00c2fe90
00824f14	cbz w0,0x00824ee8
00824f18	adrp x0,0xd1c000
00824f1c	add x0,x0,#0xeb0
00824f20	mov x1,sp
00824f24	bl 0x008274d8
00824f28	nop
00824f2c	adr x0,0x82757c
00824f30	adrp x1,0xd1c000
00824f34	add x1,x1,#0xeb0
00824f38	adrp x2,0xc48000
00824f3c	add x2,x2,#0x880
00824f40	bl 0x00c2fe70
00824f44	adrp x0,0xd1c000
00824f48	add x0,x0,#0xec8
00824f4c	bl 0x00c2fea0
00824f50	b 0x00824ee8
00824f7c	bl 0x00c2fec0
