; FUN_00abead4 @ 00abead4
00abead4	str x25,[sp, #-0x50]!
00abead8	stp x24,x23,[sp, #0x10]
00abeadc	stp x22,x21,[sp, #0x20]
00abeae0	stp x20,x19,[sp, #0x30]
00abeae4	mov x22,x4
00abeae8	mov x21,x3
00abeaec	mov x20,x2
00abeaf0	mov w23,w1
00abeaf4	cmp w1,#0x15
00abeaf8	mov x19,x0
00abeafc	stp x29,x30,[sp, #0x40]
00abeb00	add x29,sp,#0x40
00abeb04	b.lt 0x00abeb3c
00abeb08	adrp x24,0x774000
00abeb0c	add x24,x24,#0x520
00abeb10	mov w2,#0x14
00abeb14	mov x0,x19
00abeb18	mov x1,x24
00abeb1c	bl 0x00c34240
00abeb20	cmp w0,#0x14
00abeb24	b.ne 0x00abebf4
00abeb28	sub w25,w23,#0x14
00abeb2c	cmp w23,#0x28
00abeb30	mov w23,w25
00abeb34	b.gt 0x00abeb10
00abeb38	b 0x00abeb40
00abeb3c	mov w25,w23
00abeb40	adrp x1,0x774000
00abeb44	add x1,x1,#0x520
00abeb48	mov x0,x19
00abeb4c	mov w2,w25
00abeb50	bl 0x00c34240
00abeb54	cmp w0,w25
00abeb58	mov w0,wzr
00abeb5c	b.ne 0x00abebf8
00abeb60	ldr x8,[x22]
00abeb64	tst x8,#0x100
00abeb68	csel x21,x21,xzr,eq
00abeb6c	tst x8,#0x40
00abeb70	csel x20,x20,xzr,eq
00abeb74	orr x8,x21,x20
00abeb78	cbz x8,0x00abebd8
00abeb7c	cbz x20,0x00abeb94
00abeb80	mov x0,x19
00abeb84	mov x1,x20
00abeb88	bl 0x00c32260
00abeb8c	cmp w0,#0x1
00abeb90	b.lt 0x00abebf4
00abeb94	cbz x21,0x00abebb8
00abeb98	cbz x20,0x00abebe0
00abeb9c	adrp x1,0x2d4000
00abeba0	add x1,x1,#0x37b
00abeba4	mov x0,x19
00abeba8	mov x2,x21
00abebac	bl 0x00c32250
00abebb0	cmp w0,#0x1
00abebb4	b.lt 0x00abebf4
00abebb8	adrp x1,0x2d4000
00abebbc	add x1,x1,#0xf75
00abebc0	mov w2,#0x2
00abebc4	mov x0,x19
00abebc8	bl 0x00c34240
00abebcc	cmp w0,#0x2
00abebd0	cset w0,eq
00abebd4	b 0x00abebf8
00abebd8	mov w0,#0x1
00abebdc	b 0x00abebf8
00abebe0	mov x0,x19
00abebe4	mov x1,x21
00abebe8	bl 0x00c32260
00abebec	cmp w0,#0x1
00abebf0	b.ge 0x00abebb8
00abebf4	mov w0,wzr
00abebf8	ldp x29,x30,[sp, #0x40]
00abebfc	ldp x20,x19,[sp, #0x30]
00abec00	ldp x22,x21,[sp, #0x20]
00abec04	ldp x24,x23,[sp, #0x10]
00abec08	ldr x25,[sp], #0x50
00abec0c	ret
