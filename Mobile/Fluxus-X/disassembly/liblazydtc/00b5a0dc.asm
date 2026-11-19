; FUN_00b5a0dc @ 00b5a0dc
00b5a0dc	sub sp,sp,#0x70
00b5a0e0	stp x26,x25,[sp, #0x20]
00b5a0e4	stp x24,x23,[sp, #0x30]
00b5a0e8	stp x22,x21,[sp, #0x40]
00b5a0ec	stp x20,x19,[sp, #0x50]
00b5a0f0	stp x29,x30,[sp, #0x60]
00b5a0f4	str x27,[sp, #0x10]
00b5a0f8	ldr x27,[x0, #0xf8]
00b5a0fc	mov x19,x0
00b5a100	add x29,sp,#0x60
00b5a104	mov x23,x6
00b5a108	ldr x0,[x27, #0x18]
00b5a10c	mov x20,x5
00b5a110	mov x21,x4
00b5a114	mov x24,x3
00b5a118	mov x25,x2
00b5a11c	mov x26,x1
00b5a120	bl 0x00c31f90
00b5a124	bl 0x00c31fa0
00b5a128	str x0,[x27, #0x18]
00b5a12c	cbz x0,0x00b5a190
00b5a130	add x22,x27,#0x28
00b5a134	orr w2,wzr,#0xff
00b5a138	mov x0,x19
00b5a13c	mov x1,x22
00b5a140	mov x3,x26
00b5a144	mov x4,x25
00b5a148	mov x5,x24
00b5a14c	mov x6,x21
00b5a150	mov x7,x20
00b5a154	str x23,[sp]
00b5a158	bl 0x00b5a564
00b5a15c	cbz w0,0x00b5a190
00b5a160	ldr x4,[x19, #0xe8]
00b5a164	add x1,x27,#0x97
00b5a168	mov x0,x19
00b5a16c	mov w2,wzr
00b5a170	mov x3,x22
00b5a174	mov x5,xzr
00b5a178	mov x6,xzr
00b5a17c	mov x7,xzr
00b5a180	str xzr,[sp]
00b5a184	bl 0x00b5a564
00b5a188	cmp w0,#0x0
00b5a18c	cset w0,ne
00b5a190	ldp x29,x30,[sp, #0x60]
00b5a194	ldp x20,x19,[sp, #0x50]
00b5a198	ldp x22,x21,[sp, #0x40]
00b5a19c	ldp x24,x23,[sp, #0x30]
00b5a1a0	ldp x26,x25,[sp, #0x20]
00b5a1a4	ldr x27,[sp, #0x10]
00b5a1a8	add sp,sp,#0x70
00b5a1ac	ret
