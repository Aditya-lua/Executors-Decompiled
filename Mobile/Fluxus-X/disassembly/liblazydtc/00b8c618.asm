; psa_aead_set_nonce @ 00b8c618
00b8c618	stp x22,x21,[sp, #-0x30]!
00b8c61c	stp x20,x19,[sp, #0x10]
00b8c620	stp x29,x30,[sp, #0x20]
00b8c624	add x29,sp,#0x20
00b8c628	mov x22,x2
00b8c62c	mov x21,x1
00b8c630	mov x20,x0
00b8c634	cbz x2,0x00b8c6d8
00b8c638	mov w1,#0x1
00b8c63c	mov x0,x22
00b8c640	bl 0x00c30a30
00b8c644	mov x19,x0
00b8c648	cbz x0,0x00b8c718
00b8c64c	mov x0,x19
00b8c650	mov x1,x21
00b8c654	mov x2,x22
00b8c658	bl 0x00c2ffd0
00b8c65c	ldr w8,[x20]
00b8c660	cbz w8,0x00b8c6e4
00b8c664	ldrb w9,[x20, #0x20]
00b8c668	tbnz w9,#0x0,0x00b8c6ec
00b8c66c	ldr w9,[x20, #0x4]
00b8c670	mov w10,#0x500
00b8c674	movk w10,#0x500, LSL #16
00b8c678	and w9,w9,#0xffc07fff
00b8c67c	cmp w9,w10
00b8c680	b.eq 0x00b8c738
00b8c684	mov w10,#0x100
00b8c688	movk w10,#0x540, LSL #16
00b8c68c	cmp w9,w10
00b8c690	b.eq 0x00b8c748
00b8c694	mov w10,#0x200
00b8c698	movk w10,#0x540, LSL #16
00b8c69c	mov w21,#0xffffff79
00b8c6a0	cmp w9,w10
00b8c6a4	b.ne 0x00b8c6f0
00b8c6a8	cbz x22,0x00b8c6f0
00b8c6ac	cmp w8,#0x1
00b8c6b0	b.ne 0x00b8c6f0
00b8c6b4	add x0,x20,#0x28
00b8c6b8	mov x1,x19
00b8c6bc	mov x2,x22
00b8c6c0	bl 0x00c42e20
00b8c6c4	mov w21,w0
00b8c6c8	cbz w0,0x00b8c75c
00b8c6cc	ldr w8,[x20]
00b8c6d0	cbnz w8,0x00b8c6f4
00b8c6d4	b 0x00b8c71c
00b8c6d8	mov x19,xzr
00b8c6dc	ldr w8,[x20]
00b8c6e0	cbnz w8,0x00b8c664
00b8c6e4	mov w21,#0xffffff77
00b8c6e8	b 0x00b8c71c
00b8c6ec	mov w21,#0xffffff77
00b8c6f0	cbz w8,0x00b8c71c
00b8c6f4	cmp w8,#0x1
00b8c6f8	b.ne 0x00b8c704
00b8c6fc	add x0,x20,#0x28
00b8c700	bl 0x00c42db0
00b8c704	mov w2,#0x1d8
00b8c708	mov x0,x20
00b8c70c	mov w1,wzr
00b8c710	bl 0x00c301c0
00b8c714	b 0x00b8c71c
00b8c718	mov w21,#0xffffff73
00b8c71c	mov x0,x19
00b8c720	bl 0x00c30960
00b8c724	ldp x29,x30,[sp, #0x20]
00b8c728	ldp x20,x19,[sp, #0x10]
00b8c72c	mov w0,w21
00b8c730	ldp x22,x21,[sp], #0x30
00b8c734	ret
00b8c738	cmp x22,#0xc
00b8c73c	mov w21,#0xffffff79
00b8c740	b.eq 0x00b8c6ac
00b8c744	b 0x00b8c6f0
00b8c748	sub x9,x22,#0x7
00b8c74c	cmp x9,#0x6
00b8c750	mov w21,#0xffffff79
00b8c754	b.ls 0x00b8c6ac
00b8c758	b 0x00b8c6f0
00b8c75c	ldrb w8,[x20, #0x20]
00b8c760	orr w8,w8,#0x1
00b8c764	strb w8,[x20, #0x20]
00b8c768	b 0x00b8c71c
