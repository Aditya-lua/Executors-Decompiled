; DTLS_get_data_mtu @ 009a7a4c
009a7a4c	sub sp,sp,#0x40
009a7a50	stp x20,x19,[sp, #0x20]
009a7a54	stp x29,x30,[sp, #0x30]
009a7a58	add x29,sp,#0x30
009a7a5c	mov x19,x0
009a7a60	bl 0x00c32900
009a7a64	cbz x0,0x009a7aec
009a7a68	ldr x8,[x19, #0x4b8]
009a7a6c	add x1,sp,#0x18
009a7a70	add x2,sp,#0x10
009a7a74	add x3,sp,#0x8
009a7a78	ldr x20,[x8, #0x130]
009a7a7c	mov x4,sp
009a7a80	bl 0x00c344b0
009a7a84	cbz w0,0x009a7aa8
009a7a88	ldrb w8,[x19, #0xa9]
009a7a8c	ldr x9,[sp, #0x18]
009a7a90	tbnz w8,#0x0,0x009a7ab0
009a7a94	ldr x10,[sp, #0x10]
009a7a98	ldr x8,[sp]
009a7a9c	add x9,x10,x9
009a7aa0	str x9,[sp, #0x10]
009a7aa4	b 0x009a7abc
009a7aa8	mov x0,xzr
009a7aac	b 0x009a7aec
009a7ab0	ldr x8,[sp]
009a7ab4	add x8,x8,x9
009a7ab8	str x8,[sp]
009a7abc	add x8,x8,#0xd
009a7ac0	subs x8,x20,x8
009a7ac4	mov x0,xzr
009a7ac8	b.ls 0x009a7aec
009a7acc	ldr x9,[sp, #0x8]
009a7ad0	cbz x9,0x009a7adc
009a7ad4	udiv x8,x8,x9
009a7ad8	mul x8,x8,x9
009a7adc	ldr x9,[sp, #0x10]
009a7ae0	cmp x8,x9
009a7ae4	csel x8,x8,x9,hi
009a7ae8	sub x0,x8,x9
009a7aec	ldp x29,x30,[sp, #0x30]
009a7af0	ldp x20,x19,[sp, #0x20]
009a7af4	add sp,sp,#0x40
009a7af8	ret
