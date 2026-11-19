; ZSTD_createDDict @ 00bb3c44
00bb3c44	sub sp,sp,#0x40
00bb3c48	stp x29,x30,[sp, #0x20]
00bb3c4c	str x19,[sp, #0x30]
00bb3c50	add x29,sp,#0x20
00bb3c54	mrs x19,tpidr_el0
00bb3c58	mov x4,sp
00bb3c5c	mov w2,wzr
00bb3c60	ldr x8,[x19, #0x28]
00bb3c64	mov w3,wzr
00bb3c68	stur x8,[x29, #-0x8]
00bb3c6c	stp xzr,xzr,[sp]
00bb3c70	str xzr,[sp, #0x10]
00bb3c74	bl 0x00c435a0
00bb3c78	ldr x8,[x19, #0x28]
00bb3c7c	ldur x9,[x29, #-0x8]
00bb3c80	cmp x8,x9
00bb3c84	b.ne 0x00bb3c98
00bb3c88	ldp x29,x30,[sp, #0x20]
00bb3c8c	ldr x19,[sp, #0x30]
00bb3c90	add sp,sp,#0x40
00bb3c94	ret
00bb3c98	bl 0x00c2fec0
