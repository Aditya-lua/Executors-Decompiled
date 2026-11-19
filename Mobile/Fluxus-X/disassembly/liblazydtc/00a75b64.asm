; EVP_PKEY_meth_get0 @ 00a75b64
00a75b64	cmp x0,#0x9
00a75b68	b.hi 0x00a75b7c
00a75b6c	adrp x8,0xcc8000
00a75b70	add x8,x8,#0xed8
00a75b74	ldr x0,[x8, x0, LSL #0x3]
00a75b78	br x0
00a75b7c	stp x20,x19,[sp, #-0x20]!
00a75b80	stp x29,x30,[sp, #0x10]
00a75b84	adrp x20,0xd21000
00a75b88	ldr x8,[x20, #0xb48]
00a75b8c	add x29,sp,#0x10
00a75b90	cbz x8,0x00a75bbc
00a75b94	sub x19,x0,#0xa
00a75b98	mov x0,x8
00a75b9c	bl 0x00c325e0
00a75ba0	cmp x19,w0, SXTW 
00a75ba4	mov x0,xzr
00a75ba8	b.cs 0x00a75bc0
00a75bac	ldr x0,[x20, #0xb48]
00a75bb0	mov w1,w19
00a75bb4	bl 0x00c32610
00a75bb8	b 0x00a75bc0
00a75bbc	mov x0,xzr
00a75bc0	ldp x29,x30,[sp, #0x10]
00a75bc4	ldp x20,x19,[sp], #0x20
00a75bc8	ret
