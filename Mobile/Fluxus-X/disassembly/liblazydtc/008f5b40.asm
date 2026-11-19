; std::__ndk1::future<cpr::Response>::future @ 008f5b40
008f5b40	stp x20,x19,[sp, #-0x20]!
008f5b44	stp x29,x30,[sp, #0x10]
008f5b48	add x29,sp,#0x10
008f5b4c	str x1,[x0]
008f5b50	ldrb w8,[x1, #0x70]
008f5b54	tbnz w8,#0x1,0x008f5b98
008f5b58	add x8,x1,#0x8
008f5b5c	ldxr x9,[x8]
008f5b60	add x9,x9,#0x1
008f5b64	stxr w10,x9,[x8]
008f5b68	cbnz w10,0x008f5b5c
008f5b6c	ldr x20,[x0]
008f5b70	add x19,x20,#0x18
008f5b74	mov x0,x19
008f5b78	bl 0x00c2ff10
008f5b7c	ldr w8,[x20, #0x70]
008f5b80	mov x0,x19
008f5b84	orr w8,w8,#0x2
008f5b88	str w8,[x20, #0x70]
008f5b8c	ldp x29,x30,[sp, #0x10]
008f5b90	ldp x20,x19,[sp], #0x20
008f5b94	b 0x00c2ff20
008f5b98	mov w0,#0x20
008f5b9c	bl 0x00c30000
008f5ba0	mov x19,x0
008f5ba4	bl 0x00c315c0
008f5ba8	mov x2,x0
008f5bac	mov w1,#0x1
008f5bb0	mov x0,x19
008f5bb4	bl 0x00c314d0
008f5bb8	adrp x1,0xcb4000
008f5bbc	adrp x2,0xcb4000
008f5bc0	ldr x1,[x1, #0xd20]
008f5bc4	ldr x2,[x2, #0xd08]
008f5bc8	mov x0,x19
008f5bcc	bl 0x00c30020
