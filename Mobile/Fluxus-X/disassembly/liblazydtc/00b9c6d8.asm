; mbedtls_hmac_drbg_random_with_add @ 00b9c6d8
00b9c6d8	sub sp,sp,#0x1f0
00b9c6dc	stp x28,x27,[sp, #0x190]
00b9c6e0	stp x26,x25,[sp, #0x1a0]
00b9c6e4	stp x24,x23,[sp, #0x1b0]
00b9c6e8	stp x22,x21,[sp, #0x1c0]
00b9c6ec	stp x20,x19,[sp, #0x1d0]
00b9c6f0	stp x29,x30,[sp, #0x1e0]
00b9c6f4	add x29,sp,#0x1e0
00b9c6f8	mrs x28,tpidr_el0
00b9c6fc	ldr x8,[x28, #0x28]
00b9c700	mov x19,x0
00b9c704	mov x23,x4
00b9c708	mov x20,x3
00b9c70c	stur x8,[x29, #-0x60]
00b9c710	ldr x0,[x0]
00b9c714	mov x21,x2
00b9c718	mov x22,x1
00b9c71c	bl 0x00c302d0
00b9c720	cmp x21,#0x400
00b9c724	mov w24,w0
00b9c728	b.ls 0x00b9c734
00b9c72c	orr w25,wzr,#0xfffffffd
00b9c730	b 0x00b9c740
00b9c734	cmp x23,#0x100
00b9c738	b.ls 0x00b9c774
00b9c73c	orr w25,wzr,#0xfffffffb
00b9c740	ldr x8,[x28, #0x28]
00b9c744	ldur x9,[x29, #-0x60]
00b9c748	cmp x8,x9
00b9c74c	b.ne 0x00b9c8f4
00b9c750	mov w0,w25
00b9c754	ldp x29,x30,[sp, #0x1e0]
00b9c758	ldp x20,x19,[sp, #0x1d0]
00b9c75c	ldp x22,x21,[sp, #0x1c0]
00b9c760	ldp x24,x23,[sp, #0x1b0]
00b9c764	ldp x26,x25,[sp, #0x1a0]
00b9c768	ldp x28,x27,[sp, #0x190]
00b9c76c	add sp,sp,#0x1f0
00b9c770	ret
00b9c774	ldr x26,[x19, #0x70]
00b9c778	cbz x26,0x00b9c7d4
00b9c77c	ldr w8,[x19, #0x68]
00b9c780	cmp w8,#0x1
00b9c784	b.eq 0x00b9c798
00b9c788	ldr w8,[x19, #0x58]
00b9c78c	ldr w9,[x19, #0x6c]
00b9c790	cmp w8,w9
00b9c794	b.le 0x00b9c7d4
00b9c798	ldr x25,[x19, #0x60]
00b9c79c	add x8,x25,x23
00b9c7a0	cmp x8,#0x180
00b9c7a4	b.hi 0x00b9c73c
00b9c7a8	mov x0,sp
00b9c7ac	orr w2,wzr,#0x180
00b9c7b0	mov w1,wzr
00b9c7b4	bl 0x00c301c0
00b9c7b8	ldr x0,[x19, #0x78]
00b9c7bc	mov x1,sp
00b9c7c0	mov x2,x25
00b9c7c4	blr x26
00b9c7c8	cbz w0,0x00b9c888
00b9c7cc	orr w25,wzr,#0xfffffff7
00b9c7d0	b 0x00b9c740
00b9c7d4	cbz x20,0x00b9c7f4
00b9c7d8	cbz x23,0x00b9c7f4
00b9c7dc	mov x0,x19
00b9c7e0	mov x1,x20
00b9c7e4	mov x2,x23
00b9c7e8	bl 0x00c428c0
00b9c7ec	mov w25,w0
00b9c7f0	cbnz w0,0x00b9c740
00b9c7f4	cbz x21,0x00b9c860
00b9c7f8	and x24,x24,#0xff
00b9c7fc	add x26,x19,#0x18
00b9c800	cmp x21,x24
00b9c804	mov x0,x19
00b9c808	csel x27,x24,x21,hi
00b9c80c	bl 0x00c42960
00b9c810	mov w25,w0
00b9c814	cbnz w0,0x00b9c740
00b9c818	mov x0,x19
00b9c81c	mov x1,x26
00b9c820	mov x2,x24
00b9c824	bl 0x00c42980
00b9c828	mov w25,w0
00b9c82c	cbnz w0,0x00b9c740
00b9c830	mov x0,x19
00b9c834	mov x1,x26
00b9c838	bl 0x00c42950
00b9c83c	mov w25,w0
00b9c840	cbnz w0,0x00b9c740
00b9c844	mov x0,x22
00b9c848	mov x1,x26
00b9c84c	mov x2,x27
00b9c850	bl 0x00c2ffd0
00b9c854	subs x21,x21,x27
00b9c858	add x22,x22,x27
00b9c85c	b.ne 0x00b9c800
00b9c860	mov x0,x19
00b9c864	mov x1,x20
00b9c868	mov x2,x23
00b9c86c	bl 0x00c428c0
00b9c870	mov w25,w0
00b9c874	cbnz w0,0x00b9c740
00b9c878	ldr w8,[x19, #0x58]
00b9c87c	add w8,w8,#0x1
00b9c880	str w8,[x19, #0x58]
00b9c884	b 0x00b9c740
00b9c888	ldr x26,[x19, #0x60]
00b9c88c	cbz x20,0x00b9c8ac
00b9c890	cbz x23,0x00b9c8ac
00b9c894	mov x8,sp
00b9c898	add x0,x8,x26
00b9c89c	mov x1,x20
00b9c8a0	mov x2,x23
00b9c8a4	bl 0x00c2ffd0
00b9c8a8	add x26,x26,x23
00b9c8ac	mov x1,sp
00b9c8b0	mov x0,x19
00b9c8b4	mov x2,x26
00b9c8b8	bl 0x00c428c0
00b9c8bc	mov w25,w0
00b9c8c0	cbz w0,0x00b9c8d4
00b9c8c4	mov x0,sp
00b9c8c8	mov x1,x26
00b9c8cc	bl 0x00c42220
00b9c8d0	b 0x00b9c740
00b9c8d4	mov w8,#0x1
00b9c8d8	mov x0,sp
00b9c8dc	mov x1,x26
00b9c8e0	str w8,[x19, #0x58]
00b9c8e4	bl 0x00c42220
00b9c8e8	mov x23,xzr
00b9c8ec	cbnz x21,0x00b9c7f8
00b9c8f0	b 0x00b9c860
00b9c8f4	bl 0x00c2fec0
