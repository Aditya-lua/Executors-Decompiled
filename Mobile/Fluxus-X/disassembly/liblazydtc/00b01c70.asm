; X509V3_EXT_print_fp @ 00b01c70
00b01c70	stp x22,x21,[sp, #-0x30]!
00b01c74	stp x20,x19,[sp, #0x10]
00b01c78	mov x20,x1
00b01c7c	mov w1,wzr
00b01c80	stp x29,x30,[sp, #0x20]
00b01c84	add x29,sp,#0x20
00b01c88	mov w19,w3
00b01c8c	mov w22,w2
00b01c90	bl 0x00c37810
00b01c94	cbz x0,0x00b01cbc
00b01c98	sxtw x2,w22
00b01c9c	mov x1,x20
00b01ca0	mov w3,w19
00b01ca4	mov x21,x0
00b01ca8	bl 0x00b017fc
00b01cac	mov w19,w0
00b01cb0	mov x0,x21
00b01cb4	bl 0x00c31a40
00b01cb8	mov w0,w19
00b01cbc	ldp x29,x30,[sp, #0x20]
00b01cc0	ldp x20,x19,[sp, #0x10]
00b01cc4	ldp x22,x21,[sp], #0x30
00b01cc8	ret
