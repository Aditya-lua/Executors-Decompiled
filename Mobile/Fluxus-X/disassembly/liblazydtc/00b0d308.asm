; X509v3_get_ext_by_OBJ @ 00b0d308
00b0d308	stp x22,x21,[sp, #-0x30]!
00b0d30c	stp x20,x19,[sp, #0x10]
00b0d310	stp x29,x30,[sp, #0x20]
00b0d314	add x29,sp,#0x20
00b0d318	cbz x0,0x00b0d364
00b0d31c	add w8,w2,#0x1
00b0d320	mov x20,x1
00b0d324	mov x21,x0
00b0d328	bic w19,w8,w8, ASR #0x1f
00b0d32c	bl 0x00c325e0
00b0d330	cmp w19,w0
00b0d334	b.ge 0x00b0d364
00b0d338	mov w22,w0
00b0d33c	mov x0,x21
00b0d340	mov w1,w19
00b0d344	bl 0x00c32610
00b0d348	ldr x0,[x0]
00b0d34c	mov x1,x20
00b0d350	bl 0x00c37ab0
00b0d354	cbz w0,0x00b0d368
00b0d358	add w19,w19,#0x1
00b0d35c	cmp w19,w22
00b0d360	b.lt 0x00b0d33c
00b0d364	mov w19,#0xffffffff
00b0d368	mov w0,w19
00b0d36c	ldp x29,x30,[sp, #0x20]
00b0d370	ldp x20,x19,[sp, #0x10]
00b0d374	ldp x22,x21,[sp], #0x30
00b0d378	ret
