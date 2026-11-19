; FUN_008b3b74 @ 008b3b74
008b3b74	stp x29,x30,[sp, #-0x30]!
008b3b78	stp x22,x21,[sp, #0x10]
008b3b7c	stp x20,x19,[sp, #0x20]
008b3b80	mov x29,sp
008b3b84	mov w19,w3
008b3b88	mov x20,x2
008b3b8c	mov x21,x0
008b3b90	bl 0x008be244
008b3b94	mov x22,x0
008b3b98	mov x0,x21
008b3b9c	mov x1,x20
008b3ba0	bl 0x008be244
008b3ba4	adrp x8,0x2a1000
008b3ba8	add x8,x8,#0x6b9
008b3bac	adrp x9,0x2d2000
008b3bb0	add x9,x9,#0xd4f
008b3bb4	cmp w19,#0x11
008b3bb8	mov x4,x0
008b3bbc	csel x8,x9,x8,eq
008b3bc0	cmp w19,#0x10
008b3bc4	adrp x9,0x2b5000
008b3bc8	add x9,x9,#0x24e
008b3bcc	adrp x1,0x2c2000
008b3bd0	add x1,x1,#0xe7b
008b3bd4	csel x3,x9,x8,eq
008b3bd8	mov x0,x21
008b3bdc	mov x2,x22
008b3be0	bl 0x008b39cc
