; ossl_rsa_pss_params_create @ 00acd6f0
00acd6f0	stp x22,x21,[sp, #-0x30]!
00acd6f4	stp x20,x19,[sp, #0x10]
00acd6f8	stp x29,x30,[sp, #0x20]
00acd6fc	add x29,sp,#0x20
00acd700	mov w22,w2
00acd704	mov x20,x1
00acd708	mov x21,x0
00acd70c	bl 0x00c3fa60
00acd710	mov x19,x0
00acd714	cbz x0,0x00acd770
00acd718	cmp w22,#0x14
00acd71c	b.eq 0x00acd738
00acd720	bl 0x00c37f30
00acd724	str x0,[x19, #0x10]
00acd728	cbz x0,0x00acd770
00acd72c	sxtw x1,w22
00acd730	bl 0x00c375b0
00acd734	cbz w0,0x00acd770
00acd738	mov x0,x19
00acd73c	mov x1,x21
00acd740	bl 0x00c382a0
00acd744	cbz w0,0x00acd770
00acd748	cmp x20,#0x0
00acd74c	csel x20,x21,x20,eq
00acd750	add x0,x19,#0x8
00acd754	mov x1,x20
00acd758	bl 0x00c38280
00acd75c	cbz w0,0x00acd770
00acd760	add x0,x19,#0x20
00acd764	mov x1,x20
00acd768	bl 0x00c382a0
00acd76c	cbnz w0,0x00acd77c
00acd770	mov x0,x19
00acd774	bl 0x00c3fa40
00acd778	mov x19,xzr
00acd77c	mov x0,x19
00acd780	ldp x29,x30,[sp, #0x20]
00acd784	ldp x20,x19,[sp, #0x10]
00acd788	ldp x22,x21,[sp], #0x30
00acd78c	ret
