; FUN_00a1d778 @ 00a1d778
00a1d778	sub sp,sp,#0x70
00a1d77c	stp x26,x25,[sp, #0x20]
00a1d780	mov w26,w0
00a1d784	mov x0,x6
00a1d788	stp x28,x27,[sp, #0x10]
00a1d78c	stp x24,x23,[sp, #0x30]
00a1d790	stp x22,x21,[sp, #0x40]
00a1d794	stp x20,x19,[sp, #0x50]
00a1d798	stp x29,x30,[sp, #0x60]
00a1d79c	add x29,sp,#0x60
00a1d7a0	mov w24,w5
00a1d7a4	mov w22,w4
00a1d7a8	mov w23,w3
00a1d7ac	mov w19,w2
00a1d7b0	mov x21,x1
00a1d7b4	bl 0x00c38aa0
00a1d7b8	cbz w19,0x00a1d8cc
00a1d7bc	tbnz w19,#0x1f,0x00a1d8e8
00a1d7c0	mov x25,x0
00a1d7c4	subs w27,w19,#0x1
00a1d7c8	b.ne 0x00a1d7d4
00a1d7cc	cmp w23,#0x0
00a1d7d0	b.gt 0x00a1d8e8
00a1d7d4	add w8,w19,#0x7
00a1d7d8	add w9,w19,#0xe
00a1d7dc	cmp w8,#0x0
00a1d7e0	csel w8,w9,w8,lt
00a1d7e4	add w10,w19,#0x6
00a1d7e8	sbfx x19,x8,#0x3,#0x1d
00a1d7ec	adrp x1,0x2c1000
00a1d7f0	cmp w27,#0x0
00a1d7f4	add x1,x1,#0xaac
00a1d7f8	mov w2,#0x2b
00a1d7fc	mov x0,x19
00a1d800	csel w28,w10,w27,lt
00a1d804	bl 0x00c32320
00a1d808	mov x20,x0
00a1d80c	cbz x0,0x00a1d91c
00a1d810	cbz w26,0x00a1d954
00a1d814	mov x0,x25
00a1d818	mov x1,x20
00a1d81c	mov x2,x19
00a1d820	mov w3,w24
00a1d824	bl 0x00c358b0
00a1d828	cmp w0,#0x1
00a1d82c	b.lt 0x00a1d970
00a1d830	cmp w26,#0x1
00a1d834	b.ne 0x00a1d89c
00a1d838	mov x26,xzr
00a1d83c	add x1,sp,#0xc
00a1d840	mov w2,#0x1
00a1d844	mov x0,x25
00a1d848	mov w3,w24
00a1d84c	bl 0x00c347b0
00a1d850	cmp w0,#0x1
00a1d854	b.lt 0x00a1d970
00a1d858	ldrb w8,[sp, #0xc]
00a1d85c	cbz x26,0x00a1d874
00a1d860	sxtb w9,w8
00a1d864	tbz w9,#0x1f,0x00a1d874
00a1d868	add x8,x20,x26
00a1d86c	ldurb w9,[x8, #-0x1]
00a1d870	b 0x00a1d88c
00a1d874	cmp w8,#0x2a
00a1d878	mov w9,wzr
00a1d87c	b.cc 0x00a1d88c
00a1d880	cmp w8,#0x53
00a1d884	b.hi 0x00a1d890
00a1d888	orr w9,wzr,#0xff
00a1d88c	strb w9,[x20, x26]
00a1d890	add x26,x26,#0x1
00a1d894	cmp x26,x19
00a1d898	b.lt 0x00a1d83c
00a1d89c	and w8,w28,#0xfffffff8
00a1d8a0	sub w9,w27,w8
00a1d8a4	add w8,w9,#0x1
00a1d8a8	orr w10,wzr,#0xff
00a1d8ac	lsl w8,w10,w8
00a1d8b0	tbnz w23,#0x1f,0x00a1d978
00a1d8b4	cbz w23,0x00a1d980
00a1d8b8	cbz w9,0x00a1d998
00a1d8bc	ldrb w10,[x20]
00a1d8c0	sub w9,w9,#0x1
00a1d8c4	orr w11,wzr,#0x3
00a1d8c8	b 0x00a1d988
00a1d8cc	cmn w23,#0x1
00a1d8d0	b.ne 0x00a1d8e8
00a1d8d4	cbnz w22,0x00a1d8e8
00a1d8d8	mov x0,x21
00a1d8dc	bl 0x00c38e00
00a1d8e0	mov w21,#0x1
00a1d8e4	b 0x00a1d9f8
00a1d8e8	bl 0x00c342a0
00a1d8ec	adrp x0,0x2c1000
00a1d8f0	adrp x2,0x2bf000
00a1d8f4	add x0,x0,#0xaac
00a1d8f8	add x2,x2,#0xafe
00a1d8fc	mov w1,#0x62
00a1d900	bl 0x00c342b0
00a1d904	orr w0,wzr,#0x3
00a1d908	mov w1,#0x76
00a1d90c	mov x2,xzr
00a1d910	bl 0x00c342c0
00a1d914	mov w21,wzr
00a1d918	b 0x00a1d9f8
00a1d91c	bl 0x00c342a0
00a1d920	adrp x0,0x2c1000
00a1d924	adrp x2,0x2bf000
00a1d928	add x0,x0,#0xaac
00a1d92c	add x2,x2,#0xafe
00a1d930	mov w1,#0x2d
00a1d934	bl 0x00c342b0
00a1d938	mov w1,#0x100
00a1d93c	orr w0,wzr,#0x3
00a1d940	movk w1,#0xc, LSL #16
00a1d944	mov x2,xzr
00a1d948	bl 0x00c342c0
00a1d94c	mov w21,wzr
00a1d950	b 0x00a1d9e0
00a1d954	mov x0,x25
00a1d958	mov x1,x20
00a1d95c	mov x2,x19
00a1d960	mov w3,w24
00a1d964	bl 0x00c347b0
00a1d968	cmp w0,#0x1
00a1d96c	b.ge 0x00a1d830
00a1d970	mov w21,wzr
00a1d974	b 0x00a1d9e0
00a1d978	ldrb w9,[x20]
00a1d97c	b 0x00a1d9ac
00a1d980	ldrb w10,[x20]
00a1d984	mov w11,#0x1
00a1d988	lsl w9,w11,w9
00a1d98c	orr w9,w10,w9
00a1d990	strb w9,[x20]
00a1d994	b 0x00a1d9ac
00a1d998	ldrb w10,[x20, #0x1]
00a1d99c	mov w9,#0x1
00a1d9a0	strb w9,[x20]
00a1d9a4	orr w10,w10,#0x80
00a1d9a8	strb w10,[x20, #0x1]
00a1d9ac	bic w8,w9,w8
00a1d9b0	strb w8,[x20]
00a1d9b4	cbz w22,0x00a1d9c8
00a1d9b8	add x8,x20,x19
00a1d9bc	ldurb w9,[x8, #-0x1]
00a1d9c0	orr w9,w9,#0x1
00a1d9c4	sturb w9,[x8, #-0x1]
00a1d9c8	mov x0,x20
00a1d9cc	mov w1,w19
00a1d9d0	mov x2,x21
00a1d9d4	bl 0x00c36970
00a1d9d8	cmp x0,#0x0
00a1d9dc	cset w21,ne
00a1d9e0	adrp x2,0x2c1000
00a1d9e4	add x2,x2,#0xaac
00a1d9e8	mov w3,#0x5d
00a1d9ec	mov x0,x20
00a1d9f0	mov x1,x19
00a1d9f4	bl 0x00c345e0
00a1d9f8	mov w0,w21
00a1d9fc	ldp x29,x30,[sp, #0x60]
00a1da00	ldp x20,x19,[sp, #0x50]
00a1da04	ldp x22,x21,[sp, #0x40]
00a1da08	ldp x24,x23,[sp, #0x30]
00a1da0c	ldp x26,x25,[sp, #0x20]
00a1da10	ldp x28,x27,[sp, #0x10]
00a1da14	add sp,sp,#0x70
00a1da18	ret
