; FUN_00c1b694 @ 00c1b694
00c1b694	paciasp
00c1b698	stp x29,x30,[sp, #-0x20]!
00c1b69c	stp x20,x19,[sp, #0x10]
00c1b6a0	mov x29,sp
00c1b6a4	ldrb w9,[x0, #0x18]
00c1b6a8	ldr x8,[x1, #0x8]
00c1b6ac	mov x19,x1
00c1b6b0	mov x20,x0
00c1b6b4	cmp w9,#0x1
00c1b6b8	b.ne 0x00c1b708
00c1b6bc	ldr x9,[x19, #0x10]
00c1b6c0	add x10,x8,#0x2
00c1b6c4	ldr x0,[x19]
00c1b6c8	cmp x10,x9
00c1b6cc	b.ls 0x00c1b6f4
00c1b6d0	lsl x9,x9,#0x1
00c1b6d4	add x8,x8,#0x3e2
00c1b6d8	cmp x9,x8
00c1b6dc	csel x1,x9,x8,hi
00c1b6e0	str x1,[x19, #0x10]
00c1b6e4	bl 0x00c30950
00c1b6e8	str x0,[x19]
00c1b6ec	cbz x0,0x00c1b864
00c1b6f0	ldr x8,[x19, #0x8]
00c1b6f4	mov w9,#0x3a3a
00c1b6f8	strh w9,[x0, x8#0x0]
00c1b6fc	ldr x8,[x19, #0x8]
00c1b700	add x8,x8,#0x2
00c1b704	str x8,[x19, #0x8]
00c1b708	ldr x9,[x19, #0x10]
00c1b70c	add x10,x8,#0x6
00c1b710	ldr x0,[x19]
00c1b714	cmp x10,x9
00c1b718	b.ls 0x00c1b740
00c1b71c	lsl x9,x9,#0x1
00c1b720	add x8,x8,#0x3e6
00c1b724	cmp x9,x8
00c1b728	csel x1,x9,x8,hi
00c1b72c	str x1,[x19, #0x10]
00c1b730	bl 0x00c30950
00c1b734	str x0,[x19]
00c1b738	cbz x0,0x00c1b85c
00c1b73c	ldr x8,[x19, #0x8]
00c1b740	mov w10,#0x6564
00c1b744	add x8,x0,x8
00c1b748	mov w9,#0x6574
00c1b74c	movk w10,#0x656c, LSL #16
00c1b750	strh w9,[x8, #0x4]
00c1b754	str w10,[x8]
00c1b758	ldr x9,[x19, #0x8]
00c1b75c	ldrb w10,[x20, #0x19]
00c1b760	add x8,x9,#0x6
00c1b764	cmp w10,#0x1
00c1b768	str x8,[x19, #0x8]
00c1b76c	b.ne 0x00c1b7bc
00c1b770	ldr x10,[x19, #0x10]
00c1b774	add x11,x9,#0x8
00c1b778	ldr x0,[x19]
00c1b77c	cmp x11,x10
00c1b780	b.ls 0x00c1b7a8
00c1b784	lsl x8,x10,#0x1
00c1b788	add x9,x9,#0x3e8
00c1b78c	cmp x8,x9
00c1b790	csel x1,x8,x9,hi
00c1b794	str x1,[x19, #0x10]
00c1b798	bl 0x00c30950
00c1b79c	str x0,[x19]
00c1b7a0	cbz x0,0x00c1b868
00c1b7a4	ldr x8,[x19, #0x8]
00c1b7a8	mov w9,#0x5d5b
00c1b7ac	strh w9,[x0, x8#0x0]
00c1b7b0	ldr x8,[x19, #0x8]
00c1b7b4	add x8,x8,#0x2
00c1b7b8	str x8,[x19, #0x8]
00c1b7bc	ldr x10,[x19, #0x10]
00c1b7c0	add x9,x8,#0x1
00c1b7c4	ldr x0,[x19]
00c1b7c8	cmp x9,x10
00c1b7cc	b.ls 0x00c1b7f8
00c1b7d0	lsl x9,x10,#0x1
00c1b7d4	add x8,x8,#0x3e1
00c1b7d8	cmp x9,x8
00c1b7dc	csel x1,x9,x8,hi
00c1b7e0	str x1,[x19, #0x10]
00c1b7e4	bl 0x00c30950
00c1b7e8	str x0,[x19]
00c1b7ec	cbz x0,0x00c1b860
00c1b7f0	ldr x8,[x19, #0x8]
00c1b7f4	add x9,x8,#0x1
00c1b7f8	str x9,[x19, #0x8]
00c1b7fc	mov w9,#0x20
00c1b800	mov x1,x19
00c1b804	strb w9,[x0, x8]
00c1b808	ldr x20,[x20, #0x10]
00c1b80c	ldr x8,[x20]
00c1b810	mov x0,x20
00c1b814	ldr x8,[x8, #0x20]
00c1b818	blr x8
00c1b81c	ldurh w8,[x20, #0x9]
00c1b820	and w8,w8,#0xc0
00c1b824	cmp w8,#0x40
00c1b828	b.ne 0x00c1b83c
00c1b82c	ldp x20,x19,[sp, #0x10]
00c1b830	ldp x29,x30,[sp], #0x20
00c1b834	autiasp
00c1b838	ret
00c1b83c	ldr x8,[x20]
00c1b840	mov x0,x20
00c1b844	ldr x16,[x8, #0x28]
00c1b848	mov x1,x19
00c1b84c	ldp x20,x19,[sp, #0x10]
00c1b850	ldp x29,x30,[sp], #0x20
00c1b854	autiasp
00c1b858	br x16
00c1b85c	bl 0x00c30b40
00c1b860	bl 0x00c30b40
00c1b864	bl 0x00c30b40
00c1b868	bl 0x00c30b40
