; PROFESSION_INFO_set0_namingAuthority @ 00afe030
00afe030	stp x20,x19,[sp, #-0x20]!
00afe034	stp x29,x30,[sp, #0x10]
00afe038	mov x19,x0
00afe03c	ldr x0,[x0]
00afe040	mov x20,x1
00afe044	adrp x1,0xc7f000
00afe048	add x1,x1,#0xd70
00afe04c	add x29,sp,#0x10
00afe050	bl 0x00c36160
00afe054	str x20,[x19]
00afe058	ldp x29,x30,[sp, #0x10]
00afe05c	ldp x20,x19,[sp], #0x20
00afe060	ret
