; X509_STORE_CTX_get1_issuer @ 00b0b6f0
00b0b6f0	sub sp,sp,#0x1f0
00b0b6f4	stp x22,x21,[sp, #0x1c0]
00b0b6f8	mov x21,x1
00b0b6fc	adrp x1,0x2aa000
00b0b700	stp x20,x19,[sp, #0x1d0]
00b0b704	mov x20,x2
00b0b708	mov x19,x0
00b0b70c	add x1,x1,#0xba3
00b0b710	mov w0,#0x10
00b0b714	orr w2,wzr,#0x1c0
00b0b718	str x28,[sp, #0x190]
00b0b71c	stp x26,x25,[sp, #0x1a0]
00b0b720	stp x24,x23,[sp, #0x1b0]
00b0b724	stp x29,x30,[sp, #0x1e0]
00b0b728	add x29,sp,#0x1e0
00b0b72c	bl 0x00c34250
00b0b730	cbz x0,0x00b0b7c4
00b0b734	str wzr,[x0]
00b0b738	ldr x26,[x21]
00b0b73c	mov x22,x0
00b0b740	mov x0,x20
00b0b744	stur wzr,[x29, #-0x44]
00b0b748	str xzr,[x19]
00b0b74c	bl 0x00c32cf0
00b0b750	mov x23,x0
00b0b754	mov w1,#0x1
00b0b758	mov x0,x21
00b0b75c	mov x2,x23
00b0b760	mov x3,x22
00b0b764	bl 0x00b0aa34
00b0b768	cmp w0,#0x1
00b0b76c	b.ne 0x00b0b800
00b0b770	ldr x8,[x21, #0x48]
00b0b774	ldr x2,[x22, #0x8]
00b0b778	mov x0,x21
00b0b77c	mov x1,x20
00b0b780	blr x8
00b0b784	cbz w0,0x00b0b820
00b0b788	ldr x1,[x22, #0x8]
00b0b78c	mov w2,#0xffffffff
00b0b790	mov x0,x21
00b0b794	bl 0x00c40c60
00b0b798	cbz w0,0x00b0b820
00b0b79c	ldr x8,[x22, #0x8]
00b0b7a0	adrp x1,0x2aa000
00b0b7a4	add x1,x1,#0xba3
00b0b7a8	mov w2,#0x1f3
00b0b7ac	mov x0,x22
00b0b7b0	str x8,[x19]
00b0b7b4	str wzr,[x22]
00b0b7b8	bl 0x00c32310
00b0b7bc	mov w22,#0x1
00b0b7c0	b 0x00b0b860
00b0b7c4	bl 0x00c342a0
00b0b7c8	adrp x0,0x2aa000
00b0b7cc	adrp x2,0x2b0000
00b0b7d0	add x0,x0,#0xba3
00b0b7d4	add x2,x2,#0xa62
00b0b7d8	mov w1,#0x1c3
00b0b7dc	bl 0x00c342b0
00b0b7e0	mov w1,#0x100
00b0b7e4	mov w0,#0xb
00b0b7e8	movk w1,#0xc, LSL #16
00b0b7ec	mov x2,xzr
00b0b7f0	bl 0x00c342c0
00b0b7f4	stur wzr,[x29, #-0x44]
00b0b7f8	mov w22,#0xffffffff
00b0b7fc	b 0x00b0b860
00b0b800	ldr w8,[x22]
00b0b804	cmp w8,#0x2
00b0b808	b.eq 0x00b0b840
00b0b80c	cmp w8,#0x1
00b0b810	b.ne 0x00b0b848
00b0b814	ldr x0,[x22, #0x8]
00b0b818	bl 0x00c31a90
00b0b81c	b 0x00b0b848
00b0b820	ldr w8,[x22]
00b0b824	cmp w8,#0x2
00b0b828	b.eq 0x00b0b884
00b0b82c	cmp w8,#0x1
00b0b830	b.ne 0x00b0b88c
00b0b834	ldr x0,[x22, #0x8]
00b0b838	bl 0x00c31a90
00b0b83c	b 0x00b0b88c
00b0b840	ldr x0,[x22, #0x8]
00b0b844	bl 0x00c382b0
00b0b848	adrp x1,0x2aa000
00b0b84c	add x1,x1,#0xba3
00b0b850	mov w2,#0x1f3
00b0b854	mov x0,x22
00b0b858	bl 0x00c32310
00b0b85c	mov w22,wzr
00b0b860	mov w0,w22
00b0b864	ldp x29,x30,[sp, #0x1e0]
00b0b868	ldp x20,x19,[sp, #0x1d0]
00b0b86c	ldp x22,x21,[sp, #0x1c0]
00b0b870	ldp x24,x23,[sp, #0x1b0]
00b0b874	ldp x26,x25,[sp, #0x1a0]
00b0b878	ldr x28,[sp, #0x190]
00b0b87c	add sp,sp,#0x1f0
00b0b880	ret
00b0b884	ldr x0,[x22, #0x8]
00b0b888	bl 0x00c382b0
00b0b88c	adrp x1,0x2aa000
00b0b890	add x1,x1,#0xba3
00b0b894	mov w2,#0x1f3
00b0b898	mov x0,x22
00b0b89c	bl 0x00c32310
00b0b8a0	cbz x26,0x00b0b85c
00b0b8a4	ldr x0,[x26, #0x98]
00b0b8a8	bl 0x00c356a0
00b0b8ac	cbz w0,0x00b0b85c
00b0b8b0	ldr x0,[x26, #0x8]
00b0b8b4	mov w8,#0x1
00b0b8b8	stur w8,[x29, #-0x60]
00b0b8bc	mov x8,sp
00b0b8c0	sub x1,x29,#0x60
00b0b8c4	sub x2,x29,#0x44
00b0b8c8	stur x8,[x29, #-0x58]
00b0b8cc	str x23,[sp, #0x48]
00b0b8d0	bl 0x00c40220
00b0b8d4	cmn w0,#0x1
00b0b8d8	b.eq 0x00b0b998
00b0b8dc	ldur w8,[x29, #-0x44]
00b0b8e0	mov w22,wzr
00b0b8e4	cmp w8,#0x1
00b0b8e8	b.lt 0x00b0b99c
00b0b8ec	mov w23,w0
00b0b8f0	mov w22,wzr
00b0b8f4	mov w24,w0
00b0b8f8	ldr x0,[x26, #0x8]
00b0b8fc	mov w1,w24
00b0b900	bl 0x00c32610
00b0b904	ldr w8,[x0]
00b0b908	cmp w8,#0x1
00b0b90c	b.ne 0x00b0b99c
00b0b910	ldr x8,[x21, #0x48]
00b0b914	ldr x2,[x0, #0x8]
00b0b918	mov x25,x0
00b0b91c	mov x0,x21
00b0b920	mov x1,x20
00b0b924	blr x8
00b0b928	cbz w0,0x00b0b980
00b0b92c	ldr x1,[x25, #0x8]
00b0b930	mov w2,#0xffffffff
00b0b934	mov x0,x21
00b0b938	bl 0x00c40c60
00b0b93c	cbnz w0,0x00b0b9c0
00b0b940	ldr x8,[x19]
00b0b944	cbz x8,0x00b0b974
00b0b948	ldr x0,[x25, #0x8]
00b0b94c	bl 0x00c32c90
00b0b950	ldr x8,[x19]
00b0b954	mov x22,x0
00b0b958	mov x0,x8
00b0b95c	bl 0x00c32c90
00b0b960	mov x1,x0
00b0b964	mov x0,x22
00b0b968	bl 0x00c37910
00b0b96c	cmp w0,#0x1
00b0b970	b.lt 0x00b0b97c
00b0b974	ldr x8,[x25, #0x8]
00b0b978	str x8,[x19]
00b0b97c	mov w22,#0x1
00b0b980	ldur w8,[x29, #-0x44]
00b0b984	add w24,w24,#0x1
00b0b988	add w8,w8,w23
00b0b98c	cmp w24,w8
00b0b990	b.lt 0x00b0b8f8
00b0b994	b 0x00b0b99c
00b0b998	mov w22,wzr
00b0b99c	ldr x0,[x19]
00b0b9a0	cbz x0,0x00b0b9b4
00b0b9a4	bl 0x00c350b0
00b0b9a8	cbnz w0,0x00b0b9b4
00b0b9ac	mov w22,#0xffffffff
00b0b9b0	str xzr,[x19]
00b0b9b4	ldr x0,[x26, #0x98]
00b0b9b8	bl 0x00c35690
00b0b9bc	b 0x00b0b860
00b0b9c0	ldr x0,[x25, #0x8]
00b0b9c4	mov w22,#0x1
00b0b9c8	str x0,[x19]
00b0b9cc	cbnz x0,0x00b0b9a4
00b0b9d0	b 0x00b0b9b4
