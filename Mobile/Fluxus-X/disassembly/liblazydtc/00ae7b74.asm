; SRP_VBASE_get_by_user @ 00ae7b74
00ae7b74	stp x22,x21,[sp, #-0x30]!
00ae7b78	stp x20,x19,[sp, #0x10]
00ae7b7c	stp x29,x30,[sp, #0x20]
00ae7b80	add x29,sp,#0x20
00ae7b84	cbz x0,0x00ae7bd8
00ae7b88	mov x20,x0
00ae7b8c	ldr x0,[x0]
00ae7b90	mov x19,x1
00ae7b94	bl 0x00c325e0
00ae7b98	cmp w0,#0x1
00ae7b9c	b.lt 0x00ae7bd8
00ae7ba0	mov w21,wzr
00ae7ba4	ldr x0,[x20]
00ae7ba8	mov w1,w21
00ae7bac	bl 0x00c32610
00ae7bb0	mov x22,x0
00ae7bb4	ldr x0,[x0]
00ae7bb8	mov x1,x19
00ae7bbc	bl 0x00c301f0
00ae7bc0	cbz w0,0x00ae7bdc
00ae7bc4	ldr x0,[x20]
00ae7bc8	add w21,w21,#0x1
00ae7bcc	bl 0x00c325e0
00ae7bd0	cmp w21,w0
00ae7bd4	b.lt 0x00ae7ba4
00ae7bd8	mov x22,xzr
00ae7bdc	ldp x29,x30,[sp, #0x20]
00ae7be0	ldp x20,x19,[sp, #0x10]
00ae7be4	mov x0,x22
00ae7be8	ldp x22,x21,[sp], #0x30
00ae7bec	ret
