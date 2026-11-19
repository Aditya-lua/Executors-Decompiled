; FUN_008b3c58 @ 008b3c58
008b3c58	stp x29,x30,[sp, #-0x30]!
008b3c5c	str x21,[sp, #0x10]
008b3c60	stp x20,x19,[sp, #0x20]
008b3c64	mov x29,sp
008b3c68	ldr w20,[x2, #0xc]
008b3c6c	mov x21,x2
008b3c70	mov x19,x0
008b3c74	bl 0x008be244
008b3c78	cmp w20,#0x5
008b3c7c	mov x20,x0
008b3c80	b.ne 0x008b3c98
008b3c84	ldr x8,[x21]
008b3c88	adrp x1,0x2ac000
008b3c8c	add x1,x1,#0xfe4
008b3c90	add x3,x8,#0x18
008b3c94	b 0x008b3cb0
008b3c98	mov x0,x19
008b3c9c	mov x1,x21
008b3ca0	bl 0x008be244
008b3ca4	mov x3,x0
008b3ca8	adrp x1,0x2bc000
008b3cac	add x1,x1,#0xd37
008b3cb0	mov x0,x19
008b3cb4	mov x2,x20
008b3cb8	bl 0x008b39cc
