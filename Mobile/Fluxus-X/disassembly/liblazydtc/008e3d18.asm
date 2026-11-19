; FUN_008e3d18 @ 008e3d18
008e3d18	stp x30,x21,[sp, #-0x20]!
008e3d1c	stp x20,x19,[sp, #0x10]
008e3d20	mov x19,x0
008e3d24	ldr x0,[x0, #0x18]
008e3d28	adrp x8,0xc4e000
008e3d2c	add x8,x8,#0x288
008e3d30	str x8,[x19]
008e3d34	cbz x0,0x008e3da0
008e3d38	mov x20,xzr
008e3d3c	ldr x8,[x0]
008e3d40	ldr x8,[x8, #0x10]
008e3d44	blr x8
008e3d48	ldr x21,[x19, #0x18]
008e3d4c	cmp x20,w0, UXTW 
008e3d50	b.cs 0x008e3d8c
008e3d54	ldr x8,[x21]
008e3d58	mov x0,x21
008e3d5c	mov w1,w20
008e3d60	ldr x8,[x8, #0x38]
008e3d64	blr x8
008e3d68	mov x21,x0
008e3d6c	cbz x0,0x008e3d78
008e3d70	mov x0,x21
008e3d74	bl 0x008e4204
008e3d78	mov x0,x21
008e3d7c	bl 0x00c301d0
008e3d80	ldr x0,[x19, #0x18]
008e3d84	add x20,x20,#0x1
008e3d88	b 0x008e3d3c
008e3d8c	cbz x21,0x008e3d98
008e3d90	mov x0,x21
008e3d94	bl 0x008e51c4
008e3d98	mov x0,x21
008e3d9c	bl 0x00c301d0
008e3da0	mov x0,x19
008e3da4	ldp x20,x19,[sp, #0x10]
008e3da8	ldp x30,x21,[sp], #0x20
008e3dac	b 0x008e4254
