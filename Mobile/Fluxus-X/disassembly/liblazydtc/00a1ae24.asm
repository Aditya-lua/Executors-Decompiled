; BN_is_prime_ex @ 00a1ae24
00a1ae24	stp x22,x21,[sp, #-0x30]!
00a1ae28	stp x20,x19,[sp, #0x10]
00a1ae2c	stp x29,x30,[sp, #0x20]
00a1ae30	add x29,sp,#0x20
00a1ae34	mov x19,x3
00a1ae38	mov x20,x2
00a1ae3c	mov w21,w1
00a1ae40	mov x22,x0
00a1ae44	bl 0x00c322f0
00a1ae48	cmp w0,#0x800
00a1ae4c	mov w8,#0x40
00a1ae50	mov w9,#0x80
00a1ae54	mov x2,x20
00a1ae58	mov x4,x19
00a1ae5c	ldp x29,x30,[sp, #0x20]
00a1ae60	ldp x20,x19,[sp, #0x10]
00a1ae64	csel w8,w9,w8,gt
00a1ae68	cmp w8,w21
00a1ae6c	csel w1,w8,w21,gt
00a1ae70	mov x0,x22
00a1ae74	mov w3,wzr
00a1ae78	ldp x22,x21,[sp], #0x30
00a1ae7c	b 0x00a1abb8
