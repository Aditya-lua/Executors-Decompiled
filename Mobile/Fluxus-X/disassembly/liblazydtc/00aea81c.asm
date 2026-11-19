; OSSL_STORE_INFO_get0_PKEY @ 00aea81c
00aea81c	ldr w8,[x0]
00aea820	cmp w8,#0x4
00aea824	mov x8,xzr
00aea828	b.ne 0x00aea830
00aea82c	ldr x8,[x0, #0x8]
00aea830	mov x0,x8
00aea834	ret
