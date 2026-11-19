; ossl_ecx_key_allocate_privkey @ 00a3e374
00a3e374	str x19,[sp, #-0x20]!
00a3e378	stp x29,x30,[sp, #0x10]
00a3e37c	mov x19,x0
00a3e380	ldr x0,[x0, #0x58]
00a3e384	adrp x1,0x2b9000
00a3e388	add x1,x1,#0xcc5
00a3e38c	mov w2,#0x5f
00a3e390	add x29,sp,#0x10
00a3e394	bl 0x00c35710
00a3e398	str x0,[x19, #0x50]
00a3e39c	ldp x29,x30,[sp, #0x10]
00a3e3a0	ldr x19,[sp], #0x20
00a3e3a4	ret
