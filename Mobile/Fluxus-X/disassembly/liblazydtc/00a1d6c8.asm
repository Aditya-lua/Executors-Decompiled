; BN_reciprocal @ 00a1d6c8
00a1d6c8	str x23,[sp, #-0x40]!
00a1d6cc	stp x22,x21,[sp, #0x10]
00a1d6d0	mov x22,x0
00a1d6d4	mov x0,x3
00a1d6d8	stp x20,x19,[sp, #0x20]
00a1d6dc	stp x29,x30,[sp, #0x30]
00a1d6e0	add x29,sp,#0x30
00a1d6e4	mov x19,x3
00a1d6e8	mov w20,w2
00a1d6ec	mov x21,x1
00a1d6f0	bl 0x00c38a90
00a1d6f4	mov x0,x19
00a1d6f8	bl 0x00c38a40
00a1d6fc	cbz x0,0x00a1d734
00a1d700	mov w1,w20
00a1d704	mov x23,x0
00a1d708	bl 0x00c38db0
00a1d70c	cbz w0,0x00a1d734
00a1d710	mov x0,x22
00a1d714	mov x1,xzr
00a1d718	mov x2,x23
00a1d71c	mov x3,x21
00a1d720	mov x4,x19
00a1d724	bl 0x00c38ab0
00a1d728	cmp w0,#0x0
00a1d72c	csinv w20,w20,wzr,ne
00a1d730	b 0x00a1d738
00a1d734	mov w20,#0xffffffff
00a1d738	mov x0,x19
00a1d73c	bl 0x00c38a20
00a1d740	mov w0,w20
00a1d744	ldp x29,x30,[sp, #0x30]
00a1d748	ldp x20,x19,[sp, #0x20]
00a1d74c	ldp x22,x21,[sp, #0x10]
00a1d750	ldr x23,[sp], #0x40
00a1d754	ret
