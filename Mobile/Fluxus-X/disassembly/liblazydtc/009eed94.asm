; ASN1_TIME_set @ 009eed94
009eed94	sub sp,sp,#0x60
009eed98	stp x29,x30,[sp, #0x50]
009eed9c	add x29,sp,#0x50
009eeda0	str x19,[sp, #0x40]
009eeda4	mov x19,x0
009eeda8	stur x1,[x29, #-0x8]
009eedac	sub x0,x29,#0x8
009eedb0	add x1,sp,#0x8
009eedb4	bl 0x00c37980
009eedb8	cbz x0,0x009eedd0
009eedbc	mov x1,x0
009eedc0	mov w2,#0xffffffff
009eedc4	mov x0,x19
009eedc8	bl 0x009eec44
009eedcc	b 0x009eee00
009eedd0	bl 0x00c342a0
009eedd4	adrp x0,0x2c9000
009eedd8	adrp x2,0x2db000
009eeddc	add x0,x0,#0x598
009eede0	add x2,x2,#0xd21
009eede4	mov w1,#0x14c
009eede8	bl 0x00c342b0
009eedec	mov w0,#0xd
009eedf0	mov w1,#0xad
009eedf4	mov x2,xzr
009eedf8	bl 0x00c342c0
009eedfc	mov x0,xzr
009eee00	ldp x29,x30,[sp, #0x50]
009eee04	ldr x19,[sp, #0x40]
009eee08	add sp,sp,#0x60
009eee0c	ret
