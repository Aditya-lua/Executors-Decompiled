; FUN_008b4b14 @ 008b4b14
008b4b14	stp x29,x30,[sp, #-0x20]!
008b4b18	str x19,[sp, #0x10]
008b4b1c	mov x29,sp
008b4b20	ldr w8,[x0, #0x10]
008b4b24	cmp w8,#0x2
008b4b28	b.ne 0x008b4b48
008b4b2c	mov x19,x0
008b4b30	ldr x0,[x0, #0x8]
008b4b34	mov w1,#0xffffffff
008b4b38	mov x2,xzr
008b4b3c	bl 0x008ab8a4
008b4b40	cbnz x0,0x008b4b70
008b4b44	ldr w8,[x19, #0x10]
008b4b48	sub w8,w8,#0x2
008b4b4c	cmp w8,#0x3
008b4b50	b.hi 0x008b4b68
008b4b54	adrp x9,0x364000
008b4b58	add x9,x9,#0x694
008b4b5c	ldrsw x8,[x9, w8, UXTW #0x2]
008b4b60	add x0,x9,x8
008b4b64	b 0x008b4b70
008b4b68	adrp x0,0x29d000
008b4b6c	add x0,x0,#0x60b
008b4b70	ldr x19,[sp, #0x10]
008b4b74	ldp x29,x30,[sp], #0x20
008b4b78	ret
