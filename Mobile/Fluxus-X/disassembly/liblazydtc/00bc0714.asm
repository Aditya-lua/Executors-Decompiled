; HUF_readStats_wksp @ 00bc0714
00bc0714	cbz x6,0x00bc078c
00bc0718	stp x29,x30,[sp, #-0x40]!
00bc071c	str x23,[sp, #0x10]
00bc0720	stp x22,x21,[sp, #0x20]
00bc0724	stp x20,x19,[sp, #0x30]
00bc0728	mov x29,sp
00bc072c	ldrsb w9,[x5]
00bc0730	mov x8,x0
00bc0734	and x19,x9,#0xff
00bc0738	tbnz w9,#0x1f,0x00bc0794
00bc073c	cmp x6,x19
00bc0740	b.ls 0x00bc0904
00bc0744	ldr x6,[x29, #0x40]
00bc0748	mov x22,x4
00bc074c	mov x21,x2
00bc0750	mov x20,x3
00bc0754	sub x1,x1,#0x1
00bc0758	add x2,x5,#0x1
00bc075c	mov x0,x8
00bc0760	mov x3,x19
00bc0764	mov w4,#0x6
00bc0768	mov x5,x7
00bc076c	mov w7,wzr
00bc0770	mov x23,x8
00bc0774	bl 0x00c43770
00bc0778	mov x9,x19
00bc077c	cmn x0,#0x78
00bc0780	mov x8,x0
00bc0784	b.ls 0x00bc082c
00bc0788	b 0x00bc0920
00bc078c	mov x0,#-0x48
00bc0790	ret
00bc0794	sub x9,x19,#0x7e
00bc0798	lsr x9,x9,#0x1
00bc079c	cmp x9,x6
00bc07a0	b.cs 0x00bc0904
00bc07a4	sub x0,x19,#0x7f
00bc07a8	cmp x0,x1
00bc07ac	b.cs 0x00bc091c
00bc07b0	cbz x0,0x00bc090c
00bc07b4	sub x11,x19,#0x80
00bc07b8	cmp x11,#0xd
00bc07bc	b.ls 0x00bc07e8
00bc07c0	add x10,x5,x11, LSR #0x1
00bc07c4	add x10,x10,#0x2
00bc07c8	cmp x8,x10
00bc07cc	add x10,x5,#0x1
00bc07d0	b.cs 0x00bc0938
00bc07d4	and x12,x19,#0x7e
00bc07d8	add x12,x8,x12
00bc07dc	add x12,x12,#0x2
00bc07e0	cmp x10,x12
00bc07e4	b.cs 0x00bc0938
00bc07e8	mov x21,x2
00bc07ec	mov x20,x3
00bc07f0	mov x13,xzr
00bc07f4	add x10,x5,x13, LSR #0x1
00bc07f8	mov x22,x4
00bc07fc	add x10,x10,#0x1
00bc0800	ldrb w11,[x10]
00bc0804	add x12,x8,x13
00bc0808	add x13,x13,#0x2
00bc080c	cmp x13,x0
00bc0810	lsr w11,w11,#0x4
00bc0814	strb w11,[x12]
00bc0818	ldrb w11,[x10], #0x1
00bc081c	and w11,w11,#0xf
00bc0820	strb w11,[x12, #0x1]
00bc0824	b.cc 0x00bc0800
00bc0828	mov x23,x8
00bc082c	movi v0.2D,#0x0
00bc0830	str wzr,[x21, #0x30]
00bc0834	stp q0,q0,[x21, #0x10]
00bc0838	str q0,[x21]
00bc083c	cbz x0,0x00bc091c
00bc0840	mov x11,xzr
00bc0844	mov w10,wzr
00bc0848	mov w12,#0x1
00bc084c	mov w13,#0x1
00bc0850	mov x8,x23
00bc0854	ldrb w14,[x8, x11]
00bc0858	cmp x14,#0xc
00bc085c	b.hi 0x00bc091c
00bc0860	ldr w15,[x21, x14, LSL #0x2]
00bc0864	add w15,w15,#0x1
00bc0868	str w15,[x21, x14, LSL #0x2]
00bc086c	ldrb w14,[x8, x11]
00bc0870	mov w11,w13
00bc0874	add w13,w13,#0x1
00bc0878	cmp x0,x11
00bc087c	lsl w14,w12,w14
00bc0880	add w10,w10,w14, ASR #0x1
00bc0884	b.hi 0x00bc0854
00bc0888	cbz w10,0x00bc091c
00bc088c	clz w11,w10
00bc0890	eor w12,w11,#0x1c
00bc0894	cmp w12,#0xb
00bc0898	b.hi 0x00bc091c
00bc089c	neg w12,w11
00bc08a0	mov w13,#0x1
00bc08a4	lsl w12,w13,w12
00bc08a8	sub w13,w12,w10
00bc08ac	mov w12,#0x80000000
00bc08b0	clz w10,w13
00bc08b4	lsr w14,w12,w10
00bc08b8	mov w12,#0x20
00bc08bc	sub w11,w12,w11
00bc08c0	cmp w14,w13
00bc08c4	str w11,[x22]
00bc08c8	b.ne 0x00bc091c
00bc08cc	sub w10,w12,w10
00bc08d0	strb w10,[x8, x0]
00bc08d4	ldr w8,[x21, w10, UXTW #0x2]
00bc08d8	add w8,w8,#0x1
00bc08dc	str w8,[x21, w10, UXTW #0x2]
00bc08e0	ldr w10,[x21, #0x4]
00bc08e4	mov x8,#-0x14
00bc08e8	cmp w10,#0x2
00bc08ec	b.cc 0x00bc0920
00bc08f0	tbnz w10,#0x0,0x00bc0920
00bc08f4	add w8,w0,#0x1
00bc08f8	str w8,[x20]
00bc08fc	add x8,x9,#0x1
00bc0900	b 0x00bc0920
00bc0904	mov x8,#-0x48
00bc0908	b 0x00bc0920
00bc090c	movi v0.2D,#0x0
00bc0910	str wzr,[x2, #0x30]
00bc0914	stp q0,q0,[x2, #0x10]
00bc0918	str q0,[x2]
00bc091c	mov x8,#-0x14
00bc0920	ldp x20,x19,[sp, #0x30]
00bc0924	ldr x23,[sp, #0x10]
00bc0928	ldp x22,x21,[sp, #0x20]
00bc092c	ldp x29,x30,[sp], #0x40
00bc0930	mov x0,x8
00bc0934	ret
00bc0938	lsr x12,x11,#0x1
00bc093c	cmp x11,#0x3e
00bc0940	add x11,x12,#0x1
00bc0944	b.cs 0x00bc0950
00bc0948	mov x12,xzr
00bc094c	b 0x00bc09b8
00bc0950	movi v0.16B,#0xf
00bc0954	mov x21,x2
00bc0958	mov x20,x3
00bc095c	mov x13,xzr
00bc0960	and x12,x11,#0x60
00bc0964	add x14,x8,#0x20
00bc0968	and x15,x13,#0x7fffffffffffffe0
00bc096c	add x13,x13,#0x20
00bc0970	add x15,x10,x15
00bc0974	cmp x12,x13
00bc0978	ldp q1,q2,[x15]
00bc097c	sub x15,x14,#0x20
00bc0980	ushr v5.16B,v2.16B,#0x4
00bc0984	ushr v3.16B,v1.16B,#0x4
00bc0988	and v6.16B,v2.16B,v0.16B
00bc098c	and v4.16B,v1.16B,v0.16B
00bc0990	st2 {v5.16B,v6.16B},[x14]
00bc0994	add x14,x14,#0x40
00bc0998	st2 {v3.16B,v4.16B},[x15]
00bc099c	b.ne 0x00bc0968
00bc09a0	cmp x11,x12
00bc09a4	b.eq 0x00bc09f8
00bc09a8	tst x11,#0x18
00bc09ac	mov x3,x20
00bc09b0	mov x2,x21
00bc09b4	b.eq 0x00bc0a00
00bc09b8	movi v0.8B,#0xf
00bc09bc	and x14,x11,#0x78
00bc09c0	add x15,x8,x12, LSL #0x1
00bc09c4	lsl x13,x14,#0x1
00bc09c8	mov x21,x2
00bc09cc	mov x20,x3
00bc09d0	and x16,x12,#0x7ffffffffffffff8
00bc09d4	add x12,x12,#0x8
00bc09d8	ldr d1,[x10,x16]
00bc09dc	cmp x14,x12
00bc09e0	ushr v2.8B,v1.8B,#0x4
00bc09e4	and v3.8B,v1.8B,v0.8B
00bc09e8	st2 {v2.8B,v3.8B},[x15], #0x10
00bc09ec	b.ne 0x00bc09d0
00bc09f0	cmp x11,x14
00bc09f4	b.ne 0x00bc07f4
00bc09f8	mov x22,x4
00bc09fc	b 0x00bc0828
00bc0a00	lsl x13,x12,#0x1
00bc0a04	b 0x00bc07f4
