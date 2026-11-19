; X509_STORE_load_file @ 00b09d8c
00b09d8c	stp x20,x19,[sp, #-0x20]!
00b09d90	stp x29,x30,[sp, #0x10]
00b09d94	add x29,sp,#0x10
00b09d98	cbz x1,0x00b09de0
00b09d9c	mov x19,x1
00b09da0	mov x20,x0
00b09da4	bl 0x00c32b90
00b09da8	mov x1,x0
00b09dac	mov x0,x20
00b09db0	bl 0x00c32c00
00b09db4	cbz x0,0x00b09de4
00b09db8	mov w1,#0x1
00b09dbc	mov w3,#0x1
00b09dc0	mov x2,x19
00b09dc4	mov x4,xzr
00b09dc8	mov x5,xzr
00b09dcc	mov x6,xzr
00b09dd0	bl 0x00c35b20
00b09dd4	cmp w0,#0x0
00b09dd8	cset w0,gt
00b09ddc	b 0x00b09de4
00b09de0	mov w0,wzr
00b09de4	ldp x29,x30,[sp, #0x10]
00b09de8	ldp x20,x19,[sp], #0x20
00b09dec	ret
