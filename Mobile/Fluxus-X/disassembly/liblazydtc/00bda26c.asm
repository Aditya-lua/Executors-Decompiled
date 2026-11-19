; std::__ndk1::collate<wchar_t>::do_transform @ 00bda26c
00bda26c	paciasp
00bda270	stp x29,x30,[sp, #-0x40]!
00bda274	stp x24,x23,[sp, #0x10]
00bda278	stp x22,x21,[sp, #0x20]
00bda27c	stp x20,x19,[sp, #0x30]
00bda280	mov x29,sp
00bda284	sub x19,x2,x1
00bda288	orr x9,xzr,#0x3ffffffffffffff8
00bda28c	asr x22,x19,#0x2
00bda290	cmp x22,x9
00bda294	b.cs 0x00bda320
00bda298	mov x21,x2
00bda29c	mov x20,x8
00bda2a0	cmp x22,#0x4
00bda2a4	b.hi 0x00bda2c0
00bda2a8	lsr w8,w19,#0x1
00bda2ac	and w8,w8,#0xfe
00bda2b0	strb w8,[x20], #0x4
00bda2b4	cmp x21,x1
00bda2b8	b.ne 0x00bda2f8
00bda2bc	b 0x00bda304
00bda2c0	orr x8,x22,#0x1
00bda2c4	mov w9,#0x8
00bda2c8	mov x23,x1
00bda2cc	cmp x8,#0x5
00bda2d0	csinc x24,x9,x8,eq
00bda2d4	lsl x0,x24,#0x2
00bda2d8	bl 0x00c2fed0
00bda2dc	orr x8,x24,#0x1
00bda2e0	mov x1,x23
00bda2e4	stp x22,x0,[x20, #0x8]
00bda2e8	str x8,[x20]
00bda2ec	mov x20,x0
00bda2f0	cmp x21,x1
00bda2f4	b.eq 0x00bda304
00bda2f8	mov x0,x20
00bda2fc	mov x2,x19
00bda300	bl 0x00c2ffd0
00bda304	str wzr,[x20, x19#0x0]
00bda308	ldp x20,x19,[sp, #0x30]
00bda30c	ldp x22,x21,[sp, #0x20]
00bda310	ldp x24,x23,[sp, #0x10]
00bda314	ldp x29,x30,[sp], #0x40
00bda318	autiasp
00bda31c	ret
00bda320	bl 0x00bc5610
