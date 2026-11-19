; FUN_0095c6e4 @ 0095c6e4
0095c6e4	stp x28,x27,[sp, #-0x60]!
0095c6e8	stp x26,x25,[sp, #0x10]
0095c6ec	stp x24,x23,[sp, #0x20]
0095c6f0	stp x22,x21,[sp, #0x30]
0095c6f4	stp x20,x19,[sp, #0x40]
0095c6f8	stp x29,x30,[sp, #0x50]
0095c6fc	add x29,sp,#0x50
0095c700	sub sp,sp,#0x1, LSL #12
0095c704	sub sp,sp,#0x80
0095c708	mrs x23,tpidr_el0
0095c70c	ldr x8,[x23, #0x28]
0095c710	mov w21,#0x1
0095c714	mov x19,x0
0095c718	str x8,[sp, #0x48]
0095c71c	ldr x24,[x0, #0x20]
0095c720	adrp x8,0xcb4000
0095c724	mov w0,#0x1
0095c728	ldr w28,[x24, #0x220]
0095c72c	strb w21,[x1]
0095c730	ldr x8,[x8, #0xdd0]
0095c734	mov w1,#0x1ee8
0095c738	ldr x8,[x8]
0095c73c	blr x8
0095c740	mov x20,x0
0095c744	cbz x0,0x0095c7b4
0095c748	mov w8,#0x1cb8
0095c74c	add x0,x20,x8
0095c750	orr w1,wzr,#0xffff
0095c754	bl 0x00904528
0095c758	mov w8,#0x1cd8
0095c75c	movi v0.2S,#0x1
0095c760	add x8,x20,x8
0095c764	str x20,[x19, #0x1a0]
0095c768	str wzr,[x20, #0x1cac]
0095c76c	str w21,[x20, #0x814]
0095c770	str w21,[x20, #0x1414]
0095c774	str w21,[x20, #0x808]
0095c778	str d0,[x20, #0x1408]
0095c77c	str x8,[x20, #0x1ed8]
0095c780	str w21,[x20, #0x1884]
0095c784	ldr x8,[x19, #0x12f0]
0095c788	ldr x20,[x19, #0x1a0]
0095c78c	cbz x8,0x0095c7ec
0095c790	ldr x8,[x19, #0x20]
0095c794	ldr x3,[x8, #0x1c8]
0095c798	mov x8,x3
0095c79c	ldrsb w9,[x8]
0095c7a0	cbz w9,0x0095c7bc
0095c7a4	add x8,x8,#0x1
0095c7a8	tbz w9,#0x1f,0x0095c79c
0095c7ac	mov w27,#0x2b
0095c7b0	b 0x0095df54
0095c7b4	mov w27,#0x1b
0095c7b8	b 0x0095df54
0095c7bc	adrp x2,0x2b5000
0095c7c0	add x2,x2,#0x5c6
0095c7c4	add x0,sp,#0x60
0095c7c8	mov w1,#0x100
0095c7cc	bl 0x00c31b70
0095c7d0	ldr x0,[x20, #0x1cb0]
0095c7d4	add x1,sp,#0x60
0095c7d8	bl 0x00c31840
0095c7dc	cbz x0,0x0095ca90
0095c7e0	mov w8,#0x1
0095c7e4	str x0,[x20, #0x1cb0]
0095c7e8	str w8,[x20, #0x8a4]
0095c7ec	str x20,[sp, #0x40]
0095c7f0	ldr x20,[x19, #0x508]
0095c7f4	cbz x20,0x0095ca4c
0095c7f8	ldr x10,[sp, #0x40]
0095c7fc	str x23,[sp, #0x38]
0095c800	mov w8,#0x1c08
0095c804	mov w9,#0x1c28
0095c808	adrp x23,0x748000
0095c80c	mov w22,#0x1
0095c810	add x23,x23,#0xdd4
0095c814	add x25,x10,x8
0095c818	add x26,x10,x9
0095c81c	ldr x21,[x20]
0095c820	mov w1,#0x3d
0095c824	mov x0,x21
0095c828	bl 0x00c30890
0095c82c	cbz x0,0x0095caa4
0095c830	add x27,x0,#0x1
0095c834	mov w8,#0x1
0095c838	ldrsb w9,[x0, x8]
0095c83c	cbz w9,0x0095c85c
0095c840	add x8,x8,#0x1
0095c844	tbz w9,#0x1f,0x0095c838
0095c848	mov w27,wzr
0095c84c	cbnz w27,0x0095ca44
0095c850	ldr x20,[x20, #0x8]
0095c854	cbnz x20,0x0095c81c
0095c858	b 0x0095ca44
0095c85c	sub x8,x0,x21
0095c860	sub x8,x8,#0x2
0095c864	cmp x8,#0x6
0095c868	b.hi 0x0095cac4
0095c86c	ldrsw x8,[x23, x8, LSL #0x2]
0095c870	add x8,x8,x23
0095c874	br x8
0095c878	adrp x1,0x2a7000
0095c87c	mov w2,#0x2
0095c880	mov x0,x21
0095c884	add x1,x1,#0x59e
0095c888	bl 0x00c31b50
0095c88c	cbz w0,0x0095cad8
0095c890	add x1,sp,#0x60
0095c894	mov w2,#0xa
0095c898	mov x0,x27
0095c89c	bl 0x00c300c0
0095c8a0	sub x8,x0,#0x1
0095c8a4	orr w9,wzr,#0xfffe
0095c8a8	mov x21,x0
0095c8ac	cmp x8,x9
0095c8b0	b.hi 0x0095ca28
0095c8b4	ldr x27,[sp, #0x60]
0095c8b8	ldrb w0,[x27]
0095c8bc	bl 0x009416e0
0095c8c0	and w8,w0,#0xff
0095c8c4	cmp w8,#0x78
0095c8c8	b.ne 0x0095ca28
0095c8cc	add x0,x27,#0x1
0095c8d0	mov w2,#0xa
0095c8d4	mov x1,xzr
0095c8d8	str x0,[sp, #0x60]
0095c8dc	bl 0x00c300c0
0095c8e0	sub x8,x0,#0x1
0095c8e4	orr w9,wzr,#0xfffe
0095c8e8	cmp x8,x9
0095c8ec	b.hi 0x0095ca20
0095c8f0	ldr x8,[sp, #0x40]
0095c8f4	mov w27,wzr
0095c8f8	strh w21,[x8, #0x1ca8]
0095c8fc	strh w0,[x8, #0x1caa]
0095c900	str w22,[x8, #0x884]
0095c904	cbz w27,0x0095c850
0095c908	b 0x0095ca44
0095c90c	adrp x1,0x2bb000
0095c910	mov w2,#0x5
0095c914	mov x0,x21
0095c918	add x1,x1,#0x306
0095c91c	bl 0x00c31b50
0095c920	cbz w0,0x0095cad8
0095c924	mov x0,x27
0095c928	bl 0x00c2ff50
0095c92c	cmp x0,#0x1f
0095c930	b.hi 0x0095cad8
0095c934	mov x0,x25
0095c938	mov x1,x27
0095c93c	bl 0x00c31b90
0095c940	ldr x8,[sp, #0x40]
0095c944	mov w27,wzr
0095c948	str w22,[x8, #0x868]
0095c94c	cbz w27,0x0095c850
0095c950	b 0x0095ca44
0095c954	adrp x1,0x2b5000
0095c958	orr w2,wzr,#0x6
0095c95c	mov x0,x21
0095c960	add x1,x1,#0x5ce
0095c964	bl 0x00c31b50
0095c968	cbz w0,0x0095cad8
0095c96c	mov x0,x27
0095c970	bl 0x00c308a0
0095c974	cmp w0,#0x1
0095c978	mov w27,wzr
0095c97c	b.eq 0x0095c84c
0095c980	ldr x8,[sp, #0x40]
0095c984	mov w27,wzr
0095c988	str wzr,[x8, #0x808]
0095c98c	str wzr,[x8, #0x1408]
0095c990	cbz w27,0x0095c850
0095c994	b 0x0095ca44
0095c998	adrp x1,0x2d1000
0095c99c	orr w2,wzr,#0x7
0095c9a0	mov x0,x21
0095c9a4	add x1,x1,#0x1c3
0095c9a8	bl 0x00c31b50
0095c9ac	cbz w0,0x0095cad8
0095c9b0	ldr x21,[sp, #0x40]
0095c9b4	mov x1,x27
0095c9b8	ldr x0,[x21, #0x1cb0]
0095c9bc	bl 0x00c31840
0095c9c0	cbz x0,0x0095df8c
0095c9c4	mov w27,wzr
0095c9c8	str x0,[x21, #0x1cb0]
0095c9cc	str w22,[x21, #0x8a4]
0095c9d0	cbz w27,0x0095c850
0095c9d4	b 0x0095ca44
0095c9d8	adrp x1,0x2a1000
0095c9dc	mov w2,#0x8
0095c9e0	mov x0,x21
0095c9e4	add x1,x1,#0xa1e
0095c9e8	bl 0x00c31b50
0095c9ec	cbz w0,0x0095cad8
0095c9f0	mov x0,x27
0095c9f4	bl 0x00c2ff50
0095c9f8	cmp x0,#0x7f
0095c9fc	b.hi 0x0095cad8
0095ca00	mov x0,x26
0095ca04	mov x1,x27
0095ca08	bl 0x00c31b90
0095ca0c	ldr x8,[sp, #0x40]
0095ca10	mov w27,wzr
0095ca14	str w22,[x8, #0x894]
0095ca18	cbz w27,0x0095c850
0095ca1c	b 0x0095ca44
0095ca20	mov w27,wzr
0095ca24	cbnz x0,0x0095c84c
0095ca28	ldr x2,[x20]
0095ca2c	adrp x1,0x2c1000
0095ca30	mov x0,x19
0095ca34	add x1,x1,#0x2aa
0095ca38	bl 0x00904b80
0095ca3c	mov w27,#0x31
0095ca40	cbz w27,0x0095c850
0095ca44	ldr x23,[sp, #0x38]
0095ca48	cbnz w27,0x0095cae0
0095ca4c	mov w22,#0x1
0095ca50	stur w28,[x29, #-0x70]
0095ca54	sturh w22,[x29, #-0x6c]
0095ca58	ldrb w8,[x19, #0xa82]
0095ca5c	tbnz w8,#0x1,0x0095ca7c
0095ca60	ldr x0,[x19, #0x1168]
0095ca64	bl 0x00c31d60
0095ca68	stur w0,[x29, #-0x68]
0095ca6c	sturh w22,[x29, #-0x64]
0095ca70	tbnz w0,#0x1f,0x0095caf4
0095ca74	mov w27,wzr
0095ca78	b 0x0095cb0c
0095ca7c	mov w27,wzr
0095ca80	mov w20,#0x1
0095ca84	mov w21,#0x64
0095ca88	mov w22,#0x1
0095ca8c	b 0x0095cb14
0095ca90	ldr x0,[x20, #0x1cb0]
0095ca94	bl 0x00c31040
0095ca98	str xzr,[x20, #0x1cb0]
0095ca9c	mov w27,#0x1b
0095caa0	b 0x0095df54
0095caa4	adrp x1,0x2c1000
0095caa8	add x1,x1,#0x2aa
0095caac	mov x0,x19
0095cab0	mov x2,x21
0095cab4	bl 0x00904b80
0095cab8	ldr x23,[sp, #0x38]
0095cabc	mov w27,#0x31
0095cac0	b 0x0095cae0
0095cac4	adrp x1,0x2cf000
0095cac8	add x1,x1,#0x31c
0095cacc	mov x0,x19
0095cad0	mov x2,x21
0095cad4	bl 0x00904b80
0095cad8	ldr x23,[sp, #0x38]
0095cadc	orr w27,wzr,#0x30
0095cae0	ldr x19,[sp, #0x40]
0095cae4	ldr x0,[x19, #0x1cb0]
0095cae8	bl 0x00c31040
0095caec	str xzr,[x19, #0x1cb0]
0095caf0	b 0x0095df54
0095caf4	adrp x1,0x2a9000
0095caf8	add x1,x1,#0x8d7
0095cafc	mov x0,x19
0095cb00	bl 0x00904b80
0095cb04	mov w22,wzr
0095cb08	orr w27,wzr,#0x38
0095cb0c	mov w20,#0x2
0095cb10	mov w21,#0x3e8
0095cb14	add x8,x19,#0xa82
0095cb18	str x8,[sp, #0x38]
0095cb1c	mov w8,#0x12a0
0095cb20	mov x28,xzr
0095cb24	mov x25,xzr
0095cb28	sub x26,x29,#0x70
0095cb2c	add x8,x19,x8
0095cb30	str x8,[sp, #0x30]
0095cb34	tbz w22,#0x0,0x0095df4c
0095cb38	sub x0,x29,#0x70
0095cb3c	mov w1,w20
0095cb40	mov x2,x21
0095cb44	bl 0x0093475c
0095cb48	cbz w0,0x0095cb84
0095cb4c	cmn w0,#0x1
0095cb50	b.eq 0x0095df4c
0095cb54	ldrb w8,[x26, #0x6]
0095cb58	tbz w8,#0x0,0x0095cb8c
0095cb5c	add x1,sp,#0x60
0095cb60	mov w2,#0x1000
0095cb64	add x3,sp,#0x50
0095cb68	mov x0,x19
0095cb6c	bl 0x0094358c
0095cb70	mov w27,w0
0095cb74	cbz w0,0x0095cc58
0095cb78	cmp w27,#0x51
0095cb7c	b.eq 0x0095cc48
0095cb80	b 0x0095cc7c
0095cb84	sturh wzr,[x29, #-0x6a]
0095cb88	sturh wzr,[x29, #-0x62]
0095cb8c	cmp w20,#0x2
0095cb90	str xzr,[sp, #0x50]
0095cb94	b.ne 0x0095cbd8
0095cb98	ldrb w8,[x26, #0xe]
0095cb9c	mov x2,xzr
0095cba0	tbz w8,#0x0,0x0095cbc4
0095cba4	ldur w0,[x29, #-0x68]
0095cba8	add x1,sp,#0x60
0095cbac	mov w2,#0x1000
0095cbb0	bl 0x00c31ef0
0095cbb4	mov x2,x0
0095cbb8	str x0,[sp, #0x50]
0095cbbc	cmp x2,#0x1
0095cbc0	b.ge 0x0095cc20
0095cbc4	cmp x2,#0x0
0095cbc8	cset w22,eq
0095cbcc	ldr w8,[x19, #0x2e0]
0095cbd0	cbnz w8,0x0095cc88
0095cbd4	b 0x0095ccbc
0095cbd8	ldr x8,[x19, #0x1160]
0095cbdc	ldr x3,[x19, #0x1168]
0095cbe0	add x0,sp,#0x60
0095cbe4	mov w1,#0x1
0095cbe8	mov w2,#0x1000
0095cbec	blr x8
0095cbf0	lsl x8,x0,#0x20
0095cbf4	orr x9,xzr,#0x1000000000000000
0095cbf8	sxtw x2,w0
0095cbfc	cmp x8,x9
0095cc00	str x2,[sp, #0x50]
0095cc04	b.eq 0x0095cc7c
0095cc08	mov x9,#0x100000000
0095cc0c	movk x9,#0x1000, LSL #48
0095cc10	cmp x8,x9
0095cc14	b.eq 0x0095cc48
0095cc18	cmp x2,#0x1
0095cc1c	b.lt 0x0095cbc4
0095cc20	add x1,sp,#0x60
0095cc24	mov x0,x19
0095cc28	bl 0x0095dfd8
0095cc2c	mov w27,w0
0095cc30	cbnz w0,0x0095cc7c
0095cc34	ldr x8,[sp, #0x50]
0095cc38	mov x0,x19
0095cc3c	add x28,x8,x28
0095cc40	mov x1,x28
0095cc44	bl 0x00931fec
0095cc48	mov w22,#0x1
0095cc4c	ldr w8,[x19, #0x2e0]
0095cc50	cbnz w8,0x0095cc88
0095cc54	b 0x0095ccbc
0095cc58	ldr x8,[sp, #0x50]
0095cc5c	cmp x8,#0x1
0095cc60	b.lt 0x0095cccc
0095cc64	add x25,x8,x25
0095cc68	mov x0,x19
0095cc6c	mov x1,x25
0095cc70	bl 0x00931fe0
0095cc74	mov w27,w0
0095cc78	cbz w0,0x0095cce0
0095cc7c	mov w22,wzr
0095cc80	ldr w8,[x19, #0x2e0]
0095cc84	cbz w8,0x0095ccbc
0095cc88	bl 0x00941cb8
0095cc8c	ldr x2,[x24, #0x200]
0095cc90	ldr x3,[x24, #0x208]
0095cc94	bl 0x00941d54
0095cc98	ldr w8,[x19, #0x2e0]
0095cc9c	cmp x0,x8
0095cca0	b.lt 0x0095ccbc
0095cca4	adrp x1,0x2ab000
0095cca8	mov x0,x19
0095ccac	add x1,x1,#0x814
0095ccb0	bl 0x00904b80
0095ccb4	mov w22,wzr
0095ccb8	orr w27,wzr,#0x1c
0095ccbc	mov x0,x19
0095ccc0	bl 0x009314dc
0095ccc4	cbz w0,0x0095cb34
0095ccc8	b 0x0095df48
0095cccc	mov w22,wzr
0095ccd0	mov w27,wzr
0095ccd4	ldr w8,[x19, #0x2e0]
0095ccd8	cbnz w8,0x0095cc88
0095ccdc	b 0x0095ccbc
0095cce0	str x25,[sp, #0x10]
0095cce4	ldr x25,[sp, #0x50]
0095cce8	cbz x25,0x0095dcd8
0095ccec	str x28,[sp, #0x8]
0095ccf0	ldr x28,[x19, #0x1a0]
0095ccf4	mov w8,#0x1cd8
0095ccf8	mov x26,xzr
0095ccfc	add x8,x28,x8
0095cd00	str x8,[sp, #0x20]
0095cd04	mov w8,#0x1ed8
0095cd08	add x22,x28,x8
0095cd0c	mov w8,#0xffffffff
0095cd10	str w8,[sp, #0x2c]
0095cd14	str x22,[sp, #0x18]
0095cd18	b 0x0095cda4
0095cd1c	adrp x4,0x2c9000
0095cd20	add x4,x4,#0xec
0095cd24	ldr x8,[sp, #0x30]
0095cd28	ldr x8,[x8]
0095cd2c	cbz x8,0x0095cd3c
0095cd30	ldr w8,[x8, #0x8]
0095cd34	cmp w8,#0x1
0095cd38	b.lt 0x0095dc80
0095cd3c	adrp x1,0x2cb000
0095cd40	adrp x2,0x2cf000
0095cd44	adrp x3,0x2cf000
0095cd48	mov x0,x19
0095cd4c	add x1,x1,#0x183
0095cd50	add x2,x2,#0x34b
0095cd54	add x3,x3,#0x335
0095cd58	bl 0x00904c98
0095cd5c	b 0x0095dc80
0095cd60	adrp x4,0x2c9000
0095cd64	add x4,x4,#0xec
0095cd68	ldr x8,[sp, #0x30]
0095cd6c	ldr x8,[x8]
0095cd70	cbz x8,0x0095cd80
0095cd74	ldr w8,[x8, #0x8]
0095cd78	cmp w8,#0x1
0095cd7c	b.lt 0x0095dc70
0095cd80	adrp x1,0x2cb000
0095cd84	adrp x2,0x2cf000
0095cd88	adrp x3,0x2cf000
0095cd8c	mov x0,x19
0095cd90	add x1,x1,#0x183
0095cd94	add x2,x2,#0x34b
0095cd98	add x3,x3,#0x335
0095cd9c	bl 0x00904c98
0095cda0	b 0x0095dc70
0095cda4	ldr w8,[x28, #0x1cac]
0095cda8	cmp w8,#0x8
0095cdac	b.hi 0x0095dc84
0095cdb0	adrp x9,0x748000
0095cdb4	add x9,x9,#0xdf0
0095cdb8	ldrsw x8,[x9, x8, LSL #0x2]
0095cdbc	mov x10,x9
0095cdc0	add x9,sp,#0x60
0095cdc4	ldrb w27,[x9, x26]
0095cdc8	add x8,x8,x10
0095cdcc	br x8
0095cdd0	cmp w27,#0xd
0095cdd4	b.eq 0x0095cffc
0095cdd8	cmp w27,#0xff
0095cddc	b.ne 0x0095d918
0095cde0	mov w8,#0x1
0095cde4	str w8,[x28, #0x1cac]
0095cde8	ldr w9,[sp, #0x2c]
0095cdec	tbnz w9,#0x1f,0x0095cedc
0095cdf0	b 0x0095ceb8
0095cdf4	ldr x8,[sp, #0x38]
0095cdf8	ldrb w8,[x8, #0x3]
0095cdfc	tbz w8,#0x4,0x0095d184
0095ce00	cmp w27,#0x28
0095ce04	b.cs 0x0095d008
0095ce08	adrp x8,0xc51000
0095ce0c	add x8,x8,#0x188
0095ce10	ldr x4,[x8, x27, LSL #0x3]
0095ce14	b 0x0095d14c
0095ce18	ldr x8,[sp, #0x38]
0095ce1c	ldrb w8,[x8, #0x3]
0095ce20	tbz w8,#0x4,0x0095d31c
0095ce24	cmp w27,#0x28
0095ce28	b.cs 0x0095d050
0095ce2c	adrp x8,0xc51000
0095ce30	add x8,x8,#0x188
0095ce34	ldr x4,[x8, x27, LSL #0x3]
0095ce38	b 0x0095d2e4
0095ce3c	ldr x8,[sp, #0x38]
0095ce40	ldrb w8,[x8, #0x3]
0095ce44	tbz w8,#0x4,0x0095d448
0095ce48	cmp w27,#0x28
0095ce4c	b.cs 0x0095d098
0095ce50	adrp x8,0xc51000
0095ce54	add x8,x8,#0x188
0095ce58	ldr x4,[x8, x27, LSL #0x3]
0095ce5c	b 0x0095d410
0095ce60	cmp w27,#0xff
0095ce64	b.eq 0x0095cff0
0095ce68	ldr x8,[x28, #0x1ed8]
0095ce6c	cmp x8,x22
0095ce70	b.cs 0x0095dc84
0095ce74	add x9,x8,#0x1
0095ce78	str x9,[x28, #0x1ed8]
0095ce7c	strb w27,[x8]
0095ce80	b 0x0095dc84
0095ce84	ldr x8,[sp, #0x38]
0095ce88	ldrb w8,[x8, #0x3]
0095ce8c	tbz w8,#0x4,0x0095d58c
0095ce90	cmp w27,#0x28
0095ce94	b.cs 0x0095d0e0
0095ce98	adrp x8,0xc51000
0095ce9c	add x8,x8,#0x188
0095cea0	ldr x4,[x8, x27, LSL #0x3]
0095cea4	b 0x0095d554
0095cea8	str wzr,[x28, #0x1cac]
0095ceac	cbnz w27,0x0095d918
0095ceb0	ldr w9,[sp, #0x2c]
0095ceb4	tbnz w9,#0x1f,0x0095cedc
0095ceb8	add x8,sp,#0x60
0095cebc	add x2,x8,w9, SXTW 
0095cec0	sub w8,w26,w9
0095cec4	sxtw x3,w8
0095cec8	mov w1,#0x1
0095cecc	mov x0,x19
0095ced0	bl 0x00934dd0
0095ced4	mov w27,w0
0095ced8	cbnz w0,0x0095df40
0095cedc	mov w8,#0xffffffff
0095cee0	str w8,[sp, #0x2c]
0095cee4	b 0x0095dc84
0095cee8	cmp w27,#0xf0
0095ceec	b.ne 0x0095cf48
0095cef0	ldr x8,[x28, #0x1ed8]
0095cef4	cmp x8,x22
0095cef8	b.cs 0x0095cf10
0095cefc	add x9,x8,#0x1
0095cf00	str x9,[x28, #0x1ed8]
0095cf04	orr w9,wzr,#0xff
0095cf08	strb w9,[x8]
0095cf0c	ldr x8,[x28, #0x1ed8]
0095cf10	cmp x8,x22
0095cf14	b.cs 0x0095cf2c
0095cf18	add x9,x8,#0x1
0095cf1c	str x9,[x28, #0x1ed8]
0095cf20	orr w9,wzr,#0xf0
0095cf24	strb w9,[x8]
0095cf28	ldr x8,[x28, #0x1ed8]
0095cf2c	sub x8,x8,#0x2
0095cf30	str x8,[x28, #0x1ee0]
0095cf34	ldr x8,[sp, #0x20]
0095cf38	mov x0,x19
0095cf3c	str x8,[x28, #0x1ed8]
0095cf40	bl 0x0095e178
0095cf44	b 0x0095dc80
0095cf48	ldr x8,[x28, #0x1ed8]
0095cf4c	cmp w27,#0xff
0095cf50	b.eq 0x0095d128
0095cf54	cmp x8,x22
0095cf58	b.cs 0x0095cf70
0095cf5c	add x9,x8,#0x1
0095cf60	str x9,[x28, #0x1ed8]
0095cf64	orr w9,wzr,#0xff
0095cf68	strb w9,[x8]
0095cf6c	ldr x8,[x28, #0x1ed8]
0095cf70	cmp x8,x22
0095cf74	b.cs 0x0095cf88
0095cf78	add x9,x8,#0x1
0095cf7c	str x9,[x28, #0x1ed8]
0095cf80	strb w27,[x8]
0095cf84	ldr x8,[x28, #0x1ed8]
0095cf88	sub x8,x8,#0x2
0095cf8c	str x8,[x28, #0x1ee0]
0095cf90	ldr x8,[sp, #0x20]
0095cf94	str x8,[x28, #0x1ed8]
0095cf98	ldr x8,[sp, #0x38]
0095cf9c	ldrb w8,[x8, #0x3]
0095cfa0	tbz w8,#0x4,0x0095d844
0095cfa4	ldr x8,[sp, #0x30]
0095cfa8	ldr x9,[x8]
0095cfac	sub w8,w27,#0xec
0095cfb0	cmp w8,#0x13
0095cfb4	b.hi 0x0095d818
0095cfb8	cbz x9,0x0095cfc8
0095cfbc	ldr w9,[x9, #0x8]
0095cfc0	cmp w9,#0x1
0095cfc4	b.lt 0x0095d844
0095cfc8	adrp x9,0xc51000
0095cfcc	add x9,x9,#0xe8
0095cfd0	ldr x3,[x9, w8, SXTW #0x3]
0095cfd4	adrp x1,0x2b1000
0095cfd8	adrp x2,0x2bd000
0095cfdc	mov x0,x19
0095cfe0	add x1,x1,#0x848
0095cfe4	add x2,x2,#0x226
0095cfe8	bl 0x00904c98
0095cfec	b 0x0095d844
0095cff0	mov w8,#0x8
0095cff4	str w8,[x28, #0x1cac]
0095cff8	b 0x0095dc84
0095cffc	orr w8,wzr,#0x6
0095d000	str w8,[x28, #0x1cac]
0095d004	b 0x0095d918
0095d008	cmp w27,#0xff
0095d00c	b.eq 0x0095d144
0095d010	ldr x8,[sp, #0x30]
0095d014	ldr x8,[x8]
0095d018	cbz x8,0x0095d028
0095d01c	ldr w8,[x8, #0x8]
0095d020	cmp w8,#0x1
0095d024	b.lt 0x0095d184
0095d028	adrp x1,0x2d3000
0095d02c	adrp x2,0x2ad000
0095d030	adrp x3,0x2c9000
0095d034	mov x0,x19
0095d038	add x1,x1,#0x278
0095d03c	add x2,x2,#0x459
0095d040	add x3,x3,#0xe9
0095d044	mov w4,w27
0095d048	bl 0x00904c98
0095d04c	b 0x0095d184
0095d050	cmp w27,#0xff
0095d054	b.eq 0x0095d2dc
0095d058	ldr x8,[sp, #0x30]
0095d05c	ldr x8,[x8]
0095d060	cbz x8,0x0095d070
0095d064	ldr w8,[x8, #0x8]
0095d068	cmp w8,#0x1
0095d06c	b.lt 0x0095d31c
0095d070	adrp x1,0x2d3000
0095d074	adrp x2,0x2ad000
0095d078	adrp x3,0x2cf000
0095d07c	mov x0,x19
0095d080	add x1,x1,#0x278
0095d084	add x2,x2,#0x459
0095d088	add x3,x3,#0x335
0095d08c	mov w4,w27
0095d090	bl 0x00904c98
0095d094	b 0x0095d31c
0095d098	cmp w27,#0xff
0095d09c	b.eq 0x0095d408
0095d0a0	ldr x8,[sp, #0x30]
0095d0a4	ldr x8,[x8]
0095d0a8	cbz x8,0x0095d0b8
0095d0ac	ldr w8,[x8, #0x8]
0095d0b0	cmp w8,#0x1
0095d0b4	b.lt 0x0095d448
0095d0b8	adrp x1,0x2d3000
0095d0bc	adrp x2,0x2ad000
0095d0c0	adrp x3,0x2c5000
0095d0c4	mov x0,x19
0095d0c8	add x1,x1,#0x278
0095d0cc	add x2,x2,#0x459
0095d0d0	add x3,x3,#0x276
0095d0d4	mov w4,w27
0095d0d8	bl 0x00904c98
0095d0dc	b 0x0095d448
0095d0e0	cmp w27,#0xff
0095d0e4	b.eq 0x0095d54c
0095d0e8	ldr x8,[sp, #0x30]
0095d0ec	ldr x8,[x8]
0095d0f0	cbz x8,0x0095d100
0095d0f4	ldr w8,[x8, #0x8]
0095d0f8	cmp w8,#0x1
0095d0fc	b.lt 0x0095d58c
0095d100	adrp x1,0x2d3000
0095d104	adrp x2,0x2ad000
0095d108	adrp x3,0x2c1000
0095d10c	mov x0,x19
0095d110	add x1,x1,#0x278
0095d114	add x2,x2,#0x459
0095d118	add x3,x3,#0x2cc
0095d11c	mov w4,w27
0095d120	bl 0x00904c98
0095d124	b 0x0095d58c
0095d128	cmp x8,x22
0095d12c	b.cs 0x0095d87c
0095d130	add x9,x8,#0x1
0095d134	str x9,[x28, #0x1ed8]
0095d138	orr w9,wzr,#0xff
0095d13c	strb w9,[x8]
0095d140	b 0x0095d87c
0095d144	adrp x4,0x2c9000
0095d148	add x4,x4,#0xec
0095d14c	ldr x8,[sp, #0x30]
0095d150	ldr x8,[x8]
0095d154	cbz x8,0x0095d164
0095d158	ldr w8,[x8, #0x8]
0095d15c	cmp w8,#0x1
0095d160	b.lt 0x0095d184
0095d164	adrp x1,0x2cb000
0095d168	adrp x2,0x2ad000
0095d16c	adrp x3,0x2c9000
0095d170	mov x0,x19
0095d174	add x1,x1,#0x183
0095d178	add x2,x2,#0x459
0095d17c	add x3,x3,#0xe9
0095d180	bl 0x00904c98
0095d184	mov w8,#0x1
0095d188	str w8,[x28]
0095d18c	ldr x22,[x19, #0x1a0]
0095d190	add x9,x22,x27, LSL #0x2
0095d194	mov x8,x9
0095d198	ldr w10,[x8, #0x8]!
0095d19c	cmp w10,#0x3
0095d1a0	b.eq 0x0095d22c
0095d1a4	cmp w10,#0x2
0095d1a8	b.eq 0x0095d244
0095d1ac	cbnz w10,0x0095dc7c
0095d1b0	add x9,x22,x27, LSL #0x2
0095d1b4	ldr w10,[x9, #0x808]
0095d1b8	cmp w10,#0x1
0095d1bc	b.ne 0x0095d264
0095d1c0	mov w9,#0x1
0095d1c4	str w9,[x8]
0095d1c8	ldr x8,[x19, #0x20]
0095d1cc	mov w9,#0xfbff
0095d1d0	strh w9,[sp, #0x5c]
0095d1d4	strb w27,[sp, #0x5e]
0095d1d8	ldr w0,[x8, #0x220]
0095d1dc	add x1,sp,#0x5c
0095d1e0	orr w2,wzr,#0x3
0095d1e4	mov w3,#0x4000
0095d1e8	bl 0x00c31c50
0095d1ec	tbz x0,#0x3f,0x0095d208
0095d1f0	bl 0x00c30710
0095d1f4	ldr w2,[x0]
0095d1f8	adrp x1,0x2b3000
0095d1fc	mov x0,x19
0095d200	add x1,x1,#0x920
0095d204	bl 0x00904b80
0095d208	ldr x8,[sp, #0x38]
0095d20c	ldrb w8,[x8, #0x3]
0095d210	tbz w8,#0x4,0x0095dc60
0095d214	cmp w27,#0x28
0095d218	b.cs 0x0095da7c
0095d21c	adrp x8,0xc51000
0095d220	add x8,x8,#0x188
0095d224	ldr x4,[x8, x27, LSL #0x3]
0095d228	b 0x0095dc28
0095d22c	ldr w10,[x9, #0x408]
0095d230	cmp w10,#0x1
0095d234	b.eq 0x0095d6c0
0095d238	cbnz w10,0x0095dc7c
0095d23c	str wzr,[x8]
0095d240	b 0x0095dc7c
0095d244	add x9,x22,x27, LSL #0x2
0095d248	ldr w10,[x9, #0x408]
0095d24c	cmp w10,#0x1
0095d250	b.eq 0x0095d6d4
0095d254	cbnz w10,0x0095dc7c
0095d258	mov w9,#0x1
0095d25c	str w9,[x8]
0095d260	b 0x0095dc60
0095d264	ldr w9,[x9, #0x1808]
0095d268	cmp w9,#0x1
0095d26c	b.ne 0x0095d92c
0095d270	mov w9,#0x1
0095d274	str w9,[x8]
0095d278	ldr x8,[x19, #0x20]
0095d27c	mov w9,#0xfbff
0095d280	strh w9,[sp, #0x5c]
0095d284	strb w27,[sp, #0x5e]
0095d288	ldr w0,[x8, #0x220]
0095d28c	add x1,sp,#0x5c
0095d290	orr w2,wzr,#0x3
0095d294	mov w3,#0x4000
0095d298	bl 0x00c31c50
0095d29c	tbz x0,#0x3f,0x0095d2b8
0095d2a0	bl 0x00c30710
0095d2a4	ldr w2,[x0]
0095d2a8	adrp x1,0x2b3000
0095d2ac	mov x0,x19
0095d2b0	add x1,x1,#0x920
0095d2b4	bl 0x00904b80
0095d2b8	ldr x8,[sp, #0x38]
0095d2bc	ldrb w8,[x8, #0x3]
0095d2c0	tbz w8,#0x4,0x0095dc70
0095d2c4	cmp w27,#0x28
0095d2c8	b.cs 0x0095db94
0095d2cc	adrp x8,0xc51000
0095d2d0	add x8,x8,#0x188
0095d2d4	ldr x4,[x8, x27, LSL #0x3]
0095d2d8	b 0x0095cd68
0095d2dc	adrp x4,0x2c9000
0095d2e0	add x4,x4,#0xec
0095d2e4	ldr x8,[sp, #0x30]
0095d2e8	ldr x8,[x8]
0095d2ec	cbz x8,0x0095d2fc
0095d2f0	ldr w8,[x8, #0x8]
0095d2f4	cmp w8,#0x1
0095d2f8	b.lt 0x0095d31c
0095d2fc	adrp x1,0x2cb000
0095d300	adrp x2,0x2ad000
0095d304	adrp x3,0x2cf000
0095d308	mov x0,x19
0095d30c	add x1,x1,#0x183
0095d310	add x2,x2,#0x459
0095d314	add x3,x3,#0x335
0095d318	bl 0x00904c98
0095d31c	mov w8,#0x1
0095d320	str w8,[x28]
0095d324	ldr x9,[x19, #0x1a0]
0095d328	add x10,x9,x27, LSL #0x2
0095d32c	ldr w11,[x10, #0xc08]
0095d330	add x8,x10,#0xc08
0095d334	cmp w11,#0x3
0095d338	b.eq 0x0095d3c4
0095d33c	cmp w11,#0x2
0095d340	b.eq 0x0095d3e8
0095d344	cbnz w11,0x0095dc80
0095d348	add x9,x9,x27, LSL #0x2
0095d34c	ldr w9,[x9, #0x1408]
0095d350	cmp w9,#0x1
0095d354	b.ne 0x0095d758
0095d358	mov w9,#0x1
0095d35c	str w9,[x8]
0095d360	ldr x8,[x19, #0x20]
0095d364	mov w9,#0xfdff
0095d368	strh w9,[sp, #0x5c]
0095d36c	strb w27,[sp, #0x5e]
0095d370	ldr w0,[x8, #0x220]
0095d374	add x1,sp,#0x5c
0095d378	orr w2,wzr,#0x3
0095d37c	mov w3,#0x4000
0095d380	bl 0x00c31c50
0095d384	tbz x0,#0x3f,0x0095d3a0
0095d388	bl 0x00c30710
0095d38c	ldr w2,[x0]
0095d390	adrp x1,0x2b3000
0095d394	mov x0,x19
0095d398	add x1,x1,#0x920
0095d39c	bl 0x00904b80
0095d3a0	ldr x8,[sp, #0x38]
0095d3a4	ldrb w8,[x8, #0x3]
0095d3a8	tbz w8,#0x4,0x0095dc80
0095d3ac	cmp w27,#0x28
0095d3b0	b.cs 0x0095d4f4
0095d3b4	adrp x8,0xc51000
0095d3b8	add x8,x8,#0x188
0095d3bc	ldr x4,[x8, x27, LSL #0x3]
0095d3c0	b 0x0095db58
0095d3c4	ldr w9,[x10, #0x1008]
0095d3c8	cmp w9,#0x1
0095d3cc	b.ne 0x0095d6b4
0095d3d0	mov w9,#0x1008
0095d3d4	add x9,x10,x9
0095d3d8	mov w10,#0x1
0095d3dc	str w10,[x8]
0095d3e0	str wzr,[x9]
0095d3e4	b 0x0095dc80
0095d3e8	add x9,x9,x27, LSL #0x2
0095d3ec	ldr w10,[x9, #0x1008]
0095d3f0	cmp w10,#0x1
0095d3f4	b.eq 0x0095d744
0095d3f8	cbnz w10,0x0095dc80
0095d3fc	mov w9,#0x1
0095d400	str w9,[x8]
0095d404	b 0x0095dc80
0095d408	adrp x4,0x2c9000
0095d40c	add x4,x4,#0xec
0095d410	ldr x8,[sp, #0x30]
0095d414	ldr x8,[x8]
0095d418	cbz x8,0x0095d428
0095d41c	ldr w8,[x8, #0x8]
0095d420	cmp w8,#0x1
0095d424	b.lt 0x0095d448
0095d428	adrp x1,0x2cb000
0095d42c	adrp x2,0x2ad000
0095d430	adrp x3,0x2c5000
0095d434	mov x0,x19
0095d438	add x1,x1,#0x183
0095d43c	add x2,x2,#0x459
0095d440	add x3,x3,#0x276
0095d444	bl 0x00904c98
0095d448	mov w8,#0x1
0095d44c	str w8,[x28]
0095d450	ldr x10,[x19, #0x1a0]
0095d454	add x9,x10,x27, LSL #0x2
0095d458	ldr w11,[x9, #0xc08]
0095d45c	add x8,x9,#0xc08
0095d460	cmp w11,#0x3
0095d464	b.eq 0x0095d480
0095d468	cmp w11,#0x2
0095d46c	b.eq 0x0095d534
0095d470	cmp w11,#0x1
0095d474	b.ne 0x0095dc80
0095d478	str wzr,[x8]
0095d47c	b 0x0095d758
0095d480	ldr w10,[x9, #0x1008]
0095d484	cmp w10,#0x1
0095d488	b.ne 0x0095d544
0095d48c	mov w10,#0x1008
0095d490	add x9,x9,x10
0095d494	mov w10,#0x2
0095d498	str w10,[x8]
0095d49c	str wzr,[x9]
0095d4a0	ldr x8,[x19, #0x20]
0095d4a4	mov w9,#0xfdff
0095d4a8	strh w9,[sp, #0x5c]
0095d4ac	strb w27,[sp, #0x5e]
0095d4b0	ldr w0,[x8, #0x220]
0095d4b4	add x1,sp,#0x5c
0095d4b8	orr w2,wzr,#0x3
0095d4bc	mov w3,#0x4000
0095d4c0	bl 0x00c31c50
0095d4c4	tbz x0,#0x3f,0x0095d4e0
0095d4c8	bl 0x00c30710
0095d4cc	ldr w2,[x0]
0095d4d0	adrp x1,0x2b3000
0095d4d4	mov x0,x19
0095d4d8	add x1,x1,#0x920
0095d4dc	bl 0x00904b80
0095d4e0	ldr x8,[sp, #0x38]
0095d4e4	ldrb w8,[x8, #0x3]
0095d4e8	tbz w8,#0x4,0x0095dc80
0095d4ec	cmp w27,#0x28
0095d4f0	b.cc 0x0095d3b4
0095d4f4	cmp w27,#0xff
0095d4f8	b.eq 0x0095db50
0095d4fc	ldr x8,[sp, #0x30]
0095d500	ldr x8,[x8]
0095d504	cbz x8,0x0095d514
0095d508	ldr w8,[x8, #0x8]
0095d50c	cmp w8,#0x1
0095d510	b.lt 0x0095dc80
0095d514	adrp x1,0x2d3000
0095d518	adrp x2,0x2cf000
0095d51c	adrp x3,0x2c9000
0095d520	mov x0,x19
0095d524	add x1,x1,#0x278
0095d528	add x2,x2,#0x34b
0095d52c	add x3,x3,#0xe9
0095d530	b 0x0095db44
0095d534	add x9,x10,x27, LSL #0x2
0095d538	ldr w10,[x9, #0x1008]
0095d53c	cmp w10,#0x1
0095d540	b.eq 0x0095d7fc
0095d544	cbz w10,0x0095d6b8
0095d548	b 0x0095dc80
0095d54c	adrp x4,0x2c9000
0095d550	add x4,x4,#0xec
0095d554	ldr x8,[sp, #0x30]
0095d558	ldr x8,[x8]
0095d55c	cbz x8,0x0095d56c
0095d560	ldr w8,[x8, #0x8]
0095d564	cmp w8,#0x1
0095d568	b.lt 0x0095d58c
0095d56c	adrp x1,0x2cb000
0095d570	adrp x2,0x2ad000
0095d574	adrp x3,0x2c1000
0095d578	mov x0,x19
0095d57c	add x1,x1,#0x183
0095d580	add x2,x2,#0x459
0095d584	add x3,x3,#0x2cc
0095d588	bl 0x00904c98
0095d58c	mov w8,#0x1
0095d590	str w8,[x28]
0095d594	ldr x9,[x19, #0x1a0]
0095d598	add x10,x9,x27, LSL #0x2
0095d59c	mov x8,x10
0095d5a0	ldr w11,[x8, #0x8]!
0095d5a4	cmp w11,#0x3
0095d5a8	b.eq 0x0095d624
0095d5ac	cmp w11,#0x2
0095d5b0	b.eq 0x0095d6a4
0095d5b4	cmp w11,#0x1
0095d5b8	b.ne 0x0095dc80
0095d5bc	str wzr,[x8]
0095d5c0	ldr x8,[x19, #0x20]
0095d5c4	mov w9,#0xfcff
0095d5c8	strh w9,[sp, #0x5c]
0095d5cc	strb w27,[sp, #0x5e]
0095d5d0	ldr w0,[x8, #0x220]
0095d5d4	add x1,sp,#0x5c
0095d5d8	orr w2,wzr,#0x3
0095d5dc	mov w3,#0x4000
0095d5e0	bl 0x00c31c50
0095d5e4	tbz x0,#0x3f,0x0095d600
0095d5e8	bl 0x00c30710
0095d5ec	ldr w2,[x0]
0095d5f0	adrp x1,0x2b3000
0095d5f4	mov x0,x19
0095d5f8	add x1,x1,#0x920
0095d5fc	bl 0x00904b80
0095d600	ldr x8,[sp, #0x38]
0095d604	ldrb w8,[x8, #0x3]
0095d608	tbz w8,#0x4,0x0095dc80
0095d60c	cmp w27,#0x28
0095d610	b.cs 0x0095d9c8
0095d614	adrp x8,0xc51000
0095d618	add x8,x8,#0x188
0095d61c	ldr x4,[x8, x27, LSL #0x3]
0095d620	b 0x0095dacc
0095d624	ldr w9,[x10, #0x408]
0095d628	cmp w9,#0x1
0095d62c	b.ne 0x0095d6b4
0095d630	add x9,x10,#0x408
0095d634	mov w10,#0x2
0095d638	str w10,[x8]
0095d63c	str wzr,[x9]
0095d640	ldr x8,[x19, #0x20]
0095d644	mov w9,#0xfbff
0095d648	strh w9,[sp, #0x5c]
0095d64c	strb w27,[sp, #0x5e]
0095d650	ldr w0,[x8, #0x220]
0095d654	add x1,sp,#0x5c
0095d658	orr w2,wzr,#0x3
0095d65c	mov w3,#0x4000
0095d660	bl 0x00c31c50
0095d664	tbz x0,#0x3f,0x0095d680
0095d668	bl 0x00c30710
0095d66c	ldr w2,[x0]
0095d670	adrp x1,0x2b3000
0095d674	mov x0,x19
0095d678	add x1,x1,#0x920
0095d67c	bl 0x00904b80
0095d680	ldr x8,[sp, #0x38]
0095d684	ldrb w8,[x8, #0x3]
0095d688	tbz w8,#0x4,0x0095dc80
0095d68c	cmp w27,#0x28
0095d690	b.cs 0x0095db08
0095d694	adrp x8,0xc51000
0095d698	add x8,x8,#0x188
0095d69c	ldr x4,[x8, x27, LSL #0x3]
0095d6a0	b 0x0095cd24
0095d6a4	add x10,x9,x27, LSL #0x2
0095d6a8	ldr w9,[x10, #0x408]
0095d6ac	cmp w9,#0x1
0095d6b0	b.eq 0x0095d808
0095d6b4	cbnz w9,0x0095dc80
0095d6b8	str wzr,[x8]
0095d6bc	b 0x0095dc80
0095d6c0	add x9,x9,#0x408
0095d6c4	mov w10,#0x1
0095d6c8	str w10,[x8]
0095d6cc	str wzr,[x9]
0095d6d0	b 0x0095dc7c
0095d6d4	orr w10,wzr,#0x3
0095d6d8	str w10,[x8]
0095d6dc	str wzr,[x9, #0x1008]
0095d6e0	ldr x8,[x19, #0x20]
0095d6e4	mov w9,#0xfcff
0095d6e8	strh w9,[sp, #0x5c]
0095d6ec	strb w27,[sp, #0x5e]
0095d6f0	ldr w0,[x8, #0x220]
0095d6f4	add x1,sp,#0x5c
0095d6f8	orr w2,wzr,#0x3
0095d6fc	mov w3,#0x4000
0095d700	bl 0x00c31c50
0095d704	tbz x0,#0x3f,0x0095d720
0095d708	bl 0x00c30710
0095d70c	ldr w2,[x0]
0095d710	adrp x1,0x2b3000
0095d714	mov x0,x19
0095d718	add x1,x1,#0x920
0095d71c	bl 0x00904b80
0095d720	ldr x8,[sp, #0x38]
0095d724	ldrb w8,[x8, #0x3]
0095d728	tbz w8,#0x4,0x0095dc7c
0095d72c	cmp w27,#0x28
0095d730	b.cs 0x0095d980
0095d734	adrp x8,0xc51000
0095d738	add x8,x8,#0x188
0095d73c	ldr x4,[x8, x27, LSL #0x3]
0095d740	b 0x0095dbe4
0095d744	mov w10,#0x1008
0095d748	add x9,x9,x10
0095d74c	orr w10,wzr,#0x3
0095d750	str w10,[x8]
0095d754	str wzr,[x9]
0095d758	ldr x8,[x19, #0x20]
0095d75c	mov w9,#0xfeff
0095d760	strh w9,[sp, #0x5c]
0095d764	strb w27,[sp, #0x5e]
0095d768	ldr w0,[x8, #0x220]
0095d76c	add x1,sp,#0x5c
0095d770	orr w2,wzr,#0x3
0095d774	mov w3,#0x4000
0095d778	bl 0x00c31c50
0095d77c	tbz x0,#0x3f,0x0095d798
0095d780	bl 0x00c30710
0095d784	ldr w2,[x0]
0095d788	adrp x1,0x2b3000
0095d78c	mov x0,x19
0095d790	add x1,x1,#0x920
0095d794	bl 0x00904b80
0095d798	ldr x8,[sp, #0x38]
0095d79c	ldrb w8,[x8, #0x3]
0095d7a0	tbz w8,#0x4,0x0095dc80
0095d7a4	cmp w27,#0x28
0095d7a8	b.cs 0x0095d7bc
0095d7ac	adrp x8,0xc51000
0095d7b0	add x8,x8,#0x188
0095d7b4	ldr x4,[x8, x27, LSL #0x3]
0095d7b8	b 0x0095da40
0095d7bc	cmp w27,#0xff
0095d7c0	b.eq 0x0095da38
0095d7c4	ldr x8,[sp, #0x30]
0095d7c8	ldr x8,[x8]
0095d7cc	cbz x8,0x0095d7dc
0095d7d0	ldr w8,[x8, #0x8]
0095d7d4	cmp w8,#0x1
0095d7d8	b.lt 0x0095dc80
0095d7dc	adrp x1,0x2d3000
0095d7e0	adrp x2,0x2cf000
0095d7e4	adrp x3,0x2c1000
0095d7e8	mov x0,x19
0095d7ec	add x1,x1,#0x278
0095d7f0	add x2,x2,#0x34b
0095d7f4	add x3,x3,#0x2cc
0095d7f8	b 0x0095db44
0095d7fc	mov w10,#0x1008
0095d800	add x9,x9,x10
0095d804	b 0x0095d80c
0095d808	add x9,x10,#0x408
0095d80c	str wzr,[x8]
0095d810	str wzr,[x9]
0095d814	b 0x0095dc80
0095d818	cbz x9,0x0095d828
0095d81c	ldr w8,[x9, #0x8]
0095d820	cmp w8,#0x1
0095d824	b.lt 0x0095d844
0095d828	adrp x1,0x2d3000
0095d82c	adrp x2,0x2bd000
0095d830	mov x0,x19
0095d834	add x1,x1,#0x26e
0095d838	add x2,x2,#0x226
0095d83c	mov w3,w27
0095d840	bl 0x00904c98
0095d844	mov x0,x19
0095d848	bl 0x0095e178
0095d84c	mov w8,#0x1
0095d850	str w8,[x28, #0x1cac]
0095d854	sub w8,w27,#0xfa
0095d858	cmp w8,#0x5
0095d85c	b.hi 0x0095d888
0095d860	adrp x9,0x748000
0095d864	add x9,x9,#0xe14
0095d868	ldrsw x8,[x9, x8, LSL #0x2]
0095d86c	add x8,x8,x9
0095d870	br x8
0095d874	ldr x8,[sp, #0x20]
0095d878	str x8,[x28, #0x1ed8]
0095d87c	orr w8,wzr,#0x7
0095d880	str w8,[x28, #0x1cac]
0095d884	b 0x0095dc84
0095d888	ldr x8,[sp, #0x38]
0095d88c	str wzr,[x28, #0x1cac]
0095d890	ldrb w8,[x8, #0x3]
0095d894	tbz w8,#0x4,0x0095dc84
0095d898	ldr x8,[sp, #0x30]
0095d89c	sub w9,w27,#0xec
0095d8a0	cmp w9,#0x13
0095d8a4	ldr x8,[x8]
0095d8a8	b.hi 0x0095da08
0095d8ac	cbz x8,0x0095d8bc
0095d8b0	ldr w8,[x8, #0x8]
0095d8b4	cmp w8,#0x1
0095d8b8	b.lt 0x0095dc84
0095d8bc	adrp x8,0xc51000
0095d8c0	add x8,x8,#0xe8
0095d8c4	ldr x3,[x8, w9, SXTW #0x3]
0095d8c8	adrp x1,0x2b1000
0095d8cc	adrp x2,0x2ad000
0095d8d0	mov x0,x19
0095d8d4	add x1,x1,#0x848
0095d8d8	add x2,x2,#0x459
0095d8dc	bl 0x00904c98
0095d8e0	b 0x0095dc84
0095d8e4	mov w8,#0x2
0095d8e8	str w8,[x28, #0x1cac]
0095d8ec	b 0x0095dc84
0095d8f0	orr w8,wzr,#0x3
0095d8f4	str w8,[x28, #0x1cac]
0095d8f8	b 0x0095dc84
0095d8fc	mov w8,#0x4
0095d900	str w8,[x28, #0x1cac]
0095d904	b 0x0095dc84
0095d908	mov w8,#0x5
0095d90c	str w8,[x28, #0x1cac]
0095d910	b 0x0095dc84
0095d914	str wzr,[x28, #0x1cac]
0095d918	ldr w8,[sp, #0x2c]
0095d91c	cmp w8,#0x0
0095d920	csel w8,w26,w8,lt
0095d924	str w8,[sp, #0x2c]
0095d928	b 0x0095dc84
0095d92c	ldr x8,[x19, #0x20]
0095d930	mov w9,#0xfcff
0095d934	strh w9,[sp, #0x5c]
0095d938	strb w27,[sp, #0x5e]
0095d93c	ldr w0,[x8, #0x220]
0095d940	add x1,sp,#0x5c
0095d944	orr w2,wzr,#0x3
0095d948	mov w3,#0x4000
0095d94c	bl 0x00c31c50
0095d950	tbz x0,#0x3f,0x0095d96c
0095d954	bl 0x00c30710
0095d958	ldr w2,[x0]
0095d95c	adrp x1,0x2b3000
0095d960	mov x0,x19
0095d964	add x1,x1,#0x920
0095d968	bl 0x00904b80
0095d96c	ldr x8,[sp, #0x38]
0095d970	ldrb w8,[x8, #0x3]
0095d974	tbz w8,#0x4,0x0095dc7c
0095d978	cmp w27,#0x28
0095d97c	b.cc 0x0095d734
0095d980	cmp w27,#0xff
0095d984	b.eq 0x0095dbdc
0095d988	ldr x8,[sp, #0x30]
0095d98c	ldr x8,[x8]
0095d990	cbz x8,0x0095d9a0
0095d994	ldr w8,[x8, #0x8]
0095d998	cmp w8,#0x1
0095d99c	b.lt 0x0095dc7c
0095d9a0	adrp x1,0x2d3000
0095d9a4	adrp x2,0x2cf000
0095d9a8	adrp x3,0x2c5000
0095d9ac	mov x0,x19
0095d9b0	add x1,x1,#0x278
0095d9b4	add x2,x2,#0x34b
0095d9b8	add x3,x3,#0x276
0095d9bc	mov w4,w27
0095d9c0	bl 0x00904c98
0095d9c4	b 0x0095dc7c
0095d9c8	cmp w27,#0xff
0095d9cc	b.eq 0x0095dac4
0095d9d0	ldr x8,[sp, #0x30]
0095d9d4	ldr x8,[x8]
0095d9d8	cbz x8,0x0095d9e8
0095d9dc	ldr w8,[x8, #0x8]
0095d9e0	cmp w8,#0x1
0095d9e4	b.lt 0x0095dc80
0095d9e8	adrp x1,0x2d3000
0095d9ec	adrp x2,0x2cf000
0095d9f0	adrp x3,0x2c5000
0095d9f4	mov x0,x19
0095d9f8	add x1,x1,#0x278
0095d9fc	add x2,x2,#0x34b
0095da00	add x3,x3,#0x276
0095da04	b 0x0095db44
0095da08	cbz x8,0x0095da18
0095da0c	ldr w8,[x8, #0x8]
0095da10	cmp w8,#0x1
0095da14	b.lt 0x0095dc84
0095da18	adrp x1,0x2d3000
0095da1c	adrp x2,0x2ad000
0095da20	mov x0,x19
0095da24	add x1,x1,#0x26e
0095da28	add x2,x2,#0x459
0095da2c	mov w3,w27
0095da30	bl 0x00904c98
0095da34	b 0x0095dc84
0095da38	adrp x4,0x2c9000
0095da3c	add x4,x4,#0xec
0095da40	ldr x8,[sp, #0x30]
0095da44	ldr x8,[x8]
0095da48	cbz x8,0x0095da58
0095da4c	ldr w8,[x8, #0x8]
0095da50	cmp w8,#0x1
0095da54	b.lt 0x0095dc80
0095da58	adrp x1,0x2cb000
0095da5c	adrp x2,0x2cf000
0095da60	adrp x3,0x2c1000
0095da64	mov x0,x19
0095da68	add x1,x1,#0x183
0095da6c	add x2,x2,#0x34b
0095da70	add x3,x3,#0x2cc
0095da74	bl 0x00904c98
0095da78	b 0x0095dc80
0095da7c	cmp w27,#0xff
0095da80	b.eq 0x0095dc20
0095da84	ldr x8,[sp, #0x30]
0095da88	ldr x8,[x8]
0095da8c	cbz x8,0x0095da9c
0095da90	ldr w8,[x8, #0x8]
0095da94	cmp w8,#0x1
0095da98	b.lt 0x0095dc60
0095da9c	adrp x1,0x2d3000
0095daa0	adrp x2,0x2cf000
0095daa4	adrp x3,0x2cf000
0095daa8	mov x0,x19
0095daac	add x1,x1,#0x278
0095dab0	add x2,x2,#0x34b
0095dab4	add x3,x3,#0x335
0095dab8	mov w4,w27
0095dabc	bl 0x00904c98
0095dac0	b 0x0095dc60
0095dac4	adrp x4,0x2c9000
0095dac8	add x4,x4,#0xec
0095dacc	ldr x8,[sp, #0x30]
0095dad0	ldr x8,[x8]
0095dad4	cbz x8,0x0095dae4
0095dad8	ldr w8,[x8, #0x8]
0095dadc	cmp w8,#0x1
0095dae0	b.lt 0x0095dc80
0095dae4	adrp x1,0x2cb000
0095dae8	adrp x2,0x2cf000
0095daec	adrp x3,0x2c5000
0095daf0	mov x0,x19
0095daf4	add x1,x1,#0x183
0095daf8	add x2,x2,#0x34b
0095dafc	add x3,x3,#0x276
0095db00	bl 0x00904c98
0095db04	b 0x0095dc80
0095db08	cmp w27,#0xff
0095db0c	b.eq 0x0095cd1c
0095db10	ldr x8,[sp, #0x30]
0095db14	ldr x8,[x8]
0095db18	cbz x8,0x0095db28
0095db1c	ldr w8,[x8, #0x8]
0095db20	cmp w8,#0x1
0095db24	b.lt 0x0095dc80
0095db28	adrp x1,0x2d3000
0095db2c	adrp x2,0x2cf000
0095db30	adrp x3,0x2cf000
0095db34	mov x0,x19
0095db38	add x1,x1,#0x278
0095db3c	add x2,x2,#0x34b
0095db40	add x3,x3,#0x335
0095db44	mov w4,w27
0095db48	bl 0x00904c98
0095db4c	b 0x0095dc80
0095db50	adrp x4,0x2c9000
0095db54	add x4,x4,#0xec
0095db58	ldr x8,[sp, #0x30]
0095db5c	ldr x8,[x8]
0095db60	cbz x8,0x0095db70
0095db64	ldr w8,[x8, #0x8]
0095db68	cmp w8,#0x1
0095db6c	b.lt 0x0095dc80
0095db70	adrp x1,0x2cb000
0095db74	adrp x2,0x2cf000
0095db78	adrp x3,0x2c9000
0095db7c	mov x0,x19
0095db80	add x1,x1,#0x183
0095db84	add x2,x2,#0x34b
0095db88	add x3,x3,#0xe9
0095db8c	bl 0x00904c98
0095db90	b 0x0095dc80
0095db94	cmp w27,#0xff
0095db98	b.eq 0x0095cd60
0095db9c	ldr x8,[sp, #0x30]
0095dba0	ldr x8,[x8]
0095dba4	cbz x8,0x0095dbb4
0095dba8	ldr w8,[x8, #0x8]
0095dbac	cmp w8,#0x1
0095dbb0	b.lt 0x0095dc70
0095dbb4	adrp x1,0x2d3000
0095dbb8	adrp x2,0x2cf000
0095dbbc	adrp x3,0x2cf000
0095dbc0	mov x0,x19
0095dbc4	add x1,x1,#0x278
0095dbc8	add x2,x2,#0x34b
0095dbcc	add x3,x3,#0x335
0095dbd0	mov w4,w27
0095dbd4	bl 0x00904c98
0095dbd8	b 0x0095dc70
0095dbdc	adrp x4,0x2c9000
0095dbe0	add x4,x4,#0xec
0095dbe4	ldr x8,[sp, #0x30]
0095dbe8	ldr x8,[x8]
0095dbec	cbz x8,0x0095dbfc
0095dbf0	ldr w8,[x8, #0x8]
0095dbf4	cmp w8,#0x1
0095dbf8	b.lt 0x0095dc7c
0095dbfc	adrp x1,0x2cb000
0095dc00	adrp x2,0x2cf000
0095dc04	adrp x3,0x2c5000
0095dc08	mov x0,x19
0095dc0c	add x1,x1,#0x183
0095dc10	add x2,x2,#0x34b
0095dc14	add x3,x3,#0x276
0095dc18	bl 0x00904c98
0095dc1c	b 0x0095dc7c
0095dc20	adrp x4,0x2c9000
0095dc24	add x4,x4,#0xec
0095dc28	ldr x8,[sp, #0x30]
0095dc2c	ldr x8,[x8]
0095dc30	cbz x8,0x0095dc40
0095dc34	ldr w8,[x8, #0x8]
0095dc38	cmp w8,#0x1
0095dc3c	b.lt 0x0095dc60
0095dc40	adrp x1,0x2cb000
0095dc44	adrp x2,0x2cf000
0095dc48	adrp x3,0x2cf000
0095dc4c	mov x0,x19
0095dc50	add x1,x1,#0x183
0095dc54	add x2,x2,#0x34b
0095dc58	add x3,x3,#0x335
0095dc5c	bl 0x00904c98
0095dc60	add x8,x22,x27, LSL #0x2
0095dc64	ldr w8,[x8, #0x1808]
0095dc68	cmp w8,#0x1
0095dc6c	b.ne 0x0095dc7c
0095dc70	mov x0,x19
0095dc74	mov w1,w27
0095dc78	bl 0x0095e42c
0095dc7c	ldr x22,[sp, #0x18]
0095dc80	str wzr,[x28, #0x1cac]
0095dc84	add x26,x26,#0x1
0095dc88	cmp x25,x26
0095dc8c	b.ne 0x0095cda4
0095dc90	ldr x28,[sp, #0x8]
0095dc94	ldr w9,[sp, #0x2c]
0095dc98	tbnz w9,#0x1f,0x0095dcd8
0095dc9c	add x8,sp,#0x60
0095dca0	add x2,x8,w9, SXTW 
0095dca4	sub w8,w26,w9
0095dca8	sxtw x3,w8
0095dcac	mov w1,#0x1
0095dcb0	mov x0,x19
0095dcb4	bl 0x00934dd0
0095dcb8	mov w27,w0
0095dcbc	cbz w0,0x0095dcd8
0095dcc0	mov w22,wzr
0095dcc4	ldr x25,[sp, #0x10]
0095dcc8	sub x26,x29,#0x70
0095dccc	ldr w8,[x19, #0x2e0]
0095dcd0	cbnz w8,0x0095cc88
0095dcd4	b 0x0095ccbc
0095dcd8	ldr x9,[sp, #0x40]
0095dcdc	ldr w8,[x9]
0095dce0	cbz w8,0x0095dcfc
0095dce4	ldr w8,[x9, #0x4]
0095dce8	sub x26,x29,#0x70
0095dcec	cbz w8,0x0095dd04
0095dcf0	ldr x25,[sp, #0x10]
0095dcf4	mov w27,wzr
0095dcf8	b 0x0095cb8c
0095dcfc	mov w27,wzr
0095dd00	b 0x0095df34
0095dd04	str x28,[sp, #0x8]
0095dd08	mov x28,x23
0095dd0c	ldr x23,[x19, #0x1a0]
0095dd10	mov w8,#0x1408
0095dd14	mov x22,xzr
0095dd18	mov w26,#0xc08
0095dd1c	add x25,x23,x8
0095dd20	cmp x22,#0x1
0095dd24	b.eq 0x0095df0c
0095dd28	add x8,x23,x22, LSL #0x2
0095dd2c	ldr w8,[x8, #0x808]
0095dd30	cmp w8,#0x1
0095dd34	b.ne 0x0095de1c
0095dd38	ldr x9,[x19, #0x1a0]
0095dd3c	add x8,x9,x22, LSL #0x2
0095dd40	ldr w10,[x8, #0x8]
0095dd44	cmp w10,#0x3
0095dd48	b.eq 0x0095ddf4
0095dd4c	cmp w10,#0x2
0095dd50	b.eq 0x0095de08
0095dd54	cbnz w10,0x0095de1c
0095dd58	mov w9,#0x2
0095dd5c	str w9,[x8, #0x8]
0095dd60	ldr x8,[x19, #0x20]
0095dd64	mov w9,#0xfbff
0095dd68	strh w9,[sp, #0x5c]
0095dd6c	strb w22,[sp, #0x5e]
0095dd70	ldr w0,[x8, #0x220]
0095dd74	add x1,sp,#0x5c
0095dd78	orr w2,wzr,#0x3
0095dd7c	mov w3,#0x4000
0095dd80	bl 0x00c31c50
0095dd84	tbz x0,#0x3f,0x0095dda0
0095dd88	bl 0x00c30710
0095dd8c	ldr w2,[x0]
0095dd90	adrp x1,0x2b3000
0095dd94	mov x0,x19
0095dd98	add x1,x1,#0x920
0095dd9c	bl 0x00904b80
0095dda0	ldr x8,[sp, #0x38]
0095dda4	ldrb w8,[x8, #0x3]
0095dda8	tbz w8,#0x4,0x0095de1c
0095ddac	ldr x8,[sp, #0x30]
0095ddb0	ldr x8,[x8]
0095ddb4	cbz x8,0x0095ddc4
0095ddb8	ldr w8,[x8, #0x8]
0095ddbc	cmp w8,#0x1
0095ddc0	b.lt 0x0095de1c
0095ddc4	adrp x8,0xc51000
0095ddc8	add x8,x8,#0x188
0095ddcc	ldr x4,[x8, x22, LSL #0x3]
0095ddd0	adrp x1,0x2cb000
0095ddd4	adrp x2,0x2cf000
0095ddd8	adrp x3,0x2cf000
0095dddc	mov x0,x19
0095dde0	add x1,x1,#0x183
0095dde4	add x2,x2,#0x34b
0095dde8	add x3,x3,#0x335
0095ddec	bl 0x00904c98
0095ddf0	b 0x0095de1c
0095ddf4	ldr w9,[x8, #0x408]
0095ddf8	cbnz w9,0x0095de1c
0095ddfc	mov w9,#0x1
0095de00	str w9,[x8, #0x408]
0095de04	b 0x0095de1c
0095de08	add x8,x9,x22, LSL #0x2
0095de0c	ldr w9,[x8, #0x408]
0095de10	cmp w9,#0x1
0095de14	b.ne 0x0095de1c
0095de18	str wzr,[x8, #0x408]
0095de1c	ldr w8,[x25, x22, LSL #0x2]
0095de20	cmp w8,#0x1
0095de24	b.ne 0x0095df0c
0095de28	ldr x8,[x19, #0x1a0]
0095de2c	ldr w9,[x8, x26#0x0]
0095de30	cmp w9,#0x3
0095de34	b.eq 0x0095dee0
0095de38	cmp w9,#0x2
0095de3c	b.eq 0x0095def8
0095de40	cbnz w9,0x0095df0c
0095de44	mov w9,#0x2
0095de48	str w9,[x8, x26#0x0]
0095de4c	ldr x8,[x19, #0x20]
0095de50	mov w9,#0xfdff
0095de54	strh w9,[sp, #0x5c]
0095de58	strb w22,[sp, #0x5e]
0095de5c	ldr w0,[x8, #0x220]
0095de60	add x1,sp,#0x5c
0095de64	orr w2,wzr,#0x3
0095de68	mov w3,#0x4000
0095de6c	bl 0x00c31c50
0095de70	tbz x0,#0x3f,0x0095de8c
0095de74	bl 0x00c30710
0095de78	ldr w2,[x0]
0095de7c	adrp x1,0x2b3000
0095de80	mov x0,x19
0095de84	add x1,x1,#0x920
0095de88	bl 0x00904b80
0095de8c	ldr x8,[sp, #0x38]
0095de90	ldrb w8,[x8, #0x3]
0095de94	tbz w8,#0x4,0x0095df0c
0095de98	ldr x8,[sp, #0x30]
0095de9c	ldr x8,[x8]
0095dea0	cbz x8,0x0095deb0
0095dea4	ldr w8,[x8, #0x8]
0095dea8	cmp w8,#0x1
0095deac	b.lt 0x0095df0c
0095deb0	adrp x8,0xc51000
0095deb4	add x8,x8,#0x188
0095deb8	ldr x4,[x8, x22, LSL #0x3]
0095debc	adrp x1,0x2cb000
0095dec0	adrp x2,0x2cf000
0095dec4	adrp x3,0x2c9000
0095dec8	mov x0,x19
0095decc	add x1,x1,#0x183
0095ded0	add x2,x2,#0x34b
0095ded4	add x3,x3,#0xe9
0095ded8	bl 0x00904c98
0095dedc	b 0x0095df0c
0095dee0	add x8,x8,x26
0095dee4	ldr w9,[x8, #0x400]
0095dee8	cbnz w9,0x0095df0c
0095deec	mov w9,#0x1
0095def0	str w9,[x8, #0x400]
0095def4	b 0x0095df0c
0095def8	add x8,x8,x26
0095defc	ldr w9,[x8, #0x400]
0095df00	cmp w9,#0x1
0095df04	b.ne 0x0095df0c
0095df08	str wzr,[x8, #0x400]
0095df0c	add x22,x22,#0x1
0095df10	cmp x22,#0x28
0095df14	add x26,x26,#0x4
0095df18	b.ne 0x0095dd20
0095df1c	ldr x8,[sp, #0x40]
0095df20	mov x23,x28
0095df24	ldr x28,[sp, #0x8]
0095df28	mov w27,wzr
0095df2c	mov w9,#0x1
0095df30	str w9,[x8, #0x4]
0095df34	ldr x25,[sp, #0x10]
0095df38	sub x26,x29,#0x70
0095df3c	b 0x0095cb8c
0095df40	ldr x28,[sp, #0x8]
0095df44	b 0x0095dcc0
0095df48	mov w27,#0x2a
0095df4c	mov x0,x19
0095df50	bl 0x00943194
0095df54	ldr x8,[x23, #0x28]
0095df58	ldr x9,[sp, #0x48]
0095df5c	cmp x8,x9
0095df60	b.ne 0x0095df98
0095df64	mov w0,w27
0095df68	add sp,sp,#0x1, LSL #12
0095df6c	add sp,sp,#0x80
0095df70	ldp x29,x30,[sp, #0x50]
0095df74	ldp x20,x19,[sp, #0x40]
0095df78	ldp x22,x21,[sp, #0x30]
0095df7c	ldp x24,x23,[sp, #0x20]
0095df80	ldp x26,x25,[sp, #0x10]
0095df84	ldp x28,x27,[sp], #0x60
0095df88	ret
0095df8c	ldr x23,[sp, #0x38]
0095df90	mov w27,#0x1b
0095df94	b 0x0095cae0
0095df98	bl 0x00c2fec0
