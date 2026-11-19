; ossl_store_destroy_loaders_int @ 00aec24c
00aec24c	stp x20,x19,[sp, #-0x20]!
00aec250	adrp x19,0xd22000
00aec254	ldr x0,[x19, #0x318]
00aec258	stp x29,x30,[sp, #0x10]
00aec25c	add x29,sp,#0x10
00aec260	bl 0x00c34db0
00aec264	adrp x20,0xd22000
00aec268	ldr x0,[x20, #0x310]
00aec26c	str xzr,[x19, #0x318]
00aec270	bl 0x00c34d40
00aec274	ldp x29,x30,[sp, #0x10]
00aec278	str xzr,[x20, #0x310]
00aec27c	ldp x20,x19,[sp], #0x20
00aec280	ret
