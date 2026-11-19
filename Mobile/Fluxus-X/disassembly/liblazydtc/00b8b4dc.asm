; psa_cipher_decrypt @ 00b8b4dc
00b8b4dc	sub sp,sp,#0x80
00b8b4e0	stp x28,x27,[sp, #0x20]
00b8b4e4	stp x26,x25,[sp, #0x30]
00b8b4e8	stp x24,x23,[sp, #0x40]
00b8b4ec	stp x22,x21,[sp, #0x50]
00b8b4f0	stp x20,x19,[sp, #0x60]
00b8b4f4	stp x29,x30,[sp, #0x70]
00b8b4f8	add x29,sp,#0x70
00b8b4fc	mrs x23,tpidr_el0
00b8b500	ldr x8,[x23, #0x28]
00b8b504	and w9,w1,#0x7f000000
00b8b508	mov w10,#0x4000000
00b8b50c	mov x20,x6
00b8b510	mov x26,x5
00b8b514	mov x19,x4
00b8b518	mov x25,x3
00b8b51c	mov x24,x2
00b8b520	mov w27,w1
00b8b524	cmp w9,w10
00b8b528	str x8,[sp, #0x18]
00b8b52c	str xzr,[sp, #0x10]
00b8b530	b.ne 0x00b8b564
00b8b534	add x1,sp,#0x10
00b8b538	mov w2,#0x200
00b8b53c	mov w3,w27
00b8b540	bl 0x00b86e5c
00b8b544	ldr x21,[sp, #0x10]
00b8b548	mov w28,w0
00b8b54c	cbz w0,0x00b8b5f0
00b8b550	mov x22,xzr
00b8b554	mov x26,xzr
00b8b558	mov x24,xzr
00b8b55c	mov x19,xzr
00b8b560	b 0x00b8b57c
00b8b564	mov x21,xzr
00b8b568	mov x22,xzr
00b8b56c	mov x26,xzr
00b8b570	mov x24,xzr
00b8b574	mov x19,xzr
00b8b578	mov w28,#0xffffff79
00b8b57c	mov x0,x21
00b8b580	bl 0x00c431e0
00b8b584	str xzr,[x20]
00b8b588	mov x0,x22
00b8b58c	bl 0x00c30960
00b8b590	cbz x24,0x00b8b5bc
00b8b594	cbz x19,0x00b8b5b8
00b8b598	cbz x26,0x00b8b5ac
00b8b59c	mov x0,x19
00b8b5a0	mov x1,x24
00b8b5a4	mov x2,x26
00b8b5a8	bl 0x00c2ffd0
00b8b5ac	mov x0,x24
00b8b5b0	bl 0x00c30960
00b8b5b4	b 0x00b8b5bc
00b8b5b8	mov w28,#0xffffff69
00b8b5bc	ldr x8,[x23, #0x28]
00b8b5c0	ldr x9,[sp, #0x18]
00b8b5c4	cmp x8,x9
00b8b5c8	b.ne 0x00b8b798
00b8b5cc	mov w0,w28
00b8b5d0	ldp x29,x30,[sp, #0x70]
00b8b5d4	ldp x20,x19,[sp, #0x60]
00b8b5d8	ldp x22,x21,[sp, #0x50]
00b8b5dc	ldp x24,x23,[sp, #0x40]
00b8b5e0	ldp x26,x25,[sp, #0x30]
00b8b5e4	ldp x28,x27,[sp, #0x20]
00b8b5e8	add sp,sp,#0x80
00b8b5ec	ret
00b8b5f0	ldrh w8,[x21]
00b8b5f4	and w9,w8,#0x7000
00b8b5f8	cmp w9,#0x2, LSL #12
00b8b5fc	b.ne 0x00b8b68c
00b8b600	and w9,w8,#0x700
00b8b604	cbz w9,0x00b8b68c
00b8b608	mov w9,#0xfff
00b8b60c	movk w9,#0x4c0, LSL #16
00b8b610	cmp w27,w9
00b8b614	b.gt 0x00b8b64c
00b8b618	mov w9,#0x4000
00b8b61c	movk w9,#0x440, LSL #16
00b8b620	cmp w27,w9
00b8b624	b.eq 0x00b8b67c
00b8b628	mov w9,#0x4100
00b8b62c	movk w9,#0x440, LSL #16
00b8b630	cmp w27,w9
00b8b634	b.eq 0x00b8b67c
00b8b638	mov w9,#0xff00
00b8b63c	movk w9,#0x440, LSL #16
00b8b640	cmp w27,w9
00b8b644	b.eq 0x00b8b67c
00b8b648	b 0x00b8b68c
00b8b64c	mov w9,#0x1000
00b8b650	movk w9,#0x4c0, LSL #16
00b8b654	cmp w27,w9
00b8b658	b.eq 0x00b8b67c
00b8b65c	mov w9,#0x1200
00b8b660	movk w9,#0x4c0, LSL #16
00b8b664	cmp w27,w9
00b8b668	b.eq 0x00b8b67c
00b8b66c	mov w9,#0x1100
00b8b670	movk w9,#0x4c0, LSL #16
00b8b674	cmp w27,w9
00b8b678	b.ne 0x00b8b68c
00b8b67c	ubfx w8,w8,#0x8,#0x3
00b8b680	mov w9,#0x1
00b8b684	lsl w8,w9,w8
00b8b688	b 0x00b8b6c4
00b8b68c	mov w9,#0x100
00b8b690	movk w9,#0x480, LSL #16
00b8b694	cmp w27,w9
00b8b698	b.ne 0x00b8b6b0
00b8b69c	mov w9,#0x2004
00b8b6a0	cmp w8,w9
00b8b6a4	b.ne 0x00b8b6b0
00b8b6a8	orr w8,wzr,#0xc
00b8b6ac	b 0x00b8b6c4
00b8b6b0	mov w8,#0x1300
00b8b6b4	movk w8,#0x4c0, LSL #16
00b8b6b8	cmp w27,w8
00b8b6bc	mov w8,#0xd
00b8b6c0	csel w8,w8,wzr,eq
00b8b6c4	mov w8,w8
00b8b6c8	cmp x8,x25
00b8b6cc	b.hi 0x00b8b568
00b8b6d0	cbz x25,0x00b8b71c
00b8b6d4	mov w1,#0x1
00b8b6d8	mov x0,x25
00b8b6dc	bl 0x00c30a30
00b8b6e0	mov x22,x0
00b8b6e4	cbz x0,0x00b8b77c
00b8b6e8	mov x0,x22
00b8b6ec	mov x1,x24
00b8b6f0	mov x2,x25
00b8b6f4	bl 0x00c2ffd0
00b8b6f8	cbz x26,0x00b8b724
00b8b6fc	mov w1,#0x1
00b8b700	mov x0,x26
00b8b704	bl 0x00c30a30
00b8b708	mov x24,x0
00b8b70c	mov x7,x26
00b8b710	cbnz x0,0x00b8b730
00b8b714	mov x26,xzr
00b8b718	b 0x00b8b784
00b8b71c	mov x22,xzr
00b8b720	cbnz x26,0x00b8b6fc
00b8b724	mov x7,x26
00b8b728	mov x24,xzr
00b8b72c	mov x19,xzr
00b8b730	ldr w8,[x21, #0x4]
00b8b734	cmp w8,#0x100
00b8b738	b.cs 0x00b8b578
00b8b73c	ldp x1,x2,[x21, #0x28]
00b8b740	mov x0,x21
00b8b744	mov w3,w27
00b8b748	mov x4,x22
00b8b74c	mov x5,x25
00b8b750	mov x6,x24
00b8b754	str x20,[sp]
00b8b758	bl 0x00c42e80
00b8b75c	ldr x8,[sp, #0x10]
00b8b760	mov w28,w0
00b8b764	mov x0,x8
00b8b768	bl 0x00c431e0
00b8b76c	cbnz w28,0x00b8b584
00b8b770	cbz w0,0x00b8b790
00b8b774	mov w28,w0
00b8b778	b 0x00b8b584
00b8b77c	mov x26,xzr
00b8b780	mov x24,xzr
00b8b784	mov x19,xzr
00b8b788	mov w28,#0xffffff73
00b8b78c	b 0x00b8b57c
00b8b790	mov w28,wzr
00b8b794	b 0x00b8b588
00b8b798	bl 0x00c2fec0
