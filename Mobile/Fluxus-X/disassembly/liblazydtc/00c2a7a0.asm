; FUN_00c2a7a0 @ 00c2a7a0
00c2a7a0	paciasp
00c2a7a4	sub sp,sp,#0x70
00c2a7a8	stp x29,x30,[sp, #0x10]
00c2a7ac	stp x28,x27,[sp, #0x20]
00c2a7b0	stp x26,x25,[sp, #0x30]
00c2a7b4	stp x24,x23,[sp, #0x40]
00c2a7b8	stp x22,x21,[sp, #0x50]
00c2a7bc	stp x20,x19,[sp, #0x60]
00c2a7c0	add x29,sp,#0x10
00c2a7c4	str x5,[sp]
00c2a7c8	cbz x1,0x00c2a8a8
00c2a7cc	mov w24,w2
00c2a7d0	mov w10,#0x1c1d
00c2a7d4	mvn x11,x0
00c2a7d8	and x25,x24,#0xf
00c2a7dc	mov x20,x6
00c2a7e0	mov x21,x4
00c2a7e4	lsr w26,w10,w25
00c2a7e8	mov x22,x1
00c2a7ec	mov x23,x3
00c2a7f0	mov x8,xzr
00c2a7f4	mov x9,xzr
00c2a7f8	add x27,x1,x11
00c2a7fc	adrp x28,0x78d000
00c2a800	add x28,x28,#0x6f8
00c2a804	ldrb w10,[x27], #0x1
00c2a808	and x11,x10,#0x7f
00c2a80c	lsl x11,x11,x8
00c2a810	add x8,x8,#0x7
00c2a814	orr x19,x11,x9
00c2a818	mov x9,x19
00c2a81c	tbnz w10,#0x7,0x00c2a804
00c2a820	cbz x19,0x00c2a870
00c2a824	cmp w25,#0xc
00c2a828	b.hi 0x00c2a89c
00c2a82c	tbz w26,#0x0,0x00c2a89c
00c2a830	ldr x8,[x28, x25, LSL #0x3]
00c2a834	add x0,sp,#0x8
00c2a838	mov w1,w24
00c2a83c	mov x2,x20
00c2a840	madd x8,x8,x19,x22
00c2a844	str x8,[sp, #0x8]
00c2a848	bl 0x00c2a5f8
00c2a84c	str x21,[sp, #0x8]
00c2a850	add x2,sp,#0x8
00c2a854	mov x1,x23
00c2a858	ldr x8,[x0]
00c2a85c	ldr x8,[x8, #0x20]
00c2a860	blr x8
00c2a864	mov x8,xzr
00c2a868	mov x9,xzr
00c2a86c	tbz w0,#0x0,0x00c2a804
00c2a870	cmp x19,#0x0
00c2a874	cset w0,eq
00c2a878	ldp x20,x19,[sp, #0x60]
00c2a87c	ldp x22,x21,[sp, #0x50]
00c2a880	ldp x24,x23,[sp, #0x40]
00c2a884	ldp x26,x25,[sp, #0x30]
00c2a888	ldp x28,x27,[sp, #0x20]
00c2a88c	ldp x29,x30,[sp, #0x10]
00c2a890	add sp,sp,#0x70
00c2a894	autiasp
00c2a898	ret
00c2a89c	ldr x1,[sp]
00c2a8a0	mov w0,#0x1
00c2a8a4	bl 0x00c2a5c8
00c2a8a8	ldr x0,[sp]
00c2a8ac	bl 0x00c2ffe0
00c2a8b0	bl 0x00c2fff0
