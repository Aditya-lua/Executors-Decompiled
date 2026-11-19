; FUN_00c0c73c @ 00c0c73c
00c0c73c	paciasp
00c0c740	stp x29,x30,[sp, #-0x40]!
00c0c744	str x23,[sp, #0x10]
00c0c748	stp x22,x21,[sp, #0x20]
00c0c74c	stp x20,x19,[sp, #0x30]
00c0c750	mov x29,sp
00c0c754	cmp x0,x1
00c0c758	mov x19,x2
00c0c75c	b.eq 0x00c0c7bc
00c0c760	mov x20,x1
00c0c764	mov x22,x0
00c0c768	bl 0x00c30710
00c0c76c	ldr w23,[x0]
00c0c770	str wzr,[x0]
00c0c774	adrp x8,0xd27000
00c0c778	add x8,x8,#0xf8
00c0c77c	mov x21,x0
00c0c780	ldarb w8,[x8]
00c0c784	tbz w8,#0x0,0x00c0c800
00c0c788	add x1,x29,#0x18
00c0c78c	mov x0,x22
00c0c790	bl 0x00c43a50
00c0c794	ldr w8,[x21]
00c0c798	cbz w8,0x00c0c7c8
00c0c79c	movi d1,#0x0
00c0c7a0	ldr x9,[x29, #0x18]
00c0c7a4	cmp x9,x20
00c0c7a8	b.ne 0x00c0c7dc
00c0c7ac	fmov s1,s0
00c0c7b0	cmp w8,#0x22
00c0c7b4	b.eq 0x00c0c7dc
00c0c7b8	b 0x00c0c7e8
00c0c7bc	movi d0,#0x0
00c0c7c0	mov w8,#0x4
00c0c7c4	b 0x00c0c7e4
00c0c7c8	movi d1,#0x0
00c0c7cc	ldr x8,[x29, #0x18]
00c0c7d0	str w23,[x21]
00c0c7d4	cmp x8,x20
00c0c7d8	b.eq 0x00c0c7e8
00c0c7dc	mov w8,#0x4
00c0c7e0	fmov s0,s1
00c0c7e4	str w8,[x19]
00c0c7e8	ldp x20,x19,[sp, #0x30]
00c0c7ec	ldr x23,[sp, #0x10]
00c0c7f0	ldp x22,x21,[sp, #0x20]
00c0c7f4	ldp x29,x30,[sp], #0x40
00c0c7f8	autiasp
00c0c7fc	ret
00c0c800	adrp x0,0xd27000
00c0c804	add x0,x0,#0xf8
00c0c808	bl 0x00c2fe90
00c0c80c	cbz w0,0x00c0c788
00c0c810	adrp x1,0x2c6000
00c0c814	add x1,x1,#0xbfc
00c0c818	mov w0,#0x1fbf
00c0c81c	mov x2,xzr
00c0c820	bl 0x00c43890
00c0c824	adrp x8,0xd27000
00c0c828	str x0,[x8, #0xf0]
00c0c82c	adrp x0,0xd27000
00c0c830	add x0,x0,#0xf8
00c0c834	bl 0x00c2fea0
00c0c838	b 0x00c0c788
