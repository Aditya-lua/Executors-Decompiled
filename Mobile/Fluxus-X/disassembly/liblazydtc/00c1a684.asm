; FUN_00c1a684 @ 00c1a684
00c1a684	paciasp
00c1a688	stp x29,x30,[sp, #-0x30]!
00c1a68c	stp x22,x21,[sp, #0x10]
00c1a690	stp x20,x19,[sp, #0x20]
00c1a694	mov x29,sp
00c1a698	ldr x20,[x0, #0x18]
00c1a69c	mov x21,x0
00c1a6a0	mov x19,x1
00c1a6a4	cbz x20,0x00c1a700
00c1a6a8	ldp x8,x9,[x19, #0x8]
00c1a6ac	ldr x0,[x19]
00c1a6b0	ldr x22,[x21, #0x10]
00c1a6b4	add x10,x8,x20
00c1a6b8	cmp x10,x9
00c1a6bc	b.ls 0x00c1a6e4
00c1a6c0	lsl x8,x9,#0x1
00c1a6c4	add x9,x10,#0x3e0
00c1a6c8	cmp x8,x9
00c1a6cc	csel x1,x8,x9,hi
00c1a6d0	str x1,[x19, #0x10]
00c1a6d4	bl 0x00c30950
00c1a6d8	str x0,[x19]
00c1a6dc	cbz x0,0x00c1a858
00c1a6e0	ldr x8,[x19, #0x8]
00c1a6e4	add x0,x0,x8
00c1a6e8	mov x1,x22
00c1a6ec	mov x2,x20
00c1a6f0	bl 0x00c2ffd0
00c1a6f4	ldr x8,[x19, #0x8]
00c1a6f8	add x8,x8,x20
00c1a6fc	str x8,[x19, #0x8]
00c1a700	ldr x20,[x21, #0x20]
00c1a704	ldurh w8,[x21, #0x9]
00c1a708	ldurh w9,[x20, #0x9]
00c1a70c	ubfiz w8,w8,#0xa,#0x6
00c1a710	ubfiz w9,w9,#0xa,#0x6
00c1a714	cmp w8,w9
00c1a718	b.ls 0x00c1a764
00c1a71c	ldr x8,[x20]
00c1a720	mov x0,x20
00c1a724	mov x1,x19
00c1a728	ldr x8,[x8, #0x20]
00c1a72c	blr x8
00c1a730	ldurh w8,[x20, #0x9]
00c1a734	and w8,w8,#0xc0
00c1a738	cmp w8,#0x40
00c1a73c	b.eq 0x00c1a844
00c1a740	ldr x8,[x20]
00c1a744	mov x0,x20
00c1a748	ldr x16,[x8, #0x28]
00c1a74c	mov x1,x19
00c1a750	ldp x20,x19,[sp, #0x20]
00c1a754	ldp x22,x21,[sp, #0x10]
00c1a758	ldp x29,x30,[sp], #0x30
00c1a75c	autiasp
00c1a760	br x16
00c1a764	ldp x8,x10,[x19, #0x8]
00c1a768	ldr w11,[x19, #0x20]
00c1a76c	ldr x0,[x19]
00c1a770	add w11,w11,#0x1
00c1a774	add x9,x8,#0x1
00c1a778	str w11,[x19, #0x20]
00c1a77c	cmp x9,x10
00c1a780	b.ls 0x00c1a7ac
00c1a784	lsl x9,x10,#0x1
00c1a788	add x8,x8,#0x3e1
00c1a78c	cmp x9,x8
00c1a790	csel x1,x9,x8,hi
00c1a794	str x1,[x19, #0x10]
00c1a798	bl 0x00c30950
00c1a79c	str x0,[x19]
00c1a7a0	cbz x0,0x00c1a85c
00c1a7a4	ldr x8,[x19, #0x8]
00c1a7a8	add x9,x8,#0x1
00c1a7ac	str x9,[x19, #0x8]
00c1a7b0	ldr x9,[x20]
00c1a7b4	mov w10,#0x28
00c1a7b8	strb w10,[x0, x8]
00c1a7bc	mov x0,x20
00c1a7c0	mov x1,x19
00c1a7c4	ldr x8,[x9, #0x20]
00c1a7c8	blr x8
00c1a7cc	ldurh w8,[x20, #0x9]
00c1a7d0	and w8,w8,#0xc0
00c1a7d4	cmp w8,#0x40
00c1a7d8	b.eq 0x00c1a7f0
00c1a7dc	ldr x8,[x20]
00c1a7e0	mov x0,x20
00c1a7e4	mov x1,x19
00c1a7e8	ldr x8,[x8, #0x28]
00c1a7ec	blr x8
00c1a7f0	ldp x8,x10,[x19, #0x8]
00c1a7f4	ldr w11,[x19, #0x20]
00c1a7f8	ldr x0,[x19]
00c1a7fc	sub w11,w11,#0x1
00c1a800	add x9,x8,#0x1
00c1a804	str w11,[x19, #0x20]
00c1a808	cmp x9,x10
00c1a80c	b.ls 0x00c1a838
00c1a810	lsl x9,x10,#0x1
00c1a814	add x8,x8,#0x3e1
00c1a818	cmp x9,x8
00c1a81c	csel x1,x9,x8,hi
00c1a820	str x1,[x19, #0x10]
00c1a824	bl 0x00c30950
00c1a828	str x0,[x19]
00c1a82c	cbz x0,0x00c1a860
00c1a830	ldr x8,[x19, #0x8]
00c1a834	add x9,x8,#0x1
00c1a838	str x9,[x19, #0x8]
00c1a83c	mov w9,#0x29
00c1a840	strb w9,[x0, x8]
00c1a844	ldp x20,x19,[sp, #0x20]
00c1a848	ldp x22,x21,[sp, #0x10]
00c1a84c	ldp x29,x30,[sp], #0x30
00c1a850	autiasp
00c1a854	ret
00c1a858	bl 0x00c30b40
00c1a85c	bl 0x00c30b40
00c1a860	bl 0x00c30b40
