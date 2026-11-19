; FUN_00c27664 @ 00c27664
00c27664	paciasp
00c27668	stp x29,x30,[sp, #-0x20]!
00c2766c	stp x20,x19,[sp, #0x10]
00c27670	mov x29,sp
00c27674	ldp x9,x10,[x1, #0x8]
00c27678	mov x19,x1
00c2767c	ldr x8,[x1]
00c27680	mov x20,x0
00c27684	add x11,x9,#0xd
00c27688	cmp x11,x10
00c2768c	b.ls 0x00c276bc
00c27690	lsl x10,x10,#0x1
00c27694	add x9,x9,#0x3ed
00c27698	mov x0,x8
00c2769c	cmp x10,x9
00c276a0	csel x1,x10,x9,hi
00c276a4	str x1,[x19, #0x10]
00c276a8	bl 0x00c30950
00c276ac	str x0,[x19]
00c276b0	cbz x0,0x00c2777c
00c276b4	ldr x9,[x19, #0x8]
00c276b8	mov x8,x0
00c276bc	adrp x10,0x2d8000
00c276c0	add x10,x10,#0xe95
00c276c4	add x8,x8,x9
00c276c8	ldr x11,[x10]
00c276cc	ldur x9,[x10, #0x5]
00c276d0	mov x1,x19
00c276d4	str x11,[x8]
00c276d8	stur x9,[x8, #0x5]
00c276dc	ldr x8,[x19, #0x8]
00c276e0	ldr x20,[x20, #0x10]
00c276e4	add x8,x8,#0xd
00c276e8	ldr x9,[x20]
00c276ec	mov x0,x20
00c276f0	str x8,[x19, #0x8]
00c276f4	ldr x8,[x9, #0x20]
00c276f8	blr x8
00c276fc	ldurh w8,[x20, #0x9]
00c27700	and w8,w8,#0xc0
00c27704	cmp w8,#0x40
00c27708	b.eq 0x00c27720
00c2770c	ldr x8,[x20]
00c27710	mov x0,x20
00c27714	mov x1,x19
00c27718	ldr x8,[x8, #0x28]
00c2771c	blr x8
00c27720	ldp x8,x9,[x19, #0x8]
00c27724	ldr x0,[x19]
00c27728	add x10,x8,#0x1
00c2772c	cmp x10,x9
00c27730	b.ls 0x00c27758
00c27734	lsl x9,x9,#0x1
00c27738	add x8,x8,#0x3e1
00c2773c	cmp x9,x8
00c27740	csel x1,x9,x8,hi
00c27744	str x1,[x19, #0x10]
00c27748	bl 0x00c30950
00c2774c	str x0,[x19]
00c27750	cbz x0,0x00c27780
00c27754	ldr x8,[x19, #0x8]
00c27758	mov w9,#0x5d
00c2775c	strb w9,[x0, x8]
00c27760	ldr x8,[x19, #0x8]
00c27764	add x8,x8,#0x1
00c27768	str x8,[x19, #0x8]
00c2776c	ldp x20,x19,[sp, #0x10]
00c27770	ldp x29,x30,[sp], #0x20
00c27774	autiasp
00c27778	ret
00c2777c	bl 0x00c30b40
00c27780	bl 0x00c30b40
