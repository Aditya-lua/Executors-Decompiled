; log_switch_to_file @ 008e4dcc
008e4dcc	stp x30,x19,[sp, #-0x10]!
008e4dd0	adrp x19,0xd1f000
008e4dd4	add x19,x19,#0xee4
008e4dd8	mov w8,#0x1
008e4ddc	strb w8,[x19]
008e4de0	bl 0x00c30c60
008e4de4	adrp x1,0x2c2000
008e4de8	add x1,x1,#0xec2
008e4dec	stur x0,[x19, #0x4]
008e4df0	bl 0x00c30c10
008e4df4	stur x0,[x19, #0xc]
008e4df8	ldp x30,x19,[sp], #0x10
008e4dfc	ret
