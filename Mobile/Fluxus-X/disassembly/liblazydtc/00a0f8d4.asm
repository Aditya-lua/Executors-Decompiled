; _CONF_get_section @ 00a0f8d4
00a0f8d4	sub sp,sp,#0x30
00a0f8d8	mov x8,x0
00a0f8dc	mov x0,xzr
00a0f8e0	stp x29,x30,[sp, #0x20]
00a0f8e4	add x29,sp,#0x20
00a0f8e8	cbz x8,0x00a0f904
00a0f8ec	cbz x1,0x00a0f904
00a0f8f0	stp x1,xzr,[sp, #0x8]
00a0f8f4	ldr x0,[x8, #0x10]
00a0f8f8	cbz x0,0x00a0f904
00a0f8fc	add x1,sp,#0x8
00a0f900	bl 0x00c34de0
00a0f904	ldp x29,x30,[sp, #0x20]
00a0f908	add sp,sp,#0x30
00a0f90c	ret
