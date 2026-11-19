; EVP_PKEY_free @ 00a6c7fc
00a6c7fc	stp x20,x19,[sp, #-0x20]!
00a6c800	stp x29,x30,[sp, #0x10]
00a6c804	add x29,sp,#0x10
00a6c808	cbz x0,0x00a6c838
00a6c80c	mov x19,x0
00a6c810	add x9,x0,#0x30
00a6c814	ldxr w8,[x9]
00a6c818	subs w10,w8,#0x1
00a6c81c	stxr w11,w10,[x9]
00a6c820	cbnz w11,0x00a6c814
00a6c824	b.ne 0x00a6c830
00a6c828	dmb ISHLD
00a6c82c	b 0x00a6c844
00a6c830	cmp w8,#0x1
00a6c834	b.le 0x00a6c844
00a6c838	ldp x29,x30,[sp, #0x10]
00a6c83c	ldp x20,x19,[sp], #0x20
00a6c840	ret
00a6c844	mov w1,#0x1
00a6c848	mov x0,x19
00a6c84c	bl 0x00c3d2e0
00a6c850	mov x0,x19
00a6c854	bl 0x00a6f0e0
00a6c858	mov x20,x19
00a6c85c	ldr x0,[x20, #0x60]!
00a6c860	cbz x0,0x00a6c878
00a6c864	ldr x1,[x19, #0x68]
00a6c868	bl 0x00c3b730
00a6c86c	ldr x0,[x19, #0x60]
00a6c870	bl 0x00c36350
00a6c874	stp xzr,xzr,[x20]
00a6c878	add x2,x19,#0x50
00a6c87c	mov w0,#0x11
00a6c880	mov x1,x19
00a6c884	str wzr,[x19]
00a6c888	bl 0x00c356c0
00a6c88c	ldr x0,[x19, #0x38]
00a6c890	bl 0x00c34d40
00a6c894	adrp x1,0xcb5000
00a6c898	ldr x0,[x19, #0x40]
00a6c89c	ldr x1,[x1, #0x640]
00a6c8a0	bl 0x00c32600
00a6c8a4	ldp x29,x30,[sp, #0x10]
00a6c8a8	adrp x1,0x2c1000
00a6c8ac	add x1,x1,#0xcf9
00a6c8b0	mov w2,#0x707
00a6c8b4	mov x0,x19
00a6c8b8	ldp x20,x19,[sp], #0x20
00a6c8bc	b 0x00c32310
