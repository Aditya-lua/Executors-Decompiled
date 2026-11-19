; FUN_008b8a8c @ 008b8a8c
008b8a8c	stp x29,x30,[sp, #-0x50]!
008b8a90	str x25,[sp, #0x10]
008b8a94	stp x24,x23,[sp, #0x20]
008b8a98	stp x22,x21,[sp, #0x30]
008b8a9c	stp x20,x19,[sp, #0x40]
008b8aa0	mov x29,sp
008b8aa4	and x24,x3,#0xff
008b8aa8	adrp x8,0xd1f000
008b8aac	add x8,x8,#0x638
008b8ab0	ldr w25,[x8, x24, LSL #0x2]
008b8ab4	ldr x8,[x0, #0x60]
008b8ab8	mov x23,x0
008b8abc	mov w9,#0x3fe8
008b8ac0	mov w10,#0x7fe8
008b8ac4	mov x20,x2
008b8ac8	cmp w25,#0x200
008b8acc	ldp x11,x0,[x8, #0x48]
008b8ad0	csel w21,w10,w9,gt
008b8ad4	mov x19,x1
008b8ad8	mov x1,xzr
008b8adc	mov x2,xzr
008b8ae0	mov x3,x21
008b8ae4	mov w22,w4
008b8ae8	blr x11
008b8aec	cbz x0,0x008b8b70
008b8af0	tst w22,#0x1
008b8af4	mov w8,#0x8
008b8af8	sub x10,x21,#0x40
008b8afc	csel w8,w8,wzr,ne
008b8b00	movi v0.2D,#0x0
008b8b04	str xzr,[x0, #0x28]
008b8b08	add w8,w25,w8
008b8b0c	sxtw x9,w8
008b8b10	stp w21,w8,[x0, #0x20]
008b8b14	udiv x9,x10,x9
008b8b18	adrp x10,0xd1f000
008b8b1c	sub w9,w9,#0x1
008b8b20	mul w8,w9,w8
008b8b24	ldrb w9,[x10, #0x618]
008b8b28	stp q0,q0,[x0]
008b8b2c	cmp w9,#0x1
008b8b30	stp w8,wzr,[x0, #0x30]
008b8b34	b.ne 0x008b8b3c
008b8b38	str wzr,[x0, #0x38]
008b8b3c	cbz x20,0x008b8b54
008b8b40	ldr x8,[x20]
008b8b44	str x8,[x0, #0x8]
008b8b48	cbz x8,0x008b8b50
008b8b4c	str x0,[x8]
008b8b50	str x0,[x20]
008b8b54	str x0,[x19, x24, LSL #0x3]
008b8b58	ldp x20,x19,[sp, #0x40]
008b8b5c	ldr x25,[sp, #0x10]
008b8b60	ldp x22,x21,[sp, #0x30]
008b8b64	ldp x24,x23,[sp, #0x20]
008b8b68	ldp x29,x30,[sp], #0x50
008b8b6c	ret
008b8b70	mov x0,x23
008b8b74	mov w1,#0x4
008b8b78	bl 0x008b3f9c
