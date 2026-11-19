; mbedtls_mpi_shrink @ 00b7d690
00b7d690	str x23,[sp, #-0x40]!
00b7d694	stp x22,x21,[sp, #0x10]
00b7d698	stp x20,x19,[sp, #0x20]
00b7d69c	stp x29,x30,[sp, #0x30]
00b7d6a0	add x29,sp,#0x30
00b7d6a4	mov w8,#0x2710
00b7d6a8	mov x20,x1
00b7d6ac	cmp x1,x8
00b7d6b0	mov x19,x0
00b7d6b4	b.ls 0x00b7d6c0
00b7d6b8	orr w0,wzr,#0xfffffff0
00b7d6bc	b 0x00b7d77c
00b7d6c0	ldrh w23,[x19, #0xa]
00b7d6c4	cmp x23,x20
00b7d6c8	b.ls 0x00b7d72c
00b7d6cc	sub x9,x23,#0x1
00b7d6d0	mov x8,x9
00b7d6d4	cbz x9,0x00b7d6e8
00b7d6d8	ldr x9,[x19]
00b7d6dc	ldr x10,[x9, x8, LSL #0x3]
00b7d6e0	sub x9,x8,#0x1
00b7d6e4	cbz x10,0x00b7d6d0
00b7d6e8	add x9,x8,#0x1
00b7d6ec	cmp x9,x20
00b7d6f0	csinc x20,x20,x8,cc
00b7d6f4	mov w1,#0x8
00b7d6f8	mov x0,x20
00b7d6fc	bl 0x00c30a30
00b7d700	mov x21,x0
00b7d704	cbz x0,0x00b7d6b8
00b7d708	ldr x22,[x19]
00b7d70c	cbz x22,0x00b7d770
00b7d710	lsl x2,x20,#0x3
00b7d714	mov x0,x21
00b7d718	mov x1,x22
00b7d71c	bl 0x00c2ffd0
00b7d720	lsl x1,x23,#0x3
00b7d724	mov x0,x22
00b7d728	b 0x00b7d76c
00b7d72c	mov w0,wzr
00b7d730	b.cs 0x00b7d77c
00b7d734	mov w1,#0x8
00b7d738	mov x0,x20
00b7d73c	bl 0x00c30a30
00b7d740	mov x21,x0
00b7d744	cbz x0,0x00b7d6b8
00b7d748	ldr x22,[x19]
00b7d74c	cbz x22,0x00b7d770
00b7d750	lsl x23,x23,#0x3
00b7d754	mov x0,x21
00b7d758	mov x1,x22
00b7d75c	mov x2,x23
00b7d760	bl 0x00c2ffd0
00b7d764	mov x0,x22
00b7d768	mov x1,x23
00b7d76c	bl 0x00c42230
00b7d770	mov w0,wzr
00b7d774	strh w20,[x19, #0xa]
00b7d778	str x21,[x19]
00b7d77c	ldp x29,x30,[sp, #0x30]
00b7d780	ldp x20,x19,[sp, #0x20]
00b7d784	ldp x22,x21,[sp, #0x10]
00b7d788	ldr x23,[sp], #0x40
00b7d78c	ret
