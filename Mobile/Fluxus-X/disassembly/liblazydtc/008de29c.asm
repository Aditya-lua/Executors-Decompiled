; FUN_008de29c @ 008de29c
008de29c	stp x29,x30,[sp, #-0x20]!
008de2a0	str x19,[sp, #0x10]
008de2a4	mov x29,sp
008de2a8	mov x19,x0
008de2ac	bl 0x00c30040
008de2b0	adrp x8,0xcb4000
008de2b4	ldr x8,[x8, #0xc30]
008de2b8	add x8,x8,#0x10
008de2bc	str x8,[x19]
008de2c0	ldr x19,[sp, #0x10]
008de2c4	ldp x29,x30,[sp], #0x20
008de2c8	ret
