; FUN_00b5a720 @ 00b5a720
00b5a720	str x23,[sp, #-0x40]!
00b5a724	stp x22,x21,[sp, #0x10]
00b5a728	stp x20,x19,[sp, #0x20]
00b5a72c	stp x29,x30,[sp, #0x30]
00b5a730	strb w1,[sp, #0xc]
00b5a734	ldr x19,[x0, #0xf8]
00b5a738	mov x20,x0
00b5a73c	add x29,sp,#0x30
00b5a740	mov x22,x3
00b5a744	ldr x21,[x19, #0x18]
00b5a748	mov x0,x19
00b5a74c	mov x23,x2
00b5a750	bl 0x00c41160
00b5a754	mov x1,x0
00b5a758	mov x0,x21
00b5a75c	mov x2,xzr
00b5a760	bl 0x00c31f70
00b5a764	cbz w0,0x00b5a84c
00b5a768	add x1,sp,#0xc
00b5a76c	mov w2,#0x1
00b5a770	mov x0,x21
00b5a774	bl 0x00c31f80
00b5a778	cbz w0,0x00b5a84c
00b5a77c	ldr x2,[x20, #0xe8]
00b5a780	add x1,x19,#0x28
00b5a784	mov x0,x21
00b5a788	bl 0x00c31f80
00b5a78c	cbz w0,0x00b5a84c
00b5a790	cbz x23,0x00b5a7a8
00b5a794	mov x0,x21
00b5a798	mov x1,x23
00b5a79c	mov x2,x22
00b5a7a0	bl 0x00c31f80
00b5a7a4	cbz w0,0x00b5a84c
00b5a7a8	add x1,x19,#0x106
00b5a7ac	mov x0,x21
00b5a7b0	mov x2,xzr
00b5a7b4	bl 0x00c3c150
00b5a7b8	cbz w0,0x00b5a84c
00b5a7bc	ldr x8,[x19, #0x20]
00b5a7c0	cbz x8,0x00b5a848
00b5a7c4	ldr x9,[x20, #0xe8]
00b5a7c8	mov w10,wzr
00b5a7cc	mov x12,x8
00b5a7d0	sub x9,x9,#0x1
00b5a7d4	add x11,x19,x9
00b5a7d8	add x11,x11,#0x28
00b5a7dc	add x13,x19,x12
00b5a7e0	ldrb w14,[x11]
00b5a7e4	ldrb w13,[x13, #0x105]
00b5a7e8	subs x12,x12,#0x1
00b5a7ec	add w10,w10,w14
00b5a7f0	add w13,w10,w13
00b5a7f4	asr w10,w13,#0x8
00b5a7f8	strb w13,[x11], #-0x1
00b5a7fc	b.ne 0x00b5a7dc
00b5a800	cbz w10,0x00b5a848
00b5a804	ldr x10,[x20, #0xe8]
00b5a808	cmp x10,x8
00b5a80c	b.eq 0x00b5a848
00b5a810	sub x9,x9,x8
00b5a814	add x9,x19,x9
00b5a818	add x9,x9,#0x28
00b5a81c	sub x8,x8,x10
00b5a820	mov w0,#0x1
00b5a824	ldrb w10,[x9]
00b5a828	add w10,w10,#0x1
00b5a82c	tst w10,#0xff
00b5a830	strb w10,[x9]
00b5a834	b.ne 0x00b5a848
00b5a838	sub x9,x9,#0x1
00b5a83c	adds x8,x8,#0x1
00b5a840	b.ne 0x00b5a824
00b5a844	b 0x00b5a84c
00b5a848	mov w0,#0x1
00b5a84c	ldp x29,x30,[sp, #0x30]
00b5a850	ldp x20,x19,[sp, #0x20]
00b5a854	ldp x22,x21,[sp, #0x10]
00b5a858	ldr x23,[sp], #0x40
00b5a85c	ret
