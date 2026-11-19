; ossl_ffc_validate_public_key @ 00a7ce18
00a7ce18	str x23,[sp, #-0x40]!
00a7ce1c	stp x22,x21,[sp, #0x10]
00a7ce20	stp x20,x19,[sp, #0x20]
00a7ce24	stp x29,x30,[sp, #0x30]
00a7ce28	add x29,sp,#0x30
00a7ce2c	mov x20,x2
00a7ce30	mov x21,x1
00a7ce34	mov x22,x0
00a7ce38	bl 0x00a7cd0c
00a7ce3c	cbz w0,0x00a7ceb0
00a7ce40	ldr w8,[x20]
00a7ce44	cbz w8,0x00a7ce50
00a7ce48	mov w20,#0x1
00a7ce4c	b 0x00a7ceb4
00a7ce50	ldr x8,[x22, #0x8]
00a7ce54	cbz x8,0x00a7ce48
00a7ce58	mov x0,xzr
00a7ce5c	bl 0x00c38a60
00a7ce60	cbz x0,0x00a7ceb0
00a7ce64	mov x19,x0
00a7ce68	bl 0x00c38a90
00a7ce6c	mov x0,x19
00a7ce70	bl 0x00c38a40
00a7ce74	cbz x0,0x00a7cecc
00a7ce78	ldp x3,x2,[x22]
00a7ce7c	mov x1,x21
00a7ce80	mov x4,x19
00a7ce84	mov x23,x0
00a7ce88	bl 0x00c38ad0
00a7ce8c	cbz w0,0x00a7cecc
00a7ce90	mov x0,x23
00a7ce94	bl 0x00c38d20
00a7ce98	cbnz w0,0x00a7cea8
00a7ce9c	ldr w8,[x20]
00a7cea0	orr w8,w8,#0x4
00a7cea4	str w8,[x20]
00a7cea8	mov w20,#0x1
00a7ceac	b 0x00a7ced0
00a7ceb0	mov w20,wzr
00a7ceb4	mov w0,w20
00a7ceb8	ldp x29,x30,[sp, #0x30]
00a7cebc	ldp x20,x19,[sp, #0x20]
00a7cec0	ldp x22,x21,[sp, #0x10]
00a7cec4	ldr x23,[sp], #0x40
00a7cec8	ret
00a7cecc	mov w20,wzr
00a7ced0	mov x0,x19
00a7ced4	bl 0x00c38a20
00a7ced8	mov x0,x19
00a7cedc	bl 0x00c38a30
00a7cee0	b 0x00a7ceb4
