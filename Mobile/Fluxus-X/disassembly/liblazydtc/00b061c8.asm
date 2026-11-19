; X509V3_get_value_int @ 00b061c8
00b061c8	stp x20,x19,[sp, #-0x20]!
00b061cc	stp x29,x30,[sp, #0x10]
00b061d0	ldr x8,[x0, #0x10]
00b061d4	mov x20,x1
00b061d8	add x29,sp,#0x10
00b061dc	mov x19,x0
00b061e0	mov x1,x8
00b061e4	bl 0x00b05dc8
00b061e8	cbz x0,0x00b061f8
00b061ec	str x0,[x20]
00b061f0	mov w0,#0x1
00b061f4	b 0x00b06218
00b061f8	ldp x2,x4,[x19, #0x8]
00b061fc	adrp x1,0x2cc000
00b06200	adrp x3,0x2aa000
00b06204	add x1,x1,#0x165
00b06208	add x3,x3,#0xa36
00b0620c	mov w0,#0x4
00b06210	bl 0x00c37fb0
00b06214	mov w0,wzr
00b06218	ldp x29,x30,[sp, #0x10]
00b0621c	ldp x20,x19,[sp], #0x20
00b06220	ret
