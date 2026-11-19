; ossl_blake2s_update @ 00b2feb0
00b2feb0	str x23,[sp, #-0x40]!
00b2feb4	stp x22,x21,[sp, #0x10]
00b2feb8	stp x20,x19,[sp, #0x20]
00b2febc	stp x29,x30,[sp, #0x30]
00b2fec0	ldr x8,[x0, #0x70]
00b2fec4	mov w9,#0x40
00b2fec8	mov x20,x2
00b2fecc	mov x19,x0
00b2fed0	sub x22,x9,x8
00b2fed4	cmp x22,x2
00b2fed8	mov x21,x1
00b2fedc	add x29,sp,#0x30
00b2fee0	b.cs 0x00b2ff58
00b2fee4	cbz x8,0x00b2ff18
00b2fee8	add x23,x19,#0x30
00b2feec	add x0,x23,x8
00b2fef0	mov x1,x21
00b2fef4	mov x2,x22
00b2fef8	bl 0x00c2ffd0
00b2fefc	mov w2,#0x40
00b2ff00	mov x0,x19
00b2ff04	mov x1,x23
00b2ff08	bl 0x00b2ff90
00b2ff0c	add x21,x21,x22
00b2ff10	sub x20,x20,x22
00b2ff14	str xzr,[x19, #0x70]
00b2ff18	cmp x20,#0x41
00b2ff1c	b.cc 0x00b2ff54
00b2ff20	and x8,x20,#0x3f
00b2ff24	tst x20,#0x3f
00b2ff28	mov w9,#0x40
00b2ff2c	csel x22,x9,x8,eq
00b2ff30	sub x20,x20,x22
00b2ff34	mov x0,x19
00b2ff38	mov x1,x21
00b2ff3c	mov x2,x20
00b2ff40	bl 0x00b2ff90
00b2ff44	ldr x8,[x19, #0x70]
00b2ff48	add x21,x21,x20
00b2ff4c	mov x20,x22
00b2ff50	b 0x00b2ff58
00b2ff54	mov x8,xzr
00b2ff58	add x8,x19,x8
00b2ff5c	add x0,x8,#0x30
00b2ff60	mov x1,x21
00b2ff64	mov x2,x20
00b2ff68	bl 0x00c2ffd0
00b2ff6c	ldr x8,[x19, #0x70]
00b2ff70	mov w0,#0x1
00b2ff74	add x8,x8,x20
00b2ff78	str x8,[x19, #0x70]
00b2ff7c	ldp x29,x30,[sp, #0x30]
00b2ff80	ldp x20,x19,[sp, #0x20]
00b2ff84	ldp x22,x21,[sp, #0x10]
00b2ff88	ldr x23,[sp], #0x40
00b2ff8c	ret
