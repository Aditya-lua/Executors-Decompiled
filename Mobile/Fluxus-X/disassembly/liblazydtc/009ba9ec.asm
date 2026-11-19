; FUN_009ba9ec @ 009ba9ec
009ba9ec	stp x22,x21,[sp, #-0x30]!
009ba9f0	stp x20,x19,[sp, #0x10]
009ba9f4	stp x29,x30,[sp, #0x20]
009ba9f8	ldr x8,[x0, #0x18]
009ba9fc	mov x19,x1
009baa00	add x29,sp,#0x20
009baa04	cbz x8,0x009baa2c
009baa08	ldr x22,[x8, #0x158]
009baa0c	ldr x20,[x8]
009baa10	ldr x21,[x8, #0x440]
009baa14	ldr x0,[x22, #0x1c8]
009baa18	cbnz x0,0x009baa50
009baa1c	bl 0x00c35030
009baa20	str x0,[x22, #0x1c8]
009baa24	cbnz x0,0x009baa50
009baa28	b 0x009baa6c
009baa2c	ldr x9,[x0, #0x20]
009baa30	cbz x9,0x009baa68
009baa34	ldr x8,[x9, #0x9a8]
009baa38	ldr x22,[x9, #0x898]
009baa3c	cbnz x8,0x009baa0c
009baa40	mov x20,xzr
009baa44	mov x21,xzr
009baa48	ldr x0,[x22, #0x1c8]
009baa4c	cbz x0,0x009baa1c
009baa50	cbz x19,0x009baa68
009baa54	mov x1,x19
009baa58	mov x2,x20
009baa5c	mov x3,x21
009baa60	bl 0x00c35b50
009baa64	cbz w0,0x009baa6c
009baa68	mov w0,#0x1
009baa6c	ldp x29,x30,[sp, #0x20]
009baa70	ldp x20,x19,[sp, #0x10]
009baa74	ldp x22,x21,[sp], #0x30
009baa78	ret
