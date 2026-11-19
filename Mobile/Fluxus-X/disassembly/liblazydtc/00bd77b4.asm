; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bd77b4
00bd77b4	paciasp
00bd77b8	sub sp,sp,#0x80
00bd77bc	stp x29,x30,[sp, #0x20]
00bd77c0	stp x28,x27,[sp, #0x30]
00bd77c4	stp x26,x25,[sp, #0x40]
00bd77c8	stp x24,x23,[sp, #0x50]
00bd77cc	stp x22,x21,[sp, #0x60]
00bd77d0	stp x20,x19,[sp, #0x70]
00bd77d4	add x29,sp,#0x20
00bd77d8	mov x22,x1
00bd77dc	mov x20,x1
00bd77e0	mov x28,x0
00bd77e4	ldrb w8,[x22, #0x40]!
00bd77e8	ldr x10,[x22, #0x10]
00bd77ec	ldur x9,[x22, #-0x30]
00bd77f0	tst w8,#0x1
00bd77f4	csinc x8,x10,x22,ne
00bd77f8	cbz x9,0x00bd7810
00bd77fc	ldp x10,x11,[x20, #0x18]
00bd7800	sub x27,x9,x8
00bd7804	sub x21,x10,x8
00bd7808	sub x24,x11,x8
00bd780c	b 0x00bd781c
00bd7810	mov x24,#-0x1
00bd7814	mov x21,#-0x1
00bd7818	mov x27,#-0x1
00bd781c	ldr x9,[x20, #0x28]
00bd7820	add x26,x22,#0x1
00bd7824	cbz x9,0x00bd783c
00bd7828	ldp x10,x11,[x20, #0x30]
00bd782c	sub x25,x9,x8
00bd7830	sub x23,x10,x8
00bd7834	sub x0,x11,x8
00bd7838	b 0x00bd7848
00bd783c	mov x25,#-0x1
00bd7840	mov x23,#-0x1
00bd7844	mov x0,#-0x1
00bd7848	ldr x9,[x20, #0x58]
00bd784c	mov x19,x28
00bd7850	ldrb w10,[x19, #0x40]!
00bd7854	sub x8,x9,x8
00bd7858	cmp x9,#0x0
00bd785c	csinv x1,x8,xzr,ne
00bd7860	tbz w10,#0x0,0x00bd787c
00bd7864	ldr x8,[x28, #0x40]
00bd7868	stp x1,x0,[sp]
00bd786c	ldr x0,[x28, #0x50]
00bd7870	and x1,x8,#-0x2
00bd7874	bl 0x00c2fe80
00bd7878	ldp x1,x0,[sp]
00bd787c	ldr x8,[x22, #0x10]
00bd7880	ldr q0,[x22]
00bd7884	add x10,x28,#0x41
00bd7888	str x8,[x19, #0x10]
00bd788c	str q0,[x19]
00bd7890	strb wzr,[x22]
00bd7894	strb wzr,[x26]
00bd7898	ldrb w8,[x28, #0x40]
00bd789c	ldr x9,[x28, #0x50]
00bd78a0	tst w8,#0x1
00bd78a4	csel x8,x10,x9,eq
00bd78a8	cmn x27,#0x1
00bd78ac	add x9,x8,x27
00bd78b0	add x10,x8,x21
00bd78b4	add x11,x8,x24
00bd78b8	csel x9,xzr,x9,eq
00bd78bc	csel x10,xzr,x10,eq
00bd78c0	stp x9,x10,[x28, #0x10]
00bd78c4	csel x9,xzr,x11,eq
00bd78c8	cmn x25,#0x1
00bd78cc	str x9,[x28, #0x20]
00bd78d0	b.eq 0x00bd78e8
00bd78d4	add x9,x8,x25
00bd78d8	add x10,x8,x0
00bd78dc	add x11,x9,x23
00bd78e0	str x11,[x28, #0x30]
00bd78e4	b 0x00bd78f4
00bd78e8	mov x9,xzr
00bd78ec	mov x10,xzr
00bd78f0	str xzr,[x28, #0x30]
00bd78f4	str x9,[x28, #0x28]
00bd78f8	add x8,x8,x1
00bd78fc	cmn x1,#0x1
00bd7900	ldr w9,[x20, #0x60]
00bd7904	csel x8,xzr,x8,eq
00bd7908	str x10,[x28, #0x38]
00bd790c	str x8,[x28, #0x58]
00bd7910	add x0,sp,#0x10
00bd7914	add x1,x20,#0x8
00bd7918	str w9,[x28, #0x60]
00bd791c	ldrb w8,[x20, #0x40]
00bd7920	ldr x9,[x20, #0x50]
00bd7924	tst w8,#0x1
00bd7928	csel x8,x26,x9,eq
00bd792c	stp x8,x8,[x20, #0x10]
00bd7930	stp x8,x8,[x20, #0x20]
00bd7934	stp x8,x8,[x20, #0x30]
00bd7938	str x8,[x20, #0x58]
00bd793c	bl 0x00c30660
00bd7940	ldr x8,[x28]
00bd7944	ldr x8,[x8, #0x10]
00bd7948	add x1,sp,#0x10
00bd794c	mov x0,x28
00bd7950	blr x8
00bd7954	sub x0,x29,#0x8
00bd7958	add x1,x28,#0x8
00bd795c	bl 0x00c30660
00bd7960	add x0,x28,#0x8
00bd7964	add x1,sp,#0x10
00bd7968	bl 0x00c43f00
00bd796c	sub x0,x29,#0x8
00bd7970	bl 0x00c30090
00bd7974	add x0,sp,#0x10
00bd7978	bl 0x00c30090
00bd797c	mov x0,x28
00bd7980	ldp x20,x19,[sp, #0x70]
00bd7984	ldp x22,x21,[sp, #0x60]
00bd7988	ldp x24,x23,[sp, #0x50]
00bd798c	ldp x26,x25,[sp, #0x40]
00bd7990	ldp x28,x27,[sp, #0x30]
00bd7994	ldp x29,x30,[sp, #0x20]
00bd7998	add sp,sp,#0x80
00bd799c	autiasp
00bd79a0	ret
