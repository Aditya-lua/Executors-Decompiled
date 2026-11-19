; FUN_008b3afc @ 008b3afc
008b3afc	stp x29,x30,[sp, #-0x30]!
008b3b00	stp x22,x21,[sp, #0x10]
008b3b04	stp x20,x19,[sp, #0x20]
008b3b08	mov x29,sp
008b3b0c	mov w21,w3
008b3b10	mov x22,x2
008b3b14	mov x19,x0
008b3b18	bl 0x008be244
008b3b1c	mov x20,x0
008b3b20	mov x0,x19
008b3b24	mov x1,x22
008b3b28	bl 0x008be244
008b3b2c	adrp x8,0xc4d000
008b3b30	add x8,x8,#0x1d0
008b3b34	cmp x20,x0
008b3b38	ldr x8,[x8, w21, UXTW #0x3]
008b3b3c	b.ne 0x008b3b58
008b3b40	adrp x1,0x2af000
008b3b44	add x1,x1,#0x2c
008b3b48	add x2,x8,#0x2
008b3b4c	mov x0,x19
008b3b50	mov x3,x20
008b3b54	bl 0x008b39cc
008b3b58	mov x4,x0
008b3b5c	adrp x1,0x2cc000
008b3b60	add x1,x1,#0xbec
008b3b64	add x2,x8,#0x2
008b3b68	mov x0,x19
008b3b6c	mov x3,x20
008b3b70	bl 0x008b39cc
