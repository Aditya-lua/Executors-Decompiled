; mbedtls_hmac_drbg_seed @ 00b9c518
00b9c518	sub sp,sp,#0x1f0
00b9c51c	stp x28,x27,[sp, #0x190]
00b9c520	stp x26,x25,[sp, #0x1a0]
00b9c524	stp x24,x23,[sp, #0x1b0]
00b9c528	stp x22,x21,[sp, #0x1c0]
00b9c52c	stp x20,x19,[sp, #0x1d0]
00b9c530	stp x29,x30,[sp, #0x1e0]
00b9c534	add x29,sp,#0x1e0
00b9c538	mrs x27,tpidr_el0
00b9c53c	ldr x8,[x27, #0x28]
00b9c540	mov x22,x2
00b9c544	mov w2,#0x1
00b9c548	mov x20,x5
00b9c54c	mov x21,x4
00b9c550	mov x23,x3
00b9c554	mov x25,x1
00b9c558	mov x19,x0
00b9c55c	stur x8,[x29, #-0x60]
00b9c560	bl 0x00c42850
00b9c564	mov w24,w0
00b9c568	cbnz w0,0x00b9c630
00b9c56c	mov x0,x25
00b9c570	bl 0x00c302d0
00b9c574	and x25,x0,#0xff
00b9c578	add x26,x19,#0x18
00b9c57c	mov x0,x19
00b9c580	mov x1,x26
00b9c584	mov x2,x25
00b9c588	bl 0x00c42970
00b9c58c	mov w24,w0
00b9c590	cbnz w0,0x00b9c630
00b9c594	mov w1,#0x1
00b9c598	mov x0,x26
00b9c59c	mov x2,x25
00b9c5a0	bl 0x00c301c0
00b9c5a4	ldr x26,[x19, #0x60]
00b9c5a8	stp x22,x23,[x19, #0x70]
00b9c5ac	cbnz x26,0x00b9c5d0
00b9c5b0	cmp w25,#0x1d
00b9c5b4	mov w8,#0x20
00b9c5b8	orr w9,wzr,#0x18
00b9c5bc	csel x8,x9,x8,cc
00b9c5c0	cmp w25,#0x15
00b9c5c4	mov w9,#0x10
00b9c5c8	csel x26,x9,x8,cc
00b9c5cc	str x26,[x19, #0x60]
00b9c5d0	cmp x20,#0x100
00b9c5d4	orr w24,wzr,#0xfffffffb
00b9c5d8	b.hi 0x00b9c630
00b9c5dc	add x8,x26,x26, LSL #0x1
00b9c5e0	add x8,x20,x8, LSR #0x1
00b9c5e4	cmp x8,#0x180
00b9c5e8	b.hi 0x00b9c630
00b9c5ec	mov x0,sp
00b9c5f0	orr w2,wzr,#0x180
00b9c5f4	mov w1,wzr
00b9c5f8	mov x24,sp
00b9c5fc	bl 0x00c301c0
00b9c600	mov x1,sp
00b9c604	mov x0,x23
00b9c608	mov x2,x26
00b9c60c	blr x22
00b9c610	cbnz w0,0x00b9c62c
00b9c614	ldr x22,[x19, #0x60]
00b9c618	ldp x8,x0,[x19, #0x70]
00b9c61c	add x1,x24,x22
00b9c620	lsr x2,x22,#0x1
00b9c624	blr x8
00b9c628	cbz w0,0x00b9c664
00b9c62c	orr w24,wzr,#0xfffffff7
00b9c630	ldr x8,[x27, #0x28]
00b9c634	ldur x9,[x29, #-0x60]
00b9c638	cmp x8,x9
00b9c63c	b.ne 0x00b9c6bc
00b9c640	mov w0,w24
00b9c644	ldp x29,x30,[sp, #0x1e0]
00b9c648	ldp x20,x19,[sp, #0x1d0]
00b9c64c	ldp x22,x21,[sp, #0x1c0]
00b9c650	ldp x24,x23,[sp, #0x1b0]
00b9c654	ldp x26,x25,[sp, #0x1a0]
00b9c658	ldp x28,x27,[sp, #0x190]
00b9c65c	add sp,sp,#0x1f0
00b9c660	ret
00b9c664	ldr x8,[x19, #0x60]
00b9c668	add x22,x22,x8, LSR #0x1
00b9c66c	cbz x21,0x00b9c68c
00b9c670	cbz x20,0x00b9c68c
00b9c674	mov x8,sp
00b9c678	add x0,x8,x22
00b9c67c	mov x1,x21
00b9c680	mov x2,x20
00b9c684	bl 0x00c2ffd0
00b9c688	add x22,x22,x20
00b9c68c	mov x1,sp
00b9c690	mov x0,x19
00b9c694	mov x2,x22
00b9c698	bl 0x00c428c0
00b9c69c	mov w24,w0
00b9c6a0	cbnz w0,0x00b9c6ac
00b9c6a4	mov w8,#0x1
00b9c6a8	str w8,[x19, #0x58]
00b9c6ac	mov x0,sp
00b9c6b0	mov x1,x22
00b9c6b4	bl 0x00c42220
00b9c6b8	b 0x00b9c630
00b9c6bc	bl 0x00c2fec0
