; EVP_PKEY_meth_get0_info @ 00a7562c
00a7562c	cbz x0,0x00a75638
00a75630	ldr w8,[x2]
00a75634	str w8,[x0]
00a75638	cbz x1,0x00a75644
00a7563c	ldr w8,[x2, #0x4]
00a75640	str w8,[x1]
00a75644	ret
