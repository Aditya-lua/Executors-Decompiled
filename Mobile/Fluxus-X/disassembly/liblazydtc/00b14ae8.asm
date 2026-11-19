; X509_REVOKED_set_serialNumber @ 00b14ae8
00b14ae8	cbz x0,0x00b14afc
00b14aec	cmp x0,x1
00b14af0	b.eq 0x00b14af8
00b14af4	b 0x00c37940
00b14af8	mov w0,#0x1
00b14afc	ret
