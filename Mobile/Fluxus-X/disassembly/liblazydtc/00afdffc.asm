; PROFESSION_INFO_set0_addProfessionInfo @ 00afdffc
00afdffc	stp x20,x19,[sp, #-0x20]!
00afe000	stp x29,x30,[sp, #0x10]
00afe004	mov x19,x0
00afe008	ldr x0,[x0, #0x20]
00afe00c	add x29,sp,#0x10
00afe010	mov x20,x1
00afe014	bl 0x00c35530
00afe018	str x20,[x19, #0x20]
00afe01c	ldp x29,x30,[sp, #0x10]
00afe020	ldp x20,x19,[sp], #0x20
00afe024	ret
