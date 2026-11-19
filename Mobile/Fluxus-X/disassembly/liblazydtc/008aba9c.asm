; FUN_008aba9c @ 008aba9c
008aba9c	sub sp,sp,#0x30
008abaa0	stp x29,x30,[sp, #0x10]
008abaa4	stp x20,x19,[sp, #0x20]
008abaa8	add x29,sp,#0x10
008abaac	cmp w1,#0x1
008abab0	b.lt 0x008abaec
008abab4	ldp x9,x8,[x0, #0x68]
008abab8	add x8,x8,w1, UXTW  #0x4
008ababc	sub x8,x8,#0x10
008abac0	cmp x8,x9
008abac4	b.cc 0x008abb1c
008abac8	adrp x8,0xd1f000
008abacc	add x8,x8,#0x1e0
008abad0	adrp x19,0xd1f000
008abad4	ldarb w8,[x8]
008abad8	tbz w8,#0x0,0x008abb94
008abadc	ldr x8,[x19, #0x1d8]
008abae0	add x8,x8,#0x7f2, LSL #12
008abae4	add x8,x8,#0xef0
008abae8	b 0x008abb1c
008abaec	mov w8,#0xffffd8f1
008abaf0	cmp w1,w8
008abaf4	b.lt 0x008abb04
008abaf8	ldr x8,[x0, #0x68]
008abafc	add x8,x8,w1, SXTW  #0x4
008abb00	b 0x008abb1c
008abb04	mov x19,x0
008abb08	mov x20,x2
008abb0c	bl 0x008aea7c
008abb10	mov x2,x20
008abb14	mov x8,x0
008abb18	mov x0,x19
008abb1c	ldr w9,[x8, #0xc]
008abb20	cmp w9,#0x5
008abb24	b.ne 0x008abb68
008abb28	ldr x19,[x8]
008abb2c	cbz x2,0x008abb80
008abb30	ldrh w8,[x19, #0x6]
008abb34	cmp w8,#0x8, LSL #12
008abb38	b.ne 0x008abb78
008abb3c	ldr x8,[x0, #0x60]
008abb40	ldr x9,[x8, #0x6a8]
008abb44	cbz x9,0x008abb70
008abb48	ldr w8,[x19, #0x14]
008abb4c	add x1,x19,#0x18
008abb50	mov x20,x2
008abb54	mov x2,x8
008abb58	blr x9
008abb5c	mov x2,x20
008abb60	mov w8,w0
008abb64	b 0x008abb74
008abb68	mov x0,xzr
008abb6c	b 0x008abb84
008abb70	mov w8,#0xffff
008abb74	strh w8,[x19, #0x6]
008abb78	sxth w8,w8
008abb7c	str w8,[x2]
008abb80	add x0,x19,#0x18
008abb84	ldp x20,x19,[sp, #0x20]
008abb88	ldp x29,x30,[sp, #0x10]
008abb8c	add sp,sp,#0x30
008abb90	ret
008abb94	adrp x8,0xd1f000
008abb98	add x8,x8,#0x1e0
008abb9c	stp x2,x0,[sp]
008abba0	mov x0,x8
008abba4	bl 0x00c2fe90
008abba8	mov w8,w0
008abbac	ldp x2,x0,[sp]
008abbb0	cbz w8,0x008abadc
008abbb4	adrp x8,0xcca000
008abbb8	ldr x0,[x8, #0x8c8]
008abbbc	bl 0x007fe1ec
008abbc0	str x0,[x19, #0x1d8]
008abbc4	adrp x0,0xd1f000
008abbc8	add x0,x0,#0x1e0
008abbcc	bl 0x00c2fea0
008abbd0	ldp x2,x0,[sp]
008abbd4	b 0x008abadc
