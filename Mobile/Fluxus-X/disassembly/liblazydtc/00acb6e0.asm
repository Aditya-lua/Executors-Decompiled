; RC2_ofb64_encrypt @ 00acb6e0
00acb6e0	sub sp,sp,#0x70
00acb6e4	stp x26,x25,[sp, #0x20]
00acb6e8	stp x24,x23,[sp, #0x30]
00acb6ec	stp x22,x21,[sp, #0x40]
00acb6f0	stp x20,x19,[sp, #0x50]
00acb6f4	stp x29,x30,[sp, #0x60]
00acb6f8	ldrb w8,[x4]
00acb6fc	ldrb w9,[x4, #0x1]
00acb700	ldrb w12,[x4, #0x4]
00acb704	ldrb w13,[x4, #0x5]
00acb708	ldrb w10,[x4, #0x2]
00acb70c	ldrb w14,[x4, #0x6]
00acb710	ldrb w11,[x4, #0x3]
00acb714	ldrb w15,[x4, #0x7]
00acb718	ldr w25,[x5]
00acb71c	strb w8,[sp, #0x18]
00acb720	strb w12,[sp, #0x1c]
00acb724	bfm x8,x9,#0x38,#0x7
00acb728	bfm x12,x13,#0x38,#0x7
00acb72c	bfm x8,x10,#0x30,#0x7
00acb730	bfm x12,x14,#0x30,#0x7
00acb734	mov x19,x5
00acb738	bfm x8,x11,#0x28,#0x7
00acb73c	bfm x12,x15,#0x28,#0x7
00acb740	str x27,[sp, #0x10]
00acb744	add x29,sp,#0x60
00acb748	strb w9,[sp, #0x19]
00acb74c	strb w10,[sp, #0x1a]
00acb750	strb w11,[sp, #0x1b]
00acb754	strb w13,[sp, #0x1d]
00acb758	strb w14,[sp, #0x1e]
00acb75c	stp x8,x12,[sp]
00acb760	strb w15,[sp, #0x1f]
00acb764	cbz x2,0x00acb834
00acb768	mov x20,x4
00acb76c	mov x21,x3
00acb770	mov x22,x2
00acb774	mov x23,x1
00acb778	mov x24,x0
00acb77c	mov w26,wzr
00acb780	add x27,sp,#0x18
00acb784	sub x22,x22,#0x1
00acb788	cbnz w25,0x00acb7d8
00acb78c	mov x0,sp
00acb790	mov x1,x21
00acb794	bl 0x00c3f9f0
00acb798	ldp x8,x9,[sp]
00acb79c	add w26,w26,#0x1
00acb7a0	lsr x10,x8,#0x8
00acb7a4	strb w8,[sp, #0x18]
00acb7a8	strb w10,[sp, #0x19]
00acb7ac	lsr x10,x8,#0x10
00acb7b0	lsr x8,x8,#0x18
00acb7b4	strb w8,[sp, #0x1b]
00acb7b8	lsr x8,x9,#0x8
00acb7bc	strb w9,[sp, #0x1c]
00acb7c0	strb w8,[sp, #0x1d]
00acb7c4	lsr x8,x9,#0x10
00acb7c8	lsr x9,x9,#0x18
00acb7cc	strb w10,[sp, #0x1a]
00acb7d0	strb w8,[sp, #0x1e]
00acb7d4	strb w9,[sp, #0x1f]
00acb7d8	ldrb w8,[x24], #0x1
00acb7dc	ldrb w9,[x27, w25, SXTW ]
00acb7e0	add w10,w25,#0x1
00acb7e4	and w25,w10,#0x7
00acb7e8	eor w8,w9,w8
00acb7ec	strb w8,[x23], #0x1
00acb7f0	cbnz x22,0x00acb784
00acb7f4	cbz w26,0x00acb834
00acb7f8	ldp x8,x9,[sp]
00acb7fc	lsr x10,x8,#0x8
00acb800	strb w8,[x20]
00acb804	strb w10,[x20, #0x1]
00acb808	lsr x10,x8,#0x10
00acb80c	lsr x8,x8,#0x18
00acb810	strb w9,[x20, #0x4]
00acb814	strb w10,[x20, #0x2]
00acb818	lsr x10,x9,#0x8
00acb81c	strb w8,[x20, #0x3]
00acb820	lsr x8,x9,#0x10
00acb824	lsr x9,x9,#0x18
00acb828	strb w10,[x20, #0x5]
00acb82c	strb w8,[x20, #0x6]
00acb830	strb w9,[x20, #0x7]
00acb834	str w25,[x19]
00acb838	ldp x29,x30,[sp, #0x60]
00acb83c	ldp x20,x19,[sp, #0x50]
00acb840	ldp x22,x21,[sp, #0x40]
00acb844	ldp x24,x23,[sp, #0x30]
00acb848	ldp x26,x25,[sp, #0x20]
00acb84c	ldr x27,[sp, #0x10]
00acb850	add sp,sp,#0x70
00acb854	ret
