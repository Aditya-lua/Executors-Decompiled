; SSL_set_bio @ 009b3a80
009b3a80	stp x22,x21,[sp, #-0x30]!
009b3a84	stp x20,x19,[sp, #0x10]
009b3a88	stp x29,x30,[sp, #0x20]
009b3a8c	ldr x8,[x0, #0x10]
009b3a90	mov x19,x0
009b3a94	mov x21,x1
009b3a98	mov x20,x2
009b3a9c	cmp x8,x1
009b3aa0	add x29,sp,#0x20
009b3aa4	b.ne 0x009b3abc
009b3aa8	ldr x0,[x19, #0x20]
009b3aac	cbz x0,0x009b3b38
009b3ab0	bl 0x00c35620
009b3ab4	cmp x0,x20
009b3ab8	b.eq 0x009b3b8c
009b3abc	cbz x21,0x009b3ad0
009b3ac0	cmp x21,x20
009b3ac4	b.ne 0x009b3ad0
009b3ac8	mov x0,x21
009b3acc	bl 0x00c322d0
009b3ad0	ldr x9,[x19, #0x10]
009b3ad4	ldr x8,[x19, #0x20]
009b3ad8	cmp x9,x21
009b3adc	b.eq 0x009b3af8
009b3ae0	cbz x8,0x009b3b04
009b3ae4	mov x0,x8
009b3ae8	bl 0x00c35620
009b3aec	cmp x0,x20
009b3af0	b.ne 0x009b3b54
009b3af4	b 0x009b3b10
009b3af8	ldr x0,[x19, #0x18]
009b3afc	cbnz x8,0x009b3b68
009b3b00	b 0x009b3b70
009b3b04	ldr x0,[x19, #0x18]
009b3b08	cmp x0,x20
009b3b0c	b.ne 0x009b3b54
009b3b10	ldr x0,[x19, #0x20]
009b3b14	ldr x22,[x19, #0x10]
009b3b18	cbz x0,0x009b3b48
009b3b1c	bl 0x00c35620
009b3b20	cmp x22,x0
009b3b24	b.eq 0x009b3b54
009b3b28	ldr x0,[x19, #0x10]
009b3b2c	bl 0x00c355e0
009b3b30	str x21,[x19, #0x10]
009b3b34	b 0x009b3b8c
009b3b38	ldr x0,[x19, #0x18]
009b3b3c	cmp x0,x20
009b3b40	b.ne 0x009b3abc
009b3b44	b 0x009b3b8c
009b3b48	ldr x0,[x19, #0x18]
009b3b4c	cmp x22,x0
009b3b50	b.ne 0x009b3b28
009b3b54	ldr x0,[x19, #0x10]
009b3b58	bl 0x00c355e0
009b3b5c	ldp x0,x8,[x19, #0x18]
009b3b60	str x21,[x19, #0x10]
009b3b64	cbz x8,0x009b3b70
009b3b68	bl 0x00c35630
009b3b6c	str x0,[x19, #0x18]
009b3b70	bl 0x00c355e0
009b3b74	ldr x0,[x19, #0x20]
009b3b78	str x20,[x19, #0x18]
009b3b7c	cbz x0,0x009b3b8c
009b3b80	mov x1,x20
009b3b84	bl 0x00c35640
009b3b88	str x0,[x19, #0x18]
009b3b8c	ldp x29,x30,[sp, #0x20]
009b3b90	ldp x20,x19,[sp, #0x10]
009b3b94	ldp x22,x21,[sp], #0x30
009b3b98	ret
