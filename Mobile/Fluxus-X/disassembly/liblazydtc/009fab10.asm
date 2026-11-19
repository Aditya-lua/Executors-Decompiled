; FUN_009fab10 @ 009fab10
009fab10	stp x20,x19,[sp, #-0x20]!
009fab14	stp x29,x30,[sp, #0x10]
009fab18	add x29,sp,#0x10
009fab1c	bl 0x00c321b0
009fab20	mov x19,x0
009fab24	ldr x0,[x0]
009fab28	adrp x20,0x29d000
009fab2c	add x20,x20,#0xf58
009fab30	mov w2,#0x47
009fab34	mov x1,x20
009fab38	bl 0x00c32310
009fab3c	mov w2,#0x48
009fab40	mov x0,x19
009fab44	mov x1,x20
009fab48	bl 0x00c32310
009fab4c	ldp x29,x30,[sp, #0x10]
009fab50	mov w0,#0x1
009fab54	ldp x20,x19,[sp], #0x20
009fab58	ret
