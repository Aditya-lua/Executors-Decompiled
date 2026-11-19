; ASYNC_WAIT_CTX_clear_fd @ 009f9b58
009f9b58	str x19,[sp, #-0x20]!
009f9b5c	stp x29,x30,[sp, #0x10]
009f9b60	ldr x8,[x0]
009f9b64	add x29,sp,#0x10
009f9b68	cbz x8,0x009f9c00
009f9b6c	mov x19,x0
009f9b70	mov x9,xzr
009f9b74	mov x10,x8
009f9b78	mov x0,x10
009f9b7c	ldr w10,[x10, #0x24]
009f9b80	cmp w10,#0x1
009f9b84	b.eq 0x009f9b94
009f9b88	ldr x10,[x0]
009f9b8c	cmp x10,x1
009f9b90	b.eq 0x009f9ba8
009f9b94	ldr x10,[x0, #0x28]
009f9b98	mov x9,x0
009f9b9c	cbnz x10,0x009f9b78
009f9ba0	mov w8,wzr
009f9ba4	b 0x009f9c00
009f9ba8	ldr w10,[x0, #0x20]
009f9bac	cmp w10,#0x1
009f9bb0	b.ne 0x009f9bec
009f9bb4	ldr x10,[x0, #0x28]
009f9bb8	add x9,x9,#0x28
009f9bbc	cmp x8,x0
009f9bc0	adrp x1,0x2bb000
009f9bc4	csel x8,x19,x9,eq
009f9bc8	add x1,x1,#0x9b2
009f9bcc	mov w2,#0xa5
009f9bd0	str x10,[x8]
009f9bd4	bl 0x00c32310
009f9bd8	ldr x8,[x19, #0x8]
009f9bdc	sub x8,x8,#0x1
009f9be0	str x8,[x19, #0x8]
009f9be4	mov w8,#0x1
009f9be8	b 0x009f9c00
009f9bec	mov w8,#0x1
009f9bf0	str w8,[x0, #0x24]
009f9bf4	ldr x9,[x19, #0x10]
009f9bf8	add x9,x9,#0x1
009f9bfc	str x9,[x19, #0x10]
009f9c00	ldp x29,x30,[sp, #0x10]
009f9c04	mov w0,w8
009f9c08	ldr x19,[sp], #0x20
009f9c0c	ret
