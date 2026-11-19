; FUN_00a7a0a8 @ 00a7a0a8
00a7a0a8	sub sp,sp,#0x50
00a7a0ac	stp x24,x23,[sp, #0x10]
00a7a0b0	stp x22,x21,[sp, #0x20]
00a7a0b4	stp x20,x19,[sp, #0x30]
00a7a0b8	stp x29,x30,[sp, #0x40]
00a7a0bc	ldr x24,[x0, #0x98]
00a7a0c0	ldr x0,[x0, #0x88]
00a7a0c4	add x29,sp,#0x40
00a7a0c8	mov x20,x4
00a7a0cc	mov x21,x3
00a7a0d0	mov x19,x2
00a7a0d4	mov x22,x1
00a7a0d8	bl 0x00c3a8b0
00a7a0dc	mov x23,x0
00a7a0e0	bl 0x00c3a720
00a7a0e4	cmp w0,#0x1
00a7a0e8	b.lt 0x00a7a128
00a7a0ec	cbz x22,0x00a7a130
00a7a0f0	ldr x8,[x19]
00a7a0f4	cmp x8,w0, SXTW 
00a7a0f8	b.cs 0x00a7a138
00a7a0fc	bl 0x00c342a0
00a7a100	adrp x0,0x2c1000
00a7a104	adrp x2,0x2a0000
00a7a108	add x0,x0,#0xd1f
00a7a10c	add x2,x2,#0x3a1
00a7a110	mov w1,#0x82
00a7a114	bl 0x00c342b0
00a7a118	mov w0,#0x10
00a7a11c	mov w1,#0x64
00a7a120	mov x2,xzr
00a7a124	bl 0x00c342c0
00a7a128	mov w0,wzr
00a7a12c	b 0x00a7a178
00a7a130	sxtw x8,w0
00a7a134	b 0x00a7a170
00a7a138	ldr x0,[x24, #0x8]
00a7a13c	cbz x0,0x00a7a148
00a7a140	bl 0x00c34c30
00a7a144	b 0x00a7a14c
00a7a148	mov w0,#0x40
00a7a14c	add x4,sp,#0xc
00a7a150	mov x1,x21
00a7a154	mov w2,w20
00a7a158	mov x3,x22
00a7a15c	mov x5,x23
00a7a160	bl 0x00c3b1a0
00a7a164	cmp w0,#0x1
00a7a168	b.lt 0x00a7a178
00a7a16c	ldr w8,[sp, #0xc]
00a7a170	mov w0,#0x1
00a7a174	str x8,[x19]
00a7a178	ldp x29,x30,[sp, #0x40]
00a7a17c	ldp x20,x19,[sp, #0x30]
00a7a180	ldp x22,x21,[sp, #0x20]
00a7a184	ldp x24,x23,[sp, #0x10]
00a7a188	add sp,sp,#0x50
00a7a18c	ret
