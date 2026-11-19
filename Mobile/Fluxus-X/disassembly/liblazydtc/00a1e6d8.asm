; DH_compute_key_padded @ 00a1e6d8
00a1e6d8	stp x22,x21,[sp, #-0x30]!
00a1e6dc	stp x20,x19,[sp, #0x10]
00a1e6e0	stp x29,x30,[sp, #0x20]
00a1e6e4	ldr x8,[x2, #0xb8]
00a1e6e8	add x29,sp,#0x20
00a1e6ec	mov x20,x2
00a1e6f0	mov x19,x0
00a1e6f4	ldr x8,[x8, #0x10]
00a1e6f8	blr x8
00a1e6fc	mov w21,w0
00a1e700	cmp w0,#0x1
00a1e704	b.lt 0x00a1e758
00a1e708	ldr x0,[x20, #0x8]
00a1e70c	bl 0x00c322f0
00a1e710	add w8,w0,#0x7
00a1e714	add w9,w0,#0xe
00a1e718	cmp w8,#0x0
00a1e71c	csel w8,w9,w8,lt
00a1e720	asr w20,w8,#0x3
00a1e724	sub w8,w20,w21
00a1e728	cmp w8,#0x1
00a1e72c	b.lt 0x00a1e75c
00a1e730	sxtw x22,w8
00a1e734	add x0,x19,x22
00a1e738	sxtw x2,w21
00a1e73c	mov x1,x19
00a1e740	bl 0x00c2ff60
00a1e744	mov x0,x19
00a1e748	mov w1,wzr
00a1e74c	mov x2,x22
00a1e750	bl 0x00c301c0
00a1e754	b 0x00a1e75c
00a1e758	mov w20,w21
00a1e75c	mov w0,w20
00a1e760	ldp x29,x30,[sp, #0x20]
00a1e764	ldp x20,x19,[sp, #0x10]
00a1e768	ldp x22,x21,[sp], #0x30
00a1e76c	ret
