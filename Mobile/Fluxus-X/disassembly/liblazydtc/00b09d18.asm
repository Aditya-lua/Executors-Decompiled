; X509_STORE_load_file_ex @ 00b09d18
00b09d18	stp x22,x21,[sp, #-0x30]!
00b09d1c	stp x20,x19,[sp, #0x10]
00b09d20	stp x29,x30,[sp, #0x20]
00b09d24	add x29,sp,#0x20
00b09d28	cbz x1,0x00b09d78
00b09d2c	mov x19,x3
00b09d30	mov x20,x2
00b09d34	mov x21,x1
00b09d38	mov x22,x0
00b09d3c	bl 0x00c32b90
00b09d40	mov x1,x0
00b09d44	mov x0,x22
00b09d48	bl 0x00c32c00
00b09d4c	cbz x0,0x00b09d78
00b09d50	mov w1,#0x1
00b09d54	mov w3,#0x1
00b09d58	mov x2,x21
00b09d5c	mov x4,xzr
00b09d60	mov x5,x20
00b09d64	mov x6,x19
00b09d68	bl 0x00c35b20
00b09d6c	cmp w0,#0x0
00b09d70	cset w0,gt
00b09d74	b 0x00b09d7c
00b09d78	mov w0,wzr
00b09d7c	ldp x29,x30,[sp, #0x20]
00b09d80	ldp x20,x19,[sp, #0x10]
00b09d84	ldp x22,x21,[sp], #0x30
00b09d88	ret
