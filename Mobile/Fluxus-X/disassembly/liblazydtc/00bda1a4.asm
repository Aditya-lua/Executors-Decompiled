; std::__ndk1::collate<char>::do_hash @ 00bda1a4
00bda1a4	bti c
00bda1a8	cmp x1,x2
00bda1ac	b.eq 0x00bda1d4
00bda1b0	mov x0,xzr
00bda1b4	ldrb w8,[x1], #0x1
00bda1b8	cmp x1,x2
00bda1bc	add x8,x8,x0, LSL #0x4
00bda1c0	and x9,x8,#-0x1000000000000000
00bda1c4	bfxil x9,x9,#0x38,#0x8
00bda1c8	eor x0,x9,x8
00bda1cc	b.ne 0x00bda1b4
00bda1d0	ret
00bda1d4	mov x0,xzr
00bda1d8	ret
