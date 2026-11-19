; FUN_0087cb5c @ 0087cb5c
0087cb5c	stp x29,x30,[sp, #-0x20]!
0087cb60	str x19,[sp, #0x10]
0087cb64	mov x29,sp
0087cb68	mov x19,x0
0087cb6c	ldr x0,[x0, #0x20]
0087cb70	cbz x0,0x0087cb84
0087cb74	ldr x8,[x19, #0x30]
0087cb78	str x0,[x19, #0x28]
0087cb7c	sub x1,x8,x0
0087cb80	bl 0x00c2fe80
0087cb84	ldr x0,[x19, #0x8]
0087cb88	cbz x0,0x0087cba4
0087cb8c	ldr x8,[x19, #0x18]
0087cb90	str x0,[x19, #0x10]
0087cb94	sub x1,x8,x0
0087cb98	ldr x19,[sp, #0x10]
0087cb9c	ldp x29,x30,[sp], #0x20
0087cba0	b 0x00c2fe80
0087cba4	ldr x19,[sp, #0x10]
0087cba8	ldp x29,x30,[sp], #0x20
0087cbac	ret
