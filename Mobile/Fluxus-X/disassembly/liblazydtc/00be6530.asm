; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be6530
00be6530	bti c
00be6534	adrp x4,0x2b8000
00be6538	add x4,x4,#0x7c
00be653c	b 0x00be6540
00be6540	paciasp
00be6544	sub sp,sp,#0x1a0
00be6548	stp x29,x30,[sp, #0x140]
00be654c	stp x28,x27,[sp, #0x150]
00be6550	stp x26,x25,[sp, #0x160]
00be6554	stp x24,x23,[sp, #0x170]
00be6558	stp x22,x21,[sp, #0x180]
00be655c	stp x20,x19,[sp, #0x190]
00be6560	add x29,sp,#0x140
00be6564	ldr w9,[x2, #0x8]
00be6568	mov w8,#0x25
00be656c	mov w19,w3
00be6570	mov x20,x2
00be6574	mov x21,x1
00be6578	stur x8,[x29, #-0x8]
00be657c	sub x8,x29,#0x8
00be6580	str q0,[sp]
00be6584	tbnz w9,#0xb,0x00be6594
00be6588	orr x8,x8,#0x1
00be658c	tbnz w9,#0xa,0x00be65a4
00be6590	b 0x00be65ac
00be6594	mov w10,#0x2b
00be6598	orr x8,x8,#0x2
00be659c	sturb w10,[x29, #-0x7]
00be65a0	tbz w9,#0xa,0x00be65ac
00be65a4	mov w10,#0x23
00be65a8	strb w10,[x8], #0x1
00be65ac	mov w10,#0x104
00be65b0	and w22,w9,w10
00be65b4	cmp w22,#0x104
00be65b8	b.eq 0x00be65c4
00be65bc	mov w10,#0x2a2e
00be65c0	strh w10,[x8], #0x2
00be65c4	ldrb w10,[x4]
00be65c8	cbz w10,0x00be65dc
00be65cc	add x11,x4,#0x1
00be65d0	strb w10,[x8], #0x1
00be65d4	ldrb w10,[x11], #0x1
00be65d8	cbnz w10,0x00be65d0
00be65dc	cmp w22,#0x100
00be65e0	b.eq 0x00be65fc
00be65e4	cmp w22,#0x4
00be65e8	b.ne 0x00be660c
00be65ec	tst w9,#0x4000
00be65f0	mov w9,#0x46
00be65f4	mov w10,#0x66
00be65f8	b 0x00be6674
00be65fc	tst w9,#0x4000
00be6600	mov w9,#0x45
00be6604	mov w10,#0x65
00be6608	b 0x00be6674
00be660c	cmp w22,#0x104
00be6610	b.ne 0x00be6668
00be6614	tst w9,#0x4000
00be6618	mov w9,#0x41
00be661c	mov w10,#0x61
00be6620	csel w9,w10,w9,eq
00be6624	sub x10,x29,#0x26
00be6628	adrp x22,0xd27000
00be662c	strb w9,[x8]
00be6630	adrp x8,0xd27000
00be6634	add x8,x8,#0xf8
00be6638	stur x10,[x29, #-0x30]
00be663c	ldarb w8,[x8]
00be6640	tbz w8,#0x0,0x00be6908
00be6644	ldr x2,[x22, #0xf0]
00be6648	ldr q0,[sp]
00be664c	sub x0,x29,#0x26
00be6650	sub x3,x29,#0x8
00be6654	mov w1,#0x1e
00be6658	bl 0x00c0cd14
00be665c	cmp w0,#0x1d
00be6660	b.gt 0x00be66c4
00be6664	b 0x00be66f0
00be6668	tst w9,#0x4000
00be666c	mov w9,#0x47
00be6670	mov w10,#0x67
00be6674	csel w9,w10,w9,eq
00be6678	adrp x23,0xd27000
00be667c	add x23,x23,#0xf8
00be6680	strb w9,[x8]
00be6684	sub x8,x29,#0x26
00be6688	stur x8,[x29, #-0x30]
00be668c	ldarb w8,[x23]
00be6690	tbz w8,#0x0,0x00be6854
00be6694	adrp x24,0xd27000
00be6698	ldr w4,[x20, #0x10]
00be669c	ldr q0,[sp]
00be66a0	ldr x2,[x24, #0xf0]
00be66a4	sub x0,x29,#0x26
00be66a8	sub x3,x29,#0x8
00be66ac	mov w1,#0x1e
00be66b0	bl 0x00c0cd14
00be66b4	cmp w0,#0x1d
00be66b8	b.le 0x00be66f0
00be66bc	cmp w22,#0x104
00be66c0	b.ne 0x00be66f8
00be66c4	adrp x8,0xd27000
00be66c8	add x8,x8,#0xf8
00be66cc	ldarb w8,[x8]
00be66d0	tbz w8,#0x0,0x00be6894
00be66d4	adrp x8,0xd27000
00be66d8	ldr x1,[x8, #0xf0]
00be66dc	ldr q0,[sp]
00be66e0	sub x0,x29,#0x30
00be66e4	sub x2,x29,#0x8
00be66e8	bl 0x00c0cdd4
00be66ec	b 0x00be6718
00be66f0	mov x22,xzr
00be66f4	b 0x00be6724
00be66f8	ldarb w8,[x23]
00be66fc	tbz w8,#0x0,0x00be68d0
00be6700	ldr x1,[x24, #0xf0]
00be6704	ldr w3,[x20, #0x10]
00be6708	ldr q0,[sp]
00be670c	sub x0,x29,#0x30
00be6710	sub x2,x29,#0x8
00be6714	bl 0x00c0cdd4
00be6718	cmn w0,#0x1
00be671c	b.eq 0x00be6890
00be6720	ldur x22,[x29, #-0x30]
00be6724	ldr w9,[x20, #0x8]
00be6728	ldur x23,[x29, #-0x30]
00be672c	sxtw x8,w0
00be6730	mov w10,#0xb0
00be6734	and w9,w9,w10
00be6738	add x25,x23,x8
00be673c	cmp w9,#0x20
00be6740	mov x26,x25
00be6744	b.eq 0x00be6798
00be6748	cmp w9,#0x10
00be674c	b.ne 0x00be6794
00be6750	ldrb w9,[x23]
00be6754	cmp w9,#0x2d
00be6758	b.eq 0x00be6764
00be675c	cmp w9,#0x2b
00be6760	b.ne 0x00be676c
00be6764	add x26,x23,#0x1
00be6768	b 0x00be6798
00be676c	cmp w8,#0x2
00be6770	b.lt 0x00be6794
00be6774	cmp w9,#0x30
00be6778	b.ne 0x00be6794
00be677c	ldrb w9,[x23, #0x1]
00be6780	orr w9,w9,#0x20
00be6784	cmp w9,#0x78
00be6788	b.ne 0x00be6794
00be678c	add x26,x23,#0x2
00be6790	b 0x00be6798
00be6794	mov x26,x23
00be6798	sub x9,x29,#0x26
00be679c	cmp x23,x9
00be67a0	b.eq 0x00be67bc
00be67a4	lsl x0,x8,#0x3
00be67a8	bl 0x00c308d0
00be67ac	mov x24,x0
00be67b0	mov x27,x0
00be67b4	cbnz x0,0x00be67c4
00be67b8	bl 0x00c43cc0
00be67bc	mov x24,xzr
00be67c0	add x27,sp,#0x2c
00be67c4	add x8,sp,#0x10
00be67c8	mov x0,x20
00be67cc	bl 0x00c30070
00be67d0	add x4,sp,#0x20
00be67d4	add x5,sp,#0x18
00be67d8	add x6,sp,#0x10
00be67dc	mov x0,x23
00be67e0	mov x1,x26
00be67e4	mov x2,x25
00be67e8	mov x3,x27
00be67ec	bl 0x00c44180
00be67f0	add x0,sp,#0x10
00be67f4	bl 0x00c30090
00be67f8	ldp x3,x2,[sp, #0x18]
00be67fc	mov x0,x21
00be6800	mov x1,x27
00be6804	mov x4,x20
00be6808	mov w5,w19
00be680c	bl 0x00be6bec
00be6810	mov x19,x0
00be6814	cbz x24,0x00be6820
00be6818	mov x0,x24
00be681c	bl 0x00c30960
00be6820	cbz x22,0x00be682c
00be6824	mov x0,x22
00be6828	bl 0x00c30960
00be682c	mov x0,x19
00be6830	ldp x20,x19,[sp, #0x190]
00be6834	ldp x22,x21,[sp, #0x180]
00be6838	ldp x24,x23,[sp, #0x170]
00be683c	ldp x26,x25,[sp, #0x160]
00be6840	ldp x28,x27,[sp, #0x150]
00be6844	ldp x29,x30,[sp, #0x140]
00be6848	add sp,sp,#0x1a0
00be684c	autiasp
00be6850	ret
00be6854	adrp x0,0xd27000
00be6858	add x0,x0,#0xf8
00be685c	bl 0x00c2fe90
00be6860	cbz w0,0x00be6694
00be6864	adrp x1,0x2c6000
00be6868	add x1,x1,#0xbfc
00be686c	mov w0,#0x1fbf
00be6870	mov x2,xzr
00be6874	bl 0x00c43890
00be6878	adrp x8,0xd27000
00be687c	str x0,[x8, #0xf0]
00be6880	adrp x0,0xd27000
00be6884	add x0,x0,#0xf8
00be6888	bl 0x00c2fea0
00be688c	b 0x00be6694
00be6890	bl 0x00c43cc0
00be6894	adrp x0,0xd27000
00be6898	add x0,x0,#0xf8
00be689c	bl 0x00c2fe90
00be68a0	cbz w0,0x00be66d4
00be68a4	adrp x1,0x2c6000
00be68a8	add x1,x1,#0xbfc
00be68ac	mov w0,#0x1fbf
00be68b0	mov x2,xzr
00be68b4	bl 0x00c43890
00be68b8	adrp x8,0xd27000
00be68bc	str x0,[x8, #0xf0]
00be68c0	adrp x0,0xd27000
00be68c4	add x0,x0,#0xf8
00be68c8	bl 0x00c2fea0
00be68cc	b 0x00be66d4
00be68d0	adrp x0,0xd27000
00be68d4	add x0,x0,#0xf8
00be68d8	bl 0x00c2fe90
00be68dc	cbz w0,0x00be6700
00be68e0	adrp x1,0x2c6000
00be68e4	add x1,x1,#0xbfc
00be68e8	mov w0,#0x1fbf
00be68ec	mov x2,xzr
00be68f0	bl 0x00c43890
00be68f4	str x0,[x24, #0xf0]
00be68f8	adrp x0,0xd27000
00be68fc	add x0,x0,#0xf8
00be6900	bl 0x00c2fea0
00be6904	b 0x00be6700
00be6908	adrp x0,0xd27000
00be690c	add x0,x0,#0xf8
00be6910	bl 0x00c2fe90
00be6914	cbz w0,0x00be6644
00be6918	adrp x1,0x2c6000
00be691c	add x1,x1,#0xbfc
00be6920	mov w0,#0x1fbf
00be6924	mov x2,xzr
00be6928	bl 0x00c43890
00be692c	str x0,[x22, #0xf0]
00be6930	adrp x0,0xd27000
00be6934	add x0,x0,#0xf8
00be6938	bl 0x00c2fea0
00be693c	b 0x00be6644
