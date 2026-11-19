; FUN_009baa7c @ 009baa7c
009baa7c	stp x22,x21,[sp, #-0x30]!
009baa80	stp x20,x19,[sp, #0x10]
009baa84	stp x29,x30,[sp, #0x20]
009baa88	ldr x8,[x0, #0x18]
009baa8c	mov x19,x1
009baa90	add x29,sp,#0x20
009baa94	cbz x8,0x009baabc
009baa98	ldr x22,[x8, #0x158]
009baa9c	ldr x20,[x8]
009baaa0	ldr x21,[x8, #0x440]
009baaa4	ldr x0,[x22, #0x1c8]
009baaa8	cbnz x0,0x009baae0
009baaac	bl 0x00c35030
009baab0	str x0,[x22, #0x1c8]
009baab4	cbnz x0,0x009baae0
009baab8	b 0x009baafc
009baabc	ldr x9,[x0, #0x20]
009baac0	cbz x9,0x009baaf8
009baac4	ldr x8,[x9, #0x9a8]
009baac8	ldr x22,[x9, #0x898]
009baacc	cbnz x8,0x009baa9c
009baad0	mov x20,xzr
009baad4	mov x21,xzr
009baad8	ldr x0,[x22, #0x1c8]
009baadc	cbz x0,0x009baaac
009baae0	cbz x19,0x009baaf8
009baae4	mov x1,x19
009baae8	mov x2,x20
009baaec	mov x3,x21
009baaf0	bl 0x00c35b60
009baaf4	cbz w0,0x009baafc
009baaf8	mov w0,#0x1
009baafc	ldp x29,x30,[sp, #0x20]
009bab00	ldp x20,x19,[sp, #0x10]
009bab04	ldp x22,x21,[sp], #0x30
009bab08	ret
