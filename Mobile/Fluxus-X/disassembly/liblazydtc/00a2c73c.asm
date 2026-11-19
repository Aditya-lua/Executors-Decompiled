; BN_GF2m_mod_mul @ 00a2c73c
00a2c73c	str x27,[sp, #-0x60]!
00a2c740	stp x24,x23,[sp, #0x20]
00a2c744	mov x24,x0
00a2c748	mov x0,x3
00a2c74c	stp x26,x25,[sp, #0x10]
00a2c750	stp x22,x21,[sp, #0x30]
00a2c754	stp x20,x19,[sp, #0x40]
00a2c758	stp x29,x30,[sp, #0x50]
00a2c75c	add x29,sp,#0x50
00a2c760	mov x20,x4
00a2c764	mov x26,x3
00a2c768	mov x22,x2
00a2c76c	mov x23,x1
00a2c770	bl 0x00c322f0
00a2c774	add w27,w0,#0x1
00a2c778	adrp x1,0x2d9000
00a2c77c	mov w25,w0
00a2c780	sbfiz x0,x27,#0x2,#0x20
00a2c784	add x1,x1,#0xb49
00a2c788	mov w2,#0x1dc
00a2c78c	bl 0x00c32320
00a2c790	cbz x0,0x00a2c7ec
00a2c794	mov x19,x0
00a2c798	mov x0,x26
00a2c79c	bl 0x00c369b0
00a2c7a0	mov w21,wzr
00a2c7a4	cbz w0,0x00a2c840
00a2c7a8	bl 0x00c342a0
00a2c7ac	adrp x0,0x2d9000
00a2c7b0	adrp x2,0x29e000
00a2c7b4	add x0,x0,#0xb49
00a2c7b8	add x2,x2,#0x97
00a2c7bc	mov w1,#0x1e3
00a2c7c0	bl 0x00c342b0
00a2c7c4	orr w0,wzr,#0x3
00a2c7c8	mov w1,#0x6a
00a2c7cc	mov x2,xzr
00a2c7d0	bl 0x00c342c0
00a2c7d4	adrp x1,0x2d9000
00a2c7d8	add x1,x1,#0xb49
00a2c7dc	mov w2,#0x1e9
00a2c7e0	mov x0,x19
00a2c7e4	bl 0x00c32310
00a2c7e8	b 0x00a2c820
00a2c7ec	bl 0x00c342a0
00a2c7f0	adrp x0,0x2d9000
00a2c7f4	adrp x2,0x29e000
00a2c7f8	add x0,x0,#0xb49
00a2c7fc	add x2,x2,#0x97
00a2c800	mov w1,#0x1de
00a2c804	bl 0x00c342b0
00a2c808	mov w1,#0x100
00a2c80c	orr w0,wzr,#0x3
00a2c810	movk w1,#0xc, LSL #16
00a2c814	mov x2,xzr
00a2c818	bl 0x00c342c0
00a2c81c	mov w21,wzr
00a2c820	mov w0,w21
00a2c824	ldp x29,x30,[sp, #0x50]
00a2c828	ldp x20,x19,[sp, #0x40]
00a2c82c	ldp x22,x21,[sp, #0x30]
00a2c830	ldp x24,x23,[sp, #0x20]
00a2c834	ldp x26,x25,[sp, #0x10]
00a2c838	ldr x27,[sp], #0x60
00a2c83c	ret
00a2c840	ldrsw x8,[x26, #0x8]
00a2c844	cmp w8,#0x1
00a2c848	b.lt 0x00a2c8e8
00a2c84c	ldr x9,[x26]
00a2c850	mov w21,wzr
00a2c854	lsl w10,w8,#0x6
00a2c858	sub x11,x8,#0x1
00a2c85c	ldr x12,[x9, x11, LSL #0x3]
00a2c860	cbz x12,0x00a2c898
00a2c864	orr x13,xzr,#-0x8000000000000000
00a2c868	mov w14,#0xffffffff
00a2c86c	tst x13,x12
00a2c870	b.eq 0x00a2c888
00a2c874	cmp w21,w25
00a2c878	b.gt 0x00a2c884
00a2c87c	add w15,w10,w14
00a2c880	str w15,[x19, w21, SXTW #0x2]
00a2c884	add w21,w21,#0x1
00a2c888	sub w14,w14,#0x1
00a2c88c	cmn w14,#0x41
00a2c890	lsr x13,x13,#0x1
00a2c894	b.ne 0x00a2c86c
00a2c898	cmp x8,#0x1
00a2c89c	sub w10,w10,#0x40
00a2c8a0	mov x8,x11
00a2c8a4	b.gt 0x00a2c858
00a2c8a8	cmp w21,w25
00a2c8ac	b.gt 0x00a2c8bc
00a2c8b0	mov w8,#0xffffffff
00a2c8b4	str w8,[x19, w21, SXTW #0x2]
00a2c8b8	add w21,w21,#0x1
00a2c8bc	cbz w21,0x00a2c7a8
00a2c8c0	cmp w21,w27
00a2c8c4	b.gt 0x00a2c7a8
00a2c8c8	mov x0,x24
00a2c8cc	mov x1,x23
00a2c8d0	mov x2,x22
00a2c8d4	mov x3,x19
00a2c8d8	mov x4,x20
00a2c8dc	bl 0x00a2bc58
00a2c8e0	mov w21,w0
00a2c8e4	b 0x00a2c7d4
00a2c8e8	mov w21,wzr
00a2c8ec	cmp w21,w25
00a2c8f0	b.le 0x00a2c8b0
00a2c8f4	b 0x00a2c8bc
