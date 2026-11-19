; FUN_008b7a9c @ 008b7a9c
008b7a9c	stp x29,x30,[sp, #-0x40]!
008b7aa0	str x23,[sp, #0x10]
008b7aa4	stp x22,x21,[sp, #0x20]
008b7aa8	stp x20,x19,[sp, #0x30]
008b7aac	mov x29,sp
008b7ab0	ldr x23,[x0, #0x60]
008b7ab4	mov w20,w3
008b7ab8	mov x19,x2
008b7abc	ldr x8,[x23, #0x650]
008b7ac0	cbnz x8,0x008b7bbc
008b7ac4	sub x8,x19,#0x1
008b7ac8	cmp x8,#0x3ff
008b7acc	b.hi 0x008b7b50
008b7ad0	adrp x8,0xd1f000
008b7ad4	add x8,x8,#0x638
008b7ad8	add x8,x8,x19
008b7adc	ldrsb w8,[x8, #0xa0]
008b7ae0	tbnz w8,#0x1f,0x008b7b50
008b7ae4	mov x11,x1
008b7ae8	adrp x9,0xd1f000
008b7aec	ldr x10,[x0, #0x60]
008b7af0	ldr x1,[x11, #-0x8]!
008b7af4	ldrb w9,[x9, #0x618]
008b7af8	ldr x12,[x1, #0x28]
008b7afc	cbnz x12,0x008b7b20
008b7b00	ldr w13,[x1, #0x30]
008b7b04	tbz w13,#0x1f,0x008b7b20
008b7b08	add x13,x10,#0x70
008b7b0c	ldr x14,[x13, w8, UXTW #0x3]
008b7b10	str x14,[x1, #0x18]
008b7b14	cbz x14,0x008b7b1c
008b7b18	str x1,[x14, #0x10]
008b7b1c	str x1,[x13, w8, UXTW #0x3]
008b7b20	ldr w13,[x1, #0x34]
008b7b24	str x12,[x11]
008b7b28	str x11,[x1, #0x28]
008b7b2c	subs w11,w13,#0x1
008b7b30	str w11,[x1, #0x34]
008b7b34	b.ne 0x008b7b60
008b7b38	ldp x12,x11,[x1, #0x10]
008b7b3c	cbz x11,0x008b7b44
008b7b40	str x12,[x11, #0x10]
008b7b44	cbz x12,0x008b7b90
008b7b48	str x11,[x12, #0x18]
008b7b4c	b 0x008b7ba4
008b7b50	ldp x8,x0,[x23, #0x48]
008b7b54	mov x2,x19
008b7b58	mov x3,xzr
008b7b5c	blr x8
008b7b60	add x8,x23,w20, UXTB  #0x3
008b7b64	ldr x9,[x23, #0x10]
008b7b68	ldr x10,[x8, #0x3848]
008b7b6c	sub x9,x9,x19
008b7b70	str x9,[x23, #0x10]
008b7b74	sub x9,x10,x19
008b7b78	str x9,[x8, #0x3848]
008b7b7c	ldp x20,x19,[sp, #0x30]
008b7b80	ldr x23,[sp, #0x10]
008b7b84	ldp x22,x21,[sp, #0x20]
008b7b88	ldp x29,x30,[sp], #0x40
008b7b8c	ret
008b7b90	add x10,x10,#0x70
008b7b94	ldr x12,[x10, w8, UXTW #0x3]
008b7b98	cmp x12,x1
008b7b9c	b.ne 0x008b7ba4
008b7ba0	str x11,[x10, w8, UXTW #0x3]
008b7ba4	ldr x8,[x0, #0x60]
008b7ba8	ldp x9,x0,[x8, #0x48]
008b7bac	ldrsw x2,[x1, #0x20]
008b7bb0	mov x3,xzr
008b7bb4	blr x9
008b7bb8	b 0x008b7b60
008b7bbc	mov x21,x0
008b7bc0	mov x22,x1
008b7bc4	blr x8
008b7bc8	mov x1,x22
008b7bcc	mov x0,x21
008b7bd0	b 0x008b7ac4
