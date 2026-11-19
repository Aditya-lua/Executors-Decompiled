; ZSTD_createDDict_byReference @ 00bb3c9c
00bb3c9c	sub sp,sp,#0x40
00bb3ca0	stp x29,x30,[sp, #0x20]
00bb3ca4	str x19,[sp, #0x30]
00bb3ca8	add x29,sp,#0x20
00bb3cac	mrs x19,tpidr_el0
00bb3cb0	mov x4,sp
00bb3cb4	mov w2,#0x1
00bb3cb8	ldr x8,[x19, #0x28]
00bb3cbc	mov w3,wzr
00bb3cc0	stur x8,[x29, #-0x8]
00bb3cc4	stp xzr,xzr,[sp]
00bb3cc8	str xzr,[sp, #0x10]
00bb3ccc	bl 0x00c435a0
00bb3cd0	ldr x8,[x19, #0x28]
00bb3cd4	ldur x9,[x29, #-0x8]
00bb3cd8	cmp x8,x9
00bb3cdc	b.ne 0x00bb3cf0
00bb3ce0	ldp x29,x30,[sp, #0x20]
00bb3ce4	ldr x19,[sp, #0x30]
00bb3ce8	add sp,sp,#0x40
00bb3cec	ret
00bb3cf0	bl 0x00c2fec0
