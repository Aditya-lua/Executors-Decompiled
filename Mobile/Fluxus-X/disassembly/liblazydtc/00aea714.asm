; OSSL_STORE_INFO_get0_PARAMS @ 00aea714
00aea714	ldr w8,[x0]
00aea718	cmp w8,#0x2
00aea71c	mov x8,xzr
00aea720	b.ne 0x00aea728
00aea724	ldr x8,[x0, #0x8]
00aea728	mov x0,x8
00aea72c	ret
