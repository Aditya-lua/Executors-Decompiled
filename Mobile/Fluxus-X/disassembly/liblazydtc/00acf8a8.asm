; ossl_rsa_is_foreign @ 00acf8a8
00acf8a8	ldr x8,[x0, #0x20]
00acf8ac	cbz x8,0x00acf8b8
00acf8b0	mov w0,#0x1
00acf8b4	ret
00acf8b8	str x19,[sp, #-0x20]!
00acf8bc	stp x29,x30,[sp, #0x10]
00acf8c0	add x29,sp,#0x10
00acf8c4	bl 0x00c3fca0
00acf8c8	mov x19,x0
00acf8cc	bl 0x00c3fc70
00acf8d0	ldp x29,x30,[sp, #0x10]
00acf8d4	cmp x19,x0
00acf8d8	cset w0,ne
00acf8dc	ldr x19,[sp], #0x20
00acf8e0	ret
