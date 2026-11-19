; FUN_009bad5c @ 009bad5c
009bad5c	stp x20,x19,[sp, #-0x20]!
009bad60	stp x29,x30,[sp, #0x10]
009bad64	mov x20,x0
009bad68	ldr x0,[x0, #0xa8]
009bad6c	mov x19,x1
009bad70	add x29,sp,#0x10
009bad74	cbnz x0,0x009bad84
009bad78	bl 0x00c34780
009bad7c	str x0,[x20, #0xa8]
009bad80	cbz x0,0x009bad94
009bad84	ldp x29,x30,[sp, #0x10]
009bad88	mov x1,x19
009bad8c	ldp x20,x19,[sp], #0x20
009bad90	b 0x00c34ed0
009bad94	ldp x29,x30,[sp, #0x10]
009bad98	ldp x20,x19,[sp], #0x20
009bad9c	ret
