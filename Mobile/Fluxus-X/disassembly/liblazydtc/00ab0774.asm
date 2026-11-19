; ASN1_item_sign_ctx @ 00ab0774
00ab0774	sub sp,sp,#0x190
00ab0778	stp x22,x21,[sp, #0x160]
00ab077c	stp x29,x30,[sp, #0x180]
00ab0780	add x29,sp,#0x180
00ab0784	mov x22,x0
00ab0788	mov x0,x5
00ab078c	str x28,[sp, #0x130]
00ab0790	stp x26,x25,[sp, #0x140]
00ab0794	stp x24,x23,[sp, #0x150]
00ab0798	stp x20,x19,[sp, #0x170]
00ab079c	mov x20,x5
00ab07a0	mov x21,x4
00ab07a4	mov x19,x3
00ab07a8	mov x23,x2
00ab07ac	mov x24,x1
00ab07b0	stp x2,x1,[x29, #-0x60]
00ab07b4	stp xzr,xzr,[x29, #-0x70]
00ab07b8	stur xzr,[x29, #-0x78]
00ab07bc	bl 0x00c34c00
00ab07c0	mov x26,x0
00ab07c4	mov x0,x20
00ab07c8	bl 0x00c36dc0
00ab07cc	bl 0x00c39b60
00ab07d0	cbz x0,0x00ab0820
00ab07d4	ldr x8,[x0, #0x8]
00ab07d8	mov x25,x0
00ab07dc	cbz x8,0x00ab083c
00ab07e0	ldr x8,[x8, #0xd0]
00ab07e4	cbz x8,0x00ab0960
00ab07e8	mov x0,x20
00ab07ec	mov x1,x22
00ab07f0	mov x2,x21
00ab07f4	mov x3,x24
00ab07f8	mov x4,x23
00ab07fc	mov x5,x19
00ab0800	blr x8
00ab0804	cmp w0,#0x1
00ab0808	b.ne 0x00ab0950
00ab080c	ldrsw x8,[x19]
00ab0810	mov x21,xzr
00ab0814	mov x22,xzr
00ab0818	stur x8,[x29, #-0x70]
00ab081c	b 0x00ab09cc
00ab0820	bl 0x00c342a0
00ab0824	adrp x0,0x2dc000
00ab0828	adrp x2,0x2be000
00ab082c	add x0,x0,#0x798
00ab0830	add x2,x2,#0x169
00ab0834	mov w1,#0xa6
00ab0838	b 0x00ab09b0
00ab083c	mov x0,x20
00ab0840	bl 0x00c36dc0
00ab0844	cbz x0,0x00ab097c
00ab0848	ldr w8,[x0]
00ab084c	mov x25,x0
00ab0850	sub w9,w8,#0x10
00ab0854	cmp w9,#0x30
00ab0858	b.hi 0x00ab0874
00ab085c	mov w10,#0x1
00ab0860	lsl x9,x10,x9
00ab0864	mov x10,#0x1000000010000
00ab0868	movk x10,#0x1
00ab086c	tst x9,x10
00ab0870	b.ne 0x00ab0884
00ab0874	cmp w8,#0x80
00ab0878	b.eq 0x00ab0884
00ab087c	cmp w8,#0x100
00ab0880	b.ne 0x00ab097c
00ab0884	adrp x0,0x2ca000
00ab0888	add x0,x0,#0x1b4
00ab088c	add x8,sp,#0x8
00ab0890	add x1,sp,#0x30
00ab0894	mov w2,#0x80
00ab0898	add x26,sp,#0xb0
00ab089c	bl 0x00c34c50
00ab08a0	ldr x8,[sp, #0x28]
00ab08a4	ldur q0,[sp, #0x8]
00ab08a8	ldur q1,[sp, #0x18]
00ab08ac	str x8,[sp, #0xd0]
00ab08b0	add x8,sp,#0x8
00ab08b4	stp q0,q1,[x26]
00ab08b8	bl 0x00c34c40
00ab08bc	ldr x8,[sp, #0x28]
00ab08c0	ldur q0,[sp, #0x18]
00ab08c4	ldur q1,[sp, #0x8]
00ab08c8	add x1,sp,#0xb0
00ab08cc	mov x0,x25
00ab08d0	str x8,[sp, #0xf8]
00ab08d4	stur q0,[x26, #0x38]
00ab08d8	stur q1,[x26, #0x28]
00ab08dc	bl 0x00c3d000
00ab08e0	cmp w0,#0x1
00ab08e4	b.lt 0x00ab09c4
00ab08e8	ldr x25,[sp, #0xd0]
00ab08ec	cbz x25,0x00ab0bf8
00ab08f0	cbz x24,0x00ab0914
00ab08f4	add x8,sp,#0x30
00ab08f8	sub x0,x29,#0x58
00ab08fc	add x1,sp,#0x8
00ab0900	mov x2,x25
00ab0904	str x8,[sp, #0x8]
00ab0908	bl 0x00c38260
00ab090c	cbz x0,0x00ab0c54
00ab0910	ldur x23,[x29, #-0x60]
00ab0914	cbz x23,0x00ab0aa0
00ab0918	add x8,sp,#0x30
00ab091c	sub x0,x29,#0x60
00ab0920	add x1,sp,#0x8
00ab0924	mov x2,x25
00ab0928	str x8,[sp, #0x8]
00ab092c	bl 0x00c38260
00ab0930	cbnz x0,0x00ab0aa0
00ab0934	bl 0x00c342a0
00ab0938	adrp x0,0x2dc000
00ab093c	adrp x2,0x2be000
00ab0940	add x0,x0,#0x798
00ab0944	add x2,x2,#0x169
00ab0948	mov w1,#0xd0
00ab094c	b 0x00ab0b64
00ab0950	cmp w0,#0x0
00ab0954	b.le 0x00ab0b78
00ab0958	cmp w0,#0x2
00ab095c	b.ne 0x00ab0aa0
00ab0960	cbz x26,0x00ab0998
00ab0964	mov x0,x25
00ab0968	bl 0x00c324b0
00ab096c	cmp w0,#0x494
00ab0970	b.ne 0x00ab0a20
00ab0974	mov w23,#0x494
00ab0978	b 0x00ab0a28
00ab097c	bl 0x00c342a0
00ab0980	adrp x0,0x2dc000
00ab0984	adrp x2,0x2be000
00ab0988	add x0,x0,#0x798
00ab098c	add x2,x2,#0x169
00ab0990	mov w1,#0xb2
00ab0994	b 0x00ab09b0
00ab0998	bl 0x00c342a0
00ab099c	adrp x0,0x2dc000
00ab09a0	adrp x2,0x2be000
00ab09a4	add x0,x0,#0x798
00ab09a8	add x2,x2,#0x169
00ab09ac	mov w1,#0xeb
00ab09b0	bl 0x00c342b0
00ab09b4	mov w0,#0xd
00ab09b8	mov w1,#0xd9
00ab09bc	mov x2,xzr
00ab09c0	bl 0x00c342c0
00ab09c4	mov x21,xzr
00ab09c8	mov x22,xzr
00ab09cc	ldur x0,[x29, #-0x68]
00ab09d0	adrp x19,0x2dc000
00ab09d4	add x19,x19,#0x798
00ab09d8	mov w3,#0x12a
00ab09dc	mov x1,x21
00ab09e0	mov x2,x19
00ab09e4	bl 0x00c345e0
00ab09e8	ldur x1,[x29, #-0x78]
00ab09ec	mov w3,#0x12b
00ab09f0	mov x0,x22
00ab09f4	mov x2,x19
00ab09f8	bl 0x00c345e0
00ab09fc	ldur w0,[x29, #-0x70]
00ab0a00	ldp x29,x30,[sp, #0x180]
00ab0a04	ldp x20,x19,[sp, #0x170]
00ab0a08	ldp x22,x21,[sp, #0x160]
00ab0a0c	ldp x24,x23,[sp, #0x150]
00ab0a10	ldp x26,x25,[sp, #0x140]
00ab0a14	ldr x28,[sp, #0x130]
00ab0a18	add sp,sp,#0x190
00ab0a1c	ret
00ab0a20	ldr x8,[x25, #0x8]
00ab0a24	ldr w23,[x8]
00ab0a28	mov x0,x26
00ab0a2c	bl 0x00c34c30
00ab0a30	mov w1,w0
00ab0a34	add x0,sp,#0x30
00ab0a38	mov w2,w23
00ab0a3c	bl 0x00c3ee10
00ab0a40	cbz w0,0x00ab0ba4
00ab0a44	ldr x8,[x25, #0x8]
00ab0a48	ldur x24,[x29, #-0x58]
00ab0a4c	ldrb w8,[x8, #0x8]
00ab0a50	tst w8,#0x4
00ab0a54	mov w8,#0x5
00ab0a58	csinv w23,w8,wzr,ne
00ab0a5c	cbz x24,0x00ab0a7c
00ab0a60	ldr w0,[sp, #0x30]
00ab0a64	bl 0x00c37740
00ab0a68	mov x1,x0
00ab0a6c	mov x0,x24
00ab0a70	mov w2,w23
00ab0a74	mov x3,xzr
00ab0a78	bl 0x00c37ee0
00ab0a7c	ldur x24,[x29, #-0x60]
00ab0a80	cbz x24,0x00ab0aa0
00ab0a84	ldr w0,[sp, #0x30]
00ab0a88	bl 0x00c37740
00ab0a8c	mov x1,x0
00ab0a90	mov x0,x24
00ab0a94	mov w2,w23
00ab0a98	mov x3,xzr
00ab0a9c	bl 0x00c37ee0
00ab0aa0	sub x1,x29,#0x68
00ab0aa4	mov x0,x21
00ab0aa8	mov x2,x22
00ab0aac	bl 0x00c36170
00ab0ab0	cmp w0,#0x0
00ab0ab4	b.le 0x00ab0b48
00ab0ab8	ldur x3,[x29, #-0x68]
00ab0abc	sxtw x21,w0
00ab0ac0	sub x2,x29,#0x78
00ab0ac4	mov x0,x20
00ab0ac8	mov x1,xzr
00ab0acc	mov x4,x21
00ab0ad0	bl 0x00c36fb0
00ab0ad4	cbz w0,0x00ab0bc0
00ab0ad8	ldur x0,[x29, #-0x78]
00ab0adc	adrp x1,0x2dc000
00ab0ae0	add x1,x1,#0x798
00ab0ae4	mov w2,#0x113
00ab0ae8	stur x0,[x29, #-0x70]
00ab0aec	bl 0x00c32320
00ab0af0	mov x22,x0
00ab0af4	cbz x0,0x00ab0c20
00ab0af8	ldur x3,[x29, #-0x68]
00ab0afc	cbz x3,0x00ab0c20
00ab0b00	sub x2,x29,#0x70
00ab0b04	mov x0,x20
00ab0b08	mov x1,x22
00ab0b0c	mov x4,x21
00ab0b10	bl 0x00c36fb0
00ab0b14	cbz w0,0x00ab0c70
00ab0b18	ldr x0,[x19, #0x8]
00ab0b1c	adrp x1,0x2dc000
00ab0b20	add x1,x1,#0x798
00ab0b24	mov w2,#0x11f
00ab0b28	bl 0x00c32310
00ab0b2c	ldr x8,[x19, #0x10]
00ab0b30	ldur x9,[x29, #-0x70]
00ab0b34	and x8,x8,#-0x10
00ab0b38	orr x8,x8,#0x8
00ab0b3c	str w9,[x19]
00ab0b40	stp x22,x8,[x19, #0x8]
00ab0b44	b 0x00ab09c8
00ab0b48	stur xzr,[x29, #-0x70]
00ab0b4c	bl 0x00c342a0
00ab0b50	adrp x0,0x2dc000
00ab0b54	adrp x2,0x2be000
00ab0b58	add x0,x0,#0x798
00ab0b5c	add x2,x2,#0x169
00ab0b60	mov w1,#0x109
00ab0b64	bl 0x00c342b0
00ab0b68	mov w1,#0x103
00ab0b6c	mov w0,#0xd
00ab0b70	movk w1,#0xc, LSL #16
00ab0b74	b 0x00ab09bc
00ab0b78	bl 0x00c342a0
00ab0b7c	adrp x0,0x2dc000
00ab0b80	adrp x2,0x2be000
00ab0b84	add x0,x0,#0x798
00ab0b88	add x2,x2,#0x169
00ab0b8c	mov w1,#0xe2
00ab0b90	bl 0x00c342b0
00ab0b94	mov w1,#0x6
00ab0b98	mov w0,#0xd
00ab0b9c	movk w1,#0x8, LSL #16
00ab0ba0	b 0x00ab09bc
00ab0ba4	bl 0x00c342a0
00ab0ba8	adrp x0,0x2dc000
00ab0bac	adrp x2,0x2be000
00ab0bb0	add x0,x0,#0x798
00ab0bb4	add x2,x2,#0x169
00ab0bb8	mov w1,#0xf6
00ab0bbc	b 0x00ab0c10
00ab0bc0	stur xzr,[x29, #-0x70]
00ab0bc4	bl 0x00c342a0
00ab0bc8	adrp x0,0x2dc000
00ab0bcc	adrp x2,0x2be000
00ab0bd0	add x0,x0,#0x798
00ab0bd4	add x2,x2,#0x169
00ab0bd8	mov w1,#0x10f
00ab0bdc	bl 0x00c342b0
00ab0be0	mov w1,#0x6
00ab0be4	mov w0,#0xd
00ab0be8	movk w1,#0x8, LSL #16
00ab0bec	mov x2,xzr
00ab0bf0	bl 0x00c342c0
00ab0bf4	b 0x00ab09c8
00ab0bf8	bl 0x00c342a0
00ab0bfc	adrp x0,0x2dc000
00ab0c00	adrp x2,0x2be000
00ab0c04	add x0,x0,#0x798
00ab0c08	add x2,x2,#0x169
00ab0c0c	mov w1,#0xbf
00ab0c10	bl 0x00c342b0
00ab0c14	mov w0,#0xd
00ab0c18	mov w1,#0xc6
00ab0c1c	b 0x00ab09bc
00ab0c20	stur xzr,[x29, #-0x70]
00ab0c24	bl 0x00c342a0
00ab0c28	adrp x0,0x2dc000
00ab0c2c	adrp x2,0x2be000
00ab0c30	add x0,x0,#0x798
00ab0c34	add x2,x2,#0x169
00ab0c38	mov w1,#0x116
00ab0c3c	bl 0x00c342b0
00ab0c40	mov w8,#0x103
00ab0c44	movk w8,#0xc, LSL #16
00ab0c48	sub w1,w8,#0x3
00ab0c4c	mov w0,#0xd
00ab0c50	b 0x00ab0c9c
00ab0c54	bl 0x00c342a0
00ab0c58	adrp x0,0x2dc000
00ab0c5c	adrp x2,0x2be000
00ab0c60	add x0,x0,#0x798
00ab0c64	add x2,x2,#0x169
00ab0c68	mov w1,#0xc7
00ab0c6c	b 0x00ab0b64
00ab0c70	stur xzr,[x29, #-0x70]
00ab0c74	bl 0x00c342a0
00ab0c78	adrp x0,0x2dc000
00ab0c7c	adrp x2,0x2be000
00ab0c80	add x0,x0,#0x798
00ab0c84	add x2,x2,#0x169
00ab0c88	mov w1,#0x11c
00ab0c8c	bl 0x00c342b0
00ab0c90	mov w1,#0x6
00ab0c94	mov w0,#0xd
00ab0c98	movk w1,#0x8, LSL #16
00ab0c9c	mov x2,xzr
00ab0ca0	bl 0x00c342c0
00ab0ca4	b 0x00ab09cc
