; ossl_DER_w_begin_sequence @ 00b4b860
00b4b860	str x19,[sp, #-0x20]!
00b4b864	mov x19,x0
00b4b868	stp x29,x30,[sp, #0x10]
00b4b86c	add x29,sp,#0x10
00b4b870	tbnz w1,#0x1f,0x00b4b88c
00b4b874	cmp w1,#0x1e
00b4b878	mov w0,wzr
00b4b87c	b.gt 0x00b4b89c
00b4b880	mov x0,x19
00b4b884	bl 0x00c37240
00b4b888	cbz w0,0x00b4b89c
00b4b88c	mov x0,x19
00b4b890	bl 0x00c37240
00b4b894	cmp w0,#0x0
00b4b898	cset w0,ne
00b4b89c	ldp x29,x30,[sp, #0x10]
00b4b8a0	ldr x19,[sp], #0x20
00b4b8a4	ret
