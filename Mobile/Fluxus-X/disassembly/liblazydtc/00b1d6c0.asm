; ossl_d2i_DH_PUBKEY @ 00b1d6c0
00b1d6c0	sub sp,sp,#0x40
00b1d6c4	stp x22,x21,[sp, #0x10]
00b1d6c8	stp x20,x19,[sp, #0x20]
00b1d6cc	stp x29,x30,[sp, #0x30]
00b1d6d0	ldr x8,[x1]
00b1d6d4	mov x20,x1
00b1d6d8	mov x19,x0
00b1d6dc	add x1,sp,#0x8
00b1d6e0	mov w5,#0x1
00b1d6e4	mov x0,xzr
00b1d6e8	mov x3,xzr
00b1d6ec	mov x4,xzr
00b1d6f0	add x29,sp,#0x30
00b1d6f4	str x8,[sp, #0x8]
00b1d6f8	bl 0x00b1d214
00b1d6fc	cbz x0,0x00b1d74c
00b1d700	mov x22,x0
00b1d704	bl 0x00c324b0
00b1d708	cmp w0,#0x1c
00b1d70c	b.ne 0x00b1d744
00b1d710	mov x0,x22
00b1d714	bl 0x00c3d930
00b1d718	mov x21,x0
00b1d71c	mov x0,x22
00b1d720	bl 0x00c32450
00b1d724	cbz x21,0x00b1d750
00b1d728	ldr x8,[sp, #0x8]
00b1d72c	str x8,[x20]
00b1d730	cbz x19,0x00b1d750
00b1d734	ldr x0,[x19]
00b1d738	bl 0x00c39ab0
00b1d73c	str x21,[x19]
00b1d740	b 0x00b1d750
00b1d744	mov x0,x22
00b1d748	bl 0x00c32450
00b1d74c	mov x21,xzr
00b1d750	mov x0,x21
00b1d754	ldp x29,x30,[sp, #0x30]
00b1d758	ldp x20,x19,[sp, #0x20]
00b1d75c	ldp x22,x21,[sp, #0x10]
00b1d760	add sp,sp,#0x40
00b1d764	ret
