; FUN_009bacd4 @ 009bacd4
009bacd4	stp x20,x19,[sp, #-0x20]!
009bacd8	stp x29,x30,[sp, #0x10]
009bacdc	mov x20,x0
009bace0	ldr x0,[x0, #0xa8]
009bace4	mov x19,x1
009bace8	add x29,sp,#0x10
009bacec	cbnz x0,0x009bacfc
009bacf0	bl 0x00c34780
009bacf4	str x0,[x20, #0xa8]
009bacf8	cbz x0,0x009bad0c
009bacfc	ldp x29,x30,[sp, #0x10]
009bad00	mov x1,x19
009bad04	ldp x20,x19,[sp], #0x20
009bad08	b 0x00c34ee0
009bad0c	ldp x29,x30,[sp, #0x10]
009bad10	ldp x20,x19,[sp], #0x20
009bad14	ret
