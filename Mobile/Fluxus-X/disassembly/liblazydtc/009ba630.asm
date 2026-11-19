; FUN_009ba630 @ 009ba630
009ba630	stp x20,x19,[sp, #-0x20]!
009ba634	stp x29,x30,[sp, #0x10]
009ba638	ldr w8,[x0]
009ba63c	mov x20,x0
009ba640	mov x19,x1
009ba644	add x29,sp,#0x10
009ba648	tbz w8,#0x1,0x009ba678
009ba64c	adrp x1,0x2d3000
009ba650	add x1,x1,#0x716
009ba654	mov x0,x19
009ba658	bl 0x00c35ee0
009ba65c	cbz w0,0x009ba6c4
009ba660	adrp x1,0x2d1000
009ba664	add x1,x1,#0x5c4
009ba668	mov x0,x19
009ba66c	bl 0x00c35ee0
009ba670	cbz w0,0x009ba6c4
009ba674	ldr w8,[x20]
009ba678	tbz w8,#0x0,0x009ba690
009ba67c	adrp x1,0x2a1000
009ba680	add x1,x1,#0xf81
009ba684	mov x0,x19
009ba688	bl 0x00c301f0
009ba68c	cbz w0,0x009ba6c4
009ba690	mov w1,#0x3a
009ba694	mov x0,x19
009ba698	bl 0x00c30890
009ba69c	mov x8,x0
009ba6a0	mov w0,wzr
009ba6a4	cbnz x8,0x009ba6f4
009ba6a8	ldr x0,[x20, #0x18]
009ba6ac	cbz x0,0x009ba6cc
009ba6b0	mov w1,#0x5c
009ba6b4	mov x2,xzr
009ba6b8	mov x3,x19
009ba6bc	bl 0x00c32710
009ba6c0	b 0x009ba6ec
009ba6c4	mov w0,#0x1
009ba6c8	b 0x009ba6f4
009ba6cc	ldr x0,[x20, #0x20]
009ba6d0	cbz x0,0x009ba6e8
009ba6d4	mov w1,#0x5c
009ba6d8	mov x2,xzr
009ba6dc	mov x3,x19
009ba6e0	bl 0x00c328a0
009ba6e4	b 0x009ba6ec
009ba6e8	mov w0,#0x1
009ba6ec	cmp w0,#0x0
009ba6f0	cset w0,gt
009ba6f4	ldp x29,x30,[sp, #0x10]
009ba6f8	ldp x20,x19,[sp], #0x20
009ba6fc	ret
