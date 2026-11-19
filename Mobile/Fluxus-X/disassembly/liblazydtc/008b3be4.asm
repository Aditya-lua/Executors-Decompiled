; FUN_008b3be4 @ 008b3be4
008b3be4	stp x29,x30,[sp, #-0x30]!
008b3be8	str x21,[sp, #0x10]
008b3bec	stp x20,x19,[sp, #0x20]
008b3bf0	mov x29,sp
008b3bf4	mov x21,x2
008b3bf8	mov x19,x0
008b3bfc	bl 0x008be244
008b3c00	mov x20,x0
008b3c04	mov x0,x19
008b3c08	mov x1,x21
008b3c0c	bl 0x008be244
008b3c10	ldr w8,[x21, #0xc]
008b3c14	mov x3,x0
008b3c18	cmp w8,#0x5
008b3c1c	b.ne 0x008b3c44
008b3c20	ldr x8,[x21]
008b3c24	cbz x8,0x008b3c44
008b3c28	ldr w9,[x8, #0x14]
008b3c2c	cmp w9,#0x40
008b3c30	b.hi 0x008b3c44
008b3c34	adrp x1,0x29f000
008b3c38	add x1,x1,#0x339
008b3c3c	add x3,x8,#0x18
008b3c40	b 0x008b3c4c
008b3c44	adrp x1,0x2c4000
008b3c48	add x1,x1,#0xd0a
008b3c4c	mov x0,x19
008b3c50	mov x2,x20
008b3c54	bl 0x008b39cc
