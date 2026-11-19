; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::ignore @ 00bd0670
00bd0670	paciasp
00bd0674	stp x29,x30,[sp, #-0x40]!
00bd0678	str x23,[sp, #0x10]
00bd067c	stp x22,x21,[sp, #0x20]
00bd0680	stp x20,x19,[sp, #0x30]
00bd0684	mov x29,sp
00bd0688	mov x19,x0
00bd068c	mov w20,w2
00bd0690	mov x21,x1
00bd0694	str xzr,[x0, #0x8]
00bd0698	add x0,x29,#0x1c
00bd069c	mov x1,x19
00bd06a0	mov w2,#0x1
00bd06a4	bl 0x00c30140
00bd06a8	ldrb w8,[x29, #0x1c]
00bd06ac	cmp w8,#0x1
00bd06b0	b.ne 0x00bd07c0
00bd06b4	mov x22,#0x7fffffffffffffff
00bd06b8	cmp x21,x22
00bd06bc	b.ne 0x00bd0724
00bd06c0	add x21,x19,#0x28
00bd06c4	b 0x00bd06d0
00bd06c8	cmp w0,w20
00bd06cc	b.eq 0x00bd079c
00bd06d0	ldr x8,[x19]
00bd06d4	ldur x8,[x8, #-0x18]
00bd06d8	ldr x0,[x21, x8#0x0]
00bd06dc	ldp x8,x9,[x0, #0x18]
00bd06e0	cmp x8,x9
00bd06e4	b.eq 0x00bd06f8
00bd06e8	add x9,x8,#0x1
00bd06ec	str x9,[x0, #0x18]
00bd06f0	ldrb w0,[x8]
00bd06f4	b 0x00bd070c
00bd06f8	ldr x8,[x0]
00bd06fc	ldr x8,[x8, #0x50]
00bd0700	blr x8
00bd0704	cmn w0,#0x1
00bd0708	b.eq 0x00bd07a4
00bd070c	ldr x8,[x19, #0x8]
00bd0710	cmp x8,x22
00bd0714	b.eq 0x00bd06c8
00bd0718	add x8,x8,#0x1
00bd071c	str x8,[x19, #0x8]
00bd0720	b 0x00bd06c8
00bd0724	ldr x8,[x19, #0x8]
00bd0728	cmp x8,x21
00bd072c	b.ge 0x00bd079c
00bd0730	add x22,x19,#0x28
00bd0734	mov x23,#0x7fffffffffffffff
00bd0738	b 0x00bd075c
00bd073c	add x10,x9,#0x1
00bd0740	str x10,[x0, #0x18]
00bd0744	ldrb w0,[x9]
00bd0748	add x8,x8,#0x1
00bd074c	str x8,[x19, #0x8]
00bd0750	cmp w0,w20
00bd0754	ccmp x8,x21,#0x0,ne
00bd0758	b.ge 0x00bd079c
00bd075c	ldr x9,[x19]
00bd0760	ldur x9,[x9, #-0x18]
00bd0764	ldr x0,[x22, x9#0x0]
00bd0768	ldp x9,x10,[x0, #0x18]
00bd076c	cmp x9,x10
00bd0770	b.ne 0x00bd073c
00bd0774	ldr x8,[x0]
00bd0778	ldr x8,[x8, #0x50]
00bd077c	blr x8
00bd0780	cmn w0,#0x1
00bd0784	b.eq 0x00bd07a4
00bd0788	ldr x8,[x19, #0x8]
00bd078c	cmp x8,x23
00bd0790	b.ne 0x00bd0748
00bd0794	ldr x8,[x19, #0x8]
00bd0798	b 0x00bd0750
00bd079c	mov w8,wzr
00bd07a0	b 0x00bd07a8
00bd07a4	mov w8,#0x2
00bd07a8	ldr x9,[x19]
00bd07ac	ldur x9,[x9, #-0x18]
00bd07b0	add x0,x19,x9
00bd07b4	ldr w9,[x0, #0x20]
00bd07b8	orr w1,w9,w8
00bd07bc	bl 0x00c30130
00bd07c0	mov x0,x19
00bd07c4	ldp x20,x19,[sp, #0x30]
00bd07c8	ldr x23,[sp, #0x10]
00bd07cc	ldp x22,x21,[sp, #0x20]
00bd07d0	ldp x29,x30,[sp], #0x40
00bd07d4	autiasp
00bd07d8	ret
