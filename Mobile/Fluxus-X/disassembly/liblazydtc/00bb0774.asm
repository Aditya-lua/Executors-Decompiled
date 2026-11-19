; FUN_00bb0774 @ 00bb0774
00bb0774	sub sp,sp,#0x110
00bb0778	str d8,[sp, #0xa0]
00bb077c	stp x29,x30,[sp, #0xb0]
00bb0780	stp x28,x27,[sp, #0xc0]
00bb0784	stp x26,x25,[sp, #0xd0]
00bb0788	stp x24,x23,[sp, #0xe0]
00bb078c	stp x22,x21,[sp, #0xf0]
00bb0790	stp x20,x19,[sp, #0x100]
00bb0794	add x29,sp,#0xb0
00bb0798	mrs x28,tpidr_el0
00bb079c	mov w9,#0x74f8
00bb07a0	mov x21,x7
00bb07a4	ldr x8,[x28, #0x28]
00bb07a8	mov x19,x5
00bb07ac	mov x22,x0
00bb07b0	mov x20,x4
00bb07b4	mov x25,x3
00bb07b8	mov x23,x2
00bb07bc	mov x24,x1
00bb07c0	add x27,x0,x9
00bb07c4	stur x8,[x29, #-0x20]
00bb07c8	cbz x7,0x00bb07e4
00bb07cc	mov x0,x21
00bb07d0	bl 0x00c43570
00bb07d4	mov x19,x0
00bb07d8	mov x0,x21
00bb07dc	bl 0x00c43580
00bb07e0	mov x6,x0
00bb07e4	ldr w8,[x27, #0xa0]
00bb07e8	cmp w8,#0x0
00bb07ec	mov w8,#0x5
00bb07f0	csinc x8,x8,xzr,eq
00bb07f4	cset w9,eq
00bb07f8	cmp x20,x8
00bb07fc	b.cs 0x00bb0810
00bb0800	mov x26,x24
00bb0804	cbz x20,0x00bb0cb0
00bb0808	mov x0,#-0x48
00bb080c	b 0x00bb0cbc
00bb0810	adrp x10,0x29b000
00bb0814	str x19,[sp, #0x48]
00bb0818	mov w19,#0xd2a5
00bb081c	ldr d8,[x10, #0x7c8]
00bb0820	mov w12,wzr
00bb0824	movk w19,#0x184, LSL #16
00bb0828	mov x11,#-0x48
00bb082c	mov x26,x24
00bb0830	cmp x20,#0x4
00bb0834	cset w10,cc
00bb0838	orn w10,w10,w9
00bb083c	tbnz w10,#0x0,0x00bb0888
00bb0840	ldr w10,[x25]
00bb0844	cmp w19,w10, LSR #0x4
00bb0848	b.ne 0x00bb0888
00bb084c	cmp x20,#0x8
00bb0850	b.cc 0x00bb0808
00bb0854	ldr w10,[x25, #0x4]
00bb0858	cmn w10,#0x9
00bb085c	b.hi 0x00bb0cb8
00bb0860	add x10,x10,#0x8
00bb0864	cmp x10,x20
00bb0868	csel x0,x11,x10,hi
00bb086c	cmn x0,#0x78
00bb0870	b.hi 0x00bb0cbc
00bb0874	sub x20,x20,x0
00bb0878	add x25,x25,x0
00bb087c	cmp x20,x8
00bb0880	b.cs 0x00bb0830
00bb0884	b 0x00bb0804
00bb0888	mov x0,x22
00bb088c	str w12,[sp, #0x44]
00bb0890	str x6,[sp, #0x38]
00bb0894	cbz x21,0x00bb08a4
00bb0898	mov x1,x21
00bb089c	bl 0x00c43600
00bb08a0	b 0x00bb08b8
00bb08a4	ldr x1,[sp, #0x48]
00bb08a8	mov x2,x6
00bb08ac	bl 0x00c43610
00bb08b0	cmn x0,#0x78
00bb08b4	b.hi 0x00bb0cbc
00bb08b8	mov x0,x22
00bb08bc	mov x1,x26
00bb08c0	mov x2,x23
00bb08c4	bl 0x00c43630
00bb08c8	ldr w8,[x27, #0xa0]
00bb08cc	mov w10,#0x5
00bb08d0	mov w9,#0x9
00bb08d4	str x24,[sp, #0x30]
00bb08d8	cmp w8,#0x0
00bb08dc	csel x9,x9,x10,eq
00bb08e0	cmp x20,x9
00bb08e4	b.cs 0x00bb08f0
00bb08e8	mov x0,#-0x48
00bb08ec	b 0x00bb0b10
00bb08f0	cmp w8,#0x0
00bb08f4	adrp x12,0x364000
00bb08f8	add x12,x12,#0xd50
00bb08fc	csinc x8,x10,xzr,eq
00bb0900	add x9,x25,x8
00bb0904	ldurb w9,[x9, #-0x1]
00bb0908	and x10,x9,#0x3
00bb090c	lsr x11,x9,#0x6
00bb0910	cmp w9,#0x40
00bb0914	ldr x10,[x12, x10, LSL #0x3]
00bb0918	adrp x12,0x364000
00bb091c	add x12,x12,#0xe90
00bb0920	ldr x11,[x12, x11, LSL #0x3]
00bb0924	cset w12,cc
00bb0928	ands w9,w9,#0x20
00bb092c	add x8,x10,x8
00bb0930	and w9,w12,w9, LSR #0x5
00bb0934	add x8,x8,x11
00bb0938	cinc x8,x8,eq
00bb093c	add x0,x8,x9
00bb0940	cmn x0,#0x78
00bb0944	b.hi 0x00bb0b10
00bb0948	add x8,x0,#0x3
00bb094c	cmp x20,x8
00bb0950	b.cc 0x00bb08e8
00bb0954	mov x2,x0
00bb0958	mov x0,x22
00bb095c	mov x1,x25
00bb0960	str x2,[sp, #0x20]
00bb0964	bl 0x00bb14e4
00bb0968	cmn x0,#0x78
00bb096c	b.hi 0x00bb0b10
00bb0970	ldr w8,[x27, #0x120]
00bb0974	cbz w8,0x00bb0988
00bb0978	ldr w9,[x27]
00bb097c	cmp w9,w8
00bb0980	csel w8,w9,w8,cc
00bb0984	str w8,[x27]
00bb0988	ldr x8,[sp, #0x20]
00bb098c	add x2,sp,#0x50
00bb0990	add x0,x25,x8
00bb0994	sub x1,x20,x8
00bb0998	mov x24,x0
00bb099c	str x1,[sp, #0x28]
00bb09a0	bl 0x00c43620
00bb09a4	mov x2,x0
00bb09a8	cmn x0,#0x78
00bb09ac	b.hi 0x00bb0b0c
00bb09b0	add x8,x26,x23
00bb09b4	str x26,[sp, #0x18]
00bb09b8	str x8,[sp]
00bb09bc	ldr x8,[sp, #0x28]
00bb09c0	sub x8,x8,#0x3
00bb09c4	subs x8,x8,x2
00bb09c8	str x8,[sp, #0x28]
00bb09cc	b.cc 0x00bb08e8
00bb09d0	ldr x9,[sp]
00bb09d4	add x24,x24,#0x3
00bb09d8	ldr x10,[sp, #0x18]
00bb09dc	ldr w8,[sp, #0x50]
00bb09e0	str x2,[sp, #0x10]
00bb09e4	cmp x24,x9
00bb09e8	ccmp x24,x10,#0x0,cc
00bb09ec	csel x9,x24,x9,cs
00bb09f0	cmp w8,#0x2
00bb09f4	b.eq 0x00bb0a64
00bb09f8	cmp w8,#0x1
00bb09fc	b.eq 0x00bb0a30
00bb0a00	cbnz w8,0x00bb0b88
00bb0a04	ldr x8,[sp]
00bb0a08	sub x8,x8,x10
00bb0a0c	cmp x2,x8
00bb0a10	b.hi 0x00bb0b90
00bb0a14	cbz x10,0x00bb0a9c
00bb0a18	mov x0,x10
00bb0a1c	mov x1,x24
00bb0a20	bl 0x00c2ff60
00bb0a24	ldr x2,[sp, #0x10]
00bb0a28	mov x0,x2
00bb0a2c	b 0x00bb0aa4
00bb0a30	ldr w8,[sp, #0x58]
00bb0a34	sub x9,x9,x10
00bb0a38	cmp x9,x8
00bb0a3c	b.cc 0x00bb0b90
00bb0a40	cbz x10,0x00bb0a90
00bb0a44	ldrb w1,[x24]
00bb0a48	mov x0,x10
00bb0a4c	mov x2,x8
00bb0a50	str x8,[sp, #0x20]
00bb0a54	bl 0x00c301c0
00bb0a58	ldr x0,[sp, #0x20]
00bb0a5c	ldr x2,[sp, #0x10]
00bb0a60	b 0x00bb0aa4
00bb0a64	ldr x4,[sp, #0x10]
00bb0a68	sub x2,x9,x10
00bb0a6c	mov x0,x22
00bb0a70	mov x1,x10
00bb0a74	mov x3,x24
00bb0a78	mov w5,wzr
00bb0a7c	bl 0x00c43640
00bb0a80	ldr x2,[sp, #0x10]
00bb0a84	cmn x0,#0x78
00bb0a88	b.ls 0x00bb0aa4
00bb0a8c	b 0x00bb0b10
00bb0a90	cbnz w8,0x00bb0bb8
00bb0a94	ldr x2,[sp, #0x10]
00bb0a98	b 0x00bb0aa0
00bb0a9c	cbnz x2,0x00bb0bb8
00bb0aa0	mov x0,xzr
00bb0aa4	str x24,[sp, #0x8]
00bb0aa8	ldr w8,[x27, #0xa8]
00bb0aac	ldr x24,[sp, #0x18]
00bb0ab0	cbz w8,0x00bb0ad4
00bb0ab4	str x0,[sp, #0x20]
00bb0ab8	mov w8,#0x7538
00bb0abc	mov x1,x24
00bb0ac0	ldr x2,[sp, #0x20]
00bb0ac4	add x0,x22,x8
00bb0ac8	bl 0x00c43650
00bb0acc	ldr x2,[sp, #0x10]
00bb0ad0	ldr x0,[sp, #0x20]
00bb0ad4	ldr x9,[sp, #0x8]
00bb0ad8	ldr w8,[sp, #0x54]
00bb0adc	add x24,x24,x0
00bb0ae0	add x0,x9,x2
00bb0ae4	cbnz w8,0x00bb0b6c
00bb0ae8	ldr x1,[sp, #0x28]
00bb0aec	add x2,sp,#0x50
00bb0af0	str x24,[sp, #0x18]
00bb0af4	mov x24,x0
00bb0af8	bl 0x00c43620
00bb0afc	mov x2,x0
00bb0b00	cmn x0,#0x77
00bb0b04	b.cc 0x00bb09bc
00bb0b08	b 0x00bb0b10
00bb0b0c	mov x0,x2
00bb0b10	mov x24,x0
00bb0b14	bl 0x00c43660
00bb0b18	cmp w0,#0xa
00bb0b1c	ldr w9,[sp, #0x44]
00bb0b20	cset w8,eq
00bb0b24	and w8,w8,w9
00bb0b28	tbnz w8,#0x0,0x00bb0808
00bb0b2c	mov x0,x24
00bb0b30	cmn x24,#0x78
00bb0b34	b.hi 0x00bb0cbc
00bb0b38	ldr w8,[x27, #0xa0]
00bb0b3c	ldp x24,x6,[sp, #0x30]
00bb0b40	add x26,x26,x0
00bb0b44	sub x23,x23,x0
00bb0b48	mov w12,#0x1
00bb0b4c	cmp w8,#0x0
00bb0b50	mov w8,#0x5
00bb0b54	mov x11,#-0x48
00bb0b58	csinc x8,x8,xzr,eq
00bb0b5c	cset w9,eq
00bb0b60	cmp x20,x8
00bb0b64	b.cs 0x00bb0830
00bb0b68	b 0x00bb0804
00bb0b6c	ldr x8,[x22, #0x74e8]
00bb0b70	mov x11,x0
00bb0b74	sub x0,x24,x26
00bb0b78	cmn x8,#0x1
00bb0b7c	b.eq 0x00bb0b98
00bb0b80	cmp x0,x8
00bb0b84	b.eq 0x00bb0b98
00bb0b88	mov x0,#-0x14
00bb0b8c	b 0x00bb0b10
00bb0b90	mov x0,#-0x46
00bb0b94	b 0x00bb0b10
00bb0b98	ldr w8,[x27, #0x10]
00bb0b9c	cbz w8,0x00bb0bc0
00bb0ba0	ldr x8,[sp, #0x28]
00bb0ba4	mov w9,#0x7538
00bb0ba8	subs x10,x8,#0x4
00bb0bac	b.cs 0x00bb0bc8
00bb0bb0	mov x0,#-0x16
00bb0bb4	b 0x00bb0b10
00bb0bb8	mov x0,#-0x4a
00bb0bbc	b 0x00bb0b10
00bb0bc0	ldr x20,[sp, #0x28]
00bb0bc4	b 0x00bb0c08
00bb0bc8	ldr w8,[x27, #0xa4]
00bb0bcc	cbnz w8,0x00bb0c00
00bb0bd0	stp x0,x11,[sp, #0x20]
00bb0bd4	add x0,x22,x9
00bb0bd8	mov x24,x10
00bb0bdc	bl 0x00c43670
00bb0be0	mov x10,x24
00bb0be4	ldr x24,[sp, #0x28]
00bb0be8	mov x8,x0
00bb0bec	ldr x0,[sp, #0x20]
00bb0bf0	ldr w9,[x24]
00bb0bf4	mov x11,x24
00bb0bf8	cmp w9,w8
00bb0bfc	b.ne 0x00bb0bb0
00bb0c00	add x11,x11,#0x4
00bb0c04	mov x20,x10
00bb0c08	adrp x8,0xcb5000
00bb0c0c	ldr x8,[x8, #0xac8]
00bb0c10	cbz x8,0x00bb0ca8
00bb0c14	add x8,x22,#0x10, LSL #12
00bb0c18	ldr x8,[x8, #0x76e0]
00bb0c1c	cbz x8,0x00bb0ca8
00bb0c20	movi v0.2D,#0x0
00bb0c24	ldr x9,[x22, #0x75f0]
00bb0c28	add x10,sp,#0x50
00bb0c2c	str d8,[sp, #0x50]
00bb0c30	stur q0,[x10, #0x28]
00bb0c34	stur q0,[x10, #0x18]
00bb0c38	stur q0,[x10, #0x8]
00bb0c3c	cbz x9,0x00bb0c80
00bb0c40	str x0,[sp, #0x20]
00bb0c44	mov x0,x9
00bb0c48	mov x24,x11
00bb0c4c	bl 0x00c435d0
00bb0c50	ldr x8,[x22, #0x75f0]
00bb0c54	str w0,[sp, #0x58]
00bb0c58	mov x0,x8
00bb0c5c	bl 0x00c43580
00bb0c60	mov x8,x0
00bb0c64	ldr x0,[sp, #0x20]
00bb0c68	ldr w9,[x27, #0x104]
00bb0c6c	str x8,[sp, #0x60]
00bb0c70	add x8,x22,#0x10, LSL #12
00bb0c74	mov x11,x24
00bb0c78	ldr x8,[x8, #0x76e0]
00bb0c7c	str w9,[sp, #0x5c]
00bb0c80	sub x9,x11,x25
00bb0c84	add x1,sp,#0x50
00bb0c88	mov x24,x0
00bb0c8c	stp x0,x9,[sp, #0x68]
00bb0c90	mov x0,x8
00bb0c94	mov x25,x11
00bb0c98	str x22,[sp, #0x88]
00bb0c9c	bl 0x00c43680
00bb0ca0	mov x0,x24
00bb0ca4	b 0x00bb0b10
00bb0ca8	mov x25,x11
00bb0cac	b 0x00bb0b10
00bb0cb0	sub x0,x26,x24
00bb0cb4	b 0x00bb0cbc
00bb0cb8	mov x0,#-0xe
00bb0cbc	ldr x8,[x28, #0x28]
00bb0cc0	ldur x9,[x29, #-0x20]
00bb0cc4	cmp x8,x9
00bb0cc8	b.ne 0x00bb0cf0
00bb0ccc	ldp x20,x19,[sp, #0x100]
00bb0cd0	ldr d8,[sp, #0xa0]
00bb0cd4	ldp x22,x21,[sp, #0xf0]
00bb0cd8	ldp x24,x23,[sp, #0xe0]
00bb0cdc	ldp x26,x25,[sp, #0xd0]
00bb0ce0	ldp x28,x27,[sp, #0xc0]
00bb0ce4	ldp x29,x30,[sp, #0xb0]
00bb0ce8	add sp,sp,#0x110
00bb0cec	ret
00bb0cf0	bl 0x00c2fec0
