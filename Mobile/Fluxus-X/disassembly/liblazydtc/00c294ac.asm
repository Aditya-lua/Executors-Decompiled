; FUN_00c294ac @ 00c294ac
00c294ac	paciasp
00c294b0	stp x29,x30,[sp, #-0x20]!
00c294b4	str x19,[sp, #0x10]
00c294b8	mov x29,sp
00c294bc	cmp w0,#0x1
00c294c0	mov x19,x1
00c294c4	b.ne 0x00c29504
00c294c8	sub x1,x19,#0x58
00c294cc	mov x0,#-0x1
00c294d0	bl 0x00c2bd10
00c294d4	cmp x0,#0x1
00c294d8	b.ne 0x00c294f4
00c294dc	ldur x8,[x19, #-0x48]
00c294e0	cbz x8,0x00c294ec
00c294e4	add x0,x19,#0x20
00c294e8	blr x8
00c294ec	sub x0,x19,#0x60
00c294f0	bl 0x00c29ce0
00c294f4	ldr x19,[sp, #0x10]
00c294f8	ldp x29,x30,[sp], #0x20
00c294fc	autiasp
00c29500	ret
00c29504	ldur x0,[x19, #-0x38]
00c29508	bl 0x00c0d774
00c2950c	bl 0x007fe114
