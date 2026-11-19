; std::__ndk1::promise<cpr::Response>::set_exception @ 008f6d60
008f6d60	sub sp,sp,#0x30
008f6d64	stp x20,x19,[sp, #0x10]
008f6d68	stp x29,x30,[sp, #0x20]
008f6d6c	add x29,sp,#0x20
008f6d70	mrs x20,tpidr_el0
008f6d74	ldr x8,[x20, #0x28]
008f6d78	str x8,[sp, #0x8]
008f6d7c	ldr x19,[x0]
008f6d80	cbz x19,0x008f6dc0
008f6d84	mov x0,sp
008f6d88	bl 0x00c31440
008f6d8c	mov x1,sp
008f6d90	mov x0,x19
008f6d94	bl 0x00c315d0
008f6d98	mov x0,sp
008f6d9c	bl 0x00c31450
008f6da0	ldr x8,[x20, #0x28]
008f6da4	ldr x9,[sp, #0x8]
008f6da8	cmp x8,x9
008f6dac	b.ne 0x008f6df8
008f6db0	ldp x29,x30,[sp, #0x20]
008f6db4	ldp x20,x19,[sp, #0x10]
008f6db8	add sp,sp,#0x30
008f6dbc	ret
008f6dc0	mov w0,#0x20
008f6dc4	bl 0x00c30000
008f6dc8	mov x19,x0
008f6dcc	bl 0x00c315c0
008f6dd0	mov x2,x0
008f6dd4	orr w1,wzr,#0x3
008f6dd8	mov x0,x19
008f6ddc	bl 0x00c314d0
008f6de0	adrp x1,0xcb4000
008f6de4	adrp x2,0xcb4000
008f6de8	ldr x1,[x1, #0xd20]
008f6dec	ldr x2,[x2, #0xd08]
008f6df0	mov x0,x19
008f6df4	bl 0x00c30020
008f6df8	bl 0x00c2fec0
