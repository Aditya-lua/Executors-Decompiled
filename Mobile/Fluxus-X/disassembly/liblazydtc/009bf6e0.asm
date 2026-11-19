; SSL_state_string @ 009bf6e0
009bf6e0	str x19,[sp, #-0x20]!
009bf6e4	stp x29,x30,[sp, #0x10]
009bf6e8	add x29,sp,#0x10
009bf6ec	mov x19,x0
009bf6f0	bl 0x00c35ce0
009bf6f4	cbz w0,0x009bf704
009bf6f8	adrp x0,0x29f000
009bf6fc	add x0,x0,#0xe1b
009bf700	b 0x009bf72c
009bf704	mov x0,x19
009bf708	bl 0x00c361a0
009bf70c	cmp w0,#0x31
009bf710	b.hi 0x009bf724
009bf714	adrp x8,0xc57000
009bf718	add x8,x8,#0x990
009bf71c	ldr x0,[x8, w0, SXTW #0x3]
009bf720	b 0x009bf72c
009bf724	adrp x0,0x2cf000
009bf728	add x0,x0,#0x7bc
009bf72c	ldp x29,x30,[sp, #0x10]
009bf730	ldr x19,[sp], #0x20
009bf734	ret
