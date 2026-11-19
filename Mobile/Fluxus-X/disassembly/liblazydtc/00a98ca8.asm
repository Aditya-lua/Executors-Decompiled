; OPENSSL_config @ 00a98ca8
00a98ca8	sub sp,sp,#0x30
00a98cac	stp x29,x30,[sp, #0x20]
00a98cb0	add x29,sp,#0x20
00a98cb4	stp xzr,xzr,[sp, #0x8]
00a98cb8	str xzr,[sp, #0x18]
00a98cbc	cbz x0,0x00a98cc8
00a98cc0	bl 0x00c30c60
00a98cc4	str x0,[sp, #0x10]
00a98cc8	mov w8,#0x32
00a98ccc	mov w0,#0x40
00a98cd0	add x1,sp,#0x8
00a98cd4	str x8,[sp, #0x18]
00a98cd8	bl 0x00c35500
00a98cdc	ldp x29,x30,[sp, #0x20]
00a98ce0	add sp,sp,#0x30
00a98ce4	ret
