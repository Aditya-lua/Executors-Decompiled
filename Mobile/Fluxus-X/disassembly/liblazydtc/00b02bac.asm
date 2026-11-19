; FUN_00b02bac @ 00b02bac
00b02bac	stp x20,x19,[sp, #-0x20]!
00b02bb0	stp x29,x30,[sp, #0x10]
00b02bb4	add x29,sp,#0x10
00b02bb8	cbz x0,0x00b02bc8
00b02bbc	ldr w8,[x0, #0x8]
00b02bc0	mov x19,x0
00b02bc4	tbnz w8,#0x0,0x00b02bd4
00b02bc8	ldp x29,x30,[sp, #0x10]
00b02bcc	ldp x20,x19,[sp], #0x20
00b02bd0	ret
00b02bd4	tbz w8,#0x1,0x00b02c00
00b02bd8	ldr x0,[x19, #0x18]
00b02bdc	adrp x20,0x2a2000
00b02be0	add x20,x20,#0xe25
00b02be4	mov w2,#0xe2
00b02be8	mov x1,x20
00b02bec	bl 0x00c32310
00b02bf0	ldr x0,[x19, #0x20]
00b02bf4	mov w2,#0xe3
00b02bf8	mov x1,x20
00b02bfc	bl 0x00c32310
00b02c00	ldp x29,x30,[sp, #0x10]
00b02c04	adrp x1,0x2a2000
00b02c08	add x1,x1,#0xe25
00b02c0c	mov w2,#0xe5
00b02c10	mov x0,x19
00b02c14	ldp x20,x19,[sp], #0x20
00b02c18	b 0x00c32310
