; PKCS12_key_gen_asc @ 00aba734
00aba734	sub sp,sp,#0x30
00aba738	stp x29,x30,[sp, #0x20]
00aba73c	add x29,sp,#0x20
00aba740	ldr x8,[x29, #0x10]
00aba744	stp xzr,xzr,[sp, #0x8]
00aba748	str x8,[sp]
00aba74c	bl 0x00aba468
00aba750	ldp x29,x30,[sp, #0x20]
00aba754	add sp,sp,#0x30
00aba758	ret
