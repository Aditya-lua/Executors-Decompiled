; psa_remove_key_data_from_memory @ 00b86c5c
00b86c5c	str x19,[sp, #-0x20]!
00b86c60	stp x29,x30,[sp, #0x10]
00b86c64	add x29,sp,#0x10
00b86c68	mov x19,x0
00b86c6c	ldr x0,[x0, #0x28]
00b86c70	cbz x0,0x00b86c7c
00b86c74	ldr x1,[x19, #0x30]
00b86c78	bl 0x00c42230
00b86c7c	stp xzr,xzr,[x19, #0x28]
00b86c80	ldp x29,x30,[sp, #0x10]
00b86c84	mov w0,wzr
00b86c88	ldr x19,[sp], #0x20
00b86c8c	ret
