; mbedtls_mpi_shift_l @ 00b7ebdc
00b7ebdc	stp x24,x23,[sp, #-0x40]!
00b7ebe0	stp x22,x21,[sp, #0x10]
00b7ebe4	stp x20,x19,[sp, #0x20]
00b7ebe8	stp x29,x30,[sp, #0x30]
00b7ebec	add x29,sp,#0x30
00b7ebf0	mov x20,x0
00b7ebf4	ldrh w8,[x20, #0xa]
00b7ebf8	ldr x0,[x0]
00b7ebfc	mov x19,x1
00b7ec00	mov x1,x8
00b7ec04	bl 0x00c41dc0
00b7ec08	ldrh w21,[x20, #0xa]
00b7ec0c	add x8,x0,x19
00b7ec10	lsl x9,x21,#0x6
00b7ec14	cmp x9,x8
00b7ec18	b.cs 0x00b7ec8c
00b7ec1c	lsr x9,x8,#0x6
00b7ec20	tst x8,#0x3f
00b7ec24	cinc x22,x9,ne
00b7ec28	mov w8,#0x2710
00b7ec2c	cmp x22,x8
00b7ec30	b.ls 0x00b7ec3c
00b7ec34	orr w0,wzr,#0xfffffff0
00b7ec38	b 0x00b7eca0
00b7ec3c	cmp x22,x21
00b7ec40	b.ls 0x00b7ec8c
00b7ec44	mov w1,#0x8
00b7ec48	mov x0,x22
00b7ec4c	bl 0x00c30a30
00b7ec50	mov x23,x0
00b7ec54	cbz x0,0x00b7ec34
00b7ec58	ldr x24,[x20]
00b7ec5c	cbz x24,0x00b7ec80
00b7ec60	lsl x21,x21,#0x3
00b7ec64	mov x0,x23
00b7ec68	mov x1,x24
00b7ec6c	mov x2,x21
00b7ec70	bl 0x00c2ffd0
00b7ec74	mov x0,x24
00b7ec78	mov x1,x21
00b7ec7c	bl 0x00c42230
00b7ec80	and x21,x22,#0xffff
00b7ec84	strh w22,[x20, #0xa]
00b7ec88	str x23,[x20]
00b7ec8c	ldr x0,[x20]
00b7ec90	mov x1,x21
00b7ec94	mov x2,x19
00b7ec98	bl 0x00c41ee0
00b7ec9c	mov w0,wzr
00b7eca0	ldp x29,x30,[sp, #0x30]
00b7eca4	ldp x20,x19,[sp, #0x20]
00b7eca8	ldp x22,x21,[sp, #0x10]
00b7ecac	ldp x24,x23,[sp], #0x40
00b7ecb0	ret
