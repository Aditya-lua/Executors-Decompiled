; SCT_LIST_print @ 00afd860
00afd860	stp x26,x25,[sp, #-0x50]!
00afd864	stp x24,x23,[sp, #0x10]
00afd868	stp x22,x21,[sp, #0x20]
00afd86c	stp x20,x19,[sp, #0x30]
00afd870	stp x29,x30,[sp, #0x40]
00afd874	add x29,sp,#0x40
00afd878	mov x19,x4
00afd87c	mov x20,x3
00afd880	mov w21,w2
00afd884	mov x22,x1
00afd888	mov x23,x0
00afd88c	bl 0x00c325e0
00afd890	cmp w0,#0x1
00afd894	b.lt 0x00afd8f4
00afd898	adrp x26,0x2b6000
00afd89c	mov w24,w0
00afd8a0	mov w25,wzr
00afd8a4	add x26,x26,#0xc62
00afd8a8	mov x0,x23
00afd8ac	mov w1,w25
00afd8b0	bl 0x00c32610
00afd8b4	mov x1,x22
00afd8b8	mov w2,w21
00afd8bc	mov x3,x19
00afd8c0	bl 0x00afd54c
00afd8c4	mov x0,x23
00afd8c8	bl 0x00c325e0
00afd8cc	sub w8,w0,#0x1
00afd8d0	cmp w25,w8
00afd8d4	b.ge 0x00afd8e8
00afd8d8	mov x0,x22
00afd8dc	mov x1,x26
00afd8e0	mov x2,x20
00afd8e4	bl 0x00c32250
00afd8e8	add w25,w25,#0x1
00afd8ec	cmp w24,w25
00afd8f0	b.ne 0x00afd8a8
00afd8f4	ldp x29,x30,[sp, #0x40]
00afd8f8	ldp x20,x19,[sp, #0x30]
00afd8fc	ldp x22,x21,[sp, #0x20]
00afd900	ldp x24,x23,[sp, #0x10]
00afd904	ldp x26,x25,[sp], #0x50
00afd908	ret
