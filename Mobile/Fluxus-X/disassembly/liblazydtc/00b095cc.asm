; X509_find_by_issuer_and_serial @ 00b095cc
00b095cc	sub sp,sp,#0x1c0
00b095d0	str x28,[sp, #0x180]
00b095d4	stp x22,x21,[sp, #0x190]
00b095d8	stp x20,x19,[sp, #0x1a0]
00b095dc	stp x29,x30,[sp, #0x1b0]
00b095e0	add x29,sp,#0x1b0
00b095e4	cbz x0,0x00b09660
00b095e8	ldr x8,[x2, #0x10]
00b095ec	mov x19,x0
00b095f0	str x8,[sp, #0x18]
00b095f4	ldr q0,[x2]
00b095f8	str x1,[sp, #0x30]
00b095fc	stur q0,[sp, #0x8]
00b09600	bl 0x00c325e0
00b09604	cmp w0,#0x1
00b09608	b.lt 0x00b09660
00b0960c	mov x8,sp
00b09610	mov w20,wzr
00b09614	add x21,x8,#0x8
00b09618	mov x0,x19
00b0961c	mov w1,w20
00b09620	bl 0x00c32610
00b09624	cbz x0,0x00b0964c
00b09628	mov x22,x0
00b0962c	add x0,x0,#0x8
00b09630	mov x1,x21
00b09634	bl 0x00c37560
00b09638	cbnz w0,0x00b0964c
00b0963c	ldr x0,[x22, #0x30]
00b09640	ldr x1,[sp, #0x30]
00b09644	bl 0x00b08db0
00b09648	cbz w0,0x00b09664
00b0964c	mov x0,x19
00b09650	add w20,w20,#0x1
00b09654	bl 0x00c325e0
00b09658	cmp w20,w0
00b0965c	b.lt 0x00b09618
00b09660	mov x22,xzr
00b09664	mov x0,x22
00b09668	ldp x29,x30,[sp, #0x1b0]
00b0966c	ldp x20,x19,[sp, #0x1a0]
00b09670	ldp x22,x21,[sp, #0x190]
00b09674	ldr x28,[sp, #0x180]
00b09678	add sp,sp,#0x1c0
00b0967c	ret
