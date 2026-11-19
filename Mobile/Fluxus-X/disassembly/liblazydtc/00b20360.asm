; ossl_prov_cipher_copy @ 00b20360
00b20360	stp x20,x19,[sp, #-0x20]!
00b20364	stp x29,x30,[sp, #0x10]
00b20368	ldr x8,[x1, #0x8]
00b2036c	mov x19,x1
00b20370	mov x20,x0
00b20374	add x29,sp,#0x10
00b20378	cbz x8,0x00b20388
00b2037c	mov x0,x8
00b20380	bl 0x00c357e0
00b20384	cbz w0,0x00b203bc
00b20388	ldr x0,[x19, #0x10]
00b2038c	cbz x0,0x00b2039c
00b20390	bl 0x00c323b0
00b20394	cbz w0,0x00b203b0
00b20398	ldr x0,[x19, #0x10]
00b2039c	str x0,[x20, #0x10]
00b203a0	ldr q0,[x19]
00b203a4	mov w0,#0x1
00b203a8	str q0,[x20]
00b203ac	b 0x00b203bc
00b203b0	ldr x0,[x19, #0x8]
00b203b4	bl 0x00c357d0
00b203b8	mov w0,wzr
00b203bc	ldp x29,x30,[sp, #0x10]
00b203c0	ldp x20,x19,[sp], #0x20
00b203c4	ret
