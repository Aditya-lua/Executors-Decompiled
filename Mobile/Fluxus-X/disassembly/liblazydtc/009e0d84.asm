; dtls1_hm_fragment_free @ 009e0d84
009e0d84	cbz x0,0x009e0dd8
009e0d88	stp x20,x19,[sp, #-0x20]!
009e0d8c	stp x29,x30,[sp, #0x10]
009e0d90	mov x19,x0
009e0d94	ldr x0,[x0, #0x58]
009e0d98	adrp x20,0x2c3000
009e0d9c	add x20,x20,#0x656
009e0da0	mov w2,#0x63
009e0da4	mov x1,x20
009e0da8	add x29,sp,#0x10
009e0dac	bl 0x00c32310
009e0db0	ldr x0,[x19, #0x60]
009e0db4	mov w2,#0x64
009e0db8	mov x1,x20
009e0dbc	bl 0x00c32310
009e0dc0	ldp x29,x30,[sp, #0x10]
009e0dc4	mov w2,#0x65
009e0dc8	mov x0,x19
009e0dcc	mov x1,x20
009e0dd0	ldp x20,x19,[sp], #0x20
009e0dd4	b 0x00c32310
009e0dd8	ret
