; psa_aead_set_lengths @ 00b8c76c
00b8c76c	stp x22,x21,[sp, #-0x30]!
00b8c770	stp x20,x19,[sp, #0x10]
00b8c774	stp x29,x30,[sp, #0x20]
00b8c778	add x29,sp,#0x20
00b8c77c	ldr w8,[x0]
00b8c780	mov x21,x2
00b8c784	mov x19,x0
00b8c788	mov x22,x1
00b8c78c	cbz w8,0x00b8c7c8
00b8c790	ldrb w9,[x19, #0x20]
00b8c794	tst w9,#0xe
00b8c798	b.eq 0x00b8c7e0
00b8c79c	mov w20,#0xffffff77
00b8c7a0	cbz w8,0x00b8c7cc
00b8c7a4	cmp w8,#0x1
00b8c7a8	b.ne 0x00b8c7b4
00b8c7ac	add x0,x19,#0x28
00b8c7b0	bl 0x00c42db0
00b8c7b4	mov w2,#0x1d8
00b8c7b8	mov x0,x19
00b8c7bc	mov w1,wzr
00b8c7c0	bl 0x00c301c0
00b8c7c4	b 0x00b8c7cc
00b8c7c8	mov w20,#0xffffff77
00b8c7cc	mov w0,w20
00b8c7d0	ldp x29,x30,[sp, #0x20]
00b8c7d4	ldp x20,x19,[sp, #0x10]
00b8c7d8	ldp x22,x21,[sp], #0x30
00b8c7dc	ret
00b8c7e0	ldr w9,[x19, #0x4]
00b8c7e4	mov w10,#0x100
00b8c7e8	movk w10,#0x550, LSL #16
00b8c7ec	cmp w9,w10
00b8c7f0	b.eq 0x00b8c828
00b8c7f4	mov w10,#0x200
00b8c7f8	movk w10,#0x550, LSL #16
00b8c7fc	cmp w9,w10
00b8c800	b.ne 0x00b8c83c
00b8c804	lsr x9,x22,#0x3d
00b8c808	mov w20,#0xffffff79
00b8c80c	cbnz x9,0x00b8c7a0
00b8c810	orr x9,xzr,#0xfffffffe0
00b8c814	cmp x21,x9
00b8c818	b.hi 0x00b8c7a0
00b8c81c	cmp w8,#0x1
00b8c820	b.eq 0x00b8c844
00b8c824	b 0x00b8c7a0
00b8c828	orr w9,wzr,#0xff00
00b8c82c	cmp x22,x9
00b8c830	mov w20,#0xffffff79
00b8c834	b.ls 0x00b8c81c
00b8c838	b 0x00b8c7a0
00b8c83c	cmp w8,#0x1
00b8c840	b.ne 0x00b8c868
00b8c844	add x0,x19,#0x28
00b8c848	mov x1,x22
00b8c84c	mov x2,x21
00b8c850	bl 0x00c42e10
00b8c854	mov w20,w0
00b8c858	cbz w0,0x00b8c874
00b8c85c	ldr w8,[x19]
00b8c860	cbnz w8,0x00b8c7a4
00b8c864	b 0x00b8c7cc
00b8c868	mov w20,#0xffffff79
00b8c86c	cbnz w8,0x00b8c7a4
00b8c870	b 0x00b8c7cc
00b8c874	ldrb w8,[x19, #0x20]
00b8c878	stp x22,x21,[x19, #0x10]
00b8c87c	orr w8,w8,#0x2
00b8c880	strb w8,[x19, #0x20]
00b8c884	b 0x00b8c7cc
