; create_synthetic_message_hash @ 009e5bcc
009e5bcc	sub sp,sp,#0x80
009e5bd0	stp x22,x21,[sp, #0x50]
009e5bd4	stp x20,x19,[sp, #0x60]
009e5bd8	stp x29,x30,[sp, #0x70]
009e5bdc	add x29,sp,#0x70
009e5be0	mov x20,x4
009e5be4	mov x21,x3
009e5be8	mov x22,x1
009e5bec	mov x19,x0
009e5bf0	stur x2,[x29, #-0x28]
009e5bf4	str wzr,[sp, #0x4]
009e5bf8	cbz x1,0x009e5c7c
009e5bfc	mov x0,x19
009e5c00	bl 0x00c345d0
009e5c04	cbz w0,0x009e5ca8
009e5c08	ldur x8,[x29, #-0x28]
009e5c0c	orr w9,wzr,#0xfe
009e5c10	add x1,sp,#0x4
009e5c14	mov w2,#0x4
009e5c18	mov x0,x19
009e5c1c	strb w9,[sp, #0x4]
009e5c20	strb w8,[sp, #0x7]
009e5c24	bl 0x00c345b0
009e5c28	cbz w0,0x009e5ca8
009e5c2c	ldur x2,[x29, #-0x28]
009e5c30	mov x0,x19
009e5c34	mov x1,x22
009e5c38	bl 0x00c345b0
009e5c3c	cbz w0,0x009e5ca8
009e5c40	cbz x21,0x009e5c74
009e5c44	mov x0,x19
009e5c48	mov x1,x21
009e5c4c	mov x2,x20
009e5c50	bl 0x00c345b0
009e5c54	cbz w0,0x009e5ca8
009e5c58	ldr x8,[x19, #0x88]
009e5c5c	ldr x9,[x19, #0x2d0]
009e5c60	mov x0,x19
009e5c64	ldr x1,[x8, #0x8]
009e5c68	add x2,x9,#0x4
009e5c6c	bl 0x00c345b0
009e5c70	cbz w0,0x009e5ca8
009e5c74	mov w0,#0x1
009e5c78	b 0x009e5ca8
009e5c7c	mov x0,x19
009e5c80	stur xzr,[x29, #-0x28]
009e5c84	bl 0x00c345a0
009e5c88	cbz w0,0x009e5ca8
009e5c8c	add x1,sp,#0x8
009e5c90	mov w2,#0x40
009e5c94	sub x3,x29,#0x28
009e5c98	mov x0,x19
009e5c9c	add x22,sp,#0x8
009e5ca0	bl 0x00c35dc0
009e5ca4	cbnz w0,0x009e5bfc
009e5ca8	ldp x29,x30,[sp, #0x70]
009e5cac	ldp x20,x19,[sp, #0x60]
009e5cb0	ldp x22,x21,[sp, #0x50]
009e5cb4	add sp,sp,#0x80
009e5cb8	ret
