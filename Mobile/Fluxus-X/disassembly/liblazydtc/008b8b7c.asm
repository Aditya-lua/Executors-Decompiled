; FUN_008b8b7c @ 008b8b7c
008b8b7c	stp x29,x30,[sp, #-0x30]!
008b8b80	stp x22,x21,[sp, #0x10]
008b8b84	stp x20,x19,[sp, #0x20]
008b8b88	mov x29,sp
008b8b8c	and x21,x2,#0xff
008b8b90	adrp x8,0xd1f000
008b8b94	add x8,x8,#0x638
008b8b98	ldr w22,[x8, x21, LSL #0x2]
008b8b9c	ldr x8,[x0, #0x60]
008b8ba0	mov w9,#0x3fe8
008b8ba4	mov w10,#0x7fe8
008b8ba8	mov x19,x1
008b8bac	mov x1,xzr
008b8bb0	cmp w22,#0x200
008b8bb4	ldp x11,x0,[x8, #0x48]
008b8bb8	csel w20,w10,w9,gt
008b8bbc	mov x2,xzr
008b8bc0	mov x3,x20
008b8bc4	blr x11
008b8bc8	cbz x0,0x008b8c0c
008b8bcc	add w8,w22,#0x8
008b8bd0	sub x10,x20,#0x40
008b8bd4	movi v0.2D,#0x0
008b8bd8	sxtw x9,w8
008b8bdc	stp w20,w8,[x0, #0x20]
008b8be0	str xzr,[x0, #0x28]
008b8be4	udiv x9,x10,x9
008b8be8	adrp x10,0xd1f000
008b8bec	sub w9,w9,#0x1
008b8bf0	mul w8,w9,w8
008b8bf4	ldrb w9,[x10, #0x618]
008b8bf8	stp q0,q0,[x0]
008b8bfc	cmp w9,#0x1
008b8c00	stp w8,wzr,[x0, #0x30]
008b8c04	b.ne 0x008b8c0c
008b8c08	str wzr,[x0, #0x38]
008b8c0c	str x0,[x19, x21, LSL #0x3]
008b8c10	ldp x20,x19,[sp, #0x20]
008b8c14	ldp x22,x21,[sp, #0x10]
008b8c18	ldp x29,x30,[sp], #0x30
008b8c1c	ret
