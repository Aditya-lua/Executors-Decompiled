; PKCS12_get0_mac @ 00abbb98
00abbb98	str x21,[sp, #-0x30]!
00abbb9c	stp x20,x19,[sp, #0x10]
00abbba0	stp x29,x30,[sp, #0x20]
00abbba4	ldr x8,[x4, #0x8]
00abbba8	mov x19,x3
00abbbac	mov x20,x2
00abbbb0	mov x2,x0
00abbbb4	add x29,sp,#0x20
00abbbb8	cbz x8,0x00abbbec
00abbbbc	ldr x0,[x8]
00abbbc0	mov x21,x4
00abbbc4	bl 0x00c38300
00abbbc8	cbz x20,0x00abbbd8
00abbbcc	ldr x8,[x21, #0x8]
00abbbd0	ldr x8,[x8, #0x8]
00abbbd4	str x8,[x20]
00abbbd8	cbz x19,0x00abbc0c
00abbbdc	ldr x8,[x21, #0x8]
00abbbe0	ldr x8,[x8, #0x10]
00abbbe4	str x8,[x19]
00abbbe8	b 0x00abbc0c
00abbbec	cbz x2,0x00abbbf4
00abbbf0	str xzr,[x2]
00abbbf4	cbz x1,0x00abbbfc
00abbbf8	str xzr,[x1]
00abbbfc	cbz x20,0x00abbc04
00abbc00	str xzr,[x20]
00abbc04	cbz x19,0x00abbc0c
00abbc08	str xzr,[x19]
00abbc0c	ldp x29,x30,[sp, #0x20]
00abbc10	ldp x20,x19,[sp, #0x10]
00abbc14	ldr x21,[sp], #0x30
00abbc18	ret
