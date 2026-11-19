; FUN_00b7467c @ 00b7467c
00b7467c	str x21,[sp, #-0x30]!
00b74680	stp x20,x19,[sp, #0x10]
00b74684	stp x29,x30,[sp, #0x20]
00b74688	add x29,sp,#0x20
00b7468c	adrp x20,0xd25000
00b74690	ldr x21,[x20, #0xb08]
00b74694	mov x8,x1
00b74698	mov x19,x2
00b7469c	add x1,x0,x21
00b746a0	mov x0,x8
00b746a4	bl 0x00c2ffd0
00b746a8	add x8,x21,x19
00b746ac	str x8,[x20, #0xb08]
00b746b0	ldp x29,x30,[sp, #0x20]
00b746b4	ldp x20,x19,[sp, #0x10]
00b746b8	mov w0,wzr
00b746bc	ldr x21,[sp], #0x30
00b746c0	ret
