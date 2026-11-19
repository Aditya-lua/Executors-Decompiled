; FUN_0083b7a4 @ 0083b7a4
0083b7a4	sub sp,sp,#0x60
0083b7a8	stp x29,x30,[sp, #0x10]
0083b7ac	str x25,[sp, #0x20]
0083b7b0	stp x24,x23,[sp, #0x30]
0083b7b4	stp x22,x21,[sp, #0x40]
0083b7b8	stp x20,x19,[sp, #0x50]
0083b7bc	add x29,sp,#0x10
0083b7c0	mrs x25,tpidr_el0
0083b7c4	mov x19,x3
0083b7c8	mov x22,x2
0083b7cc	ldr x8,[x25, #0x28]
0083b7d0	mov x21,x1
0083b7d4	mov x20,x0
0083b7d8	str x8,[sp, #0x8]
0083b7dc	ldrb w8,[x2, #0xc]
0083b7e0	cmp w8,#0x1
0083b7e4	b.ne 0x0083b81c
0083b7e8	ldr s0,[x22, #0x8]
0083b7ec	adrp x8,0x29b000
0083b7f0	strb wzr,[x22, #0xc]
0083b7f4	ldr d1,[x8, #0xe70]
0083b7f8	adrp x8,0x29b000
0083b7fc	uxtl v0.8H,v0.8B
0083b800	ldr d2,[x8, #0x610]
0083b804	eor v0.8B,v0.8B,v1.8B
0083b808	ldr d1,[x22]
0083b80c	eor v1.8B,v1.8B,v2.8B
0083b810	uzp1 v0.8B,v0.8B,v0.8B
0083b814	str d1,[x22]
0083b818	str s0,[x22, #0x8]
0083b81c	mov x0,x19
0083b820	bl 0x0083f6d4
0083b824	mov x0,x20
0083b828	mov x1,x21
0083b82c	mov x2,x22
0083b830	mov w3,wzr
0083b834	mov x4,xzr
0083b838	bl 0x008ac76c
0083b83c	mov x0,x20
0083b840	mov w1,#0xffffffff
0083b844	bl 0x008aa2e4
0083b848	ldr x8,[x0]
0083b84c	adrp x23,0xd1e000
0083b850	add x23,x23,#0x30
0083b854	mov x1,sp
0083b858	mov x2,sp
0083b85c	mov x0,x23
0083b860	str x8,[sp]
0083b864	bl 0x00807f14
0083b868	adrp x24,0xcca000
0083b86c	add x24,x24,#0x848
0083b870	mov x1,sp
0083b874	mov x2,sp
0083b878	mov x0,x24
0083b87c	str x21,[sp]
0083b880	bl 0x0080837c
0083b884	mov x0,x20
0083b888	mov w1,#0xffffd8ee
0083b88c	mov x2,x22
0083b890	bl 0x008ad800
0083b894	mov x0,x20
0083b898	mov x1,x21
0083b89c	mov x2,x19
0083b8a0	mov w3,wzr
0083b8a4	mov x4,xzr
0083b8a8	bl 0x008ac76c
0083b8ac	mov x0,x20
0083b8b0	mov w1,#0xffffffff
0083b8b4	bl 0x008aa2e4
0083b8b8	ldr x8,[x0]
0083b8bc	mov x1,sp
0083b8c0	mov x2,sp
0083b8c4	mov x0,x23
0083b8c8	str x8,[sp]
0083b8cc	bl 0x00807f14
0083b8d0	mov x1,sp
0083b8d4	mov x2,sp
0083b8d8	mov x0,x24
0083b8dc	str x21,[sp]
0083b8e0	bl 0x0080837c
0083b8e4	mov x0,x20
0083b8e8	mov w1,#0xffffd8ee
0083b8ec	mov x2,x19
0083b8f0	bl 0x008ad800
0083b8f4	ldr x8,[x25, #0x28]
0083b8f8	ldr x9,[sp, #0x8]
0083b8fc	cmp x8,x9
0083b900	b.ne 0x0083b920
0083b904	ldp x20,x19,[sp, #0x50]
0083b908	ldr x25,[sp, #0x20]
0083b90c	ldp x22,x21,[sp, #0x40]
0083b910	ldp x24,x23,[sp, #0x30]
0083b914	ldp x29,x30,[sp, #0x10]
0083b918	add sp,sp,#0x60
0083b91c	ret
0083b920	bl 0x00c2fec0
