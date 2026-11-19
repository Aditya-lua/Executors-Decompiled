; FUN_009b16b4 @ 009b16b4
009b16b4	stp x29,x30,[sp, #-0x10]!
009b16b8	mov x29,sp
009b16bc	bl 0x00c35370
009b16c0	bl 0x00c34a70
009b16c4	adrp x0,0x9b1000
009b16c8	add x0,x0,#0x71c
009b16cc	bl 0x00c354f0
009b16d0	adrp x8,0xd21000
009b16d4	mov w9,#0x1
009b16d8	adrp x10,0xd21000
009b16dc	strb w9,[x8, #0x8dc]
009b16e0	strb w9,[x10, #0x8d0]
009b16e4	ldp x29,x30,[sp], #0x10
009b16e8	ret
