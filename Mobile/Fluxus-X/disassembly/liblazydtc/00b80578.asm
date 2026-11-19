; mbedtls_mpi_mod_int @ 00b80578
00b80578	cbz x2,0x00b805ac
00b8057c	tbnz x2,#0x3f,0x00b805c4
00b80580	cmp x2,#0x1
00b80584	b.eq 0x00b805b8
00b80588	ldrh w9,[x1, #0xa]
00b8058c	cbz x9,0x00b805b8
00b80590	cmp x2,#0x2
00b80594	b.ne 0x00b805d0
00b80598	ldr x9,[x1]
00b8059c	mov w8,wzr
00b805a0	ldr x9,[x9]
00b805a4	and x9,x9,#0x1
00b805a8	b 0x00b8061c
00b805ac	mov w8,#0xfffffff4
00b805b0	mov w0,w8
00b805b4	ret
00b805b8	str xzr,[x0]
00b805bc	mov w0,wzr
00b805c0	ret
00b805c4	mov w8,#0xfffffff6
00b805c8	mov w0,w8
00b805cc	ret
00b805d0	ldr x8,[x1]
00b805d4	mov x10,xzr
00b805d8	sub x9,x9,#0x1
00b805dc	ldr x11,[x8, x9, LSL #0x3]
00b805e0	sub x9,x9,#0x1
00b805e4	cmn x9,#0x1
00b805e8	extr x10,x10,x11,#0x20
00b805ec	udiv x12,x10,x2
00b805f0	msub w10,w12,w2,w10
00b805f4	bfm x11,x10,#0x20,#0x1f
00b805f8	udiv x10,x11,x2
00b805fc	msub x10,x10,x2,x11
00b80600	b.ne 0x00b805dc
00b80604	ldrsh w9,[x1, #0x8]
00b80608	sub x11,x2,x10
00b8060c	mov w8,wzr
00b80610	cmp w9,#0x0
00b80614	ccmp x10,#0x0,#0x4,lt
00b80618	csel x9,x11,x10,ne
00b8061c	str x9,[x0]
00b80620	mov w0,w8
00b80624	ret
