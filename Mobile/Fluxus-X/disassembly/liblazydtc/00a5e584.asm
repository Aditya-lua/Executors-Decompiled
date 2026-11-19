; evp_cipher_asn1_to_param_ex @ 00a5e584
00a5e584	sub sp,sp,#0xe0
00a5e588	stp x22,x21,[sp, #0xb0]
00a5e58c	stp x20,x19,[sp, #0xc0]
00a5e590	stp x29,x30,[sp, #0xd0]
00a5e594	ldr x8,[x0]
00a5e598	mov x20,x0
00a5e59c	mov x21,x1
00a5e5a0	add x29,sp,#0xd0
00a5e5a4	ldr x9,[x8, #0x48]
00a5e5a8	cbz x9,0x00a5e5f8
00a5e5ac	mov x0,x20
00a5e5b0	mov x1,x21
00a5e5b4	blr x9
00a5e5b8	mov w19,w0
00a5e5bc	cmn w0,#0x2
00a5e5c0	b.ne 0x00a5e7c0
00a5e5c4	bl 0x00c342a0
00a5e5c8	adrp x0,0x2a0000
00a5e5cc	adrp x2,0x2bf000
00a5e5d0	add x0,x0,#0x246
00a5e5d4	add x2,x2,#0xc6c
00a5e5d8	mov w1,#0xea
00a5e5dc	bl 0x00c342b0
00a5e5e0	orr w0,wzr,#0x6
00a5e5e4	mov w1,#0x6b
00a5e5e8	mov x2,xzr
00a5e5ec	bl 0x00c342c0
00a5e5f0	mov w19,#0xffffffff
00a5e5f4	b 0x00a5e7fc
00a5e5f8	ldr x9,[x8, #0x10]
00a5e5fc	tbnz w9,#0x18,0x00a5e644
00a5e600	mov w8,#0x7
00a5e604	movk w8,#0xf, LSL #16
00a5e608	and w8,w9,w8
00a5e60c	cmp w8,#0x10, LSL #12
00a5e610	b.le 0x00a5e6e0
00a5e614	orr w9,wzr,#0x10001
00a5e618	cmp w8,w9
00a5e61c	b.eq 0x00a5e5c4
00a5e620	mov w9,#0x2
00a5e624	movk w9,#0x1, LSL #16
00a5e628	cmp w8,w9
00a5e62c	b.eq 0x00a5e748
00a5e630	mov w9,#0x3
00a5e634	movk w9,#0x1, LSL #16
00a5e638	cmp w8,w9
00a5e63c	b.eq 0x00a5e5c4
00a5e640	b 0x00a5e6f0
00a5e644	ldr x8,[x8, #0x78]
00a5e648	cbz x8,0x00a5e5c4
00a5e64c	add x1,sp,#0x28
00a5e650	mov x0,x21
00a5e654	str xzr,[sp, #0x28]
00a5e658	bl 0x00c37880
00a5e65c	mov w19,#0xffffffff
00a5e660	tbnz w0,#0x1f,0x00a5e7c0
00a5e664	ldr x1,[sp, #0x28]
00a5e668	sxtw x2,w0
00a5e66c	adrp x0,0x2b7000
00a5e670	add x0,x0,#0xcaa
00a5e674	mov x8,sp
00a5e678	bl 0x00c34c50
00a5e67c	ldr x8,[sp, #0x20]
00a5e680	ldp q1,q0,[sp]
00a5e684	str x8,[sp, #0x50]
00a5e688	mov x8,sp
00a5e68c	stp q1,q0,[sp, #0x30]
00a5e690	bl 0x00c34c40
00a5e694	ldr x8,[sp, #0x20]
00a5e698	ldp q1,q0,[sp]
00a5e69c	add x1,sp,#0x30
00a5e6a0	mov x0,x20
00a5e6a4	str x8,[sp, #0x78]
00a5e6a8	stur q0,[sp, #0x68]
00a5e6ac	stur q1,[sp, #0x58]
00a5e6b0	bl 0x00c361c0
00a5e6b4	ldr x8,[sp, #0x28]
00a5e6b8	adrp x1,0x2a0000
00a5e6bc	cmp w0,#0x0
00a5e6c0	add x1,x1,#0x246
00a5e6c4	mov w2,#0xe3
00a5e6c8	mov x0,x8
00a5e6cc	cneg w19,w19,ne
00a5e6d0	bl 0x00c32310
00a5e6d4	cmp w19,#0x0
00a5e6d8	b.gt 0x00a5e7fc
00a5e6dc	b 0x00a5e7c8
00a5e6e0	cmp w8,#0x6
00a5e6e4	b.eq 0x00a5e750
00a5e6e8	cmp w8,#0x7
00a5e6ec	b.eq 0x00a5e5c4
00a5e6f0	cbz x21,0x00a5e7b4
00a5e6f4	mov x0,x20
00a5e6f8	bl 0x00a5e8c0
00a5e6fc	cmp w0,#0x10
00a5e700	b.hi 0x00a5e740
00a5e704	mov w19,w0
00a5e708	add x1,sp,#0x30
00a5e70c	mov x0,x21
00a5e710	mov w2,w19
00a5e714	bl 0x00c37d80
00a5e718	cmp w0,w19
00a5e71c	b.ne 0x00a5e740
00a5e720	add x4,sp,#0x30
00a5e724	mov w5,#0xffffffff
00a5e728	mov x0,x20
00a5e72c	mov x1,xzr
00a5e730	mov x2,xzr
00a5e734	mov x3,xzr
00a5e738	bl 0x00c34be0
00a5e73c	cbnz w0,0x00a5e7b8
00a5e740	mov w19,#0xffffffff
00a5e744	b 0x00a5e7b8
00a5e748	mov w19,#0x1
00a5e74c	b 0x00a5e7fc
00a5e750	cbz x21,0x00a5e814
00a5e754	mov x22,x2
00a5e758	mov w19,wzr
00a5e75c	cbz x2,0x00a5e7c0
00a5e760	mov x1,sp
00a5e764	mov w3,#0x10
00a5e768	mov x0,x21
00a5e76c	mov x2,xzr
00a5e770	bl 0x00c37db0
00a5e774	mov w19,w0
00a5e778	cmp w0,#0x1
00a5e77c	b.lt 0x00a5e824
00a5e780	mov x1,sp
00a5e784	add x2,sp,#0x30
00a5e788	mov x0,x21
00a5e78c	mov w3,w19
00a5e790	bl 0x00c37db0
00a5e794	sxtw x2,w19
00a5e798	add x1,sp,#0x30
00a5e79c	mov x0,x22
00a5e7a0	bl 0x00c2ffd0
00a5e7a4	str w19,[x22, #0x10]
00a5e7a8	cmp w19,#0x0
00a5e7ac	b.gt 0x00a5e7fc
00a5e7b0	b 0x00a5e7c8
00a5e7b4	mov w19,wzr
00a5e7b8	asr w8,w19,#0x1f
00a5e7bc	orr w19,w8,#0x1
00a5e7c0	cmp w19,#0x0
00a5e7c4	b.gt 0x00a5e7fc
00a5e7c8	bl 0x00c342a0
00a5e7cc	adrp x0,0x2a0000
00a5e7d0	adrp x2,0x2bf000
00a5e7d4	add x0,x0,#0x246
00a5e7d8	add x2,x2,#0xc6c
00a5e7dc	mov w1,#0xec
00a5e7e0	bl 0x00c342b0
00a5e7e4	orr w0,wzr,#0x6
00a5e7e8	mov w1,#0x7a
00a5e7ec	mov x2,xzr
00a5e7f0	bl 0x00c342c0
00a5e7f4	cmn w19,#0x2
00a5e7f8	b.le 0x00a5e5f0
00a5e7fc	mov w0,w19
00a5e800	ldp x29,x30,[sp, #0xd0]
00a5e804	ldp x20,x19,[sp, #0xc0]
00a5e808	ldp x22,x21,[sp, #0xb0]
00a5e80c	add sp,sp,#0xe0
00a5e810	ret
00a5e814	mov w19,wzr
00a5e818	cmp w19,#0x0
00a5e81c	b.gt 0x00a5e7fc
00a5e820	b 0x00a5e7c8
00a5e824	mov w19,#0xffffffff
00a5e828	cmp w19,#0x0
00a5e82c	b.gt 0x00a5e7fc
00a5e830	b 0x00a5e7c8
