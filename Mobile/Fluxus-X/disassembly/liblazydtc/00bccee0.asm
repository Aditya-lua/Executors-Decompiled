; FUN_00bccee0 @ 00bccee0
00bccee0	paciasp
00bccee4	stp x29,x30,[sp, #-0x10]!
00bccee8	mov x29,sp
00bcceec	ldrb w8,[x0, #0x8]
00bccef0	cmp w8,#0x1
00bccef4	b.ne 0x00bccf00
00bccef8	ldr x0,[x0]
00bccefc	bl 0x00c31cb0
00bccf00	ldp x29,x30,[sp], #0x10
00bccf04	autiasp
00bccf08	ret
