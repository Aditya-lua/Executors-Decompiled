; PKCS8_pkey_add1_attr_by_OBJ @ 009f2b8c
009f2b8c	stp x29,x30,[sp, #-0x10]!
009f2b90	add x0,x0,#0x18
009f2b94	mov x29,sp
009f2b98	bl 0x00c37f10
009f2b9c	cmp x0,#0x0
009f2ba0	cset w0,ne
009f2ba4	ldp x29,x30,[sp], #0x10
009f2ba8	ret
