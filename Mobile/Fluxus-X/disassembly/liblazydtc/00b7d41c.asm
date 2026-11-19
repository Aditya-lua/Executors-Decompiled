; mbedtls_mpi_grow @ 00b7d41c
00b7d41c	str x23,[sp, #-0x40]!
00b7d420	stp x22,x21,[sp, #0x10]
00b7d424	stp x20,x19,[sp, #0x20]
00b7d428	stp x29,x30,[sp, #0x30]
00b7d42c	add x29,sp,#0x30
00b7d430	mov w8,#0x2710
00b7d434	mov x19,x1
00b7d438	cmp x1,x8
00b7d43c	mov x20,x0
00b7d440	b.ls 0x00b7d44c
00b7d444	orr w0,wzr,#0xfffffff0
00b7d448	b 0x00b7d4a4
00b7d44c	ldrh w23,[x20, #0xa]
00b7d450	mov w0,wzr
00b7d454	cmp x23,x19
00b7d458	b.cs 0x00b7d4a4
00b7d45c	mov w1,#0x8
00b7d460	mov x0,x19
00b7d464	bl 0x00c30a30
00b7d468	mov x21,x0
00b7d46c	cbz x0,0x00b7d444
00b7d470	ldr x22,[x20]
00b7d474	cbz x22,0x00b7d498
00b7d478	lsl x23,x23,#0x3
00b7d47c	mov x0,x21
00b7d480	mov x1,x22
00b7d484	mov x2,x23
00b7d488	bl 0x00c2ffd0
00b7d48c	mov x0,x22
00b7d490	mov x1,x23
00b7d494	bl 0x00c42230
00b7d498	mov w0,wzr
00b7d49c	strh w19,[x20, #0xa]
00b7d4a0	str x21,[x20]
00b7d4a4	ldp x29,x30,[sp, #0x30]
00b7d4a8	ldp x20,x19,[sp, #0x20]
00b7d4ac	ldp x22,x21,[sp, #0x10]
00b7d4b0	ldr x23,[sp], #0x40
00b7d4b4	ret
