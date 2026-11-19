; ossl_DER_w_end_sequence @ 00b4b8a8
00b4b8a8	sub sp,sp,#0x40
00b4b8ac	stp x20,x19,[sp, #0x20]
00b4b8b0	mov w20,w1
00b4b8b4	add x1,sp,#0x8
00b4b8b8	stp x29,x30,[sp, #0x30]
00b4b8bc	add x29,sp,#0x30
00b4b8c0	mov x19,x0
00b4b8c4	bl 0x00c34370
00b4b8c8	cbz w0,0x00b4b968
00b4b8cc	mov x0,x19
00b4b8d0	bl 0x00c34350
00b4b8d4	cbz w0,0x00b4b968
00b4b8d8	mov x1,sp
00b4b8dc	mov x0,x19
00b4b8e0	bl 0x00c34370
00b4b8e4	cbz w0,0x00b4b968
00b4b8e8	ldp x9,x8,[sp]
00b4b8ec	cmp x8,x9
00b4b8f0	b.ne 0x00b4b954
00b4b8f4	mov w1,#0x2
00b4b8f8	mov x0,x19
00b4b8fc	bl 0x00c36e80
00b4b900	cbz w0,0x00b4b968
00b4b904	tbnz w20,#0x1f,0x00b4b94c
00b4b908	cmp w20,#0x1e
00b4b90c	mov w0,wzr
00b4b910	b.gt 0x00b4b968
00b4b914	add x1,sp,#0x18
00b4b918	mov x0,x19
00b4b91c	bl 0x00c34370
00b4b920	cbz w0,0x00b4b968
00b4b924	mov x0,x19
00b4b928	bl 0x00c34350
00b4b92c	cbz w0,0x00b4b968
00b4b930	add x1,sp,#0x10
00b4b934	mov x0,x19
00b4b938	bl 0x00c34370
00b4b93c	cbz w0,0x00b4b968
00b4b940	ldp x9,x8,[sp, #0x10]
00b4b944	cmp x8,x9
00b4b948	b.ne 0x00b4b978
00b4b94c	mov w0,#0x1
00b4b950	b 0x00b4b968
00b4b954	orr w1,wzr,#0x30
00b4b958	mov w2,#0x1
00b4b95c	mov x0,x19
00b4b960	bl 0x00c343a0
00b4b964	cbnz w0,0x00b4b904
00b4b968	ldp x29,x30,[sp, #0x30]
00b4b96c	ldp x20,x19,[sp, #0x20]
00b4b970	add sp,sp,#0x40
00b4b974	ret
00b4b978	mov w8,#0xa0
00b4b97c	orr w8,w20,w8
00b4b980	sxtw x1,w8
00b4b984	mov w2,#0x1
00b4b988	mov x0,x19
00b4b98c	bl 0x00c343a0
00b4b990	cmp w0,#0x0
00b4b994	cset w0,ne
00b4b998	b 0x00b4b968
