; FUN_008e3db0 @ 008e3db0
008e3db0	str x30,[sp, #-0x20]!
008e3db4	stp x20,x19,[sp, #0x10]
008e3db8	mov x19,x0
008e3dbc	bl 0x008e4788
008e3dc0	adrp x8,0xc4e000
008e3dc4	add x8,x8,#0x2a8
008e3dc8	mov w0,#0x20
008e3dcc	str x8,[x19]
008e3dd0	bl 0x00c2fed0
008e3dd4	adrp x8,0xc4e000
008e3dd8	add x8,x8,#0x400
008e3ddc	mov w1,#0x20
008e3de0	mov x20,x0
008e3de4	ldr x9,[x8, #0x20]
008e3de8	add x8,x8,#0x10
008e3dec	str x8,[x0]
008e3df0	blr x9
008e3df4	adrp x8,0xc4e000
008e3df8	add x8,x8,#0x2c8
008e3dfc	str x8,[x20]
008e3e00	str x20,[x19, #0x8]
008e3e04	ldp x20,x19,[sp, #0x10]
008e3e08	ldr x30,[sp], #0x20
008e3e0c	ret
