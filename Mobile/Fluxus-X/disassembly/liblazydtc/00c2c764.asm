; FUN_00c2c764 @ 00c2c764
00c2c764	paciasp
00c2c768	sub sp,sp,#0x50
00c2c76c	stp x29,x30,[sp, #0x10]
00c2c770	stp x24,x23,[sp, #0x20]
00c2c774	stp x22,x21,[sp, #0x30]
00c2c778	stp x20,x19,[sp, #0x40]
00c2c77c	add x29,sp,#0x10
00c2c780	movi d0,#0xff000000ff00
00c2c784	sturh wzr,[x2, #0x33]
00c2c788	mov x8,x1
00c2c78c	stp xzr,xzr,[x2, #0x20]
00c2c790	mov x19,x2
00c2c794	mov x20,x1
00c2c798	strh wzr,[x2, #0x30]
00c2c79c	mov x21,x0
00c2c7a0	str x1,[x2]
00c2c7a4	str s0,[x2, #0x18]
00c2c7a8	ldr w9,[x8], #0x4
00c2c7ac	cmn w9,#0x1
00c2c7b0	b.eq 0x00c2c7d0
00c2c7b4	add x22,x8,x9
00c2c7b8	cbz x9,0x00c2c7e0
00c2c7bc	ldr w9,[x8]
00c2c7c0	cbz w9,0x00c2c7e8
00c2c7c4	adrp x0,0x2d4000
00c2c7c8	add x0,x0,#0xce9
00c2c7cc	b 0x00c2c9dc
00c2c7d0	ldur x9,[x20, #0x4]
00c2c7d4	add x8,x20,#0xc
00c2c7d8	add x22,x9,x8
00c2c7dc	cbnz x9,0x00c2c7bc
00c2c7e0	mov x0,xzr
00c2c7e4	b 0x00c2c9dc
00c2c7e8	ldrb w24,[x8, #0x4]
00c2c7ec	and w9,w24,#0xfffffffd
00c2c7f0	cmp w9,#0x1
00c2c7f4	b.ne 0x00c2c8a0
00c2c7f8	add x23,x8,#0x5
00c2c7fc	mov x8,x23
00c2c800	ldrb w9,[x8], #0x1
00c2c804	cbnz w9,0x00c2c800
00c2c808	add x0,sp,#0x8
00c2c80c	mov x1,x22
00c2c810	str x8,[sp, #0x8]
00c2c814	bl 0x00c2e6c8
00c2c818	ldr x8,[sp, #0x8]
00c2c81c	mov x9,xzr
00c2c820	mov x11,#-0x7
00c2c824	str w0,[x19, #0x28]
00c2c828	mov x10,x8
00c2c82c	cmp x10,x22
00c2c830	b.eq 0x00c2c9f8
00c2c834	ldrb w12,[x10], #0x1
00c2c838	add x11,x11,#0x7
00c2c83c	add x8,x8,#0x1
00c2c840	and x13,x12,#0x7f
00c2c844	lsl x13,x13,x11
00c2c848	orr x9,x13,x9
00c2c84c	tbnz w12,#0x7,0x00c2c82c
00c2c850	add w13,w11,#0x7
00c2c854	mov x14,#-0x1
00c2c858	cmp x11,#0x39
00c2c85c	mov w11,#0x3f
00c2c860	lsl x13,x14,x13
00c2c864	str x8,[sp, #0x8]
00c2c868	ccmp w12,w11,#0x0,cc
00c2c86c	csel w11,w13,wzr,hi
00c2c870	cmp w24,#0x1
00c2c874	orr w9,w9,w11
00c2c878	str w9,[x19, #0x2c]
00c2c87c	b.ne 0x00c2c8ac
00c2c880	add x8,x8,#0x1
00c2c884	str x8,[sp, #0x8]
00c2c888	ldrb w0,[x10]
00c2c88c	strb w0,[x19, #0x32]
00c2c890	ldrb w8,[x23]
00c2c894	cmp w8,#0x7a
00c2c898	b.eq 0x00c2c8c8
00c2c89c	b 0x00c2c9c8
00c2c8a0	adrp x0,0x2a7000
00c2c8a4	add x0,x0,#0x8
00c2c8a8	b 0x00c2c9dc
00c2c8ac	add x0,sp,#0x8
00c2c8b0	mov x1,x22
00c2c8b4	bl 0x00c2e6c8
00c2c8b8	strb w0,[x19, #0x32]
00c2c8bc	ldrb w8,[x23]
00c2c8c0	cmp w8,#0x7a
00c2c8c4	b.ne 0x00c2c9c8
00c2c8c8	add x0,sp,#0x8
00c2c8cc	mov x1,x22
00c2c8d0	bl 0x00c2e6c8
00c2c8d4	mov w24,#0x1
00c2c8d8	b 0x00c2c8e4
00c2c8dc	strb w24,[x19, #0x30]
00c2c8e0	add x23,x23,#0x1
00c2c8e4	ldrb w8,[x23]
00c2c8e8	cmp w8,#0x4f
00c2c8ec	b.le 0x00c2c920
00c2c8f0	cmp w8,#0x52
00c2c8f4	b.gt 0x00c2c950
00c2c8f8	cmp w8,#0x50
00c2c8fc	b.eq 0x00c2c98c
00c2c900	cmp w8,#0x52
00c2c904	b.ne 0x00c2c984
00c2c908	ldr x8,[sp, #0x8]
00c2c90c	add x23,x23,#0x1
00c2c910	ldrb w9,[x8], #0x1
00c2c914	str x8,[sp, #0x8]
00c2c918	strb w9,[x19, #0x18]
00c2c91c	b 0x00c2c8e4
00c2c920	cmp w8,#0x46
00c2c924	b.le 0x00c2c96c
00c2c928	cmp w8,#0x47
00c2c92c	b.eq 0x00c2c980
00c2c930	cmp w8,#0x4c
00c2c934	b.ne 0x00c2c984
00c2c938	ldr x8,[sp, #0x8]
00c2c93c	add x23,x23,#0x1
00c2c940	ldrb w9,[x8], #0x1
00c2c944	str x8,[sp, #0x8]
00c2c948	strb w9,[x19, #0x19]
00c2c94c	b 0x00c2c8e4
00c2c950	cmp w8,#0x53
00c2c954	b.eq 0x00c2c8dc
00c2c958	cmp w8,#0x7a
00c2c95c	b.ne 0x00c2c984
00c2c960	strb w24,[x19, #0x31]
00c2c964	add x23,x23,#0x1
00c2c968	b 0x00c2c8e4
00c2c96c	cmp w8,#0x42
00c2c970	b.ne 0x00c2c9c4
00c2c974	strb w24,[x19, #0x33]
00c2c978	add x23,x23,#0x1
00c2c97c	b 0x00c2c8e4
00c2c980	strb w24,[x19, #0x34]
00c2c984	add x23,x23,#0x1
00c2c988	b 0x00c2c8e4
00c2c98c	ldr x8,[sp, #0x8]
00c2c990	add x1,sp,#0x8
00c2c994	mov x0,x21
00c2c998	mov x2,x22
00c2c99c	mov x4,xzr
00c2c9a0	ldrb w3,[x8], #0x1
00c2c9a4	str x8,[sp, #0x8]
00c2c9a8	sub w8,w8,w20
00c2c9ac	strb w3,[x19, #0x1a]
00c2c9b0	strb w8,[x19, #0x1b]
00c2c9b4	bl 0x00c2e33c
00c2c9b8	str x0,[x19, #0x20]
00c2c9bc	add x23,x23,#0x1
00c2c9c0	b 0x00c2c8e4
00c2c9c4	cbnz w8,0x00c2c984
00c2c9c8	ldr x8,[x19]
00c2c9cc	ldr x9,[sp, #0x8]
00c2c9d0	mov x0,xzr
00c2c9d4	sub x8,x22,x8
00c2c9d8	stp x8,x9,[x19, #0x8]
00c2c9dc	ldp x20,x19,[sp, #0x40]
00c2c9e0	ldp x22,x21,[sp, #0x30]
00c2c9e4	ldp x24,x23,[sp, #0x20]
00c2c9e8	ldp x29,x30,[sp, #0x10]
00c2c9ec	add sp,sp,#0x50
00c2c9f0	autiasp
00c2c9f4	ret
00c2c9f8	adrp x19,0xcb4000
00c2c9fc	adrp x1,0x2a1000
00c2ca00	add x1,x1,#0x45d
00c2ca04	ldr x19,[x19, #0xba0]
00c2ca08	adrp x2,0x2c2000
00c2ca0c	add x2,x2,#0xcb4
00c2ca10	adrp x3,0x2b3000
00c2ca14	add x3,x3,#0x329
00c2ca18	add x0,x19,#0x130
00c2ca1c	bl 0x00c30940
00c2ca20	add x0,x19,#0x130
00c2ca24	bl 0x00c30c50
00c2ca28	bl 0x00c30b40
