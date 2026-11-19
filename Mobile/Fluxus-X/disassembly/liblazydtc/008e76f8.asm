; std::__ndk1::vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__emplace_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&> @ 008e76f8
008e76f8	stp x28,x27,[sp, #-0x60]!
008e76fc	stp x26,x25,[sp, #0x10]
008e7700	stp x24,x23,[sp, #0x20]
008e7704	stp x22,x21,[sp, #0x30]
008e7708	stp x20,x19,[sp, #0x40]
008e770c	stp x29,x30,[sp, #0x50]
008e7710	add x29,sp,#0x50
008e7714	ldp x20,x24,[x0]
008e7718	orr x9,xzr,#-0x5555555555555556
008e771c	movk x9,#0xaaab
008e7720	orr x26,xzr,#-0x5555555555555556
008e7724	sub x8,x24,x20
008e7728	asr x8,x8,#0x3
008e772c	mul x28,x8,x9
008e7730	movk x26,#0xaaa, LSL #48
008e7734	add x8,x28,#0x1
008e7738	mov x19,x0
008e773c	cmp x8,x26
008e7740	mov x22,x1
008e7744	b.hi 0x008e78e8
008e7748	ldr x10,[x19, #0x10]
008e774c	sub x10,x10,x20
008e7750	asr x10,x10,#0x3
008e7754	mul x9,x10,x9
008e7758	orr x10,xzr,#0x5555555555555555
008e775c	movk x10,#0x5554
008e7760	movk x10,#0x555, LSL #48
008e7764	cmp x9,x10
008e7768	b.hi 0x008e777c
008e776c	lsl x9,x9,#0x1
008e7770	cmp x9,x8
008e7774	csel x26,x8,x9,cc
008e7778	cbz x26,0x008e78dc
008e777c	add x8,x26,x26, LSL #0x1
008e7780	lsl x0,x8,#0x3
008e7784	bl 0x00c2fed0
008e7788	mov x23,x0
008e778c	mov x27,x0
008e7790	orr w25,wzr,#0x18
008e7794	madd x21,x28,x25,x27
008e7798	stp xzr,xzr,[x21, #0x8]
008e779c	str xzr,[x21]
008e77a0	ldrb w8,[x22]
008e77a4	tbnz w8,#0x0,0x008e77bc
008e77a8	ldr x8,[x22, #0x10]
008e77ac	str x8,[x21, #0x10]
008e77b0	ldr q0,[x22]
008e77b4	str q0,[x21]
008e77b8	b 0x008e7830
008e77bc	ldr x20,[x22, #0x8]
008e77c0	cmn x20,#0x10
008e77c4	b.cs 0x008e78f0
008e77c8	ldr x22,[x22, #0x10]
008e77cc	cmp x20,#0x17
008e77d0	b.cs 0x008e77e8
008e77d4	lsl w8,w20,#0x1
008e77d8	mov x24,x21
008e77dc	strb w8,[x24], #0x1
008e77e0	cbnz x20,0x008e7814
008e77e4	b 0x008e7824
008e77e8	add x8,x20,#0x10
008e77ec	and x25,x8,#-0x10
008e77f0	mov x0,x25
008e77f4	bl 0x00c2fed0
008e77f8	orr w8,wzr,#0x18
008e77fc	orr x9,x25,#0x1
008e7800	madd x8,x28,x8,x27
008e7804	mov x24,x0
008e7808	stp x20,x0,[x8, #0x8]
008e780c	str x9,[x21]
008e7810	orr w25,wzr,#0x18
008e7814	mov x0,x24
008e7818	mov x1,x22
008e781c	mov x2,x20
008e7820	bl 0x00c2ffd0
008e7824	strb wzr,[x24, x20]
008e7828	ldp x20,x24,[x19]
008e782c	nop
008e7830	madd x8,x26,x25,x27
008e7834	cmp x24,x20
008e7838	add x9,x21,#0x18
008e783c	b.eq 0x008e786c
008e7840	ldur x10,[x24, #-0x8]
008e7844	stur x10,[x21, #-0x8]
008e7848	ldur q0,[x24, #-0x18]
008e784c	stur q0,[x21, #-0x18]
008e7850	stp xzr,xzr,[x24, #-0x18]
008e7854	stur xzr,[x24, #-0x8]
008e7858	sub x24,x24,#0x18
008e785c	cmp x20,x24
008e7860	sub x21,x21,#0x18
008e7864	b.ne 0x008e7840
008e7868	ldp x20,x24,[x19]
008e786c	cmp x24,x20
008e7870	stp x21,x9,[x19]
008e7874	str x8,[x19, #0x10]
008e7878	b.eq 0x008e789c
008e787c	mov x19,x24
008e7880	ldrb w8,[x19, #-0x18]!
008e7884	tbz w8,#0x0,0x008e7890
008e7888	ldur x0,[x24, #-0x8]
008e788c	bl 0x00c301d0
008e7890	cmp x20,x19
008e7894	mov x24,x19
008e7898	b.ne 0x008e7880
008e789c	cbz x20,0x008e78c0
008e78a0	mov x0,x20
008e78a4	ldp x29,x30,[sp, #0x50]
008e78a8	ldp x20,x19,[sp, #0x40]
008e78ac	ldp x22,x21,[sp, #0x30]
008e78b0	ldp x24,x23,[sp, #0x20]
008e78b4	ldp x26,x25,[sp, #0x10]
008e78b8	ldp x28,x27,[sp], #0x60
008e78bc	b 0x00c301d0
008e78c0	ldp x29,x30,[sp, #0x50]
008e78c4	ldp x20,x19,[sp, #0x40]
008e78c8	ldp x22,x21,[sp, #0x30]
008e78cc	ldp x24,x23,[sp, #0x20]
008e78d0	ldp x26,x25,[sp, #0x10]
008e78d4	ldp x28,x27,[sp], #0x60
008e78d8	ret
008e78dc	mov x23,xzr
008e78e0	mov x27,xzr
008e78e4	b 0x008e7790
008e78e8	mov x0,x19
008e78ec	bl 0x00c30bd0
008e78f0	mov x0,x21
008e78f4	bl 0x00c30ce0
