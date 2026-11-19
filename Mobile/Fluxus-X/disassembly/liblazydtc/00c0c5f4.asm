; FUN_00c0c5f4 @ 00c0c5f4
00c0c5f4	paciasp
00c0c5f8	sub sp,sp,#0x60
00c0c5fc	stp x29,x30,[sp, #0x10]
00c0c600	stp x26,x25,[sp, #0x20]
00c0c604	stp x24,x23,[sp, #0x30]
00c0c608	stp x22,x21,[sp, #0x40]
00c0c60c	stp x20,x19,[sp, #0x50]
00c0c610	add x29,sp,#0x10
00c0c614	cmp x0,x1
00c0c618	mov x19,x2
00c0c61c	b.eq 0x00c0c6b4
00c0c620	ldrb w24,[x0]
00c0c624	mov w21,w3
00c0c628	mov x20,x1
00c0c62c	mov x22,x0
00c0c630	cmp w24,#0x2d
00c0c634	b.ne 0x00c0c644
00c0c638	add x22,x22,#0x1
00c0c63c	cmp x22,x20
00c0c640	b.eq 0x00c0c6b4
00c0c644	bl 0x00c30710
00c0c648	ldr w25,[x0]
00c0c64c	str wzr,[x0]
00c0c650	adrp x8,0xd27000
00c0c654	add x8,x8,#0xf8
00c0c658	mov x23,x0
00c0c65c	adrp x26,0xd27000
00c0c660	ldarb w8,[x8]
00c0c664	tbz w8,#0x0,0x00c0c6ec
00c0c668	ldr x3,[x26, #0xf0]
00c0c66c	add x1,sp,#0x8
00c0c670	mov x0,x22
00c0c674	mov w2,w21
00c0c678	bl 0x00c43950
00c0c67c	ldr w8,[x23]
00c0c680	cbz w8,0x00c0c6a4
00c0c684	ldr x9,[sp, #0x8]
00c0c688	cmp x9,x20
00c0c68c	b.ne 0x00c0c6b4
00c0c690	cmp w8,#0x22
00c0c694	b.ne 0x00c0c6e0
00c0c698	mov w8,#0x4
00c0c69c	mov x0,#-0x1
00c0c6a0	b 0x00c0c6bc
00c0c6a4	ldr x8,[sp, #0x8]
00c0c6a8	str w25,[x23]
00c0c6ac	cmp x8,x20
00c0c6b0	b.eq 0x00c0c6e0
00c0c6b4	mov x0,xzr
00c0c6b8	mov w8,#0x4
00c0c6bc	str w8,[x19]
00c0c6c0	ldp x20,x19,[sp, #0x50]
00c0c6c4	ldp x22,x21,[sp, #0x40]
00c0c6c8	ldp x24,x23,[sp, #0x30]
00c0c6cc	ldp x26,x25,[sp, #0x20]
00c0c6d0	ldp x29,x30,[sp, #0x10]
00c0c6d4	add sp,sp,#0x60
00c0c6d8	autiasp
00c0c6dc	ret
00c0c6e0	cmp w24,#0x2d
00c0c6e4	cneg x0,x0,eq
00c0c6e8	b 0x00c0c6c0
00c0c6ec	adrp x0,0xd27000
00c0c6f0	add x0,x0,#0xf8
00c0c6f4	bl 0x00c2fe90
00c0c6f8	cbz w0,0x00c0c668
00c0c6fc	adrp x1,0x2c6000
00c0c700	add x1,x1,#0xbfc
00c0c704	mov w0,#0x1fbf
00c0c708	mov x2,xzr
00c0c70c	bl 0x00c43890
00c0c710	str x0,[x26, #0xf0]
00c0c714	adrp x0,0xd27000
00c0c718	add x0,x0,#0xf8
00c0c71c	bl 0x00c2fea0
00c0c720	b 0x00c0c668
