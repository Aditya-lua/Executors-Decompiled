; ADMISSIONS_set0_namingAuthority @ 00afdf84
00afdf84	stp x20,x19,[sp, #-0x20]!
00afdf88	stp x29,x30,[sp, #0x10]
00afdf8c	mov x19,x0
00afdf90	ldr x0,[x0, #0x8]
00afdf94	mov x20,x1
00afdf98	adrp x1,0xc7f000
00afdf9c	add x1,x1,#0xd70
00afdfa0	add x29,sp,#0x10
00afdfa4	bl 0x00c36160
00afdfa8	str x20,[x19, #0x8]
00afdfac	ldp x29,x30,[sp, #0x10]
00afdfb0	ldp x20,x19,[sp], #0x20
00afdfb4	ret
