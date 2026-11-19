; FUN_00aed930 @ 00aed930
00aed930	stp x20,x19,[sp, #-0x20]!
00aed934	stp x29,x30,[sp, #0x10]
00aed938	ldrb w8,[x0, #0x40]
00aed93c	mov x19,x0
00aed940	add x29,sp,#0x10
00aed944	tbz w8,#0x0,0x00aed9a0
00aed948	ldr x0,[x19, #0x8]
00aed94c	adrp x1,0x2a0000
00aed950	add x1,x1,#0xc2f
00aed954	mov w2,#0x37
00aed958	bl 0x00c32310
00aed95c	ldr w8,[x19]
00aed960	cmp w8,#0x3
00aed964	b.ne 0x00aed9a0
00aed968	ldr x0,[x19, #0x28]
00aed96c	adrp x20,0x2a0000
00aed970	add x20,x20,#0xc2f
00aed974	mov w2,#0x3a
00aed978	mov x1,x20
00aed97c	bl 0x00c32310
00aed980	ldr x0,[x19, #0x30]
00aed984	mov w2,#0x3b
00aed988	mov x1,x20
00aed98c	bl 0x00c32310
00aed990	ldr x0,[x19, #0x38]
00aed994	orr w2,wzr,#0x3c
00aed998	mov x1,x20
00aed99c	bl 0x00c32310
00aed9a0	ldp x29,x30,[sp, #0x10]
00aed9a4	adrp x1,0x2a0000
00aed9a8	add x1,x1,#0xc2f
00aed9ac	mov w2,#0x46
00aed9b0	mov x0,x19
00aed9b4	ldp x20,x19,[sp], #0x20
00aed9b8	b 0x00c32310
