; mbedtls_psa_cipher_abort @ 00b9901c
00b9901c	ldr w8,[x0]
00b99020	mov w9,#0x4000000
00b99024	and w8,w8,#0x7f000000
00b99028	cmp w8,w9
00b9902c	b.ne 0x00b9904c
00b99030	stp x29,x30,[sp, #-0x10]!
00b99034	mov x29,sp
00b99038	add x0,x0,#0x8
00b9903c	bl 0x00c30290
00b99040	mov w0,wzr
00b99044	ldp x29,x30,[sp], #0x10
00b99048	ret
00b9904c	mov w0,#0xffffff77
00b99050	ret
