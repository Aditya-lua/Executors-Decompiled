; ossl_tdes_dupctx @ 00b2c730
00b2c730	stp x20,x19,[sp, #-0x20]!
00b2c734	stp x29,x30,[sp, #0x10]
00b2c738	add x29,sp,#0x10
00b2c73c	mov x19,x0
00b2c740	bl 0x00c41000
00b2c744	cbz w0,0x00b2c77c
00b2c748	adrp x1,0x2a4000
00b2c74c	add x1,x1,#0xdfc
00b2c750	mov w0,#0x248
00b2c754	mov w2,#0x2e
00b2c758	bl 0x00c32320
00b2c75c	mov x20,x0
00b2c760	cbz x0,0x00b2c784
00b2c764	ldr x8,[x19, #0xa8]
00b2c768	mov x0,x20
00b2c76c	mov x1,x19
00b2c770	ldr x8,[x8, #0x10]
00b2c774	blr x8
00b2c778	b 0x00b2c7b4
00b2c77c	mov x20,xzr
00b2c780	b 0x00b2c7b4
00b2c784	bl 0x00c342a0
00b2c788	adrp x0,0x2a4000
00b2c78c	adrp x2,0x2ce000
00b2c790	add x0,x0,#0xdfc
00b2c794	add x2,x2,#0x7ff
00b2c798	orr w1,wzr,#0x30
00b2c79c	bl 0x00c342b0
00b2c7a0	mov w1,#0x100
00b2c7a4	mov w0,#0x39
00b2c7a8	movk w1,#0xc, LSL #16
00b2c7ac	mov x2,xzr
00b2c7b0	bl 0x00c342c0
00b2c7b4	ldp x29,x30,[sp, #0x10]
00b2c7b8	mov x0,x20
00b2c7bc	ldp x20,x19,[sp], #0x20
00b2c7c0	ret
