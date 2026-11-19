; FUN_00a46d30 @ 00a46d30
00a46d30	stp x24,x23,[sp, #-0x40]!
00a46d34	stp x22,x21,[sp, #0x10]
00a46d38	stp x20,x19,[sp, #0x20]
00a46d3c	stp x29,x30,[sp, #0x30]
00a46d40	add x29,sp,#0x30
00a46d44	mov x20,x4
00a46d48	mov x23,x3
00a46d4c	mov x21,x2
00a46d50	mov x22,x1
00a46d54	mov x24,x0
00a46d58	bl 0x00c31fa0
00a46d5c	cbz x0,0x00a46ddc
00a46d60	adrp x1,0x2cf000
00a46d64	mov x19,x0
00a46d68	add x1,x1,#0xacf
00a46d6c	mov x0,x24
00a46d70	mov x2,x20
00a46d74	bl 0x00c357f0
00a46d78	mov x20,x0
00a46d7c	cbz x0,0x00a46dc4
00a46d80	mov x0,x19
00a46d84	mov x1,x20
00a46d88	mov x2,xzr
00a46d8c	bl 0x00c31f70
00a46d90	cbz w0,0x00a46dc4
00a46d94	mov w2,#0x39
00a46d98	mov x0,x19
00a46d9c	mov x1,x23
00a46da0	bl 0x00c31f80
00a46da4	cbz w0,0x00a46dc4
00a46da8	mov x0,x19
00a46dac	mov x1,x22
00a46db0	mov x2,x21
00a46db4	bl 0x00c3b300
00a46db8	cmp w0,#0x0
00a46dbc	csetm w21,ne
00a46dc0	b 0x00a46dc8
00a46dc4	mov w21,wzr
00a46dc8	mov x0,x19
00a46dcc	bl 0x00c31f90
00a46dd0	mov x0,x20
00a46dd4	bl 0x00c35800
00a46dd8	b 0x00a46de0
00a46ddc	mov w21,wzr
00a46de0	mov w0,w21
00a46de4	ldp x29,x30,[sp, #0x30]
00a46de8	ldp x20,x19,[sp, #0x20]
00a46dec	ldp x22,x21,[sp, #0x10]
00a46df0	ldp x24,x23,[sp], #0x40
00a46df4	ret
