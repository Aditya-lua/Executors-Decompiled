; mbedtls_mpi_cmp_mpi @ 00b7eda0
00b7eda0	ldrh w8,[x0, #0xa]
00b7eda4	sub x8,x8,#0x1
00b7eda8	cmn x8,#0x1
00b7edac	b.eq 0x00b7edc8
00b7edb0	ldr x9,[x0]
00b7edb4	ldr x9,[x9, x8, LSL #0x3]
00b7edb8	sub x8,x8,#0x1
00b7edbc	cbz x9,0x00b7eda8
00b7edc0	add x9,x8,#0x2
00b7edc4	b 0x00b7edcc
00b7edc8	mov x9,xzr
00b7edcc	ldrh w8,[x1, #0xa]
00b7edd0	sub x8,x8,#0x1
00b7edd4	cmn x8,#0x1
00b7edd8	b.eq 0x00b7ee00
00b7eddc	ldr x10,[x1]
00b7ede0	ldr x10,[x10, x8, LSL #0x3]
00b7ede4	sub x8,x8,#0x1
00b7ede8	cbz x10,0x00b7edd4
00b7edec	add x8,x8,#0x2
00b7edf0	orr x10,x8,x9
00b7edf4	cbnz x10,0x00b7ee0c
00b7edf8	mov w0,wzr
00b7edfc	ret
00b7ee00	mov x8,xzr
00b7ee04	orr x10,x8,x9
00b7ee08	cbz x10,0x00b7edf8
00b7ee0c	cmp x9,x8
00b7ee10	b.ls 0x00b7ee20
00b7ee14	ldrsh w8,[x0, #0x8]
00b7ee18	mov w0,w8
00b7ee1c	ret
00b7ee20	cmp x8,x9
00b7ee24	b.ls 0x00b7ee38
00b7ee28	ldrsh w8,[x1, #0x8]
00b7ee2c	neg w8,w8
00b7ee30	mov w0,w8
00b7ee34	ret
00b7ee38	ldrsh w8,[x0, #0x8]
00b7ee3c	ldrsh w10,[x1, #0x8]
00b7ee40	cmp w8,#0x1
00b7ee44	b.lt 0x00b7ee58
00b7ee48	tbz w10,#0x1f,0x00b7ee70
00b7ee4c	mov w8,#0x1
00b7ee50	mov w0,w8
00b7ee54	ret
00b7ee58	cbz w8,0x00b7ee70
00b7ee5c	cmp w10,#0x0
00b7ee60	b.le 0x00b7ee70
00b7ee64	mov w8,#0xffffffff
00b7ee68	mov w0,w8
00b7ee6c	ret
00b7ee70	sub x9,x9,#0x1
00b7ee74	cmn x9,#0x1
00b7ee78	b.eq 0x00b7eea8
00b7ee7c	ldr x10,[x0]
00b7ee80	ldr x11,[x1]
00b7ee84	lsl x12,x9,#0x3
00b7ee88	ldr x10,[x10, x12#0x0]
00b7ee8c	ldr x11,[x11, x12#0x0]
00b7ee90	cmp x10,x11
00b7ee94	b.hi 0x00b7ee30
00b7ee98	cmp x10,x11
00b7ee9c	sub x9,x9,#0x1
00b7eea0	b.cs 0x00b7ee74
00b7eea4	b 0x00b7ee2c
00b7eea8	mov w0,wzr
00b7eeac	ret
