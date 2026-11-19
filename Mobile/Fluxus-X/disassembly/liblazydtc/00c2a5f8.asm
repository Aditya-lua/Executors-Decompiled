; FUN_00c2a5f8 @ 00c2a5f8
00c2a5f8	paciasp
00c2a5fc	stp x29,x30,[sp, #-0x10]!
00c2a600	mov x29,sp
00c2a604	and w10,w1,#0xff
00c2a608	cmp w10,#0xff
00c2a60c	b.eq 0x00c2a644
00c2a610	and w8,w10,#0xf
00c2a614	ldr x9,[x0]
00c2a618	cmp w8,#0x3
00c2a61c	b.le 0x00c2a64c
00c2a620	cmp w8,#0x9
00c2a624	b.le 0x00c2a6ac
00c2a628	cmp w8,#0xa
00c2a62c	b.eq 0x00c2a730
00c2a630	cmp w8,#0xb
00c2a634	b.eq 0x00c2a784
00c2a638	cmp w8,#0xc
00c2a63c	b.eq 0x00c2a708
00c2a640	b 0x00c2a79c
00c2a644	mov x8,xzr
00c2a648	b 0x00c2a774
00c2a64c	cmp w8,#0x1
00c2a650	b.gt 0x00c2a688
00c2a654	cbz w8,0x00c2a708
00c2a658	cmp w8,#0x1
00c2a65c	b.ne 0x00c2a79c
00c2a660	mov x12,xzr
00c2a664	mov x8,xzr
00c2a668	mov x11,x9
00c2a66c	ldrb w13,[x11], #0x1
00c2a670	and x14,x13,#0x7f
00c2a674	lsl x14,x14,x12
00c2a678	add x12,x12,#0x7
00c2a67c	orr x8,x14,x8
00c2a680	tbnz w13,#0x7,0x00c2a66c
00c2a684	b 0x00c2a738
00c2a688	cmp w8,#0x2
00c2a68c	b.eq 0x00c2a71c
00c2a690	cmp w8,#0x3
00c2a694	b.ne 0x00c2a79c
00c2a698	mov x11,x9
00c2a69c	ldr w8,[x11], #0x4
00c2a6a0	ubfx w10,w10,#0x4,#0x3
00c2a6a4	cbnz w10,0x00c2a740
00c2a6a8	b 0x00c2a764
00c2a6ac	cmp w8,#0x4
00c2a6b0	b.eq 0x00c2a708
00c2a6b4	cmp w8,#0x9
00c2a6b8	b.ne 0x00c2a79c
00c2a6bc	mov x12,xzr
00c2a6c0	mov x8,xzr
00c2a6c4	mov x11,x9
00c2a6c8	ldrb w13,[x11], #0x1
00c2a6cc	and x14,x13,#0x7f
00c2a6d0	lsl x14,x14,x12
00c2a6d4	add x12,x12,#0x7
00c2a6d8	orr x8,x14,x8
00c2a6dc	tbnz w13,#0x7,0x00c2a6c8
00c2a6e0	mov x14,#-0x1
00c2a6e4	cmp x12,#0x40
00c2a6e8	mov w15,#0x3f
00c2a6ec	lsl x12,x14,x12
00c2a6f0	ccmp w13,w15,#0x0,cc
00c2a6f4	csel x12,x12,xzr,hi
00c2a6f8	orr x8,x8,x12
00c2a6fc	ubfx w10,w10,#0x4,#0x3
00c2a700	cbnz w10,0x00c2a740
00c2a704	b 0x00c2a764
00c2a708	mov x11,x9
00c2a70c	ldr x8,[x11], #0x8
00c2a710	ubfx w10,w10,#0x4,#0x3
00c2a714	cbnz w10,0x00c2a740
00c2a718	b 0x00c2a764
00c2a71c	mov x11,x9
00c2a720	ldrh w8,[x11], #0x2
00c2a724	ubfx w10,w10,#0x4,#0x3
00c2a728	cbnz w10,0x00c2a740
00c2a72c	b 0x00c2a764
00c2a730	mov x11,x9
00c2a734	ldrsh x8,[x11], #0x2
00c2a738	ubfx w10,w10,#0x4,#0x3
00c2a73c	cbz w10,0x00c2a764
00c2a740	cmp w10,#0x3
00c2a744	b.eq 0x00c2a75c
00c2a748	cmp w10,#0x1
00c2a74c	b.ne 0x00c2a798
00c2a750	cbz x8,0x00c2a770
00c2a754	add x8,x8,x9
00c2a758	b 0x00c2a764
00c2a75c	cbz x8,0x00c2a770
00c2a760	add x8,x8,x2
00c2a764	cbz x8,0x00c2a770
00c2a768	tbz w1,#0x7,0x00c2a770
00c2a76c	ldr x8,[x8]
00c2a770	str x11,[x0]
00c2a774	mov x0,x8
00c2a778	ldp x29,x30,[sp], #0x10
00c2a77c	autiasp
00c2a780	ret
00c2a784	mov x11,x9
00c2a788	ldrsw x8,[x11], #0x4
00c2a78c	ubfx w10,w10,#0x4,#0x3
00c2a790	cbnz w10,0x00c2a740
00c2a794	b 0x00c2a764
00c2a798	bl 0x00c30b40
00c2a79c	bl 0x00c30b40
