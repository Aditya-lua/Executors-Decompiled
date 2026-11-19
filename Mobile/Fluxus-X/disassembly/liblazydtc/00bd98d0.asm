; FUN_00bd98d0 @ 00bd98d0
00bd98d0	paciasp
00bd98d4	stp x29,x30,[sp, #-0x20]!
00bd98d8	str x19,[sp, #0x10]
00bd98dc	mov x29,sp
00bd98e0	mov x8,x1
00bd98e4	adrp x1,0xcb5000
00bd98e8	mov x19,x0
00bd98ec	ldr x1,[x1, #0xbf0]
00bd98f0	mov x0,x8
00bd98f4	bl 0x00c30080
00bd98f8	ldr x8,[x0]
00bd98fc	str x0,[x19, #0x48]
00bd9900	ldr x8,[x8, #0x30]
00bd9904	blr x8
00bd9908	ldr x8,[x19, #0x48]
00bd990c	str w0,[x19, #0x58]
00bd9910	ldr x9,[x8]
00bd9914	mov x0,x8
00bd9918	ldr x9,[x9, #0x38]
00bd991c	blr x9
00bd9920	ldr w8,[x19, #0x58]
00bd9924	and w9,w0,#0x1
00bd9928	strb w9,[x19, #0x61]
00bd992c	cmp w8,#0x9
00bd9930	b.ge 0x00bd9944
00bd9934	ldr x19,[sp, #0x10]
00bd9938	ldp x29,x30,[sp], #0x20
00bd993c	autiasp
00bd9940	ret
00bd9944	adrp x0,0x2c6000
00bd9948	add x0,x0,#0x98e
00bd994c	bl 0x00c43d00
00bd9950	bti c
00bd9954	mov w1,wzr
00bd9958	b 0x00bd9a94
