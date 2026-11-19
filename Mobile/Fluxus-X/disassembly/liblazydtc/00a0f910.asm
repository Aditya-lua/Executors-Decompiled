; _CONF_get_section_values @ 00a0f910
00a0f910	sub sp,sp,#0x30
00a0f914	stp x29,x30,[sp, #0x20]
00a0f918	add x29,sp,#0x20
00a0f91c	cbz x0,0x00a0f944
00a0f920	cbz x1,0x00a0f944
00a0f924	stp x1,xzr,[sp, #0x8]
00a0f928	ldr x0,[x0, #0x10]
00a0f92c	cbz x0,0x00a0f944
00a0f930	add x1,sp,#0x8
00a0f934	bl 0x00c34de0
00a0f938	cbz x0,0x00a0f948
00a0f93c	ldr x0,[x0, #0x10]
00a0f940	b 0x00a0f948
00a0f944	mov x0,xzr
00a0f948	ldp x29,x30,[sp, #0x20]
00a0f94c	add sp,sp,#0x30
00a0f950	ret
