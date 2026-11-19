; ossl_prov_bio_from_dispatch @ 00b1fa58
00b1fa58	adrp x9,0x77b000
00b1fa5c	add x8,x0,#0x8
00b1fa60	add x9,x9,#0xbe8
00b1fa64	adrp x10,0xd23000
00b1fa68	adrp x11,0xd23000
00b1fa6c	adrp x12,0xd23000
00b1fa70	adrp x13,0xd23000
00b1fa74	adrp x14,0xd23000
00b1fa78	adrp x15,0xd23000
00b1fa7c	adrp x16,0xd23000
00b1fa80	adrp x17,0xd23000
00b1fa84	adrp x18,0xd23000
00b1fa88	adrp x0,0xd23000
00b1fa8c	b 0x00b1fa94
00b1fa90	add x8,x8,#0x10
00b1fa94	ldur w1,[x8, #-0x8]
00b1fa98	cmp w1,#0x32
00b1fa9c	b.hi 0x00b1fa90
00b1faa0	ldrsw x1,[x9, x1, LSL #0x2]
00b1faa4	add x1,x1,x9
00b1faa8	br x1
00b1faac	ldr x1,[x10, #0x7b8]
00b1fab0	cbnz x1,0x00b1fa90
00b1fab4	ldr x1,[x8], #0x10
00b1fab8	str x1,[x10, #0x7b8]
00b1fabc	b 0x00b1fa94
00b1fac0	ldr x1,[x11, #0x7c0]
00b1fac4	cbnz x1,0x00b1fa90
00b1fac8	ldr x1,[x8], #0x10
00b1facc	str x1,[x11, #0x7c0]
00b1fad0	b 0x00b1fa94
00b1fad4	ldr x1,[x12, #0x7c8]
00b1fad8	cbnz x1,0x00b1fa90
00b1fadc	ldr x1,[x8], #0x10
00b1fae0	str x1,[x12, #0x7c8]
00b1fae4	b 0x00b1fa94
00b1fae8	ldr x1,[x13, #0x7d0]
00b1faec	cbnz x1,0x00b1fa90
00b1faf0	ldr x1,[x8], #0x10
00b1faf4	str x1,[x13, #0x7d0]
00b1faf8	b 0x00b1fa94
00b1fafc	ldr x1,[x14, #0x7f0]
00b1fb00	cbnz x1,0x00b1fa90
00b1fb04	ldr x1,[x8], #0x10
00b1fb08	str x1,[x14, #0x7f0]
00b1fb0c	b 0x00b1fa94
00b1fb10	ldr x1,[x15, #0x7f8]
00b1fb14	cbnz x1,0x00b1fa90
00b1fb18	ldr x1,[x8], #0x10
00b1fb1c	str x1,[x15, #0x7f8]
00b1fb20	b 0x00b1fa94
00b1fb24	ldr x1,[x16, #0x800]
00b1fb28	cbnz x1,0x00b1fa90
00b1fb2c	ldr x1,[x8]
00b1fb30	str x1,[x16, #0x800]
00b1fb34	b 0x00b1fa90
00b1fb38	ldr x1,[x17, #0x7e0]
00b1fb3c	cbnz x1,0x00b1fa90
00b1fb40	ldr x1,[x8], #0x10
00b1fb44	str x1,[x17, #0x7e0]
00b1fb48	b 0x00b1fa94
00b1fb4c	ldr x1,[x18, #0x7d8]
00b1fb50	cbnz x1,0x00b1fa90
00b1fb54	ldr x1,[x8], #0x10
00b1fb58	str x1,[x18, #0x7d8]
00b1fb5c	b 0x00b1fa94
00b1fb60	ldr x1,[x0, #0x7e8]
00b1fb64	cbnz x1,0x00b1fa90
00b1fb68	ldr x1,[x8], #0x10
00b1fb6c	str x1,[x0, #0x7e8]
00b1fb70	b 0x00b1fa94
00b1fb74	mov w0,#0x1
00b1fb78	ret
