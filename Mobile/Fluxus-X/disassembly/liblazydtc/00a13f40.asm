; SCT_set0_extensions @ 00a13f40
00a13f40	str x21,[sp, #-0x30]!
00a13f44	stp x20,x19,[sp, #0x10]
00a13f48	stp x29,x30,[sp, #0x20]
00a13f4c	mov x20,x0
00a13f50	ldr x0,[x0, #0x30]
00a13f54	mov x21,x1
00a13f58	adrp x1,0x2a7000
00a13f5c	mov x19,x2
00a13f60	add x1,x1,#0xdc3
00a13f64	mov w2,#0x91
00a13f68	add x29,sp,#0x20
00a13f6c	bl 0x00c32310
00a13f70	stp x21,x19,[x20, #0x30]
00a13f74	str wzr,[x20, #0x60]
00a13f78	ldp x29,x30,[sp, #0x20]
00a13f7c	ldp x20,x19,[sp, #0x10]
00a13f80	ldr x21,[sp], #0x30
00a13f84	ret
