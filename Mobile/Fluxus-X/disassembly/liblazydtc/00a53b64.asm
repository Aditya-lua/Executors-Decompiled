; engine_pkey_meths_free @ 00a53b64
00a53b64	ldr x8,[x0, #0x48]
00a53b68	cbz x8,0x00a53be8
00a53b6c	sub sp,sp,#0x40
00a53b70	add x2,sp,#0x8
00a53b74	mov x1,xzr
00a53b78	mov w3,wzr
00a53b7c	str x21,[sp, #0x10]
00a53b80	stp x20,x19,[sp, #0x20]
00a53b84	stp x29,x30,[sp, #0x30]
00a53b88	add x29,sp,#0x30
00a53b8c	mov x19,x0
00a53b90	blr x8
00a53b94	cmp w0,#0x1
00a53b98	b.lt 0x00a53bd8
00a53b9c	mov x20,xzr
00a53ba0	mov w21,w0
00a53ba4	ldr x8,[sp, #0x8]
00a53ba8	ldr x9,[x19, #0x48]
00a53bac	add x1,sp,#0x18
00a53bb0	mov x0,x19
00a53bb4	ldr w3,[x8, x20, LSL #0x2]
00a53bb8	mov x2,xzr
00a53bbc	blr x9
00a53bc0	cbz w0,0x00a53bcc
00a53bc4	ldr x0,[sp, #0x18]
00a53bc8	bl 0x00c3bd80
00a53bcc	add x20,x20,#0x1
00a53bd0	cmp x21,x20
00a53bd4	b.ne 0x00a53ba4
00a53bd8	ldp x29,x30,[sp, #0x30]
00a53bdc	ldp x20,x19,[sp, #0x20]
00a53be0	ldr x21,[sp, #0x10]
00a53be4	add sp,sp,#0x40
00a53be8	ret
