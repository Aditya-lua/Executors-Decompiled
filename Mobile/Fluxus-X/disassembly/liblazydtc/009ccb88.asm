; SSL3_BUFFER_release @ 009ccb88
009ccb88	str x19,[sp, #-0x20]!
009ccb8c	stp x29,x30,[sp, #0x10]
009ccb90	mov x19,x0
009ccb94	ldr x0,[x0]
009ccb98	adrp x1,0x2d7000
009ccb9c	add x1,x1,#0xa7b
009ccba0	mov w2,#0x21
009ccba4	add x29,sp,#0x10
009ccba8	bl 0x00c32310
009ccbac	str xzr,[x19]
009ccbb0	ldp x29,x30,[sp, #0x10]
009ccbb4	ldr x19,[sp], #0x20
009ccbb8	ret
