; mbedtls_ecdsa_sign_restartable @ 00b9b658
00b9b658	sub sp,sp,#0x110
00b9b65c	stp x28,x27,[sp, #0xb0]
00b9b660	stp x26,x25,[sp, #0xc0]
00b9b664	stp x24,x23,[sp, #0xd0]
00b9b668	stp x22,x21,[sp, #0xe0]
00b9b66c	stp x20,x19,[sp, #0xf0]
00b9b670	stp x29,x30,[sp, #0x100]
00b9b674	add x29,sp,#0x100
00b9b678	mrs x22,tpidr_el0
00b9b67c	ldr x8,[x22, #0x28]
00b9b680	mov x19,x7
00b9b684	mov x20,x6
00b9b688	mov x21,x5
00b9b68c	stur x8,[x29, #-0x60]
00b9b690	ldr w8,[x0]
00b9b694	mov x23,x3
00b9b698	mov x24,x2
00b9b69c	mov x25,x0
00b9b6a0	orr w8,w8,#0x4
00b9b6a4	cmp w8,#0xd
00b9b6a8	mov x26,x1
00b9b6ac	b.ne 0x00b9b6e8
00b9b6b0	mov w28,#0xffffb080
00b9b6b4	ldr x8,[x22, #0x28]
00b9b6b8	ldur x9,[x29, #-0x60]
00b9b6bc	cmp x8,x9
00b9b6c0	b.ne 0x00b9b980
00b9b6c4	mov w0,w28
00b9b6c8	ldp x29,x30,[sp, #0x100]
00b9b6cc	ldp x20,x19,[sp, #0xf0]
00b9b6d0	ldp x22,x21,[sp, #0xe0]
00b9b6d4	ldp x24,x23,[sp, #0xd0]
00b9b6d8	ldp x26,x25,[sp, #0xc0]
00b9b6dc	ldp x28,x27,[sp, #0xb0]
00b9b6e0	add sp,sp,#0x110
00b9b6e4	ret
00b9b6e8	mov x27,x25
00b9b6ec	ldr x8,[x27, #0x68]!
00b9b6f0	cbz x8,0x00b9b6b0
00b9b6f4	mov w1,#0x1
00b9b6f8	mov x0,x23
00b9b6fc	str x4,[sp, #0x20]
00b9b700	bl 0x00c41b40
00b9b704	tbnz w0,#0x1f,0x00b9b718
00b9b708	mov x0,x23
00b9b70c	mov x1,x27
00b9b710	bl 0x00c41b50
00b9b714	tbnz w0,#0x1f,0x00b9b720
00b9b718	mov w28,#0xffffb380
00b9b71c	b 0x00b9b6b4
00b9b720	ldr x8,[x29, #0x18]
00b9b724	add x0,sp,#0x70
00b9b728	str x8,[sp, #0x38]
00b9b72c	ldr x8,[x29, #0x10]
00b9b730	str x8,[sp, #0x30]
00b9b734	bl 0x00c42760
00b9b738	add x0,sp,#0x60
00b9b73c	bl 0x00c41c00
00b9b740	add x0,sp,#0x50
00b9b744	bl 0x00c41c00
00b9b748	add x0,sp,#0x40
00b9b74c	bl 0x00c41c00
00b9b750	mov w8,wzr
00b9b754	add x9,x25,#0x38
00b9b758	str x9,[sp, #0x28]
00b9b75c	str x21,[sp, #0x10]
00b9b760	cmp w8,#0xa
00b9b764	b.hi 0x00b9b958
00b9b768	add w8,w8,#0x1
00b9b76c	mov w21,#0xffffffff
00b9b770	str w8,[sp, #0x1c]
00b9b774	add w21,w21,#0x1
00b9b778	cmp w21,#0xa
00b9b77c	b.hi 0x00b9b958
00b9b780	add x1,sp,#0x60
00b9b784	mov x0,x25
00b9b788	mov x2,x20
00b9b78c	mov x3,x19
00b9b790	bl 0x00c42680
00b9b794	mov w28,w0
00b9b798	cbnz w0,0x00b9b95c
00b9b79c	ldp x3,x4,[sp, #0x28]
00b9b7a0	ldr x5,[sp, #0x38]
00b9b7a4	add x1,sp,#0x70
00b9b7a8	add x2,sp,#0x60
00b9b7ac	mov x0,x25
00b9b7b0	mov x6,xzr
00b9b7b4	bl 0x00c42710
00b9b7b8	mov w28,w0
00b9b7bc	cbnz w0,0x00b9b95c
00b9b7c0	add x1,sp,#0x70
00b9b7c4	mov x0,x26
00b9b7c8	mov x2,x27
00b9b7cc	bl 0x00c41c60
00b9b7d0	mov w28,w0
00b9b7d4	cbnz w0,0x00b9b95c
00b9b7d8	mov x0,x26
00b9b7dc	mov x1,xzr
00b9b7e0	bl 0x00c41b40
00b9b7e4	cbz w0,0x00b9b774
00b9b7e8	ldr x8,[x25, #0x80]
00b9b7ec	ldr x21,[sp, #0x10]
00b9b7f0	ldr x1,[sp, #0x20]
00b9b7f4	add x0,sp,#0x50
00b9b7f8	add x8,x8,#0x7
00b9b7fc	lsr x8,x8,#0x3
00b9b800	cmp x8,x21
00b9b804	csel x2,x8,x21,cc
00b9b808	str x2,[sp, #0x8]
00b9b80c	bl 0x00c41ca0
00b9b810	mov w28,w0
00b9b814	cbnz w0,0x00b9b95c
00b9b818	ldr x9,[sp, #0x8]
00b9b81c	ldr x8,[x25, #0x80]
00b9b820	lsl x9,x9,#0x3
00b9b824	subs x1,x9,x8
00b9b828	b.ls 0x00b9b83c
00b9b82c	add x0,sp,#0x50
00b9b830	bl 0x00c41d10
00b9b834	mov w28,w0
00b9b838	cbnz w0,0x00b9b95c
00b9b83c	add x0,sp,#0x50
00b9b840	mov x1,x27
00b9b844	bl 0x00c41b50
00b9b848	tbnz w0,#0x1f,0x00b9b864
00b9b84c	add x0,sp,#0x50
00b9b850	add x1,sp,#0x50
00b9b854	mov x2,x27
00b9b858	bl 0x00c41d60
00b9b85c	mov w28,w0
00b9b860	cbnz w0,0x00b9b95c
00b9b864	ldp x2,x3,[sp, #0x30]
00b9b868	add x1,sp,#0x40
00b9b86c	mov x0,x25
00b9b870	bl 0x00c42680
00b9b874	mov w28,w0
00b9b878	cbnz w0,0x00b9b95c
00b9b87c	mov x0,x24
00b9b880	mov x1,x26
00b9b884	mov x2,x23
00b9b888	bl 0x00c41c80
00b9b88c	mov w28,w0
00b9b890	cbnz w0,0x00b9b95c
00b9b894	add x0,sp,#0x50
00b9b898	add x1,sp,#0x50
00b9b89c	mov x2,x24
00b9b8a0	bl 0x00c41b20
00b9b8a4	mov w28,w0
00b9b8a8	cbnz w0,0x00b9b95c
00b9b8ac	add x0,sp,#0x50
00b9b8b0	add x1,sp,#0x50
00b9b8b4	add x2,sp,#0x40
00b9b8b8	bl 0x00c41c80
00b9b8bc	mov w28,w0
00b9b8c0	cbnz w0,0x00b9b95c
00b9b8c4	add x0,sp,#0x60
00b9b8c8	add x1,sp,#0x60
00b9b8cc	add x2,sp,#0x40
00b9b8d0	bl 0x00c41c80
00b9b8d4	mov w28,w0
00b9b8d8	cbnz w0,0x00b9b95c
00b9b8dc	add x0,sp,#0x60
00b9b8e0	add x1,sp,#0x60
00b9b8e4	mov x2,x27
00b9b8e8	bl 0x00c41c60
00b9b8ec	mov w28,w0
00b9b8f0	cbnz w0,0x00b9b95c
00b9b8f4	add x1,sp,#0x60
00b9b8f8	mov x0,x24
00b9b8fc	mov x2,x27
00b9b900	bl 0x00c41c10
00b9b904	mov w28,w0
00b9b908	cbnz w0,0x00b9b95c
00b9b90c	add x2,sp,#0x50
00b9b910	mov x0,x24
00b9b914	mov x1,x24
00b9b918	bl 0x00c41c80
00b9b91c	mov w28,w0
00b9b920	cbnz w0,0x00b9b95c
00b9b924	mov x0,x24
00b9b928	mov x1,x24
00b9b92c	mov x2,x27
00b9b930	bl 0x00c41c60
00b9b934	mov w28,w0
00b9b938	cbnz w0,0x00b9b95c
00b9b93c	mov x0,x24
00b9b940	mov x1,xzr
00b9b944	bl 0x00c41b40
00b9b948	ldr w8,[sp, #0x1c]
00b9b94c	cbz w0,0x00b9b760
00b9b950	mov w28,wzr
00b9b954	b 0x00b9b95c
00b9b958	mov w28,#0xffffb300
00b9b95c	add x0,sp,#0x70
00b9b960	bl 0x00c42750
00b9b964	add x0,sp,#0x60
00b9b968	bl 0x00c41bb0
00b9b96c	add x0,sp,#0x50
00b9b970	bl 0x00c41bb0
00b9b974	add x0,sp,#0x40
00b9b978	bl 0x00c41bb0
00b9b97c	b 0x00b9b6b4
00b9b980	bl 0x00c2fec0
