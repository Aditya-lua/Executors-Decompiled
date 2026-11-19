; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare @ 00bc4a98
00bc4a98	paciasp
00bc4a9c	stp x29,x30,[sp, #-0x20]!
00bc4aa0	stp x20,x19,[sp, #0x10]
00bc4aa4	mov x29,sp
00bc4aa8	ldrb w8,[x0]
00bc4aac	ldr x9,[x0, #0x8]
00bc4ab0	lsr x10,x8,#0x1
00bc4ab4	tst w8,#0x1
00bc4ab8	csel x9,x10,x9,eq
00bc4abc	cmn x4,#0x1
00bc4ac0	b.eq 0x00bc4b1c
00bc4ac4	subs x9,x9,x1
00bc4ac8	b.cc 0x00bc4b1c
00bc4acc	cmp x9,x2
00bc4ad0	ldr x10,[x0, #0x10]
00bc4ad4	mov x19,x4
00bc4ad8	csel x20,x9,x2,cc
00bc4adc	tst w8,#0x1
00bc4ae0	csinc x8,x10,x0,ne
00bc4ae4	cmp x4,x20
00bc4ae8	csel x2,x4,x20,cc
00bc4aec	add x0,x8,x1
00bc4af0	mov x1,x3
00bc4af4	bl 0x00c300b0
00bc4af8	cmp x20,x19
00bc4afc	cset w8,hi
00bc4b00	csinv w8,w8,wzr,cs
00bc4b04	cmp w0,#0x0
00bc4b08	csel w0,w8,w0,eq
00bc4b0c	ldp x20,x19,[sp, #0x10]
00bc4b10	ldp x29,x30,[sp], #0x20
00bc4b14	autiasp
00bc4b18	ret
00bc4b1c	bl 0x00814f80
