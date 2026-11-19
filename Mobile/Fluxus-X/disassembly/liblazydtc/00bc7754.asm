; std::__ndk1::stol @ 00bc7754
00bc7754	paciasp
00bc7758	sub sp,sp,#0x70
00bc775c	stp x29,x30,[sp, #0x30]
00bc7760	str x23,[sp, #0x40]
00bc7764	stp x22,x21,[sp, #0x50]
00bc7768	stp x20,x19,[sp, #0x60]
00bc776c	add x29,sp,#0x30
00bc7770	mov w8,#0x8
00bc7774	ldrb w9,[x0]
00bc7778	mov w21,w2
00bc777c	strb w8,[sp]
00bc7780	mov w8,#0x7473
00bc7784	mov x19,x1
00bc7788	movk w8,#0x6c6f, LSL #16
00bc778c	tst w9,#0x1
00bc7790	strb wzr,[sp, #0x5]
00bc7794	stur w8,[sp, #0x1]
00bc7798	ldr x8,[x0, #0x10]
00bc779c	str xzr,[x29, #0x18]
00bc77a0	csinc x20,x8,x0,ne
00bc77a4	bl 0x00c30710
00bc77a8	mov x22,x0
00bc77ac	ldr w23,[x0]
00bc77b0	str wzr,[x0]
00bc77b4	add x1,x29,#0x18
00bc77b8	mov x0,x20
00bc77bc	mov w2,w21
00bc77c0	bl 0x00c31f00
00bc77c4	ldr w8,[x22]
00bc77c8	str w23,[x22]
00bc77cc	cmp w8,#0x22
00bc77d0	b.eq 0x00bc7814
00bc77d4	ldr x8,[x29, #0x18]
00bc77d8	subs x8,x8,x20
00bc77dc	b.eq 0x00bc7840
00bc77e0	mov x21,x0
00bc77e4	cbz x19,0x00bc77ec
00bc77e8	str x8,[x19]
00bc77ec	mov x0,sp
00bc77f0	bl 0x00c43db0
00bc77f4	mov x0,x21
00bc77f8	ldp x20,x19,[sp, #0x60]
00bc77fc	ldr x23,[sp, #0x40]
00bc7800	ldp x22,x21,[sp, #0x50]
00bc7804	ldp x29,x30,[sp, #0x30]
00bc7808	add sp,sp,#0x70
00bc780c	autiasp
00bc7810	ret
00bc7814	adrp x1,0x2ce000
00bc7818	add x1,x1,#0xb11
00bc781c	add x8,sp,#0x18
00bc7820	mov x0,sp
00bc7824	add x19,sp,#0x18
00bc7828	bl 0x00bcab58
00bc782c	ldrb w8,[sp, #0x18]
00bc7830	ldr x9,[sp, #0x28]
00bc7834	tst w8,#0x1
00bc7838	csinc x0,x9,x19,ne
00bc783c	bl 0x0080c8d0
00bc7840	mov x0,sp
00bc7844	bl 0x00bcaab4
00bc7848	mov x19,x0
00bc784c	add x0,sp,#0x18
00bc7850	bl 0x00c43db0
00bc7854	b 0x00bc785c
00bc785c	mov x0,sp
00bc7860	bl 0x00c43db0
00bc7864	mov x0,x19
00bc7868	bl 0x00c2c090
