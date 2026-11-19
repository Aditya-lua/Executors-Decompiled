; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::peek @ 00bd0830
00bd0830	paciasp
00bd0834	sub sp,sp,#0x30
00bd0838	stp x29,x30,[sp, #0x10]
00bd083c	stp x20,x19,[sp, #0x20]
00bd0840	add x29,sp,#0x10
00bd0844	mov x19,x0
00bd0848	str xzr,[x0, #0x8]
00bd084c	sub x0,x29,#0x4
00bd0850	mov x1,x19
00bd0854	mov w2,#0x1
00bd0858	bl 0x00c30140
00bd085c	ldurb w8,[x29, #-0x4]
00bd0860	cmp w8,#0x1
00bd0864	b.ne 0x00bd088c
00bd0868	ldr x8,[x19]
00bd086c	ldur x8,[x8, #-0x18]
00bd0870	add x8,x19,x8
00bd0874	ldr x0,[x8, #0x28]
00bd0878	ldp x8,x9,[x0, #0x18]
00bd087c	cmp x8,x9
00bd0880	b.eq 0x00bd0894
00bd0884	ldrb w20,[x8]
00bd0888	b 0x00bd08a4
00bd088c	mov w20,#0xffffffff
00bd0890	b 0x00bd08c8
00bd0894	ldr x8,[x0]
00bd0898	ldr x8,[x8, #0x48]
00bd089c	blr x8
00bd08a0	mov w20,w0
00bd08a4	cmn w20,#0x1
00bd08a8	cset w8,eq
00bd08ac	lsl w8,w8,#0x1
00bd08b0	ldr x9,[x19]
00bd08b4	ldur x9,[x9, #-0x18]
00bd08b8	add x0,x19,x9
00bd08bc	ldr w9,[x0, #0x20]
00bd08c0	orr w1,w9,w8
00bd08c4	bl 0x00c30130
00bd08c8	mov w0,w20
00bd08cc	ldp x20,x19,[sp, #0x20]
00bd08d0	ldp x29,x30,[sp, #0x10]
00bd08d4	add sp,sp,#0x30
00bd08d8	autiasp
00bd08dc	ret
