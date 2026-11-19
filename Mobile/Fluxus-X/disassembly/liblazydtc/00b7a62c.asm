; mbedtls_nist_kw_setkey @ 00b7a62c
00b7a62c	stp x24,x23,[sp, #-0x40]!
00b7a630	stp x22,x21,[sp, #0x10]
00b7a634	stp x20,x19,[sp, #0x20]
00b7a638	stp x29,x30,[sp, #0x30]
00b7a63c	add x29,sp,#0x30
00b7a640	mov x20,x2
00b7a644	mov w24,w1
00b7a648	mov x22,x0
00b7a64c	mov w2,#0x1
00b7a650	mov w0,w1
00b7a654	mov w1,w3
00b7a658	mov w21,w4
00b7a65c	mov w19,w3
00b7a660	bl 0x00c42160
00b7a664	mov x23,x0
00b7a668	cbz x0,0x00b7a6c4
00b7a66c	ldr w8,[x23, #0x8]
00b7a670	and w8,w8,#0x1f
00b7a674	cmp w8,#0x10
00b7a678	b.ne 0x00b7a6c4
00b7a67c	cmp w24,#0x2
00b7a680	b.ne 0x00b7a6dc
00b7a684	mov x0,x22
00b7a688	bl 0x00c30290
00b7a68c	mov x0,x22
00b7a690	mov x1,x23
00b7a694	bl 0x00c30280
00b7a698	cbnz w0,0x00b7a6c8
00b7a69c	cmp w21,#0x0
00b7a6a0	mov x0,x22
00b7a6a4	mov x1,x20
00b7a6a8	mov w2,w19
00b7a6ac	ldp x29,x30,[sp, #0x30]
00b7a6b0	ldp x20,x19,[sp, #0x20]
00b7a6b4	ldp x22,x21,[sp, #0x10]
00b7a6b8	cset w3,ne
00b7a6bc	ldp x24,x23,[sp], #0x40
00b7a6c0	b 0x00c302a0
00b7a6c4	mov w0,#0xffff9f00
00b7a6c8	ldp x29,x30,[sp, #0x30]
00b7a6cc	ldp x20,x19,[sp, #0x20]
00b7a6d0	ldp x22,x21,[sp, #0x10]
00b7a6d4	ldp x24,x23,[sp], #0x40
00b7a6d8	ret
00b7a6dc	mov w0,#0xffff9f80
00b7a6e0	b 0x00b7a6c8
