; FUN_008e3ca4 @ 008e3ca4
008e3ca4	stp x30,x21,[sp, #-0x20]!
008e3ca8	stp x20,x19,[sp, #0x10]
008e3cac	mov x19,x0
008e3cb0	ldr x0,[x0, #0x18]
008e3cb4	cbz x0,0x008e3d0c
008e3cb8	mov x20,xzr
008e3cbc	ldr x8,[x0]
008e3cc0	ldr x8,[x8, #0x10]
008e3cc4	blr x8
008e3cc8	cmp x20,w0, UXTW 
008e3ccc	b.cs 0x008e3d0c
008e3cd0	ldr x0,[x19, #0x18]
008e3cd4	mov w1,w20
008e3cd8	ldr x8,[x0]
008e3cdc	ldr x8,[x8, #0x38]
008e3ce0	blr x8
008e3ce4	mov x21,x0
008e3ce8	mov x0,x19
008e3cec	mov x1,x21
008e3cf0	bl 0x008e4084
008e3cf4	ldr x1,[x21, #0x28]
008e3cf8	mov x0,x19
008e3cfc	bl 0x008e487c
008e3d00	ldr x0,[x19, #0x18]
008e3d04	add x20,x20,#0x1
008e3d08	b 0x008e3cbc
008e3d0c	ldp x20,x19,[sp, #0x10]
008e3d10	ldp x30,x21,[sp], #0x20
008e3d14	ret
