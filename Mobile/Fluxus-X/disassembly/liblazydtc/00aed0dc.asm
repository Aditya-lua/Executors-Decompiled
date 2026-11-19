; TXT_DB_get_by_index @ 00aed0dc
00aed0dc	str x19,[sp, #-0x20]!
00aed0e0	stp x29,x30,[sp, #0x10]
00aed0e4	ldr w8,[x0]
00aed0e8	mov x19,x0
00aed0ec	add x29,sp,#0x10
00aed0f0	cmp w8,w1
00aed0f4	b.le 0x00aed114
00aed0f8	ldr x8,[x19, #0x10]
00aed0fc	ldr x0,[x8, w1, SXTW #0x3]
00aed100	cbz x0,0x00aed120
00aed104	mov x1,x2
00aed108	bl 0x00c34de0
00aed10c	mov x8,xzr
00aed110	b 0x00aed124
00aed114	mov x0,xzr
00aed118	orr w8,wzr,#0x3
00aed11c	b 0x00aed124
00aed120	mov w8,#0x4
00aed124	str x8,[x19, #0x20]
00aed128	ldp x29,x30,[sp, #0x10]
00aed12c	ldr x19,[sp], #0x20
00aed130	ret
