; SSL_add1_to_CA_list @ 009acf58
009acf58	stp x20,x19,[sp, #-0x20]!
009acf5c	stp x29,x30,[sp, #0x10]
009acf60	add x29,sp,#0x10
009acf64	cbz x1,0x009acfb8
009acf68	ldr x8,[x0, #0x9d0]
009acf6c	mov x20,x1
009acf70	mov x19,x0
009acf74	cbnz x8,0x009acf84
009acf78	bl 0x00c34780
009acf7c	str x0,[x19, #0x9d0]
009acf80	cbz x0,0x009acfbc
009acf84	mov x0,x20
009acf88	bl 0x00c32d20
009acf8c	bl 0x00c34f50
009acf90	cbz x0,0x009acfbc
009acf94	mov x20,x0
009acf98	ldr x0,[x19, #0x9d0]
009acf9c	mov x1,x20
009acfa0	bl 0x00c347a0
009acfa4	cbz w0,0x009acfb0
009acfa8	mov w0,#0x1
009acfac	b 0x009acfbc
009acfb0	mov x0,x20
009acfb4	bl 0x00c34810
009acfb8	mov w0,wzr
009acfbc	ldp x29,x30,[sp, #0x10]
009acfc0	ldp x20,x19,[sp], #0x20
009acfc4	ret
