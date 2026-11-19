; OSSL_STORE_INFO_get1_CERT @ 00aea8bc
00aea8bc	str x19,[sp, #-0x20]!
00aea8c0	stp x29,x30,[sp, #0x10]
00aea8c4	ldr w8,[x0]
00aea8c8	add x29,sp,#0x10
00aea8cc	cmp w8,#0x5
00aea8d0	b.ne 0x00aea8e8
00aea8d4	mov x19,x0
00aea8d8	ldr x0,[x0, #0x8]
00aea8dc	bl 0x00c350b0
00aea8e0	ldr x0,[x19, #0x8]
00aea8e4	b 0x00aea918
00aea8e8	bl 0x00c342a0
00aea8ec	adrp x0,0x2c2000
00aea8f0	adrp x2,0x2be000
00aea8f4	add x0,x0,#0x3bd
00aea8f8	add x2,x2,#0x377
00aea8fc	mov w1,#0x2e9
00aea900	bl 0x00c342b0
00aea904	mov w0,#0x2c
00aea908	mov w1,#0x64
00aea90c	mov x2,xzr
00aea910	bl 0x00c342c0
00aea914	mov x0,xzr
00aea918	ldp x29,x30,[sp, #0x10]
00aea91c	ldr x19,[sp], #0x20
00aea920	ret
