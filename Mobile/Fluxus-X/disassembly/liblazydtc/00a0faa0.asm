; _CONF_new_data @ 00a0faa0
00a0faa0	str x19,[sp, #-0x20]!
00a0faa4	stp x29,x30,[sp, #0x10]
00a0faa8	add x29,sp,#0x10
00a0faac	cbz x0,0x00a0fadc
00a0fab0	ldr x8,[x0, #0x10]
00a0fab4	mov x19,x0
00a0fab8	cbnz x8,0x00a0fad8
00a0fabc	adrp x0,0xa0f000
00a0fac0	adrp x1,0xa0f000
00a0fac4	add x0,x0,#0xae8
00a0fac8	add x1,x1,#0xb20
00a0facc	bl 0x00c34dd0
00a0fad0	str x0,[x19, #0x10]
00a0fad4	cbz x0,0x00a0fadc
00a0fad8	mov w0,#0x1
00a0fadc	ldp x29,x30,[sp, #0x10]
00a0fae0	ldr x19,[sp], #0x20
00a0fae4	ret
