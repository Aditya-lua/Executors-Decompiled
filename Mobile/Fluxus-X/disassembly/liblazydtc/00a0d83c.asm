; NCONF_get_section_names @ 00a0d83c
00a0d83c	stp x20,x19,[sp, #-0x20]!
00a0d840	mov x20,x0
00a0d844	adrp x0,0xa0d000
00a0d848	add x0,x0,#0x88c
00a0d84c	stp x29,x30,[sp, #0x10]
00a0d850	add x29,sp,#0x10
00a0d854	bl 0x00c35340
00a0d858	mov x19,x0
00a0d85c	cbz x0,0x00a0d87c
00a0d860	ldr x0,[x20, #0x10]
00a0d864	adrp x1,0xa0d000
00a0d868	add x1,x1,#0x898
00a0d86c	mov x2,x19
00a0d870	bl 0x00c395c0
00a0d874	mov x0,x19
00a0d878	bl 0x00c35350
00a0d87c	ldp x29,x30,[sp, #0x10]
00a0d880	mov x0,x19
00a0d884	ldp x20,x19,[sp], #0x20
00a0d888	ret
