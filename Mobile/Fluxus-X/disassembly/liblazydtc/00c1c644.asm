; FUN_00c1c644 @ 00c1c644
00c1c644	paciasp
00c1c648	stp x29,x30,[sp, #-0x40]!
00c1c64c	stp x24,x23,[sp, #0x10]
00c1c650	stp x22,x21,[sp, #0x20]
00c1c654	stp x20,x19,[sp, #0x30]
00c1c658	mov x29,sp
00c1c65c	mov x20,x1
00c1c660	mov w1,#0x1
00c1c664	mov x19,x2
00c1c668	mov x21,x0
00c1c66c	bl 0x00c10abc
00c1c670	cbz x1,0x00c1c718
00c1c674	ldp x9,x8,[x21]
00c1c678	cmp x9,x8
00c1c67c	b.eq 0x00c1c718
00c1c680	ldrb w8,[x9]
00c1c684	cmp w8,#0x45
00c1c688	b.ne 0x00c1c718
00c1c68c	ldr x22,[x21, #0x1330]
00c1c690	add x9,x9,#0x1
00c1c694	str x9,[x21]
00c1c698	ldr x8,[x22, #0x8]
00c1c69c	sub x10,x8,#0xfc0
00c1c6a0	cmn x10,#0xff1
00c1c6a4	b.hi 0x00c1c6d4
00c1c6a8	mov x23,x0
00c1c6ac	mov w0,#0x1000
00c1c6b0	mov x24,x1
00c1c6b4	bl 0x00c308d0
00c1c6b8	cbz x0,0x00c1c734
00c1c6bc	mov x8,xzr
00c1c6c0	stp x22,xzr,[x0]
00c1c6c4	mov x22,x0
00c1c6c8	str x0,[x21, #0x1330]
00c1c6cc	mov x1,x24
00c1c6d0	mov x0,x23
00c1c6d4	add x9,x8,#0x30
00c1c6d8	add x8,x22,x8
00c1c6dc	mov w10,#0x4d
00c1c6e0	str x9,[x22, #0x8]
00c1c6e4	adrp x9,0xcb1000
00c1c6e8	add x9,x9,#0xfb8
00c1c6ec	str x9,[x8, #0x10]!
00c1c6f0	ldurh w9,[x8, #0x9]
00c1c6f4	strb w10,[x8, #0x8]
00c1c6f8	mov w10,#0x540
00c1c6fc	and w9,w9,#0xf000
00c1c700	stp x0,x1,[x8, #0x20]
00c1c704	mov x0,x8
00c1c708	orr w9,w9,w10
00c1c70c	stp x20,x19,[x8, #0x10]
00c1c710	sturh w9,[x8, #0x9]
00c1c714	b 0x00c1c71c
00c1c718	mov x0,xzr
00c1c71c	ldp x20,x19,[sp, #0x30]
00c1c720	ldp x22,x21,[sp, #0x20]
00c1c724	ldp x24,x23,[sp, #0x10]
00c1c728	ldp x29,x30,[sp], #0x40
00c1c72c	autiasp
00c1c730	ret
00c1c734	bl 0x00c2fff0
