; OSSL_ENCODER_CTX_set_cipher @ 00a62704
00a62704	sub sp,sp,#0xe0
00a62708	str x21,[sp, #0xb0]
00a6270c	stp x20,x19,[sp, #0xc0]
00a62710	mov x19,x2
00a62714	mov x20,x1
00a62718	mov x21,x0
00a6271c	add x0,sp,#0x30
00a62720	orr w2,wzr,#0x78
00a62724	mov w1,wzr
00a62728	stp x29,x30,[sp, #0xd0]
00a6272c	add x29,sp,#0xd0
00a62730	bl 0x00c301c0
00a62734	adrp x0,0x2ad000
00a62738	add x0,x0,#0x804
00a6273c	add x8,sp,#0x8
00a62740	mov x1,x20
00a62744	mov x2,xzr
00a62748	bl 0x00c36280
00a6274c	ldr x8,[sp, #0x28]
00a62750	ldur q0,[sp, #0x18]
00a62754	ldur q1,[sp, #0x8]
00a62758	adrp x0,0x2d3000
00a6275c	str x8,[sp, #0x50]
00a62760	add x0,x0,#0x7c2
00a62764	add x8,sp,#0x8
00a62768	mov x1,x19
00a6276c	mov x2,xzr
00a62770	stp q1,q0,[sp, #0x30]
00a62774	bl 0x00c36280
00a62778	ldr x8,[sp, #0x28]
00a6277c	ldur q0,[sp, #0x18]
00a62780	ldur q1,[sp, #0x8]
00a62784	add x1,sp,#0x30
00a62788	mov x0,x21
00a6278c	str x8,[sp, #0x78]
00a62790	stur q0,[sp, #0x68]
00a62794	stur q1,[sp, #0x58]
00a62798	bl 0x00c3b8b0
00a6279c	ldp x29,x30,[sp, #0xd0]
00a627a0	ldp x20,x19,[sp, #0xc0]
00a627a4	ldr x21,[sp, #0xb0]
00a627a8	add sp,sp,#0xe0
00a627ac	ret
