; FUN_00a8e63c @ 00a8e63c
00a8e63c	stp x22,x21,[sp, #-0x30]!
00a8e640	stp x20,x19,[sp, #0x10]
00a8e644	stp x29,x30,[sp, #0x20]
00a8e648	add x29,sp,#0x20
00a8e64c	mov w20,w3
00a8e650	mov x22,x1
00a8e654	mov x21,x0
00a8e658	bl 0x00c3cea0
00a8e65c	mov x19,x0
00a8e660	mov x0,x21
00a8e664	bl 0x00c3cca0
00a8e668	lsl w1,w0,#0x3
00a8e66c	mov x0,x22
00a8e670	mov x2,x19
00a8e674	bl 0x00c39260
00a8e678	tbnz w0,#0x1f,0x00a8e6a4
00a8e67c	mov x0,x21
00a8e680	bl 0x00c34b80
00a8e684	bl 0x00c35290
00a8e688	cbnz w20,0x00a8e6d8
00a8e68c	sub w8,w0,#0x1
00a8e690	cmp w8,#0x1
00a8e694	b.hi 0x00a8e6d8
00a8e698	adrp x8,0xcb5000
00a8e69c	ldr x8,[x8, #0x458]
00a8e6a0	b 0x00a8e6e0
00a8e6a4	bl 0x00c342a0
00a8e6a8	adrp x0,0x2a2000
00a8e6ac	adrp x2,0x2ac000
00a8e6b0	add x0,x0,#0x4fd
00a8e6b4	add x2,x2,#0x1e5
00a8e6b8	mov w1,#0xc9
00a8e6bc	bl 0x00c342b0
00a8e6c0	orr w0,wzr,#0x6
00a8e6c4	mov w1,#0x9d
00a8e6c8	mov x2,xzr
00a8e6cc	bl 0x00c342c0
00a8e6d0	mov w0,wzr
00a8e6d4	b 0x00a8e6f8
00a8e6d8	adrp x8,0xcb5000
00a8e6dc	ldr x8,[x8, #0x460]
00a8e6e0	adrp x9,0xcb5000
00a8e6e4	ldr x9,[x9, #0x450]
00a8e6e8	cmp w0,#0x2
00a8e6ec	mov w0,#0x1
00a8e6f0	csel x9,x9,xzr,eq
00a8e6f4	stp x8,x9,[x19, #0x118]
00a8e6f8	ldp x29,x30,[sp, #0x20]
00a8e6fc	ldp x20,x19,[sp, #0x10]
00a8e700	ldp x22,x21,[sp], #0x30
00a8e704	ret
