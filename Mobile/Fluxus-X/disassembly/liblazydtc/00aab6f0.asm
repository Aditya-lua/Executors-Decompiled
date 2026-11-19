; CRYPTO_ocb128_copy_ctx @ 00aab6f0
00aab6f0	stp x22,x21,[sp, #-0x30]!
00aab6f4	mov x22,x2
00aab6f8	mov w2,#0xb0
00aab6fc	stp x20,x19,[sp, #0x10]
00aab700	stp x29,x30,[sp, #0x20]
00aab704	add x29,sp,#0x20
00aab708	mov x21,x3
00aab70c	mov x19,x1
00aab710	mov x20,x0
00aab714	bl 0x00c2ffd0
00aab718	cbz x22,0x00aab720
00aab71c	str x22,[x20, #0x10]
00aab720	cbz x21,0x00aab728
00aab724	str x21,[x20, #0x18]
00aab728	ldr x8,[x19, #0x58]
00aab72c	cbz x8,0x00aab764
00aab730	ldr x8,[x19, #0x30]
00aab734	adrp x1,0x2a6000
00aab738	add x1,x1,#0x3f0
00aab73c	mov w2,#0xcd
00aab740	lsl x0,x8,#0x4
00aab744	bl 0x00c32320
00aab748	str x0,[x20, #0x58]
00aab74c	cbz x0,0x00aab76c
00aab750	ldr x8,[x19, #0x28]
00aab754	ldr x1,[x19, #0x58]
00aab758	lsl x8,x8,#0x4
00aab75c	add x2,x8,#0x10
00aab760	bl 0x00c2ffd0
00aab764	mov w0,#0x1
00aab768	b 0x00aab7a0
00aab76c	bl 0x00c342a0
00aab770	adrp x0,0x2a6000
00aab774	adrp x2,0x2b0000
00aab778	add x0,x0,#0x3f0
00aab77c	add x2,x2,#0x3bf
00aab780	mov w1,#0xce
00aab784	bl 0x00c342b0
00aab788	mov w1,#0x100
00aab78c	orr w0,wzr,#0xf
00aab790	movk w1,#0xc, LSL #16
00aab794	mov x2,xzr
00aab798	bl 0x00c342c0
00aab79c	mov w0,wzr
00aab7a0	ldp x29,x30,[sp, #0x20]
00aab7a4	ldp x20,x19,[sp, #0x10]
00aab7a8	ldp x22,x21,[sp], #0x30
00aab7ac	ret
