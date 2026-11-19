; FUN_0088b80c @ 0088b80c
0088b80c	stp x29,x30,[sp, #-0x30]!
0088b810	str x21,[sp, #0x10]
0088b814	stp x20,x19,[sp, #0x20]
0088b818	mov x29,sp
0088b81c	ldr x9,[x0, #0xc8]
0088b820	mov x19,x0
0088b824	mov w8,#0x1
0088b828	add x20,x0,#0xc30
0088b82c	strb w8,[x0, #0xcfc]
0088b830	cbz x9,0x0088b8d4
0088b834	lsr x8,x20,#0x3
0088b838	mov w9,#0x8
0088b83c	lsr x10,x20,#0x20
0088b840	bfm x9,x8,#0x3a,#0x19
0088b844	eor x8,x9,x10
0088b848	mov x9,#0x2d69
0088b84c	movk x9,#0xeb38, LSL #16
0088b850	movk x9,#0xea08, LSL #32
0088b854	movk x9,#0x9ddf, LSL #48
0088b858	mul x8,x8,x9
0088b85c	eor x10,x10,x8, LSR #0x2f
0088b860	eor x8,x10,x8
0088b864	mul x8,x8,x9
0088b868	mov x9,#0x959d
0088b86c	movk x9,#0xb8f4, LSL #16
0088b870	movk x9,#0xd34f, LSL #32
0088b874	movk x9,#0x949d, LSL #48
0088b878	eor x8,x8,x8, LSR #0x2f
0088b87c	mul x8,x8,x9
0088b880	ldrb w9,[x19, #0xd0]
0088b884	lsr x9,x8,x9
0088b888	ldr x8,[x19, #0xb8]
0088b88c	lsr x10,x9,#0x6
0088b890	ldr x10,[x8, x10, LSL #0x3]
0088b894	lsr x10,x10,x9
0088b898	tbz w10,#0x0,0x0088b8d4
0088b89c	ldr x11,[x19, #0xc0]
0088b8a0	ldr x10,[x19, #0xa0]
0088b8a4	mov w12,#0x18
0088b8a8	sub x11,x11,#0x1
0088b8ac	mul x13,x9,x12
0088b8b0	ldr x13,[x10, x13#0x0]
0088b8b4	cmp x13,x20
0088b8b8	b.eq 0x0088b974
0088b8bc	add x9,x9,#0x1
0088b8c0	and x9,x9,x11
0088b8c4	lsr x13,x9,#0x6
0088b8c8	ldr x13,[x8, x13, LSL #0x3]
0088b8cc	lsr x13,x13,x9
0088b8d0	tbnz w13,#0x0,0x0088b8ac
0088b8d4	ldr w21,[x19, #0x64c]
0088b8d8	add w8,w21,#0x1
0088b8dc	cmp w8,#0x100
0088b8e0	b.cs 0x0088b984
0088b8e4	ldr w9,[x19, #0x650]
0088b8e8	adrp x10,0xd1f000
0088b8ec	str w8,[x19, #0x64c]
0088b8f0	ldrb w10,[x10, #0xa8]
0088b8f4	cmp w9,w8
0088b8f8	csel w8,w9,w8,hi
0088b8fc	cmp w10,#0x1
0088b900	str w8,[x19, #0x650]
0088b904	b.ne 0x0088b930
0088b908	ldr w3,[x19, #0xcf8]
0088b90c	cmn w3,#0x1
0088b910	b.eq 0x0088b930
0088b914	cmp w3,#0x8, LSL #12
0088b918	b.ge 0x0088b930
0088b91c	ldr x0,[x19]
0088b920	mov w1,#0x36
0088b924	mov w2,w21
0088b928	bl 0x00875cac
0088b92c	b 0x0088b954
0088b930	ldr x0,[x19]
0088b934	mov w1,#0x35
0088b938	mov w2,w21
0088b93c	mov w3,wzr
0088b940	mov w4,wzr
0088b944	bl 0x00875b54
0088b948	ldr x0,[x19]
0088b94c	mov w1,wzr
0088b950	bl 0x00875d18
0088b954	mov x0,x19
0088b958	mov x1,x20
0088b95c	mov w2,w21
0088b960	mov w3,#0xffffffff
0088b964	ldp x20,x19,[sp, #0x20]
0088b968	ldr x21,[sp, #0x10]
0088b96c	ldp x29,x30,[sp], #0x30
0088b970	b 0x00884b7c
0088b974	ldp x20,x19,[sp, #0x20]
0088b978	ldr x21,[sp, #0x10]
0088b97c	ldp x29,x30,[sp], #0x30
0088b980	ret
0088b984	adrp x8,0x2d0000
0088b988	add x8,x8,#0xc00
0088b98c	add x0,x1,#0xc
0088b990	mov x1,x8
0088b994	mov w2,#0x1
0088b998	mov w3,#0xff
0088b99c	bl 0x0087fcd8
