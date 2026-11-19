; ADMISSION_SYNTAX_set0_admissionAuthority @ 00afdee0
00afdee0	stp x20,x19,[sp, #-0x20]!
00afdee4	stp x29,x30,[sp, #0x10]
00afdee8	mov x19,x0
00afdeec	ldr x0,[x0]
00afdef0	add x29,sp,#0x10
00afdef4	mov x20,x1
00afdef8	bl 0x00c3ef00
00afdefc	str x20,[x19]
00afdf00	ldp x29,x30,[sp, #0x10]
00afdf04	ldp x20,x19,[sp], #0x20
00afdf08	ret
