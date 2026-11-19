; ossl_rsa_check_pminusq_diff @ 00ada460
00ada460	stp x20,x19,[sp, #-0x20]!
00ada464	stp x29,x30,[sp, #0x10]
00ada468	add x29,sp,#0x10
00ada46c	mov w20,w3
00ada470	mov x19,x0
00ada474	bl 0x00c38880
00ada478	cbz w0,0x00ada4c8
00ada47c	mov x0,x19
00ada480	mov w1,wzr
00ada484	bl 0x00c37f50
00ada488	mov x0,x19
00ada48c	bl 0x00c369b0
00ada490	mov w8,w0
00ada494	mov w0,wzr
00ada498	cbnz w8,0x00ada4cc
00ada49c	mov w1,#0x1
00ada4a0	mov x0,x19
00ada4a4	bl 0x00c38fd0
00ada4a8	cbz w0,0x00ada4c8
00ada4ac	asr w8,w20,#0x1
00ada4b0	mov x0,x19
00ada4b4	sub w20,w8,#0x64
00ada4b8	bl 0x00c322f0
00ada4bc	cmp w0,w20
00ada4c0	cset w0,gt
00ada4c4	b 0x00ada4cc
00ada4c8	mov w0,#0xffffffff
00ada4cc	ldp x29,x30,[sp, #0x10]
00ada4d0	ldp x20,x19,[sp], #0x20
00ada4d4	ret
