; FUN_00c247b8 @ 00c247b8
00c247b8	paciasp
00c247bc	sub sp,sp,#0x70
00c247c0	stp x29,x30,[sp, #0x10]
00c247c4	stp x28,x27,[sp, #0x20]
00c247c8	stp x26,x25,[sp, #0x30]
00c247cc	stp x24,x23,[sp, #0x40]
00c247d0	stp x22,x21,[sp, #0x50]
00c247d4	stp x20,x19,[sp, #0x60]
00c247d8	add x29,sp,#0x10
00c247dc	ldp x9,x8,[x0]
00c247e0	mov x19,x0
00c247e4	cmp x9,x8
00c247e8	b.eq 0x00c24810
00c247ec	ldrb w10,[x9]
00c247f0	cmp w10,#0x72
00c247f4	b.ne 0x00c24810
00c247f8	add x9,x9,#0x1
00c247fc	mov w25,#0x4
00c24800	str x9,[x19]
00c24804	cmp x9,x8
00c24808	b.ne 0x00c2481c
00c2480c	b 0x00c24834
00c24810	mov w25,wzr
00c24814	cmp x9,x8
00c24818	b.eq 0x00c24834
00c2481c	ldrb w10,[x9]
00c24820	cmp w10,#0x56
00c24824	b.ne 0x00c24834
00c24828	add x9,x9,#0x1
00c2482c	orr w25,w25,#0x2
00c24830	str x9,[x19]
00c24834	cmp x9,x8
00c24838	b.eq 0x00c24854
00c2483c	ldrb w10,[x9]
00c24840	cmp w10,#0x4b
00c24844	b.ne 0x00c24854
00c24848	add x9,x9,#0x1
00c2484c	orr w25,w25,#0x1
00c24850	str x9,[x19]
00c24854	sub x10,x8,x9
00c24858	cmp x10,#0x2
00c2485c	b.cs 0x00c24868
00c24860	mov x26,xzr
00c24864	b 0x00c24af0
00c24868	ldrh w10,[x9]
00c2486c	mov w11,#0x6f44
00c24870	cmp w10,w11
00c24874	b.eq 0x00c24958
00c24878	ldrh w10,[x9]
00c2487c	mov w11,#0x4f44
00c24880	cmp w10,w11
00c24884	b.eq 0x00c249d4
00c24888	ldrh w10,[x9]
00c2488c	mov w11,#0x7744
00c24890	cmp w10,w11
00c24894	b.ne 0x00c24860
00c24898	ldp x11,x10,[x19, #0x10]
00c2489c	add x9,x9,#0x2
00c248a0	add x24,x19,#0x28
00c248a4	str x9,[x19]
00c248a8	sub x10,x10,x11
00c248ac	asr x20,x10,#0x3
00c248b0	b 0x00c248e4
00c248b4	mov x0,x22
00c248b8	bl 0x00c30950
00c248bc	str x0,[x19, #0x10]
00c248c0	cbz x0,0x00c24d48
00c248c4	asr x8,x21,#0x2
00c248c8	add x23,x0,x21
00c248cc	add x8,x0,x8, LSL #0x3
00c248d0	mov x0,x26
00c248d4	str x8,[x19, #0x20]
00c248d8	ldp x9,x8,[x19]
00c248dc	str x0,[x23], #0x8
00c248e0	str x23,[x19, #0x18]
00c248e4	cmp x9,x8
00c248e8	b.eq 0x00c248f8
00c248ec	ldrb w8,[x9]
00c248f0	cmp w8,#0x45
00c248f4	b.eq 0x00c24a6c
00c248f8	mov x0,x19
00c248fc	bl 0x00c10bfc
00c24900	cbz x0,0x00c24c68
00c24904	ldp x23,x8,[x19, #0x18]
00c24908	cmp x23,x8
00c2490c	b.ne 0x00c248d8
00c24910	ldr x22,[x19, #0x10]
00c24914	mov x26,x0
00c24918	sub x21,x23,x22
00c2491c	cmp x22,x24
00c24920	lsl x1,x21,#0x1
00c24924	b.ne 0x00c248b4
00c24928	mov x0,x1
00c2492c	bl 0x00c308d0
00c24930	cbz x0,0x00c24d50
00c24934	cmp x23,x24
00c24938	b.eq 0x00c24950
00c2493c	mov x1,x22
00c24940	mov x2,x21
00c24944	mov x23,x0
00c24948	bl 0x00c2ff60
00c2494c	mov x0,x23
00c24950	str x0,[x19, #0x10]
00c24954	b 0x00c248c4
00c24958	ldr x20,[x19, #0x1330]
00c2495c	add x9,x9,#0x2
00c24960	str x9,[x19]
00c24964	ldr x8,[x20, #0x8]
00c24968	sub x10,x8,#0xfd0
00c2496c	cmn x10,#0xff1
00c24970	b.hi 0x00c24990
00c24974	mov w0,#0x1000
00c24978	bl 0x00c308d0
00c2497c	cbz x0,0x00c24d54
00c24980	mov x8,xzr
00c24984	stp x20,xzr,[x0]
00c24988	mov x20,x0
00c2498c	str x0,[x19, #0x1330]
00c24990	add x9,x8,#0x20
00c24994	add x26,x20,x8
00c24998	adrp x8,0xcb1000
00c2499c	add x8,x8,#0x4c0
00c249a0	str x9,[x20, #0x8]
00c249a4	mov w10,#0x540
00c249a8	str x8,[x26, #0x10]!
00c249ac	ldurh w8,[x26, #0x9]
00c249b0	mov w9,#0x8
00c249b4	and w8,w8,#0xf000
00c249b8	strb w9,[x26, #0x8]
00c249bc	orr w8,w8,w10
00c249c0	sturh w8,[x26, #0x9]
00c249c4	adrp x8,0x2ae000
00c249c8	add x8,x8,#0xed4
00c249cc	stp x8,x9,[x26, #0x10]
00c249d0	b 0x00c24af0
00c249d4	add x8,x9,#0x2
00c249d8	mov x0,x19
00c249dc	str x8,[x19]
00c249e0	bl 0x00c16098
00c249e4	cbz x0,0x00c24c68
00c249e8	ldp x9,x8,[x19]
00c249ec	cmp x9,x8
00c249f0	b.eq 0x00c24c64
00c249f4	ldrb w8,[x9]
00c249f8	cmp w8,#0x45
00c249fc	b.ne 0x00c24c64
00c24a00	ldr x20,[x19, #0x1330]
00c24a04	add x9,x9,#0x1
00c24a08	str x9,[x19]
00c24a0c	ldr x8,[x20, #0x8]
00c24a10	sub x10,x8,#0xfd0
00c24a14	cmn x10,#0xff1
00c24a18	b.hi 0x00c24a40
00c24a1c	mov x21,x0
00c24a20	mov w0,#0x1000
00c24a24	bl 0x00c308d0
00c24a28	cbz x0,0x00c24d54
00c24a2c	mov x8,xzr
00c24a30	stp x20,xzr,[x0]
00c24a34	mov x20,x0
00c24a38	str x0,[x19, #0x1330]
00c24a3c	mov x0,x21
00c24a40	add x9,x8,#0x20
00c24a44	add x26,x20,x8
00c24a48	adrp x8,0xcb3000
00c24a4c	add x8,x8,#0x908
00c24a50	str x9,[x20, #0x8]
00c24a54	mov w10,#0x540
00c24a58	str x8,[x26, #0x10]!
00c24a5c	ldurh w8,[x26, #0x9]
00c24a60	mov w9,#0x11
00c24a64	str x0,[x26, #0x10]
00c24a68	b 0x00c24ae0
00c24a6c	add x8,x9,#0x1
00c24a70	mov x0,x19
00c24a74	mov x1,x20
00c24a78	str x8,[x19]
00c24a7c	bl 0x00c13140
00c24a80	ldr x22,[x19, #0x1330]
00c24a84	mov x20,x0
00c24a88	mov x21,x1
00c24a8c	ldr x8,[x22, #0x8]
00c24a90	sub x9,x8,#0xfd0
00c24a94	cmn x9,#0xff1
00c24a98	b.hi 0x00c24ab8
00c24a9c	mov w0,#0x1000
00c24aa0	bl 0x00c308d0
00c24aa4	cbz x0,0x00c24d54
00c24aa8	mov x8,xzr
00c24aac	stp x22,xzr,[x0]
00c24ab0	mov x22,x0
00c24ab4	str x0,[x19, #0x1330]
00c24ab8	add x9,x8,#0x20
00c24abc	add x26,x22,x8
00c24ac0	adrp x8,0xcb3000
00c24ac4	add x8,x8,#0x980
00c24ac8	str x9,[x22, #0x8]
00c24acc	mov w10,#0x540
00c24ad0	str x8,[x26, #0x10]!
00c24ad4	ldurh w8,[x26, #0x9]
00c24ad8	mov w9,#0x12
00c24adc	stp x20,x21,[x26, #0x10]
00c24ae0	and w8,w8,#0xf000
00c24ae4	strb w9,[x26, #0x8]
00c24ae8	orr w8,w8,w10
00c24aec	sturh w8,[x26, #0x9]
00c24af0	ldp x8,x9,[x19]
00c24af4	sub x10,x9,x8
00c24af8	cmp x10,#0x2
00c24afc	b.cc 0x00c24b10
00c24b00	ldrh w10,[x8]
00c24b04	mov w11,#0x7844
00c24b08	cmp w10,w11
00c24b0c	b.eq 0x00c24c54
00c24b10	cmp x8,x9
00c24b14	b.eq 0x00c24c64
00c24b18	ldrb w10,[x8]
00c24b1c	cmp w10,#0x46
00c24b20	b.ne 0x00c24c64
00c24b24	add x10,x8,#0x1
00c24b28	cmp x10,x9
00c24b2c	str x10,[x19]
00c24b30	b.eq 0x00c24b48
00c24b34	ldrb w9,[x10]
00c24b38	cmp w9,#0x59
00c24b3c	b.ne 0x00c24b48
00c24b40	add x8,x8,#0x2
00c24b44	str x8,[x19]
00c24b48	mov x0,x19
00c24b4c	bl 0x00c10bfc
00c24b50	cbz x0,0x00c24c68
00c24b54	ldp x9,x8,[x19, #0x10]
00c24b58	add x28,x19,#0x28
00c24b5c	mov w21,#0x4552
00c24b60	mov w27,#0x454f
00c24b64	sub x8,x8,x9
00c24b68	asr x8,x8,#0x3
00c24b6c	stp x0,x8,[sp]
00c24b70	b 0x00c24ba0
00c24b74	mov x0,x23
00c24b78	bl 0x00c30950
00c24b7c	str x0,[x19, #0x10]
00c24b80	cbz x0,0x00c24d44
00c24b84	asr x8,x22,#0x2
00c24b88	add x24,x0,x22
00c24b8c	add x8,x0,x8, LSL #0x3
00c24b90	mov x0,x20
00c24b94	str x8,[x19, #0x20]
00c24b98	str x0,[x24], #0x8
00c24b9c	str x24,[x19, #0x18]
00c24ba0	ldp x8,x9,[x19]
00c24ba4	cmp x8,x9
00c24ba8	b.eq 0x00c24bd0
00c24bac	ldrb w10,[x8]
00c24bb0	cmp w10,#0x45
00c24bb4	b.eq 0x00c24c8c
00c24bb8	ldrb w10,[x8]
00c24bbc	cmp w10,#0x76
00c24bc0	b.ne 0x00c24bd0
00c24bc4	add x8,x8,#0x1
00c24bc8	str x8,[x19]
00c24bcc	b 0x00c24ba0
00c24bd0	sub x9,x9,x8
00c24bd4	cmp x9,#0x2
00c24bd8	b.cc 0x00c24bf4
00c24bdc	ldrh w9,[x8]
00c24be0	cmp w9,w21
00c24be4	b.eq 0x00c24c98
00c24be8	ldrh w9,[x8]
00c24bec	cmp w9,w27
00c24bf0	b.eq 0x00c24ca4
00c24bf4	mov x0,x19
00c24bf8	bl 0x00c10bfc
00c24bfc	cbz x0,0x00c24c68
00c24c00	ldp x24,x8,[x19, #0x18]
00c24c04	cmp x24,x8
00c24c08	b.ne 0x00c24b98
00c24c0c	ldr x23,[x19, #0x10]
00c24c10	mov x20,x0
00c24c14	sub x22,x24,x23
00c24c18	cmp x23,x28
00c24c1c	lsl x1,x22,#0x1
00c24c20	b.ne 0x00c24b74
00c24c24	mov x0,x1
00c24c28	bl 0x00c308d0
00c24c2c	cbz x0,0x00c24d4c
00c24c30	cmp x24,x28
00c24c34	b.eq 0x00c24c4c
00c24c38	mov x1,x23
00c24c3c	mov x2,x22
00c24c40	mov x24,x0
00c24c44	bl 0x00c2ff60
00c24c48	mov x0,x24
00c24c4c	str x0,[x19, #0x10]
00c24c50	b 0x00c24b84
00c24c54	add x8,x8,#0x2
00c24c58	str x8,[x19]
00c24c5c	cmp x8,x9
00c24c60	b.ne 0x00c24b18
00c24c64	mov x0,xzr
00c24c68	ldp x20,x19,[sp, #0x60]
00c24c6c	ldp x22,x21,[sp, #0x50]
00c24c70	ldp x24,x23,[sp, #0x40]
00c24c74	ldp x26,x25,[sp, #0x30]
00c24c78	ldp x28,x27,[sp, #0x20]
00c24c7c	ldp x29,x30,[sp, #0x10]
00c24c80	add sp,sp,#0x70
00c24c84	autiasp
00c24c88	ret
00c24c8c	mov w23,wzr
00c24c90	mov w9,#0x1
00c24c94	b 0x00c24cac
00c24c98	mov w23,#0x1
00c24c9c	mov w9,#0x2
00c24ca0	b 0x00c24cac
00c24ca4	mov w9,#0x2
00c24ca8	mov w23,#0x2
00c24cac	ldr x1,[sp, #0x8]
00c24cb0	add x8,x8,x9
00c24cb4	mov x0,x19
00c24cb8	str x8,[x19]
00c24cbc	bl 0x00c13140
00c24cc0	ldr x20,[x19, #0x1330]
00c24cc4	mov x21,x0
00c24cc8	mov x22,x1
00c24ccc	ldr x8,[x20, #0x8]
00c24cd0	sub x9,x8,#0xfb0
00c24cd4	cmn x9,#0xff1
00c24cd8	b.hi 0x00c24cf8
00c24cdc	mov w0,#0x1000
00c24ce0	bl 0x00c308d0
00c24ce4	cbz x0,0x00c24d54
00c24ce8	mov x8,xzr
00c24cec	stp x20,xzr,[x0]
00c24cf0	mov x20,x0
00c24cf4	str x0,[x19, #0x1330]
00c24cf8	add x9,x8,#0x40
00c24cfc	add x0,x20,x8
00c24d00	adrp x8,0xcb3000
00c24d04	add x8,x8,#0x9f8
00c24d08	str x9,[x20, #0x8]
00c24d0c	ldr x9,[sp]
00c24d10	str x8,[x0, #0x10]!
00c24d14	mov w8,#0x10
00c24d18	strb w8,[x0, #0x8]
00c24d1c	ldurh w8,[x0, #0x9]
00c24d20	stp x9,x21,[x0, #0x10]
00c24d24	and w8,w8,#0xf000
00c24d28	str x22,[x0, #0x20]
00c24d2c	orr w8,w8,#0x100
00c24d30	str w25,[x0, #0x28]
00c24d34	sturh w8,[x0, #0x9]
00c24d38	strb w23,[x0, #0x2c]
00c24d3c	str x26,[x0, #0x30]
00c24d40	b 0x00c24c68
00c24d44	bl 0x00c30b40
00c24d48	bl 0x00c30b40
00c24d4c	bl 0x00c30b40
00c24d50	bl 0x00c30b40
00c24d54	bl 0x00c2fff0
