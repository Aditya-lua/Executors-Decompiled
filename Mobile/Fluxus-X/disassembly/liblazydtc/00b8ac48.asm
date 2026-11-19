; psa_cipher_abort @ 00b8ac48
00b8ac48	str x19,[sp, #-0x20]!
00b8ac4c	stp x29,x30,[sp, #0x10]
00b8ac50	add x29,sp,#0x10
00b8ac54	ldr w8,[x0]
00b8ac58	mov x19,x0
00b8ac5c	cbz w8,0x00b8ac80
00b8ac60	cmp w8,#0x1
00b8ac64	b.ne 0x00b8ac70
00b8ac68	add x0,x19,#0x8
00b8ac6c	bl 0x00c42e70
00b8ac70	ldrb w8,[x19, #0x4]
00b8ac74	str wzr,[x19]
00b8ac78	and w8,w8,#0xfc
00b8ac7c	strb w8,[x19, #0x4]
00b8ac80	ldp x29,x30,[sp, #0x10]
00b8ac84	mov w0,wzr
00b8ac88	ldr x19,[sp], #0x20
00b8ac8c	ret
