; ossl_parse_query @ 00ac64e8
00ac64e8	str x27,[sp, #-0x60]!
00ac64ec	stp x26,x25,[sp, #0x10]
00ac64f0	stp x24,x23,[sp, #0x20]
00ac64f4	stp x22,x21,[sp, #0x30]
00ac64f8	stp x20,x19,[sp, #0x40]
00ac64fc	stp x29,x30,[sp, #0x50]
00ac6500	add x29,sp,#0x50
00ac6504	str x1,[sp, #0x8]
00ac6508	cbz x1,0x00ac66ec
00ac650c	mov x20,x0
00ac6510	adrp x0,0xac5000
00ac6514	add x0,x0,#0xb60
00ac6518	mov w21,w2
00ac651c	mov x22,x1
00ac6520	bl 0x00c35340
00ac6524	cbz x0,0x00ac66ec
00ac6528	mov x19,x0
00ac652c	sub x25,x22,#0x1
00ac6530	ldrb w0,[x25, #0x1]!
00ac6534	mov w1,#0x8
00ac6538	bl 0x00c377c0
00ac653c	cbnz w0,0x00ac6530
00ac6540	str x25,[sp, #0x8]
00ac6544	ldrb w8,[x25]
00ac6548	cbz w8,0x00ac66f8
00ac654c	adrp x1,0x2d8000
00ac6550	add x1,x1,#0x6ba
00ac6554	orr w0,wzr,#0x18
00ac6558	mov w2,#0x1a2
00ac655c	bl 0x00c32320
00ac6560	mov x22,x0
00ac6564	cbz x0,0x00ac66e4
00ac6568	adrp x23,0x2d8000
00ac656c	adrp x24,0x2b8000
00ac6570	mov w26,#0x2
00ac6574	add x23,x23,#0x6ba
00ac6578	add x24,x24,#0x5e7
00ac657c	mov w27,#0x1
00ac6580	str xzr,[x22, #0x10]
00ac6584	ldrb w8,[x25]
00ac6588	cmp w8,#0x2d
00ac658c	b.eq 0x00ac6600
00ac6590	cmp w8,#0x3f
00ac6594	mov w8,wzr
00ac6598	b.ne 0x00ac65b4
00ac659c	ldrb w0,[x25, #0x1]!
00ac65a0	mov w1,#0x8
00ac65a4	bl 0x00c377c0
00ac65a8	cbnz w0,0x00ac659c
00ac65ac	mov w8,#0x1
00ac65b0	str x25,[sp, #0x8]
00ac65b4	ldrb w9,[x22, #0xc]
00ac65b8	add x1,sp,#0x8
00ac65bc	mov x0,x20
00ac65c0	mov x2,x22
00ac65c4	and w9,w9,#0xfe
00ac65c8	orr w8,w9,w8
00ac65cc	strb w8,[x22, #0xc]
00ac65d0	bl 0x00ac5b80
00ac65d4	cbz w0,0x00ac66e4
00ac65d8	ldr x25,[sp, #0x8]
00ac65dc	ldrb w8,[x25]
00ac65e0	cmp w8,#0x3d
00ac65e4	b.ne 0x00ac663c
00ac65e8	ldrb w0,[x25, #0x1]!
00ac65ec	mov w1,#0x8
00ac65f0	bl 0x00c377c0
00ac65f4	cbnz w0,0x00ac65e8
00ac65f8	mov w8,wzr
00ac65fc	b 0x00ac6674
00ac6600	ldrb w0,[x25, #0x1]!
00ac6604	mov w1,#0x8
00ac6608	bl 0x00c377c0
00ac660c	cbnz w0,0x00ac6600
00ac6610	str x25,[sp, #0x8]
00ac6614	ldrb w8,[x22, #0xc]
00ac6618	add x1,sp,#0x8
00ac661c	mov x0,x20
00ac6620	mov x2,x22
00ac6624	and w8,w8,#0xfe
00ac6628	str w26,[x22, #0x8]
00ac662c	strb w8,[x22, #0xc]
00ac6630	bl 0x00ac5b80
00ac6634	cbnz w0,0x00ac6698
00ac6638	b 0x00ac66e4
00ac663c	mov w2,#0x2
00ac6640	mov x0,x25
00ac6644	mov x1,x24
00ac6648	bl 0x00c35ef0
00ac664c	cbz w0,0x00ac665c
00ac6650	stp wzr,wzr,[x22, #0x4]
00ac6654	str w27,[x22, #0x10]
00ac6658	b 0x00ac6698
00ac665c	add x25,x25,#0x1
00ac6660	ldrb w0,[x25, #0x1]!
00ac6664	mov w1,#0x8
00ac6668	bl 0x00c377c0
00ac666c	cbnz w0,0x00ac6660
00ac6670	mov w8,#0x1
00ac6674	add x1,sp,#0x8
00ac6678	mov x0,x20
00ac667c	mov x2,x22
00ac6680	mov w3,w21
00ac6684	str x25,[sp, #0x8]
00ac6688	str w8,[x22, #0x8]
00ac668c	bl 0x00ac5d30
00ac6690	cbnz w0,0x00ac6698
00ac6694	str w26,[x22, #0x4]
00ac6698	mov x0,x19
00ac669c	mov x1,x22
00ac66a0	bl 0x00c347a0
00ac66a4	cbz w0,0x00ac66e4
00ac66a8	ldr x25,[sp, #0x8]
00ac66ac	ldrb w8,[x25]
00ac66b0	cmp w8,#0x2c
00ac66b4	b.ne 0x00ac66f4
00ac66b8	ldrb w0,[x25, #0x1]!
00ac66bc	mov w1,#0x8
00ac66c0	bl 0x00c377c0
00ac66c4	cbnz w0,0x00ac66b8
00ac66c8	orr w0,wzr,#0x18
00ac66cc	mov w2,#0x1a2
00ac66d0	mov x1,x23
00ac66d4	str x25,[sp, #0x8]
00ac66d8	bl 0x00c32320
00ac66dc	mov x22,x0
00ac66e0	cbnz x0,0x00ac6580
00ac66e4	mov x20,xzr
00ac66e8	b 0x00ac670c
00ac66ec	mov x20,xzr
00ac66f0	b 0x00ac6730
00ac66f4	cbnz w8,0x00ac6750
00ac66f8	mov x0,x20
00ac66fc	mov x1,x19
00ac6700	bl 0x00ac6380
00ac6704	mov x20,x0
00ac6708	mov x22,xzr
00ac670c	adrp x1,0x2d8000
00ac6710	add x1,x1,#0x6ba
00ac6714	mov w2,#0x1ce
00ac6718	mov x0,x22
00ac671c	bl 0x00c32310
00ac6720	adrp x1,0xac6000
00ac6724	add x1,x1,#0x4d8
00ac6728	mov x0,x19
00ac672c	bl 0x00c32600
00ac6730	mov x0,x20
00ac6734	ldp x29,x30,[sp, #0x50]
00ac6738	ldp x20,x19,[sp, #0x40]
00ac673c	ldp x22,x21,[sp, #0x30]
00ac6740	ldp x24,x23,[sp, #0x20]
00ac6744	ldp x26,x25,[sp, #0x10]
00ac6748	ldr x27,[sp], #0x60
00ac674c	ret
00ac6750	bl 0x00c342a0
00ac6754	adrp x0,0x2d8000
00ac6758	adrp x2,0x2a6000
00ac675c	add x0,x0,#0x6ba
00ac6760	add x2,x2,#0x6f0
00ac6764	mov w1,#0x1c7
00ac6768	bl 0x00c342b0
00ac676c	adrp x2,0x2b7000
00ac6770	add x2,x2,#0x91b
00ac6774	mov w0,#0x37
00ac6778	mov w1,#0x6e
00ac677c	mov x3,x25
00ac6780	bl 0x00c342c0
00ac6784	mov x20,xzr
00ac6788	b 0x00ac6708
