; OSSL_PARAM_set_uint32 @ 00a9e5f0
00a9e5f0	str x21,[sp, #-0x30]!
00a9e5f4	stp x20,x19,[sp, #0x10]
00a9e5f8	stp x29,x30,[sp, #0x20]
00a9e5fc	add x29,sp,#0x20
00a9e600	str w1,[sp, #0xc]
00a9e604	cbz x0,0x00a9e70c
00a9e608	ldr w8,[x0, #0x8]
00a9e60c	mov w20,w1
00a9e610	mov x19,x0
00a9e614	str xzr,[x0, #0x20]
00a9e618	cmp w8,#0x1
00a9e61c	b.eq 0x00a9e69c
00a9e620	cmp w8,#0x3
00a9e624	b.eq 0x00a9e6cc
00a9e628	cmp w8,#0x2
00a9e62c	mov w0,wzr
00a9e630	b.ne 0x00a9e70c
00a9e634	ldr x21,[x19, #0x10]
00a9e638	mov w8,#0x4
00a9e63c	str x8,[x19, #0x20]
00a9e640	cbz x21,0x00a9e708
00a9e644	ldr x2,[x19, #0x18]
00a9e648	cmp x2,#0x8
00a9e64c	b.eq 0x00a9e6f8
00a9e650	subs x8,x2,#0x4
00a9e654	b.eq 0x00a9e6c4
00a9e658	mov w9,#0x4
00a9e65c	cmp x2,#0x5
00a9e660	str x9,[x19, #0x20]
00a9e664	b.cs 0x00a9e72c
00a9e668	mov w8,#0x4
00a9e66c	subs x9,x8,x2
00a9e670	b.eq 0x00a9e784
00a9e674	add x8,sp,#0xc
00a9e678	mov x10,xzr
00a9e67c	add x11,x8,x2
00a9e680	mov w8,#0x4
00a9e684	ldrb w12,[x11, x10]
00a9e688	cbnz w12,0x00a9e7ac
00a9e68c	add x10,x10,#0x1
00a9e690	cmp x10,x9
00a9e694	b.cc 0x00a9e684
00a9e698	b 0x00a9e784
00a9e69c	ldr x21,[x19, #0x10]
00a9e6a0	mov w8,#0x4
00a9e6a4	str x8,[x19, #0x20]
00a9e6a8	cbz x21,0x00a9e708
00a9e6ac	ldr x2,[x19, #0x18]
00a9e6b0	cmp x2,#0x8
00a9e6b4	b.eq 0x00a9e6f8
00a9e6b8	subs x8,x2,#0x4
00a9e6bc	b.ne 0x00a9e71c
00a9e6c0	tbnz w20,#0x1f,0x00a9e7a0
00a9e6c4	str w20,[x21]
00a9e6c8	b 0x00a9e708
00a9e6cc	ldr x8,[x19, #0x10]
00a9e6d0	mov w9,#0x8
00a9e6d4	str x9,[x19, #0x20]
00a9e6d8	cbz x8,0x00a9e708
00a9e6dc	ldr x9,[x19, #0x18]
00a9e6e0	mov w0,wzr
00a9e6e4	cmp x9,#0x8
00a9e6e8	b.ne 0x00a9e70c
00a9e6ec	ucvtf d0,w20
00a9e6f0	str d0,[x8]
00a9e6f4	b 0x00a9e708
00a9e6f8	mov w8,#0x8
00a9e6fc	mov w9,w20
00a9e700	str x8,[x19, #0x20]
00a9e704	str x9,[x21]
00a9e708	mov w0,#0x1
00a9e70c	ldp x29,x30,[sp, #0x20]
00a9e710	ldp x20,x19,[sp, #0x10]
00a9e714	ldr x21,[sp], #0x30
00a9e718	ret
00a9e71c	mov w9,#0x4
00a9e720	cmp x2,#0x5
00a9e724	str x9,[x19, #0x20]
00a9e728	b.cc 0x00a9e744
00a9e72c	add x0,x21,#0x4
00a9e730	mov w1,wzr
00a9e734	mov x2,x8
00a9e738	bl 0x00c301c0
00a9e73c	str w20,[x21]
00a9e740	b 0x00a9e790
00a9e744	mov w8,#0x4
00a9e748	subs x9,x8,x2
00a9e74c	b.eq 0x00a9e774
00a9e750	add x8,sp,#0xc
00a9e754	mov x10,xzr
00a9e758	add x11,x8,x2
00a9e75c	mov w8,#0x4
00a9e760	ldrb w12,[x11, x10]
00a9e764	cbnz w12,0x00a9e7ac
00a9e768	add x10,x10,#0x1
00a9e76c	cmp x10,x9
00a9e770	b.cc 0x00a9e760
00a9e774	add x8,sp,#0xc
00a9e778	add x8,x8,x2
00a9e77c	ldursb w8,[x8, #-0x1]
00a9e780	tbnz w8,#0x1f,0x00a9e7a8
00a9e784	add x1,sp,#0xc
00a9e788	mov x0,x21
00a9e78c	bl 0x00c2ffd0
00a9e790	ldr x8,[x19, #0x18]
00a9e794	mov w0,#0x1
00a9e798	str x8,[x19, #0x20]
00a9e79c	b 0x00a9e70c
00a9e7a0	mov w0,wzr
00a9e7a4	b 0x00a9e70c
00a9e7a8	mov w8,#0x4
00a9e7ac	mov w0,wzr
00a9e7b0	str x8,[x19, #0x20]
00a9e7b4	b 0x00a9e70c
