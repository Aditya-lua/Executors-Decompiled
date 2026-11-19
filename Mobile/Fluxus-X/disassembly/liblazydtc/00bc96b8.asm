; std::__ndk1::to_wstring @ 00bc96b8
00bc96b8	paciasp
00bc96bc	sub sp,sp,#0x50
00bc96c0	stp x29,x30,[sp, #0x20]
00bc96c4	stp x22,x21,[sp, #0x30]
00bc96c8	stp x20,x19,[sp, #0x40]
00bc96cc	add x29,sp,#0x20
00bc96d0	mov x21,x0
00bc96d4	add x0,sp,#0xc
00bc96d8	mov x19,x8
00bc96dc	add x20,x0,#0x14
00bc96e0	tbz x21,#0x3f,0x00bc96f4
00bc96e4	mov w8,#0x2d
00bc96e8	orr x0,x0,#0x1
00bc96ec	neg x21,x21
00bc96f0	strb w8,[sp, #0xc]
00bc96f4	sub x8,x20,x0
00bc96f8	cmp x8,#0x13
00bc96fc	b.gt 0x00bc9740
00bc9700	orr x9,x21,#0x1
00bc9704	mov w10,#0x40
00bc9708	clz x9,x9
00bc970c	sub w9,w10,w9
00bc9710	mov w10,#0x4d1
00bc9714	mul w9,w9,w10
00bc9718	adrp x10,0x78a000
00bc971c	add x10,x10,#0x248
00bc9720	lsr w9,w9,#0xc
00bc9724	ldr x10,[x10, w9, UXTW #0x3]
00bc9728	cmp x21,x10
00bc972c	cset w10,cc
00bc9730	sub w9,w9,w10
00bc9734	add w9,w9,#0x1
00bc9738	cmp x8,x9
00bc973c	b.lt 0x00bc983c
00bc9740	lsr x8,x21,#0x20
00bc9744	cbnz x8,0x00bc9758
00bc9748	mov w1,w21
00bc974c	bl 0x00bcac54
00bc9750	mov x20,x0
00bc9754	b 0x00bc983c
00bc9758	mov x22,#0xe3ff
00bc975c	movk x22,#0x540b, LSL #16
00bc9760	movk x22,#0x2, LSL #32
00bc9764	cmp x21,x22
00bc9768	b.ls 0x00bc9794
00bc976c	mov x8,#0xd5bf
00bc9770	movk x8,#0xbded, LSL #16
00bc9774	movk x8,#0xfece, LSL #32
00bc9778	movk x8,#0xdbe6, LSL #48
00bc977c	umulh x8,x21,x8
00bc9780	lsr x20,x8,#0x21
00bc9784	mov w1,w20
00bc9788	bl 0x00bcac54
00bc978c	madd x8,x20,x22,x20
00bc9790	sub x21,x21,x8
00bc9794	mov x8,#0xcefd
00bc9798	mov w9,#0xe100
00bc979c	mov w10,#0xde83
00bc97a0	movk x8,#0x8461, LSL #16
00bc97a4	movk w9,#0x5f5, LSL #16
00bc97a8	movk w10,#0x431b, LSL #16
00bc97ac	movk x8,#0x7711, LSL #32
00bc97b0	mov w11,#0x4240
00bc97b4	mov w12,#0x2710
00bc97b8	movk x8,#0xabcc, LSL #48
00bc97bc	movk w11,#0xf, LSL #16
00bc97c0	add x20,x0,#0xa
00bc97c4	umulh x8,x21,x8
00bc97c8	lsr x8,x8,#0x1a
00bc97cc	msub w9,w8,w9,w21
00bc97d0	umull x10,w9,w10
00bc97d4	lsr x10,x10,#0x32
00bc97d8	msub w9,w10,w11,w9
00bc97dc	mov w11,#0x1759
00bc97e0	movk w11,#0xd1b7, LSL #16
00bc97e4	umull x11,w9,w11
00bc97e8	lsr x11,x11,#0x2d
00bc97ec	msub w9,w11,w12,w9
00bc97f0	adrp x12,0x78a000
00bc97f4	add x12,x12,#0x180
00bc97f8	ldrh w8,[x12, x8, LSL #0x1]
00bc97fc	ubfx w13,w9,#0x2,#0xe
00bc9800	strh w8,[x0]
00bc9804	mov w8,#0x147b
00bc9808	ldrh w10,[x12, x10, LSL #0x1]
00bc980c	mul w8,w13,w8
00bc9810	strh w10,[x0, #0x2]
00bc9814	ldrh w10,[x12, x11, LSL #0x1]
00bc9818	mov w11,#0x64
00bc981c	lsr w8,w8,#0x11
00bc9820	strh w10,[x0, #0x4]
00bc9824	msub w9,w8,w11,w9
00bc9828	ldrh w8,[x12, w8, UXTW #0x1]
00bc982c	strh w8,[x0, #0x6]
00bc9830	and x8,x9,#0xffff
00bc9834	ldrh w8,[x12, x8, LSL #0x1]
00bc9838	strh w8,[x0, #0x8]
00bc983c	add x8,sp,#0xc
00bc9840	sub x21,x20,x8
00bc9844	orr x8,xzr,#0x3ffffffffffffff8
00bc9848	cmp x21,x8
00bc984c	b.cs 0x00bc9964
00bc9850	cmp x21,#0x4
00bc9854	b.hi 0x00bc9864
00bc9858	lsl w8,w21,#0x1
00bc985c	strb w8,[x19], #0x4
00bc9860	b 0x00bc988c
00bc9864	orr x8,x21,#0x1
00bc9868	mov w9,#0x8
00bc986c	cmp x8,#0x5
00bc9870	csinc x22,x9,x8,eq
00bc9874	lsl x0,x22,#0x2
00bc9878	bl 0x00c2fed0
00bc987c	orr x8,x22,#0x1
00bc9880	stp x21,x0,[x19, #0x8]
00bc9884	str x8,[x19]
00bc9888	mov x19,x0
00bc988c	add x8,sp,#0xc
00bc9890	cmp x8,x20
00bc9894	b.eq 0x00bc98b0
00bc9898	cmp x21,#0x20
00bc989c	add x11,sp,#0xc
00bc98a0	b.cs 0x00bc98b8
00bc98a4	mov x8,x19
00bc98a8	add x9,sp,#0xc
00bc98ac	b 0x00bc9938
00bc98b0	mov x8,x19
00bc98b4	b 0x00bc9948
00bc98b8	adrp x12,0x29c000
00bc98bc	and x10,x21,#0x3fffffffffffffe0
00bc98c0	adrp x13,0x29d000
00bc98c4	ldr q0,[x12, #0x890]
00bc98c8	adrp x12,0x29c000
00bc98cc	adrp x14,0x29c000
00bc98d0	add x8,x19,x10, LSL #0x2
00bc98d4	ldr q1,[x13, #0xa0]
00bc98d8	ldr q2,[x12, #0xcc0]
00bc98dc	ldr q3,[x14, #0x20]
00bc98e0	add x9,x11,x10
00bc98e4	add x11,x11,#0x10
00bc98e8	add x12,x19,#0x40
00bc98ec	mov x13,x10
00bc98f0	ldp q4,q5,[x11, #-0x10]
00bc98f4	subs x13,x13,#0x20
00bc98f8	add x11,x11,#0x20
00bc98fc	tbl v6.16B,{v4.16B},v3.16B
00bc9900	tbl v7.16B,{v4.16B},v2.16B
00bc9904	tbl v16.16B,{v4.16B},v1.16B
00bc9908	tbl v4.16B,{v4.16B},v0.16B
00bc990c	tbl v17.16B,{v5.16B},v3.16B
00bc9910	stp q7,q6,[x12, #-0x20]
00bc9914	tbl v6.16B,{v5.16B},v2.16B
00bc9918	tbl v7.16B,{v5.16B},v1.16B
00bc991c	tbl v5.16B,{v5.16B},v0.16B
00bc9920	stp q4,q16,[x12, #-0x40]
00bc9924	stp q6,q17,[x12, #0x20]
00bc9928	stp q5,q7,[x12], #0x80
00bc992c	b.ne 0x00bc98f0
00bc9930	cmp x21,x10
00bc9934	b.eq 0x00bc9948
00bc9938	ldrb w10,[x9], #0x1
00bc993c	cmp x9,x20
00bc9940	str w10,[x8], #0x4
00bc9944	b.ne 0x00bc9938
00bc9948	str wzr,[x8]
00bc994c	ldp x20,x19,[sp, #0x40]
00bc9950	ldp x22,x21,[sp, #0x30]
00bc9954	ldp x29,x30,[sp, #0x20]
00bc9958	add sp,sp,#0x50
00bc995c	autiasp
00bc9960	ret
00bc9964	bl 0x00bc5610
