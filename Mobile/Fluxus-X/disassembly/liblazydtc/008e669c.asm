; std::__ndk1::__murmur2_or_cityhash<unsigned_long,64ul>::operator() @ 008e669c
008e669c	cmp x2,#0x20
008e66a0	b.hi 0x008e66b8
008e66a4	cmp x2,#0x10
008e66a8	b.hi 0x008e6788
008e66ac	mov x0,x1
008e66b0	mov x1,x2
008e66b4	b 0x00c30d40
008e66b8	cmp x2,#0x40
008e66bc	b.hi 0x008e6844
008e66c0	add x10,x1,x2
008e66c4	ldp x14,x16,[x10, #-0x10]
008e66c8	mov x11,#0x3127
008e66cc	ldp x12,x13,[x1]
008e66d0	movk x11,#0x97cb, LSL #16
008e66d4	ldp x8,x9,[x1, #0x10]
008e66d8	movk x11,#0xc85c, LSL #32
008e66dc	ldur x15,[x10, #-0x20]
008e66e0	movk x11,#0xc3a5, LSL #48
008e66e4	add x17,x14,x2
008e66e8	ldur x10,[x10, #-0x18]
008e66ec	nop
008e66f0	madd x12,x17,x11,x12
008e66f4	add x13,x12,x13
008e66f8	add x15,x15,x8
008e66fc	ror x17,x12,#0x25
008e6700	add x8,x13,x8
008e6704	ror x13,x13,#0x7
008e6708	add x12,x12,x9
008e670c	add x13,x13,x17
008e6710	add x16,x16,x9
008e6714	ror x12,x12,#0x34
008e6718	add x12,x13,x12
008e671c	add x13,x16,x15
008e6720	add x10,x10,x15
008e6724	ror x15,x15,#0x25
008e6728	add x9,x8,x9
008e672c	mov x17,#0x404f
008e6730	add x14,x10,x14
008e6734	ror x10,x10,#0x7
008e6738	ror x8,x8,#0x1f
008e673c	add x9,x9,x15
008e6740	movk x17,#0x2f90, LSL #16
008e6744	ror x13,x13,#0x34
008e6748	add x16,x14,x16
008e674c	add x8,x12,x8
008e6750	add x9,x9,x10
008e6754	movk x17,#0x6a3b, LSL #32
008e6758	ror x14,x14,#0x1f
008e675c	add x9,x9,x13
008e6760	add x10,x16,x8
008e6764	movk x17,#0x9ae1, LSL #48
008e6768	add x9,x9,x14
008e676c	mul x10,x10,x11
008e6770	madd x9,x9,x17,x10
008e6774	eor x9,x9,x9, LSR #0x2f
008e6778	madd x8,x9,x11,x8
008e677c	eor x8,x8,x8, LSR #0x2f
008e6780	mul x0,x8,x17
008e6784	ret
008e6788	mov x8,#0xf273
008e678c	ldp x9,x10,[x1]
008e6790	movk x8,#0xbe98, LSL #16
008e6794	movk x8,#0xb66f, LSL #32
008e6798	movk x8,#0xb492, LSL #48
008e679c	add x11,x1,x2
008e67a0	mul x8,x9,x8
008e67a4	mov x9,#0x6557
008e67a8	mov x12,#0x404f
008e67ac	ldur x15,[x11, #-0x10]
008e67b0	ldur x11,[x11, #-0x8]
008e67b4	movk x9,#0x509e, LSL #16
008e67b8	movk x12,#0x2f90, LSL #16
008e67bc	mov x13,#0x3127
008e67c0	movk x9,#0xd7c7, LSL #32
008e67c4	movk x12,#0x6a3b, LSL #32
008e67c8	movk x13,#0x97cb, LSL #16
008e67cc	mov x14,#0x13c00000000
008e67d0	movk x9,#0xc949, LSL #48
008e67d4	movk x12,#0x9ae1, LSL #48
008e67d8	movk x13,#0xc85c, LSL #32
008e67dc	movk x14,#0xbe41, LSL #48
008e67e0	eor x9,x10,x9
008e67e4	sub x10,x8,x10
008e67e8	movk x13,#0xc3a5, LSL #48
008e67ec	mul x12,x11,x12
008e67f0	mul x11,x11,x14
008e67f4	add x8,x8,x2
008e67f8	ror x10,x10,#0x2b
008e67fc	ror x9,x9,#0x14
008e6800	bfxil x11,x12,#0x1e,#0x22
008e6804	sub x8,x8,x12
008e6808	madd x10,x15,x13,x10
008e680c	add x8,x8,x9
008e6810	add x9,x10,x11
008e6814	mov x10,#0x2d69
008e6818	movk x10,#0xeb38, LSL #16
008e681c	movk x10,#0xea08, LSL #32
008e6820	eor x9,x9,x8
008e6824	movk x10,#0x9ddf, LSL #48
008e6828	mul x9,x9,x10
008e682c	eor x8,x9,x8
008e6830	eor x8,x8,x9, LSR #0x2f
008e6834	mul x8,x8,x10
008e6838	eor x8,x8,x8, LSR #0x2f
008e683c	mul x0,x8,x10
008e6840	ret
008e6844	add x10,x1,x2
008e6848	ldp x12,x13,[x10, #-0x30]
008e684c	ldp x14,x17,[x10, #-0x40]
008e6850	ldp x15,x16,[x10, #-0x20]
008e6854	mov x8,#0x2d69
008e6858	movk x8,#0xeb38, LSL #16
008e685c	movk x8,#0xea08, LSL #32
008e6860	sub x11,x2,#0x1
008e6864	add x18,x12,x2
008e6868	add x14,x14,x2
008e686c	ldur x2,[x10, #-0x10]
008e6870	movk x8,#0x9ddf, LSL #48
008e6874	eor x18,x16,x18
008e6878	mov x9,#0xf273
008e687c	add x0,x14,x17
008e6880	mul x18,x18,x8
008e6884	movk x9,#0xbe98, LSL #16
008e6888	add x0,x0,x12
008e688c	eor x12,x18,x16
008e6890	movk x9,#0xb66f, LSL #32
008e6894	eor x18,x12,x18, LSR #0x2f
008e6898	ldur x10,[x10, #-0x8]
008e689c	add x12,x17,x2
008e68a0	movk x9,#0xb492, LSL #48
008e68a4	add x15,x12,x15
008e68a8	add x15,x15,x9
008e68ac	add x16,x15,x16
008e68b0	add x17,x15,x13
008e68b4	add x16,x16,x2
008e68b8	add x2,x17,x10
008e68bc	ldr x17,[x1], #0x20
008e68c0	add x10,x16,x10
008e68c4	ror x16,x16,#0x2c
008e68c8	add x15,x16,x15
008e68cc	and x4,x11,#-0x40
008e68d0	ror x11,x2,#0x15
008e68d4	add x11,x15,x11
008e68d8	ror x15,x0,#0x2c
008e68dc	add x15,x15,x14
008e68e0	add x2,x13,x14
008e68e4	add x14,x0,x13
008e68e8	madd x16,x13,x9,x17
008e68ec	mul x13,x18,x8
008e68f0	eor x13,x13,x13, LSR #0x2f
008e68f4	mul x18,x13,x8
008e68f8	add x13,x2,x18
008e68fc	mov w3,#0x40
008e6900	ror x13,x13,#0x15
008e6904	add x15,x15,x13
008e6908	sub x13,x3,x4
008e690c	b 0x008e691c
008e6910	ldr x17,[x1, #0x20]
008e6914	add x13,x13,#0x40
008e6918	add x1,x1,#0x40
008e691c	add x16,x16,x14
008e6920	add x18,x18,x10
008e6924	add x0,x12,x15
008e6928	ldp x2,x3,[x1]
008e692c	nop
008e6930	madd x15,x15,x9,x17
008e6934	add x17,x16,x12
008e6938	ror x12,x18,#0x21
008e693c	ldp x18,x5,[x1, #0x10]
008e6940	mul x16,x12,x9
008e6944	add x12,x16,x11
008e6948	add x2,x12,x2
008e694c	add x12,x0,x18
008e6950	add x14,x3,x14
008e6954	ror x12,x12,#0x2a
008e6958	ldur x4,[x1, #-0x8]
008e695c	add x0,x2,x3
008e6960	madd x12,x12,x9,x14
008e6964	ldp x14,x3,[x1, #-0x18]
008e6968	add x10,x15,x10
008e696c	add x6,x10,x4
008e6970	add x0,x0,x18
008e6974	add x17,x17,x14
008e6978	add x10,x15,x14
008e697c	ror x14,x17,#0x25
008e6980	add x10,x10,x3
008e6984	mul x17,x14,x9
008e6988	add x14,x10,x4
008e698c	ror x10,x10,#0x2c
008e6990	eor x18,x17,x11
008e6994	add x11,x10,x15
008e6998	add x15,x12,x3
008e699c	ror x17,x0,#0x2c
008e69a0	add x10,x0,x5
008e69a4	add x0,x6,x18
008e69a8	add x15,x15,x2
008e69ac	ror x0,x0,#0x15
008e69b0	add x3,x15,x5
008e69b4	add x15,x11,x0
008e69b8	ror x11,x3,#0x15
008e69bc	add x17,x17,x2
008e69c0	add x11,x17,x11
008e69c4	cbnz x13,0x008e6910
008e69c8	eor x13,x10,x14
008e69cc	eor x12,x12,x12, LSR #0x2f
008e69d0	eor x14,x11,x15
008e69d4	mul x13,x13,x8
008e69d8	madd x9,x12,x9,x18
008e69dc	mul x12,x14,x8
008e69e0	eor x10,x13,x10
008e69e4	eor x11,x12,x11
008e69e8	eor x10,x10,x13, LSR #0x2f
008e69ec	eor x11,x11,x12, LSR #0x2f
008e69f0	mul x10,x10,x8
008e69f4	mul x11,x11,x8
008e69f8	eor x10,x10,x10, LSR #0x2f
008e69fc	eor x11,x11,x11, LSR #0x2f
008e6a00	madd x9,x10,x8,x9
008e6a04	madd x10,x11,x8,x16
008e6a08	eor x9,x10,x9
008e6a0c	mul x9,x9,x8
008e6a10	eor x10,x9,x10
008e6a14	eor x9,x10,x9, LSR #0x2f
008e6a18	mul x9,x9,x8
008e6a1c	eor x9,x9,x9, LSR #0x2f
008e6a20	mul x0,x9,x8
008e6a24	ret
