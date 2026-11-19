; std::__ndk1::vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>>::__push_back_slow_path<cpr::Pair> @ 008fc7e0
008fc7e0	stp x22,x21,[sp, #-0x30]!
008fc7e4	stp x20,x19,[sp, #0x10]
008fc7e8	stp x29,x30,[sp, #0x20]
008fc7ec	add x29,sp,#0x20
008fc7f0	ldp x9,x8,[x0]
008fc7f4	orr x10,xzr,#-0x5555555555555556
008fc7f8	movk x10,#0xaaab
008fc7fc	orr x22,xzr,#0x5555555555555555
008fc800	sub x8,x8,x9
008fc804	asr x8,x8,#0x4
008fc808	mul x21,x8,x10
008fc80c	movk x22,#0x555, LSL #48
008fc810	add x8,x21,#0x1
008fc814	mov x19,x0
008fc818	cmp x8,x22
008fc81c	mov x20,x1
008fc820	b.hi 0x008fc970
008fc824	ldr x11,[x19, #0x10]
008fc828	sub x9,x11,x9
008fc82c	asr x9,x9,#0x4
008fc830	mul x9,x9,x10
008fc834	orr x10,xzr,#-0x5555555555555556
008fc838	movk x10,#0xaaa9
008fc83c	movk x10,#0x2aa, LSL #48
008fc840	cmp x9,x10
008fc844	b.hi 0x008fc858
008fc848	lsl x9,x9,#0x1
008fc84c	cmp x9,x8
008fc850	csel x22,x8,x9,cc
008fc854	cbz x22,0x008fc968
008fc858	add x8,x22,x22, LSL #0x1
008fc85c	lsl x0,x8,#0x4
008fc860	bl 0x00c2fed0
008fc864	ldr x8,[x20, #0x10]
008fc868	orr w10,wzr,#0x30
008fc86c	madd x9,x21,x10,x0
008fc870	str x8,[x9, #0x10]
008fc874	ldr q0,[x20]
008fc878	str q0,[x9]
008fc87c	ldr x8,[x20, #0x28]
008fc880	stp xzr,xzr,[x20, #0x8]
008fc884	str xzr,[x20]
008fc888	str x8,[x9, #0x28]
008fc88c	ldur q0,[x20, #0x18]
008fc890	nop
008fc894	madd x8,x22,x10,x0
008fc898	add x10,x9,#0x30
008fc89c	stur q0,[x9, #0x18]
008fc8a0	stp xzr,xzr,[x20, #0x20]
008fc8a4	str xzr,[x20, #0x18]
008fc8a8	ldp x21,x11,[x19]
008fc8ac	cmp x11,x21
008fc8b0	b.eq 0x008fc8fc
008fc8b4	ldur x12,[x11, #-0x20]
008fc8b8	stur x12,[x9, #-0x20]
008fc8bc	ldur q0,[x11, #-0x30]
008fc8c0	stur q0,[x9, #-0x30]
008fc8c4	ldur x12,[x11, #-0x8]
008fc8c8	stp xzr,xzr,[x11, #-0x28]
008fc8cc	stur xzr,[x11, #-0x30]
008fc8d0	stur x12,[x9, #-0x8]
008fc8d4	ldur q0,[x11, #-0x18]
008fc8d8	stur q0,[x9, #-0x18]
008fc8dc	stp xzr,xzr,[x11, #-0x18]
008fc8e0	stur xzr,[x11, #-0x8]
008fc8e4	sub x11,x11,#0x30
008fc8e8	cmp x21,x11
008fc8ec	sub x9,x9,#0x30
008fc8f0	b.ne 0x008fc8b4
008fc8f4	ldp x20,x21,[x19]
008fc8f8	b 0x008fc900
008fc8fc	mov x20,x21
008fc900	cmp x21,x20
008fc904	stp x9,x10,[x19]
008fc908	str x8,[x19, #0x10]
008fc90c	b.eq 0x008fc940
008fc910	ldurb w8,[x21, #-0x18]
008fc914	tbz w8,#0x0,0x008fc920
008fc918	ldur x0,[x21, #-0x8]
008fc91c	bl 0x00c301d0
008fc920	ldurb w8,[x21, #-0x30]
008fc924	sub x19,x21,#0x30
008fc928	tbz w8,#0x0,0x008fc934
008fc92c	ldur x0,[x21, #-0x20]
008fc930	bl 0x00c301d0
008fc934	cmp x20,x19
008fc938	mov x21,x19
008fc93c	b.ne 0x008fc910
008fc940	cbz x20,0x008fc958
008fc944	mov x0,x20
008fc948	ldp x29,x30,[sp, #0x20]
008fc94c	ldp x20,x19,[sp, #0x10]
008fc950	ldp x22,x21,[sp], #0x30
008fc954	b 0x00c301d0
008fc958	ldp x29,x30,[sp, #0x20]
008fc95c	ldp x20,x19,[sp, #0x10]
008fc960	ldp x22,x21,[sp], #0x30
008fc964	ret
008fc968	mov x0,xzr
008fc96c	b 0x008fc864
008fc970	mov x0,x19
008fc974	bl 0x00c30bd0
