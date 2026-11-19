; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back @ 008e984c
008e984c	str x25,[sp, #-0x50]!
008e9850	stp x24,x23,[sp, #0x10]
008e9854	stp x22,x21,[sp, #0x20]
008e9858	stp x20,x19,[sp, #0x30]
008e985c	stp x29,x30,[sp, #0x40]
008e9860	add x29,sp,#0x40
008e9864	ldrb w8,[x0]
008e9868	mov x20,x0
008e986c	mov w19,w1
008e9870	tbz w8,#0x0,0x008e9894
008e9874	ldp x9,x25,[x20]
008e9878	and x9,x9,#-0x2
008e987c	sub x21,x9,#0x1
008e9880	cmp x25,x21
008e9884	b.eq 0x008e98a4
008e9888	tbz w8,#0x0,0x008e98b8
008e988c	ldr x23,[x20, #0x10]
008e9890	b 0x008e9944
008e9894	lsr w25,w8,#0x1
008e9898	mov w21,#0x16
008e989c	cmp x25,x21
008e98a0	b.ne 0x008e9888
008e98a4	cmn x21,#0x11
008e98a8	b.eq 0x008e9970
008e98ac	tbnz w8,#0x0,0x008e98cc
008e98b0	add x22,x20,#0x1
008e98b4	b 0x008e98d0
008e98b8	lsl w8,w25,#0x1
008e98bc	add w8,w8,#0x2
008e98c0	strb w8,[x20], #0x1
008e98c4	mov x23,x20
008e98c8	b 0x008e994c
008e98cc	ldr x22,[x20, #0x10]
008e98d0	mov x8,#-0x1a
008e98d4	movk x8,#0x7fff, LSL #48
008e98d8	cmp x21,x8
008e98dc	b.hi 0x008e9900
008e98e0	add x8,x21,#0x1
008e98e4	lsl x9,x21,#0x1
008e98e8	cmp x8,x9
008e98ec	csinc x8,x9,x21,cc
008e98f0	cmp x8,#0x17
008e98f4	b.cs 0x008e9908
008e98f8	mov w24,#0x17
008e98fc	b 0x008e9910
008e9900	orr x24,xzr,#-0x11
008e9904	b 0x008e9910
008e9908	add x8,x8,#0x10
008e990c	and x24,x8,#-0x10
008e9910	mov x0,x24
008e9914	bl 0x00c2fed0
008e9918	mov x1,x22
008e991c	mov x2,x21
008e9920	mov x23,x0
008e9924	bl 0x00c2ffd0
008e9928	cmp x21,#0x16
008e992c	b.eq 0x008e9938
008e9930	mov x0,x22
008e9934	bl 0x00c301d0
008e9938	orr x8,x24,#0x1
008e993c	str x23,[x20, #0x10]
008e9940	str x8,[x20]
008e9944	add x8,x25,#0x1
008e9948	str x8,[x20, #0x8]
008e994c	add x8,x23,x25
008e9950	strb w19,[x8]
008e9954	strb wzr,[x8, #0x1]
008e9958	ldp x29,x30,[sp, #0x40]
008e995c	ldp x20,x19,[sp, #0x30]
008e9960	ldp x22,x21,[sp, #0x20]
008e9964	ldp x24,x23,[sp, #0x10]
008e9968	ldr x25,[sp], #0x50
008e996c	ret
008e9970	mov x0,x20
008e9974	bl 0x00c30ce0
