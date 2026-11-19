; FUN_009ba988 @ 009ba988
009ba988	stp x20,x19,[sp, #-0x20]!
009ba98c	stp x29,x30,[sp, #0x10]
009ba990	ldr x8,[x0, #0x18]
009ba994	mov x19,x1
009ba998	add x29,sp,#0x10
009ba99c	cbz x8,0x009ba9a8
009ba9a0	add x8,x8,#0x158
009ba9a4	b 0x009ba9b4
009ba9a8	ldr x8,[x0, #0x20]
009ba9ac	cbz x8,0x009ba9dc
009ba9b0	add x8,x8,#0x898
009ba9b4	ldr x20,[x8]
009ba9b8	ldr x0,[x20, #0x1c8]
009ba9bc	cbnz x0,0x009ba9cc
009ba9c0	bl 0x00c35030
009ba9c4	str x0,[x20, #0x1c8]
009ba9c8	cbz x0,0x009ba9e0
009ba9cc	cbz x19,0x009ba9dc
009ba9d0	mov x1,x19
009ba9d4	bl 0x00c32c30
009ba9d8	cbz w0,0x009ba9e0
009ba9dc	mov w0,#0x1
009ba9e0	ldp x29,x30,[sp, #0x10]
009ba9e4	ldp x20,x19,[sp], #0x20
009ba9e8	ret
