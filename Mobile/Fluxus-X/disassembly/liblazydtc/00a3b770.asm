; ossl_ec_GFp_simple_ladder_pre @ 00a3b770
00a3b770	stp x28,x27,[sp, #-0x60]!
00a3b774	stp x26,x25,[sp, #0x10]
00a3b778	stp x24,x23,[sp, #0x20]
00a3b77c	stp x22,x21,[sp, #0x30]
00a3b780	stp x20,x19,[sp, #0x40]
00a3b784	stp x29,x30,[sp, #0x50]
00a3b788	ldr w8,[x3, #0x28]
00a3b78c	add x29,sp,#0x50
00a3b790	cbz w8,0x00a3b9cc
00a3b794	ldr x8,[x0]
00a3b798	ldr x26,[x2, #0x10]
00a3b79c	mov x19,x2
00a3b7a0	ldp x28,x25,[x2, #0x18]
00a3b7a4	ldr x8,[x8, #0x100]
00a3b7a8	ldr x2,[x3, #0x10]
00a3b7ac	ldr x24,[x1, #0x20]
00a3b7b0	ldr x27,[x1, #0x10]
00a3b7b4	mov x22,x3
00a3b7b8	mov x20,x1
00a3b7bc	mov x1,x26
00a3b7c0	mov x3,x4
00a3b7c4	mov x21,x4
00a3b7c8	mov x23,x0
00a3b7cc	blr x8
00a3b7d0	cbz w0,0x00a3b9d0
00a3b7d4	ldr x2,[x23, #0x60]
00a3b7d8	ldr x3,[x23, #0x40]
00a3b7dc	mov x0,x27
00a3b7e0	mov x1,x26
00a3b7e4	bl 0x00c38f20
00a3b7e8	cbz w0,0x00a3b9d0
00a3b7ec	ldr x8,[x23]
00a3b7f0	mov x0,x23
00a3b7f4	mov x1,x27
00a3b7f8	mov x2,x27
00a3b7fc	ldr x8,[x8, #0x100]
00a3b800	mov x3,x21
00a3b804	blr x8
00a3b808	cbz w0,0x00a3b9d0
00a3b80c	ldr x8,[x23]
00a3b810	ldr x2,[x22, #0x10]
00a3b814	ldr x3,[x23, #0x68]
00a3b818	mov x0,x23
00a3b81c	ldr x8,[x8, #0xf8]
00a3b820	mov x1,x28
00a3b824	mov x4,x21
00a3b828	blr x8
00a3b82c	cbz w0,0x00a3b9d0
00a3b830	ldr x3,[x23, #0x40]
00a3b834	orr w2,wzr,#0x3
00a3b838	mov x0,x28
00a3b83c	mov x1,x28
00a3b840	bl 0x00c38ee0
00a3b844	cbz w0,0x00a3b9d0
00a3b848	ldr x0,[x20, #0x10]
00a3b84c	ldr x3,[x23, #0x40]
00a3b850	mov x1,x27
00a3b854	mov x2,x28
00a3b858	bl 0x00c38f20
00a3b85c	cbz w0,0x00a3b9d0
00a3b860	ldr x2,[x23, #0x60]
00a3b864	ldr x3,[x23, #0x40]
00a3b868	mov x0,x25
00a3b86c	mov x1,x26
00a3b870	bl 0x00c38ec0
00a3b874	cbz w0,0x00a3b9d0
00a3b878	ldr x8,[x23]
00a3b87c	ldr x2,[x22, #0x10]
00a3b880	mov x0,x23
00a3b884	mov x1,x24
00a3b888	ldr x8,[x8, #0xf8]
00a3b88c	mov x3,x25
00a3b890	mov x4,x21
00a3b894	blr x8
00a3b898	cbz w0,0x00a3b9d0
00a3b89c	ldr x1,[x23, #0x68]
00a3b8a0	ldr x3,[x23, #0x40]
00a3b8a4	mov x0,x24
00a3b8a8	mov x2,x24
00a3b8ac	bl 0x00c38ec0
00a3b8b0	cbz w0,0x00a3b9d0
00a3b8b4	ldr x0,[x20, #0x20]
00a3b8b8	ldr x3,[x23, #0x40]
00a3b8bc	mov w2,#0x2
00a3b8c0	mov x1,x24
00a3b8c4	bl 0x00c38ee0
00a3b8c8	cbz w0,0x00a3b9d0
00a3b8cc	ldr x0,[x20, #0x18]
00a3b8d0	ldr x1,[x23, #0x40]
00a3b8d4	mov w2,wzr
00a3b8d8	mov x3,x21
00a3b8dc	bl 0x00c39160
00a3b8e0	cbz w0,0x00a3b9d0
00a3b8e4	ldr x0,[x20, #0x18]
00a3b8e8	bl 0x00c369b0
00a3b8ec	cbnz w0,0x00a3b8cc
00a3b8f0	ldr x0,[x19, #0x20]
00a3b8f4	ldr x1,[x23, #0x40]
00a3b8f8	mov w2,wzr
00a3b8fc	mov x3,x21
00a3b900	bl 0x00c39160
00a3b904	cbz w0,0x00a3b9d0
00a3b908	ldr x0,[x19, #0x20]
00a3b90c	bl 0x00c369b0
00a3b910	cbnz w0,0x00a3b8f0
00a3b914	ldr x8,[x23]
00a3b918	ldr x9,[x8, #0x118]
00a3b91c	cbz x9,0x00a3b95c
00a3b920	ldr x1,[x20, #0x18]
00a3b924	mov x0,x23
00a3b928	mov x3,x21
00a3b92c	mov x2,x1
00a3b930	blr x9
00a3b934	cbz w0,0x00a3b9d0
00a3b938	ldr x8,[x23]
00a3b93c	ldr x1,[x19, #0x20]
00a3b940	mov x0,x23
00a3b944	mov x3,x21
00a3b948	ldr x8,[x8, #0x118]
00a3b94c	mov x2,x1
00a3b950	blr x8
00a3b954	cbz w0,0x00a3b9d0
00a3b958	ldr x8,[x23]
00a3b95c	ldp x3,x1,[x20, #0x18]
00a3b960	ldr x8,[x8, #0xf8]
00a3b964	mov x0,x23
00a3b968	mov x4,x21
00a3b96c	mov x2,x1
00a3b970	blr x8
00a3b974	cbz w0,0x00a3b9d0
00a3b978	ldr x8,[x23]
00a3b97c	ldp x1,x3,[x20, #0x10]
00a3b980	mov x0,x23
00a3b984	mov x4,x21
00a3b988	ldr x8,[x8, #0xf8]
00a3b98c	mov x2,x1
00a3b990	blr x8
00a3b994	cbz w0,0x00a3b9d0
00a3b998	ldr x8,[x23]
00a3b99c	ldr x1,[x19, #0x10]
00a3b9a0	ldr x2,[x22, #0x10]
00a3b9a4	ldr x3,[x19, #0x20]
00a3b9a8	ldr x8,[x8, #0xf8]
00a3b9ac	mov x0,x23
00a3b9b0	mov x4,x21
00a3b9b4	blr x8
00a3b9b8	cbz w0,0x00a3b9d0
00a3b9bc	mov w0,#0x1
00a3b9c0	str wzr,[x20, #0x28]
00a3b9c4	str wzr,[x19, #0x28]
00a3b9c8	b 0x00a3b9d0
00a3b9cc	mov w0,wzr
00a3b9d0	ldp x29,x30,[sp, #0x50]
00a3b9d4	ldp x20,x19,[sp, #0x40]
00a3b9d8	ldp x22,x21,[sp, #0x30]
00a3b9dc	ldp x24,x23,[sp, #0x20]
00a3b9e0	ldp x26,x25,[sp, #0x10]
00a3b9e4	ldp x28,x27,[sp], #0x60
00a3b9e8	ret
