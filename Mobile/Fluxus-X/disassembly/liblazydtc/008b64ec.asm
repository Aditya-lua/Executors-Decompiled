; FUN_008b64ec @ 008b64ec
008b64ec	sub sp,sp,#0x60
008b64f0	stp x29,x30,[sp, #0x10]
008b64f4	stp x26,x25,[sp, #0x20]
008b64f8	stp x24,x23,[sp, #0x30]
008b64fc	stp x22,x21,[sp, #0x40]
008b6500	stp x20,x19,[sp, #0x50]
008b6504	add x29,sp,#0x10
008b6508	mrs x22,tpidr_el0
008b650c	mov x20,x0
008b6510	mov x0,xzr
008b6514	ldr x8,[x22, #0x28]
008b6518	str x8,[sp, #0x8]
008b651c	ldr x19,[x20, #0x58]
008b6520	ldrb w9,[x19, #0x2]
008b6524	ldrb w8,[x19]
008b6528	orr w9,w9,#0x4
008b652c	cmp w8,#0xa
008b6530	strb w9,[x19, #0x2]
008b6534	b.gt 0x008b6570
008b6538	cmp w8,#0x6
008b653c	b.eq 0x008b661c
008b6540	cmp w8,#0x7
008b6544	b.eq 0x008b68dc
008b6548	cmp w8,#0x9
008b654c	b.ne 0x008b6db4
008b6550	ldr x8,[x19, #0x38]
008b6554	ldrb w9,[x19, #0x6]
008b6558	str x8,[x20, #0x58]
008b655c	tbz w9,#0x0,0x008b6a80
008b6560	mov x0,x20
008b6564	mov x1,x19
008b6568	bl 0x008b6efc
008b656c	b 0x008b6a9c
008b6570	cmp w8,#0xb
008b6574	b.eq 0x008b666c
008b6578	cmp w8,#0xc
008b657c	b.eq 0x008b6968
008b6580	cmp w8,#0xe
008b6584	b.ne 0x008b6db4
008b6588	ldr x9,[x19, #0x20]
008b658c	ldr x8,[x19, #0x70]
008b6590	str x9,[x20, #0x58]
008b6594	cbz x8,0x008b65a8
008b6598	ldrb w9,[x8, #0x2]
008b659c	and w9,w9,#0xf8
008b65a0	orr w9,w9,#0x4
008b65a4	strb w9,[x8, #0x2]
008b65a8	ldr x8,[x19, #0x88]
008b65ac	cbz x8,0x008b65c0
008b65b0	ldrb w9,[x8, #0x2]
008b65b4	and w9,w9,#0xf8
008b65b8	orr w9,w9,#0x4
008b65bc	strb w9,[x8, #0x2]
008b65c0	ldr w8,[x19, #0x9c]
008b65c4	cmp w8,#0x1
008b65c8	b.lt 0x008b6730
008b65cc	mov x21,xzr
008b65d0	mov x23,xzr
008b65d4	b 0x008b65e8
008b65d8	add x23,x23,#0x1
008b65dc	add x21,x21,#0x10
008b65e0	cmp x23,w8, SXTW 
008b65e4	b.ge 0x008b6730
008b65e8	ldr x9,[x19, #0x28]
008b65ec	add x9,x9,x21
008b65f0	ldr w10,[x9, #0xc]
008b65f4	cmp w10,#0x5
008b65f8	b.lt 0x008b65d8
008b65fc	ldr x1,[x9]
008b6600	ldrb w9,[x1, #0x2]
008b6604	tst w9,#0x3
008b6608	b.eq 0x008b65d8
008b660c	mov x0,x20
008b6610	bl 0x008b61bc
008b6614	ldr w8,[x19, #0x9c]
008b6618	b 0x008b65d8
008b661c	ldp x1,x8,[x19, #0x10]
008b6620	str x8,[x20, #0x58]
008b6624	cbz x1,0x008b6c60
008b6628	ldrb w8,[x1, #0x2]
008b662c	tst w8,#0x3
008b6630	b.eq 0x008b6644
008b6634	mov x0,x20
008b6638	bl 0x008b61bc
008b663c	ldr x1,[x19, #0x10]
008b6640	cbz x1,0x008b6c60
008b6644	ldrb w8,[x1, #0x6]
008b6648	tbnz w8,#0x2,0x008b6c60
008b664c	ldrb w8,[x1, #0x7]
008b6650	tbnz w8,#0x1,0x008b6bfc
008b6654	ldr x2,[x20, #0x348]
008b6658	mov x0,x1
008b665c	mov w1,#0x2
008b6660	bl 0x008bdfe0
008b6664	cbnz x0,0x008b6c04
008b6668	b 0x008b6c60
008b666c	ldp x8,x1,[x19, #0x8]
008b6670	str x8,[x20, #0x58]
008b6674	ldrb w8,[x1, #0x2]
008b6678	tst w8,#0x3
008b667c	b.eq 0x008b6688
008b6680	mov x0,x20
008b6684	bl 0x008b61bc
008b6688	ldr x1,[x19, #0x20]
008b668c	cbz x1,0x008b66a4
008b6690	ldrb w8,[x1, #0x2]
008b6694	tst w8,#0x3
008b6698	b.eq 0x008b66a4
008b669c	mov x0,x20
008b66a0	bl 0x008b61bc
008b66a4	ldr x1,[x19, #0x38]
008b66a8	ldrb w8,[x1, #0x2]
008b66ac	tst w8,#0x3
008b66b0	b.eq 0x008b66bc
008b66b4	mov x0,x20
008b66b8	bl 0x008b61bc
008b66bc	ldr w8,[x19, #0x5c]
008b66c0	ldrb w9,[x19, #0x68]
008b66c4	cmp w8,w9
008b66c8	b.ne 0x008b69e8
008b66cc	ldr w9,[x19, #0x58]
008b66d0	cmp w8,w9
008b66d4	b.ne 0x008b6a2c
008b66d8	ldr x1,[x19, #0x48]
008b66dc	cbz x1,0x008b66f4
008b66e0	ldrb w8,[x1, #0x2]
008b66e4	tst w8,#0x3
008b66e8	b.eq 0x008b66f4
008b66ec	mov x0,x20
008b66f0	bl 0x008b61bc
008b66f4	ldr x1,[x19, #0x50]
008b66f8	cbz x1,0x008b6710
008b66fc	ldrb w8,[x1, #0x2]
008b6700	tst w8,#0x3
008b6704	b.eq 0x008b6710
008b6708	mov x0,x20
008b670c	bl 0x008b61bc
008b6710	ldp w9,w8,[x19, #0x58]
008b6714	ldrb w10,[x19, #0x68]
008b6718	sub w9,w8,w9
008b671c	sub w8,w8,w10
008b6720	ubfiz x9,x9,#0x4,#0x20
008b6724	add x8,x9,w8, UXTW  #0x3
008b6728	add x0,x8,#0x70
008b672c	b 0x008b6db4
008b6730	ldr w8,[x19, #0xb4]
008b6734	cmp w8,#0x1
008b6738	b.lt 0x008b676c
008b673c	ldr x9,[x19, #0x10]
008b6740	b 0x008b6750
008b6744	subs x8,x8,#0x1
008b6748	add x9,x9,#0x8
008b674c	b.eq 0x008b676c
008b6750	ldr x10,[x9]
008b6754	cbz x10,0x008b6744
008b6758	ldrb w11,[x10, #0x2]
008b675c	and w11,w11,#0xf8
008b6760	orr w11,w11,#0x4
008b6764	strb w11,[x10, #0x2]
008b6768	b 0x008b6744
008b676c	ldr w8,[x19, #0xac]
008b6770	cmp w8,#0x1
008b6774	b.lt 0x008b67b4
008b6778	mov x21,xzr
008b677c	b 0x008b678c
008b6780	add x21,x21,#0x1
008b6784	cmp x21,w8, SXTW 
008b6788	b.ge 0x008b67b4
008b678c	ldr x9,[x19, #0x38]
008b6790	ldr x1,[x9, x21, LSL #0x3]
008b6794	cbz x1,0x008b6780
008b6798	ldrb w9,[x1, #0x2]
008b679c	tst w9,#0x3
008b67a0	b.eq 0x008b6780
008b67a4	mov x0,x20
008b67a8	bl 0x008b61bc
008b67ac	ldr w8,[x19, #0xac]
008b67b0	b 0x008b6780
008b67b4	ldr w8,[x19, #0xa4]
008b67b8	cmp w8,#0x1
008b67bc	b.lt 0x008b67f0
008b67c0	ldr x9,[x19, #0x80]
008b67c4	b 0x008b67d4
008b67c8	subs x8,x8,#0x1
008b67cc	add x9,x9,#0x18
008b67d0	b.eq 0x008b67f0
008b67d4	ldr x10,[x9]
008b67d8	cbz x10,0x008b67c8
008b67dc	ldrb w11,[x10, #0x2]
008b67e0	and w11,w11,#0xf8
008b67e4	orr w11,w11,#0x4
008b67e8	strb w11,[x10, #0x2]
008b67ec	b 0x008b67c8
008b67f0	ldr x1,[x19, #0xd0]
008b67f4	cbz x1,0x008b680c
008b67f8	ldrb w8,[x1, #0x2]
008b67fc	tst w8,#0x3
008b6800	b.eq 0x008b680c
008b6804	mov x0,x20
008b6808	bl 0x008b61bc
008b680c	ldr x1,[x19, #0xd8]
008b6810	cbz x1,0x008b6828
008b6814	ldrb w8,[x1, #0x2]
008b6818	tst w8,#0x3
008b681c	b.eq 0x008b6828
008b6820	mov x0,x20
008b6824	bl 0x008b61bc
008b6828	ldr x8,[x19, #0xe8]
008b682c	cbz x8,0x008b6864
008b6830	ldr x1,[x8, #0x28]
008b6834	ldrb w9,[x1, #0x2]
008b6838	tst w9,#0x3
008b683c	b.eq 0x008b684c
008b6840	mov x0,x20
008b6844	bl 0x008b61bc
008b6848	ldr x8,[x19, #0xe8]
008b684c	ldr x1,[x8, #0x30]
008b6850	ldrb w8,[x1, #0x2]
008b6854	tst w8,#0x3
008b6858	b.eq 0x008b6864
008b685c	mov x0,x20
008b6860	bl 0x008b61bc
008b6864	adrp x8,0xd1f000
008b6868	ldrb w8,[x8, #0x4f8]
008b686c	cmp w8,#0x1
008b6870	b.ne 0x008b6898
008b6874	ldr x8,[x20, #0x720]
008b6878	cbz x8,0x008b6898
008b687c	ldr x9,[x19, #0xe8]
008b6880	cbnz x9,0x008b6898
008b6884	ldrb w9,[x19, #0x78]
008b6888	tbnz w9,#0x0,0x008b6898
008b688c	ldr x0,[x20, #0x1e0]
008b6890	mov x1,x19
008b6894	blr x8
008b6898	ldpsw x9,x8,[x19, #0xb4]
008b689c	ldrsw x10,[x19, #0x9c]
008b68a0	ldrsw x11,[x19, #0xb0]
008b68a4	ldrsw x12,[x19, #0xa4]
008b68a8	lsl x8,x8,#0x2
008b68ac	add x8,x8,x10, LSL #0x4
008b68b0	mov w10,#0x18
008b68b4	add x8,x8,x11
008b68b8	ldrsw x11,[x19, #0xbc]
008b68bc	nop
008b68c0	smaddl x8,w12,w10,x8
008b68c4	ldrsw x10,[x19, #0xac]
008b68c8	add x9,x9,x10
008b68cc	add x8,x8,x11
008b68d0	add x8,x8,x9, LSL #0x3
008b68d4	add x0,x8,#0xf0
008b68d8	b 0x008b6db4
008b68dc	ldp x8,x1,[x19, #0x8]
008b68e0	str x8,[x20, #0x58]
008b68e4	ldrb w8,[x1, #0x2]
008b68e8	tst w8,#0x3
008b68ec	b.eq 0x008b68f8
008b68f0	mov x0,x20
008b68f4	bl 0x008b61bc
008b68f8	ldrb w8,[x19, #0x6]
008b68fc	ldr x1,[x19, #0x18]
008b6900	cbz w8,0x008b6b74
008b6904	cbz x1,0x008b6918
008b6908	ldrb w8,[x1, #0x2]
008b690c	and w8,w8,#0xf8
008b6910	orr w8,w8,#0x4
008b6914	strb w8,[x1, #0x2]
008b6918	ldrb w8,[x19, #0x5]
008b691c	cbz w8,0x008b6bd8
008b6920	mov x21,xzr
008b6924	add x23,x19,#0x30
008b6928	b 0x008b693c
008b692c	add x21,x21,#0x1
008b6930	add x23,x23,#0x10
008b6934	cmp x21,w8, UXTW 
008b6938	b.cs 0x008b6bd8
008b693c	ldr w9,[x23, #0xc]
008b6940	cmp w9,#0x5
008b6944	b.lt 0x008b692c
008b6948	ldr x1,[x23]
008b694c	ldrb w9,[x1, #0x2]
008b6950	tst w9,#0x3
008b6954	b.eq 0x008b692c
008b6958	mov x0,x20
008b695c	bl 0x008b61bc
008b6960	ldrb w8,[x19, #0x5]
008b6964	b 0x008b692c
008b6968	ldp x8,x1,[x19, #0x8]
008b696c	str x8,[x20, #0x58]
008b6970	ldrb w8,[x1, #0x2]
008b6974	tst w8,#0x3
008b6978	b.eq 0x008b6984
008b697c	mov x0,x20
008b6980	bl 0x008b61bc
008b6984	ldr w8,[x19, #0x18]
008b6988	cbz w8,0x008b6bec
008b698c	mov x21,xzr
008b6990	mov x23,xzr
008b6994	b 0x008b69a8
008b6998	add x23,x23,#0x1
008b699c	add x21,x21,#0x10
008b69a0	cmp x23,x8
008b69a4	b.cs 0x008b69dc
008b69a8	ldr x9,[x19, #0x20]
008b69ac	add x9,x9,x21
008b69b0	ldr w10,[x9, #0xc]
008b69b4	cmp w10,#0x5
008b69b8	b.lt 0x008b6998
008b69bc	ldr x1,[x9]
008b69c0	ldrb w9,[x1, #0x2]
008b69c4	tst w9,#0x3
008b69c8	b.eq 0x008b6998
008b69cc	mov x0,x20
008b69d0	bl 0x008b61bc
008b69d4	ldr w8,[x19, #0x18]
008b69d8	b 0x008b6998
008b69dc	lsl x8,x8,#0x4
008b69e0	add x0,x8,#0x28
008b69e4	b 0x008b6db4
008b69e8	mov x21,xzr
008b69ec	b 0x008b6a00
008b69f0	add x21,x21,#0x1
008b69f4	sub w10,w8,w9
008b69f8	cmp x21,x10
008b69fc	b.cs 0x008b66cc
008b6a00	ldr x10,[x19, #0x40]
008b6a04	ldr x1,[x10, x21, LSL #0x3]
008b6a08	cbz x1,0x008b69f0
008b6a0c	ldrb w10,[x1, #0x2]
008b6a10	tst w10,#0x3
008b6a14	b.eq 0x008b69f0
008b6a18	mov x0,x20
008b6a1c	bl 0x008b61bc
008b6a20	ldr w8,[x19, #0x5c]
008b6a24	ldrb w9,[x19, #0x68]
008b6a28	b 0x008b69f0
008b6a2c	mov x21,xzr
008b6a30	mov x23,xzr
008b6a34	b 0x008b6a4c
008b6a38	add x23,x23,#0x1
008b6a3c	sub w10,w8,w9
008b6a40	add x21,x21,#0x10
008b6a44	cmp x23,x10
008b6a48	b.cs 0x008b66d8
008b6a4c	ldr x10,[x19, #0x28]
008b6a50	add x10,x10,x21
008b6a54	ldr w11,[x10, #0xc]
008b6a58	cmp w11,#0x5
008b6a5c	b.lt 0x008b6a38
008b6a60	ldr x1,[x10]
008b6a64	ldrb w10,[x1, #0x2]
008b6a68	tst w10,#0x3
008b6a6c	b.eq 0x008b6a38
008b6a70	mov x0,x20
008b6a74	bl 0x008b61bc
008b6a78	ldp w9,w8,[x19, #0x58]
008b6a7c	b 0x008b6a38
008b6a80	ldr x8,[x19, #0x60]
008b6a84	mov x0,x20
008b6a88	mov x1,x19
008b6a8c	ldr x21,[x8, #0x1e0]
008b6a90	bl 0x008b6efc
008b6a94	cmp x19,x21
008b6a98	b.ne 0x008b6ac0
008b6a9c	ldr x8,[x20, #0x60]
008b6aa0	str x19,[x20, #0x60]
008b6aa4	ldrb w9,[x19, #0x2]
008b6aa8	str x8,[x19, #0x38]
008b6aac	and w9,w9,#0xfffffffb
008b6ab0	strb w9,[x19, #0x2]
008b6ab4	ldrb w9,[x20, #0x1]
008b6ab8	cmp w9,#0x3
008b6abc	b.ne 0x008b6b38
008b6ac0	ldr x8,[x19, #0x58]
008b6ac4	ldrsw x9,[x19, #0x40]
008b6ac8	ldr x12,[x19, #0x68]
008b6acc	add x8,x8,x9, LSL #0x4
008b6ad0	cmp x12,x8
008b6ad4	b.cs 0x008b6b38
008b6ad8	add x9,x12,#0x10
008b6adc	mvn x10,x12
008b6ae0	cmp x8,x9
008b6ae4	csel x9,x8,x9,hi
008b6ae8	add x10,x9,x10
008b6aec	mov x9,x12
008b6af0	cmp x10,#0x10
008b6af4	b.cc 0x008b6b28
008b6af8	lsr x9,x10,#0x4
008b6afc	add x10,x9,#0x1
008b6b00	and x11,x10,#0x1ffffffffffffffe
008b6b04	add x9,x12,x11, LSL #0x4
008b6b08	add x12,x12,#0x1c
008b6b0c	mov x13,x11
008b6b10	subs x13,x13,#0x2
008b6b14	stur wzr,[x12, #-0x10]
008b6b18	str wzr,[x12], #0x20
008b6b1c	b.ne 0x008b6b10
008b6b20	cmp x10,x11
008b6b24	b.eq 0x008b6b38
008b6b28	str wzr,[x9, #0xc]
008b6b2c	add x9,x9,#0x10
008b6b30	cmp x9,x8
008b6b34	b.cc 0x008b6b28
008b6b38	ldrb w8,[x20, #0x1]
008b6b3c	cmp w8,#0x1
008b6b40	b.ne 0x008b6b58
008b6b44	nop
008b6b48	adr x1,0x8b7000
008b6b4c	add x2,sp,#0x7
008b6b50	mov x0,x19
008b6b54	bl 0x008b3edc
008b6b58	ldrsw x8,[x19, #0x44]
008b6b5c	mov w9,#0x30
008b6b60	smull x8,w8,w9
008b6b64	ldrsw x9,[x19, #0x40]
008b6b68	add x8,x8,x9, LSL #0x4
008b6b6c	add x0,x8,#0x88
008b6b70	b 0x008b6db4
008b6b74	ldrb w8,[x1, #0x2]
008b6b78	tst w8,#0x3
008b6b7c	b.eq 0x008b6b88
008b6b80	mov x0,x20
008b6b84	bl 0x008b61bc
008b6b88	ldrb w8,[x19, #0x5]
008b6b8c	cbz w8,0x008b6bd8
008b6b90	mov x21,xzr
008b6b94	add x23,x19,#0x20
008b6b98	b 0x008b6bac
008b6b9c	add x21,x21,#0x1
008b6ba0	add x23,x23,#0x10
008b6ba4	cmp x21,w8, UXTW 
008b6ba8	b.cs 0x008b6bd8
008b6bac	ldr w9,[x23, #0xc]
008b6bb0	cmp w9,#0x5
008b6bb4	b.lt 0x008b6b9c
008b6bb8	ldr x1,[x23]
008b6bbc	ldrb w9,[x1, #0x2]
008b6bc0	tst w9,#0x3
008b6bc4	b.eq 0x008b6b9c
008b6bc8	mov x0,x20
008b6bcc	bl 0x008b61bc
008b6bd0	ldrb w8,[x19, #0x5]
008b6bd4	b 0x008b6b9c
008b6bd8	ldrb w9,[x19, #0x6]
008b6bdc	ubfiz x8,x8,#0x4,#0x20
008b6be0	cbz w9,0x008b6bf4
008b6be4	add x0,x8,#0x30
008b6be8	b 0x008b6db4
008b6bec	mov w0,#0x28
008b6bf0	b 0x008b6db4
008b6bf4	add x0,x8,#0x20
008b6bf8	b 0x008b6db4
008b6bfc	ldr x8,[x1, #0x20]
008b6c00	sub x0,x8,#0x30
008b6c04	ldr w8,[x0, #0xc]
008b6c08	cmp w8,#0x5
008b6c0c	b.ne 0x008b6c60
008b6c10	ldr x23,[x0]
008b6c14	mov w1,#0x76
008b6c18	add x0,x23,#0x18
008b6c1c	bl 0x00c30890
008b6c20	mov x21,x0
008b6c24	add x0,x23,#0x18
008b6c28	mov w1,#0x6b
008b6c2c	bl 0x00c30890
008b6c30	cmp x0,#0x0
008b6c34	orr x8,x0,x21
008b6c38	cset w23,ne
008b6c3c	cbz x8,0x008b6c60
008b6c40	ldr x8,[x20, #0x68]
008b6c44	str x19,[x20, #0x68]
008b6c48	str x8,[x19, #0x18]
008b6c4c	cbz x0,0x008b6c54
008b6c50	cbnz x21,0x008b6d6c
008b6c54	cbz x21,0x008b6c64
008b6c58	mov w21,#0x1
008b6c5c	b 0x008b6cb0
008b6c60	mov w23,wzr
008b6c64	ldrsw x21,[x19, #0x8]
008b6c68	cbz w21,0x008b6cb0
008b6c6c	lsl x24,x21,#0x4
008b6c70	b 0x008b6c80
008b6c74	sub x21,x21,#0x1
008b6c78	sub x24,x24,#0x10
008b6c7c	cbz x21,0x008b6cb0
008b6c80	ldr x8,[x19, #0x20]
008b6c84	add x8,x8,x24
008b6c88	ldur w9,[x8, #-0x4]
008b6c8c	cmp w9,#0x5
008b6c90	b.lt 0x008b6c74
008b6c94	ldur x1,[x8, #-0x10]
008b6c98	ldrb w8,[x1, #0x2]
008b6c9c	tst w8,#0x3
008b6ca0	b.eq 0x008b6c74
008b6ca4	mov x0,x20
008b6ca8	bl 0x008b61bc
008b6cac	b 0x008b6c74
008b6cb0	ldrb w8,[x19, #0x5]
008b6cb4	mov w9,#0xffffffff
008b6cb8	mov w25,#0xd
008b6cbc	lsl w8,w9,w8
008b6cc0	mvn w8,w8
008b6cc4	ubfiz x24,x8,#0x5,#0x20
008b6cc8	b 0x008b6cd8
008b6ccc	sub x24,x24,#0x20
008b6cd0	cmn x24,#0x20
008b6cd4	b.eq 0x008b6d60
008b6cd8	ldr x8,[x19, #0x28]
008b6cdc	add x26,x8,x24
008b6ce0	ldr w9,[x26, #0xc]
008b6ce4	cbz w9,0x008b6d44
008b6ce8	tbnz w23,#0x0,0x008b6d18
008b6cec	add x8,x8,x24
008b6cf0	ldr w9,[x8, #0x1c]
008b6cf4	and w9,w9,#0xf
008b6cf8	cmp w9,#0x5
008b6cfc	b.cc 0x008b6d18
008b6d00	ldr x1,[x8, #0x10]
008b6d04	ldrb w8,[x1, #0x2]
008b6d08	tst w8,#0x3
008b6d0c	b.eq 0x008b6d18
008b6d10	mov x0,x20
008b6d14	bl 0x008b61bc
008b6d18	tbnz w21,#0x0,0x008b6ccc
008b6d1c	ldr w8,[x26, #0xc]
008b6d20	cmp w8,#0x5
008b6d24	b.lt 0x008b6ccc
008b6d28	ldr x1,[x26]
008b6d2c	ldrb w8,[x1, #0x2]
008b6d30	tst w8,#0x3
008b6d34	b.eq 0x008b6ccc
008b6d38	mov x0,x20
008b6d3c	bl 0x008b61bc
008b6d40	b 0x008b6ccc
008b6d44	ldr w8,[x26, #0x1c]
008b6d48	and w9,w8,#0xf
008b6d4c	cmp w9,#0x5
008b6d50	b.cc 0x008b6ccc
008b6d54	bfxil w8,w25,#0x0,#0x4
008b6d58	str w8,[x26, #0x1c]
008b6d5c	b 0x008b6ccc
008b6d60	orr w8,w23,w21
008b6d64	cmp w8,#0x1
008b6d68	b.ne 0x008b6d78
008b6d6c	ldrb w8,[x19, #0x2]
008b6d70	and w8,w8,#0xfffffffb
008b6d74	strb w8,[x19, #0x2]
008b6d78	ldrsw x8,[x19, #0x8]
008b6d7c	adrp x10,0xcb4000
008b6d80	ldr x9,[x19, #0x28]
008b6d84	ldr x10,[x10, #0xbe0]
008b6d88	lsl x8,x8,#0x4
008b6d8c	cmp x9,x10
008b6d90	add x8,x8,#0x30
008b6d94	b.eq 0x008b6db0
008b6d98	ldrb w9,[x19, #0x5]
008b6d9c	mov w10,#0x1
008b6da0	lsl w9,w10,w9
008b6da4	sbfiz x9,x9,#0x5,#0x20
008b6da8	add x0,x8,x9
008b6dac	b 0x008b6db4
008b6db0	add x0,x8,xzr
008b6db4	ldr x8,[x22, #0x28]
008b6db8	ldr x9,[sp, #0x8]
008b6dbc	cmp x8,x9
008b6dc0	b.ne 0x008b6de0
008b6dc4	ldp x20,x19,[sp, #0x50]
008b6dc8	ldp x22,x21,[sp, #0x40]
008b6dcc	ldp x24,x23,[sp, #0x30]
008b6dd0	ldp x26,x25,[sp, #0x20]
008b6dd4	ldp x29,x30,[sp, #0x10]
008b6dd8	add sp,sp,#0x60
008b6ddc	ret
008b6de0	bl 0x00c2fec0
