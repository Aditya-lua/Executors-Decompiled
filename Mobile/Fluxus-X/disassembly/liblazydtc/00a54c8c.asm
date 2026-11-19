; ERR_error_string @ 00a54c8c
00a54c8c	str x19,[sp, #-0x20]!
00a54c90	adrp x8,0xd21000
00a54c94	add x8,x8,#0xa38
00a54c98	cmp x1,#0x0
00a54c9c	csel x19,x8,x1,eq
00a54ca0	adrp x1,0x2ab000
00a54ca4	add x1,x1,#0x32c
00a54ca8	mov w3,#0x100
00a54cac	mov x2,x19
00a54cb0	stp x29,x30,[sp, #0x10]
00a54cb4	add x29,sp,#0x10
00a54cb8	bl 0x00a5494c
00a54cbc	ldp x29,x30,[sp, #0x10]
00a54cc0	mov x0,x19
00a54cc4	ldr x19,[sp], #0x20
00a54cc8	ret
