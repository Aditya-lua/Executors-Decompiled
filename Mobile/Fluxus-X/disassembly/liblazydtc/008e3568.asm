; FUN_008e3568 @ 008e3568
008e3568	stp x30,x21,[sp, #-0x20]!
008e356c	stp x20,x19,[sp, #0x10]
008e3570	adrp x8,0xd1f000
008e3574	add x8,x8,#0xec8
008e3578	mov x19,x2
008e357c	mov x21,x1
008e3580	mov x20,x0
008e3584	ldr x8,[x8]
008e3588	cbz x8,0x008e35a8
008e358c	ldr x9,[x8]
008e3590	mov x0,x8
008e3594	mov x1,x20
008e3598	mov x2,x21
008e359c	ldr x9,[x9, #0x10]
008e35a0	mov x3,x19
008e35a4	blr x9
008e35a8	ldr x8,[x20, #0x28]
008e35ac	cbnz x8,0x008e35c0
008e35b0	mov x0,x21
008e35b4	mov x1,x19
008e35b8	bl 0x008e4884
008e35bc	str x0,[x20, #0x28]
008e35c0	ldp x20,x19,[sp, #0x10]
008e35c4	mov w0,#0x1
008e35c8	ldp x30,x21,[sp], #0x20
008e35cc	ret
