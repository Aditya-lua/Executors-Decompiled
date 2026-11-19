; mbedtls_aes_crypt_ctr @ 00b6f4a8
00b6f4a8	sub sp,sp,#0xa0
00b6f4ac	stp x28,x27,[sp, #0x40]
00b6f4b0	stp x26,x25,[sp, #0x50]
00b6f4b4	stp x24,x23,[sp, #0x60]
00b6f4b8	stp x22,x21,[sp, #0x70]
00b6f4bc	stp x20,x19,[sp, #0x80]
00b6f4c0	stp x29,x30,[sp, #0x90]
00b6f4c4	add x29,sp,#0x90
00b6f4c8	ldr x28,[x2]
00b6f4cc	mov x21,x6
00b6f4d0	mov x22,x5
00b6f4d4	mov x23,x4
00b6f4d8	mov x24,x3
00b6f4dc	mov x20,x1
00b6f4e0	cmp x28,#0xf
00b6f4e4	mov x25,x0
00b6f4e8	b.ls 0x00b6f4f4
00b6f4ec	orr w0,wzr,#0xffffffdf
00b6f4f0	b 0x00b6f718
00b6f4f4	cbz x20,0x00b6f708
00b6f4f8	sub x8,x21,#0x1
00b6f4fc	str x8,[sp, #0x38]
00b6f500	sub x8,x22,#0x1
00b6f504	str x8,[sp, #0x30]
00b6f508	sub x8,x23,#0x1
00b6f50c	str x8,[sp, #0x28]
00b6f510	add x8,x21,#0x10
00b6f514	str x8,[sp, #0x20]
00b6f518	add x8,x22,#0x10
00b6f51c	mov x26,xzr
00b6f520	mvn x27,x20
00b6f524	str x8,[sp, #0x18]
00b6f528	add x8,x23,#0x10
00b6f52c	mov w19,#0x10
00b6f530	stp x2,x8,[sp, #0x8]
00b6f534	b 0x00b6f5fc
00b6f538	ldp x18,x17,[sp, #0x30]
00b6f53c	cmp x13,x14
00b6f540	add x15,x26,x12
00b6f544	csinv x11,x13,x11,hi
00b6f548	add x16,x21,x15
00b6f54c	add x13,x22,x15
00b6f550	sub x15,x26,x11
00b6f554	add x17,x17,x15
00b6f558	add x15,x18,x15
00b6f55c	ldr x18,[sp, #0x28]
00b6f560	sub x11,x28,x11
00b6f564	cmp x16,x15
00b6f568	add x14,x12,x28
00b6f56c	add x11,x18,x11
00b6f570	cset w15,cc
00b6f574	cmp x13,x17
00b6f578	add x14,x23,x14
00b6f57c	cset w13,cc
00b6f580	cmp x16,x11
00b6f584	cset w11,cc
00b6f588	cmp x14,x17
00b6f58c	and w15,w15,w13
00b6f590	cset w13,cc
00b6f594	tbnz w15,#0x0,0x00b6f6bc
00b6f598	and w11,w11,w13
00b6f59c	tbnz w11,#0x0,0x00b6f6bc
00b6f5a0	ldp x16,x13,[sp, #0x18]
00b6f5a4	add x14,x26,x12
00b6f5a8	and x11,x10,#-0x20
00b6f5ac	add x15,x28,x12
00b6f5b0	add x13,x13,x14
00b6f5b4	add x14,x16,x14
00b6f5b8	ldr x16,[sp, #0x10]
00b6f5bc	add x12,x12,x11
00b6f5c0	add x15,x16,x15
00b6f5c4	mov x16,x11
00b6f5c8	ldp q0,q1,[x14, #-0x10]
00b6f5cc	ldp q2,q3,[x15, #-0x10]
00b6f5d0	subs x16,x16,#0x20
00b6f5d4	add x14,x14,#0x20
00b6f5d8	add x15,x15,#0x20
00b6f5dc	eor v0.16B,v2.16B,v0.16B
00b6f5e0	eor v1.16B,v3.16B,v1.16B
00b6f5e4	stp q0,q1,[x13, #-0x10]
00b6f5e8	add x13,x13,#0x20
00b6f5ec	b.ne 0x00b6f5c8
00b6f5f0	cmp x10,x11
00b6f5f4	b.ne 0x00b6f6bc
00b6f5f8	b 0x00b6f6f0
00b6f5fc	cbz x28,0x00b6f608
00b6f600	sub x11,x19,x28
00b6f604	b 0x00b6f648
00b6f608	mov x0,x25
00b6f60c	mov x1,x24
00b6f610	mov x2,x23
00b6f614	bl 0x00c419a0
00b6f618	orr w8,wzr,#0xc
00b6f61c	ldr w9,[x24, x8#0x0]
00b6f620	rev w9,w9
00b6f624	add w9,w9,#0x1
00b6f628	rev w10,w9
00b6f62c	str w10,[x24, x8#0x0]
00b6f630	cbz x8,0x00b6f644
00b6f634	sub x8,x8,#0x4
00b6f638	mov w11,#0x10
00b6f63c	cbz w9,0x00b6f61c
00b6f640	b 0x00b6f648
00b6f644	mov w11,#0x10
00b6f648	sub x8,x20,x26
00b6f64c	cmp x11,x8
00b6f650	csel x8,x8,x11,hi
00b6f654	cmp x8,#0x10
00b6f658	mov x12,xzr
00b6f65c	b.cc 0x00b6f694
00b6f660	mov x10,xzr
00b6f664	add x9,x21,x26
00b6f668	add x13,x22,x26
00b6f66c	add x14,x23,x28
00b6f670	ldr q0,[x13,x10]
00b6f674	ldr q1,[x14,x10]
00b6f678	add x12,x10,#0x10
00b6f67c	add x15,x10,#0x20
00b6f680	cmp x15,x8
00b6f684	eor v0.16B,v1.16B,v0.16B
00b6f688	str q0,[x9,x10]
00b6f68c	mov x10,x12
00b6f690	b.ls 0x00b6f670
00b6f694	cmp x12,x8
00b6f698	b.cs 0x00b6f6f0
00b6f69c	add x13,x26,x27
00b6f6a0	mvn x14,x11
00b6f6a4	cmp x13,x14
00b6f6a8	mvn x10,x12
00b6f6ac	csinv x9,x13,x11,hi
00b6f6b0	sub x10,x10,x9
00b6f6b4	cmp x10,#0x1f
00b6f6b8	b.hi 0x00b6f538
00b6f6bc	mvn x10,x12
00b6f6c0	add x13,x12,x26
00b6f6c4	add x11,x12,x28
00b6f6c8	sub x9,x10,x9
00b6f6cc	add x10,x21,x13
00b6f6d0	add x11,x23,x11
00b6f6d4	add x12,x22,x13
00b6f6d8	ldrb w13,[x12], #0x1
00b6f6dc	ldrb w14,[x11], #0x1
00b6f6e0	subs x9,x9,#0x1
00b6f6e4	eor w13,w14,w13
00b6f6e8	strb w13,[x10], #0x1
00b6f6ec	b.ne 0x00b6f6d8
00b6f6f0	add x26,x8,x26
00b6f6f4	cmp x26,x20
00b6f6f8	mov x28,xzr
00b6f6fc	b.cc 0x00b6f5fc
00b6f700	ldr x2,[sp, #0x8]
00b6f704	ldr x28,[x2]
00b6f708	add w8,w28,w20
00b6f70c	mov w0,wzr
00b6f710	and x8,x8,#0xf
00b6f714	str x8,[x2]
00b6f718	ldp x29,x30,[sp, #0x90]
00b6f71c	ldp x20,x19,[sp, #0x80]
00b6f720	ldp x22,x21,[sp, #0x70]
00b6f724	ldp x24,x23,[sp, #0x60]
00b6f728	ldp x26,x25,[sp, #0x50]
00b6f72c	ldp x28,x27,[sp, #0x40]
00b6f730	add sp,sp,#0xa0
00b6f734	ret
