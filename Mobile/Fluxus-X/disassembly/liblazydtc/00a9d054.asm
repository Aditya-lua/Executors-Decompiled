; WPACKET_cleanup @ 00a9d054
00a9d054	str x21,[sp, #-0x30]!
00a9d058	stp x20,x19,[sp, #0x10]
00a9d05c	stp x29,x30,[sp, #0x20]
00a9d060	mov x19,x0
00a9d064	ldr x0,[x0, #0x28]
00a9d068	add x29,sp,#0x20
00a9d06c	cbz x0,0x00a9d090
00a9d070	adrp x20,0x2bd000
00a9d074	add x20,x20,#0xe31
00a9d078	ldr x21,[x0]
00a9d07c	mov w2,#0x1fd
00a9d080	mov x1,x20
00a9d084	bl 0x00c32310
00a9d088	mov x0,x21
00a9d08c	cbnz x21,0x00a9d078
00a9d090	str xzr,[x19, #0x28]
00a9d094	ldp x29,x30,[sp, #0x20]
00a9d098	ldp x20,x19,[sp, #0x10]
00a9d09c	ldr x21,[sp], #0x30
00a9d0a0	ret
