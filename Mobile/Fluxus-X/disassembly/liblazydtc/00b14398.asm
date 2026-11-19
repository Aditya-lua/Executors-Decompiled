; X509_VERIFY_PARAM_set1_name @ 00b14398
00b14398	str x21,[sp, #-0x30]!
00b1439c	stp x20,x19,[sp, #0x10]
00b143a0	stp x29,x30,[sp, #0x20]
00b143a4	mov x19,x0
00b143a8	ldr x0,[x0]
00b143ac	adrp x21,0x2d8000
00b143b0	add x21,x21,#0xa44
00b143b4	mov x20,x1
00b143b8	mov w2,#0x109
00b143bc	mov x1,x21
00b143c0	add x29,sp,#0x20
00b143c4	bl 0x00c32310
00b143c8	mov w2,#0x10a
00b143cc	mov x0,x20
00b143d0	mov x1,x21
00b143d4	bl 0x00c34600
00b143d8	str x0,[x19]
00b143dc	ldp x29,x30,[sp, #0x20]
00b143e0	ldp x20,x19,[sp, #0x10]
00b143e4	cmp x0,#0x0
00b143e8	cset w8,ne
00b143ec	mov w0,w8
00b143f0	ldr x21,[sp], #0x30
00b143f4	ret
