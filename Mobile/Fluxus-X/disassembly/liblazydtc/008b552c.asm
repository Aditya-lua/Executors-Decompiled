; FUN_008b552c @ 008b552c
008b552c	sub sp,sp,#0xa0
008b5530	stp x29,x30,[sp, #0x40]
008b5534	stp x28,x27,[sp, #0x50]
008b5538	stp x26,x25,[sp, #0x60]
008b553c	stp x24,x23,[sp, #0x70]
008b5540	stp x22,x21,[sp, #0x80]
008b5544	stp x20,x19,[sp, #0x90]
008b5548	add x29,sp,#0x40
008b554c	mrs x27,tpidr_el0
008b5550	mov x22,x1
008b5554	mov x19,x0
008b5558	ldr x8,[x27, #0x28]
008b555c	mov x21,xzr
008b5560	stur x8,[x29, #-0x8]
008b5564	ldr x20,[x0, #0x60]
008b5568	ldrb w8,[x20, #0x1]
008b556c	cmp w8,#0x1
008b5570	b.le 0x008b55dc
008b5574	cmp w8,#0x4
008b5578	b.eq 0x008b5640
008b557c	cmp w8,#0x3
008b5580	b.eq 0x008b5668
008b5584	cmp w8,#0x2
008b5588	b.ne 0x008b5f9c
008b558c	ldr x9,[x20, #0x58]
008b5590	mov x21,xzr
008b5594	cmp x9,#0x0
008b5598	cset w8,ne
008b559c	cbz x9,0x008b55cc
008b55a0	cbz x22,0x008b55cc
008b55a4	mov x21,xzr
008b55a8	mov x0,x20
008b55ac	bl 0x008b64ec
008b55b0	ldr x9,[x20, #0x58]
008b55b4	add x21,x0,x21
008b55b8	cmp x9,#0x0
008b55bc	cset w8,ne
008b55c0	cbz x9,0x008b55cc
008b55c4	cmp x21,x22
008b55c8	b.cc 0x008b55a8
008b55cc	tbnz w8,#0x0,0x008b5f9c
008b55d0	mov w8,#0x3
008b55d4	strb w8,[x20, #0x1]
008b55d8	b 0x008b5f9c
008b55dc	cbz w8,0x008b56dc
008b55e0	cmp w8,#0x1
008b55e4	b.ne 0x008b5f9c
008b55e8	ldr x9,[x20, #0x58]
008b55ec	mov x21,xzr
008b55f0	cmp x9,#0x0
008b55f4	cset w8,ne
008b55f8	cbz x9,0x008b5628
008b55fc	cbz x22,0x008b5628
008b5600	mov x21,xzr
008b5604	mov x0,x20
008b5608	bl 0x008b64ec
008b560c	ldr x9,[x20, #0x58]
008b5610	add x21,x0,x21
008b5614	cmp x9,#0x0
008b5618	cset w8,ne
008b561c	cbz x9,0x008b5628
008b5620	cmp x21,x22
008b5624	b.cc 0x008b5604
008b5628	tbnz w8,#0x0,0x008b5f9c
008b562c	ldr x8,[x20, #0x60]
008b5630	stp x8,xzr,[x20, #0x58]
008b5634	mov w8,#0x2
008b5638	strb w8,[x20, #0x1]
008b563c	b 0x008b5f9c
008b5640	adrp x8,0xd1f000
008b5644	add x8,x8,#0x5f8
008b5648	ldrb w8,[x8]
008b564c	tbz w8,#0x0,0x008b56ec
008b5650	mov x21,xzr
008b5654	cbz x22,0x008b5f9c
008b5658	mov w8,#0x2f08
008b565c	add x28,x20,x8
008b5660	stp x28,x27,[sp]
008b5664	b 0x008b5820
008b5668	bl 0x008b97ec
008b566c	ldr x8,[x20, #0x10]
008b5670	str d0,[x20, #0x5578]
008b5674	str x8,[x20, #0x5558]
008b5678	ldr x20,[x19, #0x60]
008b567c	ldr x22,[x20, #0x1d0]
008b5680	add x23,x20,#0x1b8
008b5684	cmp x22,x23
008b5688	b.eq 0x008b59f8
008b568c	mov x21,xzr
008b5690	b 0x008b56a4
008b5694	ldr x22,[x22, #0x18]
008b5698	add x21,x21,#0x28
008b569c	cmp x22,x23
008b56a0	b.eq 0x008b59fc
008b56a4	ldrb w8,[x22, #0x2]
008b56a8	tst w8,#0x7
008b56ac	b.ne 0x008b5694
008b56b0	ldr x8,[x22, #0x8]
008b56b4	ldr w9,[x8, #0xc]
008b56b8	cmp w9,#0x5
008b56bc	b.lt 0x008b5694
008b56c0	ldr x1,[x8]
008b56c4	ldrb w8,[x1, #0x2]
008b56c8	tst w8,#0x3
008b56cc	b.eq 0x008b5694
008b56d0	mov x0,x20
008b56d4	bl 0x008b61bc
008b56d8	b 0x008b5694
008b56dc	mov x0,x19
008b56e0	bl 0x008b5fd4
008b56e4	mov x21,xzr
008b56e8	b 0x008b5f9c
008b56ec	ldr x23,[x20, #0x1e8]
008b56f0	mov x21,xzr
008b56f4	cbz x23,0x008b5730
008b56f8	cbz x22,0x008b5730
008b56fc	mov x21,xzr
008b5700	mov x0,x23
008b5704	bl 0x008b87e4
008b5708	ldr x1,[x20, #0x1e8]
008b570c	mov x23,x0
008b5710	mov x0,x19
008b5714	bl 0x008b6de4
008b5718	lsl w8,w0,#0x4
008b571c	str x23,[x20, #0x1e8]
008b5720	add x21,x21,w8, SXTW 
008b5724	cbz x23,0x008b5730
008b5728	cmp x21,x22
008b572c	b.cc 0x008b5700
008b5730	ldr x9,[x20, #0x4c0]
008b5734	mov x8,x9
008b5738	cbz x9,0x008b5780
008b573c	cmp x21,x22
008b5740	b.cs 0x008b5780
008b5744	mov x23,x8
008b5748	mov x0,x23
008b574c	bl 0x008b87e4
008b5750	ldr x1,[x20, #0x4c0]
008b5754	mov x23,x0
008b5758	mov x0,x19
008b575c	bl 0x008b6de4
008b5760	lsl w8,w0,#0x4
008b5764	str x23,[x20, #0x4c0]
008b5768	add x21,x21,w8, SXTW 
008b576c	cbz x23,0x008b5778
008b5770	cmp x21,x22
008b5774	b.cc 0x008b5748
008b5778	mov x8,x23
008b577c	ldr x23,[x20, #0x1e8]
008b5780	orr x8,x8,x23
008b5784	cbnz x8,0x008b5f9c
008b5788	ldr x8,[x20, #0x1e0]
008b578c	ldrb w10,[x20, #0x2]
008b5790	ldrb w9,[x8, #0x2]
008b5794	and w9,w9,#0xf8
008b5798	bfxil w9,w10,#0x0,#0x2
008b579c	strb w9,[x8, #0x2]
008b57a0	ldr x9,[x19, #0x60]
008b57a4	ldr w8,[x9, #0x2c]
008b57a8	add w10,w8,#0x3
008b57ac	cmp w8,#0x0
008b57b0	csel w10,w10,w8,lt
008b57b4	cmp w8,#0x41
008b57b8	b.lt 0x008b57e8
008b57bc	ldr w9,[x9, #0x40]
008b57c0	asr w10,w10,#0x2
008b57c4	cmp w9,w10
008b57c8	b.cs 0x008b57e8
008b57cc	lsr w8,w8,#0x1
008b57d0	nop
008b57d4	adr x1,0x8b71fc
008b57d8	add x2,sp,#0x18
008b57dc	mov x0,x19
008b57e0	str w8,[sp, #0x18]
008b57e4	bl 0x008b3edc
008b57e8	adrp x8,0xd1f000
008b57ec	strb wzr,[x20, #0x1]
008b57f0	ldrb w8,[x8, #0x4f8]
008b57f4	cmp w8,#0x1
008b57f8	b.ne 0x008b5f9c
008b57fc	ldr x8,[x20, #0x728]
008b5800	cbz x8,0x008b5f9c
008b5804	ldr x0,[x20, #0x1e0]
008b5808	blr x8
008b580c	b 0x008b5f9c
008b5810	add w8,w26,#0x1
008b5814	str w8,[x20, #0x3840]
008b5818	cmp x21,x22
008b581c	b.cs 0x008b5f9c
008b5820	ldr x23,[x20, #0x1e8]
008b5824	cbz x23,0x008b585c
008b5828	mov x0,x23
008b582c	bl 0x008b87e4
008b5830	ldr x1,[x20, #0x1e8]
008b5834	mov x23,x0
008b5838	mov x0,x19
008b583c	bl 0x008b6de4
008b5840	lsl w8,w0,#0x4
008b5844	str x23,[x20, #0x1e8]
008b5848	add x21,x21,w8, SXTW 
008b584c	cbz x23,0x008b5818
008b5850	cmp x21,x22
008b5854	b.cc 0x008b5828
008b5858	b 0x008b5818
008b585c	ldr x23,[x20, #0x4c0]
008b5860	cbz x23,0x008b5898
008b5864	mov x0,x23
008b5868	bl 0x008b87e4
008b586c	ldr x1,[x20, #0x4c0]
008b5870	mov x23,x0
008b5874	mov x0,x19
008b5878	bl 0x008b6de4
008b587c	lsl w8,w0,#0x4
008b5880	str x23,[x20, #0x4c0]
008b5884	add x21,x21,w8, SXTW 
008b5888	cbz x23,0x008b5818
008b588c	cmp x21,x22
008b5890	b.cc 0x008b5864
008b5894	b 0x008b5818
008b5898	ldrsw x26,[x20, #0x3840]
008b589c	cmp w26,#0x7
008b58a0	b.gt 0x008b5788
008b58a4	mov w8,#0x150
008b58a8	smull x24,w26,w8
008b58ac	ldr x23,[x28, x24#0x0]
008b58b0	cbz x23,0x008b5810
008b58b4	str x24,[sp, #0x10]
008b58b8	mov x0,x23
008b58bc	bl 0x008b87e4
008b58c0	cmp w26,#0x5
008b58c4	mov x23,x0
008b58c8	b.eq 0x008b58e4
008b58cc	cmn w26,#0x6
008b58d0	b.ne 0x008b59b4
008b58d4	ldr x1,[x28, x24#0x0]
008b58d8	mov x0,x19
008b58dc	bl 0x008b6de4
008b58e0	b 0x008b59dc
008b58e4	ldr x25,[x28, x24#0x0]
008b58e8	add x1,sp,#0x18
008b58ec	sub x2,x29,#0x10
008b58f0	sub x3,x29,#0x14
008b58f4	sub x4,x29,#0x18
008b58f8	mov x0,x25
008b58fc	bl 0x008b8780
008b5900	ldr x24,[sp, #0x18]
008b5904	ldur x8,[x29, #-0x10]
008b5908	cmp x24,x8
008b590c	b.eq 0x008b59c8
008b5910	ldr x8,[x19, #0x60]
008b5914	ldrb w8,[x8, #0x2]
008b5918	eor w28,w8,#0x3
008b591c	and w27,w8,#0x3
008b5920	b 0x008b5944
008b5924	and w8,w8,#0xf8
008b5928	orr w8,w8,w27
008b592c	strb w8,[x24, #0x2]
008b5930	ldursw x8,[x29, #-0x18]
008b5934	ldur x9,[x29, #-0x10]
008b5938	add x24,x24,x8
008b593c	cmp x24,x9
008b5940	b.eq 0x008b59bc
008b5944	ldrb w8,[x24]
008b5948	cbz w8,0x008b5930
008b594c	ldrb w8,[x24, #0x2]
008b5950	eor w9,w8,#0x3
008b5954	tst w9,w28
008b5958	b.ne 0x008b5924
008b595c	adrp x8,0xcb4000
008b5960	mov x0,x19
008b5964	mov x1,x24
008b5968	ldr x8,[x8, #0xbb0]
008b596c	mov x2,x25
008b5970	ldrb w8,[x8]
008b5974	cmp w8,#0x1
008b5978	b.ne 0x008b5984
008b597c	bl 0x008af3b4
008b5980	b 0x008b5988
008b5984	bl 0x008b6448
008b5988	ldur w8,[x29, #-0x14]
008b598c	subs w8,w8,#0x1
008b5990	stur w8,[x29, #-0x14]
008b5994	b.ne 0x008b5930
008b5998	ldr w8,[sp, #0x18]
008b599c	ldur w9,[x29, #-0x18]
008b59a0	ldp x28,x27,[sp]
008b59a4	sub w8,w24,w8
008b59a8	sdiv w8,w8,w9
008b59ac	add w0,w8,#0x1
008b59b0	b 0x008b59d8
008b59b4	mov w0,wzr
008b59b8	b 0x008b59dc
008b59bc	ldp x28,x27,[sp]
008b59c0	ldr x9,[sp, #0x18]
008b59c4	b 0x008b59d0
008b59c8	ldur w8,[x29, #-0x18]
008b59cc	mov x9,x24
008b59d0	sub w9,w24,w9
008b59d4	sdiv w0,w9,w8
008b59d8	ldr x24,[sp, #0x10]
008b59dc	lsl w8,w0,#0x4
008b59e0	str x23,[x28, x24#0x0]
008b59e4	add x21,x21,w8, SXTW 
008b59e8	cbz x23,0x008b5818
008b59ec	cmp x21,x22
008b59f0	b.cc 0x008b58b8
008b59f4	b 0x008b5818
008b59f8	mov x21,xzr
008b59fc	ldr x8,[x20, #0x58]
008b5a00	cbz x8,0x008b5a20
008b5a04	mov x22,xzr
008b5a08	mov x0,x20
008b5a0c	bl 0x008b64ec
008b5a10	ldr x8,[x20, #0x58]
008b5a14	add x22,x0,x22
008b5a18	cbnz x8,0x008b5a08
008b5a1c	b 0x008b5a24
008b5a20	mov x22,xzr
008b5a24	ldr x8,[x20, #0x68]
008b5a28	str xzr,[x20, #0x68]
008b5a2c	str x8,[x20, #0x58]
008b5a30	ldrb w8,[x19, #0x2]
008b5a34	tst w8,#0x3
008b5a38	b.eq 0x008b5a48
008b5a3c	mov x0,x20
008b5a40	mov x1,x19
008b5a44	bl 0x008b61bc
008b5a48	add x21,x22,x21
008b5a4c	mov w22,#0x448
008b5a50	b 0x008b5a60
008b5a54	add x22,x22,#0x8
008b5a58	cmp x22,#0x4b0
008b5a5c	b.eq 0x008b5a80
008b5a60	ldr x1,[x20, x22#0x0]
008b5a64	cbz x1,0x008b5a54
008b5a68	ldrb w8,[x1, #0x2]
008b5a6c	tst w8,#0x3
008b5a70	b.eq 0x008b5a54
008b5a74	mov x0,x20
008b5a78	bl 0x008b61bc
008b5a7c	b 0x008b5a54
008b5a80	mov w22,#0x909
008b5a84	b 0x008b5a94
008b5a88	add x22,x22,#0x1
008b5a8c	cmp x22,#0x989
008b5a90	b.eq 0x008b5ab4
008b5a94	ldr x1,[x20, x22, LSL #0x3]
008b5a98	cbz x1,0x008b5a88
008b5a9c	ldrb w8,[x1, #0x2]
008b5aa0	tst w8,#0x3
008b5aa4	b.eq 0x008b5a88
008b5aa8	mov x0,x20
008b5aac	bl 0x008b61bc
008b5ab0	b 0x008b5a88
008b5ab4	mov x0,x20
008b5ab8	bl 0x008b70e0
008b5abc	mov w22,#0xa0d
008b5ac0	b 0x008b5ad0
008b5ac4	add x22,x22,#0x1
008b5ac8	cmp x22,#0xa8f
008b5acc	b.eq 0x008b5af0
008b5ad0	ldr x1,[x20, x22, LSL #0x3]
008b5ad4	cbz x1,0x008b5ac4
008b5ad8	ldrb w8,[x1, #0x2]
008b5adc	tst w8,#0x3
008b5ae0	b.eq 0x008b5ac4
008b5ae4	mov x0,x20
008b5ae8	bl 0x008b61bc
008b5aec	b 0x008b5ac4
008b5af0	ldr x1,[x20, #0x5478]
008b5af4	cbz x1,0x008b5b0c
008b5af8	ldrb w8,[x1, #0x2]
008b5afc	tst w8,#0x3
008b5b00	b.eq 0x008b5b0c
008b5b04	mov x0,x20
008b5b08	bl 0x008b61bc
008b5b0c	ldr x1,[x20, #0x5480]
008b5b10	cbz x1,0x008b5b28
008b5b14	ldrb w8,[x1, #0x2]
008b5b18	tst w8,#0x3
008b5b1c	b.eq 0x008b5b28
008b5b20	mov x0,x20
008b5b24	bl 0x008b61bc
008b5b28	ldr x8,[x20, #0x58]
008b5b2c	cbz x8,0x008b5b4c
008b5b30	mov x22,xzr
008b5b34	mov x0,x20
008b5b38	bl 0x008b64ec
008b5b3c	ldr x8,[x20, #0x58]
008b5b40	add x22,x0,x22
008b5b44	cbnz x8,0x008b5b34
008b5b48	b 0x008b5b50
008b5b4c	mov x22,xzr
008b5b50	ldr x8,[x20, #0x60]
008b5b54	add x21,x21,x22
008b5b58	mov x22,xzr
008b5b5c	stp x8,xzr,[x20, #0x58]
008b5b60	cbz x8,0x008b5b78
008b5b64	mov x0,x20
008b5b68	bl 0x008b64ec
008b5b6c	ldr x8,[x20, #0x58]
008b5b70	add x22,x0,x22
008b5b74	cbnz x8,0x008b5b64
008b5b78	adrp x8,0xd1f000
008b5b7c	add x23,x21,x22
008b5b80	ldrb w8,[x8, #0x4b8]
008b5b84	cmp w8,#0x1
008b5b88	b.ne 0x008b5bf4
008b5b8c	ldr x8,[x20, #0x4c60]
008b5b90	cbz x8,0x008b5bf4
008b5b94	ldr x0,[x20, #0x1e0]
008b5b98	nop
008b5b9c	adr x1,0x8b7190
008b5ba0	blr x8
008b5ba4	cbz w0,0x008b5bf4
008b5ba8	nop
008b5bac	adr x21,0x8b7190
008b5bb0	b 0x008b5bd0
008b5bb4	mov x22,xzr
008b5bb8	ldr x8,[x20, #0x4c60]
008b5bbc	ldr x0,[x20, #0x1e0]
008b5bc0	mov x1,x21
008b5bc4	add x23,x22,x23
008b5bc8	blr x8
008b5bcc	cbz w0,0x008b5bf4
008b5bd0	ldr x8,[x20, #0x58]
008b5bd4	cbz x8,0x008b5bb4
008b5bd8	mov x22,xzr
008b5bdc	mov x0,x20
008b5be0	bl 0x008b64ec
008b5be4	ldr x8,[x20, #0x58]
008b5be8	add x22,x0,x22
008b5bec	cbnz x8,0x008b5bdc
008b5bf0	b 0x008b5bb8
008b5bf4	ldr x21,[x20, #0x68]
008b5bf8	stp x27,x23,[sp, #0x8]
008b5bfc	cbz x21,0x008b5ea8
008b5c00	adrp x23,0xcb4000
008b5c04	mov x24,xzr
008b5c08	mov w22,#0xffffffff
008b5c0c	ldr x23,[x23, #0xbe0]
008b5c10	mov w28,#0xd
008b5c14	b 0x008b5c38
008b5c18	ldrb w8,[x21, #0x7]
008b5c1c	mov x23,x24
008b5c20	mov x24,x22
008b5c24	mov w22,#0xffffffff
008b5c28	strb w25,[x21, #0x6]
008b5c2c	cbz w8,0x008b5c58
008b5c30	ldr x21,[x21, #0x18]
008b5c34	cbz x21,0x008b5eac
008b5c38	ldr x8,[x21, #0x28]
008b5c3c	cmp x8,x23
008b5c40	b.eq 0x008b5c88
008b5c44	ldrb w8,[x21, #0x5]
008b5c48	mov w9,#0x1
008b5c4c	lsl w8,w9,w8
008b5c50	sbfiz x8,x8,#0x5,#0x20
008b5c54	b 0x008b5c8c
008b5c58	ldr x0,[x21, #0x10]
008b5c5c	cbz x0,0x008b5c30
008b5c60	ldrb w8,[x0, #0x6]
008b5c64	tbnz w8,#0x2,0x008b5c30
008b5c68	ldrb w8,[x0, #0x7]
008b5c6c	tbnz w8,#0x1,0x008b5e40
008b5c70	ldr x8,[x19, #0x60]
008b5c74	mov w1,#0x2
008b5c78	ldr x2,[x8, #0x348]
008b5c7c	bl 0x008bdfe0
008b5c80	cbnz x0,0x008b5e48
008b5c84	b 0x008b5c30
008b5c88	mov x8,xzr
008b5c8c	ldrsw x10,[x21, #0x8]
008b5c90	lsl x9,x10,#0x4
008b5c94	cbz w10,0x008b5cf0
008b5c98	mov x11,x9
008b5c9c	b 0x008b5cb8
008b5ca0	and w12,w14,#0xf8
008b5ca4	orr w12,w12,#0x4
008b5ca8	strb w12,[x13, #0x2]
008b5cac	sub x10,x10,#0x1
008b5cb0	sub x11,x11,#0x10
008b5cb4	cbz x10,0x008b5cf0
008b5cb8	ldr x12,[x21, #0x20]
008b5cbc	add x12,x12,x11
008b5cc0	ldur w13,[x12, #-0x4]
008b5cc4	cmp w13,#0x5
008b5cc8	b.lt 0x008b5cac
008b5ccc	ldur x13,[x12, #-0x10]
008b5cd0	ldrb w15,[x13]
008b5cd4	ldrb w14,[x13, #0x2]
008b5cd8	cmp w15,#0x5
008b5cdc	b.eq 0x008b5ca0
008b5ce0	tst w14,#0x3
008b5ce4	b.eq 0x008b5cac
008b5ce8	stur wzr,[x12, #-0x4]
008b5cec	b 0x008b5cac
008b5cf0	ldrb w10,[x21, #0x5]
008b5cf4	add x9,x24,x9
008b5cf8	mov w26,wzr
008b5cfc	add x9,x9,x8
008b5d00	lsl w10,w22,w10
008b5d04	add x24,x9,#0x30
008b5d08	mvn w10,w10
008b5d0c	ubfiz x8,x10,#0x5,#0x20
008b5d10	b 0x008b5d30
008b5d14	and w9,w11,#0xf8
008b5d18	orr w9,w9,#0x4
008b5d1c	strb w9,[x10, #0x2]
008b5d20	add w26,w26,#0x1
008b5d24	sub x8,x8,#0x20
008b5d28	cmn x8,#0x20
008b5d2c	b.eq 0x008b5dd0
008b5d30	ldr x12,[x21, #0x28]
008b5d34	add x9,x12,x8
008b5d38	ldr w11,[x9, #0xc]
008b5d3c	cbz w11,0x008b5d24
008b5d40	ldr w10,[x9, #0x1c]
008b5d44	and w13,w10,#0xf
008b5d48	cmp w13,#0x5
008b5d4c	b.cc 0x008b5d8c
008b5d50	add x12,x12,x8
008b5d54	ldr x12,[x12, #0x10]
008b5d58	ldrb w14,[x12]
008b5d5c	ldrb w13,[x12, #0x2]
008b5d60	cmp w14,#0x5
008b5d64	b.ne 0x008b5d7c
008b5d68	and w10,w13,#0xf8
008b5d6c	orr w10,w10,#0x4
008b5d70	strb w10,[x12, #0x2]
008b5d74	ldr w11,[x9, #0xc]
008b5d78	b 0x008b5d8c
008b5d7c	tst w13,#0x3
008b5d80	b.eq 0x008b5d8c
008b5d84	str wzr,[x9, #0xc]
008b5d88	b 0x008b5dc4
008b5d8c	cmp w11,#0x5
008b5d90	b.lt 0x008b5d20
008b5d94	ldr x10,[x9]
008b5d98	ldrb w12,[x10]
008b5d9c	ldrb w11,[x10, #0x2]
008b5da0	cmp w12,#0x5
008b5da4	b.eq 0x008b5d14
008b5da8	tst w11,#0x3
008b5dac	b.eq 0x008b5d20
008b5db0	ldr w10,[x9, #0x1c]
008b5db4	str wzr,[x9, #0xc]
008b5db8	and w11,w10,#0xf
008b5dbc	cmp w11,#0x5
008b5dc0	b.cc 0x008b5d24
008b5dc4	bfxil w10,w28,#0x0,#0x4
008b5dc8	str w10,[x9, #0x1c]
008b5dcc	b 0x008b5d24
008b5dd0	ldrb w8,[x21, #0x7]
008b5dd4	tbz w8,#0x1,0x008b5c2c
008b5dd8	mov x22,x24
008b5ddc	mov x24,x23
008b5de0	mov x27,xzr
008b5de4	mov w25,wzr
008b5de8	mov x23,#-0x10
008b5dec	b 0x008b5e00
008b5df0	add x27,x27,#0x1
008b5df4	sub x23,x23,#0x10
008b5df8	cmp x27,#0x15
008b5dfc	b.eq 0x008b5c18
008b5e00	ldr x8,[x19, #0x60]
008b5e04	mov x0,x21
008b5e08	add x8,x8,x27, LSL #0x3
008b5e0c	ldr x1,[x8, #0x338]
008b5e10	bl 0x008bb440
008b5e14	ldr x8,[x21, #0x20]
008b5e18	ldr q0,[x0]
008b5e1c	cmp x27,#0x7
008b5e20	str q0,[x8,x23]
008b5e24	b.hi 0x008b5df0
008b5e28	ldr w8,[x0, #0xc]
008b5e2c	cbnz w8,0x008b5df0
008b5e30	mov w8,#0x1
008b5e34	lsl w8,w8,w27
008b5e38	orr w25,w25,w8
008b5e3c	b 0x008b5df0
008b5e40	ldr x8,[x0, #0x20]
008b5e44	sub x0,x8,#0x30
008b5e48	ldr w8,[x0, #0xc]
008b5e4c	cmp w8,#0x5
008b5e50	b.ne 0x008b5c30
008b5e54	ldr x8,[x0]
008b5e58	mov w1,#0x73
008b5e5c	add x0,x8,#0x18
008b5e60	bl 0x00c30890
008b5e64	cbz x0,0x008b5c30
008b5e68	ldrb w8,[x21, #0x5]
008b5e6c	mov w9,#0x3
008b5e70	lsl w8,w9,w8
008b5e74	add w9,w8,#0x7
008b5e78	cmp w8,#0x0
008b5e7c	csel w8,w9,w8,lt
008b5e80	cmp w26,w8, ASR #0x3
008b5e84	b.ge 0x008b5c30
008b5e88	add x2,sp,#0x18
008b5e8c	mov x0,x19
008b5e90	nop
008b5e94	adr x1,0x8b71ec
008b5e98	str x21,[sp, #0x18]
008b5e9c	str w26,[sp, #0x20]
008b5ea0	bl 0x008b3edc
008b5ea4	b 0x008b5c30
008b5ea8	mov x24,xzr
008b5eac	str xzr,[x20, #0x68]
008b5eb0	ldr x8,[x19, #0x60]
008b5eb4	ldr x1,[x8, #0x1d0]
008b5eb8	add x22,x8,#0x1b8
008b5ebc	cmp x1,x22
008b5ec0	b.eq 0x008b5f0c
008b5ec4	ldr x27,[sp, #0x8]
008b5ec8	mov x21,xzr
008b5ecc	b 0x008b5ef8
008b5ed0	ldrb w8,[x1, #0x2]
008b5ed4	ldr x23,[x1, #0x18]
008b5ed8	mov x0,x19
008b5edc	tst w8,#0x3
008b5ee0	cset w2,ne
008b5ee4	bl 0x008b501c
008b5ee8	mov x1,x23
008b5eec	cmp x1,x22
008b5ef0	add x21,x21,#0x28
008b5ef4	b.eq 0x008b5f14
008b5ef8	ldrb w8,[x1, #0x3]
008b5efc	cbz w8,0x008b5ed0
008b5f00	strb wzr,[x1, #0x3]
008b5f04	ldr x1,[x1, #0x18]
008b5f08	b 0x008b5eec
008b5f0c	ldr x27,[sp, #0x8]
008b5f10	mov x21,xzr
008b5f14	adrp x9,0xcb4000
008b5f18	ldrb w8,[x20, #0x2]
008b5f1c	ldr x9,[x9, #0xbb0]
008b5f20	ldr x10,[x20, #0x330]
008b5f24	eor w8,w8,#0x3
008b5f28	ldrb w9,[x9]
008b5f2c	strb w8,[x20, #0x2]
008b5f30	ldr x8,[x20, #0x4b8]
008b5f34	str x10,[x20, #0x1e8]
008b5f38	cmp w9,#0x1
008b5f3c	str x8,[x20, #0x4c0]
008b5f40	b.ne 0x008b5f88
008b5f44	ldr x8,[x20, #0x2f00]
008b5f48	ldr x9,[x20, #0x3050]
008b5f4c	str wzr,[x20, #0x3840]
008b5f50	str x8,[x20, #0x2f08]
008b5f54	ldr x8,[x20, #0x31a0]
008b5f58	str x9,[x20, #0x3058]
008b5f5c	ldr x9,[x20, #0x32f0]
008b5f60	str x8,[x20, #0x31a8]
008b5f64	ldr x8,[x20, #0x3440]
008b5f68	str x9,[x20, #0x32f8]
008b5f6c	ldr x9,[x20, #0x3590]
008b5f70	str x8,[x20, #0x3448]
008b5f74	ldr x8,[x20, #0x36e0]
008b5f78	str x9,[x20, #0x3598]
008b5f7c	str x8,[x20, #0x36e8]
008b5f80	ldr x8,[x20, #0x3830]
008b5f84	str x8,[x20, #0x3838]
008b5f88	ldr x8,[sp, #0x10]
008b5f8c	mov w9,#0x4
008b5f90	strb w9,[x20, #0x1]
008b5f94	add x8,x24,x8
008b5f98	add x21,x8,x21
008b5f9c	ldr x8,[x27, #0x28]
008b5fa0	ldur x9,[x29, #-0x8]
008b5fa4	cmp x8,x9
008b5fa8	b.ne 0x008b5fd0
008b5fac	mov x0,x21
008b5fb0	ldp x20,x19,[sp, #0x90]
008b5fb4	ldp x22,x21,[sp, #0x80]
008b5fb8	ldp x24,x23,[sp, #0x70]
008b5fbc	ldp x26,x25,[sp, #0x60]
008b5fc0	ldp x28,x27,[sp, #0x50]
008b5fc4	ldp x29,x30,[sp, #0x40]
008b5fc8	add sp,sp,#0xa0
008b5fcc	ret
008b5fd0	bl 0x00c2fec0
