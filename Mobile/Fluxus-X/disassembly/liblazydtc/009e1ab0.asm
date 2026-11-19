; dtls_get_message_body @ 009e1ab0
009e1ab0	stp x22,x21,[sp, #-0x30]!
009e1ab4	stp x20,x19,[sp, #0x10]
009e1ab8	stp x29,x30,[sp, #0x20]
009e1abc	ldr w8,[x0, #0x2d8]
009e1ac0	mov x19,x0
009e1ac4	mov x20,x1
009e1ac8	add x29,sp,#0x20
009e1acc	cmp w8,#0x101
009e1ad0	b.eq 0x009e1b4c
009e1ad4	ldr x8,[x19, #0x88]
009e1ad8	ldr x22,[x19, #0x98]
009e1adc	ldr x21,[x8, #0x8]
009e1ae0	ldrb w8,[x21]
009e1ae4	cmp w8,#0x14
009e1ae8	b.ne 0x009e1af8
009e1aec	mov x0,x19
009e1af0	bl 0x00c37250
009e1af4	cbz w0,0x009e1b58
009e1af8	ldr w8,[x19]
009e1afc	add x9,x22,#0xc
009e1b00	add x10,x21,#0xc
009e1b04	mov x0,x19
009e1b08	cmp w8,#0x100
009e1b0c	csel x1,x10,x21,eq
009e1b10	csel x2,x22,x9,eq
009e1b14	bl 0x00c345b0
009e1b18	cbz w0,0x009e1b58
009e1b1c	ldr x8,[x19, #0x4c0]
009e1b20	cbz x8,0x009e1b4c
009e1b24	ldr x9,[x19, #0x88]
009e1b28	ldr x10,[x19, #0x98]
009e1b2c	ldr w1,[x19]
009e1b30	ldr x6,[x19, #0x4c8]
009e1b34	ldr x3,[x9, #0x8]
009e1b38	add x4,x10,#0xc
009e1b3c	mov w2,#0x16
009e1b40	mov w0,wzr
009e1b44	mov x5,x19
009e1b48	blr x8
009e1b4c	ldr x8,[x19, #0x98]
009e1b50	mov w0,#0x1
009e1b54	str x8,[x20]
009e1b58	ldp x29,x30,[sp, #0x20]
009e1b5c	ldp x20,x19,[sp, #0x10]
009e1b60	ldp x22,x21,[sp], #0x30
009e1b64	ret
