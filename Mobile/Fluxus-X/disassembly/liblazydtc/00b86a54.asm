; psa_allocate_buffer_to_slot @ 00b86a54
00b86a54	stp x20,x19,[sp, #-0x20]!
00b86a58	stp x29,x30,[sp, #0x10]
00b86a5c	add x29,sp,#0x10
00b86a60	ldr x8,[x0, #0x28]
00b86a64	mov x19,x0
00b86a68	mov x20,x1
00b86a6c	cbz x8,0x00b86a78
00b86a70	mov w0,#0xffffff75
00b86a74	b 0x00b86a9c
00b86a78	mov w0,#0x1
00b86a7c	mov x1,x20
00b86a80	bl 0x00c30a30
00b86a84	str x0,[x19, #0x28]
00b86a88	cbz x0,0x00b86a98
00b86a8c	mov w0,wzr
00b86a90	str x20,[x19, #0x30]
00b86a94	b 0x00b86a9c
00b86a98	mov w0,#0xffffff73
00b86a9c	ldp x29,x30,[sp, #0x10]
00b86aa0	ldp x20,x19,[sp], #0x20
00b86aa4	ret
