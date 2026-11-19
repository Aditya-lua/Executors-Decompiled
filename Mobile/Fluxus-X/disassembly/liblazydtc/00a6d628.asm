; EVP_PKEY_assign @ 00a6d628
00a6d628	sub sp,sp,#0x40
00a6d62c	stp x20,x19,[sp, #0x20]
00a6d630	mov x20,x0
00a6d634	add x0,sp,#0x8
00a6d638	stp x22,x21,[sp, #0x10]
00a6d63c	stp x29,x30,[sp, #0x30]
00a6d640	add x29,sp,#0x30
00a6d644	mov x19,x2
00a6d648	mov w21,w1
00a6d64c	bl 0x00c37b20
00a6d650	cbz x0,0x00a6d65c
00a6d654	ldr w22,[x0]
00a6d658	b 0x00a6d660
00a6d65c	mov w22,wzr
00a6d660	ldr x0,[sp, #0x8]
00a6d664	bl 0x00c32360
00a6d668	cbz x19,0x00a6d6f8
00a6d66c	cmp w22,#0x494
00a6d670	b.eq 0x00a6d67c
00a6d674	cmp w22,#0x198
00a6d678	b.ne 0x00a6d6f8
00a6d67c	mov x0,x19
00a6d680	bl 0x00c36880
00a6d684	cbz x0,0x00a6d6f8
00a6d688	bl 0x00c36870
00a6d68c	cmp w22,#0x198
00a6d690	mov w2,#0x494
00a6d694	b.ne 0x00a6d730
00a6d698	cmp w0,#0x494
00a6d69c	b.ne 0x00a6d730
00a6d6a0	cbz x20,0x00a6d700
00a6d6a4	mov w4,#0xffffffff
00a6d6a8	mov x0,x20
00a6d6ac	mov x1,xzr
00a6d6b0	mov x3,xzr
00a6d6b4	mov x5,xzr
00a6d6b8	bl 0x00a6d2f4
00a6d6bc	cbz w0,0x00a6d78c
00a6d6c0	ldr w8,[x20]
00a6d6c4	str x19,[x20, #0x20]
00a6d6c8	cmp w8,#0x197
00a6d6cc	b.gt 0x00a6d708
00a6d6d0	cmp w8,#0x6
00a6d6d4	b.eq 0x00a6d720
00a6d6d8	cmp w8,#0x1c
00a6d6dc	b.eq 0x00a6d748
00a6d6e0	cmp w8,#0x74
00a6d6e4	b.ne 0x00a6d7a0
00a6d6e8	cbz x19,0x00a6d770
00a6d6ec	mov x0,x19
00a6d6f0	bl 0x00c3a220
00a6d6f4	b 0x00a6d764
00a6d6f8	mov w2,w21
00a6d6fc	cbnz x20,0x00a6d6a4
00a6d700	mov w0,wzr
00a6d704	b 0x00a6d78c
00a6d708	cmp w8,#0x198
00a6d70c	b.eq 0x00a6d758
00a6d710	cmp w8,#0x494
00a6d714	b.eq 0x00a6d784
00a6d718	cmp w8,#0x390
00a6d71c	b.ne 0x00a6d7a0
00a6d720	cbz x19,0x00a6d770
00a6d724	mov x0,x19
00a6d728	bl 0x00c3da20
00a6d72c	b 0x00a6d764
00a6d730	cmp w0,#0x494
00a6d734	ccmp w22,w2,#0x0,ne
00a6d738	mov w8,#0x198
00a6d73c	csel w2,w8,w21,eq
00a6d740	cbnz x20,0x00a6d6a4
00a6d744	b 0x00a6d700
00a6d748	cbz x19,0x00a6d770
00a6d74c	mov x0,x19
00a6d750	bl 0x00c39d90
00a6d754	b 0x00a6d764
00a6d758	cbz x19,0x00a6d770
00a6d75c	mov x0,x19
00a6d760	bl 0x00c3ad40
00a6d764	cmp w0,#0x0
00a6d768	cset w8,ne
00a6d76c	b 0x00a6d774
00a6d770	mov w8,wzr
00a6d774	ldrb w9,[x20, #0x4c]
00a6d778	and w9,w9,#0xfe
00a6d77c	orr w8,w9,w8
00a6d780	strb w8,[x20, #0x4c]
00a6d784	cmp x19,#0x0
00a6d788	cset w0,ne
00a6d78c	ldp x29,x30,[sp, #0x30]
00a6d790	ldp x20,x19,[sp, #0x20]
00a6d794	ldp x22,x21,[sp, #0x10]
00a6d798	add sp,sp,#0x40
00a6d79c	ret
00a6d7a0	ldrb w8,[x20, #0x4c]
00a6d7a4	and w8,w8,#0xfe
00a6d7a8	b 0x00a6d780
