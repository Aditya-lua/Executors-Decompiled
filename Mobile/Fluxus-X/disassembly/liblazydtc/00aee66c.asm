; UI_add_user_data @ 00aee66c
00aee66c	stp x20,x19,[sp, #-0x20]!
00aee670	stp x29,x30,[sp, #0x10]
00aee674	ldr w9,[x0, #0x28]
00aee678	ldr x8,[x0, #0x10]
00aee67c	mov x19,x0
00aee680	mov x20,x1
00aee684	add x29,sp,#0x10
00aee688	tbz w9,#0x1,0x00aee6a8
00aee68c	ldr x9,[x19]
00aee690	mov x0,x19
00aee694	mov x1,x8
00aee698	ldr x9,[x9, #0x38]
00aee69c	blr x9
00aee6a0	ldr w9,[x19, #0x28]
00aee6a4	mov x8,xzr
00aee6a8	and w9,w9,#0xfffffffd
00aee6ac	str x20,[x19, #0x10]
00aee6b0	str w9,[x19, #0x28]
00aee6b4	ldp x29,x30,[sp, #0x10]
00aee6b8	mov x0,x8
00aee6bc	ldp x20,x19,[sp], #0x20
00aee6c0	ret
