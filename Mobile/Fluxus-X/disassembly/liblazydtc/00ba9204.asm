; mbedtls_oid_get_attr_short_name @ 00ba9204
00ba9204	stp x22,x21,[sp, #-0x30]!
00ba9208	stp x20,x19,[sp, #0x10]
00ba920c	stp x29,x30,[sp, #0x20]
00ba9210	add x29,sp,#0x20
00ba9214	mov x19,x1
00ba9218	mov x20,x0
00ba921c	cbz x0,0x00ba925c
00ba9220	ldr x21,[x20, #0x8]
00ba9224	adrp x8,0xcab000
00ba9228	add x8,x8,#0xb68
00ba922c	adrp x0,0x2a8000
00ba9230	add x22,x8,#0x28
00ba9234	add x0,x0,#0xf46
00ba9238	ldur x8,[x22, #-0x20]
00ba923c	cmp x8,x21
00ba9240	b.ne 0x00ba9254
00ba9244	ldr x1,[x20, #0x10]
00ba9248	mov x2,x21
00ba924c	bl 0x00c300b0
00ba9250	cbz w0,0x00ba9264
00ba9254	ldr x0,[x22], #0x28
00ba9258	cbnz x0,0x00ba9238
00ba925c	mov w0,#0xffffffd2
00ba9260	b 0x00ba926c
00ba9264	ldur x8,[x22, #-0x8]
00ba9268	str x8,[x19]
00ba926c	ldp x29,x30,[sp, #0x20]
00ba9270	ldp x20,x19,[sp, #0x10]
00ba9274	ldp x22,x21,[sp], #0x30
00ba9278	ret
