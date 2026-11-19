; ossl_cipher_cbc_cts_mode_id2name @ 00b2b878
00b2b878	cmp w0,#0x2
00b2b87c	mov x8,xzr
00b2b880	b.hi 0x00b2b894
00b2b884	adrp x8,0xc93000
00b2b888	add x8,x8,#0x988
00b2b88c	add x8,x8,w0, UXTW  #0x4
00b2b890	ldr x8,[x8, #0x8]
00b2b894	mov x0,x8
00b2b898	ret
