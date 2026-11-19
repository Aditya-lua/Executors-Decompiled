; FUN_00c0bbbc @ 00c0bbbc
00c0bbbc	paciasp
00c0bbc0	stp x29,x30,[sp, #-0x20]!
00c0bbc4	str x19,[sp, #0x10]
00c0bbc8	mov x29,sp
00c0bbcc	ldrb w8,[x0]
00c0bbd0	ldp x10,x9,[x0, #0x8]
00c0bbd4	mov x19,x1
00c0bbd8	tst w8,#0x1
00c0bbdc	lsr x8,x8,#0x1
00c0bbe0	csinc x9,x9,x0,ne
00c0bbe4	csel x8,x8,x10,eq
00c0bbe8	sub x1,x1,x9
00c0bbec	cmp x1,x8
00c0bbf0	b.hi 0x00c0bc10
00c0bbf4	mov w2,#0x1
00c0bbf8	bl 0x0081ff10
00c0bbfc	mov x0,x19
00c0bc00	ldr x19,[sp, #0x10]
00c0bc04	ldp x29,x30,[sp], #0x20
00c0bc08	autiasp
00c0bc0c	ret
00c0bc10	bl 0x00814f80
