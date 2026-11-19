; X509_STORE_load_store_ex @ 00b09e4c
00b09e4c	stp x22,x21,[sp, #-0x30]!
00b09e50	stp x20,x19,[sp, #0x10]
00b09e54	stp x29,x30,[sp, #0x20]
00b09e58	add x29,sp,#0x20
00b09e5c	cbz x1,0x00b09eac
00b09e60	mov x19,x3
00b09e64	mov x20,x2
00b09e68	mov x21,x1
00b09e6c	mov x22,x0
00b09e70	bl 0x00c35b40
00b09e74	mov x1,x0
00b09e78	mov x0,x22
00b09e7c	bl 0x00c32c00
00b09e80	cbz x0,0x00b09eac
00b09e84	orr w1,wzr,#0x3
00b09e88	mov x2,x21
00b09e8c	mov x3,xzr
00b09e90	mov x4,xzr
00b09e94	mov x5,x20
00b09e98	mov x6,x19
00b09e9c	bl 0x00c35b20
00b09ea0	cmp w0,#0x0
00b09ea4	cset w0,ne
00b09ea8	b 0x00b09eb0
00b09eac	mov w0,wzr
00b09eb0	ldp x29,x30,[sp, #0x20]
00b09eb4	ldp x20,x19,[sp, #0x10]
00b09eb8	ldp x22,x21,[sp], #0x30
00b09ebc	ret
