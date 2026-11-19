; SHA224 @ 00addf2c
00addf2c	str x19,[sp, #-0x20]!
00addf30	adrp x8,0xd22000
00addf34	add x8,x8,#0x25c
00addf38	cmp x2,#0x0
00addf3c	mov x4,x1
00addf40	csel x19,x8,x2,eq
00addf44	adrp x1,0x2ac000
00addf48	mov x3,x0
00addf4c	add x1,x1,#0x530
00addf50	mov x0,xzr
00addf54	mov x2,xzr
00addf58	mov x5,x19
00addf5c	mov x6,xzr
00addf60	stp x29,x30,[sp, #0x10]
00addf64	add x29,sp,#0x10
00addf68	bl 0x00c3c220
00addf6c	ldp x29,x30,[sp, #0x10]
00addf70	cmp w0,#0x0
00addf74	csel x0,xzr,x19,eq
00addf78	ldr x19,[sp], #0x20
00addf7c	ret
