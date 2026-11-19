; FUN_009bac00 @ 009bac00
009bac00	stp x22,x21,[sp, #-0x30]!
009bac04	stp x20,x19,[sp, #0x10]
009bac08	stp x29,x30,[sp, #0x20]
009bac0c	ldr x8,[x0, #0x18]
009bac10	mov x19,x1
009bac14	add x29,sp,#0x20
009bac18	cbz x8,0x009bac40
009bac1c	ldr x22,[x8, #0x158]
009bac20	ldr x20,[x8]
009bac24	ldr x21,[x8, #0x440]
009bac28	ldr x0,[x22, #0x1d0]
009bac2c	cbnz x0,0x009bac64
009bac30	bl 0x00c35030
009bac34	str x0,[x22, #0x1d0]
009bac38	cbnz x0,0x009bac64
009bac3c	b 0x009bac80
009bac40	ldr x9,[x0, #0x20]
009bac44	cbz x9,0x009bac7c
009bac48	ldr x8,[x9, #0x9a8]
009bac4c	ldr x22,[x9, #0x898]
009bac50	cbnz x8,0x009bac20
009bac54	mov x20,xzr
009bac58	mov x21,xzr
009bac5c	ldr x0,[x22, #0x1d0]
009bac60	cbz x0,0x009bac30
009bac64	cbz x19,0x009bac7c
009bac68	mov x1,x19
009bac6c	mov x2,x20
009bac70	mov x3,x21
009bac74	bl 0x00c35b60
009bac78	cbz w0,0x009bac80
009bac7c	mov w0,#0x1
009bac80	ldp x29,x30,[sp, #0x20]
009bac84	ldp x20,x19,[sp, #0x10]
009bac88	ldp x22,x21,[sp], #0x30
009bac8c	ret
