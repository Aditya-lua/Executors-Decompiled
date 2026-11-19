; OSSL_STORE_INFO_get0_PUBKEY @ 00aea798
00aea798	ldr w8,[x0]
00aea79c	cmp w8,#0x3
00aea7a0	mov x8,xzr
00aea7a4	b.ne 0x00aea7ac
00aea7a8	ldr x8,[x0, #0x8]
00aea7ac	mov x0,x8
00aea7b0	ret
