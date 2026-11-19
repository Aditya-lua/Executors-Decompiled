; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find_last_of @ 00bc4550
00bc4550	paciasp
00bc4554	stp x29,x30,[sp, #-0x30]!
00bc4558	stp x22,x21,[sp, #0x10]
00bc455c	stp x20,x19,[sp, #0x20]
00bc4560	mov x29,sp
00bc4564	ldrb w9,[x0]
00bc4568	ldr x8,[x0, #0x10]
00bc456c	tst w9,#0x1
00bc4570	csinc x8,x8,x0,ne
00bc4574	cbz x3,0x00bc45bc
00bc4578	lsr x10,x9,#0x1
00bc457c	ldr x11,[x0, #0x8]
00bc4580	tst w9,#0x1
00bc4584	mov x19,x3
00bc4588	mov x20,x1
00bc458c	sub x22,x8,#0x1
00bc4590	csel x9,x10,x11,eq
00bc4594	cmp x2,x9
00bc4598	csinc x21,x9,x2,cs
00bc459c	cbz x21,0x00bc45bc
00bc45a0	ldrb w1,[x22, x21]
00bc45a4	mov x0,x20
00bc45a8	mov x2,x19
00bc45ac	bl 0x00c300a0
00bc45b0	sub x21,x21,#0x1
00bc45b4	cbz x0,0x00bc459c
00bc45b8	b 0x00bc45c0
00bc45bc	mov x21,#-0x1
00bc45c0	mov x0,x21
00bc45c4	ldp x20,x19,[sp, #0x20]
00bc45c8	ldp x22,x21,[sp, #0x10]
00bc45cc	ldp x29,x30,[sp], #0x30
00bc45d0	autiasp
00bc45d4	ret
