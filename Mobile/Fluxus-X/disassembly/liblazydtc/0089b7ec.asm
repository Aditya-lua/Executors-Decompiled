; _INIT_140 @ 0089b7ec
0089b7ec	stp x29,x30,[sp, #-0x40]!
0089b7f0	str x23,[sp, #0x10]
0089b7f4	stp x22,x21,[sp, #0x20]
0089b7f8	stp x20,x19,[sp, #0x30]
0089b7fc	mov x29,sp
0089b800	adrp x10,0xd1e000
0089b804	adrp x8,0xd1e000
0089b808	add x8,x8,#0xf68
0089b80c	ldr x11,[x10, #0xec8]
0089b810	adrp x12,0x2c0000
0089b814	add x12,x12,#0xe82
0089b818	mov w9,#0x19
0089b81c	adrp x13,0x2ab000
0089b820	add x13,x13,#0x439
0089b824	stp x12,x11,[x8, #0x8]
0089b828	adrp x12,0xd1e000
0089b82c	add x12,x12,#0xf88
0089b830	strb wzr,[x8, #0x4]
0089b834	mov w11,#0x12c
0089b838	adrp x20,0xd1e000
0089b83c	str w9,[x8]
0089b840	adrp x21,0xd1f000
0089b844	add x21,x21,#0xc8
0089b848	str wzr,[x8, #0x18]
0089b84c	adrp x19,0x2a3000
0089b850	add x19,x19,#0x546
0089b854	stp x13,x8,[x12, #0x8]
0089b858	adrp x8,0xd1e000
0089b85c	add x8,x8,#0xfa8
0089b860	str w9,[x8]
0089b864	adrp x9,0x2d2000
0089b868	add x9,x9,#0xcec
0089b86c	stp x9,x12,[x8, #0x8]
0089b870	adrp x9,0xd1e000
0089b874	add x9,x9,#0xfc8
0089b878	str w11,[x12]
0089b87c	mov w22,#0x3
0089b880	mov x23,x21
0089b884	str w11,[x9]
0089b888	adrp x11,0x2cc000
0089b88c	add x11,x11,#0xb8c
0089b890	strb wzr,[x8, #0x4]
0089b894	str wzr,[x8, #0x18]
0089b898	stp x11,x8,[x9, #0x8]
0089b89c	mov w8,#0x5
0089b8a0	adrp x11,0xd1e000
0089b8a4	add x11,x11,#0xfe8
0089b8a8	strb wzr,[x9, #0x4]
0089b8ac	str w8,[x11]
0089b8b0	adrp x8,0x2c8000
0089b8b4	add x8,x8,#0xc31
0089b8b8	str wzr,[x9, #0x18]
0089b8bc	stp x8,x9,[x11, #0x8]
0089b8c0	ldr x9,[x20, #0xec0]
0089b8c4	adrp x8,0xd1f000
0089b8c8	add x8,x8,#0x8
0089b8cc	str x11,[x10, #0xec8]
0089b8d0	adrp x10,0x2ce000
0089b8d4	add x10,x10,#0xdeb
0089b8d8	strh wzr,[x8]
0089b8dc	stp x10,x9,[x8, #0x8]
0089b8e0	adrp x9,0xd1f000
0089b8e4	add x9,x9,#0x28
0089b8e8	adrp x10,0x2c2000
0089b8ec	add x10,x10,#0xdd7
0089b8f0	str wzr,[x8, #0x18]
0089b8f4	stp x10,x8,[x9, #0x8]
0089b8f8	adrp x8,0xd1f000
0089b8fc	add x8,x8,#0x48
0089b900	adrp x10,0x2d8000
0089b904	add x10,x10,#0xf53
0089b908	strh wzr,[x9]
0089b90c	str wzr,[x9, #0x18]
0089b910	stp x10,x9,[x8, #0x8]
0089b914	adrp x9,0xd1f000
0089b918	add x9,x9,#0x68
0089b91c	adrp x10,0x2ab000
0089b920	add x10,x10,#0x460
0089b924	strh wzr,[x8]
0089b928	str wzr,[x8, #0x18]
0089b92c	stp x10,x8,[x9, #0x8]
0089b930	adrp x8,0xd1f000
0089b934	add x8,x8,#0x88
0089b938	adrp x10,0x2d8000
0089b93c	add x10,x10,#0xf6b
0089b940	strh wzr,[x9]
0089b944	str wzr,[x9, #0x18]
0089b948	stp x10,x9,[x8, #0x8]
0089b94c	adrp x9,0xd1f000
0089b950	add x9,x9,#0xa8
0089b954	adrp x10,0x2ca000
0089b958	add x10,x10,#0xb58
0089b95c	strb wzr,[x12, #0x4]
0089b960	str wzr,[x12, #0x18]
0089b964	strb wzr,[x11, #0x4]
0089b968	str wzr,[x11, #0x18]
0089b96c	strh wzr,[x8]
0089b970	str wzr,[x8, #0x18]
0089b974	strh wzr,[x9]
0089b978	stp x10,x8,[x9, #0x8]
0089b97c	str wzr,[x9, #0x18]
0089b980	strh wzr,[x21]
0089b984	stp x19,x9,[x21, #0x8]
0089b988	str wzr,[x21, #0x18]
0089b98c	str x21,[x20, #0xec0]
0089b990	b 0x0089b99c
0089b994	ldr x23,[x23, #0x10]
0089b998	cbz x23,0x0089b9b4
0089b99c	ldr x0,[x23, #0x8]
0089b9a0	mov x1,x19
0089b9a4	bl 0x00c301f0
0089b9a8	cbnz w0,0x0089b994
0089b9ac	str w22,[x23, #0x18]
0089b9b0	b 0x0089b994
0089b9b4	adrp x22,0xd1e000
0089b9b8	add x22,x22,#0xfe8
0089b9bc	adrp x19,0x2a3000
0089b9c0	add x19,x19,#0x546
0089b9c4	mov w23,#0x3
0089b9c8	b 0x0089b9d4
0089b9cc	ldr x22,[x22, #0x10]
0089b9d0	cbz x22,0x0089b9ec
0089b9d4	ldr x0,[x22, #0x8]
0089b9d8	mov x1,x19
0089b9dc	bl 0x00c301f0
0089b9e0	cbnz w0,0x0089b9cc
0089b9e4	str w23,[x22, #0x18]
0089b9e8	b 0x0089b9cc
0089b9ec	adrp x8,0xd1f000
0089b9f0	add x8,x8,#0xe8
0089b9f4	adrp x9,0x2b3000
0089b9f8	add x9,x9,#0x3f8
0089b9fc	adrp x10,0x2c4000
0089ba00	add x10,x10,#0xc76
0089ba04	stp x9,x21,[x8, #0x8]
0089ba08	adrp x9,0xd1f000
0089ba0c	add x9,x9,#0x108
0089ba10	strh wzr,[x8]
0089ba14	str wzr,[x8, #0x18]
0089ba18	stp x10,x8,[x9, #0x8]
0089ba1c	adrp x8,0xd1f000
0089ba20	add x8,x8,#0x128
0089ba24	adrp x10,0x2a1000
0089ba28	add x10,x10,#0x634
0089ba2c	strh wzr,[x9]
0089ba30	str wzr,[x9, #0x18]
0089ba34	strh wzr,[x8]
0089ba38	stp x10,x9,[x8, #0x8]
0089ba3c	str wzr,[x8, #0x18]
0089ba40	str x8,[x20, #0xec0]
0089ba44	ldp x20,x19,[sp, #0x30]
0089ba48	ldr x23,[sp, #0x10]
0089ba4c	ldp x22,x21,[sp, #0x20]
0089ba50	ldp x29,x30,[sp], #0x40
0089ba54	ret
