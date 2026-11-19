; PKCS8_pkey_add1_attr @ 009f2bac
009f2bac	stp x29,x30,[sp, #-0x10]!
009f2bb0	add x0,x0,#0x18
009f2bb4	mov x29,sp
009f2bb8	bl 0x00c37ef0
009f2bbc	cmp x0,#0x0
009f2bc0	cset w0,ne
009f2bc4	ldp x29,x30,[sp], #0x10
009f2bc8	ret
