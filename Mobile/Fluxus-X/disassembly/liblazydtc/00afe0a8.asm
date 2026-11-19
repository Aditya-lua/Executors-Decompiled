; PROFESSION_INFO_set0_professionOIDs @ 00afe0a8
00afe0a8	stp x20,x19,[sp, #-0x20]!
00afe0ac	stp x29,x30,[sp, #0x10]
00afe0b0	mov x20,x1
00afe0b4	adrp x1,0xcb5000
00afe0b8	mov x19,x0
00afe0bc	ldr x0,[x0, #0x10]
00afe0c0	ldr x1,[x1, #0x320]
00afe0c4	add x29,sp,#0x10
00afe0c8	bl 0x00c32600
00afe0cc	str x20,[x19, #0x10]
00afe0d0	ldp x29,x30,[sp, #0x10]
00afe0d4	ldp x20,x19,[sp], #0x20
00afe0d8	ret
