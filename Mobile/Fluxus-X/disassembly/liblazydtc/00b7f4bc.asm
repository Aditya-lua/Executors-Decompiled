; mbedtls_mpi_mul_mpi @ 00b7f4bc
00b7f4bc	sub sp,sp,#0x90
00b7f4c0	stp x28,x27,[sp, #0x30]
00b7f4c4	stp x26,x25,[sp, #0x40]
00b7f4c8	stp x24,x23,[sp, #0x50]
00b7f4cc	stp x22,x21,[sp, #0x60]
00b7f4d0	stp x20,x19,[sp, #0x70]
00b7f4d4	stp x29,x30,[sp, #0x80]
00b7f4d8	add x29,sp,#0x80
00b7f4dc	mrs x28,tpidr_el0
00b7f4e0	ldr x8,[x28, #0x28]
00b7f4e4	mov x20,x2
00b7f4e8	mov x21,x1
00b7f4ec	mov x19,x0
00b7f4f0	mov w9,#0x1
00b7f4f4	cmp x0,x1
00b7f4f8	str x8,[sp, #0x28]
00b7f4fc	str w9,[sp, #0x20]
00b7f500	str xzr,[sp, #0x18]
00b7f504	str w9,[sp, #0x10]
00b7f508	str xzr,[sp, #0x8]
00b7f50c	b.eq 0x00b7f544
00b7f510	cmp x19,x20
00b7f514	b.eq 0x00b7f618
00b7f518	ldrh w8,[x21, #0xa]
00b7f51c	sub x8,x8,#0x1
00b7f520	cmn x8,#0x1
00b7f524	b.eq 0x00b7f560
00b7f528	ldr x9,[x21]
00b7f52c	ldr x9,[x9, x8, LSL #0x3]
00b7f530	sub x8,x8,#0x1
00b7f534	cbz x9,0x00b7f520
00b7f538	mov w26,wzr
00b7f53c	add x22,x8,#0x2
00b7f540	b 0x00b7f568
00b7f544	add x0,sp,#0x18
00b7f548	mov x1,x19
00b7f54c	add x21,sp,#0x18
00b7f550	bl 0x00c41b60
00b7f554	mov w22,w0
00b7f558	cbnz w0,0x00b7f630
00b7f55c	b 0x00b7f510
00b7f560	mov x22,xzr
00b7f564	mov w26,#0x1
00b7f568	ldrh w8,[x20, #0xa]
00b7f56c	sub x8,x8,#0x1
00b7f570	cmn x8,#0x1
00b7f574	b.eq 0x00b7f590
00b7f578	ldr x9,[x20]
00b7f57c	ldr x9,[x9, x8, LSL #0x3]
00b7f580	sub x8,x8,#0x1
00b7f584	cbz x9,0x00b7f570
00b7f588	add x23,x8,#0x2
00b7f58c	b 0x00b7f598
00b7f590	mov x23,xzr
00b7f594	mov w26,#0x1
00b7f598	add x24,x23,x22
00b7f59c	mov w8,#0x2710
00b7f5a0	cmp x24,x8
00b7f5a4	b.ls 0x00b7f5b8
00b7f5a8	orr w22,wzr,#0xfffffff0
00b7f5ac	ldr x0,[sp, #0x8]
00b7f5b0	cbnz x0,0x00b7f638
00b7f5b4	b 0x00b7f644
00b7f5b8	ldrh w27,[x19, #0xa]
00b7f5bc	cmp x24,x27
00b7f5c0	b.ls 0x00b7f698
00b7f5c4	mov w1,#0x8
00b7f5c8	mov x0,x24
00b7f5cc	bl 0x00c30a30
00b7f5d0	mov x25,x0
00b7f5d4	cbz x0,0x00b7f5a8
00b7f5d8	str w26,[sp, #0x4]
00b7f5dc	ldr x26,[x19]
00b7f5e0	cbz x26,0x00b7f604
00b7f5e4	lsl x27,x27,#0x3
00b7f5e8	mov x0,x25
00b7f5ec	mov x1,x26
00b7f5f0	mov x2,x27
00b7f5f4	bl 0x00c2ffd0
00b7f5f8	mov x0,x26
00b7f5fc	mov x1,x27
00b7f600	bl 0x00c42230
00b7f604	ldr w26,[sp, #0x4]
00b7f608	strh w24,[x19, #0xa]
00b7f60c	str x25,[x19]
00b7f610	and x27,x24,#0xffff
00b7f614	b 0x00b7f69c
00b7f618	add x0,sp,#0x8
00b7f61c	mov x1,x19
00b7f620	add x20,sp,#0x8
00b7f624	bl 0x00c41b60
00b7f628	mov w22,w0
00b7f62c	cbz w0,0x00b7f518
00b7f630	ldr x0,[sp, #0x8]
00b7f634	cbz x0,0x00b7f644
00b7f638	ldrh w8,[sp, #0x12]
00b7f63c	lsl x1,x8,#0x3
00b7f640	bl 0x00c42230
00b7f644	ldr x0,[sp, #0x18]
00b7f648	mov w8,#0x1
00b7f64c	str w8,[sp, #0x10]
00b7f650	str xzr,[sp, #0x8]
00b7f654	cbz x0,0x00b7f664
00b7f658	ldrh w8,[sp, #0x22]
00b7f65c	lsl x1,x8,#0x3
00b7f660	bl 0x00c42230
00b7f664	ldr x8,[x28, #0x28]
00b7f668	ldr x9,[sp, #0x28]
00b7f66c	cmp x8,x9
00b7f670	b.ne 0x00b7f760
00b7f674	mov w0,w22
00b7f678	ldp x29,x30,[sp, #0x80]
00b7f67c	ldp x20,x19,[sp, #0x70]
00b7f680	ldp x22,x21,[sp, #0x60]
00b7f684	ldp x24,x23,[sp, #0x50]
00b7f688	ldp x26,x25,[sp, #0x40]
00b7f68c	ldp x28,x27,[sp, #0x30]
00b7f690	add sp,sp,#0x90
00b7f694	ret
00b7f698	cbz w27,0x00b7f708
00b7f69c	ldr x24,[x19]
00b7f6a0	lsl x2,x27,#0x3
00b7f6a4	mov x0,x24
00b7f6a8	mov w1,wzr
00b7f6ac	bl 0x00c301c0
00b7f6b0	ldr x0,[x19]
00b7f6b4	mov w24,#0x1
00b7f6b8	mov x2,x22
00b7f6bc	mov x4,x23
00b7f6c0	str xzr,[x0]
00b7f6c4	strh w24,[x19, #0x8]
00b7f6c8	ldr x1,[x21]
00b7f6cc	ldr x3,[x20]
00b7f6d0	bl 0x00c41ea0
00b7f6d4	mov w22,wzr
00b7f6d8	cbz w26,0x00b7f6ec
00b7f6dc	strh w24,[x19, #0x8]
00b7f6e0	ldr x0,[sp, #0x8]
00b7f6e4	cbnz x0,0x00b7f638
00b7f6e8	b 0x00b7f644
00b7f6ec	ldrh w8,[x21, #0x8]
00b7f6f0	ldrh w9,[x20, #0x8]
00b7f6f4	mul w8,w9,w8
00b7f6f8	strh w8,[x19, #0x8]
00b7f6fc	ldr x0,[sp, #0x8]
00b7f700	cbnz x0,0x00b7f638
00b7f704	b 0x00b7f644
00b7f708	mov w0,#0x1
00b7f70c	mov w1,#0x8
00b7f710	bl 0x00c30a30
00b7f714	mov x24,x0
00b7f718	cbz x0,0x00b7f5a8
00b7f71c	ldr x25,[x19]
00b7f720	cbz x25,0x00b7f74c
00b7f724	str w26,[sp, #0x4]
00b7f728	lsl x26,x27,#0x3
00b7f72c	mov x0,x24
00b7f730	mov x1,x25
00b7f734	mov x2,x26
00b7f738	bl 0x00c2ffd0
00b7f73c	mov x1,x26
00b7f740	ldr w26,[sp, #0x4]
00b7f744	mov x0,x25
00b7f748	bl 0x00c42230
00b7f74c	mov w8,#0x1
00b7f750	mov w2,#0x8
00b7f754	str x24,[x19]
00b7f758	strh w8,[x19, #0xa]
00b7f75c	b 0x00b7f6a4
00b7f760	bl 0x00c2fec0
