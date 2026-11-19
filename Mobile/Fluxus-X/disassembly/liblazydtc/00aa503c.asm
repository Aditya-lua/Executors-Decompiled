; OSSL_SELF_TEST_set_callback @ 00aa503c
00aa503c	stp x20,x19,[sp, #-0x20]!
00aa5040	mov x19,x2
00aa5044	adrp x2,0xc6d000
00aa5048	mov x20,x1
00aa504c	add x2,x2,#0x920
00aa5050	orr w1,wzr,#0xc
00aa5054	stp x29,x30,[sp, #0x10]
00aa5058	add x29,sp,#0x10
00aa505c	bl 0x00c3b520
00aa5060	cbz x0,0x00aa5068
00aa5064	stp x20,x19,[x0]
00aa5068	ldp x29,x30,[sp, #0x10]
00aa506c	ldp x20,x19,[sp], #0x20
00aa5070	ret
