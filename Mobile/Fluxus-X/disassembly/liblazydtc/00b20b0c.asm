; ossl_prov_cache_exported_algorithms @ 00b20b0c
00b20b0c	ldr x8,[x1]
00b20b10	cbz x8,0x00b20b18
00b20b14	ret
00b20b18	str x21,[sp, #-0x30]!
00b20b1c	stp x20,x19,[sp, #0x10]
00b20b20	stp x29,x30,[sp, #0x20]
00b20b24	ldr x8,[x0]
00b20b28	mov x19,x1
00b20b2c	mov x20,x0
00b20b30	add x29,sp,#0x20
00b20b34	cbz x8,0x00b20b78
00b20b38	mov w21,wzr
00b20b3c	ldr x8,[x20, #0x20]
00b20b40	cbz x8,0x00b20b4c
00b20b44	blr x8
00b20b48	cbz w0,0x00b20b6c
00b20b4c	ldr q0,[x20, #0x10]
00b20b50	sxtw x8,w21
00b20b54	add x8,x19,x8, LSL #0x5
00b20b58	add w9,w21,#0x1
00b20b5c	str q0,[x8, #0x10]
00b20b60	ldr q0,[x20]
00b20b64	mov w21,w9
00b20b68	str q0,[x8]
00b20b6c	ldr x8,[x20, #0x28]!
00b20b70	cbnz x8,0x00b20b3c
00b20b74	b 0x00b20b7c
00b20b78	mov w21,wzr
00b20b7c	ldr q0,[x20, #0x10]
00b20b80	sxtw x8,w21
00b20b84	add x8,x19,x8, LSL #0x5
00b20b88	str q0,[x8, #0x10]
00b20b8c	ldr q0,[x20]
00b20b90	str q0,[x8]
00b20b94	ldp x29,x30,[sp, #0x20]
00b20b98	ldp x20,x19,[sp, #0x10]
00b20b9c	ldr x21,[sp], #0x30
00b20ba0	ret
