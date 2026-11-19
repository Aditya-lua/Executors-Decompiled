; std::__ndk1::packaged_task<cpr::Response()>::operator() @ 008f6b8c
008f6b8c	sub sp,sp,#0x160
008f6b90	str x28,[sp, #0x120]
008f6b94	stp x22,x21,[sp, #0x130]
008f6b98	stp x20,x19,[sp, #0x140]
008f6b9c	stp x29,x30,[sp, #0x150]
008f6ba0	add x29,sp,#0x150
008f6ba4	mrs x21,tpidr_el0
008f6ba8	ldr x8,[x21, #0x28]
008f6bac	mov x19,x0
008f6bb0	mov x20,x0
008f6bb4	stur x8,[x29, #-0x38]
008f6bb8	ldr x8,[x19, #0x30]!
008f6bbc	cbz x8,0x008f6c54
008f6bc0	ldrb w9,[x8, #0x70]
008f6bc4	tbnz w9,#0x0,0x008f6c30
008f6bc8	str xzr,[sp, #0x8]
008f6bcc	ldr x22,[x8, #0x10]
008f6bd0	add x0,sp,#0x8
008f6bd4	bl 0x00c31450
008f6bd8	cbnz x22,0x008f6c30
008f6bdc	ldr x0,[x20, #0x20]
008f6be0	ldr x8,[x0]
008f6be4	ldr x9,[x8, #0x28]
008f6be8	add x8,sp,#0x8
008f6bec	blr x9
008f6bf0	ldr x0,[x19]
008f6bf4	cbz x0,0x008f6c90
008f6bf8	add x1,sp,#0x8
008f6bfc	bl 0x00c314f0
008f6c00	add x0,sp,#0x8
008f6c04	bl 0x008247c0
008f6c08	ldr x8,[x21, #0x28]
008f6c0c	ldur x9,[x29, #-0x38]
008f6c10	cmp x8,x9
008f6c14	b.ne 0x008f6c8c
008f6c18	ldp x29,x30,[sp, #0x150]
008f6c1c	ldp x20,x19,[sp, #0x140]
008f6c20	ldp x22,x21,[sp, #0x130]
008f6c24	ldr x28,[sp, #0x120]
008f6c28	add sp,sp,#0x160
008f6c2c	ret
008f6c30	mov w0,#0x20
008f6c34	bl 0x00c30000
008f6c38	mov x20,x0
008f6c3c	bl 0x00c315c0
008f6c40	mov x2,x0
008f6c44	mov w1,#0x2
008f6c48	mov x0,x20
008f6c4c	bl 0x00c314d0
008f6c50	b 0x008f6c74
008f6c54	mov w0,#0x20
008f6c58	bl 0x00c30000
008f6c5c	mov x20,x0
008f6c60	bl 0x00c315c0
008f6c64	mov x2,x0
008f6c68	orr w1,wzr,#0x3
008f6c6c	mov x0,x20
008f6c70	bl 0x00c314d0
008f6c74	adrp x1,0xcb4000
008f6c78	adrp x2,0xcb4000
008f6c7c	ldr x1,[x1, #0xd20]
008f6c80	ldr x2,[x2, #0xd08]
008f6c84	mov x0,x20
008f6c88	bl 0x00c30020
008f6c8c	bl 0x00c2fec0
008f6c90	mov w0,#0x20
008f6c94	mov x20,x21
008f6c98	bl 0x00c30000
008f6c9c	mov x22,x0
008f6ca0	bl 0x00c315c0
008f6ca4	mov x2,x0
008f6ca8	orr w1,wzr,#0x3
008f6cac	mov x0,x22
008f6cb0	bl 0x00c314d0
008f6cb4	adrp x1,0xcb4000
008f6cb8	adrp x2,0xcb4000
008f6cbc	ldr x1,[x1, #0xd20]
008f6cc0	ldr x2,[x2, #0xd08]
008f6cc4	mov x0,x22
008f6cc8	mov x21,x20
008f6ccc	bl 0x00c30020
