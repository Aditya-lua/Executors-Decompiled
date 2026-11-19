; PKCS12_key_gen_uni @ 00aba884
00aba884	sub sp,sp,#0x30
00aba888	stp x29,x30,[sp, #0x20]
00aba88c	add x29,sp,#0x20
00aba890	ldr x8,[x29, #0x10]
00aba894	stp xzr,xzr,[sp, #0x8]
00aba898	str x8,[sp]
00aba89c	bl 0x00aba568
00aba8a0	ldp x29,x30,[sp, #0x20]
00aba8a4	add sp,sp,#0x30
00aba8a8	ret
