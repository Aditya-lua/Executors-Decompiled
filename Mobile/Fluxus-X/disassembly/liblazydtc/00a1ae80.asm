; ossl_bn_check_prime @ 00a1ae80
00a1ae80	str x23,[sp, #-0x40]!
00a1ae84	stp x22,x21,[sp, #0x10]
00a1ae88	stp x20,x19,[sp, #0x20]
00a1ae8c	stp x29,x30,[sp, #0x30]
00a1ae90	add x29,sp,#0x30
00a1ae94	mov x19,x4
00a1ae98	mov w20,w3
00a1ae9c	mov x21,x2
00a1aea0	mov w22,w1
00a1aea4	mov x23,x0
00a1aea8	bl 0x00c322f0
00a1aeac	cmp w0,#0x800
00a1aeb0	mov w8,#0x40
00a1aeb4	mov w9,#0x80
00a1aeb8	csel w8,w9,w8,gt
00a1aebc	cmp w8,w22
00a1aec0	csel w1,w8,w22,gt
00a1aec4	mov x2,x21
00a1aec8	mov w3,w20
00a1aecc	mov x4,x19
00a1aed0	ldp x29,x30,[sp, #0x30]
00a1aed4	ldp x20,x19,[sp, #0x20]
00a1aed8	ldp x22,x21,[sp, #0x10]
00a1aedc	mov x0,x23
00a1aee0	ldr x23,[sp], #0x40
00a1aee4	b 0x00a1abb8
