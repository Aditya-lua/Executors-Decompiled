; bio_cleanup @ 009fd254
009fd254	stp x20,x19,[sp, #-0x20]!
009fd258	stp x29,x30,[sp, #0x10]
009fd25c	add x29,sp,#0x10
009fd260	bl 0x00c386a0
009fd264	adrp x19,0xcb5000
009fd268	ldr x19,[x19, #0x3b8]
009fd26c	ldr x0,[x19]
009fd270	bl 0x00c34d40
009fd274	adrp x20,0xcb5000
009fd278	ldr x20,[x20, #0x3c0]
009fd27c	str xzr,[x19]
009fd280	ldr x0,[x20]
009fd284	bl 0x00c34d40
009fd288	ldp x29,x30,[sp, #0x10]
009fd28c	str xzr,[x20]
009fd290	ldp x20,x19,[sp], #0x20
009fd294	ret
