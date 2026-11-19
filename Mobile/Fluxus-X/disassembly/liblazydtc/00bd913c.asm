; FUN_00bd913c @ 00bd913c
00bd913c	paciasp
00bd9140	stp x29,x30,[sp, #-0x20]!
00bd9144	str x19,[sp, #0x10]
00bd9148	mov x29,sp
00bd914c	mov x8,x1
00bd9150	adrp x1,0xcb4000
00bd9154	mov x19,x0
00bd9158	ldr x1,[x1, #0xf70]
00bd915c	mov x0,x8
00bd9160	bl 0x00c30080
00bd9164	ldr x8,[x0]
00bd9168	str x0,[x19, #0x48]
00bd916c	ldr x8,[x8, #0x30]
00bd9170	blr x8
00bd9174	ldr x8,[x19, #0x48]
00bd9178	str w0,[x19, #0x58]
00bd917c	ldr x9,[x8]
00bd9180	mov x0,x8
00bd9184	ldr x9,[x9, #0x38]
00bd9188	blr x9
00bd918c	ldr w8,[x19, #0x58]
00bd9190	and w9,w0,#0x1
00bd9194	strb w9,[x19, #0x61]
00bd9198	cmp w8,#0x9
00bd919c	b.ge 0x00bd91b0
00bd91a0	ldr x19,[sp, #0x10]
00bd91a4	ldp x29,x30,[sp], #0x20
00bd91a8	autiasp
00bd91ac	ret
00bd91b0	adrp x0,0x2c6000
00bd91b4	add x0,x0,#0x98e
00bd91b8	bl 0x00c43d00
00bd91bc	bti c
00bd91c0	mov w1,wzr
00bd91c4	b 0x00bd9300
