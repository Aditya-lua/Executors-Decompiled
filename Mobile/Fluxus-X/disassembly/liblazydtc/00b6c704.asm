; mbedtls_chacha20_update @ 00b6c704
00b6c704	sub sp,sp,#0x70
00b6c708	stp x28,x27,[sp, #0x10]
00b6c70c	stp x26,x25,[sp, #0x20]
00b6c710	stp x24,x23,[sp, #0x30]
00b6c714	stp x22,x21,[sp, #0x40]
00b6c718	stp x20,x19,[sp, #0x50]
00b6c71c	stp x29,x30,[sp, #0x60]
00b6c720	add x29,sp,#0x60
00b6c724	mov x21,x3
00b6c728	mov x20,x2
00b6c72c	mov x19,x0
00b6c730	cbz x1,0x00b6c974
00b6c734	ldr x8,[x19, #0x80]
00b6c738	sub x26,x1,#0x40
00b6c73c	mov x25,xzr
00b6c740	mov x27,x26
00b6c744	cmp x8,#0x3f
00b6c748	b.hi 0x00b6c780
00b6c74c	add x8,x19,x8
00b6c750	ldrb w9,[x20, x25]
00b6c754	ldrb w8,[x8, #0x40]
00b6c758	sub x27,x27,#0x1
00b6c75c	eor w8,w8,w9
00b6c760	strb w8,[x21, x25]
00b6c764	ldr x8,[x19, #0x80]
00b6c768	add x25,x25,#0x1
00b6c76c	cmp x1,x25
00b6c770	add x8,x8,#0x1
00b6c774	str x8,[x19, #0x80]
00b6c778	b.ne 0x00b6c744
00b6c77c	b 0x00b6c974
00b6c780	sub x23,x1,x25
00b6c784	cmp x23,#0x40
00b6c788	b.cc 0x00b6c830
00b6c78c	add x8,x21,x25
00b6c790	and x10,x27,#-0x40
00b6c794	add x9,x20,x25
00b6c798	add x28,x8,#0x20
00b6c79c	add x8,x10,x25
00b6c7a0	add x22,x19,#0x40
00b6c7a4	add x24,x9,#0x20
00b6c7a8	add x8,x8,#0x40
00b6c7ac	str x8,[sp, #0x8]
00b6c7b0	mov x0,x19
00b6c7b4	mov x1,x22
00b6c7b8	bl 0x00b6c998
00b6c7bc	ldr w8,[x19, #0x30]
00b6c7c0	ldr q0,[x19, #0x40]
00b6c7c4	sub x23,x23,#0x40
00b6c7c8	cmp x23,#0x3f
00b6c7cc	add w8,w8,#0x1
00b6c7d0	str w8,[x19, #0x30]
00b6c7d4	ldur q1,[x24, #-0x20]
00b6c7d8	eor v0.16B,v0.16B,v1.16B
00b6c7dc	stur q0,[x28, #-0x20]
00b6c7e0	ldur q0,[x24, #-0x10]
00b6c7e4	ldr q1,[x19, #0x50]
00b6c7e8	eor v0.16B,v1.16B,v0.16B
00b6c7ec	stur q0,[x28, #-0x10]
00b6c7f0	ldr q0,[x24]
00b6c7f4	ldr q1,[x19, #0x60]
00b6c7f8	eor v0.16B,v1.16B,v0.16B
00b6c7fc	str q0,[x28]
00b6c800	ldr q0,[x24, #0x10]
00b6c804	ldr q1,[x19, #0x70]
00b6c808	add x24,x24,#0x40
00b6c80c	eor v0.16B,v1.16B,v0.16B
00b6c810	str q0,[x28, #0x10]
00b6c814	add x28,x28,#0x40
00b6c818	b.hi 0x00b6c7b0
00b6c81c	and x8,x27,#-0x40
00b6c820	sub x8,x26,x8
00b6c824	subs x23,x8,x25
00b6c828	b.eq 0x00b6c974
00b6c82c	ldr x25,[sp, #0x8]
00b6c830	add x22,x19,#0x40
00b6c834	mov x0,x19
00b6c838	mov x1,x22
00b6c83c	bl 0x00b6c998
00b6c840	ldr w8,[x19, #0x30]
00b6c844	mov x9,xzr
00b6c848	cmp x23,#0x10
00b6c84c	add w8,w8,#0x1
00b6c850	str w8,[x19, #0x30]
00b6c854	b.cc 0x00b6c888
00b6c858	mov x10,xzr
00b6c85c	add x8,x21,x25
00b6c860	add x11,x20,x25
00b6c864	ldr q0,[x11,x10]
00b6c868	ldr q1,[x22,x10]
00b6c86c	add x9,x10,#0x10
00b6c870	add x12,x10,#0x20
00b6c874	cmp x12,x23
00b6c878	eor v0.16B,v1.16B,v0.16B
00b6c87c	str q0,[x8,x10]
00b6c880	mov x10,x9
00b6c884	b.ls 0x00b6c864
00b6c888	subs x8,x23,x9
00b6c88c	b.ls 0x00b6c970
00b6c890	cmp x8,#0x1f
00b6c894	b.ls 0x00b6c940
00b6c898	add x10,x25,x9
00b6c89c	add x11,x23,x25
00b6c8a0	add x13,x21,x10
00b6c8a4	add x14,x21,x11
00b6c8a8	add x11,x20,x11
00b6c8ac	add x12,x19,#0x40
00b6c8b0	add x10,x20,x10
00b6c8b4	cmp x13,x11
00b6c8b8	add x15,x12,x9
00b6c8bc	add x12,x12,x23
00b6c8c0	cset w11,cc
00b6c8c4	cmp x10,x14
00b6c8c8	cset w10,cc
00b6c8cc	cmp x13,x12
00b6c8d0	and w12,w11,w10
00b6c8d4	cset w10,cc
00b6c8d8	cmp x15,x14
00b6c8dc	cset w11,cc
00b6c8e0	tbnz w12,#0x0,0x00b6c940
00b6c8e4	and w10,w10,w11
00b6c8e8	tbnz w10,#0x0,0x00b6c940
00b6c8ec	add x11,x25,x9
00b6c8f0	and x10,x8,#-0x20
00b6c8f4	add x13,x19,x9
00b6c8f8	add x12,x11,#0x10
00b6c8fc	add x9,x9,x10
00b6c900	add x11,x21,x12
00b6c904	add x12,x20,x12
00b6c908	add x13,x13,#0x50
00b6c90c	mov x14,x10
00b6c910	ldp q0,q1,[x12, #-0x10]
00b6c914	ldp q2,q3,[x13, #-0x10]
00b6c918	subs x14,x14,#0x20
00b6c91c	add x12,x12,#0x20
00b6c920	add x13,x13,#0x20
00b6c924	eor v0.16B,v2.16B,v0.16B
00b6c928	eor v1.16B,v3.16B,v1.16B
00b6c92c	stp q0,q1,[x11, #-0x10]
00b6c930	add x11,x11,#0x20
00b6c934	b.ne 0x00b6c910
00b6c938	cmp x8,x10
00b6c93c	b.eq 0x00b6c970
00b6c940	add x10,x19,x9
00b6c944	add x11,x9,x25
00b6c948	sub x8,x23,x9
00b6c94c	add x9,x10,#0x40
00b6c950	add x10,x21,x11
00b6c954	add x11,x20,x11
00b6c958	ldrb w12,[x11], #0x1
00b6c95c	ldrb w13,[x9], #0x1
00b6c960	subs x8,x8,#0x1
00b6c964	eor w12,w13,w12
00b6c968	strb w12,[x10], #0x1
00b6c96c	b.ne 0x00b6c958
00b6c970	str x23,[x19, #0x80]
00b6c974	ldp x29,x30,[sp, #0x60]
00b6c978	ldp x20,x19,[sp, #0x50]
00b6c97c	ldp x22,x21,[sp, #0x40]
00b6c980	ldp x24,x23,[sp, #0x30]
00b6c984	ldp x26,x25,[sp, #0x20]
00b6c988	ldp x28,x27,[sp, #0x10]
00b6c98c	mov w0,wzr
00b6c990	add sp,sp,#0x70
00b6c994	ret
