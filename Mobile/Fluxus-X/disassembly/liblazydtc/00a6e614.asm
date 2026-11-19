; FUN_00a6e614 @ 00a6e614
00a6e614	sub sp,sp,#0x90
00a6e618	stp x22,x21,[sp, #0x60]
00a6e61c	stp x20,x19,[sp, #0x70]
00a6e620	stp x29,x30,[sp, #0x80]
00a6e624	ldr x8,[x0, #0x8]
00a6e628	mov x19,x3
00a6e62c	mov x21,x0
00a6e630	add x29,sp,#0x80
00a6e634	cbz x8,0x00a6e660
00a6e638	ldr x4,[x8, #0xb0]
00a6e63c	cbz x4,0x00a6e718
00a6e640	mov x0,x21
00a6e644	mov x3,x19
00a6e648	ldp x29,x30,[sp, #0x80]
00a6e64c	ldp x20,x19,[sp, #0x70]
00a6e650	ldp x22,x21,[sp, #0x60]
00a6e654	sxtw x2,w2
00a6e658	add sp,sp,#0x90
00a6e65c	br x4
00a6e660	ldr x8,[x21, #0x60]
00a6e664	cbz x8,0x00a6e720
00a6e668	cmp w1,#0x3
00a6e66c	b.ne 0x00a6e718
00a6e670	add x0,sp,#0x10
00a6e674	mov w2,#0x50
00a6e678	mov w1,wzr
00a6e67c	bl 0x00c301c0
00a6e680	add x1,sp,#0x10
00a6e684	mov w2,#0x50
00a6e688	mov x0,x21
00a6e68c	bl 0x00a6e73c
00a6e690	mov w20,w0
00a6e694	cmp w0,#0x1
00a6e698	b.lt 0x00a6e724
00a6e69c	ldr x8,[x21, #0x60]
00a6e6a0	ldr x0,[x8, #0x18]
00a6e6a4	bl 0x00c3b2f0
00a6e6a8	mov x21,x0
00a6e6ac	str wzr,[sp, #0xc]
00a6e6b0	bl 0x00c35250
00a6e6b4	add x1,sp,#0x10
00a6e6b8	mov x0,x21
00a6e6bc	mov x2,xzr
00a6e6c0	bl 0x00c357f0
00a6e6c4	mov x22,x0
00a6e6c8	bl 0x00c35240
00a6e6cc	mov x0,x21
00a6e6d0	bl 0x00c3b650
00a6e6d4	mov x21,x0
00a6e6d8	mov x0,x22
00a6e6dc	bl 0x00c35800
00a6e6e0	add x1,sp,#0x10
00a6e6e4	mov x0,x21
00a6e6e8	bl 0x00c3b620
00a6e6ec	cbz w0,0x00a6e720
00a6e6f0	adrp x2,0xa6f000
00a6e6f4	mov w1,w0
00a6e6f8	add x2,x2,#0xb78
00a6e6fc	add x3,sp,#0xc
00a6e700	mov x0,x21
00a6e704	bl 0x00c3b610
00a6e708	cbz w0,0x00a6e720
00a6e70c	ldr w8,[sp, #0xc]
00a6e710	str w8,[x19]
00a6e714	b 0x00a6e724
00a6e718	orr w20,wzr,#0xfffffffe
00a6e71c	b 0x00a6e724
00a6e720	mov w20,wzr
00a6e724	mov w0,w20
00a6e728	ldp x29,x30,[sp, #0x80]
00a6e72c	ldp x20,x19,[sp, #0x70]
00a6e730	ldp x22,x21,[sp, #0x60]
00a6e734	add sp,sp,#0x90
00a6e738	ret
