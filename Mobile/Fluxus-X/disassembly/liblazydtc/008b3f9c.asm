; FUN_008b3f9c @ 008b3f9c
008b3f9c	stp x29,x30,[sp, #-0x20]!
008b3fa0	stp x20,x19,[sp, #0x10]
008b3fa4	mov x29,sp
008b3fa8	mov x20,x0
008b3fac	mov w0,#0x18
008b3fb0	mov w19,w1
008b3fb4	bl 0x00c30000
008b3fb8	adrp x8,0xc4d000
008b3fbc	add x8,x8,#0x150
008b3fc0	str w19,[x0, #0x10]
008b3fc4	stp x8,x20,[x0]
008b3fc8	adrp x2,0xcb4000
008b3fcc	adrp x1,0xc4d000
008b3fd0	add x1,x1,#0x128
008b3fd4	ldr x2,[x2, #0xb38]
008b3fd8	bl 0x00c30020
