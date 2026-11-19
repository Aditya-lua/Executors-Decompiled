; FUN_00abf620 @ 00abf620
00abf620	sub sp,sp,#0x70
00abf624	stp x22,x21,[sp, #0x40]
00abf628	stp x20,x19,[sp, #0x50]
00abf62c	stp x29,x30,[sp, #0x60]
00abf630	add x29,sp,#0x60
00abf634	mov x21,x2
00abf638	mov x22,x1
00abf63c	mov x20,x0
00abf640	bl 0x00c3bfe0
00abf644	bl 0x00c32240
00abf648	mov x19,x0
00abf64c	cbz x0,0x00abf6ec
00abf650	ldr x2,[x22]
00abf654	add x0,sp,#0xc
00abf658	mov w1,#0x32
00abf65c	mov w3,wzr
00abf660	bl 0x00c32500
00abf664	bl 0x00c35250
00abf668	mov x0,x21
00abf66c	bl 0x00c3f7d0
00abf670	mov x22,x0
00abf674	mov x0,x21
00abf678	bl 0x00c3f7e0
00abf67c	mov x2,x0
00abf680	add x1,sp,#0xc
00abf684	mov x0,x22
00abf688	bl 0x00c357f0
00abf68c	mov x21,x0
00abf690	mov x22,x0
00abf694	cbnz x0,0x00abf6a8
00abf698	add x0,sp,#0xc
00abf69c	bl 0x00c35310
00abf6a0	mov x22,x0
00abf6a4	cbz x0,0x00abf784
00abf6a8	bl 0x00c35240
00abf6ac	mov w1,#0x6f
00abf6b0	mov x0,x19
00abf6b4	mov x2,xzr
00abf6b8	mov x3,x22
00abf6bc	bl 0x00c321a0
00abf6c0	cmp x0,#0x0
00abf6c4	b.le 0x00abf720
00abf6c8	mov x0,x21
00abf6cc	bl 0x00c35800
00abf6d0	ldr x0,[x20]
00abf6d4	cbz x0,0x00abf778
00abf6d8	mov x1,x19
00abf6dc	bl 0x00c35640
00abf6e0	cbz x0,0x00abf7b0
00abf6e4	mov w0,#0x1
00abf6e8	b 0x00abf764
00abf6ec	bl 0x00c342a0
00abf6f0	adrp x0,0x29e000
00abf6f4	adrp x2,0x2d4000
00abf6f8	add x0,x0,#0x913
00abf6fc	add x2,x2,#0x381
00abf700	mov w1,#0x42
00abf704	bl 0x00c342b0
00abf708	mov w1,#0x20
00abf70c	mov w0,#0x21
00abf710	movk w1,#0x8, LSL #16
00abf714	mov x2,xzr
00abf718	bl 0x00c342c0
00abf71c	b 0x00abf758
00abf720	bl 0x00c342a0
00abf724	adrp x0,0x29e000
00abf728	adrp x2,0x2d4000
00abf72c	add x0,x0,#0x913
00abf730	add x2,x2,#0x381
00abf734	mov w1,#0x58
00abf738	bl 0x00c342b0
00abf73c	mov w1,#0x20
00abf740	mov w0,#0x21
00abf744	movk w1,#0x8, LSL #16
00abf748	mov x2,xzr
00abf74c	bl 0x00c342c0
00abf750	mov x0,x21
00abf754	bl 0x00c35800
00abf758	mov x0,x19
00abf75c	bl 0x00c31a40
00abf760	mov w0,wzr
00abf764	ldp x29,x30,[sp, #0x60]
00abf768	ldp x20,x19,[sp, #0x50]
00abf76c	ldp x22,x21,[sp, #0x40]
00abf770	add sp,sp,#0x70
00abf774	ret
00abf778	str x19,[x20]
00abf77c	mov w0,#0x1
00abf780	b 0x00abf764
00abf784	bl 0x00c35ed0
00abf788	bl 0x00c342a0
00abf78c	adrp x0,0x29e000
00abf790	adrp x2,0x2d4000
00abf794	add x0,x0,#0x913
00abf798	add x2,x2,#0x381
00abf79c	mov w1,#0x52
00abf7a0	bl 0x00c342b0
00abf7a4	mov w0,#0x21
00abf7a8	mov w1,#0x6d
00abf7ac	b 0x00abf714
00abf7b0	bl 0x00c342a0
00abf7b4	adrp x0,0x29e000
00abf7b8	adrp x2,0x2d4000
00abf7bc	add x0,x0,#0x913
00abf7c0	add x2,x2,#0x381
00abf7c4	orr w1,wzr,#0x60
00abf7c8	b 0x00abf704
