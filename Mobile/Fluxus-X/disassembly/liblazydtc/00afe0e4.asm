; PROFESSION_INFO_set0_registrationNumber @ 00afe0e4
00afe0e4	stp x20,x19,[sp, #-0x20]!
00afe0e8	stp x29,x30,[sp, #0x10]
00afe0ec	mov x19,x0
00afe0f0	ldr x0,[x0, #0x18]
00afe0f4	add x29,sp,#0x10
00afe0f8	mov x20,x1
00afe0fc	bl 0x00c38180
00afe100	str x20,[x19, #0x18]
00afe104	ldp x29,x30,[sp, #0x10]
00afe108	ldp x20,x19,[sp], #0x20
00afe10c	ret
