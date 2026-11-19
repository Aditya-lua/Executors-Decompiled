; std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::__push_back_slow_path<cpr::File_const&> @ 008fd810
008fd810	str x25,[sp, #-0x50]!
008fd814	stp x24,x23,[sp, #0x10]
008fd818	stp x22,x21,[sp, #0x20]
008fd81c	stp x20,x19,[sp, #0x30]
008fd820	stp x29,x30,[sp, #0x40]
008fd824	add x29,sp,#0x40
008fd828	ldp x9,x8,[x0]
008fd82c	orr x10,xzr,#-0x5555555555555556
008fd830	movk x10,#0xaaab
008fd834	orr x23,xzr,#0x5555555555555555
008fd838	sub x8,x8,x9
008fd83c	asr x8,x8,#0x4
008fd840	mul x20,x8,x10
008fd844	movk x23,#0x555, LSL #48
008fd848	add x8,x20,#0x1
008fd84c	mov x19,x0
008fd850	cmp x8,x23
008fd854	mov x21,x1
008fd858	b.hi 0x008fd9a0
008fd85c	ldr x11,[x19, #0x10]
008fd860	sub x9,x11,x9
008fd864	asr x9,x9,#0x4
008fd868	mul x9,x9,x10
008fd86c	orr x10,xzr,#-0x5555555555555556
008fd870	movk x10,#0xaaa9
008fd874	movk x10,#0x2aa, LSL #48
008fd878	cmp x9,x10
008fd87c	b.hi 0x008fd890
008fd880	lsl x9,x9,#0x1
008fd884	cmp x9,x8
008fd888	csel x23,x8,x9,cc
008fd88c	cbz x23,0x008fd994
008fd890	add x8,x23,x23, LSL #0x1
008fd894	lsl x0,x8,#0x4
008fd898	bl 0x00c2fed0
008fd89c	mov x22,x0
008fd8a0	mov x24,x0
008fd8a4	orr w25,wzr,#0x30
008fd8a8	madd x20,x20,x25,x24
008fd8ac	mov x0,x20
008fd8b0	mov x1,x21
008fd8b4	bl 0x00c31060
008fd8b8	ldp x22,x10,[x19]
008fd8bc	nop
008fd8c0	madd x8,x23,x25,x24
008fd8c4	add x9,x20,#0x30
008fd8c8	cmp x10,x22
008fd8cc	b.eq 0x008fd918
008fd8d0	ldur x11,[x10, #-0x20]
008fd8d4	stur x11,[x20, #-0x20]
008fd8d8	ldur q0,[x10, #-0x30]
008fd8dc	stur q0,[x20, #-0x30]
008fd8e0	ldur x11,[x10, #-0x8]
008fd8e4	stp xzr,xzr,[x10, #-0x28]
008fd8e8	stur xzr,[x10, #-0x30]
008fd8ec	stur x11,[x20, #-0x8]
008fd8f0	ldur q0,[x10, #-0x18]
008fd8f4	stur q0,[x20, #-0x18]
008fd8f8	stp xzr,xzr,[x10, #-0x18]
008fd8fc	stur xzr,[x10, #-0x8]
008fd900	sub x10,x10,#0x30
008fd904	cmp x22,x10
008fd908	sub x20,x20,#0x30
008fd90c	b.ne 0x008fd8d0
008fd910	ldp x21,x22,[x19]
008fd914	b 0x008fd91c
008fd918	mov x21,x22
008fd91c	cmp x22,x21
008fd920	stp x20,x9,[x19]
008fd924	str x8,[x19, #0x10]
008fd928	b.eq 0x008fd95c
008fd92c	ldurb w8,[x22, #-0x18]
008fd930	tbz w8,#0x0,0x008fd93c
008fd934	ldur x0,[x22, #-0x8]
008fd938	bl 0x00c301d0
008fd93c	ldurb w8,[x22, #-0x30]
008fd940	sub x19,x22,#0x30
008fd944	tbz w8,#0x0,0x008fd950
008fd948	ldur x0,[x22, #-0x20]
008fd94c	bl 0x00c301d0
008fd950	cmp x21,x19
008fd954	mov x22,x19
008fd958	b.ne 0x008fd92c
008fd95c	cbz x21,0x008fd97c
008fd960	mov x0,x21
008fd964	ldp x29,x30,[sp, #0x40]
008fd968	ldp x20,x19,[sp, #0x30]
008fd96c	ldp x22,x21,[sp, #0x20]
008fd970	ldp x24,x23,[sp, #0x10]
008fd974	ldr x25,[sp], #0x50
008fd978	b 0x00c301d0
008fd97c	ldp x29,x30,[sp, #0x40]
008fd980	ldp x20,x19,[sp, #0x30]
008fd984	ldp x22,x21,[sp, #0x20]
008fd988	ldp x24,x23,[sp, #0x10]
008fd98c	ldr x25,[sp], #0x50
008fd990	ret
008fd994	mov x22,xzr
008fd998	mov x24,xzr
008fd99c	b 0x008fd8a4
008fd9a0	mov x0,x19
008fd9a4	bl 0x00c30bd0
