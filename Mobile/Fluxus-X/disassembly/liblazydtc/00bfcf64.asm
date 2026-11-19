; std::__ndk1::ctype<char>::do_narrow @ 00bfcf64
00bfcf64	bti c
00bfcf68	cmp x1,x2
00bfcf6c	b.eq 0x00bfcfd8
00bfcf70	sub x9,x2,x1
00bfcf74	cmp x9,#0x20
00bfcf78	b.cc 0x00bfcfe0
00bfcf7c	sub x8,x4,x1
00bfcf80	cmp x8,#0x20
00bfcf84	b.cc 0x00bfcfe0
00bfcf88	dup v0.16B,w3
00bfcf8c	and x10,x9,#-0x20
00bfcf90	add x11,x1,#0x10
00bfcf94	add x8,x4,x10
00bfcf98	add x0,x1,x10
00bfcf9c	add x12,x4,#0x10
00bfcfa0	mov x13,x10
00bfcfa4	ldp q1,q2,[x11, #-0x10]
00bfcfa8	subs x13,x13,#0x20
00bfcfac	add x11,x11,#0x20
00bfcfb0	cmlt v3.16B,v1.16B,#0
00bfcfb4	cmlt v4.16B,v2.16B,#0
00bfcfb8	bit v1.16B,v0.16B,v3.16B
00bfcfbc	bit v2.16B,v0.16B,v4.16B
00bfcfc0	stp q1,q2,[x12, #-0x10]
00bfcfc4	add x12,x12,#0x20
00bfcfc8	b.ne 0x00bfcfa4
00bfcfcc	cmp x9,x10
00bfcfd0	b.ne 0x00bfcfe8
00bfcfd4	ret
00bfcfd8	mov x0,x1
00bfcfdc	ret
00bfcfe0	mov x8,x4
00bfcfe4	mov x0,x1
00bfcfe8	ldrsb w9,[x0], #0x1
00bfcfec	cmp w9,#0x0
00bfcff0	csel w9,w3,w9,lt
00bfcff4	cmp x0,x2
00bfcff8	strb w9,[x8], #0x1
00bfcffc	b.ne 0x00bfcfe8
00bfd000	b 0x00bfcfd4
