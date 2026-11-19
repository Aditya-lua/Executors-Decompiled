; PROFESSION_INFO_set0_professionItems @ 00afe06c
00afe06c	stp x20,x19,[sp, #-0x20]!
00afe070	stp x29,x30,[sp, #0x10]
00afe074	mov x20,x1
00afe078	adrp x1,0xcb5000
00afe07c	mov x19,x0
00afe080	ldr x0,[x0, #0x8]
00afe084	ldr x1,[x1, #0x328]
00afe088	add x29,sp,#0x10
00afe08c	bl 0x00c32600
00afe090	str x20,[x19, #0x8]
00afe094	ldp x29,x30,[sp, #0x10]
00afe098	ldp x20,x19,[sp], #0x20
00afe09c	ret
