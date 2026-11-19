; BIO_free_all @ 009fd098
009fd098	stp x20,x19,[sp, #-0x20]!
009fd09c	stp x29,x30,[sp, #0x10]
009fd0a0	add x29,sp,#0x10
009fd0a4	cbz x0,0x009fd0cc
009fd0a8	mov x19,x0
009fd0ac	add x8,x19,#0x58
009fd0b0	mov x0,x19
009fd0b4	ldar w20,[x8]
009fd0b8	ldr x19,[x19, #0x48]
009fd0bc	bl 0x009fbe48
009fd0c0	cmp w20,#0x1
009fd0c4	b.gt 0x009fd0cc
009fd0c8	cbnz x19,0x009fd0ac
009fd0cc	ldp x29,x30,[sp, #0x10]
009fd0d0	ldp x20,x19,[sp], #0x20
009fd0d4	ret
