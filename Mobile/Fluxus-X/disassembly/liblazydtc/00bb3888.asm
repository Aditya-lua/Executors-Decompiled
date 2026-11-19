; ZSTD_decompressStream_simpleArgs @ 00bb3888
00bb3888	sub sp,sp,#0x70
00bb388c	stp x29,x30,[sp, #0x40]
00bb3890	str x21,[sp, #0x50]
00bb3894	stp x20,x19,[sp, #0x60]
00bb3898	add x29,sp,#0x40
00bb389c	mrs x21,tpidr_el0
00bb38a0	mov x19,x6
00bb38a4	mov x20,x3
00bb38a8	ldr x8,[x21, #0x28]
00bb38ac	stur x8,[x29, #-0x8]
00bb38b0	ldr x8,[x3]
00bb38b4	ldr x9,[x6]
00bb38b8	stp x1,x2,[sp, #0x20]
00bb38bc	add x1,sp,#0x20
00bb38c0	add x2,sp,#0x8
00bb38c4	stp x4,x5,[sp, #0x8]
00bb38c8	str x8,[sp, #0x30]
00bb38cc	str x9,[sp, #0x18]
00bb38d0	bl 0x00c43720
00bb38d4	ldr x8,[sp, #0x30]
00bb38d8	ldr x9,[sp, #0x18]
00bb38dc	str x8,[x20]
00bb38e0	str x9,[x19]
00bb38e4	ldr x8,[x21, #0x28]
00bb38e8	ldur x9,[x29, #-0x8]
00bb38ec	cmp x8,x9
00bb38f0	b.ne 0x00bb3908
00bb38f4	ldp x20,x19,[sp, #0x60]
00bb38f8	ldr x21,[sp, #0x50]
00bb38fc	ldp x29,x30,[sp, #0x40]
00bb3900	add sp,sp,#0x70
00bb3904	ret
00bb3908	bl 0x00c2fec0
