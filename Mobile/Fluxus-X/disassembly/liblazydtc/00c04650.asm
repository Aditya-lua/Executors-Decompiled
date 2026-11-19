; std::__ndk1::__time_get_storage<char>::__analyze @ 00c04650
00c04650	paciasp
00c04654	sub sp,sp,#0x140
00c04658	stp x29,x30,[sp, #0xe0]
00c0465c	stp x28,x27,[sp, #0xf0]
00c04660	stp x26,x25,[sp, #0x100]
00c04664	stp x24,x23,[sp, #0x110]
00c04668	stp x22,x21,[sp, #0x120]
00c0466c	stp x20,x19,[sp, #0x130]
00c04670	add x29,sp,#0xe0
00c04674	adrp x9,0x29c000
00c04678	mov x19,x8
00c0467c	sub x8,x29,#0x50
00c04680	ldr q0,[x9, #0x6d0]
00c04684	adrp x9,0x29c000
00c04688	stp xzr,xzr,[x8, #0x20]
00c0468c	str xzr,[x8, #0x30]
00c04690	ldr x4,[x0]
00c04694	mov x20,x2
00c04698	stur q0,[x29, #-0x50]
00c0469c	ldr q0,[x9, #0xc20]
00c046a0	mov w27,w1
00c046a4	mov x21,x0
00c046a8	strb w1,[sp, #0x29]
00c046ac	add x0,sp,#0x2c
00c046b0	str q0,[x8, #0x10]
00c046b4	mov w8,#0xffffffff
00c046b8	add x2,sp,#0x28
00c046bc	stur w8,[x29, #-0x30]
00c046c0	mov w8,#0x25
00c046c4	sub x3,x29,#0x50
00c046c8	mov w1,#0x64
00c046cc	strb wzr,[sp, #0x2a]
00c046d0	strb w8,[sp, #0x28]
00c046d4	bl 0x00c43b60
00c046d8	stp xzr,xzr,[x19, #0x8]
00c046dc	str xzr,[x19]
00c046e0	str x0,[sp, #0x10]
00c046e4	cbz x0,0x00c04c04
00c046e8	ldr x9,[sp, #0x10]
00c046ec	add x8,sp,#0x2c
00c046f0	add x24,x21,#0x8
00c046f4	add x25,x21,#0x158
00c046f8	add x26,x21,#0x398
00c046fc	add x28,sp,#0x2c
00c04700	add x23,x8,x9
00c04704	add x8,x19,#0x1
00c04708	str x8,[sp]
00c0470c	and w8,w27,#0xff
00c04710	str w8,[sp, #0xc]
00c04714	b 0x00c04724
00c04718	ldr x28,[sp, #0x20]
00c0471c	cmp x28,x23
00c04720	b.eq 0x00c04c04
00c04724	ldrsb x8,[x28]
00c04728	tbnz x8,#0x3f,0x00c04738
00c0472c	ldr x9,[x20, #0x10]
00c04730	ldr x8,[x9, x8, LSL #0x3]
00c04734	tbnz w8,#0x0,0x00c0485c
00c04738	str x28,[sp, #0x20]
00c0473c	str wzr,[sp, #0x1c]
00c04740	add x0,sp,#0x20
00c04744	add x5,sp,#0x1c
00c04748	mov x1,x23
00c0474c	mov x2,x24
00c04750	mov x3,x25
00c04754	mov x4,x20
00c04758	mov w6,wzr
00c0475c	bl 0x00c04c58
00c04760	sub x22,x0,x24
00c04764	cmp x22,#0x14f
00c04768	b.gt 0x00c04794
00c0476c	mov x0,x19
00c04770	mov w1,#0x25
00c04774	bl 0x00c30150
00c04778	cmp x22,#0xa8
00c0477c	mov w8,#0x61
00c04780	mov w9,#0x41
00c04784	csel w1,w9,w8,lt
00c04788	mov x0,x19
00c0478c	bl 0x00c30150
00c04790	b 0x00c04718
00c04794	str x28,[sp, #0x20]
00c04798	add x0,sp,#0x20
00c0479c	add x5,sp,#0x1c
00c047a0	mov x1,x23
00c047a4	mov x2,x25
00c047a8	mov x3,x26
00c047ac	mov x4,x20
00c047b0	mov w6,wzr
00c047b4	bl 0x00c04c58
00c047b8	sub x22,x0,x25
00c047bc	cmp x22,#0x23f
00c047c0	b.gt 0x00c048a0
00c047c4	mov x0,x19
00c047c8	mov w1,#0x25
00c047cc	bl 0x00c30150
00c047d0	cmp x22,#0x120
00c047d4	mov w8,#0x62
00c047d8	mov w9,#0x42
00c047dc	csel w1,w9,w8,lt
00c047e0	mov x0,x19
00c047e4	bl 0x00c30150
00c047e8	ldr w8,[sp, #0xc]
00c047ec	cmp w8,#0x78
00c047f0	b.ne 0x00c04718
00c047f4	asr x8,x22,#0x3
00c047f8	orr x9,xzr,#-0x5555555555555556
00c047fc	movk x9,#0xaaab
00c04800	mul x8,x8,x9
00c04804	mov w9,#0x18
00c04808	madd x8,x8,x9,x25
00c0480c	ldrb w9,[x8]
00c04810	ldr x10,[x8, #0x10]
00c04814	tst w9,#0x1
00c04818	csinc x8,x10,x8,ne
00c0481c	ldrsb x8,[x8]
00c04820	tbnz x8,#0x3f,0x00c04718
00c04824	ldr x9,[x20, #0x10]
00c04828	ldr x8,[x9, x8, LSL #0x3]
00c0482c	tbz w8,#0x6,0x00c04718
00c04830	ldrb w8,[x19]
00c04834	ldp x10,x9,[x19, #0x8]
00c04838	lsr x11,x8,#0x1
00c0483c	tst w8,#0x1
00c04840	ldr x8,[sp]
00c04844	csel x8,x8,x9,eq
00c04848	csel x9,x11,x10,eq
00c0484c	add x8,x8,x9
00c04850	mov w9,#0x6d
00c04854	sturb w9,[x8, #-0x1]
00c04858	b 0x00c04718
00c0485c	mov x0,x19
00c04860	mov w1,#0x20
00c04864	bl 0x00c30150
00c04868	ldr x10,[sp, #0x10]
00c0486c	ldr x8,[x20, #0x10]
00c04870	add x9,sp,#0x2c
00c04874	add x9,x9,x10
00c04878	add x10,x28,#0x1
00c0487c	cmp x10,x23
00c04880	b.eq 0x00c04954
00c04884	ldrsb x11,[x10]
00c04888	tbnz x11,#0x3f,0x00c0495c
00c0488c	ldr x11,[x8, x11, LSL #0x3]
00c04890	add x28,x28,#0x1
00c04894	add x10,x10,#0x1
00c04898	tbnz w11,#0x0,0x00c0487c
00c0489c	b 0x00c0471c
00c048a0	ldrb w8,[x21, #0x398]
00c048a4	ldrb w9,[x21, #0x3b0]
00c048a8	ldr x10,[x21, #0x3a0]
00c048ac	lsr x11,x8,#0x1
00c048b0	tst w8,#0x1
00c048b4	ldr x8,[x21, #0x3b8]
00c048b8	lsr x12,x9,#0x1
00c048bc	csel x10,x11,x10,eq
00c048c0	tst w9,#0x1
00c048c4	csel x8,x12,x8,eq
00c048c8	cmn x10,x8
00c048cc	b.eq 0x00c0491c
00c048d0	str x28,[sp, #0x20]
00c048d4	add x0,sp,#0x20
00c048d8	add x3,x21,#0x3c8
00c048dc	add x5,sp,#0x1c
00c048e0	mov x1,x23
00c048e4	mov x2,x26
00c048e8	mov x4,x20
00c048ec	mov w6,wzr
00c048f0	bl 0x00c04c58
00c048f4	sub x8,x0,x26
00c048f8	cmp x8,#0x2f
00c048fc	b.gt 0x00c0491c
00c04900	mov x0,x19
00c04904	mov w1,#0x25
00c04908	bl 0x00c30150
00c0490c	mov x0,x19
00c04910	mov w1,#0x70
00c04914	bl 0x00c30150
00c04918	b 0x00c04718
00c0491c	str x28,[sp, #0x20]
00c04920	ldrsb x1,[x28]
00c04924	tbnz x1,#0x3f,0x00c04964
00c04928	ldr x8,[x20, #0x10]
00c0492c	ldr x8,[x8, x1, LSL #0x3]
00c04930	tbnz w8,#0x6,0x00c04974
00c04934	cmp w1,#0x25
00c04938	b.ne 0x00c04964
00c0493c	mov x0,x19
00c04940	bl 0x00c30150
00c04944	mov x0,x19
00c04948	mov w1,#0x25
00c0494c	bl 0x00c30150
00c04950	b 0x00c0496c
00c04954	mov x28,x9
00c04958	b 0x00c0471c
00c0495c	mov x28,x10
00c04960	b 0x00c0471c
00c04964	mov x0,x19
00c04968	bl 0x00c30150
00c0496c	add x27,x28,#0x1
00c04970	b 0x00c04bcc
00c04974	ldr x8,[x20]
00c04978	ldr x8,[x8, #0x48]
00c0497c	mov x0,x20
00c04980	mov w2,wzr
00c04984	blr x8
00c04988	add x27,x28,#0x1
00c0498c	and w8,w0,#0xff
00c04990	cmp x27,x23
00c04994	sub w22,w8,#0x30
00c04998	b.eq 0x00c04a60
00c0499c	ldrsb x1,[x27]
00c049a0	tbnz x1,#0x3f,0x00c04a68
00c049a4	ldr x8,[x20, #0x10]
00c049a8	ldr x8,[x8, x1, LSL #0x3]
00c049ac	tbz w8,#0x6,0x00c04a68
00c049b0	ldr x8,[x20]
00c049b4	ldr x8,[x8, #0x48]
00c049b8	mov x0,x20
00c049bc	mov w2,wzr
00c049c0	blr x8
00c049c4	mov w8,#0xa
00c049c8	add x27,x28,#0x2
00c049cc	mul w8,w22,w8
00c049d0	cmp x27,x23
00c049d4	add w8,w8,w0, UXTB 
00c049d8	sub w22,w8,#0x30
00c049dc	b.eq 0x00c04a60
00c049e0	ldrsb x1,[x27]
00c049e4	tbnz x1,#0x3f,0x00c04a68
00c049e8	ldr x8,[x20, #0x10]
00c049ec	ldr x8,[x8, x1, LSL #0x3]
00c049f0	tbz w8,#0x6,0x00c04a68
00c049f4	ldr x8,[x20]
00c049f8	ldr x8,[x8, #0x48]
00c049fc	mov x0,x20
00c04a00	mov w2,wzr
00c04a04	blr x8
00c04a08	mov w8,#0xa
00c04a0c	add x27,x28,#0x3
00c04a10	mul w8,w22,w8
00c04a14	cmp x27,x23
00c04a18	add w8,w8,w0, UXTB 
00c04a1c	sub w22,w8,#0x30
00c04a20	b.eq 0x00c04a60
00c04a24	ldrsb x1,[x27]
00c04a28	tbnz x1,#0x3f,0x00c04a68
00c04a2c	ldr x8,[x20, #0x10]
00c04a30	ldr x8,[x8, x1, LSL #0x3]
00c04a34	tbz w8,#0x6,0x00c04a68
00c04a38	ldr x8,[x20]
00c04a3c	ldr x8,[x8, #0x48]
00c04a40	mov x0,x20
00c04a44	mov w2,wzr
00c04a48	blr x8
00c04a4c	mov w8,#0xa
00c04a50	add x27,x28,#0x4
00c04a54	mul w8,w22,w8
00c04a58	add w8,w8,w0, UXTB 
00c04a5c	sub w22,w8,#0x30
00c04a60	cmp x27,x23
00c04a64	b.eq 0x00c04ad0
00c04a68	cmp w22,#0x1e
00c04a6c	b.le 0x00c04ae4
00c04a70	cmp w22,#0x3c
00c04a74	b.gt 0x00c04aa4
00c04a78	cmp w22,#0x1f
00c04a7c	b.eq 0x00c04ba0
00c04a80	cmp w22,#0x37
00c04a84	b.eq 0x00c04b64
00c04a88	cmp w22,#0x3b
00c04a8c	b.ne 0x00c04bd4
00c04a90	mov x0,x19
00c04a94	mov w1,#0x25
00c04a98	bl 0x00c30150
00c04a9c	mov w1,#0x53
00c04aa0	b 0x00c04bc4
00c04aa4	cmp w22,#0x3d
00c04aa8	b.eq 0x00c04bb4
00c04aac	cmp w22,#0x16c
00c04ab0	b.eq 0x00c04b78
00c04ab4	cmp w22,#0x80d
00c04ab8	b.ne 0x00c04bd4
00c04abc	mov x0,x19
00c04ac0	mov w1,#0x25
00c04ac4	bl 0x00c30150
00c04ac8	mov w1,#0x59
00c04acc	b 0x00c04bc4
00c04ad0	ldr w8,[sp, #0x1c]
00c04ad4	orr w8,w8,#0x2
00c04ad8	str w8,[sp, #0x1c]
00c04adc	cmp w22,#0x1e
00c04ae0	b.gt 0x00c04a70
00c04ae4	cmp w22,#0xa
00c04ae8	b.le 0x00c04b18
00c04aec	cmp w22,#0xb
00c04af0	b.eq 0x00c04b8c
00c04af4	cmp w22,#0xc
00c04af8	b.eq 0x00c04b50
00c04afc	cmp w22,#0x17
00c04b00	b.ne 0x00c04bd4
00c04b04	mov x0,x19
00c04b08	mov w1,#0x25
00c04b0c	bl 0x00c30150
00c04b10	mov w1,#0x48
00c04b14	b 0x00c04bc4
00c04b18	cmp w22,#0x6
00c04b1c	b.eq 0x00c04b3c
00c04b20	cmp w22,#0x7
00c04b24	b.ne 0x00c04bd4
00c04b28	mov x0,x19
00c04b2c	mov w1,#0x25
00c04b30	bl 0x00c30150
00c04b34	mov w1,#0x75
00c04b38	b 0x00c04bc4
00c04b3c	mov x0,x19
00c04b40	mov w1,#0x25
00c04b44	bl 0x00c30150
00c04b48	mov w1,#0x77
00c04b4c	b 0x00c04bc4
00c04b50	mov x0,x19
00c04b54	mov w1,#0x25
00c04b58	bl 0x00c30150
00c04b5c	mov w1,#0x6d
00c04b60	b 0x00c04bc4
00c04b64	mov x0,x19
00c04b68	mov w1,#0x25
00c04b6c	bl 0x00c30150
00c04b70	mov w1,#0x4d
00c04b74	b 0x00c04bc4
00c04b78	mov x0,x19
00c04b7c	mov w1,#0x25
00c04b80	bl 0x00c30150
00c04b84	mov w1,#0x6a
00c04b88	b 0x00c04bc4
00c04b8c	mov x0,x19
00c04b90	mov w1,#0x25
00c04b94	bl 0x00c30150
00c04b98	mov w1,#0x49
00c04b9c	b 0x00c04bc4
00c04ba0	mov x0,x19
00c04ba4	mov w1,#0x25
00c04ba8	bl 0x00c30150
00c04bac	mov w1,#0x64
00c04bb0	b 0x00c04bc4
00c04bb4	mov x0,x19
00c04bb8	mov w1,#0x25
00c04bbc	bl 0x00c30150
00c04bc0	mov w1,#0x79
00c04bc4	mov x0,x19
00c04bc8	bl 0x00c30150
00c04bcc	mov x28,x27
00c04bd0	b 0x00c0471c
00c04bd4	ldr x8,[sp, #0x20]
00c04bd8	cmp x8,x27
00c04bdc	b.eq 0x00c04bcc
00c04be0	ldrb w1,[x8]
00c04be4	mov x0,x19
00c04be8	bl 0x00c30150
00c04bec	ldr x8,[sp, #0x20]
00c04bf0	add x8,x8,#0x1
00c04bf4	cmp x8,x27
00c04bf8	str x8,[sp, #0x20]
00c04bfc	b.ne 0x00c04be0
00c04c00	b 0x00c04bcc
00c04c04	ldp x20,x19,[sp, #0x130]
00c04c08	ldp x22,x21,[sp, #0x120]
00c04c0c	ldp x24,x23,[sp, #0x110]
00c04c10	ldp x26,x25,[sp, #0x100]
00c04c14	ldp x28,x27,[sp, #0xf0]
00c04c18	ldp x29,x30,[sp, #0xe0]
00c04c1c	add sp,sp,#0x140
00c04c20	autiasp
00c04c24	ret
