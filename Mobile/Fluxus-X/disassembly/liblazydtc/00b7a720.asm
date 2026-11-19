; mbedtls_nist_kw_wrap @ 00b7a720
00b7a720	sub sp,sp,#0xa0
00b7a724	stp x28,x27,[sp, #0x40]
00b7a728	stp x26,x25,[sp, #0x50]
00b7a72c	stp x24,x23,[sp, #0x60]
00b7a730	stp x22,x21,[sp, #0x70]
00b7a734	stp x20,x19,[sp, #0x80]
00b7a738	stp x29,x30,[sp, #0x90]
00b7a73c	add x29,sp,#0x90
00b7a740	mrs x26,tpidr_el0
00b7a744	ldr x8,[x26, #0x28]
00b7a748	mov x20,x5
00b7a74c	mov x19,x4
00b7a750	mov x22,x3
00b7a754	mov w23,w1
00b7a758	mov x21,x0
00b7a75c	str x8,[sp, #0x38]
00b7a760	str xzr,[x5]
00b7a764	cbz w1,0x00b7a7d8
00b7a768	and x8,x22,#0x7
00b7a76c	mov w9,#0x8
00b7a770	tst x22,#0x7
00b7a774	sub x10,x22,#0x1
00b7a778	orr w11,wzr,#0xfffffffe
00b7a77c	sub x8,x9,x8
00b7a780	csel x25,xzr,x8,eq
00b7a784	cmp x10,x11
00b7a788	mov w24,#0xffff9f00
00b7a78c	b.hi 0x00b7a9a0
00b7a790	add x8,x22,x25
00b7a794	add x8,x8,#0x8
00b7a798	cmp x8,x6
00b7a79c	b.hi 0x00b7a9a0
00b7a7a0	mov w8,#0x59a6
00b7a7a4	add x24,x19,#0x8
00b7a7a8	movk w8,#0xa659, LSL #16
00b7a7ac	rev w9,w22
00b7a7b0	mov x0,x24
00b7a7b4	mov x1,x2
00b7a7b8	mov x2,x22
00b7a7bc	stp w8,w9,[x19]
00b7a7c0	bl 0x00c2ffd0
00b7a7c4	add x0,x24,x22
00b7a7c8	mov w1,wzr
00b7a7cc	mov x2,x25
00b7a7d0	bl 0x00c301c0
00b7a7d4	b 0x00b7a834
00b7a7d8	add x8,x22,#0x8
00b7a7dc	cmp x8,x6
00b7a7e0	b.ls 0x00b7a7ec
00b7a7e4	mov w24,#0xffff9f00
00b7a7e8	b 0x00b7a9a0
00b7a7ec	mov x9,#-0x18
00b7a7f0	sub x8,x22,#0x10
00b7a7f4	movk x9,#0x1ff, LSL #48
00b7a7f8	cmp x8,x9
00b7a7fc	mov w24,#0xffff9f00
00b7a800	b.hi 0x00b7a9a0
00b7a804	and x8,x22,#0x7
00b7a808	cbnz x8,0x00b7a9a0
00b7a80c	mov x8,#0xa6a6
00b7a810	movk x8,#0xa6a6, LSL #16
00b7a814	movk x8,#0xa6a6, LSL #32
00b7a818	movk x8,#0xa6a6, LSL #48
00b7a81c	mov x0,x19
00b7a820	str x8,[x0], #0x8
00b7a824	mov x1,x2
00b7a828	mov x2,x22
00b7a82c	bl 0x00c2ff60
00b7a830	mov x25,xzr
00b7a834	add x8,x25,x22
00b7a838	lsr x8,x8,#0x3
00b7a83c	cmp w23,#0x1
00b7a840	add x9,x8,#0x1
00b7a844	str x9,[sp]
00b7a848	b.ne 0x00b7a880
00b7a84c	cmp x22,#0x8
00b7a850	b.hi 0x00b7a880
00b7a854	ldr q0,[x19]
00b7a858	add x1,sp,#0x10
00b7a85c	mov w2,#0x10
00b7a860	add x4,sp,#0x8
00b7a864	mov x0,x21
00b7a868	mov x3,x19
00b7a86c	str q0,[sp, #0x10]
00b7a870	bl 0x00c42180
00b7a874	mov w24,w0
00b7a878	cbnz w0,0x00b7a974
00b7a87c	b 0x00b7a960
00b7a880	cmp x9,#0x3
00b7a884	b.cs 0x00b7a890
00b7a888	mov w24,#0xffff9f00
00b7a88c	b 0x00b7a974
00b7a890	add x8,x8,x8, LSL #0x1
00b7a894	lsl x22,x8,#0x1
00b7a898	cbz x22,0x00b7a960
00b7a89c	ldr x8,[sp]
00b7a8a0	add x23,x19,#0x8
00b7a8a4	mov x25,xzr
00b7a8a8	mov x27,x23
00b7a8ac	add x28,x19,x8, LSL #0x3
00b7a8b0	ldr x8,[x19]
00b7a8b4	add x1,sp,#0x10
00b7a8b8	mov w2,#0x10
00b7a8bc	add x3,sp,#0x28
00b7a8c0	str x8,[sp, #0x10]
00b7a8c4	ldr x8,[x27]
00b7a8c8	add x4,sp,#0x8
00b7a8cc	mov x0,x21
00b7a8d0	str x8,[sp, #0x18]
00b7a8d4	bl 0x00c42180
00b7a8d8	mov w24,w0
00b7a8dc	cbnz w0,0x00b7a974
00b7a8e0	ldr x8,[sp, #0x28]
00b7a8e4	add x25,x25,#0x1
00b7a8e8	lsr x9,x25,#0x38
00b7a8ec	eor w9,w8,w9
00b7a8f0	strb w9,[x19]
00b7a8f4	lsr x9,x25,#0x30
00b7a8f8	eor w9,w9,w8, LSR #0x8
00b7a8fc	strb w9,[x19, #0x1]
00b7a900	lsr x9,x25,#0x28
00b7a904	eor w9,w9,w8, LSR #0x10
00b7a908	strb w9,[x19, #0x2]
00b7a90c	lsr x9,x25,#0x20
00b7a910	eor w9,w9,w8, LSR #0x18
00b7a914	strb w9,[x19, #0x3]
00b7a918	lsr x9,x8,#0x20
00b7a91c	eor w9,w9,w25, LSR #0x18
00b7a920	strb w9,[x19, #0x4]
00b7a924	lsr x9,x8,#0x28
00b7a928	eor w9,w9,w25, LSR #0x10
00b7a92c	strb w9,[x19, #0x5]
00b7a930	lsr x9,x8,#0x30
00b7a934	lsr x8,x8,#0x38
00b7a938	eor w9,w9,w25, LSR #0x8
00b7a93c	eor w8,w8,w25
00b7a940	strb w9,[x19, #0x6]
00b7a944	strb w8,[x19, #0x7]
00b7a948	ldr x8,[sp, #0x30]
00b7a94c	str x8,[x27], #0x8
00b7a950	cmp x27,x28
00b7a954	csel x27,x27,x23,cc
00b7a958	cmp x25,x22
00b7a95c	b.cc 0x00b7a8b0
00b7a960	ldr x8,[sp]
00b7a964	mov w24,wzr
00b7a968	lsl x8,x8,#0x3
00b7a96c	str x8,[x20]
00b7a970	b 0x00b7a988
00b7a974	ldr x8,[sp]
00b7a978	mov x0,x19
00b7a97c	mov w1,wzr
00b7a980	lsl x2,x8,#0x3
00b7a984	bl 0x00c301c0
00b7a988	add x0,sp,#0x10
00b7a98c	mov w1,#0x10
00b7a990	bl 0x00c42220
00b7a994	add x0,sp,#0x28
00b7a998	mov w1,#0x10
00b7a99c	bl 0x00c42220
00b7a9a0	ldr x8,[x26, #0x28]
00b7a9a4	ldr x9,[sp, #0x38]
00b7a9a8	cmp x8,x9
00b7a9ac	b.ne 0x00b7a9d4
00b7a9b0	mov w0,w24
00b7a9b4	ldp x29,x30,[sp, #0x90]
00b7a9b8	ldp x20,x19,[sp, #0x80]
00b7a9bc	ldp x22,x21,[sp, #0x70]
00b7a9c0	ldp x24,x23,[sp, #0x60]
00b7a9c4	ldp x26,x25,[sp, #0x50]
00b7a9c8	ldp x28,x27,[sp, #0x40]
00b7a9cc	add sp,sp,#0xa0
00b7a9d0	ret
00b7a9d4	bl 0x00c2fec0
