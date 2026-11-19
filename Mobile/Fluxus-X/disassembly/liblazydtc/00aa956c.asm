; CRYPTO_ctr128_encrypt_ctr32 @ 00aa956c
00aa956c	sub sp,sp,#0x70
00aa9570	stp x28,x27,[sp, #0x10]
00aa9574	stp x26,x25,[sp, #0x20]
00aa9578	stp x24,x23,[sp, #0x30]
00aa957c	stp x22,x21,[sp, #0x40]
00aa9580	stp x20,x19,[sp, #0x50]
00aa9584	stp x29,x30,[sp, #0x60]
00aa9588	ldr w28,[x6]
00aa958c	mov x25,x7
00aa9590	mov x20,x5
00aa9594	mov x24,x4
00aa9598	mov x26,x3
00aa959c	mov x21,x2
00aa95a0	mov x22,x1
00aa95a4	mov x23,x0
00aa95a8	add x29,sp,#0x60
00aa95ac	str x6,[sp, #0x8]
00aa95b0	cbz x2,0x00aa95dc
00aa95b4	cbz w28,0x00aa95dc
00aa95b8	ldrb w8,[x23], #0x1
00aa95bc	ldrb w9,[x20, w28, UXTW ]
00aa95c0	add w10,w28,#0x1
00aa95c4	subs x21,x21,#0x1
00aa95c8	and w28,w10,#0xf
00aa95cc	eor w8,w9,w8
00aa95d0	strb w8,[x22], #0x1
00aa95d4	b.eq 0x00aa95dc
00aa95d8	cbnz w28,0x00aa95b8
00aa95dc	ldr w8,[x24, #0xc]
00aa95e0	cmp x21,#0x10
00aa95e4	rev w19,w8
00aa95e8	b.cc 0x00aa96f4
00aa95ec	lsr x9,x21,#0x20
00aa95f0	lsr x8,x21,#0x4
00aa95f4	cmp x9,#0x0
00aa95f8	mov w9,#0x10000000
00aa95fc	csel x8,x8,x9,eq
00aa9600	add w9,w19,w8
00aa9604	cmp x8,x9
00aa9608	csel w19,wzr,w9,hi
00aa960c	csel x9,x9,xzr,hi
00aa9610	sub x27,x8,x9
00aa9614	mov x0,x23
00aa9618	mov x1,x22
00aa961c	mov x2,x27
00aa9620	mov x3,x26
00aa9624	mov x4,x24
00aa9628	blr x25
00aa962c	lsr w8,w19,#0x18
00aa9630	lsr w9,w19,#0x10
00aa9634	lsr w10,w19,#0x8
00aa9638	strb w8,[x24, #0xc]
00aa963c	strb w9,[x24, #0xd]
00aa9640	strb w10,[x24, #0xe]
00aa9644	strb w19,[x24, #0xf]
00aa9648	cbnz w19,0x00aa96dc
00aa964c	ldrb w8,[x24, #0xb]
00aa9650	ldrb w9,[x24, #0xa]
00aa9654	ldrb w10,[x24, #0x9]
00aa9658	add w8,w8,#0x1
00aa965c	strb w8,[x24, #0xb]
00aa9660	add w8,w9,w8, LSR #0x8
00aa9664	ldrb w9,[x24, #0x8]
00aa9668	strb w8,[x24, #0xa]
00aa966c	add w8,w10,w8, LSR #0x8
00aa9670	ldrb w10,[x24, #0x7]
00aa9674	strb w8,[x24, #0x9]
00aa9678	add w8,w9,w8, LSR #0x8
00aa967c	ldrb w9,[x24, #0x6]
00aa9680	strb w8,[x24, #0x8]
00aa9684	add w8,w10,w8, LSR #0x8
00aa9688	ldrb w10,[x24, #0x5]
00aa968c	strb w8,[x24, #0x7]
00aa9690	add w8,w9,w8, LSR #0x8
00aa9694	ldrb w9,[x24, #0x4]
00aa9698	strb w8,[x24, #0x6]
00aa969c	add w8,w10,w8, LSR #0x8
00aa96a0	ldrb w10,[x24, #0x3]
00aa96a4	strb w8,[x24, #0x5]
00aa96a8	add w8,w9,w8, LSR #0x8
00aa96ac	ldrb w9,[x24, #0x2]
00aa96b0	strb w8,[x24, #0x4]
00aa96b4	add w8,w10,w8, LSR #0x8
00aa96b8	ldrb w10,[x24, #0x1]
00aa96bc	strb w8,[x24, #0x3]
00aa96c0	add w8,w9,w8, LSR #0x8
00aa96c4	ldrb w9,[x24]
00aa96c8	strb w8,[x24, #0x2]
00aa96cc	add w8,w10,w8, LSR #0x8
00aa96d0	strb w8,[x24, #0x1]
00aa96d4	add w8,w9,w8, LSR #0x8
00aa96d8	strb w8,[x24]
00aa96dc	lsl x8,x27,#0x4
00aa96e0	sub x21,x21,x8
00aa96e4	add x22,x22,x8
00aa96e8	cmp x21,#0xf
00aa96ec	add x23,x23,x8
00aa96f0	b.hi 0x00aa95ec
00aa96f4	cbz x21,0x00aa98bc
00aa96f8	mov w2,#0x1
00aa96fc	mov x0,x20
00aa9700	mov x1,x20
00aa9704	mov x3,x26
00aa9708	mov x4,x24
00aa970c	stp xzr,xzr,[x20]
00aa9710	blr x25
00aa9714	adds w8,w19,#0x1
00aa9718	lsr w9,w8,#0x18
00aa971c	lsr w10,w8,#0x10
00aa9720	lsr w11,w8,#0x8
00aa9724	strb w9,[x24, #0xc]
00aa9728	strb w10,[x24, #0xd]
00aa972c	strb w11,[x24, #0xe]
00aa9730	strb w8,[x24, #0xf]
00aa9734	b.eq 0x00aa9744
00aa9738	cmp x21,#0x20
00aa973c	b.cs 0x00aa97dc
00aa9740	b 0x00aa9890
00aa9744	ldrb w8,[x24, #0xb]
00aa9748	ldrb w9,[x24, #0xa]
00aa974c	ldrb w10,[x24, #0x9]
00aa9750	add w8,w8,#0x1
00aa9754	strb w8,[x24, #0xb]
00aa9758	add w8,w9,w8, LSR #0x8
00aa975c	ldrb w9,[x24, #0x8]
00aa9760	strb w8,[x24, #0xa]
00aa9764	add w8,w10,w8, LSR #0x8
00aa9768	ldrb w10,[x24, #0x7]
00aa976c	strb w8,[x24, #0x9]
00aa9770	add w8,w9,w8, LSR #0x8
00aa9774	ldrb w9,[x24, #0x6]
00aa9778	strb w8,[x24, #0x8]
00aa977c	add w8,w10,w8, LSR #0x8
00aa9780	ldrb w10,[x24, #0x5]
00aa9784	strb w8,[x24, #0x7]
00aa9788	add w8,w9,w8, LSR #0x8
00aa978c	ldrb w9,[x24, #0x4]
00aa9790	strb w8,[x24, #0x6]
00aa9794	add w8,w10,w8, LSR #0x8
00aa9798	ldrb w10,[x24, #0x3]
00aa979c	strb w8,[x24, #0x5]
00aa97a0	add w8,w9,w8, LSR #0x8
00aa97a4	ldrb w9,[x24, #0x2]
00aa97a8	strb w8,[x24, #0x4]
00aa97ac	add w8,w10,w8, LSR #0x8
00aa97b0	ldrb w10,[x24, #0x1]
00aa97b4	strb w8,[x24, #0x3]
00aa97b8	add w8,w9,w8, LSR #0x8
00aa97bc	ldrb w9,[x24]
00aa97c0	strb w8,[x24, #0x2]
00aa97c4	add w8,w10,w8, LSR #0x8
00aa97c8	strb w8,[x24, #0x1]
00aa97cc	add w8,w9,w8, LSR #0x8
00aa97d0	strb w8,[x24]
00aa97d4	cmp x21,#0x20
00aa97d8	b.cc 0x00aa9890
00aa97dc	sub x8,x21,#0x1
00aa97e0	cmn w28,w8
00aa97e4	b.cs 0x00aa9890
00aa97e8	lsr x8,x8,#0x20
00aa97ec	cbnz x8,0x00aa9890
00aa97f0	mov w8,w28
00aa97f4	add x10,x21,x8
00aa97f8	add x9,x22,x8
00aa97fc	add x11,x23,x8
00aa9800	add x12,x20,x8
00aa9804	add x8,x23,x10
00aa9808	add x13,x22,x10
00aa980c	cmp x9,x8
00aa9810	add x10,x20,x10
00aa9814	cset w8,cc
00aa9818	cmp x11,x13
00aa981c	cset w11,cc
00aa9820	cmp x9,x10
00aa9824	and w10,w8,w11
00aa9828	cset w8,cc
00aa982c	cmp x12,x13
00aa9830	cset w9,cc
00aa9834	tbnz w10,#0x0,0x00aa9890
00aa9838	and w8,w8,w9
00aa983c	tbnz w8,#0x0,0x00aa9890
00aa9840	and x10,x21,#-0x20
00aa9844	add w8,w28,w10
00aa9848	sub x9,x21,x10
00aa984c	mov x11,x10
00aa9850	mov w12,w28
00aa9854	mov w13,w12
00aa9858	add x14,x23,x13
00aa985c	add x15,x20,x13
00aa9860	ldp q0,q1,[x14]
00aa9864	ldp q2,q3,[x15]
00aa9868	subs x11,x11,#0x20
00aa986c	add x13,x22,x13
00aa9870	add w12,w12,#0x20
00aa9874	eor v0.16B,v2.16B,v0.16B
00aa9878	eor v1.16B,v3.16B,v1.16B
00aa987c	stp q0,q1,[x13]
00aa9880	b.ne 0x00aa9854
00aa9884	cmp x21,x10
00aa9888	b.ne 0x00aa9898
00aa988c	b 0x00aa98b8
00aa9890	mov w8,w28
00aa9894	mov x9,x21
00aa9898	mov w10,w8
00aa989c	ldrb w11,[x23, x10]
00aa98a0	ldrb w12,[x20, x10]
00aa98a4	subs x9,x9,#0x1
00aa98a8	add w8,w8,#0x1
00aa98ac	eor w11,w12,w11
00aa98b0	strb w11,[x22, x10]
00aa98b4	b.ne 0x00aa9898
00aa98b8	add w28,w28,w21
00aa98bc	ldr x8,[sp, #0x8]
00aa98c0	str w28,[x8]
00aa98c4	ldp x29,x30,[sp, #0x60]
00aa98c8	ldp x20,x19,[sp, #0x50]
00aa98cc	ldp x22,x21,[sp, #0x40]
00aa98d0	ldp x24,x23,[sp, #0x30]
00aa98d4	ldp x26,x25,[sp, #0x20]
00aa98d8	ldp x28,x27,[sp, #0x10]
00aa98dc	add sp,sp,#0x70
00aa98e0	ret
